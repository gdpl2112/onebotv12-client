package io.github.gdpl2112.onebot.v12.impl.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.github.gdpl2112.onebot.v12.action.*;
import io.github.gdpl2112.onebot.v12.contact.Group;
import io.github.gdpl2112.onebot.v12.contact.Member;
import io.github.gdpl2112.onebot.v12.data.MessageChain;
import io.github.gdpl2112.onebot.v12.event.GroupMessageEvent;
import io.github.kloping.map.MapUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>GroupMessageEventImpl class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class GroupMessageEventImpl extends MessageEventImpl implements GroupMessageEvent {
    private String groupId;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>Setter for the field <code>groupId</code>.</p>
     *
     * @param groupId a {@link java.lang.String} object.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public static final Map<String, Group> GROUP_TEMP = new HashMap<>();
    public static final Map<Group, Map<String, Member>> MEMBER_TEMP = new HashMap<>();
    public static final Map<String, Member> EMPTY0 = new HashMap<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized Group getGroup() {
        if (GROUP_TEMP.containsKey(getGroupId())) return GROUP_TEMP.get(getGroupId());
        Group group = new Group() {
            private List<Member> members = new ArrayList<>();

            @Override
            public void sendMessage(MessageChain message) {
                GroupMessageEventImpl.this.sendMessage(message);
            }

            @Override
            public void sendMessage(String message) {
                GroupMessageEventImpl.this.sendMessage(message);
            }

            @Override
            public synchronized Member getMember(String id) {
                if (MEMBER_TEMP.getOrDefault(this, EMPTY0).get(id) != null) {
                    return MEMBER_TEMP.get(this).get(id);
                }
                Member member = new Member();
                ActionResp resp = send(new ActionBuilder(ActionName.GET_GROUP_MEMBER_INFO)
                        .addParam("group_id", getGroupId())
                        .addParam("user_id", getUserId()).build());
                JSONObject jo = resp.getData(JSONObject.class);
                member = jo.toJavaObject(Member.class);
                MapUtils.append(MEMBER_TEMP, this, id, member, HashMap.class);
                return member;
            }

            @Override
            public synchronized List<Member> getMembers() {
                if (members.isEmpty()) {
                    ActionResp resp = send(new ActionBuilder(ActionName.GET_GROUP_MEMBER_LIST)
                            .addParam("group_id", getGroupId()).build());
                    JSONArray array = resp.getData(JSONArray.class);
                    for (Object o : array) {
                        JSONObject jo = (JSONObject) o;
                        Member member = jo.toJavaObject(Member.class);
                        members.add(member);
                        MapUtils.append(MEMBER_TEMP, this, member.getUserId(), member, HashMap.class);
                    }
                }
                return members;
            }
        };
        ActionResp resp = send(new ActionBuilder(ActionName.GET_GROUP_INFO).addParam("group_id", getGroupId()).build());
        JSONObject jo = resp.getData(JSONObject.class);
        group.setGroupId(jo.get("group_id").toString());
        group.setGroupName(jo.get("group_name").toString());
        group.setAvatar(jo.get("wx.avatar").toString());
        GROUP_TEMP.put(getGroupId(), group);
        return group;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendMessage(MessageChain message) {
        Action action = new Action();
        MessageParams params = new MessageParams();
        params.setUserId(null);
        params.setGroupId(getGroupId());
        params.setDetailType("group");
        params.setMessage(message.getMessages());
        action.setParams(params.asMap());
        send(action);
    }

    @Override
    public Member getSender() {
        return null;
    }
}

package io.github.gdpl2112.onebot.v12.impl.event;

import io.github.gdpl2112.onebot.v12.action.*;
import io.github.kloping.onebot.v12.action.*;
import io.github.gdpl2112.onebot.v12.contact.Group;
import io.github.gdpl2112.onebot.v12.data.MessageChain;
import io.github.gdpl2112.onebot.v12.event.GroupMessageEvent;

/**
 * @author github.kloping
 */
public class GroupMessageEventImpl extends MessageEventImpl implements GroupMessageEvent {
    private String groupId;

    @Override
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public Group getGroup() {
        Group group = new Group() {
            @Override
            public void sendMessage(MessageChain message) {
                GroupMessageEventImpl.this.sendMessage(message);
            }

            @Override
            public void sendMessage(String message) {
                GroupMessageEventImpl.this.sendMessage(message);
            }
        };
        ActionResp resp = send(new ActionBuilder(ActionName.GET_GROUP_INFO).addParam("group_id", getGroupId()).build());
        group.setGroupId(resp.getData().get("group_id").toString());
        group.setGroupName(resp.getData().get("group_name").toString());
        group.setAvatar(resp.getData().get("wx.avatar").toString());
        return group;
    }

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
}

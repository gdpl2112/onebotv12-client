package io.github.gdpl2112.onebot.v12.impl.event;

import com.alibaba.fastjson.JSONObject;
import io.github.gdpl2112.onebot.v12.action.ActionBuilder;
import io.github.gdpl2112.onebot.v12.action.ActionName;
import io.github.gdpl2112.onebot.v12.action.ActionResp;
import io.github.gdpl2112.onebot.v12.contact.Friend;
import io.github.gdpl2112.onebot.v12.data.MessageChain;
import io.github.gdpl2112.onebot.v12.event.FriendMessageEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>MessageEventImpl class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class FriendMessageEventImpl extends MessageEventImpl implements FriendMessageEvent {
    public static final Map<String, Friend> TEMP = new HashMap<>();

    @Override
    public synchronized Friend getFriend() {
        if (TEMP.containsKey(getUserId())) return TEMP.get(getUserId());
        Friend friend = new Friend() {
            @Override
            public void sendMessage(MessageChain message) {
                FriendMessageEventImpl.this.sendMessage(message);
            }

            @Override
            public void sendMessage(String message) {
                FriendMessageEventImpl.this.sendMessage(message);
            }
        };
        ActionResp resp = send(new ActionBuilder(ActionName.GET_USER_INFO).addParam("user_id", getUserId()).build());
        JSONObject jo = resp.getData(JSONObject.class);
        friend.setUserDisplayname(jo.get("user_displayname").toString());
        friend.setUserId(jo.get("user_id").toString());
        friend.setUserName(jo.get("user_name").toString());
        friend.setUserRemark(jo.get("user_remark").toString());
        friend.setAvatar(jo.get("wx.avatar").toString());
        friend.setAccount(jo.get("wx.wx_number").toString());
        friend.setNation(jo.get("wx.nation").toString());
        friend.setProvince(jo.get("wx.province").toString());
        friend.setCity(jo.get("wx.city").toString());
        TEMP.put(getUserId(), friend);
        return friend;
    }

    @Override
    public Friend getSender() {
        return getFriend();
    }
}

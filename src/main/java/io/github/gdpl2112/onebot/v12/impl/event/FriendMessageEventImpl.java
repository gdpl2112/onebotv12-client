package io.github.gdpl2112.onebot.v12.impl.event;

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
        ActionResp resp = send(new ActionBuilder(ActionName.GET_USER_INFO).addParam("user_id", getUserId()).build());
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
        friend.setUserDisplayname(resp.getData().get("user_displayname").toString());
        friend.setUserId(resp.getData().get("user_id").toString());
        friend.setUserName(resp.getData().get("user_name").toString());
        friend.setUserRemark(resp.getData().get("user_remark").toString());
        friend.setAvatar(resp.getData().get("wx.avatar").toString());
        friend.setAccount(resp.getData().get("wx.wx_number").toString());
        friend.setNation(resp.getData().get("wx.nation").toString());
        friend.setProvince(resp.getData().get("wx.province").toString());
        friend.setCity(resp.getData().get("wx.city").toString());
        TEMP.put(getUserId(), friend);
        return friend;
    }
}

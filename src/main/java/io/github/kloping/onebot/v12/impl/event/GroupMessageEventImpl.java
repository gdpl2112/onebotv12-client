package io.github.kloping.onebot.v12.impl.event;

import com.alibaba.fastjson.JSON;
import io.github.kloping.onebot.v12.action.Action;
import io.github.kloping.onebot.v12.action.Params;
import io.github.kloping.onebot.v12.contact.Group;
import io.github.kloping.onebot.v12.data.MessageChain;
import io.github.kloping.onebot.v12.event.GroupMessageEvent;
import io.github.kloping.onebot.v12.utils.HttpSender;

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
        return group;
    }

    @Override
    public void sendMessage(MessageChain message) {
        Action action = new Action();
        Params params = new Params();
        params.setUserId(null);
        params.setGroupId(getGroupId());
        params.setDetailType("group");
        params.setMessage(message.getMessages());
        action.setParams(params);
        send(action);
    }
}

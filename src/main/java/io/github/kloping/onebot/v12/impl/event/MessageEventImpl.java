package io.github.kloping.onebot.v12.impl.event;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import io.github.kloping.onebot.v12.Configuration;
import io.github.kloping.onebot.v12.action.Action;
import io.github.kloping.onebot.v12.action.ActionSender;
import io.github.kloping.onebot.v12.action.Params;
import io.github.kloping.onebot.v12.contact.Self;
import io.github.kloping.onebot.v12.data.*;
import io.github.kloping.onebot.v12.event.MessageEvent;
import io.github.kloping.onebot.v12.utils.HttpSender;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author github.kloping
 */
public class MessageEventImpl extends EventImpl implements MessageEvent {
    private Self self;
    private String messageId;
    private Message[] message;
    private String altMessage;
    private String userId;

    @Override
    public Self getSelf() {
        return self;
    }

    @Override
    public String getMessageId() {
        return messageId;
    }

    @Override
    public MessageChain getMessage() {
        return new MessageChain(message);
    }

    @Override
    public String getAltMessage() {
        return altMessage;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public void setMessage(JSONArray array) {
        List<Message> messages = new ArrayList<>();
        for (Object o : array) {
            JSONObject obj = (JSONObject) o;
            String type = obj.getString("type");
            switch (type) {
                case "text":
                    messages.add(obj.toJavaObject(PlainText.class));
                    break;
                case "image":
                    messages.add(obj.toJavaObject(Image.class));
                    break;
                case "mention":
                    messages.add(obj.toJavaObject(At.class));
                    break;
                default:
                    break;
            }
        }
        this.message = messages.toArray(new Message[0]);
    }

    public void setAltMessage(String altMessage) {
        this.altMessage = altMessage;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public void sendMessage(MessageChain message) {
        Action action = new Action();
        Params params = new Params();
        params.setUserId(getUserId());
        params.setDetailType("private");
        params.setMessage(message.getMessages());
        action.setParams(params);
        send(action);
    }

    @Override
    public void sendMessage(String message) {
        this.sendMessage(new MessageChain(new Message[]{new PlainText(message)}));
    }

    @Override
    public String send(String data) {
        String rep = "{}";
        try {
            rep = HttpSender.sendPost("http://" + getConfiguration().getHost() + ":" + getConfiguration().getPort() + "/", data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rep;
    }
}

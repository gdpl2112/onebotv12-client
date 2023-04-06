package io.github.gdpl2112.onebot.v12.impl.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.github.gdpl2112.onebot.v12.action.Action;
import io.github.gdpl2112.onebot.v12.action.MessageParams;
import io.github.gdpl2112.onebot.v12.contact.Self;
import io.github.gdpl2112.onebot.v12.data.*;
import io.github.kloping.onebot.v12.data.*;
import io.github.gdpl2112.onebot.v12.event.MessageEvent;
import io.github.gdpl2112.onebot.v12.utils.ConfigurationUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author github.kloping
 */
public class MessageEventImpl extends EventImpl implements MessageEvent, ImageUploader {
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
        MessageParams params = new MessageParams();
        params.setUserId(getUserId());
        params.setDetailType("private");
        params.setMessage(message.getMessages());
        action.setParams(params.asMap());
        send(action);
    }

    @Override
    public void sendMessage(String message) {
        this.sendMessage(new MessageChain(new Message[]{new PlainText(message)}));
    }

    @Override
    public Image uploadImage(File file) {
        return ConfigurationUtils.INSTANCE.uploadImage(file, this);
    }

    @Override
    public Image uploadImage(String url) {
        return ConfigurationUtils.INSTANCE.uploadImage(url, this);
    }

    @Override
    public Image uploadImage(byte[] bytes) {
        return ConfigurationUtils.INSTANCE.uploadImage(bytes, this);
    }
}
package io.github.gdpl2112.onebot.v12.impl.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.github.gdpl2112.onebot.v12.action.Action;
import io.github.gdpl2112.onebot.v12.action.MessageParams;
import io.github.gdpl2112.onebot.v12.contact.Self;
import io.github.gdpl2112.onebot.v12.data.*;
import io.github.gdpl2112.onebot.v12.event.MessageEvent;
import io.github.gdpl2112.onebot.v12.utils.ConfigurationUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>MessageEventImpl class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public abstract class MessageEventImpl extends EventImpl implements MessageEvent {
    private Self self;
    private String messageId;
    private Message[] message;
    private String altMessage;
    private String userId;

    /** {@inheritDoc} */
    @Override
    public Self getSelf() {
        return self;
    }

    /**
     * <p>Setter for the field <code>self</code>.</p>
     *
     * @param self a {@link io.github.gdpl2112.onebot.v12.contact.Self} object.
     */
    public void setSelf(Self self) {
        this.self = self;
    }

    /** {@inheritDoc} */
    @Override
    public String getMessageId() {
        return messageId;
    }

    /**
     * <p>Setter for the field <code>messageId</code>.</p>
     *
     * @param messageId a {@link java.lang.String} object.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /** {@inheritDoc} */
    @Override
    public MessageChain getMessage() {
        return new MessageChain(message);
    }

    /**
     * <p>Setter for the field <code>message</code>.</p>
     *
     * @param array a {@link com.alibaba.fastjson.JSONArray} object.
     */
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

    /** {@inheritDoc} */
    @Override
    public String getAltMessage() {
        return altMessage;
    }

    /**
     * <p>Setter for the field <code>altMessage</code>.</p>
     *
     * @param altMessage a {@link java.lang.String} object.
     */
    public void setAltMessage(String altMessage) {
        this.altMessage = altMessage;
    }

    /** {@inheritDoc} */
    @Override
    public String getUserId() {
        return userId;
    }

    /**
     * <p>Setter for the field <code>userId</code>.</p>
     *
     * @param userId a {@link java.lang.String} object.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public void sendMessage(String message) {
        this.sendMessage(new MessageChain(new Message[]{new PlainText(message)}));
    }

    /** {@inheritDoc} */
    @Override
    public Image uploadImage(File file) {
        return ConfigurationUtils.INSTANCE.uploadImage(file, this);
    }

    /** {@inheritDoc} */
    @Override
    public Image uploadImage(String url) {
        return ConfigurationUtils.INSTANCE.uploadImage(url, this);
    }

    /** {@inheritDoc} */
    @Override
    public Image uploadImage(byte[] bytes) {
        return ConfigurationUtils.INSTANCE.uploadImage(bytes, this);
    }
}

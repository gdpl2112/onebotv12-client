package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.contact.User;
import io.github.gdpl2112.onebot.v12.data.ImageUploader;
import io.github.gdpl2112.onebot.v12.data.MessageChain;

/**
 * <p>MessageEvent interface.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public interface MessageEvent<T extends User> extends BotEvent, ImageUploader {
    /**
     * messageId
     *
     * @return a {@link java.lang.String} object.
     */
    String getMessageId();

    /**
     * message
     *
     * @return a {@link io.github.gdpl2112.onebot.v12.data.MessageChain} object.
     */
    MessageChain getMessage();

    /**
     * alt message
     *
     * @return a {@link java.lang.String} object.
     */
    String getAltMessage();

    /**
     * user id
     *
     * @return a {@link java.lang.String} object.
     */
    String getUserId();

    /**
     * 消息发送
     *
     * @param message a {@link io.github.gdpl2112.onebot.v12.data.MessageChain} object.
     */
    void sendMessage(MessageChain message);

    /**
     * 消息发送
     *
     * @param message a {@link java.lang.String} object.
     */
    void sendMessage(String message);

    T getSender();
}

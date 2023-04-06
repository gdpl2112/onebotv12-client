package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.data.ImageUploader;
import io.github.gdpl2112.onebot.v12.data.MessageChain;

/**
 * @author github.kloping
 */
public interface MessageEvent extends BotEvent, ImageUploader {
    /**
     * messageId
     *
     * @return
     */
    String getMessageId();

    /**
     * message
     *
     * @return
     */
    MessageChain getMessage();

    /**
     * alt message
     *
     * @return
     */
    String getAltMessage();

    /**
     * user id
     *
     * @return
     */
    String getUserId();

    /**
     * 消息发送
     *
     * @param message
     */
    void sendMessage(MessageChain message);

    /**
     * 消息发送
     *
     * @param message
     */
    void sendMessage(String message);
}

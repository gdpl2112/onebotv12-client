package io.github.gdpl2112.onebot.v12.contact;

import io.github.gdpl2112.onebot.v12.data.MessageChain;

/**
 * @author github.kloping
 */
public interface Contact {
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

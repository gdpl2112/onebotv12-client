package io.github.gdpl2112.onebot.v12.contact;

import io.github.gdpl2112.onebot.v12.data.MessageChain;

/**
 * <p>Contact interface.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public interface Contact {
    /**
     * 消息发送
     *
     * @param message a {@link io.github.gdpl2112.onebot.v12.data.MessageChain} object
     */
    void sendMessage(MessageChain message);

    /**
     * 消息发送
     *
     * @param message a {@link java.lang.String} object
     */
    void sendMessage(String message);
}

package io.github.gdpl2112.onebot.v12.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>MessageChainBuilder class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class MessageChainBuilder {
    private List<Message> list = new ArrayList<>();

    /**
     * <p>build.</p>
     *
     * @return a {@link io.github.gdpl2112.onebot.v12.data.MessageChain} object.
     */
    public MessageChain build() {
        MessageChain chain = new MessageChain(list.toArray(new Message[0]));
        return chain;
    }

    /**
     * <p>append.</p>
     *
     * @param text a {@link java.lang.String} object.
     * @return a {@link io.github.gdpl2112.onebot.v12.data.MessageChainBuilder} object.
     */
    public MessageChainBuilder append(String text) {
        list.add(new PlainText(text));
        return this;
    }

    /**
     * <p>append.</p>
     *
     * @param message a {@link io.github.gdpl2112.onebot.v12.data.Message} object.
     * @return a {@link io.github.gdpl2112.onebot.v12.data.MessageChainBuilder} object.
     */
    public MessageChainBuilder append(Message message) {
        list.add(message);
        return this;
    }

    /**
     * <p>append.</p>
     *
     * @param chain a {@link io.github.gdpl2112.onebot.v12.data.MessageChain} object.
     * @return a {@link io.github.gdpl2112.onebot.v12.data.MessageChainBuilder} object.
     */
    public MessageChainBuilder append(MessageChain chain) {
        list.addAll(Arrays.asList(chain.getMessages()));
        return this;
    }
}

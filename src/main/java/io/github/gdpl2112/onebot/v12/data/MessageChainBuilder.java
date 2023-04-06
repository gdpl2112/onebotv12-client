package io.github.gdpl2112.onebot.v12.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author github.kloping
 */
public class MessageChainBuilder {
    private List<Message> list = new ArrayList<>();

    public MessageChain build() {
        MessageChain chain = new MessageChain(list.toArray(new Message[0]));
        return chain;
    }

    public MessageChainBuilder append(String text) {
        list.add(new PlainText(text));
        return this;
    }

    public MessageChainBuilder append(Message message) {
        list.add(message);
        return this;
    }

    public MessageChainBuilder append(MessageChain chain) {
        list.addAll(Arrays.asList(chain.getMessages()));
        return this;
    }
}

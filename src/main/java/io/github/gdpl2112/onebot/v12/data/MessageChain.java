package io.github.gdpl2112.onebot.v12.data;

/**
 * <p>MessageChain class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class MessageChain {
    private Message[] messages;

    /**
     * <p>Constructor for MessageChain.</p>
     *
     * @param messages an array of {@link io.github.gdpl2112.onebot.v12.data.Message} objects.
     */
    public MessageChain(Message[] messages) {
        this.messages = messages;
    }

    /**
     * <p>Getter for the field <code>messages</code>.</p>
     *
     * @return an array of {@link io.github.gdpl2112.onebot.v12.data.Message} objects.
     */
    public Message[] getMessages() {
        return messages;
    }

    /**
     * <p>Setter for the field <code>messages</code>.</p>
     *
     * @param messages an array of {@link io.github.gdpl2112.onebot.v12.data.Message} objects.
     */
    public void setMessages(Message[] messages) {
        this.messages = messages;
    }

    /**
     * <p>toString.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Message message : messages) {
            if (message instanceof PlainText) {
                PlainText text = (PlainText) message;
                sb.append(text.getText());
            } else if (message instanceof Image) {
                Image image = (Image) message;
                sb.append("[图片:").append(image.getId()).append("]");
            } else if (message instanceof At) {
                At at = (At) message;
                sb.append("[at:").append(at.getTarget()).append("]");
            }
        }
        return sb.toString();
    }
}

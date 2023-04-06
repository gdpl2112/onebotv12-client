package io.github.kloping.onebot.v12.data;

/**
 * @author github.kloping
 */
public class MessageChain {
    private Message[] messages;

    public MessageChain(Message[] messages) {
        this.messages = messages;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void setMessages(Message[] messages) {
        this.messages = messages;
    }

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

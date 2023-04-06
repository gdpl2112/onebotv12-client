package io.github.gdpl2112.onebot.v12.data;

/**
 * <p>Abstract Message class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public abstract class Message {
    private String type;

    /**
     * <p>Getter for the field <code>type</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getType() {
        return type;
    }

    /**
     * <p>Setter for the field <code>type</code>.</p>
     *
     * @param type a {@link java.lang.String} object.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取data
     *
     * @return a T object.
     */
    public abstract <T extends MessageData> T getData();

    /**
     * 设置data
     *
     * @param t a {@link io.github.gdpl2112.onebot.v12.data.MessageData} object.
     */
    public abstract void setData(MessageData t);
}

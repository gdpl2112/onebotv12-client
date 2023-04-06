package io.github.gdpl2112.onebot.v12.data;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p>At class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class At extends Message {
    private AtId data;

    /**
     * <p>Constructor for At.</p>
     */
    public At() {
        setType("mention");
    }

    /**
     * <p>Constructor for At.</p>
     *
     * @param id a {@link java.lang.String} object
     */
    public At(String id) {
        setType("mention");
        AtId ai = new AtId();
        ai.setUserId(id);
        setData(ai);
    }

    /** {@inheritDoc} */
    @Override
    public AtId getData() {
        return data;
    }

    /** {@inheritDoc} */
    @Override
    public void setData(MessageData t) {
        if (t instanceof AtId) setData(((AtId) t));
    }

    /**
     * <p>Setter for the field <code>data</code>.</p>
     *
     * @param t a {@link io.github.gdpl2112.onebot.v12.data.At.AtId} object
     */
    public void setData(AtId t) {
        this.data = t;
    }

    /**
     * <p>getTarget.</p>
     *
     * @return a {@link java.lang.String} object
     */
    @JSONField(deserialize = false, serialize = false)
    public String getTarget() {
        return this.data.getUserId();
    }

    public static class AtId extends MessageData {
        private String userId;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }


}

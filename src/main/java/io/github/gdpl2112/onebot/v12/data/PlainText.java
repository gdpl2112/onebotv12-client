package io.github.gdpl2112.onebot.v12.data;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p>PlainText class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class PlainText extends Message {
    private Text text;

    /**
     * <p>Constructor for PlainText.</p>
     */
    public PlainText() {
        setType("text");
    }

    /**
     * <p>Constructor for PlainText.</p>
     *
     * @param text a {@link java.lang.String} object.
     */
    public PlainText(String text) {
        setType("text");
        this.text = new Text(text);
    }

    /** {@inheritDoc} */
    @Override
    public Text getData() {
        return text;
    }

    /** {@inheritDoc} */
    @Override
    public void setData(MessageData t) {
        if (t instanceof Text) setData(((Text) t));
    }

    /**
     * <p>setData.</p>
     *
     * @param t a {@link io.github.gdpl2112.onebot.v12.data.PlainText.Text} object.
     */
    public void setData(Text t) {
        this.text = t;
    }

    /**
     * <p>Getter for the field <code>text</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    @JSONField(deserialize = false, serialize = false)
    public String getText() {
        return this.text.getText();
    }

    public static class Text extends MessageData {
        private String text;

        public Text() {
        }

        public Text(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}

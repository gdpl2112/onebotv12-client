package io.github.gdpl2112.onebot.v12.data;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author github.kloping
 */
public class PlainText extends Message {
    private Text text;

    @Override
    public Text getData() {
        return text;
    }

    @Override
    public void setData(MessageData t) {
        if (t instanceof Text) setData(((Text) t));
    }

    public void setData(Text t) {
        this.text = t;
    }

    @JSONField(deserialize = false, serialize = false)
    public String getText() {
        return this.text.getText();
    }

    public PlainText() {
        setType("text");
    }

    public PlainText(String text) {
        setType("text");
        this.text = new Text(text);
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

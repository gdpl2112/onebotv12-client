package io.github.gdpl2112.onebot.v12.data;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author github.kloping
 */
public class At extends Message {
    private AtId data;

    @Override
    public AtId getData() {
        return data;
    }

    @Override
    public void setData(MessageData t) {
        if (t instanceof AtId) setData(((AtId) t));
    }

    public void setData(AtId t) {
        this.data = t;
    }

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

    public At() {
        setType("mention");
    }

    public At(String id) {
        setType("mention");
        AtId ai = new AtId();
        ai.setUserId(id);
        setData(ai);
    }


}

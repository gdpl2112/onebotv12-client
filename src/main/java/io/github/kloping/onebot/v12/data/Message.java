package io.github.kloping.onebot.v12.data;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author github.kloping
 */
public abstract class Message {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取data
     *
     * @param <T>
     * @return
     */
    public abstract <T extends MessageData> T getData();

    /**
     * 设置data
     *
     * @param t
     */
    public abstract void setData(MessageData t);
}

package io.github.kloping.onebot.v12.action;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.kloping.onebot.v12.data.Message;

/**
 * @author github.kloping
 */
public class Params {
    @JSONField(name = "detail_type")
    private String detailType;
    @JSONField(name = "group_id")
    private String groupId;
    @JSONField(name = "user_id")
    private String userId;
    @JSONField(name = "message")
    private Message[] message;

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Message[] getMessage() {
        return message;
    }

    public void setMessage(Message[] message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

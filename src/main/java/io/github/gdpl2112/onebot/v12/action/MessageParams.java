package io.github.gdpl2112.onebot.v12.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import io.github.gdpl2112.onebot.v12.data.Message;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author github.kloping
 */
public class MessageParams {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Message[] getMessage() {
        return message;
    }

    public void setMessage(Message[] message) {
        this.message = message;
    }

    public Map<String, Object> asMap() {
        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(this));
        Map<String, Object> map = new LinkedHashMap<>();
        jsonObject.forEach((k, v) -> {
            map.put(k, v);
        });
        return map;
    }
}

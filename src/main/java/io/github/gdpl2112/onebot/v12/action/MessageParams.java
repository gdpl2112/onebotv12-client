package io.github.gdpl2112.onebot.v12.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import io.github.gdpl2112.onebot.v12.data.Message;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>MessageParams class.</p>
 *
 * @author github.kloping
 * @version 1.0
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

    /**
     * <p>Getter for the field <code>detailType</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getDetailType() {
        return detailType;
    }

    /**
     * <p>Setter for the field <code>detailType</code>.</p>
     *
     * @param detailType a {@link java.lang.String} object
     */
    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /**
     * <p>Getter for the field <code>groupId</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>Setter for the field <code>groupId</code>.</p>
     *
     * @param groupId a {@link java.lang.String} object
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>Getter for the field <code>userId</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>Setter for the field <code>userId</code>.</p>
     *
     * @param userId a {@link java.lang.String} object
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>Getter for the field <code>message</code>.</p>
     *
     * @return an array of {@link io.github.gdpl2112.onebot.v12.data.Message} objects
     */
    public Message[] getMessage() {
        return message;
    }

    /**
     * <p>Setter for the field <code>message</code>.</p>
     *
     * @param message an array of {@link io.github.gdpl2112.onebot.v12.data.Message} objects
     */
    public void setMessage(Message[] message) {
        this.message = message;
    }

    /**
     * <p>asMap.</p>
     *
     * @return a {@link java.util.Map} object
     */
    public Map<String, Object> asMap() {
        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(this));
        Map<String, Object> map = new LinkedHashMap<>();
        jsonObject.forEach((k, v) -> {
            map.put(k, v);
        });
        return map;
    }
}

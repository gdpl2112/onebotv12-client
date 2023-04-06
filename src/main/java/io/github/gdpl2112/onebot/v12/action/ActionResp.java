package io.github.gdpl2112.onebot.v12.action;

import com.alibaba.fastjson.JSON;
import io.github.gdpl2112.onebot.v12.data.Message;

import java.util.Map;

/**
 * <p>ActionResp class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class ActionResp {
    private String status;
    private Integer retcode;
    private String message;
    private Map<String, Object> data;

    /**
     * <p>Getter for the field <code>status</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>Setter for the field <code>status</code>.</p>
     *
     * @param status a {@link java.lang.String} object
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>Getter for the field <code>retcode</code>.</p>
     *
     * @return a {@link java.lang.Integer} object
     */
    public Integer getRetcode() {
        return retcode;
    }

    /**
     * <p>Setter for the field <code>retcode</code>.</p>
     *
     * @param retcode a {@link java.lang.Integer} object
     */
    public void setRetcode(Integer retcode) {
        this.retcode = retcode;
    }

    /**
     * <p>Getter for the field <code>message</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>Setter for the field <code>message</code>.</p>
     *
     * @param message a {@link java.lang.String} object
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>Getter for the field <code>data</code>.</p>
     *
     * @return a {@link java.util.Map} object
     */
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * <p>Setter for the field <code>data</code>.</p>
     *
     * @param data a {@link java.util.Map} object
     */
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * <p>dataAsMessage.</p>
     *
     * @param cla a {@link java.lang.Class} object
     * @return a T object
     */
    public <T extends Message> T dataAsMessage(Class<T> cla) {
        return JSON.parseObject(JSON.toJSONString(data), cla);
    }
}

package io.github.gdpl2112.onebot.v12.action;

import com.alibaba.fastjson.JSON;
import io.github.gdpl2112.onebot.v12.data.Message;

import java.util.Map;

/**
 * @author github.kloping
 */
public class ActionResp {
    private String status;
    private Integer retcode;
    private String message;
    private Map<String, Object> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRetcode() {
        return retcode;
    }

    public void setRetcode(Integer retcode) {
        this.retcode = retcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public <T extends Message> T dataAsMessage(Class<T> cla) {
        return JSON.parseObject(JSON.toJSONString(data), cla);
    }
}

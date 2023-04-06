package io.github.gdpl2112.onebot.v12.action;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * {
 *  "action": "send_message",
 *  "params": {}
 * }
 *
 * @author github.kloping
 */
public class Action {
    private String action = "send_message";
    private Map<String, Object> params = new LinkedHashMap<>();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}

package io.github.gdpl2112.onebot.v12.action;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Action class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class Action {
    private String action = "send_message";
    private Map<String, Object> params = new LinkedHashMap<>();

    /**
     * <p>Getter for the field <code>action</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>Setter for the field <code>action</code>.</p>
     *
     * @param action a {@link java.lang.String} object
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>Getter for the field <code>params</code>.</p>
     *
     * @return a {@link java.util.Map} object
     */
    public Map<String, Object> getParams() {
        return params;
    }

    /**
     * <p>Setter for the field <code>params</code>.</p>
     *
     * @param params a {@link java.util.Map} object
     */
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}

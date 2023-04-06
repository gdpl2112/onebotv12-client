package io.github.kloping.onebot.v12.action;

/**
 * {
 *     "action": "send_message",
 *     "params": {}
 * }
 * @author github.kloping
 */
public class Action {
    private String action="send_message";
    private Params params;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }
}

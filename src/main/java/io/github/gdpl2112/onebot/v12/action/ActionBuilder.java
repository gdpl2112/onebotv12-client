package io.github.gdpl2112.onebot.v12.action;

import java.util.HashMap;
import java.util.Map;

/**
 * @author github.kloping
 */
public class ActionBuilder {
    private String action;
    private Map<String, Object> params = new HashMap<>();

    public Action build() {
        Action ac = new Action();
        ac.setAction(action);
        ac.setParams(params);
        return ac;
    }

    public ActionBuilder(String action) {
        this.action = action;
    }

    public ActionBuilder(ActionName action) {
        this.action = action.name;
    }

    public ActionBuilder addParam(String key, Object value) {
        params.put(key, value);
        return this;
    }
}

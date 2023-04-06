package io.github.gdpl2112.onebot.v12.action;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>ActionBuilder class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class ActionBuilder {
    private String action;
    private Map<String, Object> params = new HashMap<>();
 
    /**
     * <p>Constructor for ActionBuilder.</p>
     *
     * @param action a {@link io.github.gdpl2112.onebot.v12.action.ActionName} object
     */
    public ActionBuilder(ActionName action) {
        this.action = action.name;
    }

    /**
     * <p>build.</p>
     *
     * @return a {@link io.github.gdpl2112.onebot.v12.action.Action} object
     */
    public Action build() {
        Action ac = new Action();
        ac.setAction(action);
        ac.setParams(params);
        return ac;
    }

    /**
     * <p>addParam.</p>
     *
     * @param key a {@link java.lang.String} object
     * @param value a {@link java.lang.Object} object
     * @return a {@link io.github.gdpl2112.onebot.v12.action.ActionBuilder} object
     */
    public ActionBuilder addParam(String key, Object value) {
        params.put(key, value);
        return this;
    }
}

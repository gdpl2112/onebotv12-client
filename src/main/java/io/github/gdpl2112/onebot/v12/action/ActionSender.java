package io.github.gdpl2112.onebot.v12.action;

import io.github.gdpl2112.onebot.v12.Configuration;

/**
 * <p>ActionSender interface.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public interface ActionSender {
    /**
     * send
     *
     * @param data base64 data
     * @return resp
     */
    ActionResp send(String data);

    /**
     * send a action
     *
     * @param action a {@link io.github.gdpl2112.onebot.v12.action.Action} object
     * @return a {@link io.github.gdpl2112.onebot.v12.action.ActionResp} object
     */
    ActionResp send(Action action);

    /**
     * 获取配置中心
     *
     * @return a {@link io.github.gdpl2112.onebot.v12.Configuration} object
     */
    Configuration getConfiguration();

    /**
     * 设置配置中心
     *
     * @param configuration a {@link io.github.gdpl2112.onebot.v12.Configuration} object
     */
    void setConfiguration(Configuration configuration);
}

package io.github.gdpl2112.onebot.v12.action;

import io.github.gdpl2112.onebot.v12.Configuration;

/**
 * @author github.kloping
 */
public interface ActionSender {
    /**
     * send
     *
     * @param data
     * @return
     */
    ActionResp send(String data);

    /**
     * send a action
     *
     * @param action
     * @return
     */
    ActionResp send(Action action);

    /**
     * 获取配置中心
     *
     * @return
     */
    Configuration getConfiguration();

    /**
     * 设置配置中心
     *
     * @param configuration
     */
    void setConfiguration(Configuration configuration);
}

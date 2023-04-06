package io.github.kloping.onebot.v12.action;

import io.github.kloping.onebot.v12.Configuration;

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
    String send(String data);

    /**
     * send a action
     *
     * @param action
     * @return
     */
    String send(Action action);

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

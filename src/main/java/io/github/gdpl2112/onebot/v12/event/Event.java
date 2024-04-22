package io.github.gdpl2112.onebot.v12.event;

import com.alibaba.fastjson.JSONObject;
import io.github.gdpl2112.onebot.v12.action.ActionSender;

/**
 *
 * @author github.kloping
 * @version 1.0
 */
public interface Event extends ActionSender {
    /**
     * id
     *
     * @return a {@link java.lang.String} object.
     */
    String getId();

    /**
     * time
     *
     * @return a {@link java.lang.Double} object.
     */
    Double getTime();

    /**
     * 数据类型
     *
     * @return a {@link java.lang.String} object.
     */
    String getType();

    /**
     * 详细类型
     *
     * @return a {@link java.lang.String} object.
     */
    String getDetailType();

    /**
     * 子类型
     *
     * @return a {@link java.lang.String} object.
     */
    String getSubType();

    /**
     * 获取元数据
     * @return raw
     */
    JSONObject getRaw();
}

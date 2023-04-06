package io.github.gdpl2112.onebot.v12.event;

/**
 *
 * @author github.kloping
 * @version 1.0
 */
public interface Event {
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
}

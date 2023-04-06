package io.github.gdpl2112.onebot.v12.event;

/**
 * <p>EventType class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public enum EventType {
    /**
     * 群
     */
    GROUP("group"),
    /**
     * 私聊
     */
    PRIVATE("private");
    /**
     * name
     */
    private String name;

    EventType(String name) {
        this.name = name;
    }
}

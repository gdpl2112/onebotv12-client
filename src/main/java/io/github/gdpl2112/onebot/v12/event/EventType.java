package io.github.gdpl2112.onebot.v12.event;

/**
 * @author github.kloping
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

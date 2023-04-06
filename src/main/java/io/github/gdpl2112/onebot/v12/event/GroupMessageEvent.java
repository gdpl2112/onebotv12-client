package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.contact.Group;

/**
 * @author github.kloping
 */
public interface GroupMessageEvent extends MessageEvent {
    /**
     * groupId
     *
     * @return
     */
    String getGroupId();

    /**
     * get group
     *
     * @return
     */
    Group getGroup();
}
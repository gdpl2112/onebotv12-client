package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.contact.Group;
import io.github.gdpl2112.onebot.v12.contact.Member;

/**
 * <p>GroupMessageEvent interface.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public interface GroupMessageEvent extends MessageEvent<Member> {
    /**
     * groupId
     *
     * @return a {@link java.lang.String} object.
     */
    String getGroupId();

    /**
     * get group
     *
     * @return a {@link io.github.gdpl2112.onebot.v12.contact.Group} object.
     */
    Group getGroup();
}

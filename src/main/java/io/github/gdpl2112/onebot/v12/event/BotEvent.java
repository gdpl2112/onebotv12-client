package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.contact.Self;

/**
 * @author github-kloping
 * 2023-04-05
 */
public interface BotEvent extends Event {
    /**
     * 自己
     *
     * @return
     */
    Self getSelf();
}

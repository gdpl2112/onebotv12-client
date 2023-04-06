package io.github.kloping.onebot.v12.event;

import io.github.kloping.onebot.v12.Configuration;
import io.github.kloping.onebot.v12.contact.Self;

/**
 * @author github-kloping
 * @date 2023-04-05
 */
public interface BotEvent extends Event {
    /**
     * 自己
     *
     * @return
     */
    Self getSelf();
}

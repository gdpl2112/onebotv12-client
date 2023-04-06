package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.contact.Self;

/**
 * <p>BotEvent interface.</p>
 *
 * @author github-kloping
 * 2023-04-05
 * @version 1.0
 */
public interface BotEvent extends Event {
    /**
     * 自己
     *
     * @return a {@link io.github.gdpl2112.onebot.v12.contact.Self} object.
     */
    Self getSelf();
}

package io.github.kloping.onebot.v12.event;

import io.github.kloping.onebot.v12.data.Version;

/**
 * @author github.kloping
 */
public interface MetaEvent extends Event {
    /**
     * version
     *
     * @return
     */
    Version getVersion();
}

package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.data.Version;

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

package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.data.Status;
import io.github.gdpl2112.onebot.v12.data.Version;

/**
 * <p>MetaEvent interface.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public interface MetaEvent extends Event {
    /**
     * version
     *
     * @return a {@link io.github.gdpl2112.onebot.v12.data.Version} object.
     */
    Version getVersion();

    Status getStatus();
}

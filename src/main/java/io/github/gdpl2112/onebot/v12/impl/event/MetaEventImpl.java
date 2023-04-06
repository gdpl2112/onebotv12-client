package io.github.gdpl2112.onebot.v12.impl.event;

import io.github.gdpl2112.onebot.v12.data.Version;
import io.github.gdpl2112.onebot.v12.event.MetaEvent;

/**
 * <p>MetaEventImpl class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class MetaEventImpl extends EventImpl implements MetaEvent {
    private Version version;

    /** {@inheritDoc} */
    @Override
    public Version getVersion() {
        return version;
    }

    /**
     * <p>Setter for the field <code>version</code>.</p>
     *
     * @param version a {@link io.github.gdpl2112.onebot.v12.data.Version} object.
     */
    public void setVersion(Version version) {
        this.version = version;
    }
}

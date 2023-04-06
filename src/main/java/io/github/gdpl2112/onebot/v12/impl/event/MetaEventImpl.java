package io.github.gdpl2112.onebot.v12.impl.event;

import io.github.gdpl2112.onebot.v12.data.Version;
import io.github.gdpl2112.onebot.v12.event.MetaEvent;

/**
 * @author github.kloping
 */
public class MetaEventImpl extends EventImpl implements MetaEvent {
    private Version version;

    @Override
    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}

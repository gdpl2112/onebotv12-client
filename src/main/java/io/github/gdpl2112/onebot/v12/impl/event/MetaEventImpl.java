package io.github.gdpl2112.onebot.v12.impl.event;

import io.github.gdpl2112.onebot.v12.data.Status;
import io.github.gdpl2112.onebot.v12.data.Version;
import io.github.gdpl2112.onebot.v12.event.MetaEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>MetaEventImpl class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MetaEventImpl extends EventImpl implements MetaEvent {
    private Version version;
    private Status status;
}

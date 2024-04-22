package io.github.gdpl2112.onebot.v12.impl.event;

import com.alibaba.fastjson.JSONObject;
import io.github.gdpl2112.onebot.v12.event.Event;
import io.github.gdpl2112.onebot.v12.impl.action.ActionSenderImpl;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>EventImpl class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EventImpl extends ActionSenderImpl implements Event {
    private String id;
    private Double time;
    private String type;
    private String detailType;
    private String subType;
    private JSONObject raw;
}

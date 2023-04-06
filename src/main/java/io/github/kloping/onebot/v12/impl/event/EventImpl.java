package io.github.kloping.onebot.v12.impl.event;

import io.github.kloping.onebot.v12.event.Event;
import io.github.kloping.onebot.v12.impl.action.ActionSenderImpl;

/**
 * @author github.kloping
 */
public class EventImpl extends ActionSenderImpl implements Event {
    private String id;
    private Double time;
    private String type;
    private String detailType;
    private String subType;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    @Override
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
}

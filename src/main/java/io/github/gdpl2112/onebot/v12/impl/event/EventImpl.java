package io.github.gdpl2112.onebot.v12.impl.event;

import io.github.gdpl2112.onebot.v12.event.Event;
import io.github.gdpl2112.onebot.v12.impl.action.ActionSenderImpl;

/**
 * <p>EventImpl class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class EventImpl extends ActionSenderImpl implements Event {
    private String id;
    private Double time;
    private String type;
    private String detailType;
    private String subType;

    /** {@inheritDoc} */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a {@link java.lang.String} object.
     */
    public void setId(String id) {
        this.id = id;
    }

    /** {@inheritDoc} */
    @Override
    public Double getTime() {
        return time;
    }

    /**
     * <p>Setter for the field <code>time</code>.</p>
     *
     * @param time a {@link java.lang.Double} object.
     */
    public void setTime(Double time) {
        this.time = time;
    }

    /** {@inheritDoc} */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <p>Setter for the field <code>type</code>.</p>
     *
     * @param type a {@link java.lang.String} object.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** {@inheritDoc} */
    @Override
    public String getDetailType() {
        return detailType;
    }

    /**
     * <p>Setter for the field <code>detailType</code>.</p>
     *
     * @param detailType a {@link java.lang.String} object.
     */
    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /** {@inheritDoc} */
    @Override
    public String getSubType() {
        return subType;
    }

    /**
     * <p>Setter for the field <code>subType</code>.</p>
     *
     * @param subType a {@link java.lang.String} object.
     */
    public void setSubType(String subType) {
        this.subType = subType;
    }
}

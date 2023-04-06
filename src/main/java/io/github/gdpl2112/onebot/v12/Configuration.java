package io.github.gdpl2112.onebot.v12;

import io.github.kloping.MySpringTool.annotations.AutoStand;
import io.github.kloping.MySpringTool.annotations.Entity;

/**
 * <p>Configuration class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
@Entity
public class Configuration {

    @AutoStand(id = "access_token")
    private String token;

    @AutoStand(id = "host")
    private String host;

    @AutoStand(id = "port")
    private Integer port;

    @AutoStand
    private EventManager eventManager;

    /**
     * <p>Getter for the field <code>token</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getToken() {
        return token;
    }

    /**
     * <p>Setter for the field <code>token</code>.</p>
     *
     * @param token a {@link java.lang.String} object
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>Getter for the field <code>host</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getHost() {
        return host;
    }

    /**
     * <p>Setter for the field <code>host</code>.</p>
     *
     * @param host a {@link java.lang.String} object
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>Getter for the field <code>port</code>.</p>
     *
     * @return a {@link java.lang.Integer} object
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>Setter for the field <code>port</code>.</p>
     *
     * @param port a {@link java.lang.Integer} object
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>Getter for the field <code>eventManager</code>.</p>
     *
     * @return a {@link io.github.gdpl2112.onebot.v12.EventManager} object
     */
    public EventManager getEventManager() {
        return eventManager;
    }

    /**
     * <p>Setter for the field <code>eventManager</code>.</p>
     *
     * @param eventManager a {@link io.github.gdpl2112.onebot.v12.EventManager} object
     */
    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }
}

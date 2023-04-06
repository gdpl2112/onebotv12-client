package io.github.gdpl2112.onebot.v12;

import io.github.kloping.MySpringTool.annotations.AutoStand;
import io.github.kloping.MySpringTool.annotations.Entity;

/**
 * @author github.kloping
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }
}

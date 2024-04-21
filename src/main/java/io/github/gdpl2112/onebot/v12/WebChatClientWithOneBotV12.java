package io.github.gdpl2112.onebot.v12;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.github.gdpl2112.onebot.v12.event.Event;
import io.github.gdpl2112.onebot.v12.impl.event.EventImpl;
import io.github.kloping.MySpringTool.StarterObjectApplication;
import io.github.kloping.MySpringTool.annotations.AutoStand;
import io.github.kloping.MySpringTool.annotations.CommentScan;
import io.github.kloping.MySpringTool.interfaces.Logger;
import io.github.kloping.date.FrameUtils;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * <p>WebChatClientWithOneBotV12 class.</p>
 *
 * @author github-kloping
 * 2023-04-05
 * @version 1.0
 */
@CommentScan(path = "io.github.gdpl2112.onebot.v12")
public class WebChatClientWithOneBotV12 {
    public static Logger logger;
    /**
     * Constant <code>LISTENER_HOSTS</code>
     */
    protected static final Set<ListenerHost> LISTENER_HOSTS = new HashSet<>();
    protected StarterObjectApplication application;
    @AutoStand
    Configuration configuration;
    private WebSocketClient client;

    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(String[] args) {
        new WebChatClientWithOneBotV12().start();
    }

    /**
     * <p>start.</p>
     */
    public void start() {
        application = new StarterObjectApplication(WebChatClientWithOneBotV12.class);
        application.addConfFile("./conf.txt");
        application.run0(WebChatClientWithOneBotV12.class);
        WebChatClientWithOneBotV12.logger = application.logger;
        configuration = application.INSTANCE.getContextManager().getContextEntity(WebChatClientWithOneBotV12.class).configuration;
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", String.format("Bearer %s", configuration.getToken()));
        headers.put("host", configuration.getHost());
        headers.put("port", configuration.getPort().toString());
        URI uri = null;
        try {
            uri = new URI(String.format("ws://%s:%s/", configuration.getHost(), configuration.getPort()));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        client = new WebSocketClient(uri, headers) {
            @Override
            public void onOpen(ServerHandshake sh) {
                application.logger.info("ws opened");
            }

            @Override
            public void onMessage(String message) {
                application.logger.info("wss message: " + message);
                JSONObject obj = JSON.parseObject(message);
                Event event = obj.toJavaObject(EventImpl.class);
                configuration.getEventManager().onEvent(event.getType(), obj);
            }

            @Override
            public void send(String text) throws NotYetConnectedException {
                application.logger.info("wss send pre:" + text);
                super.send(text);
            }

            @Override
            public void onClose(int code, String reason, boolean remote) {
                Integer r = application.INSTANCE.getContextManager().getContextEntity(Integer.class, "reconnect");
                application.logger.info("ws closed " + r + "(s) reconnect will;" + reason);
                FrameUtils.SERVICE.schedule(() -> {
                    try {
                        client.reconnectBlocking();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }, r, TimeUnit.SECONDS);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        };
        client.connect();
    }

    public static void registerListenerHost(ListenerHost host) {
        LISTENER_HOSTS.add(host);
    }
}

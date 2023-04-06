package io.github.gdpl2112.onebot.v12;

import com.alibaba.fastjson.JSONObject;
import io.github.gdpl2112.onebot.v12.action.ActionSender;
import io.github.gdpl2112.onebot.v12.impl.event.EventImpl;
import io.github.gdpl2112.onebot.v12.impl.event.GroupMessageEventImpl;
import io.github.gdpl2112.onebot.v12.impl.event.MessageEventImpl;
import io.github.gdpl2112.onebot.v12.impl.event.MetaEventImpl;
import io.github.gdpl2112.onebot.v12.utils.InvokeUtils;
import io.github.kloping.MySpringTool.annotations.AutoStand;
import io.github.kloping.MySpringTool.annotations.Entity;
import io.github.kloping.object.ObjectUtils;
import io.github.gdpl2112.onebot.v12.event.Event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static io.github.gdpl2112.onebot.v12.WebChatClientWithOneBotV12.LISTENER_HOSTS;


/**
 * @author github.kloping
 */
@Entity
public class EventManager {

    @AutoStand
    Configuration configuration;

    private final Map<Method, ListenerHost> M2L = new HashMap<>();
    private final Set<String> IDS = new HashSet<>();

    public synchronized void onEvent(String t, JSONObject obj) {
        try {
            Class<? extends Event> c0 = null;
            Event event = obj.toJavaObject(EventImpl.class);
            if (event == null) {
                System.err.println(String.format("unknown message(%s)", obj.toString()));
                return;
            }
            switch (t) {
                case "meta":
                    c0 = MetaEventImpl.class;
                    break;
                case "message":
                    if ("group".equals(event.getDetailType())) {
                        c0 = GroupMessageEventImpl.class;
                    } else if ("private".equals(event.getDetailType())) {
                        c0 = MessageEventImpl.class;
                    }
                    break;
                default:
                    System.err.println("其他事件" + event.getType());
                    break;
            }
            if (c0 == null) return;
            if (M2L.isEmpty()) {
                synchronized (M2L) {
                    for (ListenerHost listenerHost : LISTENER_HOSTS) {
                        for (Method method : InvokeUtils.getAllMethod(c0, listenerHost)) {
                            M2L.put(method, listenerHost);
                        }
                    }
                }
            }
            Class<? extends Event> finalC = c0;
            M2L.forEach((m, l) -> {
                try {
                    Object o = factory(event, obj, finalC);
                    if (ObjectUtils.isSuperOrInterface(o.getClass(), m.getParameterTypes()[0])) m.invoke(l, o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.getTargetException().printStackTrace();
                    l.handleException(e.getTargetException());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public <T extends Event> T factory(Event message, JSONObject jo, Class<T> cla) {
        Event event = null;
        if (cla == MetaEventImpl.class) {
            event = jo.toJavaObject(MetaEventImpl.class);
        } else if (cla == MessageEventImpl.class) {
            event = jo.toJavaObject(MessageEventImpl.class);
        } else if (cla == GroupMessageEventImpl.class) {
            event = jo.toJavaObject(GroupMessageEventImpl.class);
        }
        if (event instanceof ActionSender) {
            ((ActionSender) event).setConfiguration(configuration);
        }
        return (T) event;
    }

}

package io.github.kloping.onebot.v12.utils;


import io.github.kloping.onebot.v12.ListenerHost;
import io.github.kloping.onebot.v12.event.Event;
import io.github.kloping.onebot.v12.event.EventReceiver;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

/**
 * @author github.kloping
 */
public class InvokeUtils {
    public static <T extends Event> Method[] getAllMethod(Class<T> cla, ListenerHost listenerHost) {
        List<Method> methods = new LinkedList<>();
        for (Method declaredMethod : listenerHost.getClass().getDeclaredMethods()) {
            if (declaredMethod.getDeclaredAnnotation(EventReceiver.class) == null) continue;
            declaredMethod.setAccessible(true);
            methods.add(declaredMethod);
        }
        return methods.toArray(new Method[0]);
    }
}

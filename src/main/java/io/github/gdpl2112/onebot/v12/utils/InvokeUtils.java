package io.github.gdpl2112.onebot.v12.utils;


import io.github.gdpl2112.onebot.v12.ListenerHost;
import io.github.gdpl2112.onebot.v12.event.Event;
import io.github.gdpl2112.onebot.v12.event.EventReceiver;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>InvokeUtils class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public class InvokeUtils {
    /**
     * <p>getAllMethod.</p>
     *
     * @param cla a {@link java.lang.Class} object.
     * @param listenerHost a {@link io.github.gdpl2112.onebot.v12.ListenerHost} object.
     * @param <T> a T object.
     * @return an array of {@link java.lang.reflect.Method} objects.
     */
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

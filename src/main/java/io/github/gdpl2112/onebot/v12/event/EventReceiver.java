package io.github.gdpl2112.onebot.v12.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>EventReceiver class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
@Target(ElementType.METHOD)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
public @interface EventReceiver {
}

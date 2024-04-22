package io.github.gdpl2112.onebot.v12.event;

import io.github.gdpl2112.onebot.v12.contact.Friend;

/**
 * <p>FriendMessageEvent interface.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public interface FriendMessageEvent extends MessageEvent {
    Friend getFriend();
}

package io.github.gdpl2112.onebot.v12.contact;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>User class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends Self {
    private String userName;
}

package io.github.gdpl2112.onebot.v12.data;

import io.github.gdpl2112.onebot.v12.contact.Bot;
import lombok.Data;

/**
 * @author github.kloping
 */
@Data
public class Status {
    private Boolean good;
    private Bot[] bots;
}

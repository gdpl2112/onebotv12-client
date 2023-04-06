package io.github.kloping.onebot.v12.contact;

/**
 * @author github-kloping
 * @date 2023-04-05
 */
public class Self {
    private String userId;
    private String platform;

    public String getUserId() {
        return this.userId;
    }

    public Self setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getPlatform() {
        return this.platform;
    }

    public Self setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
}
package io.github.kloping.onebot.v12.contact;

/**
 * @author github.kloping
 */
public class User {
    private String userId;
    private String userName;
    private String platform = "";

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}

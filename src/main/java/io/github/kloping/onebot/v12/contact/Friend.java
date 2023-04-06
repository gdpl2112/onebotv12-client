package io.github.kloping.onebot.v12.contact;

/**
 * @author github.kloping
 */
public abstract class Friend extends User implements Contact {
    private String userRemark;
    private String userDisplayname;

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getUserDisplayname() {
        return userDisplayname;
    }

    public void setUserDisplayname(String userDisplayname) {
        this.userDisplayname = userDisplayname;
    }
}

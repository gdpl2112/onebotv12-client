package io.github.gdpl2112.onebot.v12.contact;

/**
 * <p>Abstract Friend class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public abstract class Friend extends User implements Contact {
    private String userRemark;
    private String userDisplayname;

    /**
     * <p>Getter for the field <code>userRemark</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getUserRemark() {
        return userRemark;
    }

    /**
     * <p>Setter for the field <code>userRemark</code>.</p>
     *
     * @param userRemark a {@link java.lang.String} object
     */
    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    /**
     * <p>Getter for the field <code>userDisplayname</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getUserDisplayname() {
        return userDisplayname;
    }

    /**
     * <p>Setter for the field <code>userDisplayname</code>.</p>
     *
     * @param userDisplayname a {@link java.lang.String} object
     */
    public void setUserDisplayname(String userDisplayname) {
        this.userDisplayname = userDisplayname;
    }
}

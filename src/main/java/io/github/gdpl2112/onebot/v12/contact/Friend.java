package io.github.gdpl2112.onebot.v12.contact;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p>Abstract Friend class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public abstract class Friend extends User implements Contact {
    private String userRemark;
    private String userDisplayname;
    @JSONField(name = "wx.avatar")
    private String avatar;
    @JSONField(name = "wx.wx_number")
    private String account;
    @JSONField(name = "wx.nation")
    private String nation;
    @JSONField(name = "wx.province")
    private String province;
    @JSONField(name = "wx.city")
    private String city;

    /**
     * <p>Getter for the field <code>avatar</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * <p>Setter for the field <code>avatar</code>.</p>
     *
     * @param avatar a {@link java.lang.String} object
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * <p>Getter for the field <code>account</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getAccount() {
        return account;
    }

    /**
     * <p>Setter for the field <code>account</code>.</p>
     *
     * @param account a {@link java.lang.String} object
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>Getter for the field <code>nation</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getNation() {
        return nation;
    }

    /**
     * <p>Setter for the field <code>nation</code>.</p>
     *
     * @param nation a {@link java.lang.String} object
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * <p>Getter for the field <code>province</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getProvince() {
        return province;
    }

    /**
     * <p>Setter for the field <code>province</code>.</p>
     *
     * @param province a {@link java.lang.String} object
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * <p>Getter for the field <code>city</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getCity() {
        return city;
    }

    /**
     * <p>Setter for the field <code>city</code>.</p>
     *
     * @param city a {@link java.lang.String} object
     */
    public void setCity(String city) {
        this.city = city;
    }
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

package io.github.gdpl2112.onebot.v12.contact;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *
 * @author github.kloping
 */
public class Member extends User {
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

    public String getUserDisplayname() {
        return userDisplayname;
    }

    public void setUserDisplayname(String userDisplayname) {
        this.userDisplayname = userDisplayname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

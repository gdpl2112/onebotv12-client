package io.github.gdpl2112.onebot.v12.contact;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <table><thead><tr><th style="text-align: center;">字段名</th><th style="text-align: center;">数据类型</th><th style="text-align: center;">说明</th></tr></thead><tbody><tr><td style="text-align: center;"><code>user_id</code></td><td style="text-align: center;">string</td><td style="text-align: center;">用户 ID</td></tr><tr><td style="text-align: center;"><code>user_name</code></td><td style="text-align: center;">string</td><td style="text-align: center;">昵称</td></tr><tr><td style="text-align: center;"><code>user_displayname</code></td><td style="text-align: center;">string</td><td style="text-align: center;">为空</td></tr><tr><td style="text-align: center;"><code>wx.avatar</code></td><td style="text-align: center;">string</td><td style="text-align: center;"><code>拓展字段:</code>头像url</td></tr><tr><td style="text-align: center;"><code>wx.wx_number</code></td><td style="text-align: center;">string</td><td style="text-align: center;"><code>拓展字段:</code>微信号</td></tr><tr><td style="text-align: center;"><code>wx.nation</code></td><td style="text-align: center;">string</td><td style="text-align: center;"><code>拓展字段:</code>国家</td></tr><tr><td style="text-align: center;"><code>wx.province</code></td><td style="text-align: center;">string</td><td style="text-align: center;"><code>拓展字段:</code>省份</td></tr><tr><td style="text-align: center;"><code>wx.city</code></td><td style="text-align: center;">string</td><td style="text-align: center;"><code>拓展字段:</code>城市</td></tr></tbody></table>
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

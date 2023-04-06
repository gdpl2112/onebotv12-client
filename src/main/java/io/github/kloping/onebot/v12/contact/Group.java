package io.github.kloping.onebot.v12.contact;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <table><thead><tr><th style="text-align: center;">字段名</th><th style="text-align: center;">数据类型</th><th style="text-align: center;">说明</th></tr></thead><tbody><tr><td style="text-align: center;"><code>group_id</code></td><td style="text-align: center;">string</td><td style="text-align: center;">群 ID</td></tr><tr><td style="text-align: center;"><code>group_name</code></td><td style="text-align: center;">string</td><td style="text-align: center;">群名称</td></tr><tr><td style="text-align: center;"><code>wx.avatar</code></td><td style="text-align: center;">string</td><td style="text-align: center;"><code>拓展字段:</code>群头像url</td></tr></tbody></table>
 *
 * @author github.kloping
 */
public abstract class Group implements Contact {
    private String groupId;
    private String groupName;
    @JSONField(name = "wx.avatar")
    private String avatar;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

package io.github.gdpl2112.onebot.v12.contact;

import com.alibaba.fastjson.annotation.JSONField;

/**
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

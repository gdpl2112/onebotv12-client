package io.github.gdpl2112.onebot.v12.contact;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p>Abstract Group class.</p>
 *
 * @author github.kloping
 * @version 1.0
 */
public abstract class Group implements Contact {
    private String groupId;
    private String groupName;
    @JSONField(name = "wx.avatar")
    private String avatar;

    /**
     * <p>Getter for the field <code>groupId</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>Setter for the field <code>groupId</code>.</p>
     *
     * @param groupId a {@link java.lang.String} object
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>Getter for the field <code>groupName</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>Setter for the field <code>groupName</code>.</p>
     *
     * @param groupName a {@link java.lang.String} object
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

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
}

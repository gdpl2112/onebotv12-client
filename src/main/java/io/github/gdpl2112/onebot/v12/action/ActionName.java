package io.github.gdpl2112.onebot.v12.action;

/**
 * @author github.kloping
 */
public enum ActionName {
    GET_SUPPORTED_ACTIONS("get_supported_actions"),
    GET_STATUS("get_status"),
    GET_VERSION("get_version"),
    SEND_MESSAGE("send_message"),
    GET_SELF_INFO("get_self_info"),
    GET_USER_INFO("get_user_info"),
    GET_FRIEND_LIST("get_friend_list"),
    GET_GROUP_INFO("get_group_info"),
    GET_GROUP_LIST("get_group_list"),
    GET_GROUP_MEMBER_INFO("get_group_member_info"),
    GET_GROUP_MEMBER_LIST("get_group_member_list"),
    SET_GROUP_NAME("set_group_name"),
    UPLOAD_FILE("upload_file"),
    GET_FILE("get_file"),
    WX_GET_PUBLIC_ACCOUNT_LIST("wx.get_public_account_list"),
    WX_FOLLOW_PUBLIC_NUMBER("wx.follow_public_number"),
    WX_SEARCH_FRIEND_BY_REMARK("wx.search_friend_by_remark"),
    WX_SEARCH_FRIEND_BY_WXNUMBER("wx.search_friend_by_wxnumber"),
    WX_SEARCH_FRIEND_BY_NICKNAME("wx.search_friend_by_nickname"),
    WX_CHECK_FRIEND_STATUS("wx.check_friend_status"),
    WX_GET_DB_HANDLES("wx.get_db_handles"),
    WX_EXECUTE_SQL("wx.execute_sql"),
    WX_BACKUP_DB("wx.backup_db"),
    WX_VERIFY_FRIEND_APPLY("wx.verify_friend_apply"),
    WX_GET_WECHAT_VERSION("wx.get_wechat_version"),
    WX_CHANGE_WECHAT_VERSION("wx.change_wechat_version"),
    WX_DELETE_FRIEND("wx.delete_friend"),
    WX_EDIT_REMARK("wx.edit_remark"),
    WX_SET_GROUP_ANNOUNCEMENT("wx.set_group_announcement"),
    WX_SET_GROUP_NICKNAME("wx.set_group_nickname"),
    WX_GET_GROUP_MEMBER_NICKNAME("wx.get_groupmember_nickname"),
    WX_KICK_GROUP_MEMBER("wx.kick_groupmember"),
    WX_INVITE_GROUP_MEMBER("wx.invite_groupmember"),
    WX_GET_HISTORY_PUBLIC_MSG("wx.get_history_public_msg"),
    WX_SEND_FORWARD_MSG("wx.send_forward_msg"),
    WX_SEND_XML("wx.send_xml"),
    WX_SEND_CARD("wx.send_card"),
    WX_CLEAN_FILE_CACHE("wx.clean_file_cache"),
    ;
    String name;

    ActionName(String name) {
        this.name = name;
    }
}

package cc.livvy.chatsdk.model;

/**
 * 消息类型
 *
 * Created by livvy on 17-2-21.
 */

public interface MessageType {

    /**
     * 聊天消息体
     */
    int MESSAGE_BODY_CHAT = 1;

    /**
     * 聊天消息体
     *
     * 消息格式为文字类型
     */
    int MESSAGE_TYPE_TEXT = 1001;

    /**
     * 聊天消息体
     *
     * 消息格式为图片类型
     */
    int MESSAGE_TYPE_PICTURE = 1002;

    /**
     * 聊天消息体
     *
     * 消息格式为定位类型
     */
    int MESSAGE_TYPE_LOCATION = 1003;

    /**
     * 推送消息体
     */
    int MESSAGE_BODY_PUSH = 2;


}

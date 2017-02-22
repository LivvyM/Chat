package cc.livvy.chatsdk.model;

/**
 * Created by livvy on 17-2-21.
 */

public interface MessageState {

    /**
     * 数据已经同步
     */
    int MESSAGE_STATE_SYNC = 1;


    /**
     * 数据暂未同步（发送失败）
     */
    int MESSAGE_STATE_UN_SYNC = 0;
}

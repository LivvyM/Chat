package cc.livvy.chatsdk.listener;

import cc.livvy.chatsdk.model.ChatItemEntity;

/**
 * 数据变化 观察者 Observer
 *
 * Created by livvy on 17-2-21.
 */

public abstract class ChatDataSetObserver {

    /**
     * This method is called when the entire data set has changed,
     * 收到数据
     */
    public void onReceive(ChatItemEntity entity) {
        // Do nothing
    }

    /**
     * This method is called when the entire data set has changed,
     * 发送数据
     */
    public void onSend(ChatItemEntity entity){
        // Do nothing
    }
}

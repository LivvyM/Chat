package cc.livvy.chatsdk.parse;

import android.os.Handler;

import cc.livvy.chatsdk.db.sandbox.SandBox;
import cc.livvy.chatsdk.listener.ChatDataSetObservable;
import cc.livvy.chatsdk.model.ChatItemEntity;

/**
 * 聊天数据parse
 *
 * Created by livvy on 17-2-21.
 */

public class ChatDataParse extends ChatDataSetObservable implements IDataParse{

    /**
     * 接收聊天数据
     */
    @Override
    public void receive(byte[] data) {
        //todo sandbox date
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ChatItemEntity entity = SandBox.getMessageEntity();
                notifyReceive(entity);
            }
        },5000);
    }

    /**
     * 发送聊天数据
     */
    @Override
    public void send() {

    }
}

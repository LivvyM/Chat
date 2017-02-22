package cc.livvy.chatsdk.db.sandbox;

import cc.livvy.chatsdk.model.ChatItemEntity;
import cc.livvy.chatsdk.model.MessageState;
import cc.livvy.chatsdk.model.MessageType;

/**
 * Created by livvy on 17-2-21.
 */

public class SandBox {

    public static ChatItemEntity getMessageEntity(){
        ChatItemEntity entity = new ChatItemEntity();
        entity.setChat_rm_id(1);
        entity.setChat_content("来自沙箱测试数据");
        entity.setSend_time(System.currentTimeMillis());
        entity.setChat_type(MessageType.MESSAGE_TYPE_TEXT);
        entity.setState(MessageState.MESSAGE_STATE_SYNC);
        entity.setSend_user_id(1001);
        entity.setSend_user_name("livvy");
        entity.setSend_user_header("http://tx.haiqq.com/uploads/allimg/140612/13300A442-38.png");
        return entity;
    }
}

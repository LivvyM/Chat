package cc.livvy.chatsdk.parse;

/**
 * 数据处理接口
 *
 * Created by livvy on 17-2-21.
 */

public interface IDataParse {

    /**
     * 接收
     */
    void receive(byte[] data);


    /**
     * 发送
     */
    void send();
}

package cc.livvy.chatsdk.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 聊天 item entity
 *
 *  @see MessageType; 关于chat_type
 *
 * Created by livvy on 17-2-21.
 */
@Entity
public class ChatItemEntity {

    @Id(autoincrement = true)
    private Long id;
    private int chat_rm_id;
    private int chat_type;
    private int send_user_id;
    private int state;
    private String send_user_header;
    private String send_user_name;
    private String send_rm_user_name;
    private long send_time;
    private String chat_content;    //聊天内容
    private String chat_picture;    //图片
    private String chat_share_longitude;  //分享经度
    private String chat_share_latitude;   //分享维度


    @Generated(hash = 1933149654)
    public ChatItemEntity(Long id, int chat_rm_id, int chat_type, int send_user_id,
            int state, String send_user_header, String send_user_name,
            String send_rm_user_name, long send_time, String chat_content,
            String chat_picture, String chat_share_longitude,
            String chat_share_latitude) {
        this.id = id;
        this.chat_rm_id = chat_rm_id;
        this.chat_type = chat_type;
        this.send_user_id = send_user_id;
        this.state = state;
        this.send_user_header = send_user_header;
        this.send_user_name = send_user_name;
        this.send_rm_user_name = send_rm_user_name;
        this.send_time = send_time;
        this.chat_content = chat_content;
        this.chat_picture = chat_picture;
        this.chat_share_longitude = chat_share_longitude;
        this.chat_share_latitude = chat_share_latitude;
    }

    @Generated(hash = 119742389)
    public ChatItemEntity() {
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getChat_rm_id() {
        return this.chat_rm_id;
    }
    public void setChat_rm_id(int chat_rm_id) {
        this.chat_rm_id = chat_rm_id;
    }
    public int getChat_type() {
        return this.chat_type;
    }
    public void setChat_type(int chat_type) {
        this.chat_type = chat_type;
    }
    public int getSend_user_id() {
        return this.send_user_id;
    }
    public void setSend_user_id(int send_user_id) {
        this.send_user_id = send_user_id;
    }
    public long getSend_time() {
        return this.send_time;
    }
    public void setSend_time(long send_time) {
        this.send_time = send_time;
    }
    public String getChat_content() {
        return this.chat_content;
    }
    public void setChat_content(String chat_content) {
        this.chat_content = chat_content;
    }
    public String getChat_picture() {
        return this.chat_picture;
    }
    public void setChat_picture(String chat_picture) {
        this.chat_picture = chat_picture;
    }
    public String getChat_share_longitude() {
        return this.chat_share_longitude;
    }
    public void setChat_share_longitude(String chat_share_longitude) {
        this.chat_share_longitude = chat_share_longitude;
    }
    public String getChat_share_latitude() {
        return this.chat_share_latitude;
    }
    public void setChat_share_latitude(String chat_share_latitude) {
        this.chat_share_latitude = chat_share_latitude;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getSend_user_header() {
        return this.send_user_header;
    }

    public void setSend_user_header(String send_user_header) {
        this.send_user_header = send_user_header;
    }

    public String getSend_user_name() {
        return this.send_user_name;
    }

    public void setSend_user_name(String send_user_name) {
        this.send_user_name = send_user_name;
    }

    public String getSend_rm_user_name() {
        return this.send_rm_user_name;
    }

    public void setSend_rm_user_name(String send_rm_user_name) {
        this.send_rm_user_name = send_rm_user_name;
    }
}

package cc.livvy.chatsdk.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cc.livvy.chatsdk.R;
import cc.livvy.chatsdk.listener.ChatDataSetObserver;
import cc.livvy.chatsdk.model.ChatItemEntity;
import cc.livvy.chatsdk.parse.ChatDataParse;

/**
 * 聊天页面
 *
 * Created by livvy on 17-2-21.
 */

public class ChatFragment extends Fragment{

    private View rootView;
    private boolean isFirst = true;

    private ChatDataParse chatDataParse = new ChatDataParse();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_chat_room, container, false);
        } else {
            isFirst = false;
        }
        ViewGroup parent = (ViewGroup) rootView.getParent();
        if (parent != null) {
            parent.removeView(rootView);
        }
        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (isFirst) {
            initView(view);
        }
    }

    private void initView(View view){

        chatDataParse.registerObserver(new ChatDataSetObserver() {
            @Override
            public void onReceive(ChatItemEntity entity) {
                super.onReceive(entity);

            }
        });
    }
}

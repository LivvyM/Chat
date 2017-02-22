package cc.livvy.chatsdk.listener;

import android.database.Observable;

import cc.livvy.chatsdk.model.ChatItemEntity;

/**
 * Created by livvy on 17-2-21.
 */

public class ChatDataSetObservable extends Observable<ChatDataSetObserver> {

    /**
     * Invokes onChanged on each observer. Called when the data set being observed has
     * changed, and which when read contains the new state of the data.
     */
    public void notifyReceive(ChatItemEntity entity) {
        synchronized(mObservers) {
            // since onChanged() is implemented by the app, it could do anything, including
            // removing itself from {@link mObservers} - and that could cause problems if
            // an iterator is used on the ArrayList {@link mObservers}.
            // to avoid such problems, just march thru the list in the reverse order.
            for (int i = mObservers.size() - 1; i >= 0; i--) {
                mObservers.get(i).onReceive(entity);
            }
        }
    }

    /**
     * Invokes onInvalidated on each observer. Called when the data set being monitored
     * has changed such that it is no longer valid.
     */
    public void notifySend(ChatItemEntity entity) {
        synchronized (mObservers) {
            for (int i = mObservers.size() - 1; i >= 0; i--) {
                mObservers.get(i).onSend(entity);
            }
        }
    }
}

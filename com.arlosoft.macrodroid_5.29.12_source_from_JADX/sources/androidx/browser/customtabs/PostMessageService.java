package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0048a;
import android.support.customtabs.C0054c;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PostMessageService extends Service {
    private C0054c.C0055a mBinder = new C0054c.C0055a() {
        public void onMessageChannelReady(@NonNull C0048a aVar, @Nullable Bundle bundle) throws RemoteException {
            aVar.onMessageChannelReady(bundle);
        }

        public void onPostMessage(@NonNull C0048a aVar, @NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            aVar.onPostMessage(str, bundle);
        }
    };

    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}

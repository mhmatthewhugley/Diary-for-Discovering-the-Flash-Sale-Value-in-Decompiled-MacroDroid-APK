package com.twofortyfouram.locale.sdk.client.internal;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import p276h8.C12406a;
import p295j8.C13301a;
import p295j8.C13307f;

/* renamed from: com.twofortyfouram.locale.sdk.client.internal.d */
public abstract class C11783d extends BroadcastReceiver {

    /* renamed from: com.twofortyfouram.locale.sdk.client.internal.d$a */
    public interface C11784a {
        /* renamed from: a */
        int mo67005a();
    }

    /* renamed from: com.twofortyfouram.locale.sdk.client.internal.d$b */
    static final class C11785b implements Handler.Callback {
        private C11785b() {
        }

        /* synthetic */ C11785b(byte b) {
            this();
        }

        /* JADX INFO: finally extract failed */
        public final boolean handleMessage(Message message) {
            C12406a.m83260d(message, NotificationCompat.CATEGORY_MESSAGE);
            if (message.what == 0) {
                C12406a.m83260d(message.obj, "msg.obj");
                boolean z = false;
                C12406a.m83257a(message.arg1, 0, 1, "msg.arg1");
                Pair pair = (Pair) message.obj;
                if (message.arg1 != 0) {
                    z = true;
                }
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) pair.first;
                try {
                    int a = ((C11784a) pair.second).mo67005a();
                    if (z) {
                        pendingResult.setResultCode(a);
                    }
                    pendingResult.finish();
                    if (C13301a.m85633a(18)) {
                        Looper.myLooper().quitSafely();
                    } else {
                        Looper.myLooper().quit();
                    }
                } catch (Throwable th) {
                    pendingResult.finish();
                    throw th;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo67004a(@NonNull C11784a aVar, boolean z) {
        C12406a.m83260d(aVar, "callback");
        BroadcastReceiver.PendingResult goAsync = goAsync();
        if (goAsync != null) {
            Handler handler = new Handler(C13307f.m85642a(getClass().getName(), C13307f.C13308a.BACKGROUND).getLooper(), new C11785b((byte) 0));
            if (!handler.sendMessage(handler.obtainMessage(0, z ? 1 : 0, 0, new Pair(goAsync, aVar)))) {
                throw new AssertionError();
            }
            return;
        }
        throw new AssertionError("PendingResult was null.  Was goAsync() called previously?");
    }
}

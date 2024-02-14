package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabh extends zau {

    /* renamed from: a */
    final /* synthetic */ zabi f3347a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zabh(zabi zabi, Looper looper) {
        super(looper);
        this.f3347a = zabi;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zabg) message.obj).mo21456b(this.f3347a);
        } else if (i != 2) {
            Log.w("GACStateManager", "Unknown message id: " + i);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}

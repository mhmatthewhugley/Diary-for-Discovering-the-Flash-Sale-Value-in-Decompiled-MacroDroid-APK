package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabc extends zau {

    /* renamed from: a */
    final /* synthetic */ zabe f3320a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zabc(zabe zabe, Looper looper) {
        super(looper);
        this.f3320a = zabe;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            zabe.m4016B(this.f3320a);
        } else if (i != 2) {
            Log.w("GoogleApiClientImpl", "Unknown message id: " + i);
        } else {
            zabe.m4015A(this.f3320a);
        }
    }
}

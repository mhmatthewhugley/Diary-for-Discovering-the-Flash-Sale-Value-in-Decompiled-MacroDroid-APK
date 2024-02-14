package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaso extends Handler {

    /* renamed from: a */
    final /* synthetic */ zzasp f25414a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaso(zzasp zzasp, Looper looper) {
        super(looper);
        this.f25414a = zzasp;
    }

    public final void handleMessage(Message message) {
        this.f25414a.mo41937c(message);
    }
}

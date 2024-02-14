package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzqa extends Handler {

    /* renamed from: a */
    final /* synthetic */ zzqc f38211a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzqa(zzqc zzqc, Looper looper) {
        super(looper);
        this.f38211a = zzqc;
    }

    public final void handleMessage(Message message) {
        zzqc.m54585a(this.f38211a, message);
    }
}

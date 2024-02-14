package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdo implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ zzdt f32575a;

    public /* synthetic */ zzdo(zzdt zzdt) {
        this.f32575a = zzdt;
    }

    public final boolean handleMessage(Message message) {
        zzdt.m48108g(this.f32575a, message);
        return true;
    }
}

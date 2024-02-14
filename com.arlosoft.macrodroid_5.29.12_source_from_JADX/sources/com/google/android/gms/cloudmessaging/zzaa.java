package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class zzaa extends zzf {

    /* renamed from: a */
    final /* synthetic */ Rpc f2976a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaa(Rpc rpc, Looper looper) {
        super(looper);
        this.f2976a = rpc;
    }

    public final void handleMessage(Message message) {
        Rpc.m3435d(this.f2976a, message);
    }
}

package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzgq extends zzgp {

    /* renamed from: a */
    final /* synthetic */ zzli f44669a;

    /* renamed from: b */
    final /* synthetic */ Payload f44670b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgq(zzgu zzgu, zzli zzli, Payload payload) {
        super((zzgo) null);
        this.f44669a = zzli;
        this.f44670b = payload;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        ((PayloadCallback) obj).mo37370a(this.f44669a.mo52873m2(), this.f44670b);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzczq implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzfzc f31914a;

    /* renamed from: b */
    final /* synthetic */ zzczs f31915b;

    zzczq(zzczs zzczs, zzfzc zzfzc) {
        this.f31915b = zzczs;
        this.f31914a = zzfzc;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        this.f31914a.mo20699a(th);
        zzchc.f28460e.execute(new zzczp(this.f31915b));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        zzczs.m47085b(this.f31915b, ((zzczl) obj).f31907a, this.f31914a);
    }
}

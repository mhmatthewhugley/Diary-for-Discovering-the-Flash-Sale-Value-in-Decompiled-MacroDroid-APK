package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzha implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f46962a;

    /* renamed from: c */
    final /* synthetic */ zzhx f46963c;

    zzha(zzhx zzhx, long j) {
        this.f46963c = zzhx;
        this.f46962a = j;
    }

    public final void run() {
        this.f46963c.f46899a.mo55189F().f46744k.mo55121b(this.f46962a);
        this.f46963c.f46899a.mo55221z().mo55097o().mo55092b("Session timeout duration set", Long.valueOf(this.f46962a));
    }
}

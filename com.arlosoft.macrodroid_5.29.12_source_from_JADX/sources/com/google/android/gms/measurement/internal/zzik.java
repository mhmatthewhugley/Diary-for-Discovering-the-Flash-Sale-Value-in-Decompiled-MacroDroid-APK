package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzik implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzie f47076a;

    /* renamed from: c */
    final /* synthetic */ long f47077c;

    /* renamed from: d */
    final /* synthetic */ zzim f47078d;

    zzik(zzim zzim, zzie zzie, long j) {
        this.f47078d = zzim;
        this.f47076a = zzie;
        this.f47077c = j;
    }

    public final void run() {
        this.f47078d.m65904n(this.f47076a, false, this.f47077c);
        zzim zzim = this.f47078d;
        zzim.f47082e = null;
        zzim.f46899a.mo55194L().mo55461s((zzie) null);
    }
}

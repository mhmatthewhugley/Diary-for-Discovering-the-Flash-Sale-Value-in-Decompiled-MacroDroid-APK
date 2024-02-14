package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzgf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzkw f46884a;

    /* renamed from: c */
    final /* synthetic */ zzq f46885c;

    /* renamed from: d */
    final /* synthetic */ zzgj f46886d;

    zzgf(zzgj zzgj, zzkw zzkw, zzq zzq) {
        this.f46886d = zzgj;
        this.f46884a = zzkw;
        this.f46885c = zzq;
    }

    public final void run() {
        this.f46886d.f46896a.mo55524b();
        if (this.f46884a.mo55568l2() == null) {
            this.f46886d.f46896a.mo55547s(this.f46884a, this.f46885c);
        } else {
            this.f46886d.f46896a.mo55510A(this.f46884a, this.f46885c);
        }
    }
}

package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzao implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzgm f46448a;

    /* renamed from: c */
    final /* synthetic */ zzap f46449c;

    zzao(zzap zzap, zzgm zzgm) {
        this.f46449c = zzap;
        this.f46448a = zzgm;
    }

    public final void run() {
        this.f46448a.mo55207h();
        if (zzab.m65353a()) {
            this.f46448a.mo55185B().mo55181x(this);
            return;
        }
        boolean e = this.f46449c.mo54999e();
        this.f46449c.f46453c = 0;
        if (e) {
            this.f46449c.mo54997c();
        }
    }
}

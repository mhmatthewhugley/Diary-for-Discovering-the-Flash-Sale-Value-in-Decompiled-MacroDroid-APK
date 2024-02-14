package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzft implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzac f46848a;

    /* renamed from: c */
    final /* synthetic */ zzq f46849c;

    /* renamed from: d */
    final /* synthetic */ zzgj f46850d;

    zzft(zzgj zzgj, zzac zzac, zzq zzq) {
        this.f46850d = zzgj;
        this.f46848a = zzac;
        this.f46849c = zzq;
    }

    public final void run() {
        this.f46850d.f46896a.mo55524b();
        if (this.f46848a.f46412d.mo55568l2() == null) {
            this.f46850d.f46896a.mo55546r(this.f46848a, this.f46849c);
        } else {
            this.f46850d.f46896a.mo55552x(this.f46848a, this.f46849c);
        }
    }
}

package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzfu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzac f46851a;

    /* renamed from: c */
    final /* synthetic */ zzgj f46852c;

    zzfu(zzgj zzgj, zzac zzac) {
        this.f46852c = zzgj;
        this.f46851a = zzac;
    }

    public final void run() {
        this.f46852c.f46896a.mo55524b();
        if (this.f46851a.f46412d.mo55568l2() == null) {
            this.f46852c.f46896a.mo55545q(this.f46851a);
        } else {
            this.f46852c.f46896a.mo55551w(this.f46851a);
        }
    }
}

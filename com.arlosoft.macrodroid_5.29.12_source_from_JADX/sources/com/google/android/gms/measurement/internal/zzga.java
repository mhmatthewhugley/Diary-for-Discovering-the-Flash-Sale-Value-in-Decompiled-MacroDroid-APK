package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzga implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f46871a;

    /* renamed from: c */
    final /* synthetic */ zzgj f46872c;

    zzga(zzgj zzgj, zzq zzq) {
        this.f46872c = zzgj;
        this.f46871a = zzq;
    }

    public final void run() {
        this.f46872c.f46896a.mo55524b();
        zzkt g8 = this.f46872c.f46896a;
        zzq zzq = this.f46871a;
        g8.mo55185B().mo55073e();
        g8.mo55526d();
        Preconditions.m4484g(zzq.f47326a);
        g8.mo55515S(zzq);
    }
}

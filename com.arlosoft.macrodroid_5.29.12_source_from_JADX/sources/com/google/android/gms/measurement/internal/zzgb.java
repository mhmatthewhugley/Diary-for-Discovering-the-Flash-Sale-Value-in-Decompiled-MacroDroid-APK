package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzgb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f46873a;

    /* renamed from: c */
    final /* synthetic */ zzgj f46874c;

    zzgb(zzgj zzgj, zzq zzq) {
        this.f46874c = zzgj;
        this.f46873a = zzq;
    }

    public final void run() {
        this.f46874c.f46896a.mo55524b();
        zzkt g8 = this.f46874c.f46896a;
        zzq zzq = this.f46873a;
        g8.mo55185B().mo55073e();
        g8.mo55526d();
        Preconditions.m4484g(zzq.f47326a);
        zzai b = zzai.m65384b(zzq.f47323M);
        zzai V = g8.mo55518V(zzq.f47326a);
        g8.mo55221z().mo55102t().mo55093c("Setting consent, package, consent", zzq.f47326a, b);
        g8.mo55553y(zzq.f47326a, b);
        if (b.mo54951k(V)) {
            g8.mo55548t(zzq);
        }
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47138a;

    /* renamed from: c */
    final /* synthetic */ boolean f47139c;

    /* renamed from: d */
    final /* synthetic */ zzac f47140d;

    /* renamed from: f */
    final /* synthetic */ zzac f47141f;

    /* renamed from: g */
    final /* synthetic */ zzjm f47142g;

    zzjc(zzjm zzjm, boolean z, zzq zzq, boolean z2, zzac zzac, zzac zzac2) {
        this.f47142g = zzjm;
        this.f47138a = zzq;
        this.f47139c = z2;
        this.f47140d = zzac;
        this.f47141f = zzac2;
    }

    public final void run() {
        zzac zzac;
        zzjm zzjm = this.f47142g;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.m4488k(this.f47138a);
        zzjm zzjm2 = this.f47142g;
        if (this.f47139c) {
            zzac = null;
        } else {
            zzac = this.f47140d;
        }
        zzjm2.mo55458p(H, zzac, this.f47138a);
        this.f47142g.m65932E();
    }
}

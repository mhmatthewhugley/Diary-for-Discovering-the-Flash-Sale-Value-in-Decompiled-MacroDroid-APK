package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzio implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47096a;

    /* renamed from: c */
    final /* synthetic */ boolean f47097c;

    /* renamed from: d */
    final /* synthetic */ zzkw f47098d;

    /* renamed from: f */
    final /* synthetic */ zzjm f47099f;

    zzio(zzjm zzjm, zzq zzq, boolean z, zzkw zzkw) {
        this.f47099f = zzjm;
        this.f47096a = zzq;
        this.f47097c = z;
        this.f47098d = zzkw;
    }

    public final void run() {
        zzkw zzkw;
        zzjm zzjm = this.f47099f;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.m4488k(this.f47096a);
        zzjm zzjm2 = this.f47099f;
        if (this.f47097c) {
            zzkw = null;
        } else {
            zzkw = this.f47098d;
        }
        zzjm2.mo55458p(H, zzkw, this.f47096a);
        this.f47099f.m65932E();
    }
}

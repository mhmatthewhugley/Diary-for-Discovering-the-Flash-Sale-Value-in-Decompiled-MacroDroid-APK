package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzai f47018a;

    /* renamed from: c */
    final /* synthetic */ int f47019c;

    /* renamed from: d */
    final /* synthetic */ long f47020d;

    /* renamed from: f */
    final /* synthetic */ boolean f47021f;

    /* renamed from: g */
    final /* synthetic */ zzai f47022g;

    /* renamed from: o */
    final /* synthetic */ zzhx f47023o;

    zzhs(zzhx zzhx, zzai zzai, int i, long j, boolean z, zzai zzai2) {
        this.f47023o = zzhx;
        this.f47018a = zzai;
        this.f47019c = i;
        this.f47020d = j;
        this.f47021f = z;
        this.f47022g = zzai2;
    }

    public final void run() {
        this.f47023o.mo55352J(this.f47018a);
        zzhx.m65838c0(this.f47023o, this.f47018a, this.f47019c, this.f47020d, false, this.f47021f);
        zzpd.m61097b();
        if (this.f47023o.f46899a.mo55219x().mo54919A((String) null, zzdu.f46625o0)) {
            zzhx.m65837b0(this.f47023o, this.f47018a, this.f47022g);
        }
    }
}

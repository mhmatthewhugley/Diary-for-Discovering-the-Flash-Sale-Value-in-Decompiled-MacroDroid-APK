package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzai f47011a;

    /* renamed from: c */
    final /* synthetic */ long f47012c;

    /* renamed from: d */
    final /* synthetic */ int f47013d;

    /* renamed from: f */
    final /* synthetic */ long f47014f;

    /* renamed from: g */
    final /* synthetic */ boolean f47015g;

    /* renamed from: o */
    final /* synthetic */ zzai f47016o;

    /* renamed from: p */
    final /* synthetic */ zzhx f47017p;

    zzhr(zzhx zzhx, zzai zzai, long j, int i, long j2, boolean z, zzai zzai2) {
        this.f47017p = zzhx;
        this.f47011a = zzai;
        this.f47012c = j;
        this.f47013d = i;
        this.f47014f = j2;
        this.f47015g = z;
        this.f47016o = zzai2;
    }

    public final void run() {
        this.f47017p.mo55352J(this.f47011a);
        this.f47017p.mo55380x(this.f47012c, false);
        zzhx.m65838c0(this.f47017p, this.f47011a, this.f47013d, this.f47014f, true, this.f47015g);
        zzpd.m61097b();
        if (this.f47017p.f46899a.mo55219x().mo54919A((String) null, zzdu.f46625o0)) {
            zzhx.m65837b0(this.f47017p, this.f47011a, this.f47016o);
        }
    }
}

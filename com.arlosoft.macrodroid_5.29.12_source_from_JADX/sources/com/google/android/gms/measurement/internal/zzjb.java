package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47133a;

    /* renamed from: c */
    final /* synthetic */ boolean f47134c;

    /* renamed from: d */
    final /* synthetic */ zzaw f47135d;

    /* renamed from: f */
    final /* synthetic */ String f47136f;

    /* renamed from: g */
    final /* synthetic */ zzjm f47137g;

    zzjb(zzjm zzjm, boolean z, zzq zzq, boolean z2, zzaw zzaw, String str) {
        this.f47137g = zzjm;
        this.f47133a = zzq;
        this.f47134c = z2;
        this.f47135d = zzaw;
        this.f47136f = str;
    }

    public final void run() {
        zzaw zzaw;
        zzjm zzjm = this.f47137g;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.m4488k(this.f47133a);
        zzjm zzjm2 = this.f47137g;
        if (this.f47134c) {
            zzaw = null;
        } else {
            zzaw = this.f47135d;
        }
        zzjm2.mo55458p(H, zzaw, this.f47133a);
        this.f47137g.m65932E();
    }
}

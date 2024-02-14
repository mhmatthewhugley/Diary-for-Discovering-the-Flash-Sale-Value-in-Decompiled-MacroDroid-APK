package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzht implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f47024a;

    /* renamed from: c */
    final /* synthetic */ zzhx f47025c;

    zzht(zzhx zzhx, boolean z) {
        this.f47025c = zzhx;
        this.f47024a = z;
    }

    public final void run() {
        boolean m = this.f47025c.f46899a.mo55212m();
        boolean l = this.f47025c.f46899a.mo55211l();
        this.f47025c.f46899a.mo55208i(this.f47024a);
        if (l == this.f47024a) {
            this.f47025c.f46899a.mo55221z().mo55102t().mo55092b("Default data collection state already set to", Boolean.valueOf(this.f47024a));
        }
        if (this.f47025c.f46899a.mo55212m() == m || this.f47025c.f46899a.mo55212m() != this.f47025c.f46899a.mo55211l()) {
            this.f47025c.f46899a.mo55221z().mo55104v().mo55093c("Default data collection is different than actual status", Boolean.valueOf(this.f47024a), Boolean.valueOf(m));
        }
        this.f47025c.m65836P();
    }
}

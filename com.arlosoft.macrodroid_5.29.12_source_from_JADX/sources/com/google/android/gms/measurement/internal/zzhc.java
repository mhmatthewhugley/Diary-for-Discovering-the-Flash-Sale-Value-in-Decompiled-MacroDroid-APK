package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f46973a;

    /* renamed from: c */
    final /* synthetic */ String f46974c;

    /* renamed from: d */
    final /* synthetic */ Object f46975d;

    /* renamed from: f */
    final /* synthetic */ long f46976f;

    /* renamed from: g */
    final /* synthetic */ zzhx f46977g;

    zzhc(zzhx zzhx, String str, String str2, Object obj, long j) {
        this.f46977g = zzhx;
        this.f46973a = str;
        this.f46974c = str2;
        this.f46975d = obj;
        this.f46976f = j;
    }

    public final void run() {
        this.f46977g.mo55355M(this.f46973a, this.f46974c, this.f46975d, this.f46976f);
    }
}

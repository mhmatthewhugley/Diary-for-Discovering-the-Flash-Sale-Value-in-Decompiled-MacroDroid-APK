package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f3494a;

    /* renamed from: c */
    final /* synthetic */ String f3495c;

    /* renamed from: d */
    final /* synthetic */ zzd f3496d;

    zzc(zzd zzd, LifecycleCallback lifecycleCallback, String str) {
        this.f3496d = zzd;
        this.f3494a = lifecycleCallback;
        this.f3495c = str;
    }

    public final void run() {
        zzd zzd = this.f3496d;
        if (zzd.f3499c > 0) {
            this.f3494a.mo21365f(zzd.f3500d != null ? zzd.f3500d.getBundle(this.f3495c) : null);
        }
        if (this.f3496d.f3499c >= 2) {
            this.f3494a.mo21369j();
        }
        if (this.f3496d.f3499c >= 3) {
            this.f3494a.mo21367h();
        }
        if (this.f3496d.f3499c >= 4) {
            this.f3494a.mo21370k();
        }
        if (this.f3496d.f3499c >= 5) {
            this.f3494a.mo21366g();
        }
    }
}

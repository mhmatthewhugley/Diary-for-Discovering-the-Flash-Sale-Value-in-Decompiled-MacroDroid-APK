package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zza implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f3487a;

    /* renamed from: c */
    final /* synthetic */ String f3488c;

    /* renamed from: d */
    final /* synthetic */ zzb f3489d;

    zza(zzb zzb, LifecycleCallback lifecycleCallback, String str) {
        this.f3489d = zzb;
        this.f3487a = lifecycleCallback;
        this.f3488c = str;
    }

    public final void run() {
        zzb zzb = this.f3489d;
        if (zzb.f3492c > 0) {
            this.f3487a.mo21365f(zzb.f3493d != null ? zzb.f3493d.getBundle(this.f3488c) : null);
        }
        if (this.f3489d.f3492c >= 2) {
            this.f3487a.mo21369j();
        }
        if (this.f3489d.f3492c >= 3) {
            this.f3487a.mo21367h();
        }
        if (this.f3489d.f3492c >= 4) {
            this.f3487a.mo21370k();
        }
        if (this.f3489d.f3492c >= 5) {
            this.f3487a.mo21366g();
        }
    }
}

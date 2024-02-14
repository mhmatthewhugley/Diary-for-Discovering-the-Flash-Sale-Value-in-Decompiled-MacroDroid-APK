package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjy {

    /* renamed from: a */
    private zzjx f47204a;

    /* renamed from: b */
    final /* synthetic */ zzkc f47205b;

    zzjy(zzkc zzkc) {
        this.f47205b = zzkc;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo55488a(long j) {
        this.f47204a = new zzjx(this, this.f47205b.f46899a.mo55201a().mo21950a(), j);
        this.f47205b.f47217c.postDelayed(this.f47204a, 2000);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo55489b() {
        this.f47205b.mo55073e();
        zzjx zzjx = this.f47204a;
        if (zzjx != null) {
            this.f47205b.f47217c.removeCallbacks(zzjx);
        }
        this.f47205b.f46899a.mo55189F().f46751r.mo55116a(false);
    }
}

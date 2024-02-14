package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class zzjw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzjx f47200a;

    public /* synthetic */ zzjw(zzjx zzjx) {
        this.f47200a = zzjx;
    }

    public final void run() {
        zzjx zzjx = this.f47200a;
        zzjy zzjy = zzjx.f47203d;
        long j = zzjx.f47201a;
        long j2 = zzjx.f47202c;
        zzjy.f47205b.mo55073e();
        zzjy.f47205b.f46899a.mo55221z().mo55097o().mo55091a("Application going to the background");
        zzjy.f47205b.f46899a.mo55189F().f46751r.mo55116a(true);
        Bundle bundle = new Bundle();
        if (!zzjy.f47205b.f46899a.mo55219x().mo54921D()) {
            zzjy.f47205b.f47219e.mo55492b(j2);
            zzjy.f47205b.f47219e.mo55494d(false, false, j2);
        }
        zzjy.f47205b.f46899a.mo55191I().mo55376t("auto", "_ab", j, bundle);
    }
}

package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbDevice;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzrq extends zznp {

    /* renamed from: a */
    final /* synthetic */ zzpq f45071a;

    /* renamed from: b */
    final /* synthetic */ zzrr f45072b;

    zzrq(zzrr zzrr, zzpq zzpq) {
        this.f45072b = zzrr;
        this.f45071a = zzpq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        ((RangingSessionCallback) obj).mo56043a(UwbDevice.m66556a(this.f45071a.mo53126l2().mo53216l2().mo53196m2()), this.f45071a.zza());
    }

    /* renamed from: b */
    public final void mo21338b() {
        zzrr zzrr = this.f45072b;
        zzrr.f45074c.mo56043a(UwbDevice.m66556a(this.f45071a.mo53126l2().mo53216l2().mo53196m2()), this.f45071a.zza());
    }
}

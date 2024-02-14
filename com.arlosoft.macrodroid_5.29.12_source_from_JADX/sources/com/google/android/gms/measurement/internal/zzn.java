package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class zzn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzcf f47305a;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f47306c;

    zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf) {
        this.f47306c = appMeasurementDynamiteService;
        this.f47305a = zzcf;
    }

    public final void run() {
        this.f47306c.f46398a.mo55196N().mo55575D(this.f47305a, this.f47306c.f46398a.mo55211l());
    }
}

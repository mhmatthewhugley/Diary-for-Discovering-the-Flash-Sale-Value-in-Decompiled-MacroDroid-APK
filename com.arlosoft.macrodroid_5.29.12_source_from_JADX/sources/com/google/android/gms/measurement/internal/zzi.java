package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class zzi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzcf f47051a;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f47052c;

    zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf) {
        this.f47052c = appMeasurementDynamiteService;
        this.f47051a = zzcf;
    }

    public final void run() {
        this.f47052c.f46398a.mo55194L().mo55448R(this.f47051a);
    }
}

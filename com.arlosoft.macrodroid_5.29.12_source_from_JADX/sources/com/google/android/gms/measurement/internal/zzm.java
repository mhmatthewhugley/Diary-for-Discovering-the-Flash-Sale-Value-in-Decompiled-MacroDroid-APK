package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class zzm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzcf f47301a;

    /* renamed from: c */
    final /* synthetic */ String f47302c;

    /* renamed from: d */
    final /* synthetic */ String f47303d;

    /* renamed from: f */
    final /* synthetic */ AppMeasurementDynamiteService f47304f;

    zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, String str, String str2) {
        this.f47304f = appMeasurementDynamiteService;
        this.f47301a = zzcf;
        this.f47302c = str;
        this.f47303d = str2;
    }

    public final void run() {
        this.f47304f.f46398a.mo55194L().mo55450T(this.f47301a, this.f47302c, this.f47303d);
    }
}

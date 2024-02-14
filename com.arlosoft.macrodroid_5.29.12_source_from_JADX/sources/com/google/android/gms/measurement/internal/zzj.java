package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class zzj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzcf f47127a;

    /* renamed from: c */
    final /* synthetic */ zzaw f47128c;

    /* renamed from: d */
    final /* synthetic */ String f47129d;

    /* renamed from: f */
    final /* synthetic */ AppMeasurementDynamiteService f47130f;

    zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, zzaw zzaw, String str) {
        this.f47130f = appMeasurementDynamiteService;
        this.f47127a = zzcf;
        this.f47128c = zzaw;
        this.f47129d = str;
    }

    public final void run() {
        this.f47130f.f46398a.mo55194L().mo55456n(this.f47127a, this.f47128c, this.f47129d);
    }
}

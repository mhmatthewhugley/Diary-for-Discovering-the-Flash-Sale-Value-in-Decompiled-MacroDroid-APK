package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class zzk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzcf f47207a;

    /* renamed from: c */
    final /* synthetic */ String f47208c;

    /* renamed from: d */
    final /* synthetic */ String f47209d;

    /* renamed from: f */
    final /* synthetic */ boolean f47210f;

    /* renamed from: g */
    final /* synthetic */ AppMeasurementDynamiteService f47211g;

    zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, String str, String str2, boolean z) {
        this.f47211g = appMeasurementDynamiteService;
        this.f47207a = zzcf;
        this.f47208c = str;
        this.f47209d = str2;
        this.f47210f = z;
    }

    public final void run() {
        this.f47211g.f46398a.mo55194L().mo55453W(this.f47207a, this.f47208c, this.f47209d, this.f47210f);
    }
}

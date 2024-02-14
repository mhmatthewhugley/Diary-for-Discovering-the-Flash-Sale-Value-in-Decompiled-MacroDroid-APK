package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
final class zzl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzo f47293a;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f47294c;

    zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, zzo zzo) {
        this.f47294c = appMeasurementDynamiteService;
        this.f47293a = zzo;
    }

    public final void run() {
        this.f47294c.f46398a.mo55191I().mo55350H(this.f47293a);
    }
}

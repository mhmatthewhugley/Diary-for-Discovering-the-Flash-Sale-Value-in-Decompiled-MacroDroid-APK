package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class zzg implements zza {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final AnalyticsConnector.AnalyticsConnectorListener f53817a;

    /* renamed from: b */
    private final AppMeasurementSdk f53818b;

    /* renamed from: c */
    private final zzf f53819c;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f53817a = analyticsConnectorListener;
        this.f53818b = appMeasurementSdk;
        zzf zzf = new zzf(this);
        this.f53819c = zzf;
        appMeasurementSdk.mo54906q(zzf);
    }
}

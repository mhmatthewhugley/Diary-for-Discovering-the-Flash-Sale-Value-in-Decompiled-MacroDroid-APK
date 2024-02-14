package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class zze implements zza {

    /* renamed from: a */
    final Set f53812a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AnalyticsConnector.AnalyticsConnectorListener f53813b;

    /* renamed from: c */
    private final AppMeasurementSdk f53814c;

    /* renamed from: d */
    private final zzd f53815d;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f53813b = analyticsConnectorListener;
        this.f53814c = appMeasurementSdk;
        zzd zzd = new zzd(this);
        this.f53815d = zzd;
        appMeasurementSdk.mo54906q(zzd);
    }
}

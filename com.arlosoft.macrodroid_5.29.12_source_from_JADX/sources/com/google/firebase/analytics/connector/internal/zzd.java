package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
final class zzd implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    final /* synthetic */ zze f53811a;

    public zzd(zze zze) {
        this.f53811a = zze;
    }

    /* renamed from: a */
    public final void mo55248a(String str, String str2, Bundle bundle, long j) {
        if (this.f53811a.f53812a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", zzc.m74476c(str2));
            this.f53811a.f53813b.mo22932a(2, bundle2);
        }
    }
}

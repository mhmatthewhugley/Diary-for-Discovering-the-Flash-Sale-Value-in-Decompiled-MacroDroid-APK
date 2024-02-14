package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
final class zzf implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    final /* synthetic */ zzg f53816a;

    public zzf(zzg zzg) {
        this.f53816a = zzg;
    }

    /* renamed from: a */
    public final void mo55248a(String str, String str2, Bundle bundle, long j) {
        if (str != null && zzc.m74481h(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f53816a.f53817a.mo22932a(3, bundle2);
        }
    }
}

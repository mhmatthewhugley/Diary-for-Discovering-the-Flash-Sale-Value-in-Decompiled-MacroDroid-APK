package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzap implements ListenerHolder.Notifier<LocationCallback> {

    /* renamed from: a */
    final /* synthetic */ LocationResult f41085a;

    zzap(zzar zzar, LocationResult locationResult) {
        this.f41085a = locationResult;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        ((LocationCallback) obj).mo54181b(this.f41085a);
    }

    /* renamed from: b */
    public final void mo21338b() {
    }
}

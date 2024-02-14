package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzaq implements ListenerHolder.Notifier<LocationCallback> {

    /* renamed from: a */
    final /* synthetic */ LocationAvailability f41086a;

    zzaq(zzar zzar, LocationAvailability locationAvailability) {
        this.f41086a = locationAvailability;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        ((LocationCallback) obj).mo54180a(this.f41086a);
    }

    /* renamed from: b */
    public final void mo21338b() {
    }
}

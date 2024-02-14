package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzat implements ListenerHolder.Notifier<LocationListener> {

    /* renamed from: a */
    final /* synthetic */ Location f41088a;

    zzat(zzau zzau, Location location) {
        this.f41088a = location;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21337a(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.f41088a);
    }

    /* renamed from: b */
    public final void mo21338b() {
    }
}

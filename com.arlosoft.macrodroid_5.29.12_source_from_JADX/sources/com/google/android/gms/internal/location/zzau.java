package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzbc;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzau extends zzbc {

    /* renamed from: a */
    private final ListenerHolder<LocationListener> f41089a;

    zzau(ListenerHolder<LocationListener> listenerHolder) {
        this.f41089a = listenerHolder;
    }

    /* renamed from: S1 */
    public final synchronized void mo50536S1(Location location) {
        this.f41089a.mo21377c(new zzat(this, location));
    }

    /* renamed from: a */
    public final synchronized void mo50537a() {
        this.f41089a.mo21375a();
    }
}

package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzaz;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzar extends zzaz {

    /* renamed from: a */
    private final ListenerHolder<LocationCallback> f41087a;

    zzar(ListenerHolder<LocationCallback> listenerHolder) {
        this.f41087a = listenerHolder;
    }

    /* renamed from: a */
    public final synchronized void mo50533a() {
        this.f41087a.mo21375a();
    }

    /* renamed from: g3 */
    public final void mo50534g3(LocationAvailability locationAvailability) {
        this.f41087a.mo21377c(new zzaq(this, locationAvailability));
    }

    /* renamed from: y7 */
    public final void mo50535y7(LocationResult locationResult) {
        this.f41087a.mo21377c(new zzap(this, locationResult));
    }
}

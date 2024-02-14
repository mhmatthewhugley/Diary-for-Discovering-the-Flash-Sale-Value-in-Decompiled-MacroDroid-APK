package com.google.android.gms.location;

import com.google.android.gms.tasks.OnTokenCanceledListener;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzy implements OnTokenCanceledListener {

    /* renamed from: a */
    private final FusedLocationProviderClient f46130a;

    /* renamed from: b */
    private final LocationCallback f46131b;

    zzy(FusedLocationProviderClient fusedLocationProviderClient, LocationCallback locationCallback) {
        this.f46130a = fusedLocationProviderClient;
        this.f46131b = locationCallback;
    }

    /* renamed from: d */
    public final void mo54443d() {
        this.f46130a.mo54150G(this.f46131b);
    }
}

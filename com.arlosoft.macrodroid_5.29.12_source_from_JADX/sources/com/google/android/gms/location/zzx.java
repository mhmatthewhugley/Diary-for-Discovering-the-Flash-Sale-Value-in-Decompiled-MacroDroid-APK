package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzx implements zzan {

    /* renamed from: a */
    private final FusedLocationProviderClient f46126a;

    /* renamed from: b */
    private final zzap f46127b;

    /* renamed from: c */
    private final LocationCallback f46128c;

    /* renamed from: d */
    private final zzan f46129d;

    zzx(FusedLocationProviderClient fusedLocationProviderClient, zzap zzap, LocationCallback locationCallback, zzan zzan) {
        this.f46126a = fusedLocationProviderClient;
        this.f46127b = zzap;
        this.f46128c = locationCallback;
        this.f46129d = zzan;
    }

    public final void zza() {
        FusedLocationProviderClient fusedLocationProviderClient = this.f46126a;
        zzap zzap = this.f46127b;
        LocationCallback locationCallback = this.f46128c;
        zzan zzan = this.f46129d;
        zzap.mo54384c(false);
        fusedLocationProviderClient.mo54150G(locationCallback);
        if (zzan != null) {
            zzan.zza();
        }
    }
}

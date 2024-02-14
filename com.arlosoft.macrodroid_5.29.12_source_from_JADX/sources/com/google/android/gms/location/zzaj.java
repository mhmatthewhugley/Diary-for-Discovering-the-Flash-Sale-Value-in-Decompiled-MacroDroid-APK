package com.google.android.gms.location;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzaj extends LocationCallback {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f46072a;

    /* renamed from: b */
    final /* synthetic */ FusedLocationProviderClient f46073b;

    zzaj(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.f46073b = fusedLocationProviderClient;
        this.f46072a = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo54180a(LocationAvailability locationAvailability) {
    }

    /* renamed from: b */
    public final void mo54181b(LocationResult locationResult) {
        this.f46072a.mo56141e(locationResult.mo54193l2());
        this.f46073b.mo54150G(this);
    }
}

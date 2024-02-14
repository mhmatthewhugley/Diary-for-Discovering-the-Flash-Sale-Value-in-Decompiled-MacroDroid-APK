package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzr extends zzx {

    /* renamed from: t */
    final /* synthetic */ LocationRequest f41157t;

    /* renamed from: u */
    final /* synthetic */ LocationListener f41158u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzr(zzz zzz, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        super(googleApiClient);
        this.f41157t = locationRequest;
        this.f41158u = locationListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50569u0(this.f41157t, ListenerHolders.m3811a(this.f41158u, zzbj.m59263b(), LocationListener.class.getSimpleName()), new zzy(this));
    }
}

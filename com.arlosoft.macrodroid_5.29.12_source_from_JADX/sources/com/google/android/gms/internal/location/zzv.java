package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzv extends zzx {

    /* renamed from: t */
    final /* synthetic */ LocationListener f41167t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzv(zzz zzz, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.f41167t = locationListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50572x0(ListenerHolders.m3812b(this.f41167t, LocationListener.class.getSimpleName()), new zzy(this));
    }
}

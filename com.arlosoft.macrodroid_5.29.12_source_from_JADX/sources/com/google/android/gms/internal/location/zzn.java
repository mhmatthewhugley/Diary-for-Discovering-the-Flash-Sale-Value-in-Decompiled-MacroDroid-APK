package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzn extends zzx {

    /* renamed from: t */
    final /* synthetic */ LocationCallback f41154t;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50574z0(ListenerHolders.m3812b(this.f41154t, LocationCallback.class.getSimpleName()), new zzy(this));
    }
}

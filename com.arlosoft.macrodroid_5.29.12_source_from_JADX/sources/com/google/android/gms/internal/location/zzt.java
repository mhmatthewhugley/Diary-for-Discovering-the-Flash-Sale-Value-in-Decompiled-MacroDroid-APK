package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzt extends zzx {

    /* renamed from: t */
    final /* synthetic */ LocationRequest f41162t;

    /* renamed from: u */
    final /* synthetic */ LocationCallback f41163u;

    /* renamed from: v */
    final /* synthetic */ Looper f41164v;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50568t0(zzba.m59254l2((String) null, this.f41162t), ListenerHolders.m3811a(this.f41163u, zzbj.m59262a(this.f41164v), LocationCallback.class.getSimpleName()), new zzy(this));
    }
}

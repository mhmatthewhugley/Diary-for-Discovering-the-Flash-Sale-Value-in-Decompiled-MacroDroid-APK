package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzs extends zzx {

    /* renamed from: t */
    final /* synthetic */ LocationRequest f41159t;

    /* renamed from: u */
    final /* synthetic */ LocationListener f41160u;

    /* renamed from: v */
    final /* synthetic */ Looper f41161v;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50569u0(this.f41159t, ListenerHolders.m3811a(this.f41160u, zzbj.m59262a(this.f41161v), LocationListener.class.getSimpleName()), new zzy(this));
    }
}

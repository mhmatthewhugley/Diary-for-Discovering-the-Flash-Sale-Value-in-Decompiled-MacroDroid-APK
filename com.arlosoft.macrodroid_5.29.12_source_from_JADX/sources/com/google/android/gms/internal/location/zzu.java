package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.LocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzu extends zzx {

    /* renamed from: t */
    final /* synthetic */ LocationRequest f41165t;

    /* renamed from: u */
    final /* synthetic */ PendingIntent f41166u;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50571w0(this.f41165t, this.f41166u, new zzy(this));
    }
}

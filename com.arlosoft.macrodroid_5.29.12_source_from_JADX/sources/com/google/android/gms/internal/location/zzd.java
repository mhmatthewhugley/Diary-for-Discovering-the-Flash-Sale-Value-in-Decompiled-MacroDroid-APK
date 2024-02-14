package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzd extends zzf {

    /* renamed from: t */
    final /* synthetic */ long f41139t;

    /* renamed from: u */
    final /* synthetic */ PendingIntent f41140u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzd(zzg zzg, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f41139t = j;
        this.f41140u = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50557E0(this.f41139t, this.f41140u);
        mo21329l(Status.f3138p);
    }
}

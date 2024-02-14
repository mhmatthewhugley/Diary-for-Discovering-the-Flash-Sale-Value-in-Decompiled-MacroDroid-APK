package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zze extends zzf {

    /* renamed from: t */
    final /* synthetic */ PendingIntent f41141t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zze(zzg zzg, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f41141t = pendingIntent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzaz) anyClient).mo50560H0(this.f41141t);
        mo21329l(Status.f3138p);
    }
}

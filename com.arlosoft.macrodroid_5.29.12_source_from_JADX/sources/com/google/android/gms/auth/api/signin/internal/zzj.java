package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzj extends zzn<Status> {
    zzj(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        zzf zzf = (zzf) anyClient;
        ((zzt) zzf.mo21626I()).mo21045n5(new zzm(this), zzf.mo21033r0());
    }
}

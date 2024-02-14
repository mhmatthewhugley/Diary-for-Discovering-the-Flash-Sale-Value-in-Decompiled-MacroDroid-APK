package com.google.android.gms.internal.p203authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzn */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzn extends zzo<Status> {

    /* renamed from: t */
    private final /* synthetic */ Credential f39154t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzn(zzj zzj, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.f39154t = credential;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo48523z(Context context, zzx zzx) throws RemoteException {
        zzx.mo48529b9(new zzp(this), new zzt(this.f39154t));
    }
}

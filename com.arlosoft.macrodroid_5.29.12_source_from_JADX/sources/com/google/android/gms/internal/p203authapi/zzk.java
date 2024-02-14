package com.google.android.gms.internal.p203authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzk */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzk extends zzo<Status> {

    /* renamed from: t */
    private final /* synthetic */ Credential f39152t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzk(zzj zzj, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.f39152t = credential;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo48523z(Context context, zzx zzx) throws RemoteException {
        zzx.mo48527B2(new zzp(this), new zzz(this.f39152t));
    }
}

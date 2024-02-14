package com.google.android.gms.internal.p203authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzi */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzi extends zzo<CredentialRequestResult> {

    /* renamed from: t */
    private final /* synthetic */ CredentialRequest f39151t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzi(zzj zzj, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.f39151t = credentialRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return zzg.m55713a(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo48523z(Context context, zzx zzx) throws RemoteException {
        zzx.mo48530q2(new zzl(this), this.f39151t);
    }
}

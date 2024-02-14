package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzh extends zzn<GoogleSignInResult> {

    /* renamed from: t */
    final /* synthetic */ Context f2935t;

    /* renamed from: u */
    final /* synthetic */ GoogleSignInOptions f2936u;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return new GoogleSignInResult((GoogleSignInAccount) null, status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzt) ((zzf) anyClient).mo21626I()).mo21044F8(new zzk(this), this.f2936u);
    }
}

package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzk extends zzc {

    /* renamed from: a */
    private final /* synthetic */ zzh f2938a;

    zzk(zzh zzh) {
        this.f2938a = zzh;
    }

    /* renamed from: z8 */
    public final void mo21026z8(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            zzq.m3385c(this.f2938a.f2935t).mo21042b(this.f2938a.f2936u, googleSignInAccount);
        }
        this.f2938a.mo21329l(new GoogleSignInResult(googleSignInAccount, status));
    }
}

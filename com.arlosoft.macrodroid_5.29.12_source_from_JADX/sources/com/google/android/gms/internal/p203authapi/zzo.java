package com.google.android.gms.internal.p203authapi;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* renamed from: com.google.android.gms.internal.auth-api.zzo */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
abstract class zzo<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzq> {
    zzo(GoogleApiClient googleApiClient) {
        super(Auth.f2669f, googleApiClient);
    }

    @KeepForSdk
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        super.mo21329l((Result) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        zzq zzq = (zzq) anyClient;
        mo48523z(zzq.mo21621D(), (zzx) zzq.mo21626I());
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo48523z(Context context, zzx zzx) throws DeadObjectException, RemoteException;
}

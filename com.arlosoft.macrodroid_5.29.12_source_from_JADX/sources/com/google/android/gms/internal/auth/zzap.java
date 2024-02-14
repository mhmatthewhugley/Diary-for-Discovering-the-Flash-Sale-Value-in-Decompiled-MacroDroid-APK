package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

abstract class zzap extends BaseImplementation.ApiMethodImpl<ProxyApi.ProxyResult, zzak> {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public /* synthetic */ Result mo21036h(Status status) {
        return new zzaw(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        zzak zzak = (zzak) anyClient;
        mo48559z(zzak.mo21621D(), (zzan) zzak.mo21626I());
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo48559z(Context context, zzan zzan) throws RemoteException;
}

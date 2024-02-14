package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

abstract class zzaq extends BaseImplementation.ApiMethodImpl<ProxyApi.SpatulaHeaderResult, zzak> {
    /* renamed from: A */
    protected static ProxyApi.SpatulaHeaderResult m55780A(Status status) {
        return new zzax(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public /* synthetic */ Result mo21036h(Status status) {
        return m55780A(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        zzak zzak = (zzak) anyClient;
        mo48560z(zzak.mo21621D(), (zzan) zzak.mo21626I());
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo48560z(Context context, zzan zzan) throws RemoteException;
}

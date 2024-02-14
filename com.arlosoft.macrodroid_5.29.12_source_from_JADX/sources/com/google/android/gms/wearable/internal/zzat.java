package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzat extends zzu {

    /* renamed from: t */
    private final String f48144t;

    /* renamed from: u */
    private ChannelApi.ChannelListener f48145u;

    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        this.f48145u = null;
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzim) anyClient).mo56507D0(this, this.f48145u, this.f48144t);
        this.f48145u = null;
    }
}

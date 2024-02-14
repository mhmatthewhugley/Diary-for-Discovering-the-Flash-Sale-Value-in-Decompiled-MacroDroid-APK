package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzag extends zzu {

    /* renamed from: t */
    private CapabilityApi.CapabilityListener f48126t;

    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        this.f48126t = null;
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzim) anyClient).mo56506C0(this, this.f48126t);
        this.f48126t = null;
    }
}

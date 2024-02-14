package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzfh extends zzu {

    /* renamed from: t */
    final /* synthetic */ MessageApi.MessageListener f48294t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfh(zzfl zzfl, GoogleApiClient googleApiClient, MessageApi.MessageListener messageListener) {
        super(googleApiClient);
        this.f48294t = messageListener;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzim) anyClient).mo56509r0(this, this.f48294t);
    }
}

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzch extends zzu {

    /* renamed from: t */
    final /* synthetic */ PutDataRequest f48207t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzch(zzct zzct, GoogleApiClient googleApiClient, PutDataRequest putDataRequest) {
        super(googleApiClient);
        this.f48207t = putDataRequest;
    }

    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return new zzcq(status, (DataItem) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzim) anyClient).mo56504A0(this, this.f48207t);
    }
}

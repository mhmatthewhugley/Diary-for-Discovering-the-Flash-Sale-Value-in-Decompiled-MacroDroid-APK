package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzck extends zzu {

    /* renamed from: t */
    final /* synthetic */ Uri f48209t;

    /* renamed from: u */
    final /* synthetic */ int f48210u;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        return new DataItemBuffer(DataHolder.m4297l2(status.mo21294n2()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzfb) ((zzim) anyClient).mo21626I()).mo56433Ub(new zzhy(this), this.f48209t, this.f48210u);
    }
}

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzaq extends zzu {

    /* renamed from: t */
    final /* synthetic */ String f48139t;

    /* renamed from: u */
    final /* synthetic */ String f48140u;

    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return new zzas(status, (Channel) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzfb) ((zzim) anyClient).mo21626I()).mo56437Yb(new zzic(this), this.f48139t, this.f48140u);
    }
}

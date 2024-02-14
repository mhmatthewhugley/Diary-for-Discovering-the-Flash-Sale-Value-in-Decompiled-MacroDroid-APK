package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzcl extends zzu {

    /* renamed from: t */
    final /* synthetic */ Uri f48211t;

    /* renamed from: u */
    final /* synthetic */ int f48212u;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        return new zzcr(status, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzfb) ((zzim) anyClient).mo21626I()).mo56424Lb(new zzhq(this), this.f48211t, this.f48212u);
    }
}

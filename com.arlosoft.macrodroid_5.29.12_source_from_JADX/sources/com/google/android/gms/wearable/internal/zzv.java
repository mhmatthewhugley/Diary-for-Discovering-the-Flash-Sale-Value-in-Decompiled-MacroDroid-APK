package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityInfo;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzv extends zzu {

    /* renamed from: t */
    final /* synthetic */ String f48446t;

    /* renamed from: u */
    final /* synthetic */ int f48447u;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return new zzae(status, (CapabilityInfo) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzfb) ((zzim) anyClient).mo21626I()).mo56426Nb(new zzhs(this), this.f48446t, this.f48447u);
    }
}

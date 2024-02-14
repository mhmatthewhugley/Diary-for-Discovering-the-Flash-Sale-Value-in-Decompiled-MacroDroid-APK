package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzcm extends zzu {

    /* renamed from: t */
    final /* synthetic */ Asset f48213t;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return new zzcs(status, (ParcelFileDescriptor) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzim) anyClient).mo56517z0(this, this.f48213t);
    }
}

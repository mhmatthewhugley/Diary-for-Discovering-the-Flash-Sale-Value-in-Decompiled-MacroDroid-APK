package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzfz extends zzu {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return new zzgc(status, (Node) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzfb) ((zzim) anyClient).mo21626I()).mo56435Wb(new zzia(this));
    }
}

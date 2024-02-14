package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzc extends zzu {

    /* renamed from: t */
    private Object f48195t;

    /* renamed from: u */
    private ListenerHolder f48196u;

    /* renamed from: v */
    private final zzb f48197v;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        this.f48195t = null;
        this.f48196u = null;
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        this.f48197v.mo56296a((zzim) anyClient, this, this.f48195t, this.f48196u);
        this.f48195t = null;
        this.f48196u = null;
    }
}

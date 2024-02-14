package com.google.android.gms.internal.icing;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
abstract class zzai<T extends Result> extends BaseImplementation.ApiMethodImpl<T, zzae> {
    @KeepForSdk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        super.mo21329l((Result) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        mo50165z((zzaa) ((zzae) anyClient).mo21626I());
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo50165z(zzaa zzaa) throws RemoteException;
}

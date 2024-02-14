package com.google.android.gms.internal.icing;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzay extends BaseImplementation.ApiMethodImpl<Status, zzav> {

    /* renamed from: t */
    private final String f40762t;

    /* renamed from: u */
    private final String f40763u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final boolean f40764v;

    @KeepForSdk
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        super.mo21329l((Result) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        if (this.f40764v) {
            String valueOf = String.valueOf(status.mo21295o2());
            if (valueOf.length() != 0) {
                "ClearTokenImpl received failure: ".concat(valueOf);
            }
        }
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzau) ((zzav) anyClient).mo21626I()).mo50169Z8(new zzax(this), this.f40762t, this.f40763u);
    }
}

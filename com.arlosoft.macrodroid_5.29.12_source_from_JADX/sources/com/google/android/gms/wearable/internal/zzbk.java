package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbk extends zzu {

    /* renamed from: t */
    final /* synthetic */ zzbq f48170t;

    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return new zzbp(status, (OutputStream) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        String l2 = this.f48170t.f48184a;
        zzca zzca = new zzca();
        ((zzfb) ((zzim) anyClient).mo21626I()).mo56428Pb(new zzhu(this, zzca), zzca, l2);
    }
}

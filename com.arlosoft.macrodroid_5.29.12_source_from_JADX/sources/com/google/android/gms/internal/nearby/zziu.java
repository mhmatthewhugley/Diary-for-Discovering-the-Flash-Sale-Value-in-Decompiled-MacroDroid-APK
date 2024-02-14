package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.nearby.connection.Payload;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zziu extends zzjh {

    /* renamed from: t */
    final /* synthetic */ List f44789t;

    /* renamed from: u */
    final /* synthetic */ byte[] f44790u;

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).mo52745H0(this, (String[]) this.f44789t.toArray(new String[0]), Payload.m66303d(this.f44790u), true);
    }
}

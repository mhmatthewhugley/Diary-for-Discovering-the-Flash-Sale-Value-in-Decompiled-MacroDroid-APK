package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzfg extends zzu {

    /* renamed from: t */
    final /* synthetic */ String f48291t;

    /* renamed from: u */
    final /* synthetic */ String f48292u;

    /* renamed from: v */
    final /* synthetic */ byte[] f48293v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfg(zzfl zzfl, GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
        super(googleApiClient);
        this.f48291t = str;
        this.f48292u = str2;
        this.f48293v = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        return new zzfk(status, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzfb) ((zzim) anyClient).mo21626I()).mo56443dc(new zzig(this), this.f48291t, this.f48292u, this.f48293v);
    }
}

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzga extends zzu {
    zzga(zzgd zzgd, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(Status status) {
        return new zzgb(status, new ArrayList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzfb) ((zzim) anyClient).mo21626I()).mo56430Rb(new zzhw(this));
    }
}

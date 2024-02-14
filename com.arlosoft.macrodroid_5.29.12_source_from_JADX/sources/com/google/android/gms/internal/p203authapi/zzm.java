package com.google.android.gms.internal.p203authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzm */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzm extends zzo<Status> {
    zzm(zzj zzj, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ Result mo21036h(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo48523z(Context context, zzx zzx) throws RemoteException {
        zzx.mo48528C3(new zzp(this));
    }
}

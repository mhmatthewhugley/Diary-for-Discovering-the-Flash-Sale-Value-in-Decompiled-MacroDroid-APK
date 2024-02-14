package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzi extends BaseImplementation.ApiMethodImpl<Result, zzr> {

    /* renamed from: t */
    private final /* synthetic */ boolean f39236t;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Result mo21036h(Status status) {
        return new zzp(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzc) ((zzr) anyClient).mo21626I()).mo20765I0(this.f39236t);
        mo21329l(new zzp(Status.f3138p));
    }
}

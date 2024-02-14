package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zzl extends BaseImplementation.ApiMethodImpl<Result, zzr> {

    /* renamed from: t */
    private final /* synthetic */ Account f39239t;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Result mo21036h(Status status) {
        return new zzq(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final /* synthetic */ void mo21037t(Api.AnyClient anyClient) throws RemoteException {
        ((zzc) ((zzr) anyClient).mo21626I()).mo20767xb(new zzm(this), this.f39239t);
    }
}

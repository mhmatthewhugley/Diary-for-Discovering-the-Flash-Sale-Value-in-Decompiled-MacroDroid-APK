package com.google.android.gms.internal.p203authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzav */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzav extends zzad {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f39134a;

    zzav(zzao zzao, TaskCompletionSource taskCompletionSource) {
        this.f39134a = taskCompletionSource;
    }

    /* renamed from: Aa */
    public final void mo48508Aa(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        TaskUtil.m3878b(status, beginSignInResult, this.f39134a);
    }
}

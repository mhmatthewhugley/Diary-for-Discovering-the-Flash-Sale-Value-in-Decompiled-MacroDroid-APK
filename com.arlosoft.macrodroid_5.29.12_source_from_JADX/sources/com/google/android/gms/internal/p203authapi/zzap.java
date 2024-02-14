package com.google.android.gms.internal.p203authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzap */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzap extends zzaj {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f39127a;

    zzap(zzak zzak, TaskCompletionSource taskCompletionSource) {
        this.f39127a = taskCompletionSource;
    }

    /* renamed from: v9 */
    public final void mo48511v9(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
        TaskUtil.m3878b(status, savePasswordResult, this.f39127a);
    }
}

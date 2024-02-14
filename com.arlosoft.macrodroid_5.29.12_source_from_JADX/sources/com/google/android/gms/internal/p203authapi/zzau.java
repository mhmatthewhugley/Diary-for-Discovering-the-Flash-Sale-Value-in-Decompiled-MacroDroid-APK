package com.google.android.gms.internal.p203authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzau */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzau extends IStatusCallback.Stub {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f39133a;

    zzau(zzao zzao, TaskCompletionSource taskCompletionSource) {
        this.f39133a = taskCompletionSource;
    }

    /* renamed from: j8 */
    public final void mo21356j8(Status status) throws RemoteException {
        TaskUtil.m3877a(status, this.f39133a);
    }
}

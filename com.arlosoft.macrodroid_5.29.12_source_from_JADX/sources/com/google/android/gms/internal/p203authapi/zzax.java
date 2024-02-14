package com.google.android.gms.internal.p203authapi;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzax */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final class zzax extends zzah {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f39136a;

    zzax(zzao zzao, TaskCompletionSource taskCompletionSource) {
        this.f39136a = taskCompletionSource;
    }

    /* renamed from: B6 */
    public final void mo48510B6(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.m3878b(status, pendingIntent, this.f39136a);
    }
}

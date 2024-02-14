package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzao extends IStatusCallback.Stub {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f44552a;

    zzao(TaskCompletionSource taskCompletionSource) {
        this.f44552a = taskCompletionSource;
    }

    /* renamed from: j8 */
    public final void mo21356j8(Status status) {
        TaskUtil.m3880d(status, null, this.f44552a);
    }
}

package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zax extends IStatusCallback.Stub {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f3845a;

    zax(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f3845a = taskCompletionSource;
    }

    /* renamed from: j8 */
    public final void mo21356j8(Status status) {
        TaskUtil.m3880d(status, null, this.f3845a);
    }
}

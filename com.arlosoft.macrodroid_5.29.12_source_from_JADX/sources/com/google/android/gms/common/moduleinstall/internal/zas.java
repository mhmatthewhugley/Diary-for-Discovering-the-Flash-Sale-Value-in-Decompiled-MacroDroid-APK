package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zas extends zaa {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f3837a;

    zas(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f3837a = taskCompletionSource;
    }

    /* renamed from: Oa */
    public final void mo21866Oa(Status status) {
        TaskUtil.m3880d(status, null, this.f3837a);
    }
}

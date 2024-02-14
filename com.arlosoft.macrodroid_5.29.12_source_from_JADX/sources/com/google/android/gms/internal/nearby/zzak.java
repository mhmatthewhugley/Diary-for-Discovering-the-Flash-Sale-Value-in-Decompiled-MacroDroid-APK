package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzak extends zzdl {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f44548a;

    zzak(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.f44548a = taskCompletionSource;
    }

    /* renamed from: s6 */
    public final void mo52525s6(Status status, int i) {
        TaskUtil.m3880d(status, Integer.valueOf(i), this.f44548a);
    }
}

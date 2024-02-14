package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.safetynet.zze;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzm extends zze {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f47923a;

    zzm(zzl zzl, TaskCompletionSource taskCompletionSource) {
        this.f47923a = taskCompletionSource;
    }

    /* renamed from: Q0 */
    public final void mo53745Q0(Status status) {
        TaskUtil.m3877a(status, this.f47923a);
    }
}

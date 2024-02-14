package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzaq extends zzcn {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f44553a;

    zzaq(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.f44553a = taskCompletionSource;
    }

    /* renamed from: W0 */
    public final void mo52528W0(Status status, boolean z) {
        TaskUtil.m3880d(status, Boolean.valueOf(z), this.f44553a);
    }
}

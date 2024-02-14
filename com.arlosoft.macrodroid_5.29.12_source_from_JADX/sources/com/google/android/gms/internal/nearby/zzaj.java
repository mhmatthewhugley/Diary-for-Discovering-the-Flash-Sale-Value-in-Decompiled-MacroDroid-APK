package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzaj extends zzcr {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f44547a;

    zzaj(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.f44547a = taskCompletionSource;
    }

    /* renamed from: Y */
    public final void mo52524Y(Status status, List list) {
        TaskUtil.m3880d(status, list, this.f44547a);
    }
}

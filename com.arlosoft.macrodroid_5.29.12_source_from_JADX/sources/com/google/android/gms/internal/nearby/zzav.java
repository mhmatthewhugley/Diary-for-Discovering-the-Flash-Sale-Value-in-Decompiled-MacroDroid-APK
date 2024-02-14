package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzav extends zzde {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f44559a;

    zzav(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.f44559a = taskCompletionSource;
    }

    /* renamed from: f3 */
    public final void mo52533f3(Status status, ExposureSummary exposureSummary) {
        TaskUtil.m3880d(status, exposureSummary, this.f44559a);
    }
}

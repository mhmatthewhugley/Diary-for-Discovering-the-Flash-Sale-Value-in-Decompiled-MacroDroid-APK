package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationStatus;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzam extends zzdo {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f44550a;

    zzam(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.f44550a = taskCompletionSource;
    }

    /* renamed from: w6 */
    public final void mo52523w6(Status status, long j) {
        TaskUtil.m3880d(status, ExposureNotificationStatus.m66385b(j), this.f44550a);
    }
}

package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzi extends IStatusCallback.Stub {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f46111a;

    zzi(ActivityRecognitionClient activityRecognitionClient, TaskCompletionSource taskCompletionSource) {
        this.f46111a = taskCompletionSource;
    }

    /* renamed from: j8 */
    public final void mo21356j8(Status status) {
        TaskUtil.m3877a(status, this.f46111a);
    }
}

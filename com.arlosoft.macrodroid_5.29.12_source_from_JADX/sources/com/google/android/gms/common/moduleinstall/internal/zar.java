package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zar extends zaa {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f3836a;

    zar(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f3836a = taskCompletionSource;
    }

    /* renamed from: I9 */
    public final void mo21865I9(Status status, @Nullable ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.m3880d(status, moduleAvailabilityResponse, this.f3836a);
    }
}

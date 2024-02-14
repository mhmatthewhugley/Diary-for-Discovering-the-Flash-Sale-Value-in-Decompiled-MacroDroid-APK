package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaw extends zaa {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f3844a;

    zaw(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f3844a = taskCompletionSource;
    }

    /* renamed from: X2 */
    public final void mo21867X2(Status status, @Nullable ModuleInstallIntentResponse moduleInstallIntentResponse) {
        TaskUtil.m3880d(status, moduleInstallIntentResponse, this.f3844a);
    }
}

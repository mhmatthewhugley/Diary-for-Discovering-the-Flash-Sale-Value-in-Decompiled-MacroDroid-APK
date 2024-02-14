package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zat extends zaa {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f3838a;

    zat(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f3838a = taskCompletionSource;
    }

    /* renamed from: D9 */
    public final void mo21864D9(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.m3880d(status, moduleInstallResponse, this.f3838a);
    }
}

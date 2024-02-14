package com.google.android.gms.location;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzj implements BaseImplementation.ResultHolder<Status> {

    /* renamed from: a */
    private final TaskCompletionSource<Void> f46112a;

    public zzj(TaskCompletionSource<Void> taskCompletionSource) {
        Preconditions.m4488k(taskCompletionSource);
        this.f46112a = taskCompletionSource;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        TaskUtil.m3878b((Status) obj, null, this.f46112a);
    }

    /* renamed from: b */
    public final void mo21321b(@Nullable Status status) {
        if (status != null) {
            this.f46112a.mo56138b(new ApiException(status));
        }
    }
}

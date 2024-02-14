package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzat implements BaseImplementation.ResultHolder<Status> {

    /* renamed from: a */
    private final TaskCompletionSource<Void> f46084a;

    public zzat(TaskCompletionSource<Void> taskCompletionSource) {
        this.f46084a = taskCompletionSource;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        TaskUtil.m3878b((Status) obj, null, this.f46084a);
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        this.f46084a.mo56138b(new ApiException(status));
    }
}

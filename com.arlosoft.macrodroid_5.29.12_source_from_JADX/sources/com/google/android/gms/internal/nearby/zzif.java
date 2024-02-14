package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzif implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    private final TaskCompletionSource f44759a;

    zzif(zzih zzih, TaskCompletionSource taskCompletionSource) {
        this.f44759a = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo21038a(Object obj) {
        this.f44759a.mo56139c(null);
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        this.f44759a.mo56138b(new ApiException(status));
    }
}

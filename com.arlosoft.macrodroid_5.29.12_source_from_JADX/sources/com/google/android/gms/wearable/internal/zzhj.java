package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzhj implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    final TaskCompletionSource f48367a;

    zzhj(TaskCompletionSource taskCompletionSource) {
        this.f48367a = taskCompletionSource;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        Status status = (Status) obj;
        int n2 = status.mo21294n2();
        if (n2 == 0 || n2 == 4001) {
            this.f48367a.mo56139c(null);
        } else {
            mo21321b(status);
        }
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        this.f48367a.mo56138b(new ApiException(status));
    }
}

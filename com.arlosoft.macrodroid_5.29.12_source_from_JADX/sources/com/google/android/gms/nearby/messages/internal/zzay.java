package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzay implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f47746a;

    zzay(zzbh zzbh, TaskCompletionSource taskCompletionSource) {
        this.f47746a = taskCompletionSource;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21038a(Object obj) {
        Status status = (Status) obj;
        this.f47746a.mo56139c(null);
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        this.f47746a.mo56138b(new ApiException(status));
    }
}

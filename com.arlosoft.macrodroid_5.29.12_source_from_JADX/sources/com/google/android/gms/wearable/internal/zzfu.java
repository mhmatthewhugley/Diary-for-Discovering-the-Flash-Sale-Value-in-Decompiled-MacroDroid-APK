package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzfu implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f48319a;

    zzfu(zzfw zzfw, TaskCompletionSource taskCompletionSource) {
        this.f48319a = taskCompletionSource;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        zzfv zzfv = (zzfv) obj;
        if (zzfv.getStatus().mo21297q2()) {
            this.f48319a.mo56139c(zzfv.mo56452a());
        } else {
            this.f48319a.mo56138b(ApiExceptionUtil.m4340a(zzfv.getStatus()));
        }
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        this.f48319a.mo56138b(ApiExceptionUtil.m4340a(status));
    }
}

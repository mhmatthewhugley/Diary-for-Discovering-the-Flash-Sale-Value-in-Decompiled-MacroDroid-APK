package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzgi implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f48336a;

    zzgi(zzgl zzgl, TaskCompletionSource taskCompletionSource) {
        this.f48336a = taskCompletionSource;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        zzgk zzgk = (zzgk) obj;
        if (zzgk.getStatus().mo21297q2()) {
            this.f48336a.mo56139c(zzgk.mo56460a());
        } else {
            this.f48336a.mo56138b(ApiExceptionUtil.m4340a(zzgk.getStatus()));
        }
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        this.f48336a.mo56138b(ApiExceptionUtil.m4340a(status));
    }
}

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zap implements PendingResult.StatusListener {

    /* renamed from: a */
    final /* synthetic */ PendingResult f3721a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f3722b;

    /* renamed from: c */
    final /* synthetic */ PendingResultUtil.ResultConverter f3723c;

    /* renamed from: d */
    final /* synthetic */ zas f3724d;

    zap(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, zas zas) {
        this.f3721a = pendingResult;
        this.f3722b = taskCompletionSource;
        this.f3723c = resultConverter;
        this.f3724d = zas;
    }

    /* renamed from: a */
    public final void mo21274a(Status status) {
        if (status.mo21297q2()) {
            this.f3722b.mo56139c(this.f3723c.mo20769a(this.f3721a.mo21272e(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f3722b.mo56138b(ApiExceptionUtil.m4340a(status));
    }
}

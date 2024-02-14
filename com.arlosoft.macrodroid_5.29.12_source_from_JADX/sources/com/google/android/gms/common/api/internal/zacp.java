package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zacp<R extends Result> extends PendingResult<R> {

    /* renamed from: a */
    private final Status f3422a;

    /* renamed from: c */
    public final void mo21270c(@NonNull PendingResult.StatusListener statusListener) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @NonNull
    /* renamed from: d */
    public final R mo21271d() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @NonNull
    /* renamed from: e */
    public final R mo21272e(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    /* renamed from: f */
    public final void mo21212f() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    /* renamed from: g */
    public final void mo21273g(@NonNull ResultCallback<? super R> resultCallback) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: h */
    public final Status mo21503h() {
        return this.f3422a;
    }
}

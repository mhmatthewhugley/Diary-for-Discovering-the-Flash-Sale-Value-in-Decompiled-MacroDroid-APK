package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {

    /* renamed from: a */
    private final BasePendingResult f3219a;

    /* renamed from: c */
    public final void mo21270c(@NonNull PendingResult.StatusListener statusListener) {
        this.f3219a.mo21270c(statusListener);
    }

    @NonNull
    /* renamed from: d */
    public final R mo21271d() {
        return this.f3219a.mo21271d();
    }

    @NonNull
    /* renamed from: e */
    public final R mo21272e(long j, @NonNull TimeUnit timeUnit) {
        return this.f3219a.mo21272e(j, timeUnit);
    }

    /* renamed from: f */
    public final void mo21212f() {
        this.f3219a.mo21212f();
    }

    /* renamed from: g */
    public final void mo21273g(@NonNull ResultCallback<? super R> resultCallback) {
        this.f3219a.mo21273g(resultCallback);
    }
}

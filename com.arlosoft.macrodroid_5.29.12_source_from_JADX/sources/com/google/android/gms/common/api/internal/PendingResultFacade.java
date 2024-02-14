package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class PendingResultFacade<A extends Result, B extends Result> extends PendingResult<B> {
    /* renamed from: c */
    public final void mo21270c(@NonNull PendingResult.StatusListener statusListener) {
        throw null;
    }

    @NonNull
    /* renamed from: d */
    public final B mo21271d() {
        throw null;
    }

    @NonNull
    /* renamed from: e */
    public final B mo21272e(long j, @NonNull TimeUnit timeUnit) {
        throw null;
    }

    /* renamed from: f */
    public final void mo21212f() {
        throw null;
    }

    /* renamed from: g */
    public final void mo21273g(@NonNull ResultCallback<? super B> resultCallback) {
        throw null;
    }
}

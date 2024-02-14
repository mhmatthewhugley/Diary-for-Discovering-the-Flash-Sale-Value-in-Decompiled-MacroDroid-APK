package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface StatusListener {
        @KeepForSdk
        /* renamed from: a */
        void mo21274a(@NonNull Status status);
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo21270c(@NonNull StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: d */
    public abstract R mo21271d();

    @NonNull
    /* renamed from: e */
    public abstract R mo21272e(long j, @NonNull TimeUnit timeUnit);

    /* renamed from: f */
    public abstract void mo21212f();

    /* renamed from: g */
    public abstract void mo21273g(@NonNull ResultCallback<? super R> resultCallback);
}

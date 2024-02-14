package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfyy extends zzfyx {

    /* renamed from: s */
    private final zzfzp f36599s;

    zzfyy(zzfzp zzfzp) {
        Objects.requireNonNull(zzfzp);
        this.f36599s = zzfzp;
    }

    public final boolean cancel(boolean z) {
        return this.f36599s.cancel(z);
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return this.f36599s.get();
    }

    public final boolean isCancelled() {
        return this.f36599s.isCancelled();
    }

    public final boolean isDone() {
        return this.f36599s.isDone();
    }

    /* renamed from: q */
    public final void mo43580q(Runnable runnable, Executor executor) {
        this.f36599s.mo43580q(runnable, executor);
    }

    public final String toString() {
        return this.f36599s.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f36599s.get(j, timeUnit);
    }
}

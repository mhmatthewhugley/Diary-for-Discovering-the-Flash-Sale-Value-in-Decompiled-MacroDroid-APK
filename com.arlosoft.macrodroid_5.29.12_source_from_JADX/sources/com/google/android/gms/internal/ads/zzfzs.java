package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfzs extends zzfya {

    /* renamed from: a */
    private final ExecutorService f36612a;

    zzfzs(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.f36612a = executorService;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f36612a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f36612a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f36612a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f36612a.isTerminated();
    }

    public final void shutdown() {
        this.f36612a.shutdown();
    }

    public final List shutdownNow() {
        return this.f36612a.shutdownNow();
    }

    public final String toString() {
        return super.toString() + "[" + this.f36612a + "]";
    }
}

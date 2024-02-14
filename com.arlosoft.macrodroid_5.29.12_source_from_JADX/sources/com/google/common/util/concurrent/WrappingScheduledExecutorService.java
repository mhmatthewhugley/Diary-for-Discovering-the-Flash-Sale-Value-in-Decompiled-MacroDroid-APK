package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@CanIgnoreReturnValue
abstract class WrappingScheduledExecutorService extends WrappingExecutorService implements ScheduledExecutorService {

    /* renamed from: c */
    final ScheduledExecutorService f53708c;

    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f53708c.schedule(mo61852c(runnable), j, timeUnit);
    }

    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f53708c.scheduleAtFixedRate(mo61852c(runnable), j, j2, timeUnit);
    }

    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f53708c.scheduleWithFixedDelay(mo61852c(runnable), j, j2, timeUnit);
    }

    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.f53708c.schedule(mo61853d(callable), j, timeUnit);
    }
}

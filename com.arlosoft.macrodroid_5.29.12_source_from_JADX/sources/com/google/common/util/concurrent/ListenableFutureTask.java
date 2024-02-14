package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {

    /* renamed from: a */
    private final ExecutionList f53604a = new ExecutionList();

    ListenableFutureTask(Callable<V> callable) {
        super(callable);
    }

    /* renamed from: a */
    public static <V> ListenableFutureTask<V> m74243a(Callable<V> callable) {
        return new ListenableFutureTask<>(callable);
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.f53604a.mo61748a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void done() {
        this.f53604a.mo61749b();
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return super.get(j, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}

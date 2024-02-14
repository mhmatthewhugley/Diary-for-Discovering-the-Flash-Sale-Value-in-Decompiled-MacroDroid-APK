package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ForwardingFluentFuture<V> extends FluentFuture<V> {

    /* renamed from: s */
    private final ListenableFuture<V> f53568s;

    ForwardingFluentFuture(ListenableFuture<V> listenableFuture) {
        this.f53568s = (ListenableFuture) Preconditions.m5392s(listenableFuture);
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.f53568s.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.f53568s.cancel(z);
    }

    @ParametricNullness
    public V get() throws InterruptedException, ExecutionException {
        return this.f53568s.get();
    }

    public boolean isCancelled() {
        return this.f53568s.isCancelled();
    }

    public boolean isDone() {
        return this.f53568s.isDone();
    }

    public String toString() {
        return this.f53568s.toString();
    }

    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f53568s.get(j, timeUnit);
    }
}

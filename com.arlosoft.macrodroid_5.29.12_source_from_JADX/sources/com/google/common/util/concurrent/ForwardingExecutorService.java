package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingObject;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@CanIgnoreReturnValue
public abstract class ForwardingExecutorService extends ForwardingObject implements ExecutorService {
    protected ForwardingExecutorService() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract ExecutorService mo22325Q();

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo22325Q().awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        mo22325Q().execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return mo22325Q().invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return mo22325Q().invokeAny(collection);
    }

    public boolean isShutdown() {
        return mo22325Q().isShutdown();
    }

    public boolean isTerminated() {
        return mo22325Q().isTerminated();
    }

    public void shutdown() {
        mo22325Q().shutdown();
    }

    public List<Runnable> shutdownNow() {
        return mo22325Q().shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return mo22325Q().submit(callable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo22325Q().invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo22325Q().invokeAny(collection, j, timeUnit);
    }

    public Future<?> submit(Runnable runnable) {
        return mo22325Q().submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, @ParametricNullness T t) {
        return mo22325Q().submit(runnable, t);
    }
}

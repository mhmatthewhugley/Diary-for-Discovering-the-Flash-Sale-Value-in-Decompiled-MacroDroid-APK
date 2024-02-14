package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@CanIgnoreReturnValue
abstract class WrappingExecutorService implements ExecutorService {

    /* renamed from: a */
    private final ExecutorService f53707a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m74368b(Callable callable) {
        try {
            callable.call();
        } catch (Exception e) {
            Throwables.m5493p(e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    private <T> ImmutableList<Callable<T>> m74369e(Collection<? extends Callable<T>> collection) {
        ImmutableList.Builder n = ImmutableList.m27306n();
        for (Callable d : collection) {
            n.mo35365e(mo61853d(d));
        }
        return n.mo35398k();
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f53707a.awaitTermination(j, timeUnit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Runnable mo61852c(Runnable runnable) {
        return new C11031e(mo61853d(Executors.callable(runnable, (Object) null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract <T> Callable<T> mo61853d(Callable<T> callable);

    public final void execute(Runnable runnable) {
        this.f53707a.execute(mo61852c(runnable));
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f53707a.invokeAll(m74369e(collection));
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f53707a.invokeAny(m74369e(collection));
    }

    public final boolean isShutdown() {
        return this.f53707a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f53707a.isTerminated();
    }

    public final void shutdown() {
        this.f53707a.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f53707a.shutdownNow();
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f53707a.submit(mo61853d((Callable) Preconditions.m5392s(callable)));
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f53707a.invokeAll(m74369e(collection), j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f53707a.invokeAny(m74369e(collection), j, timeUnit);
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f53707a.submit(mo61852c(runnable));
    }

    public final <T> Future<T> submit(Runnable runnable, @ParametricNullness T t) {
        return this.f53707a.submit(mo61852c(runnable), t);
    }
}

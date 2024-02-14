package com.google.android.gms.internal.mlkit_common;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class zzbe extends zzag implements ExecutorService {
    protected zzbe() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo51725a() {
        throw null;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo51802b().awaitTermination(j, timeUnit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ExecutorService mo51802b();

    public void execute(Runnable runnable) {
        mo51802b().execute(runnable);
    }

    public final List invokeAll(Collection collection) throws InterruptedException {
        return mo51802b().invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) throws InterruptedException, ExecutionException {
        return mo51802b().invokeAny(collection);
    }

    public final boolean isShutdown() {
        return mo51802b().isShutdown();
    }

    public final boolean isTerminated() {
        return mo51802b().isTerminated();
    }

    public final void shutdown() {
        mo51802b().shutdown();
    }

    public final List shutdownNow() {
        return mo51802b().shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return mo51802b().submit(runnable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo51802b().invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo51802b().invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return mo51802b().submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return mo51802b().submit(callable);
    }
}

package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class ImmediateFuture<V> implements ListenableFuture<V> {

    /* renamed from: c */
    static final ListenableFuture<?> f53592c = new ImmediateFuture((Object) null);

    /* renamed from: d */
    private static final Logger f53593d = Logger.getLogger(ImmediateFuture.class.getName());
    @ParametricNullness

    /* renamed from: a */
    private final V f53594a;

    static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {

        /* renamed from: s */
        static final ImmediateCancelledFuture<Object> f53595s = (AbstractFuture.f53349f ? null : new ImmediateCancelledFuture<>());

        ImmediateCancelledFuture() {
            cancel(false);
        }
    }

    static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
        ImmediateFailedFuture(Throwable th) {
            mo61563D(th);
        }
    }

    ImmediateFuture(@ParametricNullness V v) {
        this.f53594a = v;
    }

    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.m5393t(runnable, "Runnable was null.");
        Preconditions.m5393t(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f53593d;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    @ParametricNullness
    public V get() {
        return this.f53594a;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f53594a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }

    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.m5392s(timeUnit);
        return get();
    }
}

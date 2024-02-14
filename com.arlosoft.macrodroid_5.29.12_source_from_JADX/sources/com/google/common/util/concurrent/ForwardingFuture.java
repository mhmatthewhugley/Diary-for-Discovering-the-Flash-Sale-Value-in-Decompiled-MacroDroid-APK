package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ForwardingObject;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtCompatible
@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {

    public static abstract class SimpleForwardingFuture<V> extends ForwardingFuture<V> {

        /* renamed from: a */
        private final Future<V> f53569a;

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public final Future<V> mo22325Q() {
            return this.f53569a;
        }
    }

    protected ForwardingFuture() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract Future<? extends V> mo22325Q();

    public boolean cancel(boolean z) {
        return mo22325Q().cancel(z);
    }

    @ParametricNullness
    public V get() throws InterruptedException, ExecutionException {
        return mo22325Q().get();
    }

    public boolean isCancelled() {
        return mo22325Q().isCancelled();
    }

    public boolean isDone() {
        return mo22325Q().isDone();
    }

    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo22325Q().get(j, timeUnit);
    }
}

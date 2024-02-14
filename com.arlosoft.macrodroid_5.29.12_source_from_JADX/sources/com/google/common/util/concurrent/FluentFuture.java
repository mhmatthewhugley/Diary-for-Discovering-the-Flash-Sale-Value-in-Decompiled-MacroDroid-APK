package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class FluentFuture<V> extends GwtFluentFutureCatchingSpecialization<V> {

    static abstract class TrustedFuture<V> extends FluentFuture<V> implements AbstractFuture.Trusted<V> {
        TrustedFuture() {
        }

        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @CanIgnoreReturnValue
        @ParametricNullness
        public final V get() throws InterruptedException, ExecutionException {
            return super.get();
        }

        public final boolean isCancelled() {
            return super.isCancelled();
        }

        public final boolean isDone() {
            return super.isDone();
        }

        @CanIgnoreReturnValue
        @ParametricNullness
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return super.get(j, timeUnit);
        }
    }

    FluentFuture() {
    }

    /* renamed from: G */
    public static <V> FluentFuture<V> m74178G(ListenableFuture<V> listenableFuture) {
        if (listenableFuture instanceof FluentFuture) {
            return (FluentFuture) listenableFuture;
        }
        return new ForwardingFluentFuture(listenableFuture);
    }
}

package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;

@GwtCompatible
@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {

        /* renamed from: a */
        private final ListenableFuture<V> f53570a;

        protected SimpleForwardingListenableFuture(ListenableFuture<V> listenableFuture) {
            this.f53570a = (ListenableFuture) Preconditions.m5392s(listenableFuture);
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public final ListenableFuture<V> mo61800R() {
            return this.f53570a;
        }
    }

    protected ForwardingListenableFuture() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public abstract ListenableFuture<? extends V> mo61800R();

    public void addListener(Runnable runnable, Executor executor) {
        mo61800R().addListener(runnable, executor);
    }
}

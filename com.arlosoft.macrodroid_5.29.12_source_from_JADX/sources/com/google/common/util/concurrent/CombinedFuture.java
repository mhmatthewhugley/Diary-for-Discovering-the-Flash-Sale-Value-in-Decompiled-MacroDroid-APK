package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CombinedFuture<V> extends AggregateFuture<Object, V> {
    /* access modifiers changed from: private */

    /* renamed from: E */
    public CombinedFuture<V>.CombinedFutureInterruptibleTask<?> f53534E;

    private final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {
        private final AsyncCallable<V> callable;
        final /* synthetic */ CombinedFuture this$0;

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo61712f() {
            return this.callable.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public ListenableFuture<V> mo61711e() throws Exception {
            return (ListenableFuture) Preconditions.m5394u(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo61713h(ListenableFuture<V> listenableFuture) {
            this.this$0.mo61564E(listenableFuture);
        }
    }

    private final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final Callable<V> callable;
        final /* synthetic */ CombinedFuture this$0;

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: e */
        public V mo61711e() throws Exception {
            return this.callable.call();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo61712f() {
            return this.callable.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo61713h(@ParametricNullness V v) {
            this.this$0.mo61562C(v);
        }
    }

    private abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {
        private final Executor listenerExecutor;
        final /* synthetic */ CombinedFuture this$0;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo61716a(Throwable th) {
            CombinedFutureInterruptibleTask unused = this.this$0.f53534E = null;
            if (th instanceof ExecutionException) {
                this.this$0.mo61563D(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                this.this$0.cancel(false);
            } else {
                this.this$0.mo61563D(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo61717b(@ParametricNullness T t) {
            CombinedFutureInterruptibleTask unused = this.this$0.f53534E = null;
            mo61713h(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo61718d() {
            return this.this$0.isDone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract void mo61713h(@ParametricNullness T t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo61645G(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo61645G(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.f53534E = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo61573x() {
        CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.f53534E;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.mo61834c();
        }
    }
}

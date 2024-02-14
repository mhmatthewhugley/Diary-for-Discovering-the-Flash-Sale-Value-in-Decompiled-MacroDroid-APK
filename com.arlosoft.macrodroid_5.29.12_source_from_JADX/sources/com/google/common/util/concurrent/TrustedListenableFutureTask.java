package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {

    /* renamed from: s */
    private volatile InterruptibleTask<?> f53704s;

    private final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {
        private final AsyncCallable<V> callable;
        final /* synthetic */ TrustedListenableFutureTask this$0;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61716a(Throwable th) {
            this.this$0.mo61563D(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo61718d() {
            return this.this$0.isDone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo61712f() {
            return this.callable.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo61717b(ListenableFuture<V> listenableFuture) {
            this.this$0.mo61564E(listenableFuture);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public ListenableFuture<V> mo61711e() throws Exception {
            return (ListenableFuture) Preconditions.m5394u(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }
    }

    private final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        private final Callable<V> callable;

        TrustedFutureInterruptibleTask(Callable<V> callable2) {
            this.callable = (Callable) Preconditions.m5392s(callable2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61716a(Throwable th) {
            TrustedListenableFutureTask.this.mo61563D(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo61717b(@ParametricNullness V v) {
            TrustedListenableFutureTask.this.mo61562C(v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo61718d() {
            return TrustedListenableFutureTask.this.isDone();
        }

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
    }

    TrustedListenableFutureTask(Callable<V> callable) {
        this.f53704s = new TrustedFutureInterruptibleTask(callable);
    }

    /* renamed from: H */
    static <V> TrustedListenableFutureTask<V> m74349H(Runnable runnable, @ParametricNullness V v) {
        return new TrustedListenableFutureTask<>(Executors.callable(runnable, v));
    }

    /* renamed from: I */
    static <V> TrustedListenableFutureTask<V> m74350I(Callable<V> callable) {
        return new TrustedListenableFutureTask<>(callable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo61544m() {
        InterruptibleTask<?> interruptibleTask;
        super.mo61544m();
        if (mo61565F() && (interruptibleTask = this.f53704s) != null) {
            interruptibleTask.mo61834c();
        }
        this.f53704s = null;
    }

    public void run() {
        InterruptibleTask<?> interruptibleTask = this.f53704s;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.f53704s = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo61546z() {
        InterruptibleTask<?> interruptibleTask = this.f53704s;
        if (interruptibleTask == null) {
            return super.mo61546z();
        }
        String valueOf = String.valueOf(interruptibleTask);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}

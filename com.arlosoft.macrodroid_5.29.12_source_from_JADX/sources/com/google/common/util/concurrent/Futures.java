package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* renamed from: com.google.common.util.concurrent.Futures$1 */
    class C110031 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Future f53571a;

        public void run() {
            this.f53571a.cancel(false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$2 */
    class C110042 implements Future<Object> {

        /* renamed from: a */
        final /* synthetic */ Future f53572a;

        /* renamed from: c */
        final /* synthetic */ Function f53573c;

        /* renamed from: a */
        private Object m74213a(Object obj) throws ExecutionException {
            try {
                return this.f53573c.apply(obj);
            } catch (Throwable th) {
                throw new ExecutionException(th);
            }
        }

        public boolean cancel(boolean z) {
            return this.f53572a.cancel(z);
        }

        public Object get() throws InterruptedException, ExecutionException {
            return m74213a(this.f53572a.get());
        }

        public boolean isCancelled() {
            return this.f53572a.isCancelled();
        }

        public boolean isDone() {
            return this.f53572a.isDone();
        }

        public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return m74213a(this.f53572a.get(j, timeUnit));
        }
    }

    /* renamed from: com.google.common.util.concurrent.Futures$3 */
    class C110053 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InCompletionOrderState f53574a;

        /* renamed from: c */
        final /* synthetic */ ImmutableList f53575c;

        /* renamed from: d */
        final /* synthetic */ int f53576d;

        public void run() {
            this.f53574a.m74222f(this.f53575c, this.f53576d);
        }
    }

    private static final class CallbackListener<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f53577a;

        /* renamed from: c */
        final FutureCallback<? super V> f53578c;

        public void run() {
            Throwable a;
            Future<V> future = this.f53577a;
            if (!(future instanceof InternalFutureFailureAccess) || (a = InternalFutures.m74373a((InternalFutureFailureAccess) future)) == null) {
                try {
                    this.f53578c.mo61664b(Futures.m74207a(this.f53577a));
                } catch (ExecutionException e) {
                    this.f53578c.mo61663a(e.getCause());
                } catch (Error | RuntimeException e2) {
                    this.f53578c.mo61663a(e2);
                }
            } else {
                this.f53578c.mo61663a(a);
            }
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22196k(this.f53578c).toString();
        }
    }

    @GwtCompatible
    @CanIgnoreReturnValue
    @Beta
    public static final class FutureCombiner<V> {

        /* renamed from: com.google.common.util.concurrent.Futures$FutureCombiner$1 */
        class C110061 implements Callable<Void> {

            /* renamed from: a */
            final /* synthetic */ Runnable f53579a;

            /* renamed from: a */
            public Void call() throws Exception {
                this.f53579a.run();
                return null;
            }
        }
    }

    private static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {

        /* renamed from: s */
        private InCompletionOrderState<T> f53580s;

        public boolean cancel(boolean z) {
            InCompletionOrderState<T> inCompletionOrderState = this.f53580s;
            if (!super.cancel(z)) {
                return false;
            }
            Objects.requireNonNull(inCompletionOrderState);
            inCompletionOrderState.m74223g(z);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo61544m() {
            this.f53580s = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public String mo61546z() {
            InCompletionOrderState<T> inCompletionOrderState = this.f53580s;
            if (inCompletionOrderState == null) {
                return null;
            }
            int length = inCompletionOrderState.f53584d.length;
            int i = inCompletionOrderState.f53583c.get();
            StringBuilder sb = new StringBuilder(49);
            sb.append("inputCount=[");
            sb.append(length);
            sb.append("], remaining=[");
            sb.append(i);
            sb.append("]");
            return sb.toString();
        }
    }

    private static final class InCompletionOrderState<T> {

        /* renamed from: a */
        private boolean f53581a;

        /* renamed from: b */
        private boolean f53582b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final AtomicInteger f53583c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ListenableFuture<? extends T>[] f53584d;

        /* renamed from: e */
        private volatile int f53585e;

        /* renamed from: e */
        private void m74221e() {
            if (this.f53583c.decrementAndGet() == 0 && this.f53581a) {
                for (ListenableFuture<? extends T> listenableFuture : this.f53584d) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.f53582b);
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m74222f(ImmutableList<AbstractFuture<T>> immutableList, int i) {
            ListenableFuture<? extends T> listenableFuture = this.f53584d[i];
            Objects.requireNonNull(listenableFuture);
            ListenableFuture listenableFuture2 = listenableFuture;
            this.f53584d[i] = null;
            for (int i2 = this.f53585e; i2 < immutableList.size(); i2++) {
                if (immutableList.get(i2).mo61564E(listenableFuture2)) {
                    m74221e();
                    this.f53585e = i2 + 1;
                    return;
                }
            }
            this.f53585e = immutableList.size();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m74223g(boolean z) {
            this.f53581a = true;
            if (!z) {
                this.f53582b = false;
            }
            m74221e();
        }
    }

    private static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {

        /* renamed from: s */
        private ListenableFuture<V> f53586s;

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo61544m() {
            this.f53586s = null;
        }

        public void run() {
            ListenableFuture<V> listenableFuture = this.f53586s;
            if (listenableFuture != null) {
                mo61564E(listenableFuture);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public String mo61546z() {
            ListenableFuture<V> listenableFuture = this.f53586s;
            if (listenableFuture == null) {
                return null;
            }
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 11);
            sb.append("delegate=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
    }

    private Futures() {
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    /* renamed from: a */
    public static <V> V m74207a(Future<V> future) throws ExecutionException {
        Preconditions.m5372C(future.isDone(), "Future was expected to be done: %s", future);
        return Uninterruptibles.m74365a(future);
    }

    /* renamed from: b */
    public static <V> ListenableFuture<V> m74208b() {
        ImmediateFuture.ImmediateCancelledFuture<Object> immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.f53595s;
        if (immediateCancelledFuture != null) {
            return immediateCancelledFuture;
        }
        return new ImmediateFuture.ImmediateCancelledFuture();
    }

    /* renamed from: c */
    public static <V> ListenableFuture<V> m74209c(Throwable th) {
        Preconditions.m5392s(th);
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    /* renamed from: d */
    public static <V> ListenableFuture<V> m74210d(@ParametricNullness V v) {
        if (v == null) {
            return ImmediateFuture.f53592c;
        }
        return new ImmediateFuture(v);
    }

    /* renamed from: e */
    public static ListenableFuture<Void> m74211e() {
        return ImmediateFuture.f53592c;
    }

    @Beta
    /* renamed from: f */
    public static <I, O> ListenableFuture<O> m74212f(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        return AbstractTransformFuture.m74031H(listenableFuture, function, executor);
    }
}

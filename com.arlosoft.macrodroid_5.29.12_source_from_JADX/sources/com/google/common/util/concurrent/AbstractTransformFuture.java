package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.google.errorprone.annotations.ForOverride;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {

    /* renamed from: s */
    ListenableFuture<? extends I> f53446s;

    /* renamed from: z */
    F f53447z;

    private static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public ListenableFuture<? extends O> mo61639I(AsyncFunction<? super I, ? extends O> asyncFunction, @ParametricNullness I i) throws Exception {
            ListenableFuture<? extends O> apply = asyncFunction.apply(i);
            Preconditions.m5394u(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public void mo61640J(ListenableFuture<? extends O> listenableFuture) {
            mo61564E(listenableFuture);
        }
    }

    private static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        TransformFuture(ListenableFuture<? extends I> listenableFuture, Function<? super I, ? extends O> function) {
            super(listenableFuture, function);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo61640J(@ParametricNullness O o) {
            mo61562C(o);
        }

        /* access modifiers changed from: package-private */
        @ParametricNullness
        /* renamed from: K */
        public O mo61639I(Function<? super I, ? extends O> function, @ParametricNullness I i) {
            return function.apply(i);
        }
    }

    AbstractTransformFuture(ListenableFuture<? extends I> listenableFuture, F f) {
        this.f53446s = (ListenableFuture) Preconditions.m5392s(listenableFuture);
        this.f53447z = Preconditions.m5392s(f);
    }

    /* renamed from: H */
    static <I, O> ListenableFuture<O> m74031H(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.m5392s(function);
        TransformFuture transformFuture = new TransformFuture(listenableFuture, function);
        listenableFuture.addListener(transformFuture, MoreExecutors.m74263e(executor, transformFuture));
        return transformFuture;
    }

    /* access modifiers changed from: package-private */
    @ForOverride
    @ParametricNullness
    /* renamed from: I */
    public abstract T mo61639I(F f, @ParametricNullness I i) throws Exception;

    /* access modifiers changed from: package-private */
    @ForOverride
    /* renamed from: J */
    public abstract void mo61640J(@ParametricNullness T t);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo61544m() {
        mo61574y(this.f53446s);
        this.f53446s = null;
        this.f53447z = null;
    }

    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.f53446s;
        F f = this.f53447z;
        boolean z = true;
        boolean isCancelled = isCancelled() | (listenableFuture == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f53446s = null;
            if (listenableFuture.isCancelled()) {
                mo61564E(listenableFuture);
                return;
            }
            try {
                try {
                    Object I = mo61639I(f, Futures.m74207a(listenableFuture));
                    this.f53447z = null;
                    mo61640J(I);
                } catch (Throwable th) {
                    this.f53447z = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                mo61563D(e.getCause());
            } catch (RuntimeException e2) {
                mo61563D(e2);
            } catch (Error e3) {
                mo61563D(e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo61546z() {
        String str;
        ListenableFuture<? extends I> listenableFuture = this.f53446s;
        F f = this.f53447z;
        String z = super.mo61546z();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            String valueOf2 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + valueOf2.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (z == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            return z.length() != 0 ? valueOf3.concat(z) : new String(valueOf3);
        }
    }
}

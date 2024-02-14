package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class JdkFutureAdapters {

    private static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

        /* renamed from: g */
        private static final ThreadFactory f53598g;

        /* renamed from: o */
        private static final Executor f53599o;

        /* renamed from: a */
        private final Executor f53600a;

        /* renamed from: c */
        private final ExecutionList f53601c;

        /* renamed from: d */
        private final AtomicBoolean f53602d;

        /* renamed from: f */
        private final Future<V> f53603f;

        static {
            ThreadFactory b = new ThreadFactoryBuilder().mo61914e(true).mo61915f("ListenableFutureAdapter-thread-%d").mo61913b();
            f53598g = b;
            f53599o = Executors.newCachedThreadPool(b);
        }

        /* access modifiers changed from: private */
        /* renamed from: V */
        public /* synthetic */ void m74240V() {
            try {
                Uninterruptibles.m74365a(this.f53603f);
            } catch (Throwable unused) {
            }
            this.f53601c.mo61749b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public Future<V> mo22325Q() {
            return this.f53603f;
        }

        public void addListener(Runnable runnable, Executor executor) {
            this.f53601c.mo61748a(runnable, executor);
            if (!this.f53602d.compareAndSet(false, true)) {
                return;
            }
            if (this.f53603f.isDone()) {
                this.f53601c.mo61749b();
            } else {
                this.f53600a.execute(new C11029c(this));
            }
        }
    }

    private JdkFutureAdapters() {
    }
}

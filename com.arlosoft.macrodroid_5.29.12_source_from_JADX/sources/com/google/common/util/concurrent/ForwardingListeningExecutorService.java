package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@CanIgnoreReturnValue
public abstract class ForwardingListeningExecutorService extends ForwardingExecutorService implements ListeningExecutorService {
    protected ForwardingListeningExecutorService() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public abstract ListeningExecutorService mo61786R();

    public <T> ListenableFuture<T> submit(Callable<T> callable) {
        return mo61786R().submit(callable);
    }

    public ListenableFuture<?> submit(Runnable runnable) {
        return mo61786R().submit(runnable);
    }

    public <T> ListenableFuture<T> submit(Runnable runnable, @ParametricNullness T t) {
        return mo61786R().submit(runnable, t);
    }
}

package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@DoNotMock
public interface ListeningExecutorService extends ExecutorService {
    ListenableFuture<?> submit(Runnable runnable);

    <T> ListenableFuture<T> submit(Runnable runnable, @ParametricNullness T t);

    <T> ListenableFuture<T> submit(Callable<T> callable);
}

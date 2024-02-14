package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Uninterruptibles {
    private Uninterruptibles() {
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    /* renamed from: a */
    public static <V> V m74365a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @ParametricNullness
    /* renamed from: b */
    public static <V> V m74366b(Future<V> future, long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        long nanos;
        V v;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                v = future.get(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return v;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}

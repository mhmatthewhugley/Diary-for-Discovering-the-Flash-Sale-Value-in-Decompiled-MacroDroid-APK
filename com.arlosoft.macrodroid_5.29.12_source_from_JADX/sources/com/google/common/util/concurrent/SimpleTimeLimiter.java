package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@Beta
public final class SimpleTimeLimiter implements TimeLimiter {

    /* renamed from: a */
    private final ExecutorService f53678a;

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1 */
    class C110221 implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Object f53679a;

        /* renamed from: b */
        final /* synthetic */ long f53680b;

        /* renamed from: c */
        final /* synthetic */ TimeUnit f53681c;

        /* renamed from: d */
        final /* synthetic */ Set f53682d;

        /* renamed from: e */
        final /* synthetic */ SimpleTimeLimiter f53683e;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ Object m74334b(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e) {
                throw SimpleTimeLimiter.m74332e(e, false);
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            return this.f53683e.m74330c(new C11030d(method, this.f53679a, objArr), this.f53680b, this.f53681c, this.f53682d.contains(method));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public <T> T m74330c(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
        Preconditions.m5392s(callable);
        Preconditions.m5392s(timeUnit);
        m74331d(j);
        Future<T> submit = this.f53678a.submit(callable);
        if (!z) {
            return Uninterruptibles.m74366b(submit, j, timeUnit);
        }
        try {
            return submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            throw m74332e(e2, true);
        } catch (TimeoutException e3) {
            submit.cancel(true);
            throw new UncheckedTimeoutException(e3);
        }
    }

    /* renamed from: d */
    private static void m74331d(long j) {
        Preconditions.m5383j(j > 0, "timeout must be positive: %s", j);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static Exception m74332e(Exception exc, boolean z) throws Exception {
        Throwable cause = exc.getCause();
        if (cause != null) {
            if (z) {
                cause.setStackTrace((StackTraceElement[]) ObjectArrays.m28468d(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
            }
            if (cause instanceof Exception) {
                throw ((Exception) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw exc;
            }
        } else {
            throw exc;
        }
    }
}

package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Callables {
    private Callables() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m74054c(Supplier supplier, Callable callable) throws Exception {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean g = m74058g((String) supplier.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (g) {
                m74058g(name, currentThread);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m74055d(Supplier supplier, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean g = m74058g((String) supplier.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (g) {
                m74058g(name, currentThread);
            }
        }
    }

    @GwtIncompatible
    /* renamed from: e */
    static Runnable m74056e(Runnable runnable, Supplier<String> supplier) {
        Preconditions.m5392s(supplier);
        Preconditions.m5392s(runnable);
        return new C11027a(supplier, runnable);
    }

    @GwtIncompatible
    /* renamed from: f */
    static <T> Callable<T> m74057f(Callable<T> callable, Supplier<String> supplier) {
        Preconditions.m5392s(supplier);
        Preconditions.m5392s(callable);
        return new C11028b(supplier, callable);
    }

    @GwtIncompatible
    /* renamed from: g */
    private static boolean m74058g(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}

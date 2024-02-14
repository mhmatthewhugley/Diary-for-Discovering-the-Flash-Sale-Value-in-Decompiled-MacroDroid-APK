package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@CanIgnoreReturnValue
public final class ThreadFactoryBuilder {

    /* renamed from: a */
    private String f53690a = null;

    /* renamed from: b */
    private Boolean f53691b = null;

    /* renamed from: c */
    private Integer f53692c = null;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f53693d = null;

    /* renamed from: e */
    private ThreadFactory f53694e = null;

    /* renamed from: c */
    private static ThreadFactory m74339c(ThreadFactoryBuilder threadFactoryBuilder) {
        final String str = threadFactoryBuilder.f53690a;
        final Boolean bool = threadFactoryBuilder.f53691b;
        final Integer num = threadFactoryBuilder.f53692c;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadFactoryBuilder.f53693d;
        ThreadFactory threadFactory = threadFactoryBuilder.f53694e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        final ThreadFactory threadFactory2 = threadFactory;
        final AtomicLong atomicLong = str != null ? new AtomicLong(0) : null;
        return new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory2.newThread(runnable);
                String str = str;
                if (str != null) {
                    AtomicLong atomicLong = atomicLong;
                    Objects.requireNonNull(atomicLong);
                    AtomicLong atomicLong2 = atomicLong;
                    newThread.setName(ThreadFactoryBuilder.m74340d(str, Long.valueOf(atomicLong.getAndIncrement())));
                }
                Boolean bool = bool;
                if (bool != null) {
                    newThread.setDaemon(bool.booleanValue());
                }
                Integer num = num;
                if (num != null) {
                    newThread.setPriority(num.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = uncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return newThread;
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m74340d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    @CheckReturnValue
    /* renamed from: b */
    public ThreadFactory mo61913b() {
        return m74339c(this);
    }

    /* renamed from: e */
    public ThreadFactoryBuilder mo61914e(boolean z) {
        this.f53691b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public ThreadFactoryBuilder mo61915f(String str) {
        m74340d(str, 0);
        this.f53690a = str;
        return this;
    }
}

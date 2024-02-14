package com.google.common.p206io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
/* renamed from: com.google.common.io.Closer */
public final class Closer implements Closeable {

    /* renamed from: f */
    private static final Suppressor f52979f;
    @VisibleForTesting

    /* renamed from: a */
    final Suppressor f52980a;

    /* renamed from: c */
    private final Deque<Closeable> f52981c = new ArrayDeque(4);

    /* renamed from: d */
    private Throwable f52982d;

    @VisibleForTesting
    /* renamed from: com.google.common.io.Closer$LoggingSuppressor */
    static final class LoggingSuppressor implements Suppressor {

        /* renamed from: a */
        static final LoggingSuppressor f52983a = new LoggingSuppressor();

        LoggingSuppressor() {
        }

        /* renamed from: a */
        public void mo61081a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = Closeables.f52978a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(closeable);
            StringBuilder sb = new StringBuilder(valueOf.length() + 42);
            sb.append("Suppressing exception thrown when closing ");
            sb.append(valueOf);
            logger.log(level, sb.toString(), th2);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.common.io.Closer$SuppressingSuppressor */
    static final class SuppressingSuppressor implements Suppressor {

        /* renamed from: a */
        private final Method f52984a;

        private SuppressingSuppressor(Method method) {
            this.f52984a = method;
        }

        /* renamed from: b */
        static SuppressingSuppressor m73433b() {
            try {
                return new SuppressingSuppressor(Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class}));
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public void mo61081a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    this.f52984a.invoke(th, new Object[]{th2});
                } catch (Throwable unused) {
                    LoggingSuppressor.f52983a.mo61081a(closeable, th, th2);
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.common.io.Closer$Suppressor */
    interface Suppressor {
        /* renamed from: a */
        void mo61081a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        Suppressor b = SuppressingSuppressor.m73433b();
        if (b == null) {
            b = LoggingSuppressor.f52983a;
        }
        f52979f = b;
    }

    @VisibleForTesting
    Closer(Suppressor suppressor) {
        this.f52980a = (Suppressor) Preconditions.m5392s(suppressor);
    }

    /* renamed from: b */
    public static Closer m73429b() {
        return new Closer(f52979f);
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    /* renamed from: c */
    public <C extends Closeable> C mo61078c(@ParametricNullness C c) {
        if (c != null) {
            this.f52981c.addFirst(c);
        }
        return c;
    }

    public void close() throws IOException {
        Throwable th = this.f52982d;
        while (!this.f52981c.isEmpty()) {
            Closeable removeFirst = this.f52981c.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f52980a.mo61081a(removeFirst, th, th2);
                }
            }
        }
        if (this.f52982d == null && th != null) {
            Throwables.m5491n(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    /* renamed from: e */
    public RuntimeException mo61080e(Throwable th) throws IOException {
        Preconditions.m5392s(th);
        this.f52982d = th;
        Throwables.m5491n(th, IOException.class);
        throw new RuntimeException(th);
    }
}

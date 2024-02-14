package com.google.common.util.concurrent;

import androidx.concurrent.futures.C0320a;
import com.google.android.gms.internal.ads.C10440a;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

@GwtCompatible
@ReflectionSupport
@ElementTypesAreNonnullByDefault
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {

    /* renamed from: f */
    static final boolean f53349f;

    /* renamed from: g */
    private static final Logger f53350g = Logger.getLogger(AbstractFuture.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final AtomicHelper f53351o;

    /* renamed from: p */
    private static final Object f53352p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile Object f53353a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile Listener f53354c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile Waiter f53355d;

    private static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo61575a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo61576b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo61577c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Listener mo61578d(AbstractFuture<?> abstractFuture, Listener listener);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract Waiter mo61579e(AbstractFuture<?> abstractFuture, Waiter waiter);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract void mo61580f(Waiter waiter, Waiter waiter2);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract void mo61581g(Waiter waiter, Thread thread);
    }

    private static final class Cancellation {

        /* renamed from: c */
        static final Cancellation f53356c;

        /* renamed from: d */
        static final Cancellation f53357d;

        /* renamed from: a */
        final boolean f53358a;

        /* renamed from: b */
        final Throwable f53359b;

        static {
            if (AbstractFuture.f53349f) {
                f53357d = null;
                f53356c = null;
                return;
            }
            f53357d = new Cancellation(false, (Throwable) null);
            f53356c = new Cancellation(true, (Throwable) null);
        }

        Cancellation(boolean z, Throwable th) {
            this.f53358a = z;
            this.f53359b = th;
        }
    }

    private static final class Failure {

        /* renamed from: b */
        static final Failure f53360b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        final Throwable f53361a;

        Failure(Throwable th) {
            this.f53361a = (Throwable) Preconditions.m5392s(th);
        }
    }

    private static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<Waiter, Thread> f53366a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<Waiter, Waiter> f53367b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> f53368c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractFuture, Listener> f53369d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> f53370e;

        SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f53366a = atomicReferenceFieldUpdater;
            this.f53367b = atomicReferenceFieldUpdater2;
            this.f53368c = atomicReferenceFieldUpdater3;
            this.f53369d = atomicReferenceFieldUpdater4;
            this.f53370e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo61575a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return C0320a.m383a(this.f53369d, abstractFuture, listener, listener2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo61576b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C0320a.m383a(this.f53370e, abstractFuture, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo61577c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return C0320a.m383a(this.f53368c, abstractFuture, waiter, waiter2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Listener mo61578d(AbstractFuture<?> abstractFuture, Listener listener) {
            return this.f53369d.getAndSet(abstractFuture, listener);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Waiter mo61579e(AbstractFuture<?> abstractFuture, Waiter waiter) {
            return this.f53368c.getAndSet(abstractFuture, waiter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo61580f(Waiter waiter, Waiter waiter2) {
            this.f53367b.lazySet(waiter, waiter2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo61581g(Waiter waiter, Thread thread) {
            this.f53366a.lazySet(waiter, thread);
        }
    }

    private static final class SetFuture<V> implements Runnable {

        /* renamed from: a */
        final AbstractFuture<V> f53371a;

        /* renamed from: c */
        final ListenableFuture<? extends V> f53372c;

        SetFuture(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
            this.f53371a = abstractFuture;
            this.f53372c = listenableFuture;
        }

        public void run() {
            if (this.f53371a.f53353a == this) {
                if (AbstractFuture.f53351o.mo61576b(this.f53371a, this, AbstractFuture.m73923v(this.f53372c))) {
                    AbstractFuture.m73920s(this.f53371a);
                }
            }
        }
    }

    private static final class SynchronizedHelper extends AtomicHelper {
        private SynchronizedHelper() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo61575a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f53354c != listener) {
                    return false;
                }
                Listener unused = abstractFuture.f53354c = listener2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo61576b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f53353a != obj) {
                    return false;
                }
                Object unused = abstractFuture.f53353a = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo61577c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f53355d != waiter) {
                    return false;
                }
                Waiter unused = abstractFuture.f53355d = waiter2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Listener mo61578d(AbstractFuture<?> abstractFuture, Listener listener) {
            Listener g;
            synchronized (abstractFuture) {
                g = abstractFuture.f53354c;
                if (g != listener) {
                    Listener unused = abstractFuture.f53354c = listener;
                }
            }
            return g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Waiter mo61579e(AbstractFuture<?> abstractFuture, Waiter waiter) {
            Waiter i;
            synchronized (abstractFuture) {
                i = abstractFuture.f53355d;
                if (i != waiter) {
                    Waiter unused = abstractFuture.f53355d = waiter;
                }
            }
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo61580f(Waiter waiter, Waiter waiter2) {
            waiter.f53381b = waiter2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo61581g(Waiter waiter, Thread thread) {
            waiter.f53380a = thread;
        }
    }

    interface Trusted<V> extends ListenableFuture<V> {
    }

    static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        TrustedFuture() {
        }

        public final void addListener(Runnable runnable, Executor executor) {
            AbstractFuture.super.addListener(runnable, executor);
        }

        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return AbstractFuture.super.cancel(z);
        }

        @CanIgnoreReturnValue
        @ParametricNullness
        public final V get() throws InterruptedException, ExecutionException {
            return AbstractFuture.super.get();
        }

        public final boolean isCancelled() {
            return AbstractFuture.super.isCancelled();
        }

        public final boolean isDone() {
            return AbstractFuture.super.isDone();
        }

        @CanIgnoreReturnValue
        @ParametricNullness
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return AbstractFuture.super.get(j, timeUnit);
        }
    }

    private static final class UnsafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        static final Unsafe f53373a;

        /* renamed from: b */
        static final long f53374b;

        /* renamed from: c */
        static final long f53375c;

        /* renamed from: d */
        static final long f53376d;

        /* renamed from: e */
        static final long f53377e;

        /* renamed from: f */
        static final long f53378f;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.C109561());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = com.google.common.util.concurrent.AbstractFuture.Waiter.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1 r1 = new com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r2 = com.google.common.util.concurrent.AbstractFuture.class
                java.lang.String r3 = "d"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f53375c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "c"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f53374b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "a"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f53376d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f53377e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f53378f = r2     // Catch:{ Exception -> 0x0053 }
                f53373a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                com.google.common.base.Throwables.m5493p(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.<clinit>():void");
        }

        private UnsafeAtomicHelper() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo61575a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return C10440a.m40893a(f53373a, abstractFuture, f53374b, listener, listener2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo61576b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C10440a.m40893a(f53373a, abstractFuture, f53376d, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo61577c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return C10440a.m40893a(f53373a, abstractFuture, f53375c, waiter, waiter2);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: d */
        com.google.common.util.concurrent.AbstractFuture.Listener mo61578d(com.google.common.util.concurrent.AbstractFuture<?> r3, com.google.common.util.concurrent.AbstractFuture.Listener r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.AbstractFuture$Listener r0 = r3.f53354c
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.mo61575a(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.mo61578d(com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture$Listener):com.google.common.util.concurrent.AbstractFuture$Listener");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: e */
        com.google.common.util.concurrent.AbstractFuture.Waiter mo61579e(com.google.common.util.concurrent.AbstractFuture<?> r3, com.google.common.util.concurrent.AbstractFuture.Waiter r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r3.f53355d
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.mo61577c(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.mo61579e(com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture$Waiter):com.google.common.util.concurrent.AbstractFuture$Waiter");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo61580f(Waiter waiter, Waiter waiter2) {
            f53373a.putObject(waiter, f53378f, waiter2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo61581g(Waiter waiter, Thread thread) {
            f53373a.putObject(waiter, f53377e, thread);
        }
    }

    private static final class Waiter {

        /* renamed from: c */
        static final Waiter f53379c = new Waiter(false);

        /* renamed from: a */
        volatile Thread f53380a;

        /* renamed from: b */
        volatile Waiter f53381b;

        Waiter() {
            AbstractFuture.f53351o.mo61581g(this, Thread.currentThread());
        }

        Waiter(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61586a(Waiter waiter) {
            AbstractFuture.f53351o.mo61580f(this, waiter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo61587b() {
            Thread thread = this.f53380a;
            if (thread != null) {
                this.f53380a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        boolean z;
        AtomicHelper atomicHelper;
        Class<Waiter> cls = Waiter.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f53349f = z;
        Throwable th = null;
        try {
            atomicHelper = new UnsafeAtomicHelper();
            th = null;
        } catch (Throwable th2) {
            atomicHelper = new SynchronizedHelper();
            th = th2;
        }
        f53351o = atomicHelper;
        Class<LockSupport> cls2 = LockSupport.class;
        if (th != null) {
            Logger logger = f53350g;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    protected AbstractFuture() {
    }

    /* renamed from: A */
    private void m73903A() {
        for (Waiter e = f53351o.mo61579e(this, Waiter.f53379c); e != null; e = e.f53381b) {
            e.mo61587b();
        }
    }

    /* renamed from: B */
    private void m73904B(Waiter waiter) {
        waiter.f53380a = null;
        while (true) {
            Waiter waiter2 = this.f53355d;
            if (waiter2 != Waiter.f53379c) {
                Waiter waiter3 = null;
                while (waiter2 != null) {
                    Waiter waiter4 = waiter2.f53381b;
                    if (waiter2.f53380a != null) {
                        waiter3 = waiter2;
                    } else if (waiter3 != null) {
                        waiter3.f53381b = waiter4;
                        if (waiter3.f53380a == null) {
                        }
                    } else if (!f53351o.mo61577c(this, waiter2, waiter4)) {
                    }
                    waiter2 = waiter4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: k */
    private void m73914k(StringBuilder sb) {
        try {
            Object w = m73924w(this);
            sb.append("SUCCESS, result=[");
            m73916n(sb, w);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: l */
    private void m73915l(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f53353a;
        if (obj instanceof SetFuture) {
            sb.append(", setFuture=[");
            m73917o(sb, ((SetFuture) obj).f53372c);
            sb.append("]");
        } else {
            try {
                str = Strings.m5471a(mo61546z());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(valueOf);
                str = sb2.toString();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m73914k(sb);
        }
    }

    /* renamed from: n */
    private void m73916n(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: o */
    private void m73917o(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: p */
    private static CancellationException m73918p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: r */
    private Listener m73919r(Listener listener) {
        Listener listener2 = listener;
        Listener d = f53351o.mo61578d(this, Listener.f53362d);
        while (d != null) {
            Listener listener3 = d.f53365c;
            d.f53365c = listener2;
            listener2 = d;
            d = listener3;
        }
        return listener2;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static void m73920s(AbstractFuture<?> abstractFuture) {
        Listener listener = null;
        AbstractFuture<V> abstractFuture2 = abstractFuture;
        while (true) {
            abstractFuture2.m73903A();
            abstractFuture2.mo61544m();
            Listener r = abstractFuture2.m73919r(listener);
            while (true) {
                if (r != null) {
                    listener = r.f53365c;
                    Runnable runnable = r.f53363a;
                    Objects.requireNonNull(runnable);
                    Runnable runnable2 = runnable;
                    if (runnable2 instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable2;
                        AbstractFuture<V> abstractFuture3 = setFuture.f53371a;
                        if (abstractFuture3.f53353a == setFuture) {
                            if (f53351o.mo61576b(abstractFuture3, setFuture, m73923v(setFuture.f53372c))) {
                                abstractFuture2 = abstractFuture3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = r.f53364b;
                        Objects.requireNonNull(executor);
                        m73921t(runnable2, executor);
                    }
                    r = listener;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private static void m73921t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f53350g;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e);
        }
    }

    @ParametricNullness
    /* renamed from: u */
    private V m73922u(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            throw m73918p("Task was cancelled.", ((Cancellation) obj).f53359b);
        } else if (!(obj instanceof Failure)) {
            return obj == f53352p ? NullnessCasts.m74278b() : obj;
        } else {
            throw new ExecutionException(((Failure) obj).f53361a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static Object m73923v(ListenableFuture<?> listenableFuture) {
        Throwable a;
        if (listenableFuture instanceof Trusted) {
            Object obj = ((AbstractFuture) listenableFuture).f53353a;
            if (obj instanceof Cancellation) {
                Cancellation cancellation = (Cancellation) obj;
                if (cancellation.f53358a) {
                    obj = cancellation.f53359b != null ? new Cancellation(false, cancellation.f53359b) : Cancellation.f53357d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((listenableFuture instanceof InternalFutureFailureAccess) && (a = InternalFutures.m74373a((InternalFutureFailureAccess) listenableFuture)) != null) {
            return new Failure(a);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!f53349f) && isCancelled) {
                Cancellation cancellation2 = Cancellation.f53357d;
                Objects.requireNonNull(cancellation2);
                return cancellation2;
            }
            try {
                Object w = m73924w(listenableFuture);
                if (!isCancelled) {
                    return w == null ? f53352p : w;
                }
                String valueOf = String.valueOf(listenableFuture);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new Cancellation(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new Failure(e.getCause());
                }
                String valueOf2 = String.valueOf(listenableFuture);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new Cancellation(false, new IllegalArgumentException(sb2.toString(), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new Cancellation(false, e2);
                }
                String valueOf3 = String.valueOf(listenableFuture);
                StringBuilder sb3 = new StringBuilder(valueOf3.length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new Failure(new IllegalArgumentException(sb3.toString(), e2));
            } catch (Throwable th) {
                return new Failure(th);
            }
        }
    }

    @ParametricNullness
    /* renamed from: w */
    private static <V> V m73924w(Future<V> future) throws ExecutionException {
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

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: C */
    public boolean mo61562C(@ParametricNullness V v) {
        if (v == null) {
            v = f53352p;
        }
        if (!f53351o.mo61576b(this, (Object) null, v)) {
            return false;
        }
        m73920s(this);
        return true;
    }

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: D */
    public boolean mo61563D(Throwable th) {
        if (!f53351o.mo61576b(this, (Object) null, new Failure((Throwable) Preconditions.m5392s(th)))) {
            return false;
        }
        m73920s(this);
        return true;
    }

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: E */
    public boolean mo61564E(ListenableFuture<? extends V> listenableFuture) {
        SetFuture setFuture;
        Failure failure;
        Preconditions.m5392s(listenableFuture);
        Object obj = this.f53353a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f53351o.mo61576b(this, (Object) null, m73923v(listenableFuture))) {
                    return false;
                }
                m73920s(this);
                return true;
            }
            setFuture = new SetFuture(this, listenableFuture);
            if (f53351o.mo61576b(this, (Object) null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    failure = Failure.f53360b;
                }
                return true;
            }
            obj = this.f53353a;
        }
        if (obj instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) obj).f53358a);
        }
        return false;
        f53351o.mo61576b(this, setFuture, failure);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo61565F() {
        Object obj = this.f53353a;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f53358a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Throwable mo61566a() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.f53353a;
        if (obj instanceof Failure) {
            return ((Failure) obj).f53361a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        Listener listener;
        Preconditions.m5393t(runnable, "Runnable was null.");
        Preconditions.m5393t(executor, "Executor was null.");
        if (isDone() || (listener = this.f53354c) == Listener.f53362d) {
            m73921t(runnable, executor);
        }
        Listener listener2 = new Listener(runnable, executor);
        do {
            listener2.f53365c = listener;
            if (!f53351o.mo61575a(this, listener, listener2)) {
                listener = this.f53354c;
            } else {
                return;
            }
        } while (listener != Listener.f53362d);
        m73921t(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.ListenableFuture<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f53353a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = f53349f
            if (r3 == 0) goto L_0x001f
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = com.google.common.util.concurrent.AbstractFuture.Cancellation.f53356c
            goto L_0x0026
        L_0x0024:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = com.google.common.util.concurrent.AbstractFuture.Cancellation.f53357d
        L_0x0026:
            java.util.Objects.requireNonNull(r3)
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r6 = f53351o
            boolean r6 = r6.mo61576b(r4, r0, r3)
            if (r6 == 0) goto L_0x005c
            if (r8 == 0) goto L_0x0038
            r4.mo61573x()
        L_0x0038:
            m73920s(r4)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r4 == 0) goto L_0x0065
            com.google.common.util.concurrent.AbstractFuture$SetFuture r0 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.f53372c
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Trusted
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.common.util.concurrent.AbstractFuture r4 = (com.google.common.util.concurrent.AbstractFuture) r4
            java.lang.Object r0 = r4.f53353a
            if (r0 != 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0065
            r5 = 1
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
            goto L_0x0065
        L_0x005c:
            java.lang.Object r0 = r4.f53353a
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r6 != 0) goto L_0x002b
            r1 = r5
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.cancel(boolean):boolean");
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f53353a;
            if ((obj != null) && (!(obj instanceof SetFuture))) {
                return m73922u(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                Waiter waiter = this.f53355d;
                if (waiter != Waiter.f53379c) {
                    Waiter waiter2 = new Waiter();
                    do {
                        waiter2.mo61586a(waiter);
                        if (f53351o.mo61577c(this, waiter, waiter2)) {
                            do {
                                OverflowAvoidingLockSupport.m74279a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f53353a;
                                    if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                        return m73922u(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m73904B(waiter2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m73904B(waiter2);
                        } else {
                            waiter = this.f53355d;
                        }
                    } while (waiter != Waiter.f53379c);
                }
                Object obj3 = this.f53353a;
                Objects.requireNonNull(obj3);
                return m73922u(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f53353a;
                if ((obj4 != null) && (!(obj4 instanceof SetFuture))) {
                    return m73922u(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(abstractFuture).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(abstractFuture);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f53353a instanceof Cancellation;
    }

    public boolean isDone() {
        Object obj = this.f53353a;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    @ForOverride
    @Beta
    /* renamed from: m */
    public void mo61544m() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m73914k(sb);
        } else {
            m73915l(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo61573x() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo61574y(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo61565F());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo61546z() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    private static final class Listener {

        /* renamed from: d */
        static final Listener f53362d = new Listener();

        /* renamed from: a */
        final Runnable f53363a;

        /* renamed from: b */
        final Executor f53364b;

        /* renamed from: c */
        Listener f53365c;

        Listener(Runnable runnable, Executor executor) {
            this.f53363a = runnable;
            this.f53364b = executor;
        }

        Listener() {
            this.f53363a = null;
            this.f53364b = null;
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f53353a;
            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                return m73922u(obj2);
            }
            Waiter waiter = this.f53355d;
            if (waiter != Waiter.f53379c) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.mo61586a(waiter);
                    if (f53351o.mo61577c(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f53353a;
                            } else {
                                m73904B(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return m73922u(obj);
                    }
                    waiter = this.f53355d;
                } while (waiter != Waiter.f53379c);
            }
            Object obj3 = this.f53353a;
            Objects.requireNonNull(obj3);
            return m73922u(obj3);
        }
        throw new InterruptedException();
    }
}

package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MoreExecutors {

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$1 */
    class C110091 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockingQueue f53619a;

        /* renamed from: c */
        final /* synthetic */ ListenableFuture f53620c;

        public void run() {
            this.f53619a.add(this.f53620c);
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$3 */
    class C110113 extends WrappingExecutorService {

        /* renamed from: c */
        final /* synthetic */ Supplier f53623c;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Runnable mo61852c(Runnable runnable) {
            return Callables.m74056e(runnable, this.f53623c);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public <T> Callable<T> mo61853d(Callable<T> callable) {
            return Callables.m74057f(callable, this.f53623c);
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$4 */
    class C110124 extends WrappingScheduledExecutorService {

        /* renamed from: d */
        final /* synthetic */ Supplier f53624d;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Runnable mo61852c(Runnable runnable) {
            return Callables.m74056e(runnable, this.f53624d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public <T> Callable<T> mo61853d(Callable<T> callable) {
            return Callables.m74057f(callable, this.f53624d);
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    static class Application {

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1 */
        class C110141 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ExecutorService f53627a;

            /* renamed from: c */
            final /* synthetic */ long f53628c;

            /* renamed from: d */
            final /* synthetic */ TimeUnit f53629d;

            public void run() {
                try {
                    this.f53627a.shutdown();
                    this.f53627a.awaitTermination(this.f53628c, this.f53629d);
                } catch (InterruptedException unused) {
                }
            }
        }

        Application() {
        }
    }

    @GwtIncompatible
    private static final class DirectExecutorService extends AbstractListeningExecutorService {

        /* renamed from: a */
        private final Object f53630a = new Object();
        @GuardedBy

        /* renamed from: c */
        private int f53631c = 0;
        @GuardedBy

        /* renamed from: d */
        private boolean f53632d = false;

        private DirectExecutorService() {
        }

        /* renamed from: a */
        private void m74269a() {
            synchronized (this.f53630a) {
                int i = this.f53631c - 1;
                this.f53631c = i;
                if (i == 0) {
                    this.f53630a.notifyAll();
                }
            }
        }

        /* renamed from: b */
        private void m74270b() {
            synchronized (this.f53630a) {
                if (!this.f53632d) {
                    this.f53631c++;
                } else {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
            }
        }

        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            long nanos = timeUnit.toNanos(j);
            synchronized (this.f53630a) {
                while (true) {
                    if (this.f53632d && this.f53631c == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f53630a, nanos);
                    nanos -= System.nanoTime() - nanoTime;
                }
            }
        }

        public void execute(Runnable runnable) {
            m74270b();
            try {
                runnable.run();
            } finally {
                m74269a();
            }
        }

        public boolean isShutdown() {
            boolean z;
            synchronized (this.f53630a) {
                z = this.f53632d;
            }
            return z;
        }

        public boolean isTerminated() {
            boolean z;
            synchronized (this.f53630a) {
                z = this.f53632d && this.f53631c == 0;
            }
            return z;
        }

        public void shutdown() {
            synchronized (this.f53630a) {
                this.f53632d = true;
                if (this.f53631c == 0) {
                    this.f53630a.notifyAll();
                }
            }
        }

        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }
    }

    @GwtIncompatible
    private static class ListeningDecorator extends AbstractListeningExecutorService {

        /* renamed from: a */
        private final ExecutorService f53633a;

        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f53633a.awaitTermination(j, timeUnit);
        }

        public final void execute(Runnable runnable) {
            this.f53633a.execute(runnable);
        }

        public final boolean isShutdown() {
            return this.f53633a.isShutdown();
        }

        public final boolean isTerminated() {
            return this.f53633a.isTerminated();
        }

        public final void shutdown() {
            this.f53633a.shutdown();
        }

        public final List<Runnable> shutdownNow() {
            return this.f53633a.shutdownNow();
        }

        public final String toString() {
            String obj = super.toString();
            String valueOf = String.valueOf(this.f53633a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
            sb.append(obj);
            sb.append("[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
    }

    @GwtIncompatible
    private static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {

        /* renamed from: c */
        final ScheduledExecutorService f53634c;

        private static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {

            /* renamed from: c */
            private final ScheduledFuture<?> f53635c;

            public ListenableScheduledTask(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.f53635c = scheduledFuture;
            }

            /* renamed from: V */
            public int compareTo(Delayed delayed) {
                return this.f53635c.compareTo(delayed);
            }

            public boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.f53635c.cancel(z);
                }
                return cancel;
            }

            public long getDelay(TimeUnit timeUnit) {
                return this.f53635c.getDelay(timeUnit);
            }
        }

        @GwtIncompatible
        private static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {

            /* renamed from: s */
            private final Runnable f53636s;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                this.f53636s = (Runnable) Preconditions.m5392s(runnable);
            }

            public void run() {
                try {
                    this.f53636s.run();
                } catch (Throwable th) {
                    mo61563D(th);
                    throw Throwables.m5488k(th);
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: z */
            public String mo61546z() {
                String valueOf = String.valueOf(this.f53636s);
                StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                sb.append("task=[");
                sb.append(valueOf);
                sb.append("]");
                return sb.toString();
            }
        }

        /* renamed from: a */
        public ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask H = TrustedListenableFutureTask.m74349H(runnable, null);
            return new ListenableScheduledTask(H, this.f53634c.schedule(H, j, timeUnit));
        }

        /* renamed from: b */
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask<V> I = TrustedListenableFutureTask.m74350I(callable);
            return new ListenableScheduledTask(I, this.f53634c.schedule(I, j, timeUnit));
        }

        /* renamed from: c */
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f53634c.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        /* renamed from: d */
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f53634c.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }
    }

    private MoreExecutors() {
    }

    /* renamed from: a */
    public static Executor m74259a() {
        return DirectExecutor.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return false;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:7:0x0011] */
    @com.google.common.annotations.GwtIncompatible
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m74260b() {
        /*
            java.lang.String r0 = "com.google.appengine.runtime.environment"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = "com.google.appengine.api.utils.SystemProperty"
            java.lang.Class.forName(r0)     // Catch:{  }
            java.lang.String r0 = "com.google.apphosting.api.ApiProxy"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            java.lang.String r2 = "getCurrentEnvironment"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            if (r0 == 0) goto L_0x0027
            r1 = 1
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.MoreExecutors.m74260b():boolean");
    }

    @GwtIncompatible
    /* renamed from: c */
    static Thread m74261c(String str, Runnable runnable) {
        Preconditions.m5392s(str);
        Preconditions.m5392s(runnable);
        Thread newThread = m74262d().newThread(runnable);
        try {
            newThread.setName(str);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    @GwtIncompatible
    @Beta
    /* renamed from: d */
    public static ThreadFactory m74262d() {
        if (!m74260b()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (InvocationTargetException e4) {
            throw Throwables.m5488k(e4.getCause());
        }
    }

    /* renamed from: e */
    static Executor m74263e(final Executor executor, final AbstractFuture<?> abstractFuture) {
        Preconditions.m5392s(executor);
        Preconditions.m5392s(abstractFuture);
        if (executor == m74259a()) {
            return executor;
        }
        return new Executor() {
            public void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    abstractFuture.mo61563D(e);
                }
            }
        };
    }

    @GwtIncompatible
    /* renamed from: f */
    static Executor m74264f(final Executor executor, final Supplier<String> supplier) {
        Preconditions.m5392s(executor);
        Preconditions.m5392s(supplier);
        return new Executor() {
            public void execute(Runnable runnable) {
                executor.execute(Callables.m74056e(runnable, supplier));
            }
        };
    }
}

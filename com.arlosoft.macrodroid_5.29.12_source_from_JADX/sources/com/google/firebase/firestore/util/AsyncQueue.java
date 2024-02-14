package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class AsyncQueue {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SynchronizedShutdownAwareExecutor f54715a = new SynchronizedShutdownAwareExecutor();

    /* renamed from: b */
    private final ArrayList<DelayedTask> f54716b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<TimerId> f54717c = new ArrayList<>();

    public class DelayedTask {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final TimerId f54718a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f54719b;

        /* renamed from: c */
        private final Runnable f54720c;

        /* renamed from: d */
        private ScheduledFuture f54721d;

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m76468f() {
            AsyncQueue.this.mo63156t();
            if (this.f54721d != null) {
                m76469g();
                this.f54720c.run();
            }
        }

        /* renamed from: g */
        private void m76469g() {
            Assert.m76443d(this.f54721d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f54721d = null;
            AsyncQueue.this.m76454s(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public void m76470i(long j) {
            this.f54721d = AsyncQueue.this.f54715a.schedule(AsyncQueue$DelayedTask$$Lambda$1.m76489a(this), j, TimeUnit.MILLISECONDS);
        }

        /* renamed from: e */
        public void mo63157e() {
            AsyncQueue.this.mo63156t();
            ScheduledFuture scheduledFuture = this.f54721d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                m76469g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo63158h() {
            m76468f();
        }

        private DelayedTask(TimerId timerId, long j, Runnable runnable) {
            this.f54718a = timerId;
            this.f54719b = j;
            this.f54720c = runnable;
        }
    }

    private class SynchronizedShutdownAwareExecutor implements Executor {

        /* renamed from: a */
        private final ScheduledThreadPoolExecutor f54723a;

        /* renamed from: c */
        private boolean f54724c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Thread f54725d;

        private class DelayedStartFactory implements Runnable, ThreadFactory {

            /* renamed from: a */
            private final CountDownLatch f54729a;

            /* renamed from: c */
            private Runnable f54730c;

            private DelayedStartFactory() {
                this.f54729a = new CountDownLatch(1);
            }

            public Thread newThread(@NonNull Runnable runnable) {
                Assert.m76443d(this.f54730c == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f54730c = runnable;
                this.f54729a.countDown();
                return SynchronizedShutdownAwareExecutor.this.f54725d;
            }

            public void run() {
                try {
                    this.f54729a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f54730c.run();
            }
        }

        SynchronizedShutdownAwareExecutor() {
            DelayedStartFactory delayedStartFactory = new DelayedStartFactory();
            Thread newThread = Executors.defaultThreadFactory().newThread(delayedStartFactory);
            this.f54725d = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(AsyncQueue$SynchronizedShutdownAwareExecutor$$Lambda$1.m76490a(this));
            C112491 r1 = new ScheduledThreadPoolExecutor(1, delayedStartFactory, AsyncQueue.this) {
                /* access modifiers changed from: protected */
                public void afterExecute(Runnable runnable, Throwable th) {
                    super.afterExecute(runnable, th);
                    if (th == null && (runnable instanceof Future)) {
                        Future future = (Future) runnable;
                        try {
                            if (future.isDone()) {
                                future.get();
                            }
                        } catch (CancellationException unused) {
                        } catch (ExecutionException e) {
                            th = e.getCause();
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    if (th != null) {
                        AsyncQueue.this.mo63155r(th);
                    }
                }
            };
            this.f54723a = r1;
            r1.setKeepAliveTime(3, TimeUnit.SECONDS);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public <T> Task<T> m76478f(Callable<T> callable) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(AsyncQueue$SynchronizedShutdownAwareExecutor$$Lambda$2.m76491a(taskCompletionSource, callable));
            } catch (RejectedExecutionException unused) {
                Logger.m76511d(AsyncQueue.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.mo56137a();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public synchronized boolean m76479g() {
            return this.f54724c;
        }

        /* renamed from: i */
        static /* synthetic */ void m76481i(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.mo56139c(callable.call());
            } catch (Exception e) {
                taskCompletionSource.mo56138b(e);
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public void m76483k() {
            this.f54723a.shutdownNow();
        }

        /* access modifiers changed from: private */
        public synchronized ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f54724c) {
                return null;
            }
            return this.f54723a.schedule(runnable, j, timeUnit);
        }

        public synchronized void execute(Runnable runnable) {
            if (!this.f54724c) {
                this.f54723a.execute(runnable);
            }
        }
    }

    public enum TimerId {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER
    }

    /* renamed from: d */
    private DelayedTask m76446d(TimerId timerId, long j, Runnable runnable) {
        DelayedTask delayedTask = new DelayedTask(timerId, System.currentTimeMillis() + j, runnable);
        delayedTask.m76470i(j);
        return delayedTask;
    }

    /* renamed from: k */
    static /* synthetic */ Void m76447k(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.mo23719t()) {
            taskCompletionSource.mo56139c(task.mo23715p());
            return null;
        }
        taskCompletionSource.mo56138b(task.mo23714o());
        return null;
    }

    /* renamed from: l */
    static /* synthetic */ void m76448l(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).mo23711l(executor, AsyncQueue$$Lambda$7.m76487b(taskCompletionSource));
        } catch (Exception e) {
            taskCompletionSource.mo56138b(e);
        } catch (Throwable th) {
            taskCompletionSource.mo56138b(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m76450n(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (22.1.2) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
            outOfMemoryError.initCause(th);
            throw outOfMemoryError;
        }
        throw new RuntimeException("Internal error in Cloud Firestore (22.1.2).", th);
    }

    /* renamed from: p */
    static /* synthetic */ void m76452p(AsyncQueue asyncQueue, TimerId timerId) {
        Assert.m76443d(timerId == TimerId.ALL || asyncQueue.mo63148c(timerId), "Attempted to run tasks until missing TimerId: %s", timerId);
        Collections.sort(asyncQueue.f54716b, AsyncQueue$$Lambda$6.m76486a());
        Iterator it = new ArrayList(asyncQueue.f54716b).iterator();
        while (it.hasNext()) {
            DelayedTask delayedTask = (DelayedTask) it.next();
            delayedTask.mo63158h();
            if (timerId != TimerId.ALL && delayedTask.f54718a == timerId) {
                return;
            }
        }
    }

    /* renamed from: q */
    static /* synthetic */ void m76453q(Runnable runnable, Throwable[] thArr, Semaphore semaphore) {
        try {
            runnable.run();
        } catch (Throwable th) {
            thArr[0] = th;
        }
        semaphore.release();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m76454s(DelayedTask delayedTask) {
        Assert.m76443d(this.f54716b.remove(delayedTask), "Delayed task not found.", new Object[0]);
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean mo63148c(TimerId timerId) {
        Iterator<DelayedTask> it = this.f54716b.iterator();
        while (it.hasNext()) {
            if (it.next().f54718a == timerId) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public Task<Void> mo63149e(Runnable runnable) {
        return mo63150f(AsyncQueue$$Lambda$2.m76484a(runnable));
    }

    /* renamed from: f */
    public <T> Task<T> mo63150f(Callable<T> callable) {
        return this.f54715a.m76478f(callable);
    }

    /* renamed from: g */
    public DelayedTask mo63151g(TimerId timerId, long j, Runnable runnable) {
        if (this.f54717c.contains(timerId)) {
            j = 0;
        }
        DelayedTask d = m76446d(timerId, j, runnable);
        this.f54716b.add(d);
        return d;
    }

    /* renamed from: h */
    public void mo63152h(Runnable runnable) {
        mo63149e(runnable);
    }

    /* renamed from: i */
    public Executor mo63153i() {
        return this.f54715a;
    }

    /* renamed from: j */
    public boolean mo63154j() {
        return this.f54715a.m76479g();
    }

    /* renamed from: r */
    public void mo63155r(Throwable th) {
        this.f54715a.m76483k();
        new Handler(Looper.getMainLooper()).post(AsyncQueue$$Lambda$3.m76485a(th));
    }

    /* renamed from: t */
    public void mo63156t() {
        Thread currentThread = Thread.currentThread();
        if (this.f54715a.f54725d != currentThread) {
            throw Assert.m76440a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f54715a.f54725d.getName(), Long.valueOf(this.f54715a.f54725d.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        }
    }
}

package p292io.grpc;

import com.google.common.base.Preconditions;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.grpc.d1 */
/* compiled from: SynchronizationContext */
public final class C12550d1 implements Executor {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f59477a;

    /* renamed from: c */
    private final Queue<Runnable> f59478c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    private final AtomicReference<Thread> f59479d = new AtomicReference<>();

    /* renamed from: io.grpc.d1$a */
    /* compiled from: SynchronizationContext */
    class C12551a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12552b f59480a;

        /* renamed from: c */
        final /* synthetic */ Runnable f59481c;

        C12551a(C12552b bVar, Runnable runnable) {
            this.f59480a = bVar;
            this.f59481c = runnable;
        }

        public void run() {
            C12550d1.this.execute(this.f59480a);
        }

        public String toString() {
            return this.f59481c.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* renamed from: io.grpc.d1$b */
    /* compiled from: SynchronizationContext */
    private static class C12552b implements Runnable {

        /* renamed from: a */
        final Runnable f59483a;

        /* renamed from: c */
        boolean f59484c;

        /* renamed from: d */
        boolean f59485d;

        C12552b(Runnable runnable) {
            this.f59483a = (Runnable) Preconditions.m5393t(runnable, "task");
        }

        public void run() {
            if (!this.f59484c) {
                this.f59485d = true;
                this.f59483a.run();
            }
        }
    }

    /* renamed from: io.grpc.d1$c */
    /* compiled from: SynchronizationContext */
    public static final class C12553c {

        /* renamed from: a */
        private final C12552b f59486a;

        /* renamed from: b */
        private final ScheduledFuture<?> f59487b;

        /* synthetic */ C12553c(C12552b bVar, ScheduledFuture scheduledFuture, C12551a aVar) {
            this(bVar, scheduledFuture);
        }

        /* renamed from: a */
        public void mo69124a() {
            this.f59486a.f59484c = true;
            this.f59487b.cancel(false);
        }

        /* renamed from: b */
        public boolean mo69125b() {
            C12552b bVar = this.f59486a;
            return !bVar.f59485d && !bVar.f59484c;
        }

        private C12553c(C12552b bVar, ScheduledFuture<?> scheduledFuture) {
            this.f59486a = (C12552b) Preconditions.m5393t(bVar, "runnable");
            this.f59487b = (ScheduledFuture) Preconditions.m5393t(scheduledFuture, "future");
        }
    }

    public C12550d1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f59477a = (Thread.UncaughtExceptionHandler) Preconditions.m5393t(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    /* renamed from: a */
    public final void mo69116a() {
        while (this.f59479d.compareAndSet((Object) null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f59478c.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.f59479d.set((Object) null);
                        if (this.f59478c.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.f59479d.set((Object) null);
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo69117b(Runnable runnable) {
        this.f59478c.add(Preconditions.m5393t(runnable, "runnable is null"));
    }

    /* renamed from: c */
    public final C12553c mo69118c(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C12552b bVar = new C12552b(runnable);
        return new C12553c(bVar, scheduledExecutorService.schedule(new C12551a(bVar, runnable), j, timeUnit), (C12551a) null);
    }

    /* renamed from: d */
    public void mo69119d() {
        Preconditions.m5399z(Thread.currentThread() == this.f59479d.get(), "Not called from the SynchronizationContext");
    }

    public final void execute(Runnable runnable) {
        mo69117b(runnable);
        mo69116a();
    }
}

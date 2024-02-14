package p473rx.internal.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p459ef.C17158f;
import p459ef.C17163i;
import p464jf.C17176a;
import p470pf.C17223b;
import p470pf.C17225d;
import p473rx.internal.util.C17383e;

/* renamed from: rx.internal.schedulers.a */
/* compiled from: CachedThreadScheduler */
public final class C17352a extends C17158f implements C17374h {

    /* renamed from: d */
    private static final TimeUnit f69065d = TimeUnit.SECONDS;

    /* renamed from: e */
    static final C17358c f69066e;

    /* renamed from: f */
    static final C17353a f69067f;

    /* renamed from: b */
    final ThreadFactory f69068b;

    /* renamed from: c */
    final AtomicReference<C17353a> f69069c = new AtomicReference<>(f69067f);

    /* renamed from: rx.internal.schedulers.a$a */
    /* compiled from: CachedThreadScheduler */
    static final class C17353a {

        /* renamed from: a */
        private final ThreadFactory f69070a;

        /* renamed from: b */
        private final long f69071b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C17358c> f69072c;

        /* renamed from: d */
        private final C17223b f69073d;

        /* renamed from: e */
        private final ScheduledExecutorService f69074e;

        /* renamed from: f */
        private final Future<?> f69075f;

        /* renamed from: rx.internal.schedulers.a$a$a */
        /* compiled from: CachedThreadScheduler */
        class C17354a implements ThreadFactory {

            /* renamed from: a */
            final /* synthetic */ ThreadFactory f69076a;

            C17354a(ThreadFactory threadFactory) {
                this.f69076a = threadFactory;
            }

            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f69076a.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* renamed from: rx.internal.schedulers.a$a$b */
        /* compiled from: CachedThreadScheduler */
        class C17355b implements Runnable {
            C17355b() {
            }

            public void run() {
                C17353a.this.mo80672a();
            }
        }

        C17353a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.f69070a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f69071b = nanos;
            this.f69072c = new ConcurrentLinkedQueue<>();
            this.f69073d = new C17223b();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new C17354a(threadFactory));
                C17368f.m101109l(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new C17355b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f69074e = scheduledExecutorService;
            this.f69075f = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo80672a() {
            if (!this.f69072c.isEmpty()) {
                long c = mo80674c();
                Iterator<C17358c> it = this.f69072c.iterator();
                while (it.hasNext()) {
                    C17358c next = it.next();
                    if (next.mo80679m() > c) {
                        return;
                    }
                    if (this.f69072c.remove(next)) {
                        this.f69073d.mo80522c(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C17358c mo80673b() {
            if (this.f69073d.mo80449b()) {
                return C17352a.f69066e;
            }
            while (!this.f69072c.isEmpty()) {
                C17358c poll = this.f69072c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C17358c cVar = new C17358c(this.f69070a);
            this.f69073d.mo80521a(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo80674c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo80675d(C17358c cVar) {
            cVar.mo80680n(mo80674c() + this.f69071b);
            this.f69072c.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo80676e() {
            try {
                Future<?> future = this.f69075f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f69074e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.f69073d.mo80450d();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.a$b */
    /* compiled from: CachedThreadScheduler */
    static final class C17356b extends C17158f.C17159a implements C17176a {

        /* renamed from: a */
        private final C17223b f69079a = new C17223b();

        /* renamed from: c */
        private final C17353a f69080c;

        /* renamed from: d */
        private final C17358c f69081d;

        /* renamed from: f */
        final AtomicBoolean f69082f;

        /* renamed from: rx.internal.schedulers.a$b$a */
        /* compiled from: CachedThreadScheduler */
        class C17357a implements C17176a {

            /* renamed from: a */
            final /* synthetic */ C17176a f69083a;

            C17357a(C17176a aVar) {
                this.f69083a = aVar;
            }

            public void call() {
                if (!C17356b.this.mo80449b()) {
                    this.f69083a.call();
                }
            }
        }

        C17356b(C17353a aVar) {
            this.f69080c = aVar;
            this.f69082f = new AtomicBoolean();
            this.f69081d = aVar.mo80673b();
        }

        /* renamed from: a */
        public C17163i mo80446a(C17176a aVar) {
            return mo80447c(aVar, 0, (TimeUnit) null);
        }

        /* renamed from: b */
        public boolean mo80449b() {
            return this.f69079a.mo80449b();
        }

        /* renamed from: c */
        public C17163i mo80447c(C17176a aVar, long j, TimeUnit timeUnit) {
            if (this.f69079a.mo80449b()) {
                return C17225d.m100809b();
            }
            C17370g i = this.f69081d.mo80686i(new C17357a(aVar), j, timeUnit);
            this.f69079a.mo80521a(i);
            i.mo80692e(this.f69079a);
            return i;
        }

        public void call() {
            this.f69080c.mo80675d(this.f69081d);
        }

        /* renamed from: d */
        public void mo80450d() {
            if (this.f69082f.compareAndSet(false, true)) {
                this.f69081d.mo80446a(this);
            }
            this.f69079a.mo80450d();
        }
    }

    /* renamed from: rx.internal.schedulers.a$c */
    /* compiled from: CachedThreadScheduler */
    static final class C17358c extends C17368f {

        /* renamed from: z */
        private long f69085z = 0;

        C17358c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: m */
        public long mo80679m() {
            return this.f69085z;
        }

        /* renamed from: n */
        public void mo80680n(long j) {
            this.f69085z = j;
        }
    }

    static {
        C17358c cVar = new C17358c(C17383e.f69137a);
        f69066e = cVar;
        cVar.mo80450d();
        C17353a aVar = new C17353a((ThreadFactory) null, 0, (TimeUnit) null);
        f69067f = aVar;
        aVar.mo80676e();
    }

    public C17352a(ThreadFactory threadFactory) {
        this.f69068b = threadFactory;
        mo80670b();
    }

    /* renamed from: a */
    public C17158f.C17159a mo80445a() {
        return new C17356b(this.f69069c.get());
    }

    /* renamed from: b */
    public void mo80670b() {
        C17353a aVar = new C17353a(this.f69068b, 60, f69065d);
        if (!this.f69069c.compareAndSet(f69067f, aVar)) {
            aVar.mo80676e();
        }
    }

    public void shutdown() {
        C17353a aVar;
        C17353a aVar2;
        do {
            aVar = this.f69069c.get();
            aVar2 = f69067f;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.f69069c.compareAndSet(aVar, aVar2));
        aVar.mo80676e();
    }
}

package p292io.reactivex.internal.schedulers;

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
import p223ca.C11164c;
import p414v9.C16742o;
import p448z9.C17070a;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.schedulers.d */
/* compiled from: IoScheduler */
public final class C13185d extends C16742o {

    /* renamed from: d */
    static final C13191g f61047d;

    /* renamed from: e */
    static final C13191g f61048e;

    /* renamed from: f */
    private static final long f61049f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: g */
    private static final TimeUnit f61050g = TimeUnit.SECONDS;

    /* renamed from: h */
    static final C13188c f61051h;

    /* renamed from: i */
    static final C13186a f61052i;

    /* renamed from: b */
    final ThreadFactory f61053b;

    /* renamed from: c */
    final AtomicReference<C13186a> f61054c;

    /* renamed from: io.reactivex.internal.schedulers.d$a */
    /* compiled from: IoScheduler */
    static final class C13186a implements Runnable {

        /* renamed from: a */
        private final long f61055a;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C13188c> f61056c;

        /* renamed from: d */
        final C17070a f61057d;

        /* renamed from: f */
        private final ScheduledExecutorService f61058f;

        /* renamed from: g */
        private final Future<?> f61059g;

        /* renamed from: o */
        private final ThreadFactory f61060o;

        C13186a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f61055a = nanos;
            this.f61056c = new ConcurrentLinkedQueue<>();
            this.f61057d = new C17070a();
            this.f61060o = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C13185d.f61048e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f61058f = scheduledExecutorService;
            this.f61059g = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo70005a() {
            if (!this.f61056c.isEmpty()) {
                long c = mo70007c();
                Iterator<C13188c> it = this.f61056c.iterator();
                while (it.hasNext()) {
                    C13188c next = it.next();
                    if (next.mo70011i() > c) {
                        return;
                    }
                    if (this.f61056c.remove(next)) {
                        this.f61057d.mo62359b(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C13188c mo70006b() {
            if (this.f61057d.isDisposed()) {
                return C13185d.f61051h;
            }
            while (!this.f61056c.isEmpty()) {
                C13188c poll = this.f61056c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C13188c cVar = new C13188c(this.f61060o);
            this.f61057d.mo62358a(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo70007c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo70008d(C13188c cVar) {
            cVar.mo70012j(mo70007c() + this.f61055a);
            this.f61056c.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo70009e() {
            this.f61057d.dispose();
            Future<?> future = this.f61059g;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f61058f;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo70005a();
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$b */
    /* compiled from: IoScheduler */
    static final class C13187b extends C16742o.C16745c {

        /* renamed from: a */
        private final C17070a f61061a;

        /* renamed from: c */
        private final C13186a f61062c;

        /* renamed from: d */
        private final C13188c f61063d;

        /* renamed from: f */
        final AtomicBoolean f61064f = new AtomicBoolean();

        C13187b(C13186a aVar) {
            this.f61062c = aVar;
            this.f61061a = new C17070a();
            this.f61063d = aVar.mo70006b();
        }

        /* renamed from: c */
        public C17071b mo69997c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f61061a.isDisposed()) {
                return C11164c.INSTANCE;
            }
            return this.f61063d.mo70013e(runnable, j, timeUnit, this.f61061a);
        }

        public void dispose() {
            if (this.f61064f.compareAndSet(false, true)) {
                this.f61061a.dispose();
                this.f61062c.mo70008d(this.f61063d);
            }
        }

        public boolean isDisposed() {
            return this.f61064f.get();
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$c */
    /* compiled from: IoScheduler */
    static final class C13188c extends C13190f {

        /* renamed from: d */
        private long f61065d = 0;

        C13188c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: i */
        public long mo70011i() {
            return this.f61065d;
        }

        /* renamed from: j */
        public void mo70012j(long j) {
            this.f61065d = j;
        }
    }

    static {
        C13188c cVar = new C13188c(new C13191g("RxCachedThreadSchedulerShutdown"));
        f61051h = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        C13191g gVar = new C13191g("RxCachedThreadScheduler", max);
        f61047d = gVar;
        f61048e = new C13191g("RxCachedWorkerPoolEvictor", max);
        C13186a aVar = new C13186a(0, (TimeUnit) null, gVar);
        f61052i = aVar;
        aVar.mo70009e();
    }

    public C13185d() {
        this(f61047d);
    }

    /* renamed from: a */
    public C16742o.C16745c mo69992a() {
        return new C13187b(this.f61054c.get());
    }

    /* renamed from: e */
    public void mo70004e() {
        C13186a aVar = new C13186a(f61049f, f61050g, this.f61053b);
        if (!this.f61054c.compareAndSet(f61052i, aVar)) {
            aVar.mo70009e();
        }
    }

    public C13185d(ThreadFactory threadFactory) {
        this.f61053b = threadFactory;
        this.f61054c = new AtomicReference<>(f61052i);
        mo70004e();
    }
}

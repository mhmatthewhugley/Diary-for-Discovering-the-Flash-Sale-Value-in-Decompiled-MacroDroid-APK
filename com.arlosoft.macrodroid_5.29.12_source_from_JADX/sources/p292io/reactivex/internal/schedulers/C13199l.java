package p292io.reactivex.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11164c;
import p262fa.C12251a;
import p414v9.C16742o;
import p448z9.C17070a;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.schedulers.l */
/* compiled from: SingleScheduler */
public final class C13199l extends C16742o {

    /* renamed from: d */
    static final C13191g f61080d = new C13191g("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: e */
    static final ScheduledExecutorService f61081e;

    /* renamed from: b */
    final ThreadFactory f61082b;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f61083c;

    /* renamed from: io.reactivex.internal.schedulers.l$a */
    /* compiled from: SingleScheduler */
    static final class C13200a extends C16742o.C16745c {

        /* renamed from: a */
        final ScheduledExecutorService f61084a;

        /* renamed from: c */
        final C17070a f61085c = new C17070a();

        /* renamed from: d */
        volatile boolean f61086d;

        C13200a(ScheduledExecutorService scheduledExecutorService) {
            this.f61084a = scheduledExecutorService;
        }

        /* renamed from: c */
        public C17071b mo69997c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f61086d) {
                return C11164c.INSTANCE;
            }
            C13195j jVar = new C13195j(C12251a.m82987r(runnable), this.f61085c);
            this.f61085c.mo62358a(jVar);
            if (j <= 0) {
                try {
                    future = this.f61084a.submit(jVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C12251a.m82985p(e);
                    return C11164c.INSTANCE;
                }
            } else {
                future = this.f61084a.schedule(jVar, j, timeUnit);
            }
            jVar.mo70022a(future);
            return jVar;
        }

        public void dispose() {
            if (!this.f61086d) {
                this.f61086d = true;
                this.f61085c.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f61086d;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f61081e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C13199l() {
        this(f61080d);
    }

    /* renamed from: e */
    static ScheduledExecutorService m85498e(ThreadFactory threadFactory) {
        return C13196k.m85493a(threadFactory);
    }

    /* renamed from: a */
    public C16742o.C16745c mo69992a() {
        return new C13200a(this.f61083c.get());
    }

    /* renamed from: c */
    public C17071b mo69993c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C13194i iVar = new C13194i(C12251a.m82987r(runnable));
        if (j <= 0) {
            try {
                future = this.f61083c.get().submit(iVar);
            } catch (RejectedExecutionException e) {
                C12251a.m82985p(e);
                return C11164c.INSTANCE;
            }
        } else {
            future = this.f61083c.get().schedule(iVar, j, timeUnit);
        }
        iVar.mo69991a(future);
        return iVar;
    }

    /* renamed from: d */
    public C17071b mo69994d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable r = C12251a.m82987r(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f61083c.get();
            C13184c cVar = new C13184c(r, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(cVar);
                } catch (RejectedExecutionException e) {
                    C12251a.m82985p(e);
                    return C11164c.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(cVar, j, timeUnit);
            }
            cVar.mo70001b(future);
            return cVar;
        }
        C13193h hVar = new C13193h(r);
        try {
            hVar.mo69991a(this.f61083c.get().scheduleAtFixedRate(hVar, j, j2, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e2) {
            C12251a.m82985p(e2);
            return C11164c.INSTANCE;
        }
    }

    public C13199l(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f61083c = atomicReference;
        this.f61082b = threadFactory;
        atomicReference.lazySet(m85498e(threadFactory));
    }
}

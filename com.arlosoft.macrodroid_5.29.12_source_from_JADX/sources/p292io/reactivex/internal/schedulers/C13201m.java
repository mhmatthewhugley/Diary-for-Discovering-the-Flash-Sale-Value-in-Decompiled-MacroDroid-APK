package p292io.reactivex.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p223ca.C11164c;
import p241da.C11984b;
import p262fa.C12251a;
import p414v9.C16742o;
import p448z9.C17071b;
import p448z9.C17072c;

/* renamed from: io.reactivex.internal.schedulers.m */
/* compiled from: TrampolineScheduler */
public final class C13201m extends C16742o {

    /* renamed from: b */
    private static final C13201m f61087b = new C13201m();

    /* renamed from: io.reactivex.internal.schedulers.m$a */
    /* compiled from: TrampolineScheduler */
    static final class C13202a implements Runnable {

        /* renamed from: a */
        private final Runnable f61088a;

        /* renamed from: c */
        private final C13204c f61089c;

        /* renamed from: d */
        private final long f61090d;

        C13202a(Runnable runnable, C13204c cVar, long j) {
            this.f61088a = runnable;
            this.f61089c = cVar;
            this.f61090d = j;
        }

        public void run() {
            if (!this.f61089c.f61098f) {
                long a = this.f61089c.mo79719a(TimeUnit.MILLISECONDS);
                long j = this.f61090d;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C12251a.m82985p(e);
                        return;
                    }
                }
                if (!this.f61089c.f61098f) {
                    this.f61088a.run();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.m$b */
    /* compiled from: TrampolineScheduler */
    static final class C13203b implements Comparable<C13203b> {

        /* renamed from: a */
        final Runnable f61091a;

        /* renamed from: c */
        final long f61092c;

        /* renamed from: d */
        final int f61093d;

        /* renamed from: f */
        volatile boolean f61094f;

        C13203b(Runnable runnable, Long l, int i) {
            this.f61091a = runnable;
            this.f61092c = l.longValue();
            this.f61093d = i;
        }

        /* renamed from: b */
        public int compareTo(C13203b bVar) {
            int b = C11984b.m82365b(this.f61092c, bVar.f61092c);
            return b == 0 ? C11984b.m82364a(this.f61093d, bVar.f61093d) : b;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.m$c */
    /* compiled from: TrampolineScheduler */
    static final class C13204c extends C16742o.C16745c {

        /* renamed from: a */
        final PriorityBlockingQueue<C13203b> f61095a = new PriorityBlockingQueue<>();

        /* renamed from: c */
        private final AtomicInteger f61096c = new AtomicInteger();

        /* renamed from: d */
        final AtomicInteger f61097d = new AtomicInteger();

        /* renamed from: f */
        volatile boolean f61098f;

        /* renamed from: io.reactivex.internal.schedulers.m$c$a */
        /* compiled from: TrampolineScheduler */
        final class C13205a implements Runnable {

            /* renamed from: a */
            final C13203b f61099a;

            C13205a(C13203b bVar) {
                this.f61099a = bVar;
            }

            public void run() {
                this.f61099a.f61094f = true;
                C13204c.this.f61095a.remove(this.f61099a);
            }
        }

        C13204c() {
        }

        /* renamed from: b */
        public C17071b mo69996b(Runnable runnable) {
            return mo70031e(runnable, mo79719a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: c */
        public C17071b mo69997c(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo79719a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo70031e(new C13202a(runnable, this, a), a);
        }

        public void dispose() {
            this.f61098f = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C17071b mo70031e(Runnable runnable, long j) {
            if (this.f61098f) {
                return C11164c.INSTANCE;
            }
            C13203b bVar = new C13203b(runnable, Long.valueOf(j), this.f61097d.incrementAndGet());
            this.f61095a.add(bVar);
            if (this.f61096c.getAndIncrement() != 0) {
                return C17072c.m100419c(new C13205a(bVar));
            }
            int i = 1;
            while (!this.f61098f) {
                C13203b poll = this.f61095a.poll();
                if (poll == null) {
                    i = this.f61096c.addAndGet(-i);
                    if (i == 0) {
                        return C11164c.INSTANCE;
                    }
                } else if (!poll.f61094f) {
                    poll.f61091a.run();
                }
            }
            this.f61095a.clear();
            return C11164c.INSTANCE;
        }

        public boolean isDisposed() {
            return this.f61098f;
        }
    }

    C13201m() {
    }

    /* renamed from: e */
    public static C13201m m85503e() {
        return f61087b;
    }

    /* renamed from: a */
    public C16742o.C16745c mo69992a() {
        return new C13204c();
    }

    /* renamed from: b */
    public C17071b mo70027b(Runnable runnable) {
        C12251a.m82987r(runnable).run();
        return C11164c.INSTANCE;
    }

    /* renamed from: c */
    public C17071b mo69993c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C12251a.m82987r(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C12251a.m82985p(e);
        }
        return C11164c.INSTANCE;
    }
}

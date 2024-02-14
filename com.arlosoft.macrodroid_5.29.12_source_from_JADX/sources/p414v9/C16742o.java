package p414v9;

import java.util.concurrent.TimeUnit;
import p209aa.C11078a;
import p223ca.C11164c;
import p223ca.C11166e;
import p262fa.C12251a;
import p292io.reactivex.internal.schedulers.C13190f;
import p292io.reactivex.internal.util.C13221g;
import p448z9.C17071b;

/* renamed from: v9.o */
/* compiled from: Scheduler */
public abstract class C16742o {

    /* renamed from: a */
    static final long f67676a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: v9.o$a */
    /* compiled from: Scheduler */
    static final class C16743a implements C17071b, Runnable {

        /* renamed from: a */
        final Runnable f67677a;

        /* renamed from: c */
        final C16745c f67678c;

        /* renamed from: d */
        Thread f67679d;

        C16743a(Runnable runnable, C16745c cVar) {
            this.f67677a = runnable;
            this.f67678c = cVar;
        }

        public void dispose() {
            if (this.f67679d == Thread.currentThread()) {
                C16745c cVar = this.f67678c;
                if (cVar instanceof C13190f) {
                    ((C13190f) cVar).mo70016h();
                    return;
                }
            }
            this.f67678c.dispose();
        }

        public boolean isDisposed() {
            return this.f67678c.isDisposed();
        }

        public void run() {
            this.f67679d = Thread.currentThread();
            try {
                this.f67677a.run();
            } finally {
                dispose();
                this.f67679d = null;
            }
        }
    }

    /* renamed from: v9.o$b */
    /* compiled from: Scheduler */
    static final class C16744b implements C17071b, Runnable {

        /* renamed from: a */
        final Runnable f67680a;

        /* renamed from: c */
        final C16745c f67681c;

        /* renamed from: d */
        volatile boolean f67682d;

        C16744b(Runnable runnable, C16745c cVar) {
            this.f67680a = runnable;
            this.f67681c = cVar;
        }

        public void dispose() {
            this.f67682d = true;
            this.f67681c.dispose();
        }

        public boolean isDisposed() {
            return this.f67682d;
        }

        public void run() {
            if (!this.f67682d) {
                try {
                    this.f67680a.run();
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    this.f67681c.dispose();
                    throw C13221g.m85550d(th);
                }
            }
        }
    }

    /* renamed from: v9.o$c */
    /* compiled from: Scheduler */
    public static abstract class C16745c implements C17071b {

        /* renamed from: v9.o$c$a */
        /* compiled from: Scheduler */
        final class C16746a implements Runnable {

            /* renamed from: a */
            final Runnable f67683a;

            /* renamed from: c */
            final C11166e f67684c;

            /* renamed from: d */
            final long f67685d;

            /* renamed from: f */
            long f67686f;

            /* renamed from: g */
            long f67687g;

            /* renamed from: o */
            long f67688o;

            C16746a(long j, Runnable runnable, long j2, C11166e eVar, long j3) {
                this.f67683a = runnable;
                this.f67684c = eVar;
                this.f67685d = j3;
                this.f67687g = j2;
                this.f67688o = j;
            }

            public void run() {
                long j;
                this.f67683a.run();
                if (!this.f67684c.isDisposed()) {
                    C16745c cVar = C16745c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a = cVar.mo79719a(timeUnit);
                    long j2 = C16742o.f67676a;
                    long j3 = this.f67687g;
                    if (a + j2 >= j3) {
                        long j4 = this.f67685d;
                        if (a < j3 + j4 + j2) {
                            long j5 = this.f67688o;
                            long j6 = this.f67686f + 1;
                            this.f67686f = j6;
                            j = j5 + (j6 * j4);
                            this.f67687g = a;
                            this.f67684c.mo62369a(C16745c.this.mo69997c(this, j - a, timeUnit));
                        }
                    }
                    long j7 = this.f67685d;
                    long j8 = a + j7;
                    long j9 = this.f67686f + 1;
                    this.f67686f = j9;
                    this.f67688o = j8 - (j7 * j9);
                    j = j8;
                    this.f67687g = a;
                    this.f67684c.mo62369a(C16745c.this.mo69997c(this, j - a, timeUnit));
                }
            }
        }

        /* renamed from: a */
        public long mo79719a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public C17071b mo69996b(Runnable runnable) {
            return mo69997c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract C17071b mo69997c(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: d */
        public C17071b mo79720d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C11166e eVar = new C11166e();
            C11166e eVar2 = new C11166e(eVar);
            Runnable r = C12251a.m82987r(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a = mo79719a(TimeUnit.NANOSECONDS);
            C11166e eVar3 = eVar;
            C16746a aVar = r0;
            C16746a aVar2 = new C16746a(a + timeUnit2.toNanos(j3), r, a, eVar2, nanos);
            C17071b c = mo69997c(aVar, j3, timeUnit2);
            if (c == C11164c.INSTANCE) {
                return c;
            }
            eVar3.mo62369a(c);
            return eVar2;
        }
    }

    /* renamed from: a */
    public abstract C16745c mo69992a();

    /* renamed from: b */
    public C17071b mo70027b(Runnable runnable) {
        return mo69993c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public C17071b mo69993c(Runnable runnable, long j, TimeUnit timeUnit) {
        C16745c a = mo69992a();
        C16743a aVar = new C16743a(C12251a.m82987r(runnable), a);
        a.mo69997c(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: d */
    public C17071b mo69994d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C16745c a = mo69992a();
        C16744b bVar = new C16744b(C12251a.m82987r(runnable), a);
        C17071b d = a.mo79720d(bVar, j, j2, timeUnit);
        return d == C11164c.INSTANCE ? d : bVar;
    }
}

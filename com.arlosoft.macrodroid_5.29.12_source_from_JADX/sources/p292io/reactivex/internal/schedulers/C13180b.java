package p292io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11164c;
import p223ca.C11165d;
import p414v9.C16742o;
import p448z9.C17070a;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.schedulers.b */
/* compiled from: ComputationScheduler */
public final class C13180b extends C16742o {

    /* renamed from: d */
    static final C13182b f61027d;

    /* renamed from: e */
    static final C13191g f61028e;

    /* renamed from: f */
    static final int f61029f = m85462e(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final C13183c f61030g;

    /* renamed from: b */
    final ThreadFactory f61031b;

    /* renamed from: c */
    final AtomicReference<C13182b> f61032c;

    /* renamed from: io.reactivex.internal.schedulers.b$a */
    /* compiled from: ComputationScheduler */
    static final class C13181a extends C16742o.C16745c {

        /* renamed from: a */
        private final C11165d f61033a;

        /* renamed from: c */
        private final C17070a f61034c;

        /* renamed from: d */
        private final C11165d f61035d;

        /* renamed from: f */
        private final C13183c f61036f;

        /* renamed from: g */
        volatile boolean f61037g;

        C13181a(C13183c cVar) {
            this.f61036f = cVar;
            C11165d dVar = new C11165d();
            this.f61033a = dVar;
            C17070a aVar = new C17070a();
            this.f61034c = aVar;
            C11165d dVar2 = new C11165d();
            this.f61035d = dVar2;
            dVar2.mo62358a(dVar);
            dVar2.mo62358a(aVar);
        }

        /* renamed from: b */
        public C17071b mo69996b(Runnable runnable) {
            if (this.f61037g) {
                return C11164c.INSTANCE;
            }
            return this.f61036f.mo70013e(runnable, 0, TimeUnit.MILLISECONDS, this.f61033a);
        }

        /* renamed from: c */
        public C17071b mo69997c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f61037g) {
                return C11164c.INSTANCE;
            }
            return this.f61036f.mo70013e(runnable, j, timeUnit, this.f61034c);
        }

        public void dispose() {
            if (!this.f61037g) {
                this.f61037g = true;
                this.f61035d.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f61037g;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.b$b */
    /* compiled from: ComputationScheduler */
    static final class C13182b {

        /* renamed from: a */
        final int f61038a;

        /* renamed from: b */
        final C13183c[] f61039b;

        /* renamed from: c */
        long f61040c;

        C13182b(int i, ThreadFactory threadFactory) {
            this.f61038a = i;
            this.f61039b = new C13183c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f61039b[i2] = new C13183c(threadFactory);
            }
        }

        /* renamed from: a */
        public C13183c mo69998a() {
            int i = this.f61038a;
            if (i == 0) {
                return C13180b.f61030g;
            }
            C13183c[] cVarArr = this.f61039b;
            long j = this.f61040c;
            this.f61040c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo69999b() {
            for (C13183c dispose : this.f61039b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.b$c */
    /* compiled from: ComputationScheduler */
    static final class C13183c extends C13190f {
        C13183c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C13183c cVar = new C13183c(new C13191g("RxComputationShutdown"));
        f61030g = cVar;
        cVar.dispose();
        C13191g gVar = new C13191g("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f61028e = gVar;
        C13182b bVar = new C13182b(0, gVar);
        f61027d = bVar;
        bVar.mo69999b();
    }

    public C13180b() {
        this(f61028e);
    }

    /* renamed from: e */
    static int m85462e(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public C16742o.C16745c mo69992a() {
        return new C13181a(this.f61032c.get().mo69998a());
    }

    /* renamed from: c */
    public C17071b mo69993c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f61032c.get().mo69998a().mo70014f(runnable, j, timeUnit);
    }

    /* renamed from: d */
    public C17071b mo69994d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f61032c.get().mo69998a().mo70015g(runnable, j, j2, timeUnit);
    }

    /* renamed from: f */
    public void mo69995f() {
        C13182b bVar = new C13182b(f61029f, this.f61031b);
        if (!this.f61032c.compareAndSet(f61027d, bVar)) {
            bVar.mo69999b();
        }
    }

    public C13180b(ThreadFactory threadFactory) {
        this.f61031b = threadFactory;
        this.f61032c = new AtomicReference<>(f61027d);
        mo69995f();
    }
}

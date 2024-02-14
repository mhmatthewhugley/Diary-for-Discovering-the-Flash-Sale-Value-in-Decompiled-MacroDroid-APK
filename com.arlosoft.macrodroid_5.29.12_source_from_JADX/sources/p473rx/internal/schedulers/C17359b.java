package p473rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p459ef.C17158f;
import p459ef.C17163i;
import p464jf.C17176a;
import p470pf.C17223b;
import p470pf.C17225d;
import p473rx.internal.util.C17383e;
import p473rx.internal.util.C17391g;

/* renamed from: rx.internal.schedulers.b */
/* compiled from: EventLoopsScheduler */
public final class C17359b extends C17158f implements C17374h {

    /* renamed from: d */
    static final int f69086d;

    /* renamed from: e */
    static final C17364c f69087e;

    /* renamed from: f */
    static final C17363b f69088f = new C17363b((ThreadFactory) null, 0);

    /* renamed from: b */
    final ThreadFactory f69089b;

    /* renamed from: c */
    final AtomicReference<C17363b> f69090c = new AtomicReference<>(f69088f);

    /* renamed from: rx.internal.schedulers.b$a */
    /* compiled from: EventLoopsScheduler */
    static final class C17360a extends C17158f.C17159a {

        /* renamed from: a */
        private final C17391g f69091a;

        /* renamed from: c */
        private final C17223b f69092c;

        /* renamed from: d */
        private final C17391g f69093d;

        /* renamed from: f */
        private final C17364c f69094f;

        /* renamed from: rx.internal.schedulers.b$a$a */
        /* compiled from: EventLoopsScheduler */
        class C17361a implements C17176a {

            /* renamed from: a */
            final /* synthetic */ C17176a f69095a;

            C17361a(C17176a aVar) {
                this.f69095a = aVar;
            }

            public void call() {
                if (!C17360a.this.mo80449b()) {
                    this.f69095a.call();
                }
            }
        }

        /* renamed from: rx.internal.schedulers.b$a$b */
        /* compiled from: EventLoopsScheduler */
        class C17362b implements C17176a {

            /* renamed from: a */
            final /* synthetic */ C17176a f69097a;

            C17362b(C17176a aVar) {
                this.f69097a = aVar;
            }

            public void call() {
                if (!C17360a.this.mo80449b()) {
                    this.f69097a.call();
                }
            }
        }

        C17360a(C17364c cVar) {
            C17391g gVar = new C17391g();
            this.f69091a = gVar;
            C17223b bVar = new C17223b();
            this.f69092c = bVar;
            this.f69093d = new C17391g(gVar, bVar);
            this.f69094f = cVar;
        }

        /* renamed from: a */
        public C17163i mo80446a(C17176a aVar) {
            if (mo80449b()) {
                return C17225d.m100809b();
            }
            return this.f69094f.mo80688k(new C17361a(aVar), 0, (TimeUnit) null, this.f69091a);
        }

        /* renamed from: b */
        public boolean mo80449b() {
            return this.f69093d.mo80449b();
        }

        /* renamed from: c */
        public C17163i mo80447c(C17176a aVar, long j, TimeUnit timeUnit) {
            if (mo80449b()) {
                return C17225d.m100809b();
            }
            return this.f69094f.mo80687j(new C17362b(aVar), j, timeUnit, this.f69092c);
        }

        /* renamed from: d */
        public void mo80450d() {
            this.f69093d.mo80450d();
        }
    }

    /* renamed from: rx.internal.schedulers.b$b */
    /* compiled from: EventLoopsScheduler */
    static final class C17363b {

        /* renamed from: a */
        final int f69099a;

        /* renamed from: b */
        final C17364c[] f69100b;

        /* renamed from: c */
        long f69101c;

        C17363b(ThreadFactory threadFactory, int i) {
            this.f69099a = i;
            this.f69100b = new C17364c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f69100b[i2] = new C17364c(threadFactory);
            }
        }

        /* renamed from: a */
        public C17364c mo80683a() {
            int i = this.f69099a;
            if (i == 0) {
                return C17359b.f69087e;
            }
            C17364c[] cVarArr = this.f69100b;
            long j = this.f69101c;
            this.f69101c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo80684b() {
            for (C17364c d : this.f69100b) {
                d.mo80450d();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.b$c */
    /* compiled from: EventLoopsScheduler */
    static final class C17364c extends C17368f {
        C17364c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f69086d = intValue;
        C17364c cVar = new C17364c(C17383e.f69137a);
        f69087e = cVar;
        cVar.mo80450d();
    }

    public C17359b(ThreadFactory threadFactory) {
        this.f69089b = threadFactory;
        mo80682c();
    }

    /* renamed from: a */
    public C17158f.C17159a mo80445a() {
        return new C17360a(this.f69090c.get().mo80683a());
    }

    /* renamed from: b */
    public C17163i mo80681b(C17176a aVar) {
        return this.f69090c.get().mo80683a().mo80686i(aVar, -1, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public void mo80682c() {
        C17363b bVar = new C17363b(this.f69089b, f69086d);
        if (!this.f69090c.compareAndSet(f69088f, bVar)) {
            bVar.mo80684b();
        }
    }

    public void shutdown() {
        C17363b bVar;
        C17363b bVar2;
        do {
            bVar = this.f69090c.get();
            bVar2 = f69088f;
            if (bVar == bVar2) {
                return;
            }
        } while (!this.f69090c.compareAndSet(bVar, bVar2));
        bVar.mo80684b();
    }
}

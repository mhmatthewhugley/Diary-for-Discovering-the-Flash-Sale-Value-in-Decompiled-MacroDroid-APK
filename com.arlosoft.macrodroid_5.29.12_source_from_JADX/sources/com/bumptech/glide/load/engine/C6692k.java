package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C6674h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p063b5.C2254g;
import p090f5.C7308e;
import p090f5.C7315j;
import p096g5.C7339a;
import p096g5.C7348c;
import p102h4.C7376a;
import p102h4.C7380e;
import p120k4.C7587c;
import p137n4.C7977a;

/* renamed from: com.bumptech.glide.load.engine.k */
/* compiled from: EngineJob */
class C6692k<R> implements C6674h.C6676b<R>, C7339a.C7345f {

    /* renamed from: O */
    private static final C6695c f15622O = new C6695c();

    /* renamed from: A */
    private final AtomicInteger f15623A;

    /* renamed from: B */
    private C7380e f15624B;

    /* renamed from: C */
    private boolean f15625C;

    /* renamed from: D */
    private boolean f15626D;

    /* renamed from: E */
    private boolean f15627E;

    /* renamed from: F */
    private boolean f15628F;

    /* renamed from: G */
    private C7587c<?> f15629G;

    /* renamed from: H */
    C7376a f15630H;

    /* renamed from: I */
    private boolean f15631I;

    /* renamed from: J */
    GlideException f15632J;

    /* renamed from: K */
    private boolean f15633K;

    /* renamed from: L */
    C6701o<?> f15634L;

    /* renamed from: M */
    private C6674h<R> f15635M;

    /* renamed from: N */
    private volatile boolean f15636N;

    /* renamed from: a */
    final C6697e f15637a;

    /* renamed from: c */
    private final C7348c f15638c;

    /* renamed from: d */
    private final Pools.Pool<C6692k<?>> f15639d;

    /* renamed from: f */
    private final C6695c f15640f;

    /* renamed from: g */
    private final C6698l f15641g;

    /* renamed from: o */
    private final C7977a f15642o;

    /* renamed from: p */
    private final C7977a f15643p;

    /* renamed from: s */
    private final C7977a f15644s;

    /* renamed from: z */
    private final C7977a f15645z;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    /* compiled from: EngineJob */
    private class C6693a implements Runnable {

        /* renamed from: a */
        private final C2254g f15646a;

        C6693a(C2254g gVar) {
            this.f15646a = gVar;
        }

        public void run() {
            synchronized (C6692k.this) {
                if (C6692k.this.f15637a.mo33094d(this.f15646a)) {
                    C6692k.this.mo33076e(this.f15646a);
                }
                C6692k.this.mo33079h();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$b */
    /* compiled from: EngineJob */
    private class C6694b implements Runnable {

        /* renamed from: a */
        private final C2254g f15648a;

        C6694b(C2254g gVar) {
            this.f15648a = gVar;
        }

        public void run() {
            synchronized (C6692k.this) {
                if (C6692k.this.f15637a.mo33094d(this.f15648a)) {
                    C6692k.this.f15634L.mo33102a();
                    C6692k.this.mo33077f(this.f15648a);
                    C6692k.this.mo33085r(this.f15648a);
                }
                C6692k.this.mo33079h();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.k$c */
    /* compiled from: EngineJob */
    static class C6695c {
        C6695c() {
        }

        /* renamed from: a */
        public <R> C6701o<R> mo33089a(C7587c<R> cVar, boolean z) {
            return new C6701o<>(cVar, z, true);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$d */
    /* compiled from: EngineJob */
    static final class C6696d {

        /* renamed from: a */
        final C2254g f15650a;

        /* renamed from: b */
        final Executor f15651b;

        C6696d(C2254g gVar, Executor executor) {
            this.f15650a = gVar;
            this.f15651b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6696d) {
                return this.f15650a.equals(((C6696d) obj).f15650a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15650a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$e */
    /* compiled from: EngineJob */
    static final class C6697e implements Iterable<C6696d> {

        /* renamed from: a */
        private final List<C6696d> f15652a;

        C6697e() {
            this(new ArrayList(2));
        }

        /* renamed from: h */
        private static C6696d m25376h(C2254g gVar) {
            return new C6696d(gVar, C7308e.m30185a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo33092c(C2254g gVar, Executor executor) {
            this.f15652a.add(new C6696d(gVar, executor));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f15652a.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo33094d(C2254g gVar) {
            return this.f15652a.contains(m25376h(gVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C6697e mo33095f() {
            return new C6697e(new ArrayList(this.f15652a));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo33096i(C2254g gVar) {
            this.f15652a.remove(m25376h(gVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f15652a.isEmpty();
        }

        @NonNull
        public Iterator<C6696d> iterator() {
            return this.f15652a.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f15652a.size();
        }

        C6697e(List<C6696d> list) {
            this.f15652a = list;
        }
    }

    C6692k(C7977a aVar, C7977a aVar2, C7977a aVar3, C7977a aVar4, C6698l lVar, Pools.Pool<C6692k<?>> pool) {
        this(aVar, aVar2, aVar3, aVar4, lVar, pool, f15622O);
    }

    /* renamed from: j */
    private C7977a m25356j() {
        if (this.f15626D) {
            return this.f15644s;
        }
        return this.f15627E ? this.f15645z : this.f15643p;
    }

    /* renamed from: m */
    private boolean m25357m() {
        return this.f15633K || this.f15631I || this.f15636N;
    }

    /* renamed from: q */
    private synchronized void m25358q() {
        if (this.f15624B != null) {
            this.f15637a.clear();
            this.f15624B = null;
            this.f15634L = null;
            this.f15629G = null;
            this.f15633K = false;
            this.f15636N = false;
            this.f15631I = false;
            this.f15635M.mo33042E(false);
            this.f15635M = null;
            this.f15632J = null;
            this.f15630H = null;
            this.f15639d.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo33049a(C7587c<R> cVar, C7376a aVar) {
        synchronized (this) {
            this.f15629G = cVar;
            this.f15630H = aVar;
        }
        mo33083o();
    }

    /* renamed from: b */
    public void mo33050b(GlideException glideException) {
        synchronized (this) {
            this.f15632J = glideException;
        }
        mo33082n();
    }

    /* renamed from: c */
    public void mo33051c(C6674h<?> hVar) {
        m25356j().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo33075d(C2254g gVar, Executor executor) {
        this.f15638c.mo37326c();
        this.f15637a.mo33092c(gVar, executor);
        boolean z = true;
        if (this.f15631I) {
            mo33080k(1);
            executor.execute(new C6694b(gVar));
        } else if (this.f15633K) {
            mo33080k(1);
            executor.execute(new C6693a(gVar));
        } else {
            if (this.f15636N) {
                z = false;
            }
            C7315j.m30201a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo33076e(C2254g gVar) {
        try {
            gVar.mo24545b(this.f15632J);
        } catch (Throwable th) {
            throw new C6667b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo33077f(C2254g gVar) {
        try {
            gVar.mo24544a(this.f15634L, this.f15630H);
        } catch (Throwable th) {
            throw new C6667b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo33078g() {
        if (!m25357m()) {
            this.f15636N = true;
            this.f15635M.mo33045e();
            this.f15641g.mo33065b(this, this.f15624B);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized void mo33079h() {
        this.f15638c.mo37326c();
        C7315j.m30201a(m25357m(), "Not yet complete!");
        int decrementAndGet = this.f15623A.decrementAndGet();
        C7315j.m30201a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            C6701o<?> oVar = this.f15634L;
            if (oVar != null) {
                oVar.mo33106e();
            }
            m25358q();
        }
    }

    @NonNull
    /* renamed from: i */
    public C7348c mo24547i() {
        return this.f15638c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo33080k(int i) {
        C6701o<?> oVar;
        C7315j.m30201a(m25357m(), "Not yet complete!");
        if (this.f15623A.getAndAdd(i) == 0 && (oVar = this.f15634L) != null) {
            oVar.mo33102a();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: l */
    public synchronized C6692k<R> mo33081l(C7380e eVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f15624B = eVar;
        this.f15625C = z;
        this.f15626D = z2;
        this.f15627E = z3;
        this.f15628F = z4;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f15641g.mo33067d(r4, r1, (com.bumptech.glide.load.engine.C6701o<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f15651b.execute(new com.bumptech.glide.load.engine.C6692k.C6693a(r4, r1.f15650a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo33079h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33082n() {
        /*
            r4 = this;
            monitor-enter(r4)
            g5.c r0 = r4.f15638c     // Catch:{ all -> 0x0066 }
            r0.mo37326c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f15636N     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m25358q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.engine.k$e r0 = r4.f15637a     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f15633K     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f15633K = r0     // Catch:{ all -> 0x0066 }
            h4.e r1 = r4.f15624B     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r4.f15637a     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r2.mo33095f()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo33080k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.l r0 = r4.f15641g
            r3 = 0
            r0.mo33067d(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.C6692k.C6696d) r1
            java.util.concurrent.Executor r2 = r1.f15651b
            com.bumptech.glide.load.engine.k$a r3 = new com.bumptech.glide.load.engine.k$a
            b5.g r1 = r1.f15650a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo33079h()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6692k.mo33082n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r4.f15641g.mo33067d(r4, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r0.hasNext() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r1 = r0.next();
        r1.f15651b.execute(new com.bumptech.glide.load.engine.C6692k.C6694b(r4, r1.f15650a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        mo33079h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33083o() {
        /*
            r4 = this;
            monitor-enter(r4)
            g5.c r0 = r4.f15638c     // Catch:{ all -> 0x0078 }
            r0.mo37326c()     // Catch:{ all -> 0x0078 }
            boolean r0 = r4.f15636N     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0014
            k4.c<?> r0 = r4.f15629G     // Catch:{ all -> 0x0078 }
            r0.recycle()     // Catch:{ all -> 0x0078 }
            r4.m25358q()     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            return
        L_0x0014:
            com.bumptech.glide.load.engine.k$e r0 = r4.f15637a     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0070
            boolean r0 = r4.f15631I     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0068
            com.bumptech.glide.load.engine.k$c r0 = r4.f15640f     // Catch:{ all -> 0x0078 }
            k4.c<?> r1 = r4.f15629G     // Catch:{ all -> 0x0078 }
            boolean r2 = r4.f15625C     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.o r0 = r0.mo33089a(r1, r2)     // Catch:{ all -> 0x0078 }
            r4.f15634L = r0     // Catch:{ all -> 0x0078 }
            r0 = 1
            r4.f15631I = r0     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.k$e r1 = r4.f15637a     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.k$e r1 = r1.mo33095f()     // Catch:{ all -> 0x0078 }
            int r2 = r1.size()     // Catch:{ all -> 0x0078 }
            int r2 = r2 + r0
            r4.mo33080k(r2)     // Catch:{ all -> 0x0078 }
            h4.e r0 = r4.f15624B     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.o<?> r2 = r4.f15634L     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.l r3 = r4.f15641g
            r3.mo33067d(r4, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.C6692k.C6696d) r1
            java.util.concurrent.Executor r2 = r1.f15651b
            com.bumptech.glide.load.engine.k$b r3 = new com.bumptech.glide.load.engine.k$b
            b5.g r1 = r1.f15650a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004b
        L_0x0064:
            r4.mo33079h()
            return
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6692k.mo33083o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo33084p() {
        return this.f15628F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo33085r(C2254g gVar) {
        boolean z;
        this.f15638c.mo37326c();
        this.f15637a.mo33096i(gVar);
        if (this.f15637a.isEmpty()) {
            mo33078g();
            if (!this.f15631I) {
                if (!this.f15633K) {
                    z = false;
                    if (z && this.f15623A.get() == 0) {
                        m25358q();
                    }
                }
            }
            z = true;
            m25358q();
        }
    }

    /* renamed from: s */
    public synchronized void mo33086s(C6674h<R> hVar) {
        C7977a aVar;
        this.f15635M = hVar;
        if (hVar.mo33043K()) {
            aVar = this.f15642o;
        } else {
            aVar = m25356j();
        }
        aVar.execute(hVar);
    }

    @VisibleForTesting
    C6692k(C7977a aVar, C7977a aVar2, C7977a aVar3, C7977a aVar4, C6698l lVar, Pools.Pool<C6692k<?>> pool, C6695c cVar) {
        this.f15637a = new C6697e();
        this.f15638c = C7348c.m30358a();
        this.f15623A = new AtomicInteger();
        this.f15642o = aVar;
        this.f15643p = aVar2;
        this.f15644s = aVar3;
        this.f15645z = aVar4;
        this.f15641g = lVar;
        this.f15639d = pool;
        this.f15640f = cVar;
    }
}

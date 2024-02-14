package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12550d1;
import p292io.grpc.C12560f0;
import p292io.grpc.C12910l0;
import p292io.grpc.C12952q;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.internal.C12688g1;

/* renamed from: io.grpc.internal.z */
/* compiled from: DelayedClientTransport */
final class C12881z implements C12688g1 {

    /* renamed from: a */
    private final C12560f0 f60391a = C12560f0.m83768a(C12881z.class, (String) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f60392b = new Object();

    /* renamed from: c */
    private final Executor f60393c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12550d1 f60394d;

    /* renamed from: e */
    private Runnable f60395e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f60396f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Runnable f60397g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C12688g1.C12689a f60398h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Collection<C12887f> f60399i = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C12537b1 f60400j;

    /* renamed from: k */
    private C12910l0.C12921i f60401k;

    /* renamed from: l */
    private long f60402l;

    /* renamed from: io.grpc.internal.z$a */
    /* compiled from: DelayedClientTransport */
    class C12882a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12688g1.C12689a f60403a;

        C12882a(C12688g1.C12689a aVar) {
            this.f60403a = aVar;
        }

        public void run() {
            this.f60403a.mo69298c(true);
        }
    }

    /* renamed from: io.grpc.internal.z$b */
    /* compiled from: DelayedClientTransport */
    class C12883b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12688g1.C12689a f60405a;

        C12883b(C12688g1.C12689a aVar) {
            this.f60405a = aVar;
        }

        public void run() {
            this.f60405a.mo69298c(false);
        }
    }

    /* renamed from: io.grpc.internal.z$c */
    /* compiled from: DelayedClientTransport */
    class C12884c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12688g1.C12689a f60407a;

        C12884c(C12688g1.C12689a aVar) {
            this.f60407a = aVar;
        }

        public void run() {
            this.f60407a.mo69299d();
        }
    }

    /* renamed from: io.grpc.internal.z$d */
    /* compiled from: DelayedClientTransport */
    class C12885d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12537b1 f60409a;

        C12885d(C12537b1 b1Var) {
            this.f60409a = b1Var;
        }

        public void run() {
            C12881z.this.f60398h.mo69296a(this.f60409a);
        }
    }

    /* renamed from: io.grpc.internal.z$e */
    /* compiled from: DelayedClientTransport */
    class C12886e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12887f f60411a;

        /* renamed from: c */
        final /* synthetic */ C12793s f60412c;

        C12886e(C12887f fVar, C12793s sVar) {
            this.f60411a = fVar;
            this.f60412c = sVar;
        }

        public void run() {
            this.f60411a.m84827u(this.f60412c);
        }
    }

    /* renamed from: io.grpc.internal.z$f */
    /* compiled from: DelayedClientTransport */
    private class C12887f extends C12575a0 {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final C12910l0.C12917f f60414i;

        /* renamed from: j */
        private final C12952q f60415j;

        /* synthetic */ C12887f(C12881z zVar, C12910l0.C12917f fVar, C12882a aVar) {
            this(fVar);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: private */
        /* renamed from: u */
        public void m84827u(C12793s sVar) {
            C12952q c = this.f60415j.mo69748c();
            try {
                C12781q g = sVar.mo69389g(this.f60414i.mo69526c(), this.f60414i.mo69525b(), this.f60414i.mo69524a());
                this.f60415j.mo69751j(c);
                mo69180r(g);
            } catch (Throwable th) {
                this.f60415j.mo69751j(c);
                throw th;
            }
        }

        /* renamed from: e */
        public void mo69141e(C12537b1 b1Var) {
            super.mo69141e(b1Var);
            synchronized (C12881z.this.f60392b) {
                if (C12881z.this.f60397g != null) {
                    boolean remove = C12881z.this.f60399i.remove(this);
                    if (!C12881z.this.mo69639q() && remove) {
                        C12881z.this.f60394d.mo69117b(C12881z.this.f60396f);
                        if (C12881z.this.f60400j != null) {
                            C12881z.this.f60394d.mo69117b(C12881z.this.f60397g);
                            Runnable unused = C12881z.this.f60397g = null;
                        }
                    }
                }
            }
            C12881z.this.f60394d.mo69116a();
        }

        private C12887f(C12910l0.C12917f fVar) {
            this.f60415j = C12952q.m85032i();
            this.f60414i = fVar;
        }
    }

    C12881z(Executor executor, C12550d1 d1Var) {
        this.f60393c = executor;
        this.f60394d = d1Var;
    }

    /* renamed from: o */
    private C12887f m84816o(C12910l0.C12917f fVar) {
        C12887f fVar2 = new C12887f(this, fVar, (C12882a) null);
        this.f60399i.add(fVar2);
        if (mo69638p() == 1) {
            this.f60394d.mo69117b(this.f60395e);
        }
        return fVar2;
    }

    /* renamed from: b */
    public final void mo69405b(C12537b1 b1Var) {
        Collection<C12887f> collection;
        Runnable runnable;
        mo69406e(b1Var);
        synchronized (this.f60392b) {
            collection = this.f60399i;
            runnable = this.f60397g;
            this.f60397g = null;
            if (!collection.isEmpty()) {
                this.f60399i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (C12887f e : collection) {
                e.mo69141e(b1Var);
            }
            this.f60394d.execute(runnable);
        }
    }

    /* renamed from: c */
    public C12560f0 mo69268c() {
        return this.f60391a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3.f60394d.mo69116a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69406e(p292io.grpc.C12537b1 r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f60392b
            monitor-enter(r0)
            io.grpc.b1 r1 = r3.f60400j     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0009:
            r3.f60400j = r4     // Catch:{ all -> 0x002e }
            io.grpc.d1 r1 = r3.f60394d     // Catch:{ all -> 0x002e }
            io.grpc.internal.z$d r2 = new io.grpc.internal.z$d     // Catch:{ all -> 0x002e }
            r2.<init>(r4)     // Catch:{ all -> 0x002e }
            r1.mo69117b(r2)     // Catch:{ all -> 0x002e }
            boolean r4 = r3.mo69639q()     // Catch:{ all -> 0x002e }
            if (r4 != 0) goto L_0x0027
            java.lang.Runnable r4 = r3.f60397g     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x0027
            io.grpc.d1 r1 = r3.f60394d     // Catch:{ all -> 0x002e }
            r1.mo69117b(r4)     // Catch:{ all -> 0x002e }
            r4 = 0
            r3.f60397g = r4     // Catch:{ all -> 0x002e }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            io.grpc.d1 r4 = r3.f60394d
            r4.mo69116a()
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12881z.mo69406e(io.grpc.b1):void");
    }

    /* renamed from: f */
    public final Runnable mo69407f(C12688g1.C12689a aVar) {
        this.f60398h = aVar;
        this.f60395e = new C12882a(aVar);
        this.f60396f = new C12883b(aVar);
        this.f60397g = new C12884c(aVar);
        return null;
    }

    /* renamed from: g */
    public final C12781q mo69389g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
        C12781q e0Var;
        try {
            C12784q1 q1Var = new C12784q1(r0Var, q0Var, cVar);
            C12910l0.C12921i iVar = null;
            long j = -1;
            while (true) {
                synchronized (this.f60392b) {
                    if (this.f60400j == null) {
                        C12910l0.C12921i iVar2 = this.f60401k;
                        if (iVar2 != null) {
                            if (iVar != null && j == this.f60402l) {
                                e0Var = m84816o(q1Var);
                                break;
                            }
                            j = this.f60402l;
                            C12793s g = C12749o0.m84365g(iVar2.mo69281a(q1Var), cVar.mo69085j());
                            if (g != null) {
                                e0Var = g.mo69389g(q1Var.mo69526c(), q1Var.mo69525b(), q1Var.mo69524a());
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            e0Var = m84816o(q1Var);
                            break;
                        }
                    } else {
                        e0Var = new C12666e0(this.f60400j);
                        break;
                    }
                }
            }
            this.f60394d.mo69116a();
            return e0Var;
        } catch (Throwable th) {
            this.f60394d.mo69116a();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: p */
    public final int mo69638p() {
        int size;
        synchronized (this.f60392b) {
            size = this.f60399i.size();
        }
        return size;
    }

    /* renamed from: q */
    public final boolean mo69639q() {
        boolean z;
        synchronized (this.f60392b) {
            z = !this.f60399i.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1.hasNext() == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r2 = (p292io.grpc.internal.C12881z.C12887f) r1.next();
        r3 = r8.mo69281a(p292io.grpc.internal.C12881z.C12887f.m84825s(r2));
        r4 = p292io.grpc.internal.C12881z.C12887f.m84825s(r2).mo69524a();
        r3 = p292io.grpc.internal.C12749o0.m84365g(r3, r4.mo69085j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r3 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r5 = r7.f60393c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4.mo69080e() == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r5 = r4.mo69080e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r5.execute(new p292io.grpc.internal.C12881z.C12886e(r7, r2, r3));
        r0.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r8 = r7.f60392b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (mo69639q() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r7.f60399i.removeAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r7.f60399i.isEmpty() == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        r7.f60399i = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (mo69639q() != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r7.f60394d.mo69117b(r7.f60396f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r7.f60400j == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        r0 = r7.f60397g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (r0 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        r7.f60394d.mo69117b(r0);
        r7.f60397g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r7.f60394d.mo69116a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69640r(p292io.grpc.C12910l0.C12921i r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f60392b
            monitor-enter(r0)
            r7.f60401k = r8     // Catch:{ all -> 0x00ad }
            long r1 = r7.f60402l     // Catch:{ all -> 0x00ad }
            r3 = 1
            long r1 = r1 + r3
            r7.f60402l = r1     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00ab
            boolean r1 = r7.mo69639q()     // Catch:{ all -> 0x00ad }
            if (r1 != 0) goto L_0x0016
            goto L_0x00ab
        L_0x0016:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ad }
            java.util.Collection<io.grpc.internal.z$f> r2 = r7.f60399i     // Catch:{ all -> 0x00ad }
            r1.<init>(r2)     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r1.next()
            io.grpc.internal.z$f r2 = (p292io.grpc.internal.C12881z.C12887f) r2
            io.grpc.l0$f r3 = r2.f60414i
            io.grpc.l0$e r3 = r8.mo69281a(r3)
            io.grpc.l0$f r4 = r2.f60414i
            io.grpc.c r4 = r4.mo69524a()
            boolean r5 = r4.mo69085j()
            io.grpc.internal.s r3 = p292io.grpc.internal.C12749o0.m84365g(r3, r5)
            if (r3 == 0) goto L_0x0027
            java.util.concurrent.Executor r5 = r7.f60393c
            java.util.concurrent.Executor r6 = r4.mo69080e()
            if (r6 == 0) goto L_0x0059
            java.util.concurrent.Executor r5 = r4.mo69080e()
        L_0x0059:
            io.grpc.internal.z$e r4 = new io.grpc.internal.z$e
            r4.<init>(r2, r3)
            r5.execute(r4)
            r0.add(r2)
            goto L_0x0027
        L_0x0065:
            java.lang.Object r8 = r7.f60392b
            monitor-enter(r8)
            boolean r1 = r7.mo69639q()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x0070
            monitor-exit(r8)     // Catch:{ all -> 0x00a8 }
            return
        L_0x0070:
            java.util.Collection<io.grpc.internal.z$f> r1 = r7.f60399i     // Catch:{ all -> 0x00a8 }
            r1.removeAll(r0)     // Catch:{ all -> 0x00a8 }
            java.util.Collection<io.grpc.internal.z$f> r0 = r7.f60399i     // Catch:{ all -> 0x00a8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0084
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x00a8 }
            r0.<init>()     // Catch:{ all -> 0x00a8 }
            r7.f60399i = r0     // Catch:{ all -> 0x00a8 }
        L_0x0084:
            boolean r0 = r7.mo69639q()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x00a1
            io.grpc.d1 r0 = r7.f60394d     // Catch:{ all -> 0x00a8 }
            java.lang.Runnable r1 = r7.f60396f     // Catch:{ all -> 0x00a8 }
            r0.mo69117b(r1)     // Catch:{ all -> 0x00a8 }
            io.grpc.b1 r0 = r7.f60400j     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00a1
            java.lang.Runnable r0 = r7.f60397g     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00a1
            io.grpc.d1 r1 = r7.f60394d     // Catch:{ all -> 0x00a8 }
            r1.mo69117b(r0)     // Catch:{ all -> 0x00a8 }
            r0 = 0
            r7.f60397g = r0     // Catch:{ all -> 0x00a8 }
        L_0x00a1:
            monitor-exit(r8)     // Catch:{ all -> 0x00a8 }
            io.grpc.d1 r8 = r7.f60394d
            r8.mo69116a()
            return
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00a8 }
            throw r0
        L_0x00ab:
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            return
        L_0x00ad:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12881z.mo69640r(io.grpc.l0$i):void");
    }
}

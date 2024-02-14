package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p292io.grpc.C12537b1;
import p292io.grpc.C12909l;
import p292io.grpc.C12960q0;
import p292io.grpc.C12977s;
import p292io.grpc.C12997u;
import p292io.grpc.internal.C12690g2;
import p292io.grpc.internal.C12785r;

/* renamed from: io.grpc.internal.a0 */
/* compiled from: DelayedStream */
class C12575a0 implements C12781q {

    /* renamed from: a */
    private volatile boolean f59532a;

    /* renamed from: b */
    private C12785r f59533b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12781q f59534c;

    /* renamed from: d */
    private C12537b1 f59535d;

    /* renamed from: e */
    private List<Runnable> f59536e = new ArrayList();

    /* renamed from: f */
    private C12589n f59537f;

    /* renamed from: g */
    private long f59538g;

    /* renamed from: h */
    private long f59539h;

    /* renamed from: io.grpc.internal.a0$a */
    /* compiled from: DelayedStream */
    class C12576a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f59540a;

        C12576a(int i) {
            this.f59540a = i;
        }

        public void run() {
            C12575a0.this.f59534c.mo69138b(this.f59540a);
        }
    }

    /* renamed from: io.grpc.internal.a0$b */
    /* compiled from: DelayedStream */
    class C12577b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12909l f59542a;

        C12577b(C12909l lVar) {
            this.f59542a = lVar;
        }

        public void run() {
            C12575a0.this.f59534c.mo69176a(this.f59542a);
        }
    }

    /* renamed from: io.grpc.internal.a0$c */
    /* compiled from: DelayedStream */
    class C12578c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f59544a;

        C12578c(boolean z) {
            this.f59544a = z;
        }

        public void run() {
            C12575a0.this.f59534c.mo69143h(this.f59544a);
        }
    }

    /* renamed from: io.grpc.internal.a0$d */
    /* compiled from: DelayedStream */
    class C12579d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12997u f59546a;

        C12579d(C12997u uVar) {
            this.f59546a = uVar;
        }

        public void run() {
            C12575a0.this.f59534c.mo69142f(this.f59546a);
        }
    }

    /* renamed from: io.grpc.internal.a0$e */
    /* compiled from: DelayedStream */
    class C12580e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f59548a;

        C12580e(int i) {
            this.f59548a = i;
        }

        public void run() {
            C12575a0.this.f59534c.mo69139c(this.f59548a);
        }
    }

    /* renamed from: io.grpc.internal.a0$f */
    /* compiled from: DelayedStream */
    class C12581f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f59550a;

        C12581f(int i) {
            this.f59550a = i;
        }

        public void run() {
            C12575a0.this.f59534c.mo69140d(this.f59550a);
        }
    }

    /* renamed from: io.grpc.internal.a0$g */
    /* compiled from: DelayedStream */
    class C12582g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12977s f59552a;

        C12582g(C12977s sVar) {
            this.f59552a = sVar;
        }

        public void run() {
            C12575a0.this.f59534c.mo69146l(this.f59552a);
        }
    }

    /* renamed from: io.grpc.internal.a0$h */
    /* compiled from: DelayedStream */
    class C12583h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f59554a;

        C12583h(String str) {
            this.f59554a = str;
        }

        public void run() {
            C12575a0.this.f59534c.mo69179i(this.f59554a);
        }
    }

    /* renamed from: io.grpc.internal.a0$i */
    /* compiled from: DelayedStream */
    class C12584i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12785r f59556a;

        C12584i(C12785r rVar) {
            this.f59556a = rVar;
        }

        public void run() {
            C12575a0.this.f59534c.mo69147m(this.f59556a);
        }
    }

    /* renamed from: io.grpc.internal.a0$j */
    /* compiled from: DelayedStream */
    class C12585j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputStream f59558a;

        C12585j(InputStream inputStream) {
            this.f59558a = inputStream;
        }

        public void run() {
            C12575a0.this.f59534c.mo69178g(this.f59558a);
        }
    }

    /* renamed from: io.grpc.internal.a0$k */
    /* compiled from: DelayedStream */
    class C12586k implements Runnable {
        C12586k() {
        }

        public void run() {
            C12575a0.this.f59534c.flush();
        }
    }

    /* renamed from: io.grpc.internal.a0$l */
    /* compiled from: DelayedStream */
    class C12587l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12537b1 f59561a;

        C12587l(C12537b1 b1Var) {
            this.f59561a = b1Var;
        }

        public void run() {
            C12575a0.this.f59534c.mo69141e(this.f59561a);
        }
    }

    /* renamed from: io.grpc.internal.a0$m */
    /* compiled from: DelayedStream */
    class C12588m implements Runnable {
        C12588m() {
        }

        public void run() {
            C12575a0.this.f59534c.mo69145k();
        }
    }

    /* renamed from: io.grpc.internal.a0$n */
    /* compiled from: DelayedStream */
    private static class C12589n implements C12785r {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12785r f59564a;

        /* renamed from: b */
        private volatile boolean f59565b;

        /* renamed from: c */
        private List<Runnable> f59566c = new ArrayList();

        /* renamed from: io.grpc.internal.a0$n$a */
        /* compiled from: DelayedStream */
        class C12590a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12690g2.C12691a f59567a;

            C12590a(C12690g2.C12691a aVar) {
                this.f59567a = aVar;
            }

            public void run() {
                C12589n.this.f59564a.mo69194a(this.f59567a);
            }
        }

        /* renamed from: io.grpc.internal.a0$n$b */
        /* compiled from: DelayedStream */
        class C12591b implements Runnable {
            C12591b() {
            }

            public void run() {
                C12589n.this.f59564a.onReady();
            }
        }

        /* renamed from: io.grpc.internal.a0$n$c */
        /* compiled from: DelayedStream */
        class C12592c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12960q0 f59570a;

            C12592c(C12960q0 q0Var) {
                this.f59570a = q0Var;
            }

            public void run() {
                C12589n.this.f59564a.mo69196c(this.f59570a);
            }
        }

        /* renamed from: io.grpc.internal.a0$n$d */
        /* compiled from: DelayedStream */
        class C12593d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12537b1 f59572a;

            /* renamed from: c */
            final /* synthetic */ C12960q0 f59573c;

            C12593d(C12537b1 b1Var, C12960q0 q0Var) {
                this.f59572a = b1Var;
                this.f59573c = q0Var;
            }

            public void run() {
                C12589n.this.f59564a.mo69195b(this.f59572a, this.f59573c);
            }
        }

        /* renamed from: io.grpc.internal.a0$n$e */
        /* compiled from: DelayedStream */
        class C12594e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12537b1 f59575a;

            /* renamed from: c */
            final /* synthetic */ C12785r.C12786a f59576c;

            /* renamed from: d */
            final /* synthetic */ C12960q0 f59577d;

            C12594e(C12537b1 b1Var, C12785r.C12786a aVar, C12960q0 q0Var) {
                this.f59575a = b1Var;
                this.f59576c = aVar;
                this.f59577d = q0Var;
            }

            public void run() {
                C12589n.this.f59564a.mo69197d(this.f59575a, this.f59576c, this.f59577d);
            }
        }

        public C12589n(C12785r rVar) {
            this.f59564a = rVar;
        }

        /* renamed from: f */
        private void m83850f(Runnable runnable) {
            synchronized (this) {
                if (!this.f59565b) {
                    this.f59566c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* renamed from: a */
        public void mo69194a(C12690g2.C12691a aVar) {
            if (this.f59565b) {
                this.f59564a.mo69194a(aVar);
            } else {
                m83850f(new C12590a(aVar));
            }
        }

        /* renamed from: b */
        public void mo69195b(C12537b1 b1Var, C12960q0 q0Var) {
            m83850f(new C12593d(b1Var, q0Var));
        }

        /* renamed from: c */
        public void mo69196c(C12960q0 q0Var) {
            m83850f(new C12592c(q0Var));
        }

        /* renamed from: d */
        public void mo69197d(C12537b1 b1Var, C12785r.C12786a aVar, C12960q0 q0Var) {
            m83850f(new C12594e(b1Var, aVar, q0Var));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            r0 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            if (r0.hasNext() == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            ((java.lang.Runnable) r0.next()).run();
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo69198g() {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0005:
                monitor-enter(r3)
                java.util.List<java.lang.Runnable> r1 = r3.f59566c     // Catch:{ all -> 0x0034 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x0016
                r0 = 0
                r3.f59566c = r0     // Catch:{ all -> 0x0034 }
                r0 = 1
                r3.f59565b = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0016:
                java.util.List<java.lang.Runnable> r1 = r3.f59566c     // Catch:{ all -> 0x0034 }
                r3.f59566c = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                java.util.Iterator r0 = r1.iterator()
            L_0x001f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x002f
                java.lang.Object r2 = r0.next()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r2.run()
                goto L_0x001f
            L_0x002f:
                r1.clear()
                r0 = r1
                goto L_0x0005
            L_0x0034:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12575a0.C12589n.mo69198g():void");
        }

        public void onReady() {
            if (this.f59565b) {
                this.f59564a.onReady();
            } else {
                m83850f(new C12591b());
            }
        }
    }

    C12575a0() {
    }

    /* renamed from: o */
    private void m83832o(Runnable runnable) {
        synchronized (this) {
            if (!this.f59532a) {
                this.f59536e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0.mo69198g();
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m83833p() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f59536e     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x001d
            r0 = 0
            r3.f59536e = r0     // Catch:{ all -> 0x003b }
            r0 = 1
            r3.f59532a = r0     // Catch:{ all -> 0x003b }
            io.grpc.internal.a0$n r0 = r3.f59537f     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x001c
            r0.mo69198g()
        L_0x001c:
            return
        L_0x001d:
            java.util.List<java.lang.Runnable> r1 = r3.f59536e     // Catch:{ all -> 0x003b }
            r3.f59536e = r0     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            java.util.Iterator r0 = r1.iterator()
        L_0x0026:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x0026
        L_0x0036:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x003b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12575a0.m83833p():void");
    }

    /* renamed from: q */
    private void m83834q(C12781q qVar) {
        C12781q qVar2 = this.f59534c;
        Preconditions.m5372C(qVar2 == null, "realStream already set to %s", qVar2);
        this.f59534c = qVar;
        this.f59539h = System.nanoTime();
    }

    /* renamed from: a */
    public void mo69176a(C12909l lVar) {
        Preconditions.m5393t(lVar, "compressor");
        m83832o(new C12577b(lVar));
    }

    /* renamed from: b */
    public void mo69138b(int i) {
        if (this.f59532a) {
            this.f59534c.mo69138b(i);
        } else {
            m83832o(new C12576a(i));
        }
    }

    /* renamed from: c */
    public void mo69139c(int i) {
        if (this.f59532a) {
            this.f59534c.mo69139c(i);
        } else {
            m83832o(new C12580e(i));
        }
    }

    /* renamed from: d */
    public void mo69140d(int i) {
        if (this.f59532a) {
            this.f59534c.mo69140d(i);
        } else {
            m83832o(new C12581f(i));
        }
    }

    /* renamed from: e */
    public void mo69141e(C12537b1 b1Var) {
        C12785r rVar;
        boolean z;
        Preconditions.m5393t(b1Var, "reason");
        synchronized (this) {
            if (this.f59534c == null) {
                m83834q(C12724k1.f59969a);
                z = false;
                rVar = this.f59533b;
                this.f59535d = b1Var;
            } else {
                z = true;
                rVar = null;
            }
        }
        if (z) {
            m83832o(new C12587l(b1Var));
            return;
        }
        if (rVar != null) {
            rVar.mo69195b(b1Var, new C12960q0());
        }
        m83833p();
    }

    /* renamed from: f */
    public void mo69142f(C12997u uVar) {
        Preconditions.m5393t(uVar, "decompressorRegistry");
        m83832o(new C12579d(uVar));
    }

    public void flush() {
        if (this.f59532a) {
            this.f59534c.flush();
        } else {
            m83832o(new C12586k());
        }
    }

    /* renamed from: g */
    public void mo69178g(InputStream inputStream) {
        Preconditions.m5393t(inputStream, "message");
        if (this.f59532a) {
            this.f59534c.mo69178g(inputStream);
        } else {
            m83832o(new C12585j(inputStream));
        }
    }

    /* renamed from: h */
    public void mo69143h(boolean z) {
        m83832o(new C12578c(z));
    }

    /* renamed from: i */
    public void mo69179i(String str) {
        Preconditions.m5399z(this.f59533b == null, "May only be called before start");
        Preconditions.m5393t(str, "authority");
        m83832o(new C12583h(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69144j(p292io.grpc.internal.C12810u0 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            io.grpc.internal.r r0 = r5.f59533b     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            io.grpc.internal.q r0 = r5.f59534c     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "buffered_nanos"
            long r1 = r5.f59539h     // Catch:{ all -> 0x0036 }
            long r3 = r5.f59538g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.mo69569b(r0, r1)     // Catch:{ all -> 0x0036 }
            io.grpc.internal.q r0 = r5.f59534c     // Catch:{ all -> 0x0036 }
            r0.mo69144j(r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "buffered_nanos"
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0036 }
            long r3 = r5.f59538g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.mo69569b(r0, r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "waiting_for_connection"
            r6.mo69568a(r0)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12575a0.mo69144j(io.grpc.internal.u0):void");
    }

    /* renamed from: k */
    public void mo69145k() {
        m83832o(new C12588m());
    }

    /* renamed from: l */
    public void mo69146l(C12977s sVar) {
        m83832o(new C12582g(sVar));
    }

    /* renamed from: m */
    public void mo69147m(C12785r rVar) {
        C12537b1 b1Var;
        boolean z;
        Preconditions.m5399z(this.f59533b == null, "already started");
        synchronized (this) {
            this.f59533b = (C12785r) Preconditions.m5393t(rVar, "listener");
            b1Var = this.f59535d;
            z = this.f59532a;
            if (!z) {
                C12589n nVar = new C12589n(rVar);
                this.f59537f = nVar;
                rVar = nVar;
            }
            this.f59538g = System.nanoTime();
        }
        if (b1Var != null) {
            rVar.mo69195b(b1Var, new C12960q0());
        } else if (z) {
            this.f59534c.mo69147m(rVar);
        } else {
            m83832o(new C12584i(rVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo69180r(C12781q qVar) {
        synchronized (this) {
            if (this.f59534c == null) {
                m83834q((C12781q) Preconditions.m5393t(qVar, "stream"));
                m83833p();
            }
        }
    }
}

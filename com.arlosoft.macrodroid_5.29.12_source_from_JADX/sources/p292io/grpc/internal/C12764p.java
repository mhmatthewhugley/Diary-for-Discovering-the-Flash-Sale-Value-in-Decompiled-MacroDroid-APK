package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12549d0;
import p292io.grpc.C12558f;
import p292io.grpc.C12905k;
import p292io.grpc.C12909l;
import p292io.grpc.C12910l0;
import p292io.grpc.C12923m;
import p292io.grpc.C12952q;
import p292io.grpc.C12960q0;
import p292io.grpc.C12971r;
import p292io.grpc.C12972r0;
import p292io.grpc.C12977s;
import p292io.grpc.C12997u;
import p292io.grpc.internal.C12690g2;
import p292io.grpc.internal.C12785r;
import p405u9.C16673b;
import p405u9.C16674c;
import p405u9.C16675d;

/* renamed from: io.grpc.internal.p */
/* compiled from: ClientCallImpl */
final class C12764p<ReqT, RespT> extends C12558f<ReqT, RespT> {

    /* renamed from: v */
    private static final Logger f60076v = Logger.getLogger(C12764p.class.getName());

    /* renamed from: w */
    private static final byte[] f60077w = "gzip".getBytes(Charset.forName("US-ASCII"));
    @VisibleForTesting

    /* renamed from: x */
    static final long f60078x = TimeUnit.SECONDS.toNanos(1);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12972r0<ReqT, RespT> f60079a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16675d f60080b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f60081c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12735m f60082d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12952q f60083e;

    /* renamed from: f */
    private final boolean f60084f;

    /* renamed from: g */
    private final C12542c f60085g;

    /* renamed from: h */
    private final boolean f60086h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C12781q f60087i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile boolean f60088j;

    /* renamed from: k */
    private boolean f60089k;

    /* renamed from: l */
    private boolean f60090l;

    /* renamed from: m */
    private final C12774f f60091m;

    /* renamed from: n */
    private C12764p<ReqT, RespT>.g f60092n;

    /* renamed from: o */
    private final ScheduledExecutorService f60093o;

    /* renamed from: p */
    private boolean f60094p;

    /* renamed from: q */
    private C12997u f60095q = C12997u.m85199c();

    /* renamed from: r */
    private C12923m f60096r = C12923m.m84930a();

    /* renamed from: s */
    private volatile ScheduledFuture<?> f60097s;

    /* renamed from: t */
    private volatile ScheduledFuture<?> f60098t;

    /* renamed from: u */
    private boolean f60099u;

    /* renamed from: io.grpc.internal.p$b */
    /* compiled from: ClientCallImpl */
    class C12766b extends C12873x {

        /* renamed from: c */
        final /* synthetic */ C12558f.C12559a f60100c;

        /* renamed from: d */
        final /* synthetic */ C12537b1 f60101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12766b(C12558f.C12559a aVar, C12537b1 b1Var) {
            super(C12764p.this.f60083e);
            this.f60100c = aVar;
            this.f60101d = b1Var;
        }

        /* renamed from: a */
        public void mo69504a() {
            C12764p.this.m84420r(this.f60100c, this.f60101d, new C12960q0());
        }
    }

    /* renamed from: io.grpc.internal.p$c */
    /* compiled from: ClientCallImpl */
    class C12767c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f60103a;

        /* renamed from: c */
        final /* synthetic */ C12558f.C12559a f60104c;

        C12767c(long j, C12558f.C12559a aVar) {
            this.f60103a = j;
            this.f60104c = aVar;
        }

        public void run() {
            C12764p.this.m84421s(C12764p.this.m84419q(this.f60103a), this.f60104c);
        }
    }

    /* renamed from: io.grpc.internal.p$d */
    /* compiled from: ClientCallImpl */
    class C12768d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12537b1 f60106a;

        C12768d(C12537b1 b1Var) {
            this.f60106a = b1Var;
        }

        public void run() {
            C12764p.this.f60087i.mo69141e(this.f60106a);
        }
    }

    /* renamed from: io.grpc.internal.p$e */
    /* compiled from: ClientCallImpl */
    private class C12769e implements C12785r {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12558f.C12559a<RespT> f60108a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f60109b;

        /* renamed from: io.grpc.internal.p$e$a */
        /* compiled from: ClientCallImpl */
        final class C12770a extends C12873x {

            /* renamed from: c */
            final /* synthetic */ C16673b f60111c;

            /* renamed from: d */
            final /* synthetic */ C12960q0 f60112d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12770a(C16673b bVar, C12960q0 q0Var) {
                super(C12764p.this.f60083e);
                this.f60111c = bVar;
                this.f60112d = q0Var;
            }

            /* renamed from: b */
            private void m84446b() {
                if (!C12769e.this.f60109b) {
                    try {
                        C12769e.this.f60108a.mo63032b(this.f60112d);
                    } catch (Throwable th) {
                        C12537b1 q = C12537b1.f59408g.mo69065p(th).mo69066q("Failed to read headers");
                        C12764p.this.f60087i.mo69141e(q);
                        C12769e.this.m84440h(q, new C12960q0());
                    }
                }
            }

            /* renamed from: a */
            public void mo69504a() {
                C16674c.m99125g("ClientCall$Listener.headersRead", C12764p.this.f60080b);
                C16674c.m99122d(this.f60111c);
                try {
                    m84446b();
                } finally {
                    C16674c.m99127i("ClientCall$Listener.headersRead", C12764p.this.f60080b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$e$b */
        /* compiled from: ClientCallImpl */
        final class C12771b extends C12873x {

            /* renamed from: c */
            final /* synthetic */ C16673b f60114c;

            /* renamed from: d */
            final /* synthetic */ C12690g2.C12691a f60115d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12771b(C16673b bVar, C12690g2.C12691a aVar) {
                super(C12764p.this.f60083e);
                this.f60114c = bVar;
                this.f60115d = aVar;
            }

            /* renamed from: b */
            private void m84448b() {
                InputStream next;
                if (C12769e.this.f60109b) {
                    C12749o0.m84360b(this.f60115d);
                    return;
                }
                while (true) {
                    try {
                        next = this.f60115d.next();
                        if (next != null) {
                            C12769e.this.f60108a.mo63033c(C12764p.this.f60079a.mo69791i(next));
                            next.close();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12749o0.m84360b(this.f60115d);
                        C12537b1 q = C12537b1.f59408g.mo69065p(th).mo69066q("Failed to read message.");
                        C12764p.this.f60087i.mo69141e(q);
                        C12769e.this.m84440h(q, new C12960q0());
                        return;
                    }
                }
            }

            /* renamed from: a */
            public void mo69504a() {
                C16674c.m99125g("ClientCall$Listener.messagesAvailable", C12764p.this.f60080b);
                C16674c.m99122d(this.f60114c);
                try {
                    m84448b();
                } finally {
                    C16674c.m99127i("ClientCall$Listener.messagesAvailable", C12764p.this.f60080b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$e$c */
        /* compiled from: ClientCallImpl */
        final class C12772c extends C12873x {

            /* renamed from: c */
            final /* synthetic */ C16673b f60117c;

            /* renamed from: d */
            final /* synthetic */ C12537b1 f60118d;

            /* renamed from: f */
            final /* synthetic */ C12960q0 f60119f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12772c(C16673b bVar, C12537b1 b1Var, C12960q0 q0Var) {
                super(C12764p.this.f60083e);
                this.f60117c = bVar;
                this.f60118d = b1Var;
                this.f60119f = q0Var;
            }

            /* renamed from: b */
            private void m84450b() {
                if (!C12769e.this.f60109b) {
                    C12769e.this.m84440h(this.f60118d, this.f60119f);
                }
            }

            /* renamed from: a */
            public void mo69504a() {
                C16674c.m99125g("ClientCall$Listener.onClose", C12764p.this.f60080b);
                C16674c.m99122d(this.f60117c);
                try {
                    m84450b();
                } finally {
                    C16674c.m99127i("ClientCall$Listener.onClose", C12764p.this.f60080b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$e$d */
        /* compiled from: ClientCallImpl */
        final class C12773d extends C12873x {

            /* renamed from: c */
            final /* synthetic */ C16673b f60121c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12773d(C16673b bVar) {
                super(C12764p.this.f60083e);
                this.f60121c = bVar;
            }

            /* renamed from: b */
            private void m84452b() {
                try {
                    C12769e.this.f60108a.mo63034d();
                } catch (Throwable th) {
                    C12537b1 q = C12537b1.f59408g.mo69065p(th).mo69066q("Failed to call onReady.");
                    C12764p.this.f60087i.mo69141e(q);
                    C12769e.this.m84440h(q, new C12960q0());
                }
            }

            /* renamed from: a */
            public void mo69504a() {
                C16674c.m99125g("ClientCall$Listener.onReady", C12764p.this.f60080b);
                C16674c.m99122d(this.f60121c);
                try {
                    m84452b();
                } finally {
                    C16674c.m99127i("ClientCall$Listener.onReady", C12764p.this.f60080b);
                }
            }
        }

        public C12769e(C12558f.C12559a<RespT> aVar) {
            this.f60108a = (C12558f.C12559a) Preconditions.m5393t(aVar, "observer");
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m84440h(C12537b1 b1Var, C12960q0 q0Var) {
            this.f60109b = true;
            boolean unused = C12764p.this.f60088j = true;
            try {
                C12764p.this.m84420r(this.f60108a, b1Var, q0Var);
            } finally {
                C12764p.this.m84428z();
                C12764p.this.f60082d.mo69470a(b1Var.mo69064o());
            }
        }

        /* renamed from: i */
        private void m84441i(C12537b1 b1Var, C12785r.C12786a aVar, C12960q0 q0Var) {
            C12977s l = C12764p.this.m84422t();
            if (b1Var.mo69062m() == C12537b1.C12539b.CANCELLED && l != null && l.mo69808j()) {
                C12810u0 u0Var = new C12810u0();
                C12764p.this.f60087i.mo69144j(u0Var);
                C12537b1 b1Var2 = C12537b1.f59411j;
                b1Var = b1Var2.mo69058e("ClientCall was cancelled at or after deadline. " + u0Var);
                q0Var = new C12960q0();
            }
            C12764p.this.f60081c.execute(new C12772c(C16674c.m99123e(), b1Var, q0Var));
        }

        /* renamed from: a */
        public void mo69194a(C12690g2.C12691a aVar) {
            C16674c.m99125g("ClientStreamListener.messagesAvailable", C12764p.this.f60080b);
            try {
                C12764p.this.f60081c.execute(new C12771b(C16674c.m99123e(), aVar));
            } finally {
                C16674c.m99127i("ClientStreamListener.messagesAvailable", C12764p.this.f60080b);
            }
        }

        /* renamed from: b */
        public void mo69195b(C12537b1 b1Var, C12960q0 q0Var) {
            mo69197d(b1Var, C12785r.C12786a.PROCESSED, q0Var);
        }

        /* renamed from: c */
        public void mo69196c(C12960q0 q0Var) {
            C16674c.m99125g("ClientStreamListener.headersRead", C12764p.this.f60080b);
            try {
                C12764p.this.f60081c.execute(new C12770a(C16674c.m99123e(), q0Var));
            } finally {
                C16674c.m99127i("ClientStreamListener.headersRead", C12764p.this.f60080b);
            }
        }

        /* renamed from: d */
        public void mo69197d(C12537b1 b1Var, C12785r.C12786a aVar, C12960q0 q0Var) {
            C16674c.m99125g("ClientStreamListener.closed", C12764p.this.f60080b);
            try {
                m84441i(b1Var, aVar, q0Var);
            } finally {
                C16674c.m99127i("ClientStreamListener.closed", C12764p.this.f60080b);
            }
        }

        public void onReady() {
            if (!C12764p.this.f60079a.mo69789e().mo69802b()) {
                C16674c.m99125g("ClientStreamListener.onReady", C12764p.this.f60080b);
                try {
                    C12764p.this.f60081c.execute(new C12773d(C16674c.m99123e()));
                } finally {
                    C16674c.m99127i("ClientStreamListener.onReady", C12764p.this.f60080b);
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.p$f */
    /* compiled from: ClientCallImpl */
    interface C12774f {
        /* renamed from: a */
        C12793s mo69289a(C12910l0.C12917f fVar);

        /* renamed from: b */
        <ReqT> C12781q mo69290b(C12972r0<ReqT, ?> r0Var, C12542c cVar, C12960q0 q0Var, C12952q qVar);
    }

    /* renamed from: io.grpc.internal.p$g */
    /* compiled from: ClientCallImpl */
    private final class C12775g implements C12952q.C12954b {

        /* renamed from: a */
        private C12558f.C12559a<RespT> f60123a;

        /* renamed from: a */
        public void mo69507a(C12952q qVar) {
            if (qVar.mo69752m() == null || !qVar.mo69752m().mo69808j()) {
                C12764p.this.f60087i.mo69141e(C12971r.m85111a(qVar));
                return;
            }
            C12764p.this.m84421s(C12971r.m85111a(qVar), this.f60123a);
        }

        private C12775g(C12558f.C12559a<RespT> aVar) {
            this.f60123a = aVar;
        }
    }

    C12764p(C12972r0<ReqT, RespT> r0Var, Executor executor, C12542c cVar, C12774f fVar, ScheduledExecutorService scheduledExecutorService, C12735m mVar, boolean z) {
        Executor executor2;
        boolean z2 = false;
        this.f60099u = false;
        this.f60079a = r0Var;
        C16675d b = C16674c.m99120b(r0Var.mo69787c(), (long) System.identityHashCode(this));
        this.f60080b = b;
        if (executor == MoreExecutors.m74259a()) {
            executor2 = new C12880y1();
        } else {
            executor2 = new C12895z1(executor);
        }
        this.f60081c = executor2;
        this.f60082d = mVar;
        this.f60083e = C12952q.m85032i();
        this.f60084f = (r0Var.mo69789e() == C12972r0.C12976d.UNARY || r0Var.mo69789e() == C12972r0.C12976d.SERVER_STREAMING) ? true : z2;
        this.f60085g = cVar;
        this.f60091m = fVar;
        this.f60093o = scheduledExecutorService;
        this.f60086h = z;
        C16674c.m99121c("ClientCall.<init>", b);
    }

    /* renamed from: A */
    private void m84404A(ReqT reqt) {
        Preconditions.m5399z(this.f60087i != null, "Not started");
        Preconditions.m5399z(!this.f60089k, "call was cancelled");
        Preconditions.m5399z(!this.f60090l, "call was half-closed");
        try {
            C12781q qVar = this.f60087i;
            if (qVar instanceof C12844w1) {
                ((C12844w1) qVar).mo69606f0(reqt);
            } else {
                qVar.mo69178g(this.f60079a.mo69792j(reqt));
            }
            if (!this.f60084f) {
                this.f60087i.flush();
            }
        } catch (RuntimeException e) {
            this.f60087i.mo69141e(C12537b1.f59408g.mo69065p(e).mo69066q("Failed to stream message"));
        } catch (Error e2) {
            this.f60087i.mo69141e(C12537b1.f59408g.mo69066q("Client sendMessage() failed with Error"));
            throw e2;
        }
    }

    /* renamed from: E */
    private ScheduledFuture<?> m84405E(C12977s sVar, C12558f.C12559a<RespT> aVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long l = sVar.mo69810l(timeUnit);
        return this.f60093o.schedule(new C12595a1(new C12767c(l, aVar)), l, timeUnit);
    }

    /* renamed from: F */
    private void m84406F(C12558f.C12559a<RespT> aVar, C12960q0 q0Var) {
        C12909l lVar;
        boolean z = false;
        Preconditions.m5399z(this.f60087i == null, "Already started");
        Preconditions.m5399z(!this.f60089k, "call was cancelled");
        Preconditions.m5393t(aVar, "observer");
        Preconditions.m5393t(q0Var, "headers");
        if (this.f60083e.mo69753o()) {
            this.f60087i = C12724k1.f59969a;
            m84423u(aVar, C12971r.m85111a(this.f60083e));
            return;
        }
        String b = this.f60085g.mo69077b();
        if (b != null) {
            lVar = this.f60096r.mo69698b(b);
            if (lVar == null) {
                this.f60087i = C12724k1.f59969a;
                m84423u(aVar, C12537b1.f59421t.mo69066q(String.format("Unable to find compressor by name %s", new Object[]{b})));
                return;
            }
        } else {
            lVar = C12905k.C12907b.f60451a;
        }
        m84427y(q0Var, this.f60095q, lVar, this.f60094p);
        C12977s t = m84422t();
        if (t != null && t.mo69808j()) {
            z = true;
        }
        if (!z) {
            m84425w(t, this.f60083e.mo69752m(), this.f60085g.mo69079d());
            if (this.f60086h) {
                this.f60087i = this.f60091m.mo69290b(this.f60079a, this.f60085g, q0Var, this.f60083e);
            } else {
                C12793s a = this.f60091m.mo69289a(new C12784q1(this.f60079a, q0Var, this.f60085g));
                C12952q c = this.f60083e.mo69748c();
                try {
                    this.f60087i = a.mo69389g(this.f60079a, q0Var, this.f60085g);
                } finally {
                    this.f60083e.mo69751j(c);
                }
            }
        } else {
            C12537b1 b1Var = C12537b1.f59411j;
            this.f60087i = new C12666e0(b1Var.mo69066q("ClientCall started after deadline exceeded: " + t));
        }
        if (this.f60085g.mo69076a() != null) {
            this.f60087i.mo69179i(this.f60085g.mo69076a());
        }
        if (this.f60085g.mo69081f() != null) {
            this.f60087i.mo69139c(this.f60085g.mo69081f().intValue());
        }
        if (this.f60085g.mo69082g() != null) {
            this.f60087i.mo69140d(this.f60085g.mo69082g().intValue());
        }
        if (t != null) {
            this.f60087i.mo69146l(t);
        }
        this.f60087i.mo69176a(lVar);
        boolean z2 = this.f60094p;
        if (z2) {
            this.f60087i.mo69143h(z2);
        }
        this.f60087i.mo69142f(this.f60095q);
        this.f60082d.mo69471b();
        this.f60092n = new C12775g(aVar);
        this.f60087i.mo69147m(new C12769e(aVar));
        this.f60083e.mo69747b(this.f60092n, MoreExecutors.m74259a());
        if (t != null && !t.equals(this.f60083e.mo69752m()) && this.f60093o != null && !(this.f60087i instanceof C12666e0)) {
            this.f60097s = m84405E(t, aVar);
        }
        if (this.f60088j) {
            m84428z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public C12537b1 m84419q(long j) {
        C12810u0 u0Var = new C12810u0();
        this.f60087i.mo69144j(u0Var);
        long abs = Math.abs(j);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = abs / timeUnit.toNanos(1);
        long abs2 = Math.abs(j) % timeUnit.toNanos(1);
        StringBuilder sb = new StringBuilder();
        sb.append("deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(nanos);
        sb.append(String.format(".%09d", new Object[]{Long.valueOf(abs2)}));
        sb.append("s. ");
        sb.append(u0Var);
        return C12537b1.f59411j.mo69058e(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m84420r(C12558f.C12559a<RespT> aVar, C12537b1 b1Var, C12960q0 q0Var) {
        if (!this.f60099u) {
            this.f60099u = true;
            aVar.mo63031a(b1Var, q0Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m84421s(C12537b1 b1Var, C12558f.C12559a<RespT> aVar) {
        if (this.f60098t == null) {
            this.f60098t = this.f60093o.schedule(new C12595a1(new C12768d(b1Var)), f60078x, TimeUnit.NANOSECONDS);
            m84423u(aVar, b1Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public C12977s m84422t() {
        return m84426x(this.f60085g.mo69079d(), this.f60083e.mo69752m());
    }

    /* renamed from: u */
    private void m84423u(C12558f.C12559a<RespT> aVar, C12537b1 b1Var) {
        this.f60081c.execute(new C12766b(aVar, b1Var));
    }

    /* renamed from: v */
    private void m84424v() {
        Preconditions.m5399z(this.f60087i != null, "Not started");
        Preconditions.m5399z(!this.f60089k, "call was cancelled");
        Preconditions.m5399z(!this.f60090l, "call already half-closed");
        this.f60090l = true;
        this.f60087i.mo69145k();
    }

    /* renamed from: w */
    private static void m84425w(C12977s sVar, C12977s sVar2, C12977s sVar3) {
        Logger logger = f60076v;
        if (logger.isLoggable(Level.FINE) && sVar != null && sVar.equals(sVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(Math.max(0, sVar.mo69810l(timeUnit)))}));
            if (sVar3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(" Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(sVar3.mo69810l(timeUnit))}));
            }
            logger.fine(sb.toString());
        }
    }

    /* renamed from: x */
    private static C12977s m84426x(C12977s sVar, C12977s sVar2) {
        return sVar == null ? sVar2 : sVar2 == null ? sVar : sVar.mo69809k(sVar2);
    }

    @VisibleForTesting
    /* renamed from: y */
    static void m84427y(C12960q0 q0Var, C12997u uVar, C12909l lVar, boolean z) {
        C12960q0.C12967g<String> gVar = C12749o0.f60031d;
        q0Var.mo69763d(gVar);
        if (lVar != C12905k.C12907b.f60451a) {
            q0Var.mo69768o(gVar, lVar.mo69668a());
        }
        C12960q0.C12967g<byte[]> gVar2 = C12749o0.f60032e;
        q0Var.mo69763d(gVar2);
        byte[] a = C12549d0.m83748a(uVar);
        if (a.length != 0) {
            q0Var.mo69768o(gVar2, a);
        }
        q0Var.mo69763d(C12749o0.f60033f);
        C12960q0.C12967g<byte[]> gVar3 = C12749o0.f60034g;
        q0Var.mo69763d(gVar3);
        if (z) {
            q0Var.mo69768o(gVar3, f60077w);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m84428z() {
        this.f60083e.mo69755r(this.f60092n);
        ScheduledFuture<?> scheduledFuture = this.f60098t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledFuture<?> scheduledFuture2 = this.f60097s;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C12764p<ReqT, RespT> mo69500B(C12923m mVar) {
        this.f60096r = mVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C12764p<ReqT, RespT> mo69501C(C12997u uVar) {
        this.f60095q = uVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public C12764p<ReqT, RespT> mo69502D(boolean z) {
        this.f60094p = z;
        return this;
    }

    /* renamed from: a */
    public void mo63035a() {
        C16674c.m99125g("ClientCall.halfClose", this.f60080b);
        try {
            m84424v();
        } finally {
            C16674c.m99127i("ClientCall.halfClose", this.f60080b);
        }
    }

    /* renamed from: b */
    public void mo69131b(int i) {
        C16674c.m99125g("ClientCall.request", this.f60080b);
        try {
            boolean z = true;
            Preconditions.m5399z(this.f60087i != null, "Not started");
            if (i < 0) {
                z = false;
            }
            Preconditions.m5378e(z, "Number requested must be non-negative");
            this.f60087i.mo69138b(i);
        } finally {
            C16674c.m99127i("ClientCall.cancel", this.f60080b);
        }
    }

    /* renamed from: c */
    public void mo69132c(ReqT reqt) {
        C16674c.m99125g("ClientCall.sendMessage", this.f60080b);
        try {
            m84404A(reqt);
        } finally {
            C16674c.m99127i("ClientCall.sendMessage", this.f60080b);
        }
    }

    /* renamed from: d */
    public void mo69133d(C12558f.C12559a<RespT> aVar, C12960q0 q0Var) {
        C16674c.m99125g("ClientCall.start", this.f60080b);
        try {
            m84406F(aVar, q0Var);
        } finally {
            C16674c.m99127i("ClientCall.start", this.f60080b);
        }
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("method", this.f60079a).toString();
    }
}

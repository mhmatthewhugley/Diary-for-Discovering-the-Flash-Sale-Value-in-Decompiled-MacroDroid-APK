package p292io.grpc.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p292io.grpc.C12520a;
import p292io.grpc.C12533b0;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12544c0;
import p292io.grpc.C12548d;
import p292io.grpc.C12550d1;
import p292io.grpc.C12554e;
import p292io.grpc.C12556e0;
import p292io.grpc.C12558f;
import p292io.grpc.C12560f0;
import p292io.grpc.C12561g;
import p292io.grpc.C12566i;
import p292io.grpc.C12900j;
import p292io.grpc.C12910l0;
import p292io.grpc.C12923m;
import p292io.grpc.C12926n;
import p292io.grpc.C12929o;
import p292io.grpc.C12930o0;
import p292io.grpc.C12952q;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.C12981s0;
import p292io.grpc.C12997u;
import p292io.grpc.C12999u0;
import p292io.grpc.C13005w;
import p292io.grpc.C13011y0;
import p292io.grpc.internal.C12688g1;
import p292io.grpc.internal.C12702i;
import p292io.grpc.internal.C12717j;
import p292io.grpc.internal.C12735m;
import p292io.grpc.internal.C12764p;
import p292io.grpc.internal.C12813v0;
import p292io.grpc.internal.C12844w1;

/* renamed from: io.grpc.internal.d1 */
/* compiled from: ManagedChannelImpl */
final class C12627d1 extends C12930o0 implements C12556e0<Object> {

    /* renamed from: i0 */
    static final Logger f59699i0 = Logger.getLogger(C12627d1.class.getName());
    @VisibleForTesting

    /* renamed from: j0 */
    static final Pattern f59700j0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    @VisibleForTesting

    /* renamed from: k0 */
    static final C12537b1 f59701k0;
    @VisibleForTesting

    /* renamed from: l0 */
    static final C12537b1 f59702l0;
    @VisibleForTesting

    /* renamed from: m0 */
    static final C12537b1 f59703m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public static final C12656x f59704n0 = new C12656x(Collections.emptyMap(), C12681f1.m84150a());

    /* renamed from: A */
    private C12981s0 f59705A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f59706B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C12647r f59707C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public volatile C12910l0.C12921i f59708D;

    /* renamed from: E */
    private boolean f59709E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final Set<C12813v0> f59710F = new HashSet(16, 0.75f);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Set<C12739m1> f59711G = new HashSet(1, 0.75f);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C12881z f59712H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C12663z f59713I = new C12663z(this, (C12628a) null);
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final AtomicBoolean f59714J = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f59715K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public volatile boolean f59716L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public volatile boolean f59717M;

    /* renamed from: N */
    private final CountDownLatch f59718N = new CountDownLatch(1);
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C12735m.C12737b f59719O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C12735m f59720P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C12746o f59721Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C12554e f59722R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C12533b0 f59723S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C12653u f59724T = C12653u.NO_RESOLUTION;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C12656x f59725U = f59704n0;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C12656x f59726V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f59727W = false;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final boolean f59728X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C12844w1.C12861q f59729Y = new C12844w1.C12861q();
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final long f59730Z;

    /* renamed from: a */
    private final C12560f0 f59731a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final long f59732a0;

    /* renamed from: b */
    private final String f59733b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final boolean f59734b0;

    /* renamed from: c */
    private final C12999u0 f59735c;

    /* renamed from: c0 */
    private final C12688g1.C12689a f59736c0;

    /* renamed from: d */
    private final C12981s0.C12986d f59737d;
    @VisibleForTesting

    /* renamed from: d0 */
    final C12801t0<Object> f59738d0;

    /* renamed from: e */
    private final C12981s0.C12983b f59739e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C12550d1.C12553c f59740e0;

    /* renamed from: f */
    private final C12702i f59741f;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C12717j f59742f0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12799t f59743g;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final C12764p.C12774f f59744g0;

    /* renamed from: h */
    private final C12654v f59745h;

    /* renamed from: h0 */
    private final C12833v1 f59746h0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Executor f59747i;

    /* renamed from: j */
    private final C12733l1<? extends Executor> f59748j;

    /* renamed from: k */
    private final C12733l1<? extends Executor> f59749k;

    /* renamed from: l */
    private final C12644o f59750l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C12644o f59751m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C12700h2 f59752n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final int f59753o;
    @VisibleForTesting

    /* renamed from: p */
    final C12550d1 f59754p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f59755q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C12997u f59756r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C12923m f59757s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Supplier<Stopwatch> f59758t;

    /* renamed from: u */
    private final long f59759u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C12837w f59760v = new C12837w();

    /* renamed from: w */
    private final C12596a2 f59761w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C12717j.C12718a f59762x;

    /* renamed from: y */
    private final C12548d f59763y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final String f59764z;

    /* renamed from: io.grpc.internal.d1$a */
    /* compiled from: ManagedChannelImpl */
    class C12628a implements Thread.UncaughtExceptionHandler {
        C12628a() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            Logger logger = C12627d1.f59699i0;
            Level level = Level.SEVERE;
            logger.log(level, "[" + C12627d1.this.mo69268c() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C12627d1.this.mo69265I0(th);
        }
    }

    /* renamed from: io.grpc.internal.d1$b */
    /* compiled from: ManagedChannelImpl */
    final class C12629b implements Runnable {
        C12629b() {
        }

        public void run() {
            C12627d1.this.m84042x0(true);
        }
    }

    /* renamed from: io.grpc.internal.d1$c */
    /* compiled from: ManagedChannelImpl */
    final class C12630c implements C12735m.C12737b {

        /* renamed from: a */
        final /* synthetic */ C12700h2 f59767a;

        C12630c(C12700h2 h2Var) {
            this.f59767a = h2Var;
        }

        public C12735m create() {
            return new C12735m(this.f59767a);
        }
    }

    /* renamed from: io.grpc.internal.d1$d */
    /* compiled from: ManagedChannelImpl */
    final class C12631d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f59769a;

        /* renamed from: c */
        final /* synthetic */ C12926n f59770c;

        C12631d(Runnable runnable, C12926n nVar) {
            this.f59769a = runnable;
            this.f59770c = nVar;
        }

        public void run() {
            C12627d1.this.f59760v.mo69603c(this.f59769a, C12627d1.this.f59747i, this.f59770c);
        }
    }

    /* renamed from: io.grpc.internal.d1$e */
    /* compiled from: ManagedChannelImpl */
    final class C12632e extends C12910l0.C12921i {

        /* renamed from: a */
        private final C12910l0.C12916e f59772a;

        /* renamed from: b */
        final /* synthetic */ Throwable f59773b;

        C12632e(Throwable th) {
            this.f59773b = th;
            this.f59772a = C12910l0.C12916e.m84899e(C12537b1.f59421t.mo69066q("Panic! This is a bug!").mo69065p(th));
        }

        /* renamed from: a */
        public C12910l0.C12916e mo69281a(C12910l0.C12917f fVar) {
            return this.f59772a;
        }

        public String toString() {
            return MoreObjects.m5333b(C12632e.class).mo22194d("panicPickResult", this.f59772a).toString();
        }
    }

    /* renamed from: io.grpc.internal.d1$f */
    /* compiled from: ManagedChannelImpl */
    final class C12633f implements Runnable {
        C12633f() {
        }

        public void run() {
            if (!C12627d1.this.f59714J.get() && C12627d1.this.f59707C != null) {
                C12627d1.this.m84042x0(false);
                C12627d1.this.m84046z0();
            }
        }
    }

    /* renamed from: io.grpc.internal.d1$g */
    /* compiled from: ManagedChannelImpl */
    final class C12634g implements Runnable {
        C12634g() {
        }

        public void run() {
            C12627d1.this.mo69264A0();
            if (C12627d1.this.f59708D != null) {
                C12627d1.this.f59708D.mo69697b();
            }
            if (C12627d1.this.f59707C != null) {
                C12627d1.this.f59707C.f59795a.mo69423c();
            }
        }
    }

    /* renamed from: io.grpc.internal.d1$h */
    /* compiled from: ManagedChannelImpl */
    final class C12635h implements Runnable {
        C12635h() {
        }

        public void run() {
            if (!C12627d1.this.f59714J.get()) {
                if (C12627d1.this.f59740e0 != null && C12627d1.this.f59740e0.mo69125b()) {
                    Preconditions.m5399z(C12627d1.this.f59706B, "name resolver must be started");
                    C12627d1.this.m83989J0();
                }
                for (C12813v0 O : C12627d1.this.f59710F) {
                    O.mo69573O();
                }
                for (C12739m1 m : C12627d1.this.f59711G) {
                    m.mo69273m();
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.d1$i */
    /* compiled from: ManagedChannelImpl */
    final class C12636i implements Runnable {
        C12636i() {
        }

        public void run() {
            C12627d1.this.f59722R.mo69126a(C12554e.C12555a.INFO, "Entering SHUTDOWN state");
            C12627d1.this.f59760v.mo69602b(C12926n.SHUTDOWN);
        }
    }

    /* renamed from: io.grpc.internal.d1$j */
    /* compiled from: ManagedChannelImpl */
    final class C12637j implements Runnable {
        C12637j() {
        }

        public void run() {
            if (!C12627d1.this.f59715K) {
                boolean unused = C12627d1.this.f59715K = true;
                C12627d1.this.m83984G0();
            }
        }
    }

    /* renamed from: io.grpc.internal.d1$k */
    /* compiled from: ManagedChannelImpl */
    class C12638k implements Executor {
        C12638k() {
        }

        public void execute(Runnable runnable) {
            C12627d1.this.f59751m.mo69300a().execute(runnable);
        }
    }

    /* renamed from: io.grpc.internal.d1$l */
    /* compiled from: ManagedChannelImpl */
    private final class C12639l implements C12764p.C12774f {

        /* renamed from: io.grpc.internal.d1$l$a */
        /* compiled from: ManagedChannelImpl */
        final class C12640a implements Runnable {
            C12640a() {
            }

            public void run() {
                C12627d1.this.mo69264A0();
            }
        }

        /* renamed from: io.grpc.internal.d1$l$b */
        /* compiled from: ManagedChannelImpl */
        final class C12641b extends C12844w1<ReqT> {

            /* renamed from: A */
            final /* synthetic */ C12972r0 f59783A;

            /* renamed from: B */
            final /* synthetic */ C12960q0 f59784B;

            /* renamed from: C */
            final /* synthetic */ C12542c f59785C;

            /* renamed from: D */
            final /* synthetic */ C12844w1.C12872x f59786D;

            /* renamed from: E */
            final /* synthetic */ C12952q f59787E;

            /* renamed from: F */
            final /* synthetic */ C12639l f59788F;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            C12641b(p292io.grpc.internal.C12627d1.C12639l r16, p292io.grpc.C12972r0 r17, p292io.grpc.C12960q0 r18, p292io.grpc.C12542c r19, p292io.grpc.internal.C12844w1.C12872x r20, p292io.grpc.C12952q r21) {
                /*
                    r15 = this;
                    r13 = r15
                    r0 = r16
                    r1 = r19
                    r13.f59788F = r0
                    r2 = r17
                    r13.f59783A = r2
                    r3 = r18
                    r13.f59784B = r3
                    r13.f59785C = r1
                    r12 = r20
                    r13.f59786D = r12
                    r4 = r21
                    r13.f59787E = r4
                    io.grpc.internal.d1 r4 = p292io.grpc.internal.C12627d1.this
                    io.grpc.internal.w1$q r4 = r4.f59729Y
                    io.grpc.internal.d1 r5 = p292io.grpc.internal.C12627d1.this
                    long r5 = r5.f59730Z
                    io.grpc.internal.d1 r7 = p292io.grpc.internal.C12627d1.this
                    long r7 = r7.f59732a0
                    io.grpc.internal.d1 r9 = p292io.grpc.internal.C12627d1.this
                    java.util.concurrent.Executor r9 = r9.m83974B0(r1)
                    io.grpc.internal.d1 r0 = p292io.grpc.internal.C12627d1.this
                    io.grpc.internal.t r0 = r0.f59743g
                    java.util.concurrent.ScheduledExecutorService r10 = r0.mo69457O0()
                    io.grpc.c$a<io.grpc.internal.x1$a> r0 = p292io.grpc.internal.C12596a2.f59581d
                    java.lang.Object r0 = r1.mo69083h(r0)
                    r11 = r0
                    io.grpc.internal.x1$a r11 = (p292io.grpc.internal.C12876x1.C12877a) r11
                    io.grpc.c$a<io.grpc.internal.q0$a> r0 = p292io.grpc.internal.C12596a2.f59582e
                    java.lang.Object r0 = r1.mo69083h(r0)
                    r14 = r0
                    io.grpc.internal.q0$a r14 = (p292io.grpc.internal.C12782q0.C12783a) r14
                    r0 = r15
                    r1 = r17
                    r2 = r18
                    r3 = r4
                    r4 = r5
                    r6 = r7
                    r8 = r9
                    r9 = r10
                    r10 = r11
                    r11 = r14
                    r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12627d1.C12639l.C12641b.<init>(io.grpc.internal.d1$l, io.grpc.r0, io.grpc.q0, io.grpc.c, io.grpc.internal.w1$x, io.grpc.q):void");
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b0 */
            public C12781q mo69292b0(C12900j.C12901a aVar, C12960q0 q0Var) {
                C12542c q = this.f59785C.mo69092q(aVar);
                C12793s a = this.f59788F.mo69289a(new C12784q1(this.f59783A, q0Var, q));
                C12952q c = this.f59787E.mo69748c();
                try {
                    return a.mo69389g(this.f59783A, q0Var, q);
                } finally {
                    this.f59787E.mo69751j(c);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c0 */
            public void mo69293c0() {
                C12627d1.this.f59713I.mo69355d(this);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d0 */
            public C12537b1 mo69294d0() {
                return C12627d1.this.f59713I.mo69352a(this);
            }
        }

        private C12639l() {
        }

        /* renamed from: a */
        public C12793s mo69289a(C12910l0.C12917f fVar) {
            C12910l0.C12921i s = C12627d1.this.f59708D;
            if (C12627d1.this.f59714J.get()) {
                return C12627d1.this.f59712H;
            }
            if (s == null) {
                C12627d1.this.f59754p.execute(new C12640a());
                return C12627d1.this.f59712H;
            }
            C12793s g = C12749o0.m84365g(s.mo69281a(fVar), fVar.mo69524a().mo69085j());
            if (g != null) {
                return g;
            }
            return C12627d1.this.f59712H;
        }

        /* renamed from: b */
        public <ReqT> C12781q mo69290b(C12972r0<ReqT, ?> r0Var, C12542c cVar, C12960q0 q0Var, C12952q qVar) {
            Preconditions.m5399z(C12627d1.this.f59734b0, "retry should be enabled");
            return new C12641b(this, r0Var, q0Var, cVar, C12627d1.this.f59725U.f59820b.mo69391d(), qVar);
        }

        /* synthetic */ C12639l(C12627d1 d1Var, C12628a aVar) {
            this();
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.d1$m */
    /* compiled from: ManagedChannelImpl */
    class C12642m implements Runnable {
        C12642m() {
        }

        public void run() {
            C12550d1.C12553c unused = C12627d1.this.f59740e0 = null;
            C12627d1.this.m83991K0();
        }
    }

    /* renamed from: io.grpc.internal.d1$n */
    /* compiled from: ManagedChannelImpl */
    private final class C12643n implements C12688g1.C12689a {
        private C12643n() {
        }

        /* renamed from: a */
        public void mo69296a(C12537b1 b1Var) {
            Preconditions.m5399z(C12627d1.this.f59714J.get(), "Channel must have been shut down");
        }

        /* renamed from: b */
        public void mo69297b() {
        }

        /* renamed from: c */
        public void mo69298c(boolean z) {
            C12627d1 d1Var = C12627d1.this;
            d1Var.f59738d0.mo69557d(d1Var.f59712H, z);
        }

        /* renamed from: d */
        public void mo69299d() {
            Preconditions.m5399z(C12627d1.this.f59714J.get(), "Channel must have been shut down");
            boolean unused = C12627d1.this.f59716L = true;
            C12627d1.this.m83996N0(false);
            C12627d1.this.m83984G0();
            C12627d1.this.m83986H0();
        }

        /* synthetic */ C12643n(C12627d1 d1Var, C12628a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.d1$o */
    /* compiled from: ManagedChannelImpl */
    private static final class C12644o {

        /* renamed from: a */
        private final C12733l1<? extends Executor> f59791a;

        /* renamed from: b */
        private Executor f59792b;

        C12644o(C12733l1<? extends Executor> l1Var) {
            this.f59791a = (C12733l1) Preconditions.m5393t(l1Var, "executorPool");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized Executor mo69300a() {
            if (this.f59792b == null) {
                this.f59792b = (Executor) Preconditions.m5394u(this.f59791a.mo69356a(), "%s.getObject()", this.f59792b);
            }
            return this.f59792b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo69301b() {
            Executor executor = this.f59792b;
            if (executor != null) {
                this.f59792b = (Executor) this.f59791a.mo69357b(executor);
            }
        }
    }

    /* renamed from: io.grpc.internal.d1$p */
    /* compiled from: ManagedChannelImpl */
    private final class C12645p extends C12801t0<Object> {
        private C12645p() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo69302a() {
            C12627d1.this.mo69264A0();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo69303b() {
            if (!C12627d1.this.f59714J.get()) {
                C12627d1.this.m83993L0();
            }
        }

        /* synthetic */ C12645p(C12627d1 d1Var, C12628a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.d1$q */
    /* compiled from: ManagedChannelImpl */
    private class C12646q implements Runnable {
        private C12646q() {
        }

        public void run() {
            C12627d1.this.m84046z0();
        }

        /* synthetic */ C12646q(C12627d1 d1Var, C12628a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.d1$r */
    /* compiled from: ManagedChannelImpl */
    private class C12647r extends C12910l0.C12915d {

        /* renamed from: a */
        C12702i.C12704b f59795a;

        /* renamed from: io.grpc.internal.d1$r$a */
        /* compiled from: ManagedChannelImpl */
        final class C12648a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12910l0.C12921i f59797a;

            /* renamed from: c */
            final /* synthetic */ C12926n f59798c;

            C12648a(C12910l0.C12921i iVar, C12926n nVar) {
                this.f59797a = iVar;
                this.f59798c = nVar;
            }

            public void run() {
                C12647r rVar = C12647r.this;
                if (rVar == C12627d1.this.f59707C) {
                    C12627d1.this.m83999P0(this.f59797a);
                    if (this.f59798c != C12926n.SHUTDOWN) {
                        C12627d1.this.f59722R.mo69127b(C12554e.C12555a.INFO, "Entering {0} state with picker: {1}", this.f59798c, this.f59797a);
                        C12627d1.this.f59760v.mo69602b(this.f59798c);
                    }
                }
            }
        }

        private C12647r() {
        }

        /* renamed from: f */
        private C12657y m84075f(C12910l0.C12912b bVar) {
            Preconditions.m5399z(!C12627d1.this.f59717M, "Channel is terminated");
            return new C12657y(bVar, this);
        }

        /* renamed from: b */
        public C12554e mo69306b() {
            return C12627d1.this.f59722R;
        }

        /* renamed from: c */
        public C12550d1 mo69307c() {
            return C12627d1.this.f59754p;
        }

        /* renamed from: d */
        public void mo69308d(C12926n nVar, C12910l0.C12921i iVar) {
            Preconditions.m5393t(nVar, "newState");
            Preconditions.m5393t(iVar, "newPicker");
            C12627d1.this.m83982F0("updateBalancingState()");
            C12627d1.this.f59754p.execute(new C12648a(iVar, nVar));
        }

        /* renamed from: e */
        public C12665e mo69305a(C12910l0.C12912b bVar) {
            C12627d1.this.f59754p.mo69119d();
            return m84075f(bVar);
        }

        /* synthetic */ C12647r(C12627d1 d1Var, C12628a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.d1$s */
    /* compiled from: ManagedChannelImpl */
    private final class C12649s extends C12981s0.C12990f {

        /* renamed from: a */
        final C12647r f59800a;

        /* renamed from: b */
        final C12981s0 f59801b;

        /* renamed from: io.grpc.internal.d1$s$a */
        /* compiled from: ManagedChannelImpl */
        final class C12650a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12537b1 f59803a;

            C12650a(C12537b1 b1Var) {
                this.f59803a = b1Var;
            }

            public void run() {
                C12649s.this.m84083f(this.f59803a);
            }
        }

        /* renamed from: io.grpc.internal.d1$s$b */
        /* compiled from: ManagedChannelImpl */
        final class C12651b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12981s0.C12992h f59805a;

            C12651b(C12981s0.C12992h hVar) {
                this.f59805a = hVar;
            }

            public void run() {
                C12537b1 b1Var;
                C12656x xVar;
                C12656x p0;
                List<C13005w> a = this.f59805a.mo69839a();
                C12520a b = this.f59805a.mo69840b();
                C12627d1.this.f59722R.mo69127b(C12554e.C12555a.DEBUG, "Resolved address: {0}, config={1}", a, b);
                C12653u j0 = C12627d1.this.f59724T;
                C12653u j02 = C12627d1.this.f59724T;
                C12653u uVar = C12653u.SUCCESS;
                if (j02 != uVar) {
                    C12627d1.this.f59722R.mo69127b(C12554e.C12555a.INFO, "Address resolved: {0}", a);
                    C12653u unused = C12627d1.this.f59724T = uVar;
                }
                C12656x xVar2 = null;
                C12717j unused2 = C12627d1.this.f59742f0 = null;
                C12981s0.C12985c c = this.f59805a.mo69841c();
                if (c != null) {
                    Map map = (Map) this.f59805a.mo69840b().mo69026b(C12743n0.f60012a);
                    if (c.mo69827c() != null) {
                        xVar2 = new C12656x(map, (C12681f1) c.mo69827c());
                    }
                    b1Var = c.mo69828d();
                } else {
                    b1Var = null;
                }
                if (!C12627d1.this.f59728X) {
                    if (xVar2 != null) {
                        C12627d1.this.f59722R.mo69126a(C12554e.C12555a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    xVar = C12627d1.this.f59726V == null ? C12627d1.f59704n0 : C12627d1.this.f59726V;
                    b = b.mo69027d().mo69032c(C12743n0.f60012a).mo69031a();
                } else {
                    if (xVar2 != null) {
                        p0 = xVar2;
                    } else if (C12627d1.this.f59726V != null) {
                        p0 = C12627d1.this.f59726V;
                        C12627d1.this.f59722R.mo69126a(C12554e.C12555a.INFO, "Received no service config, using default service config");
                    } else if (b1Var == null) {
                        p0 = C12627d1.f59704n0;
                    } else if (!C12627d1.this.f59727W) {
                        C12627d1.this.f59722R.mo69126a(C12554e.C12555a.INFO, "Fallback to error due to invalid first service config without default config");
                        C12649s.this.mo69311a(c.mo69828d());
                        return;
                    } else {
                        p0 = C12627d1.this.f59725U;
                    }
                    if (!xVar.equals(C12627d1.this.f59725U)) {
                        C12554e F = C12627d1.this.f59722R;
                        C12554e.C12555a aVar = C12554e.C12555a.INFO;
                        Object[] objArr = new Object[1];
                        objArr[0] = xVar == C12627d1.f59704n0 ? " to empty" : "";
                        F.mo69127b(aVar, "Service config changed{0}", objArr);
                        C12656x unused3 = C12627d1.this.f59725U = xVar;
                    }
                    try {
                        C12627d1.this.m83980E0();
                    } catch (RuntimeException e) {
                        C12627d1.f59699i0.log(Level.WARNING, "[" + C12627d1.this.mo69268c() + "] Unexpected exception from parsing service config", e);
                    }
                }
                C12649s sVar = C12649s.this;
                if (sVar.f59800a == C12627d1.this.f59707C) {
                    if (xVar != xVar2) {
                        b = b.mo69027d().mo69033d(C12743n0.f60012a, xVar.f59819a).mo69031a();
                    }
                    C12537b1 e2 = C12649s.this.f59800a.f59795a.mo69425e(C12910l0.C12918g.m84911d().mo69693b(a).mo69694c(b).mo69695d(xVar.f59820b.mo69390c()).mo69692a());
                    if (e2.mo69064o()) {
                        return;
                    }
                    if (!a.isEmpty() || j0 != C12653u.SUCCESS) {
                        C12649s.this.m84083f(e2.mo69058e(C12649s.this.f59801b + " was used"));
                        return;
                    }
                    C12649s.this.m84084g();
                }
            }
        }

        C12649s(C12647r rVar, C12981s0 s0Var) {
            this.f59800a = (C12647r) Preconditions.m5393t(rVar, "helperImpl");
            this.f59801b = (C12981s0) Preconditions.m5393t(s0Var, "resolver");
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m84083f(C12537b1 b1Var) {
            C12627d1.f59699i0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C12627d1.this.mo69268c(), b1Var});
            C12653u j0 = C12627d1.this.f59724T;
            C12653u uVar = C12653u.ERROR;
            if (j0 != uVar) {
                C12627d1.this.f59722R.mo69127b(C12554e.C12555a.WARNING, "Failed to resolve name: {0}", b1Var);
                C12653u unused = C12627d1.this.f59724T = uVar;
            }
            if (this.f59800a == C12627d1.this.f59707C) {
                this.f59800a.f59795a.mo69422b(b1Var);
                m84084g();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m84084g() {
            if (C12627d1.this.f59740e0 == null || !C12627d1.this.f59740e0.mo69125b()) {
                if (C12627d1.this.f59742f0 == null) {
                    C12627d1 d1Var = C12627d1.this;
                    C12717j unused = d1Var.f59742f0 = d1Var.f59762x.get();
                }
                long a = C12627d1.this.f59742f0.mo69262a();
                C12627d1.this.f59722R.mo69127b(C12554e.C12555a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
                C12627d1 d1Var2 = C12627d1.this;
                C12550d1.C12553c unused2 = d1Var2.f59740e0 = d1Var2.f59754p.mo69118c(new C12642m(), a, TimeUnit.NANOSECONDS, C12627d1.this.f59743g.mo69457O0());
            }
        }

        /* renamed from: a */
        public void mo69311a(C12537b1 b1Var) {
            Preconditions.m5378e(!b1Var.mo69064o(), "the error status must not be OK");
            C12627d1.this.f59754p.execute(new C12650a(b1Var));
        }

        /* renamed from: c */
        public void mo69312c(C12981s0.C12992h hVar) {
            C12627d1.this.f59754p.execute(new C12651b(hVar));
        }
    }

    /* renamed from: io.grpc.internal.d1$t */
    /* compiled from: ManagedChannelImpl */
    private class C12652t extends C12548d {

        /* renamed from: a */
        private final String f59807a;

        /* synthetic */ C12652t(C12627d1 d1Var, String str, C12628a aVar) {
            this(str);
        }

        /* renamed from: a */
        public String mo69114a() {
            return this.f59807a;
        }

        /* renamed from: h */
        public <ReqT, RespT> C12558f<ReqT, RespT> mo69115h(C12972r0<ReqT, RespT> r0Var, C12542c cVar) {
            return new C12764p(r0Var, C12627d1.this.m83974B0(cVar), cVar, C12627d1.this.f59744g0, C12627d1.this.f59717M ? null : C12627d1.this.f59743g.mo69457O0(), C12627d1.this.f59720P, C12627d1.this.f59734b0).mo69502D(C12627d1.this.f59755q).mo69501C(C12627d1.this.f59756r).mo69500B(C12627d1.this.f59757s);
        }

        private C12652t(String str) {
            this.f59807a = (String) Preconditions.m5393t(str, "authority");
        }
    }

    /* renamed from: io.grpc.internal.d1$u */
    /* compiled from: ManagedChannelImpl */
    enum C12653u {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* renamed from: io.grpc.internal.d1$v */
    /* compiled from: ManagedChannelImpl */
    private static final class C12654v implements ScheduledExecutorService {

        /* renamed from: a */
        final ScheduledExecutorService f59813a;

        /* synthetic */ C12654v(ScheduledExecutorService scheduledExecutorService, C12628a aVar) {
            this(scheduledExecutorService);
        }

        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f59813a.awaitTermination(j, timeUnit);
        }

        public void execute(Runnable runnable) {
            this.f59813a.execute(runnable);
        }

        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.f59813a.invokeAll(collection);
        }

        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
            return this.f59813a.invokeAny(collection);
        }

        public boolean isShutdown() {
            return this.f59813a.isShutdown();
        }

        public boolean isTerminated() {
            return this.f59813a.isTerminated();
        }

        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.f59813a.schedule(callable, j, timeUnit);
        }

        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f59813a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f59813a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        public <T> Future<T> submit(Callable<T> callable) {
            return this.f59813a.submit(callable);
        }

        private C12654v(ScheduledExecutorService scheduledExecutorService) {
            this.f59813a = (ScheduledExecutorService) Preconditions.m5393t(scheduledExecutorService, "delegate");
        }

        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f59813a.invokeAll(collection, j, timeUnit);
        }

        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f59813a.invokeAny(collection, j, timeUnit);
        }

        public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f59813a.schedule(runnable, j, timeUnit);
        }

        public Future<?> submit(Runnable runnable) {
            return this.f59813a.submit(runnable);
        }

        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.f59813a.submit(runnable, t);
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.d1$w */
    /* compiled from: ManagedChannelImpl */
    static final class C12655w extends C12981s0.C12994i {

        /* renamed from: a */
        private final boolean f59814a;

        /* renamed from: b */
        private final int f59815b;

        /* renamed from: c */
        private final int f59816c;

        /* renamed from: d */
        private final C12702i f59817d;

        /* renamed from: e */
        private final C12554e f59818e;

        C12655w(boolean z, int i, int i2, C12702i iVar, C12554e eVar) {
            this.f59814a = z;
            this.f59815b = i;
            this.f59816c = i2;
            this.f59817d = (C12702i) Preconditions.m5393t(iVar, "autoLoadBalancerFactory");
            this.f59818e = (C12554e) Preconditions.m5393t(eVar, "channelLogger");
        }

        /* renamed from: a */
        public C12981s0.C12985c mo69332a(Map<String, ?> map) {
            Object obj;
            try {
                C12981s0.C12985c f = this.f59817d.mo69420f(map, this.f59818e);
                if (f == null) {
                    obj = null;
                } else if (f.mo69828d() != null) {
                    return C12981s0.C12985c.m85164b(f.mo69828d());
                } else {
                    obj = f.mo69827c();
                }
                return C12981s0.C12985c.m85163a(C12681f1.m84151b(map, this.f59814a, this.f59815b, this.f59816c, obj));
            } catch (RuntimeException e) {
                return C12981s0.C12985c.m85164b(C12537b1.f59409h.mo69066q("failed to parse service config").mo69065p(e));
            }
        }
    }

    /* renamed from: io.grpc.internal.d1$x */
    /* compiled from: ManagedChannelImpl */
    private static final class C12656x {

        /* renamed from: a */
        Map<String, ?> f59819a;

        /* renamed from: b */
        C12681f1 f59820b;

        C12656x(Map<String, ?> map, C12681f1 f1Var) {
            this.f59819a = (Map) Preconditions.m5393t(map, "rawServiceConfig");
            this.f59820b = (C12681f1) Preconditions.m5393t(f1Var, "managedChannelServiceConfig");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12656x.class != obj.getClass()) {
                return false;
            }
            C12656x xVar = (C12656x) obj;
            if (!Objects.m5349a(this.f59819a, xVar.f59819a) || !Objects.m5349a(this.f59820b, xVar.f59820b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f59819a, this.f59820b);
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("rawServiceConfig", this.f59819a).mo22194d("managedChannelServiceConfig", this.f59820b).toString();
        }
    }

    /* renamed from: io.grpc.internal.d1$y */
    /* compiled from: ManagedChannelImpl */
    private final class C12657y extends C12665e {

        /* renamed from: a */
        final C12910l0.C12912b f59821a;

        /* renamed from: b */
        final C12647r f59822b;

        /* renamed from: c */
        final C12560f0 f59823c;

        /* renamed from: d */
        final C12741n f59824d;

        /* renamed from: e */
        final C12746o f59825e;

        /* renamed from: f */
        C12910l0.C12922j f59826f;

        /* renamed from: g */
        C12813v0 f59827g;

        /* renamed from: h */
        boolean f59828h;

        /* renamed from: i */
        boolean f59829i;

        /* renamed from: j */
        C12550d1.C12553c f59830j;

        /* renamed from: io.grpc.internal.d1$y$a */
        /* compiled from: ManagedChannelImpl */
        class C12658a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12910l0.C12922j f59832a;

            C12658a(C12910l0.C12922j jVar) {
                this.f59832a = jVar;
            }

            public void run() {
                this.f59832a.mo69497a(C12929o.m84945a(C12926n.SHUTDOWN));
            }
        }

        /* renamed from: io.grpc.internal.d1$y$b */
        /* compiled from: ManagedChannelImpl */
        final class C12659b extends C12813v0.C12826k {

            /* renamed from: a */
            final /* synthetic */ C12910l0.C12922j f59834a;

            C12659b(C12910l0.C12922j jVar) {
                this.f59834a = jVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo69345a(C12813v0 v0Var) {
                C12627d1.this.f59738d0.mo69557d(v0Var, true);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo69346b(C12813v0 v0Var) {
                C12627d1.this.f59738d0.mo69557d(v0Var, false);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo69347c(C12813v0 v0Var, C12929o oVar) {
                C12627d1.this.m83978D0(oVar);
                Preconditions.m5399z(this.f59834a != null, "listener is null");
                this.f59834a.mo69497a(oVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public void mo69348d(C12813v0 v0Var) {
                C12627d1.this.f59710F.remove(v0Var);
                C12627d1.this.f59723S.mo69055k(v0Var);
                C12627d1.this.m83986H0();
            }
        }

        /* renamed from: io.grpc.internal.d1$y$c */
        /* compiled from: ManagedChannelImpl */
        final class C12660c implements Runnable {
            C12660c() {
            }

            public void run() {
                C12657y.this.f59827g.mo69576e(C12627d1.f59703m0);
            }
        }

        /* renamed from: io.grpc.internal.d1$y$d */
        /* compiled from: ManagedChannelImpl */
        class C12661d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12813v0 f59837a;

            C12661d(C12813v0 v0Var) {
                this.f59837a = v0Var;
            }

            public void run() {
                C12627d1.this.f59723S.mo69052e(this.f59837a);
                C12627d1.this.f59710F.add(this.f59837a);
            }
        }

        /* renamed from: io.grpc.internal.d1$y$e */
        /* compiled from: ManagedChannelImpl */
        class C12662e implements Runnable {
            C12662e() {
            }

            public void run() {
                C12657y.this.m84091j();
            }
        }

        C12657y(C12910l0.C12912b bVar, C12647r rVar) {
            this.f59821a = (C12910l0.C12912b) Preconditions.m5393t(bVar, "args");
            this.f59822b = (C12647r) Preconditions.m5393t(rVar, "helper");
            C12560f0 b = C12560f0.m83769b("Subchannel", C12627d1.this.mo69114a());
            this.f59823c = b;
            int Y = C12627d1.this.f59753o;
            long a = C12627d1.this.f59752n.mo69418a();
            C12746o oVar = new C12746o(b, Y, a, "Subchannel for " + bVar.mo69672a());
            this.f59825e = oVar;
            this.f59824d = new C12741n(oVar, C12627d1.this.f59752n);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m84091j() {
            C12550d1.C12553c cVar;
            C12627d1.this.f59754p.mo69119d();
            if (this.f59827g == null) {
                this.f59829i = true;
                return;
            }
            if (!this.f59829i) {
                this.f59829i = true;
            } else if (C12627d1.this.f59716L && (cVar = this.f59830j) != null) {
                cVar.mo69124a();
                this.f59830j = null;
            } else {
                return;
            }
            if (!C12627d1.this.f59716L) {
                this.f59830j = C12627d1.this.f59754p.mo69118c(new C12595a1(new C12660c()), 5, TimeUnit.SECONDS, C12627d1.this.f59743g.mo69457O0());
            } else {
                this.f59827g.mo69576e(C12627d1.f59702l0);
            }
        }

        /* renamed from: k */
        private void m84092k(C12910l0.C12922j jVar) {
            C12910l0.C12922j jVar2 = jVar;
            Preconditions.m5399z(!this.f59828h, "already started");
            Preconditions.m5399z(!this.f59829i, "already shutdown");
            this.f59828h = true;
            this.f59826f = jVar2;
            if (C12627d1.this.f59716L) {
                C12627d1.this.f59754p.execute(new C12658a(jVar2));
                return;
            }
            List<C13005w> a = this.f59821a.mo69672a();
            String a2 = C12627d1.this.mo69114a();
            String e0 = C12627d1.this.f59764z;
            C12717j.C12718a f0 = C12627d1.this.f59762x;
            C12799t C = C12627d1.this.f59743g;
            ScheduledExecutorService O0 = C12627d1.this.f59743g.mo69457O0();
            Supplier g0 = C12627d1.this.f59758t;
            C12550d1 d1Var = C12627d1.this.f59754p;
            C12659b bVar = new C12659b(jVar2);
            C12533b0 a0 = C12627d1.this.f59723S;
            C12735m create = C12627d1.this.f59719O.create();
            C12746o oVar = this.f59825e;
            C12813v0 v0Var = new C12813v0(a, a2, e0, f0, C, O0, g0, d1Var, bVar, a0, create, oVar, this.f59823c, this.f59824d);
            C12627d1.this.f59721Q.mo69477e(new C12544c0.C12545a().mo69101b("Child Subchannel started").mo69102c(C12544c0.C12546b.CT_INFO).mo69104e(C12627d1.this.f59752n.mo69418a()).mo69103d(v0Var).mo69100a());
            this.f59827g = v0Var;
            C12627d1.this.f59754p.execute(new C12661d(v0Var));
        }

        /* renamed from: b */
        public List<C13005w> mo69336b() {
            C12627d1.this.m83982F0("Subchannel.getAllAddresses()");
            Preconditions.m5399z(this.f59828h, "not started");
            return this.f59827g.mo69571H();
        }

        /* renamed from: c */
        public C12520a mo69337c() {
            return this.f59821a.mo69673b();
        }

        /* renamed from: d */
        public Object mo69338d() {
            Preconditions.m5399z(this.f59828h, "Subchannel is not started");
            return this.f59827g;
        }

        /* renamed from: e */
        public void mo69339e() {
            C12627d1.this.m83982F0("Subchannel.requestConnection()");
            Preconditions.m5399z(this.f59828h, "not started");
            this.f59827g.mo69443a();
        }

        /* renamed from: f */
        public void mo69340f() {
            C12627d1.this.m83982F0("Subchannel.shutdown()");
            C12627d1.this.f59754p.execute(new C12662e());
        }

        /* renamed from: g */
        public void mo69341g(C12910l0.C12922j jVar) {
            C12627d1.this.f59754p.mo69119d();
            m84092k(jVar);
        }

        /* renamed from: h */
        public void mo69342h(List<C13005w> list) {
            C12627d1.this.f59754p.mo69119d();
            this.f59827g.mo69574R(list);
        }

        public String toString() {
            return this.f59823c.toString();
        }
    }

    static {
        C12537b1 b1Var = C12537b1.f59422u;
        f59701k0 = b1Var.mo69066q("Channel shutdownNow invoked");
        f59702l0 = b1Var.mo69066q("Channel shutdown invoked");
        f59703m0 = b1Var.mo69066q("Subchannel shutdown invoked");
    }

    C12627d1(C12601b<?> bVar, C12799t tVar, C12717j.C12718a aVar, C12733l1<? extends Executor> l1Var, Supplier<Stopwatch> supplier, List<C12561g> list, C12700h2 h2Var) {
        C12628a aVar2;
        C12601b<?> bVar2 = bVar;
        C12733l1<? extends Executor> l1Var2 = l1Var;
        C12700h2 h2Var2 = h2Var;
        C12550d1 d1Var = new C12550d1(new C12628a());
        this.f59754p = d1Var;
        C12643n nVar = new C12643n(this, (C12628a) null);
        this.f59736c0 = nVar;
        this.f59738d0 = new C12645p(this, (C12628a) null);
        this.f59744g0 = new C12639l(this, (C12628a) null);
        String str = (String) Preconditions.m5393t(bVar2.f59611f, TypedValues.Attributes.S_TARGET);
        this.f59733b = str;
        C12560f0 b = C12560f0.m83769b("Channel", str);
        this.f59731a = b;
        this.f59752n = (C12700h2) Preconditions.m5393t(h2Var2, "timeProvider");
        C12733l1<? extends Executor> l1Var3 = (C12733l1) Preconditions.m5393t(bVar2.f59606a, "executorPool");
        this.f59748j = l1Var3;
        Executor executor = (Executor) Preconditions.m5393t(l1Var3.mo69356a(), "executor");
        this.f59747i = executor;
        C12729l lVar = new C12729l(tVar, executor);
        this.f59743g = lVar;
        C12654v vVar = new C12654v(lVar.mo69457O0(), (C12628a) null);
        this.f59745h = vVar;
        this.f59753o = bVar2.f59627v;
        C12746o oVar = r11;
        C12729l lVar2 = lVar;
        C12654v vVar2 = vVar;
        C12746o oVar2 = new C12746o(b, bVar2.f59627v, h2Var.mo69418a(), "Channel for '" + str + "'");
        this.f59721Q = oVar;
        C12741n nVar2 = new C12741n(oVar, h2Var2);
        this.f59722R = nVar2;
        C12981s0.C12986d h = bVar.mo69216h();
        this.f59737d = h;
        C13011y0 y0Var = bVar2.f59600A;
        y0Var = y0Var == null ? C12749o0.f60042o : y0Var;
        boolean z = bVar2.f59624s && !bVar2.f59625t;
        this.f59734b0 = z;
        C12702i iVar = new C12702i(bVar2.f59615j);
        this.f59741f = iVar;
        this.f59751m = new C12644o((C12733l1) Preconditions.m5393t(bVar2.f59607b, "offloadExecutorPool"));
        this.f59735c = bVar2.f59609d;
        C12655w wVar = new C12655w(z, bVar2.f59620o, bVar2.f59621p, iVar, nVar2);
        C12981s0.C12983b a = C12981s0.C12983b.m85149f().mo69821c(bVar.mo69214f()).mo69823e(y0Var).mo69826h(d1Var).mo69824f(vVar2).mo69825g(wVar).mo69820b(nVar2).mo69822d(new C12638k()).mo69819a();
        this.f59739e = a;
        this.f59705A = m83976C0(str, h, a);
        this.f59749k = (C12733l1) Preconditions.m5393t(l1Var2, "balancerRpcExecutorPool");
        this.f59750l = new C12644o(l1Var2);
        C12881z zVar = new C12881z(executor, d1Var);
        this.f59712H = zVar;
        zVar.mo69407f(nVar);
        this.f59762x = aVar;
        C12596a2 a2Var = new C12596a2(z);
        this.f59761w = a2Var;
        Map<String, ?> map = bVar2.f59628w;
        if (map != null) {
            C12981s0.C12985c a2 = wVar.mo69332a(map);
            Preconditions.m5372C(a2.mo69828d() == null, "Default config is invalid: %s", a2.mo69828d());
            C12656x xVar = new C12656x(bVar2.f59628w, (C12681f1) a2.mo69827c());
            this.f59726V = xVar;
            this.f59725U = xVar;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f59726V = null;
        }
        boolean z2 = bVar2.f59629x;
        this.f59728X = z2;
        boolean z3 = false;
        this.f59763y = C12566i.m83780a(C12566i.m83781b(new C12652t(this, this.f59705A.mo69218a(), aVar2), a2Var), list);
        this.f59758t = (Supplier) Preconditions.m5393t(supplier, "stopwatchSupplier");
        long j = bVar2.f59619n;
        if (j == -1) {
            this.f59759u = j;
        } else {
            Preconditions.m5383j(j >= C12601b.f59596I ? true : z3, "invalid idleTimeoutMillis %s", j);
            this.f59759u = bVar2.f59619n;
        }
        this.f59746h0 = new C12833v1(new C12646q(this, (C12628a) null), d1Var, lVar2.mo69457O0(), supplier.get());
        this.f59755q = bVar2.f59616k;
        this.f59756r = (C12997u) Preconditions.m5393t(bVar2.f59617l, "decompressorRegistry");
        this.f59757s = (C12923m) Preconditions.m5393t(bVar2.f59618m, "compressorRegistry");
        this.f59764z = bVar2.f59613h;
        this.f59732a0 = bVar2.f59622q;
        this.f59730Z = bVar2.f59623r;
        C12630c cVar = new C12630c(h2Var);
        this.f59719O = cVar;
        this.f59720P = cVar.create();
        C12533b0 b0Var = (C12533b0) Preconditions.m5392s(bVar2.f59626u);
        this.f59723S = b0Var;
        b0Var.mo69051d(this);
        if (!z2) {
            if (this.f59726V != null) {
                nVar2.mo69126a(C12554e.C12555a.INFO, "Service config look-up disabled, using default service config");
            }
            m83980E0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public Executor m83974B0(C12542c cVar) {
        Executor e = cVar.mo69080e();
        return e == null ? this.f59747i : e;
    }

    @VisibleForTesting
    /* renamed from: C0 */
    static C12981s0 m83976C0(String str, C12981s0.C12986d dVar, C12981s0.C12983b bVar) {
        URI uri;
        C12981s0 c;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri != null && (c = dVar.mo69445c(uri, bVar)) != null) {
            return c;
        }
        String str2 = "";
        if (!f59700j0.matcher(str).matches()) {
            try {
                C12981s0 c2 = dVar.mo69445c(new URI(dVar.mo69444a(), str2, "/" + str, (String) null), bVar);
                if (c2 != null) {
                    return c2;
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb.length() > 0) {
            str2 = " (" + sb + ")";
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public void m83978D0(C12929o oVar) {
        if (oVar.mo69706c() == C12926n.TRANSIENT_FAILURE || oVar.mo69706c() == C12926n.IDLE) {
            m83989J0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m83980E0() {
        this.f59727W = true;
        this.f59761w.mo69209f(this.f59725U.f59820b);
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m83982F0(String str) {
        try {
            this.f59754p.mo69119d();
        } catch (IllegalStateException e) {
            Logger logger = f59699i0;
            Level level = Level.WARNING;
            logger.log(level, str + " should be called from SynchronizationContext. This warning will become an exception in a future release. See https://github.com/grpc/grpc-java/issues/5015 for more details", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public void m83984G0() {
        if (this.f59715K) {
            for (C12813v0 b : this.f59710F) {
                b.mo69575b(f59701k0);
            }
            for (C12739m1 p : this.f59711G) {
                p.mo69472p().mo69575b(f59701k0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public void m83986H0() {
        if (!this.f59717M && this.f59714J.get() && this.f59710F.isEmpty() && this.f59711G.isEmpty()) {
            this.f59722R.mo69126a(C12554e.C12555a.INFO, "Terminated");
            this.f59723S.mo69054j(this);
            this.f59748j.mo69357b(this.f59747i);
            this.f59750l.mo69301b();
            this.f59751m.mo69301b();
            this.f59743g.close();
            this.f59717M = true;
            this.f59718N.countDown();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public void m83989J0() {
        this.f59754p.mo69119d();
        m84044y0();
        m83991K0();
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m83991K0() {
        this.f59754p.mo69119d();
        if (this.f59706B) {
            this.f59705A.mo69219b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public void m83993L0() {
        long j = this.f59759u;
        if (j != -1) {
            this.f59746h0.mo69598k(j, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public void m83996N0(boolean z) {
        this.f59754p.mo69119d();
        if (z) {
            Preconditions.m5399z(this.f59706B, "nameResolver is not started");
            Preconditions.m5399z(this.f59707C != null, "lbHelper is null");
        }
        if (this.f59705A != null) {
            m84044y0();
            this.f59705A.mo69220c();
            this.f59706B = false;
            if (z) {
                this.f59705A = m83976C0(this.f59733b, this.f59737d, this.f59739e);
            } else {
                this.f59705A = null;
            }
        }
        C12647r rVar = this.f59707C;
        if (rVar != null) {
            rVar.f59795a.mo69424d();
            this.f59707C = null;
        }
        this.f59708D = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public void m83999P0(C12910l0.C12921i iVar) {
        this.f59708D = iVar;
        this.f59712H.mo69640r(iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m84042x0(boolean z) {
        this.f59746h0.mo69597i(z);
    }

    /* renamed from: y0 */
    private void m84044y0() {
        this.f59754p.mo69119d();
        C12550d1.C12553c cVar = this.f59740e0;
        if (cVar != null) {
            cVar.mo69124a();
            this.f59740e0 = null;
            this.f59742f0 = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m84046z0() {
        m83996N0(true);
        this.f59712H.mo69640r((C12910l0.C12921i) null);
        this.f59722R.mo69126a(C12554e.C12555a.INFO, "Entering IDLE state");
        this.f59760v.mo69602b(C12926n.IDLE);
        if (this.f59738d0.mo69556c()) {
            mo69264A0();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: A0 */
    public void mo69264A0() {
        this.f59754p.mo69119d();
        if (!this.f59714J.get() && !this.f59709E) {
            if (this.f59738d0.mo69556c()) {
                m84042x0(false);
            } else {
                m83993L0();
            }
            if (this.f59707C == null) {
                this.f59722R.mo69126a(C12554e.C12555a.INFO, "Exiting idle mode");
                C12647r rVar = new C12647r(this, (C12628a) null);
                rVar.f59795a = this.f59741f.mo69419e(rVar);
                this.f59707C = rVar;
                this.f59705A.mo69221d(new C12649s(rVar, this.f59705A));
                this.f59706B = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: I0 */
    public void mo69265I0(Throwable th) {
        if (!this.f59709E) {
            this.f59709E = true;
            m84042x0(true);
            m83996N0(false);
            m83999P0(new C12632e(th));
            this.f59722R.mo69126a(C12554e.C12555a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
            this.f59760v.mo69602b(C12926n.TRANSIENT_FAILURE);
        }
    }

    /* renamed from: M0 */
    public C12627d1 mo69274n() {
        this.f59722R.mo69126a(C12554e.C12555a.DEBUG, "shutdown() called");
        if (!this.f59714J.compareAndSet(false, true)) {
            return this;
        }
        this.f59754p.mo69117b(new C12636i());
        this.f59713I.mo69353b(f59702l0);
        this.f59754p.execute(new C12629b());
        return this;
    }

    /* renamed from: O0 */
    public C12627d1 mo69275o() {
        this.f59722R.mo69126a(C12554e.C12555a.DEBUG, "shutdownNow() called");
        mo69274n();
        this.f59713I.mo69354c(f59701k0);
        this.f59754p.execute(new C12637j());
        return this;
    }

    /* renamed from: a */
    public String mo69114a() {
        return this.f59763y.mo69114a();
    }

    /* renamed from: c */
    public C12560f0 mo69268c() {
        return this.f59731a;
    }

    /* renamed from: h */
    public <ReqT, RespT> C12558f<ReqT, RespT> mo69115h(C12972r0<ReqT, RespT> r0Var, C12542c cVar) {
        return this.f59763y.mo69115h(r0Var, cVar);
    }

    /* renamed from: i */
    public boolean mo69269i(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f59718N.await(j, timeUnit);
    }

    /* renamed from: j */
    public void mo69270j() {
        this.f59754p.execute(new C12633f());
    }

    /* renamed from: k */
    public C12926n mo69271k(boolean z) {
        C12926n a = this.f59760v.mo69601a();
        if (z && a == C12926n.IDLE) {
            this.f59754p.execute(new C12634g());
        }
        return a;
    }

    /* renamed from: l */
    public void mo69272l(C12926n nVar, Runnable runnable) {
        this.f59754p.execute(new C12631d(runnable, nVar));
    }

    /* renamed from: m */
    public void mo69273m() {
        this.f59754p.execute(new C12635h());
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22193c("logId", this.f59731a.mo69134d()).mo22194d(TypedValues.Attributes.S_TARGET, this.f59733b).toString();
    }

    /* renamed from: io.grpc.internal.d1$z */
    /* compiled from: ManagedChannelImpl */
    private final class C12663z {

        /* renamed from: a */
        final Object f59840a;

        /* renamed from: b */
        Collection<C12781q> f59841b;

        /* renamed from: c */
        C12537b1 f59842c;

        private C12663z() {
            this.f59840a = new Object();
            this.f59841b = new HashSet();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12537b1 mo69352a(C12844w1<?> w1Var) {
            synchronized (this.f59840a) {
                C12537b1 b1Var = this.f59842c;
                if (b1Var != null) {
                    return b1Var;
                }
                this.f59841b.add(w1Var);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
            p292io.grpc.internal.C12627d1.m84035u(r2.f59843d).mo69406e(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo69353b(p292io.grpc.C12537b1 r3) {
            /*
                r2 = this;
                java.lang.Object r0 = r2.f59840a
                monitor-enter(r0)
                io.grpc.b1 r1 = r2.f59842c     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                return
            L_0x0009:
                r2.f59842c = r3     // Catch:{ all -> 0x001e }
                java.util.Collection<io.grpc.internal.q> r1 = r2.f59841b     // Catch:{ all -> 0x001e }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x001d
                io.grpc.internal.d1 r0 = p292io.grpc.internal.C12627d1.this
                io.grpc.internal.z r0 = r0.f59712H
                r0.mo69406e(r3)
            L_0x001d:
                return
            L_0x001e:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001e }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12627d1.C12663z.mo69353b(io.grpc.b1):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo69354c(C12537b1 b1Var) {
            ArrayList<C12781q> arrayList;
            mo69353b(b1Var);
            synchronized (this.f59840a) {
                arrayList = new ArrayList<>(this.f59841b);
            }
            for (C12781q e : arrayList) {
                e.mo69141e(b1Var);
            }
            C12627d1.this.f59712H.mo69405b(b1Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo69355d(C12844w1<?> w1Var) {
            C12537b1 b1Var;
            synchronized (this.f59840a) {
                this.f59841b.remove(w1Var);
                if (this.f59841b.isEmpty()) {
                    b1Var = this.f59842c;
                    this.f59841b = new HashSet();
                } else {
                    b1Var = null;
                }
            }
            if (b1Var != null) {
                C12627d1.this.f59712H.mo69406e(b1Var);
            }
        }

        /* synthetic */ C12663z(C12627d1 d1Var, C12628a aVar) {
            this();
        }
    }
}

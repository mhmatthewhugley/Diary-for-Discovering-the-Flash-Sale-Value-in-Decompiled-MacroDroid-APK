package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.ForOverride;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p292io.grpc.C12520a;
import p292io.grpc.C12524a0;
import p292io.grpc.C12533b0;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12550d1;
import p292io.grpc.C12554e;
import p292io.grpc.C12556e0;
import p292io.grpc.C12560f0;
import p292io.grpc.C12926n;
import p292io.grpc.C12929o;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.C13005w;
import p292io.grpc.internal.C12688g1;
import p292io.grpc.internal.C12717j;
import p292io.grpc.internal.C12785r;
import p292io.grpc.internal.C12799t;

/* renamed from: io.grpc.internal.v0 */
/* compiled from: InternalSubchannel */
final class C12813v0 implements C12556e0<Object>, C12721j2 {

    /* renamed from: a */
    private final C12560f0 f60214a;

    /* renamed from: b */
    private final String f60215b;

    /* renamed from: c */
    private final String f60216c;

    /* renamed from: d */
    private final C12717j.C12718a f60217d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12826k f60218e;

    /* renamed from: f */
    private final C12799t f60219f;

    /* renamed from: g */
    private final ScheduledExecutorService f60220g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12533b0 f60221h;

    /* renamed from: i */
    private final C12735m f60222i;

    /* renamed from: j */
    private final C12746o f60223j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C12554e f60224k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C12550d1 f60225l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C12827l f60226m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile List<C13005w> f60227n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C12717j f60228o;

    /* renamed from: p */
    private final Stopwatch f60229p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C12550d1.C12553c f60230q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Collection<C12812v> f60231r = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C12801t0<C12812v> f60232s = new C12814a();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C12812v f60233t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public volatile C12688g1 f60234u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public volatile C12929o f60235v = C12929o.m84945a(C12926n.IDLE);
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C12537b1 f60236w;

    /* renamed from: io.grpc.internal.v0$a */
    /* compiled from: InternalSubchannel */
    class C12814a extends C12801t0<C12812v> {
        C12814a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo69302a() {
            C12813v0.this.f60218e.mo69345a(C12813v0.this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo69303b() {
            C12813v0.this.f60218e.mo69346b(C12813v0.this);
        }
    }

    /* renamed from: io.grpc.internal.v0$b */
    /* compiled from: InternalSubchannel */
    class C12815b implements Runnable {
        C12815b() {
        }

        public void run() {
            C12550d1.C12553c unused = C12813v0.this.f60230q = null;
            C12813v0.this.f60224k.mo69126a(C12554e.C12555a.INFO, "CONNECTING after backoff");
            C12813v0.this.m84594J(C12926n.CONNECTING);
            C12813v0.this.m84600Q();
        }
    }

    /* renamed from: io.grpc.internal.v0$c */
    /* compiled from: InternalSubchannel */
    class C12816c implements Runnable {
        C12816c() {
        }

        public void run() {
            if (C12813v0.this.f60235v.mo69706c() == C12926n.IDLE) {
                C12813v0.this.f60224k.mo69126a(C12554e.C12555a.INFO, "CONNECTING as requested");
                C12813v0.this.m84594J(C12926n.CONNECTING);
                C12813v0.this.m84600Q();
            }
        }
    }

    /* renamed from: io.grpc.internal.v0$d */
    /* compiled from: InternalSubchannel */
    class C12817d implements Runnable {
        C12817d() {
        }

        public void run() {
            if (C12813v0.this.f60235v.mo69706c() == C12926n.TRANSIENT_FAILURE) {
                C12813v0.this.m84592F();
                C12813v0.this.f60224k.mo69126a(C12554e.C12555a.INFO, "CONNECTING; backoff interrupted");
                C12813v0.this.m84594J(C12926n.CONNECTING);
                C12813v0.this.m84600Q();
            }
        }
    }

    /* renamed from: io.grpc.internal.v0$e */
    /* compiled from: InternalSubchannel */
    class C12818e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f60241a;

        C12818e(List list) {
            this.f60241a = list;
        }

        public void run() {
            C12688g1 g1Var;
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.f60241a));
            SocketAddress a = C12813v0.this.f60226m.mo69586a();
            C12813v0.this.f60226m.mo69593h(unmodifiableList);
            List unused = C12813v0.this.f60227n = unmodifiableList;
            C12926n c = C12813v0.this.f60235v.mo69706c();
            C12926n nVar = C12926n.READY;
            C12688g1 g1Var2 = null;
            if ((c == nVar || C12813v0.this.f60235v.mo69706c() == C12926n.CONNECTING) && !C12813v0.this.f60226m.mo69592g(a)) {
                if (C12813v0.this.f60235v.mo69706c() == nVar) {
                    g1Var = C12813v0.this.f60234u;
                    C12688g1 unused2 = C12813v0.this.f60234u = null;
                    C12813v0.this.f60226m.mo69591f();
                    C12813v0.this.m84594J(C12926n.IDLE);
                } else {
                    g1Var = C12813v0.this.f60233t;
                    C12812v unused3 = C12813v0.this.f60233t = null;
                    C12813v0.this.f60226m.mo69591f();
                    C12813v0.this.m84600Q();
                }
                g1Var2 = g1Var;
            }
            if (g1Var2 != null) {
                g1Var2.mo69406e(C12537b1.f59422u.mo69066q("InternalSubchannel closed transport due to address change"));
            }
        }
    }

    /* renamed from: io.grpc.internal.v0$f */
    /* compiled from: InternalSubchannel */
    class C12819f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12537b1 f60243a;

        C12819f(C12537b1 b1Var) {
            this.f60243a = b1Var;
        }

        public void run() {
            C12926n c = C12813v0.this.f60235v.mo69706c();
            C12926n nVar = C12926n.SHUTDOWN;
            if (c != nVar) {
                C12537b1 unused = C12813v0.this.f60236w = this.f60243a;
                C12688g1 j = C12813v0.this.f60234u;
                C12812v l = C12813v0.this.f60233t;
                C12688g1 unused2 = C12813v0.this.f60234u = null;
                C12812v unused3 = C12813v0.this.f60233t = null;
                C12813v0.this.m84594J(nVar);
                C12813v0.this.f60226m.mo69591f();
                if (C12813v0.this.f60231r.isEmpty()) {
                    C12813v0.this.m84596L();
                }
                C12813v0.this.m84592F();
                if (j != null) {
                    j.mo69406e(this.f60243a);
                }
                if (l != null) {
                    l.mo69406e(this.f60243a);
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.v0$g */
    /* compiled from: InternalSubchannel */
    class C12820g implements Runnable {
        C12820g() {
        }

        public void run() {
            C12813v0.this.f60224k.mo69126a(C12554e.C12555a.INFO, "Terminated");
            C12813v0.this.f60218e.mo69348d(C12813v0.this);
        }
    }

    /* renamed from: io.grpc.internal.v0$h */
    /* compiled from: InternalSubchannel */
    class C12821h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12812v f60246a;

        /* renamed from: c */
        final /* synthetic */ boolean f60247c;

        C12821h(C12812v vVar, boolean z) {
            this.f60246a = vVar;
            this.f60247c = z;
        }

        public void run() {
            C12813v0.this.f60232s.mo69557d(this.f60246a, this.f60247c);
        }
    }

    /* renamed from: io.grpc.internal.v0$i */
    /* compiled from: InternalSubchannel */
    class C12822i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12537b1 f60249a;

        C12822i(C12537b1 b1Var) {
            this.f60249a = b1Var;
        }

        public void run() {
            for (C12688g1 b : new ArrayList(C12813v0.this.f60231r)) {
                b.mo69405b(this.f60249a);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.v0$j */
    /* compiled from: InternalSubchannel */
    static final class C12823j extends C12710i0 {

        /* renamed from: a */
        private final C12812v f60251a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C12735m f60252b;

        /* renamed from: io.grpc.internal.v0$j$a */
        /* compiled from: InternalSubchannel */
        class C12824a extends C12687g0 {

            /* renamed from: a */
            final /* synthetic */ C12781q f60253a;

            /* renamed from: io.grpc.internal.v0$j$a$a */
            /* compiled from: InternalSubchannel */
            class C12825a extends C12693h0 {

                /* renamed from: a */
                final /* synthetic */ C12785r f60255a;

                C12825a(C12785r rVar) {
                    this.f60255a = rVar;
                }

                /* renamed from: b */
                public void mo69195b(C12537b1 b1Var, C12960q0 q0Var) {
                    C12823j.this.f60252b.mo69470a(b1Var.mo69064o());
                    super.mo69195b(b1Var, q0Var);
                }

                /* renamed from: d */
                public void mo69197d(C12537b1 b1Var, C12785r.C12786a aVar, C12960q0 q0Var) {
                    C12823j.this.f60252b.mo69470a(b1Var.mo69064o());
                    super.mo69197d(b1Var, aVar, q0Var);
                }

                /* access modifiers changed from: protected */
                /* renamed from: e */
                public C12785r mo69408e() {
                    return this.f60255a;
                }
            }

            C12824a(C12781q qVar) {
                this.f60253a = qVar;
            }

            /* renamed from: m */
            public void mo69147m(C12785r rVar) {
                C12823j.this.f60252b.mo69471b();
                super.mo69147m(new C12825a(rVar));
            }

            /* access modifiers changed from: protected */
            /* renamed from: n */
            public C12781q mo69403n() {
                return this.f60253a;
            }
        }

        /* synthetic */ C12823j(C12812v vVar, C12735m mVar, C12814a aVar) {
            this(vVar, mVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12812v mo69433a() {
            return this.f60251a;
        }

        /* renamed from: g */
        public C12781q mo69389g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
            return new C12824a(super.mo69389g(r0Var, q0Var, cVar));
        }

        private C12823j(C12812v vVar, C12735m mVar) {
            this.f60251a = vVar;
            this.f60252b = mVar;
        }
    }

    /* renamed from: io.grpc.internal.v0$k */
    /* compiled from: InternalSubchannel */
    static abstract class C12826k {
        C12826k() {
        }

        /* access modifiers changed from: package-private */
        @ForOverride
        /* renamed from: a */
        public abstract void mo69345a(C12813v0 v0Var);

        /* access modifiers changed from: package-private */
        @ForOverride
        /* renamed from: b */
        public abstract void mo69346b(C12813v0 v0Var);

        /* access modifiers changed from: package-private */
        @ForOverride
        /* renamed from: c */
        public abstract void mo69347c(C12813v0 v0Var, C12929o oVar);

        /* access modifiers changed from: package-private */
        @ForOverride
        /* renamed from: d */
        public abstract void mo69348d(C12813v0 v0Var);
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.v0$l */
    /* compiled from: InternalSubchannel */
    static final class C12827l {

        /* renamed from: a */
        private List<C13005w> f60257a;

        /* renamed from: b */
        private int f60258b;

        /* renamed from: c */
        private int f60259c;

        public C12827l(List<C13005w> list) {
            this.f60257a = list;
        }

        /* renamed from: a */
        public SocketAddress mo69586a() {
            return this.f60257a.get(this.f60258b).mo69861a().get(this.f60259c);
        }

        /* renamed from: b */
        public C12520a mo69587b() {
            return this.f60257a.get(this.f60258b).mo69862b();
        }

        /* renamed from: c */
        public void mo69588c() {
            int i = this.f60259c + 1;
            this.f60259c = i;
            if (i >= this.f60257a.get(this.f60258b).mo69861a().size()) {
                this.f60258b++;
                this.f60259c = 0;
            }
        }

        /* renamed from: d */
        public boolean mo69589d() {
            return this.f60258b == 0 && this.f60259c == 0;
        }

        /* renamed from: e */
        public boolean mo69590e() {
            return this.f60258b < this.f60257a.size();
        }

        /* renamed from: f */
        public void mo69591f() {
            this.f60258b = 0;
            this.f60259c = 0;
        }

        /* renamed from: g */
        public boolean mo69592g(SocketAddress socketAddress) {
            int i = 0;
            while (i < this.f60257a.size()) {
                int indexOf = this.f60257a.get(i).mo69861a().indexOf(socketAddress);
                if (indexOf == -1) {
                    i++;
                } else {
                    this.f60258b = i;
                    this.f60259c = indexOf;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public void mo69593h(List<C13005w> list) {
            this.f60257a = list;
            mo69591f();
        }
    }

    /* renamed from: io.grpc.internal.v0$m */
    /* compiled from: InternalSubchannel */
    private class C12828m implements C12688g1.C12689a {

        /* renamed from: a */
        final C12812v f60260a;

        /* renamed from: b */
        final SocketAddress f60261b;

        /* renamed from: c */
        boolean f60262c = false;

        /* renamed from: io.grpc.internal.v0$m$a */
        /* compiled from: InternalSubchannel */
        class C12829a implements Runnable {
            C12829a() {
            }

            public void run() {
                C12717j unused = C12813v0.this.f60228o = null;
                if (C12813v0.this.f60236w != null) {
                    Preconditions.m5399z(C12813v0.this.f60234u == null, "Unexpected non-null activeTransport");
                    C12828m mVar = C12828m.this;
                    mVar.f60260a.mo69406e(C12813v0.this.f60236w);
                    return;
                }
                C12812v l = C12813v0.this.f60233t;
                C12828m mVar2 = C12828m.this;
                C12812v vVar = mVar2.f60260a;
                if (l == vVar) {
                    C12688g1 unused2 = C12813v0.this.f60234u = vVar;
                    C12812v unused3 = C12813v0.this.f60233t = null;
                    C12813v0.this.m84594J(C12926n.READY);
                }
            }
        }

        /* renamed from: io.grpc.internal.v0$m$b */
        /* compiled from: InternalSubchannel */
        class C12830b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12537b1 f60265a;

            C12830b(C12537b1 b1Var) {
                this.f60265a = b1Var;
            }

            public void run() {
                if (C12813v0.this.f60235v.mo69706c() != C12926n.SHUTDOWN) {
                    C12688g1 j = C12813v0.this.f60234u;
                    C12828m mVar = C12828m.this;
                    if (j == mVar.f60260a) {
                        C12688g1 unused = C12813v0.this.f60234u = null;
                        C12813v0.this.f60226m.mo69591f();
                        C12813v0.this.m84594J(C12926n.IDLE);
                        return;
                    }
                    C12812v l = C12813v0.this.f60233t;
                    C12828m mVar2 = C12828m.this;
                    if (l == mVar2.f60260a) {
                        Preconditions.m5372C(C12813v0.this.f60235v.mo69706c() == C12926n.CONNECTING, "Expected state is CONNECTING, actual state is %s", C12813v0.this.f60235v.mo69706c());
                        C12813v0.this.f60226m.mo69588c();
                        if (!C12813v0.this.f60226m.mo69590e()) {
                            C12812v unused2 = C12813v0.this.f60233t = null;
                            C12813v0.this.f60226m.mo69591f();
                            C12813v0.this.m84599P(this.f60265a);
                            return;
                        }
                        C12813v0.this.m84600Q();
                    }
                }
            }
        }

        /* renamed from: io.grpc.internal.v0$m$c */
        /* compiled from: InternalSubchannel */
        class C12831c implements Runnable {
            C12831c() {
            }

            public void run() {
                C12813v0.this.f60231r.remove(C12828m.this.f60260a);
                if (C12813v0.this.f60235v.mo69706c() == C12926n.SHUTDOWN && C12813v0.this.f60231r.isEmpty()) {
                    C12813v0.this.m84596L();
                }
            }
        }

        C12828m(C12812v vVar, SocketAddress socketAddress) {
            this.f60260a = vVar;
            this.f60261b = socketAddress;
        }

        /* renamed from: a */
        public void mo69296a(C12537b1 b1Var) {
            C12813v0.this.f60224k.mo69127b(C12554e.C12555a.INFO, "{0} SHUTDOWN with {1}", this.f60260a.mo69268c(), C12813v0.this.m84598N(b1Var));
            this.f60262c = true;
            C12813v0.this.f60225l.execute(new C12830b(b1Var));
        }

        /* renamed from: b */
        public void mo69297b() {
            C12813v0.this.f60224k.mo69126a(C12554e.C12555a.INFO, "READY");
            C12813v0.this.f60225l.execute(new C12829a());
        }

        /* renamed from: c */
        public void mo69298c(boolean z) {
            C12813v0.this.m84597M(this.f60260a, z);
        }

        /* renamed from: d */
        public void mo69299d() {
            Preconditions.m5399z(this.f60262c, "transportShutdown() must be called before transportTerminated().");
            C12813v0.this.f60224k.mo69127b(C12554e.C12555a.INFO, "{0} Terminated", this.f60260a.mo69268c());
            C12813v0.this.f60221h.mo69053i(this.f60260a);
            C12813v0.this.m84597M(this.f60260a, false);
            C12813v0.this.f60225l.execute(new C12831c());
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.v0$n */
    /* compiled from: InternalSubchannel */
    static final class C12832n extends C12554e {

        /* renamed from: a */
        C12560f0 f60268a;

        C12832n() {
        }

        /* renamed from: a */
        public void mo69126a(C12554e.C12555a aVar, String str) {
            C12741n.m84341d(this.f60268a, aVar, str);
        }

        /* renamed from: b */
        public void mo69127b(C12554e.C12555a aVar, String str, Object... objArr) {
            C12741n.m84342e(this.f60268a, aVar, str, objArr);
        }
    }

    C12813v0(List<C13005w> list, String str, String str2, C12717j.C12718a aVar, C12799t tVar, ScheduledExecutorService scheduledExecutorService, Supplier<Stopwatch> supplier, C12550d1 d1Var, C12826k kVar, C12533b0 b0Var, C12735m mVar, C12746o oVar, C12560f0 f0Var, C12554e eVar) {
        List<C13005w> list2 = list;
        Preconditions.m5393t(list, "addressGroups");
        Preconditions.m5378e(!list.isEmpty(), "addressGroups is empty");
        m84593G(list, "addressGroups contains null entry");
        List<C13005w> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f60227n = unmodifiableList;
        this.f60226m = new C12827l(unmodifiableList);
        this.f60215b = str;
        this.f60216c = str2;
        this.f60217d = aVar;
        this.f60219f = tVar;
        this.f60220g = scheduledExecutorService;
        this.f60229p = supplier.get();
        this.f60225l = d1Var;
        this.f60218e = kVar;
        this.f60221h = b0Var;
        this.f60222i = mVar;
        this.f60223j = (C12746o) Preconditions.m5393t(oVar, "channelTracer");
        this.f60214a = (C12560f0) Preconditions.m5393t(f0Var, "logId");
        this.f60224k = (C12554e) Preconditions.m5393t(eVar, "channelLogger");
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m84592F() {
        this.f60225l.mo69119d();
        C12550d1.C12553c cVar = this.f60230q;
        if (cVar != null) {
            cVar.mo69124a();
            this.f60230q = null;
            this.f60228o = null;
        }
    }

    /* renamed from: G */
    private static void m84593G(List<?> list, String str) {
        for (Object t : list) {
            Preconditions.m5393t(t, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m84594J(C12926n nVar) {
        this.f60225l.mo69119d();
        m84595K(C12929o.m84945a(nVar));
    }

    /* renamed from: K */
    private void m84595K(C12929o oVar) {
        this.f60225l.mo69119d();
        if (this.f60235v.mo69706c() != oVar.mo69706c()) {
            boolean z = this.f60235v.mo69706c() != C12926n.SHUTDOWN;
            Preconditions.m5399z(z, "Cannot transition out of SHUTDOWN to " + oVar);
            this.f60235v = oVar;
            this.f60218e.mo69347c(this, oVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m84596L() {
        this.f60225l.execute(new C12820g());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m84597M(C12812v vVar, boolean z) {
        this.f60225l.execute(new C12821h(vVar, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public String m84598N(C12537b1 b1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(b1Var.mo69062m());
        if (b1Var.mo69063n() != null) {
            sb.append("(");
            sb.append(b1Var.mo69063n());
            sb.append(")");
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m84599P(C12537b1 b1Var) {
        this.f60225l.mo69119d();
        m84595K(C12929o.m84946b(b1Var));
        if (this.f60228o == null) {
            this.f60228o = this.f60217d.get();
        }
        long a = this.f60228o.mo69262a();
        Stopwatch stopwatch = this.f60229p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long e = a - stopwatch.mo22252e(timeUnit);
        boolean z = false;
        this.f60224k.mo69127b(C12554e.C12555a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", m84598N(b1Var), Long.valueOf(e));
        if (this.f60230q == null) {
            z = true;
        }
        Preconditions.m5399z(z, "previous reconnectTask is not done");
        this.f60230q = this.f60225l.mo69118c(new C12815b(), e, timeUnit, this.f60220g);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m84600Q() {
        SocketAddress socketAddress;
        C12524a0 a0Var;
        this.f60225l.mo69119d();
        Preconditions.m5399z(this.f60230q == null, "Should have no reconnectTask scheduled");
        if (this.f60226m.mo69589d()) {
            this.f60229p.mo22254h().mo22255i();
        }
        SocketAddress a = this.f60226m.mo69586a();
        if (a instanceof C12524a0) {
            a0Var = (C12524a0) a;
            socketAddress = a0Var.mo69036b();
        } else {
            socketAddress = a;
            a0Var = null;
        }
        C12520a b = this.f60226m.mo69587b();
        String str = (String) b.mo69026b(C13005w.f60757d);
        C12799t.C12800a aVar = new C12799t.C12800a();
        if (str == null) {
            str = this.f60215b;
        }
        C12799t.C12800a g = aVar.mo69550e(str).mo69552f(b).mo69554h(this.f60216c).mo69553g(a0Var);
        C12832n nVar = new C12832n();
        nVar.f60268a = mo69268c();
        C12823j jVar = new C12823j(this.f60219f.mo69458O1(socketAddress, g, nVar), this.f60222i, (C12814a) null);
        nVar.f60268a = jVar.mo69268c();
        this.f60221h.mo69050c(jVar);
        this.f60233t = jVar;
        this.f60231r.add(jVar);
        Runnable f = jVar.mo69407f(new C12828m(jVar, socketAddress));
        if (f != null) {
            this.f60225l.mo69117b(f);
        }
        this.f60224k.mo69127b(C12554e.C12555a.INFO, "Started transport {0}", nVar.f60268a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public List<C13005w> mo69571H() {
        return this.f60227n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public C12926n mo69572I() {
        return this.f60235v.mo69706c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo69573O() {
        this.f60225l.execute(new C12817d());
    }

    /* renamed from: R */
    public void mo69574R(List<C13005w> list) {
        Preconditions.m5393t(list, "newAddressGroups");
        m84593G(list, "newAddressGroups contains null entry");
        Preconditions.m5378e(!list.isEmpty(), "newAddressGroups is empty");
        this.f60225l.execute(new C12818e(list));
    }

    /* renamed from: a */
    public C12793s mo69443a() {
        C12688g1 g1Var = this.f60234u;
        if (g1Var != null) {
            return g1Var;
        }
        this.f60225l.execute(new C12816c());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo69575b(C12537b1 b1Var) {
        mo69576e(b1Var);
        this.f60225l.execute(new C12822i(b1Var));
    }

    /* renamed from: c */
    public C12560f0 mo69268c() {
        return this.f60214a;
    }

    /* renamed from: e */
    public void mo69576e(C12537b1 b1Var) {
        this.f60225l.execute(new C12819f(b1Var));
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22193c("logId", this.f60214a.mo69134d()).mo22194d("addressGroups", this.f60227n).toString();
    }
}

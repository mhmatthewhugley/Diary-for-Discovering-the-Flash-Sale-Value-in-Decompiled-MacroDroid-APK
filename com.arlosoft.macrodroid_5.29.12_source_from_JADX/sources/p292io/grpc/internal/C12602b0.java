package p292io.grpc.internal;

import androidx.core.app.NotificationCompat;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.C12520a;
import p292io.grpc.C12537b1;
import p292io.grpc.C12550d1;
import p292io.grpc.C12981s0;
import p292io.grpc.C13005w;
import p292io.grpc.C13009x0;
import p292io.grpc.C13011y0;
import p292io.grpc.internal.C12617c2;

/* renamed from: io.grpc.internal.b0 */
/* compiled from: DnsNameResolver */
final class C12602b0 extends C12981s0 {
    @VisibleForTesting

    /* renamed from: A */
    static boolean f59632A;

    /* renamed from: B */
    private static final C12610f f59633B;

    /* renamed from: C */
    private static String f59634C;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final Logger f59635t;

    /* renamed from: u */
    private static final Set<String> f59636u = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));

    /* renamed from: v */
    private static final String f59637v;

    /* renamed from: w */
    private static final String f59638w;

    /* renamed from: x */
    private static final String f59639x;
    @VisibleForTesting

    /* renamed from: y */
    static boolean f59640y;
    @VisibleForTesting

    /* renamed from: z */
    static boolean f59641z;
    @VisibleForTesting

    /* renamed from: a */
    final C13011y0 f59642a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Random f59643b = new Random();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile C12603a f59644c = C12604b.INSTANCE;

    /* renamed from: d */
    private final AtomicReference<C12609e> f59645d = new AtomicReference<>();

    /* renamed from: e */
    private final String f59646e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f59647f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f59648g;

    /* renamed from: h */
    private final C12617c2.C12621d<Executor> f59649h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final long f59650i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C12550d1 f59651j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Stopwatch f59652k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C12605c f59653l;

    /* renamed from: m */
    private boolean f59654m;

    /* renamed from: n */
    private Executor f59655n;

    /* renamed from: o */
    private final boolean f59656o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final boolean f59657p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C12981s0.C12994i f59658q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f59659r;

    /* renamed from: s */
    private C12981s0.C12990f f59660s;

    /* renamed from: io.grpc.internal.b0$a */
    /* compiled from: DnsNameResolver */
    interface C12603a {
        /* renamed from: b */
        List<InetAddress> mo69222b(String str) throws Exception;
    }

    /* renamed from: io.grpc.internal.b0$b */
    /* compiled from: DnsNameResolver */
    private enum C12604b implements C12603a {
        INSTANCE;

        /* renamed from: b */
        public List<InetAddress> mo69222b(String str) throws UnknownHostException {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    @VisibleForTesting
    /* renamed from: io.grpc.internal.b0$c */
    /* compiled from: DnsNameResolver */
    static final class C12605c {

        /* renamed from: a */
        final List<? extends InetAddress> f59663a;

        /* renamed from: b */
        final List<String> f59664b;

        /* renamed from: c */
        final List<C13005w> f59665c;

        C12605c(List<? extends InetAddress> list, List<String> list2, List<C13005w> list3) {
            this.f59663a = Collections.unmodifiableList((List) Preconditions.m5393t(list, "addresses"));
            this.f59664b = Collections.unmodifiableList((List) Preconditions.m5393t(list2, "txtRecords"));
            this.f59665c = Collections.unmodifiableList((List) Preconditions.m5393t(list3, "balancerAddresses"));
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("addresses", this.f59663a).mo22194d("txtRecords", this.f59664b).mo22194d("balancerAddresses", this.f59665c).toString();
        }
    }

    /* renamed from: io.grpc.internal.b0$d */
    /* compiled from: DnsNameResolver */
    private final class C12606d implements Runnable {

        /* renamed from: a */
        private final C12981s0.C12990f f59666a;

        /* renamed from: io.grpc.internal.b0$d$a */
        /* compiled from: DnsNameResolver */
        class C12607a implements Runnable {
            C12607a() {
            }

            public void run() {
                boolean unused = C12602b0.this.f59659r = false;
            }
        }

        /* renamed from: io.grpc.internal.b0$d$b */
        /* compiled from: DnsNameResolver */
        class C12608b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12605c f59669a;

            C12608b(C12605c cVar) {
                this.f59669a = cVar;
            }

            public void run() {
                C12605c unused = C12602b0.this.f59653l = this.f59669a;
                if (C12602b0.this.f59650i > 0) {
                    C12602b0.this.f59652k.mo22254h().mo22255i();
                }
            }
        }

        C12606d(C12981s0.C12990f fVar) {
            this.f59666a = (C12981s0.C12990f) Preconditions.m5393t(fVar, "savedListener");
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        /* renamed from: a */
        public void mo69224a() {
            try {
                C13009x0 a = C12602b0.this.f59642a.mo69481a(InetSocketAddress.createUnresolved(C12602b0.this.f59647f, C12602b0.this.f59648g));
                if (a != null) {
                    if (C12602b0.f59635t.isLoggable(Level.FINER)) {
                        Logger f = C12602b0.f59635t;
                        f.finer("Using proxy address " + a);
                    }
                    this.f59666a.mo69312c(C12981s0.C12992h.m85185d().mo69846b(Collections.singletonList(new C13005w((SocketAddress) a))).mo69847c(C12520a.f59384b).mo69845a());
                    return;
                }
                C12609e eVar = null;
                try {
                    if (C12602b0.m83874G(C12602b0.f59640y, C12602b0.f59641z, C12602b0.this.f59647f)) {
                        eVar = C12602b0.this.m83895z();
                    }
                    C12605c F = C12602b0.m83873F(C12602b0.this.f59644c, eVar, C12602b0.this.f59657p, C12602b0.f59632A, C12602b0.this.f59647f);
                    C12602b0.this.f59651j.execute(new C12608b(F));
                    if (C12602b0.f59635t.isLoggable(Level.FINER)) {
                        Logger f2 = C12602b0.f59635t;
                        f2.finer("Found DNS results " + F + " for " + C12602b0.this.f59647f);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InetAddress inetSocketAddress : F.f59663a) {
                        arrayList.add(new C13005w((SocketAddress) new InetSocketAddress(inetSocketAddress, C12602b0.this.f59648g)));
                    }
                    C12981s0.C12992h.C12993a b = C12981s0.C12992h.m85185d().mo69846b(arrayList);
                    C12520a.C12522b c = C12520a.m83640c();
                    if (!F.f59665c.isEmpty()) {
                        c.mo69033d(C12743n0.f60013b, F.f59665c);
                    }
                    if (!F.f59664b.isEmpty()) {
                        C12981s0.C12985c C = C12602b0.m83870C(F.f59664b, C12602b0.this.f59643b, C12602b0.m83892w());
                        if (C != null) {
                            if (C.mo69828d() != null) {
                                this.f59666a.mo69311a(C.mo69828d());
                                return;
                            }
                            Map map = (Map) C.mo69827c();
                            b.mo69848d(C12602b0.this.f59658q.mo69332a(map));
                            c.mo69033d(C12743n0.f60012a, map);
                        }
                    } else {
                        C12602b0.f59635t.log(Level.FINE, "No TXT records found for {0}", new Object[]{C12602b0.this.f59647f});
                    }
                    this.f59666a.mo69312c(b.mo69847c(c.mo69031a()).mo69845a());
                } catch (Exception e) {
                    C12981s0.C12990f fVar = this.f59666a;
                    C12537b1 b1Var = C12537b1.f59422u;
                    fVar.mo69311a(b1Var.mo69066q("Unable to resolve host " + C12602b0.this.f59647f).mo69065p(e));
                }
            } catch (IOException e2) {
                C12981s0.C12990f fVar2 = this.f59666a;
                C12537b1 b1Var2 = C12537b1.f59422u;
                fVar2.mo69311a(b1Var2.mo69066q("Unable to resolve host " + C12602b0.this.f59647f).mo69065p(e2));
            }
        }

        public void run() {
            if (C12602b0.f59635t.isLoggable(Level.FINER)) {
                Logger f = C12602b0.f59635t;
                f.finer("Attempting DNS resolution of " + C12602b0.this.f59647f);
            }
            try {
                mo69224a();
            } finally {
                C12602b0.this.f59651j.execute(new C12607a());
            }
        }
    }

    /* renamed from: io.grpc.internal.b0$e */
    /* compiled from: DnsNameResolver */
    interface C12609e {
        /* renamed from: a */
        List<String> mo69228a(String str) throws Exception;

        /* renamed from: b */
        List<C13005w> mo69229b(C12603a aVar, String str) throws Exception;
    }

    /* renamed from: io.grpc.internal.b0$f */
    /* compiled from: DnsNameResolver */
    interface C12610f {
        /* renamed from: a */
        C12609e mo69230a();

        /* renamed from: b */
        Throwable mo69231b();
    }

    static {
        Class<C12602b0> cls = C12602b0.class;
        f59635t = Logger.getLogger(cls.getName());
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f59637v = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f59638w = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f59639x = property3;
        f59640y = Boolean.parseBoolean(property);
        f59641z = Boolean.parseBoolean(property2);
        f59632A = Boolean.parseBoolean(property3);
        f59633B = m83868A(cls.getClassLoader());
    }

    C12602b0(String str, String str2, C12981s0.C12983b bVar, C12617c2.C12621d<Executor> dVar, Stopwatch stopwatch, boolean z, boolean z2) {
        Preconditions.m5393t(bVar, "args");
        this.f59649h = dVar;
        URI create = URI.create("//" + ((String) Preconditions.m5393t(str2, "name")));
        boolean z3 = true;
        Preconditions.m5385l(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f59646e = (String) Preconditions.m5394u(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f59647f = create.getHost();
        if (create.getPort() == -1) {
            this.f59648g = bVar.mo69813a();
        } else {
            this.f59648g = create.getPort();
        }
        this.f59642a = (C13011y0) Preconditions.m5393t(bVar.mo69815c(), "proxyDetector");
        this.f59650i = m83893x(z);
        this.f59652k = (Stopwatch) Preconditions.m5393t(stopwatch, NotificationCompat.CATEGORY_STOPWATCH);
        this.f59651j = (C12550d1) Preconditions.m5393t(bVar.mo69817e(), "syncContext");
        Executor b = bVar.mo69814b();
        this.f59655n = b;
        this.f59656o = b != null ? false : z3;
        this.f59657p = z2;
        this.f59658q = (C12981s0.C12994i) Preconditions.m5393t(bVar.mo69816d(), "serviceConfigParser");
    }

    @VisibleForTesting
    /* renamed from: A */
    static C12610f m83868A(ClassLoader classLoader) {
        try {
            try {
                try {
                    C12610f fVar = (C12610f) Class.forName("io.grpc.internal.w0", true, classLoader).asSubclass(C12610f.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (fVar.mo69231b() == null) {
                        return fVar;
                    }
                    f59635t.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", fVar.mo69231b());
                    return null;
                } catch (Exception e) {
                    f59635t.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", e);
                    return null;
                }
            } catch (Exception e2) {
                f59635t.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", e2);
                return null;
            }
        } catch (ClassNotFoundException e3) {
            f59635t.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", e3);
            return null;
        } catch (ClassCastException e4) {
            f59635t.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", e4);
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: B */
    static Map<String, ?> m83869B(Map<String, ?> map, Random random, String str) {
        boolean z;
        boolean z2;
        for (Map.Entry next : map.entrySet()) {
            Verify.m5498a(f59636u.contains(next.getKey()), "Bad key: %s", next);
        }
        List<String> u = m83890u(map);
        if (u != null && !u.isEmpty()) {
            Iterator<String> it = u.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("java".equalsIgnoreCase(it.next())) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                return null;
            }
        }
        Double y = m83894y(map);
        if (y != null) {
            int intValue = y.intValue();
            Verify.m5498a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", y);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> v = m83891v(map);
        if (v != null && !v.isEmpty()) {
            Iterator<String> it2 = v.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return null;
            }
        }
        Map<String, ?> j = C12879y0.m84799j(map, "serviceConfig");
        if (j != null) {
            return j;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", new Object[]{map, "serviceConfig"}));
    }

    /* renamed from: C */
    static C12981s0.C12985c m83870C(List<String> list, Random random, String str) {
        try {
            Map<String, ?> map = null;
            for (Map B : m83871D(list)) {
                try {
                    map = m83869B(B, random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e) {
                    return C12981s0.C12985c.m85164b(C12537b1.f59409h.mo69066q("failed to pick service config choice").mo69065p(e));
                }
            }
            if (map == null) {
                return null;
            }
            return C12981s0.C12985c.m85163a(map);
        } catch (IOException | RuntimeException e2) {
            return C12981s0.C12985c.m85164b(C12537b1.f59409h.mo69066q("failed to parse TXT records").mo69065p(e2));
        }
    }

    @VisibleForTesting
    /* renamed from: D */
    static List<Map<String, ?>> m83871D(List<String> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (!next.startsWith("grpc_config=")) {
                f59635t.log(Level.FINE, "Ignoring non service config {0}", new Object[]{next});
            } else {
                Object a = C12874x0.m84779a(next.substring(12));
                if (a instanceof List) {
                    arrayList.addAll(C12879y0.m84790a((List) a));
                } else {
                    throw new ClassCastException("wrong type " + a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    private void m83872E() {
        if (!this.f59659r && !this.f59654m && m83889t()) {
            this.f59659r = true;
            this.f59655n.execute(new C12606d(this.f59660s));
        }
    }

    @VisibleForTesting
    /* renamed from: F */
    static C12605c m83873F(C12603a aVar, C12609e eVar, boolean z, boolean z2, String str) {
        Exception exc;
        Exception e;
        List<InetAddress> emptyList = Collections.emptyList();
        List<C13005w> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        Exception exc2 = null;
        try {
            emptyList = aVar.mo69222b(str);
            e = null;
        } catch (Exception e2) {
            e = e2;
        }
        if (eVar != null) {
            if (z) {
                try {
                    emptyList2 = eVar.mo69229b(aVar, "_grpclb._tcp." + str);
                } catch (Exception e3) {
                    e = e3;
                }
            }
            e = null;
            if (z2) {
                boolean z3 = false;
                boolean z4 = !z || e != null;
                if (e != null && z4) {
                    z3 = true;
                }
                if (!z3) {
                    try {
                        emptyList3 = eVar.mo69228a("_grpc_config." + str);
                    } catch (Exception e4) {
                        exc2 = e4;
                    }
                }
            }
            Exception exc3 = exc2;
            exc2 = e;
            exc = exc3;
        } else {
            exc = null;
        }
        if (e != null) {
            if (exc2 == null) {
                try {
                    if (!emptyList2.isEmpty()) {
                    }
                } catch (Throwable th) {
                    Logger logger = f59635t;
                    Level level = Level.FINE;
                    logger.log(level, "Address resolution failure", e);
                    if (exc2 != null) {
                        logger.log(level, "Balancer resolution failure", exc2);
                    }
                    if (exc != null) {
                        logger.log(level, "ServiceConfig resolution failure", exc);
                    }
                    throw th;
                }
            }
            Throwables.m5493p(e);
            throw new RuntimeException(e);
        }
        if (e != null) {
            f59635t.log(Level.FINE, "Address resolution failure", e);
        }
        if (exc2 != null) {
            f59635t.log(Level.FINE, "Balancer resolution failure", exc2);
        }
        if (exc != null) {
            f59635t.log(Level.FINE, "ServiceConfig resolution failure", exc);
        }
        return new C12605c(emptyList, emptyList3, emptyList2);
    }

    @VisibleForTesting
    /* renamed from: G */
    static boolean m83874G(boolean z, boolean z2, String str) {
        if (!z) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z2;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z3 = true;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '.') {
                z3 &= charAt >= '0' && charAt <= '9';
            }
        }
        return true ^ z3;
    }

    /* renamed from: t */
    private boolean m83889t() {
        if (this.f59653l != null) {
            long j = this.f59650i;
            return j == 0 || (j > 0 && this.f59652k.mo22252e(TimeUnit.NANOSECONDS) > this.f59650i);
        }
    }

    /* renamed from: u */
    private static final List<String> m83890u(Map<String, ?> map) {
        return C12879y0.m84796g(map, "clientLanguage");
    }

    /* renamed from: v */
    private static final List<String> m83891v(Map<String, ?> map) {
        return C12879y0.m84796g(map, "clientHostname");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static String m83892w() {
        if (f59634C == null) {
            try {
                f59634C = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return f59634C;
    }

    /* renamed from: x */
    private static long m83893x(boolean z) {
        if (z) {
            return 0;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j = 30;
        if (property != null) {
            try {
                j = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f59635t.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
    }

    /* renamed from: y */
    private static final Double m83894y(Map<String, ?> map) {
        return C12879y0.m84797h(map, "percentage");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = f59633B;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p292io.grpc.internal.C12602b0.C12609e m83895z() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.grpc.internal.b0$e> r0 = r2.f59645d
            java.lang.Object r0 = r0.get()
            io.grpc.internal.b0$e r0 = (p292io.grpc.internal.C12602b0.C12609e) r0
            if (r0 != 0) goto L_0x0012
            io.grpc.internal.b0$f r1 = f59633B
            if (r1 == 0) goto L_0x0012
            io.grpc.internal.b0$e r0 = r1.mo69230a()
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12602b0.m83895z():io.grpc.internal.b0$e");
    }

    /* renamed from: a */
    public String mo69218a() {
        return this.f59646e;
    }

    /* renamed from: b */
    public void mo69219b() {
        Preconditions.m5399z(this.f59660s != null, "not started");
        m83872E();
    }

    /* renamed from: c */
    public void mo69220c() {
        if (!this.f59654m) {
            this.f59654m = true;
            Executor executor = this.f59655n;
            if (executor != null && this.f59656o) {
                this.f59655n = (Executor) C12617c2.m83942f(this.f59649h, executor);
            }
        }
    }

    /* renamed from: d */
    public void mo69221d(C12981s0.C12990f fVar) {
        Preconditions.m5399z(this.f59660s == null, "already started");
        if (this.f59656o) {
            this.f59655n = (Executor) C12617c2.m83941d(this.f59649h);
        }
        this.f59660s = (C12981s0.C12990f) Preconditions.m5393t(fVar, "listener");
        m83872E();
    }
}

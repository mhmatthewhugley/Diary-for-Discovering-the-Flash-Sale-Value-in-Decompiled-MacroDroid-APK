package p360p9;

import androidx.core.location.LocationRequestCompat;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p292io.grpc.C12554e;
import p292io.grpc.internal.C12601b;
import p292io.grpc.internal.C12617c2;
import p292io.grpc.internal.C12684g;
import p292io.grpc.internal.C12725k2;
import p292io.grpc.internal.C12749o0;
import p292io.grpc.internal.C12799t;
import p292io.grpc.internal.C12812v;
import p292io.grpc.internal.C12888z0;
import p292io.grpc.okhttp.internal.C12931a;
import p292io.grpc.okhttp.internal.C12932b;
import p292io.grpc.okhttp.internal.C12938f;
import p292io.grpc.okhttp.internal.C12948h;

/* renamed from: p9.e */
/* compiled from: OkHttpChannelBuilder */
public class C16114e extends C12601b<C16114e> {
    @VisibleForTesting

    /* renamed from: Z */
    static final C12932b f66102Z = new C12932b.C12934b(C12932b.f60584f).mo69719f(C12931a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, C12931a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C12931a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, C12931a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C12931a.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, C12931a.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, C12931a.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, C12931a.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384).mo69722i(C12948h.TLS_1_2).mo69721h(true).mo69718e();

    /* renamed from: a0 */
    private static final long f66103a0 = TimeUnit.DAYS.toNanos(1000);
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public static final C12617c2.C12621d<Executor> f66104b0 = new C16115a();

    /* renamed from: c0 */
    public static final /* synthetic */ int f66105c0 = 0;

    /* renamed from: M */
    private Executor f66106M;

    /* renamed from: N */
    private ScheduledExecutorService f66107N;

    /* renamed from: O */
    private SocketFactory f66108O;

    /* renamed from: P */
    private SSLSocketFactory f66109P;

    /* renamed from: Q */
    private HostnameVerifier f66110Q;

    /* renamed from: R */
    private C12932b f66111R = f66102Z;

    /* renamed from: S */
    private C16117c f66112S = C16117c.TLS;

    /* renamed from: T */
    private long f66113T = LocationRequestCompat.PASSIVE_INTERVAL;

    /* renamed from: U */
    private long f66114U = C12749o0.f60039l;

    /* renamed from: V */
    private int f66115V = 65535;

    /* renamed from: W */
    private boolean f66116W;

    /* renamed from: X */
    private int f66117X = Integer.MAX_VALUE;

    /* renamed from: Y */
    private final boolean f66118Y = false;

    /* renamed from: p9.e$a */
    /* compiled from: OkHttpChannelBuilder */
    class C16115a implements C12617c2.C12621d<Executor> {
        C16115a() {
        }

        /* renamed from: a */
        public void mo69247b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        /* renamed from: c */
        public Executor create() {
            return Executors.newCachedThreadPool(C12749o0.m84364f("grpc-okhttp-%d", true));
        }
    }

    /* renamed from: p9.e$b */
    /* compiled from: OkHttpChannelBuilder */
    static /* synthetic */ class C16116b {

        /* renamed from: a */
        static final /* synthetic */ int[] f66119a;

        /* renamed from: b */
        static final /* synthetic */ int[] f66120b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                p9.e$c[] r0 = p360p9.C16114e.C16117c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66120b = r0
                r1 = 1
                p9.e$c r2 = p360p9.C16114e.C16117c.PLAINTEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f66120b     // Catch:{ NoSuchFieldError -> 0x001d }
                p9.e$c r3 = p360p9.C16114e.C16117c.TLS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                p9.d[] r2 = p360p9.C16113d.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f66119a = r2
                p9.d r3 = p360p9.C16113d.f66099a     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f66119a     // Catch:{ NoSuchFieldError -> 0x0038 }
                p9.d r2 = p360p9.C16113d.PLAINTEXT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p360p9.C16114e.C16116b.<clinit>():void");
        }
    }

    /* renamed from: p9.e$c */
    /* compiled from: OkHttpChannelBuilder */
    private enum C16117c {
        TLS,
        PLAINTEXT
    }

    /* renamed from: p9.e$d */
    /* compiled from: OkHttpChannelBuilder */
    static final class C16118d implements C12799t {

        /* renamed from: A */
        private final boolean f66124A;

        /* renamed from: B */
        private final C12684g f66125B;

        /* renamed from: C */
        private final long f66126C;

        /* renamed from: D */
        private final int f66127D;

        /* renamed from: E */
        private final boolean f66128E;

        /* renamed from: F */
        private final int f66129F;

        /* renamed from: G */
        private final ScheduledExecutorService f66130G;

        /* renamed from: H */
        private final boolean f66131H;

        /* renamed from: I */
        private boolean f66132I;

        /* renamed from: a */
        private final Executor f66133a;

        /* renamed from: c */
        private final boolean f66134c;

        /* renamed from: d */
        private final boolean f66135d;

        /* renamed from: f */
        private final C12725k2.C12727b f66136f;

        /* renamed from: g */
        private final SocketFactory f66137g;

        /* renamed from: o */
        private final SSLSocketFactory f66138o;

        /* renamed from: p */
        private final HostnameVerifier f66139p;

        /* renamed from: s */
        private final C12932b f66140s;

        /* renamed from: z */
        private final int f66141z;

        /* renamed from: p9.e$d$a */
        /* compiled from: OkHttpChannelBuilder */
        class C16119a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12684g.C12686b f66142a;

            C16119a(C12684g.C12686b bVar) {
                this.f66142a = bVar;
            }

            public void run() {
                this.f66142a.mo69401a();
            }
        }

        /* synthetic */ C16118d(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C12932b bVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, C12725k2.C12727b bVar2, boolean z3, C16115a aVar) {
            this(executor, scheduledExecutorService, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i, z, j, j2, i2, z2, i3, bVar2, z3);
        }

        /* renamed from: O0 */
        public ScheduledExecutorService mo69457O0() {
            return this.f66130G;
        }

        /* renamed from: O1 */
        public C12812v mo69458O1(SocketAddress socketAddress, C12799t.C12800a aVar, C12554e eVar) {
            if (!this.f66132I) {
                C12684g.C12686b d = this.f66125B.mo69400d();
                C16119a aVar2 = r2;
                C16119a aVar3 = new C16119a(d);
                C12684g.C12686b bVar = d;
                C16124h hVar = new C16124h((InetSocketAddress) socketAddress, aVar.mo69546a(), aVar.mo69549d(), aVar.mo69547b(), this.f66133a, this.f66137g, this.f66138o, this.f66139p, this.f66140s, this.f66141z, this.f66127D, aVar.mo69548c(), aVar2, this.f66129F, this.f66136f.mo69456a(), this.f66131H);
                if (this.f66124A) {
                    hVar.mo78479S(true, bVar.mo69402b(), this.f66126C, this.f66128E);
                }
                return hVar;
            }
            throw new IllegalStateException("The transport factory is closed.");
        }

        public void close() {
            if (!this.f66132I) {
                this.f66132I = true;
                if (this.f66135d) {
                    C12617c2.m83942f(C12749o0.f60046s, this.f66130G);
                }
                if (this.f66134c) {
                    C12617c2.m83942f(C16114e.f66104b0, this.f66133a);
                }
            }
        }

        private C16118d(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C12932b bVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, C12725k2.C12727b bVar2, boolean z3) {
            Executor executor2 = executor;
            boolean z4 = true;
            boolean z5 = scheduledExecutorService == null;
            this.f66135d = z5;
            this.f66130G = z5 ? (ScheduledExecutorService) C12617c2.m83941d(C12749o0.f60046s) : scheduledExecutorService;
            this.f66137g = socketFactory;
            this.f66138o = sSLSocketFactory;
            this.f66139p = hostnameVerifier;
            this.f66140s = bVar;
            this.f66141z = i;
            this.f66124A = z;
            this.f66125B = new C12684g("keepalive time nanos", j);
            this.f66126C = j2;
            this.f66127D = i2;
            this.f66128E = z2;
            this.f66129F = i3;
            this.f66131H = z3;
            z4 = executor2 != null ? false : z4;
            this.f66134c = z4;
            this.f66136f = (C12725k2.C12727b) Preconditions.m5393t(bVar2, "transportTracerFactory");
            if (z4) {
                this.f66133a = (Executor) C12617c2.m83941d(C16114e.f66104b0);
            } else {
                this.f66133a = executor2;
            }
        }
    }

    private C16114e(String str) {
        super(str);
    }

    public static C16114e forTarget(String str) {
        return new C16114e(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C12799t mo69213e() {
        C16118d dVar = r2;
        C16118d dVar2 = new C16118d(this.f66106M, this.f66107N, this.f66108O, mo78458k(), this.f66110Q, this.f66111R, mo69217i(), this.f66113T != LocationRequestCompat.PASSIVE_INTERVAL, this.f66113T, this.f66114U, this.f66115V, this.f66116W, this.f66117X, this.f59630y, false, (C16115a) null);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo69214f() {
        int i = C16116b.f66120b[this.f66112S.ordinal()];
        if (i == 1) {
            return 80;
        }
        if (i == 2) {
            return 443;
        }
        throw new AssertionError(this.f66112S + " not handled");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: k */
    public SSLSocketFactory mo78458k() {
        int i = C16116b.f66120b[this.f66112S.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            try {
                if (this.f66109P == null) {
                    this.f66109P = SSLContext.getInstance("Default", C12938f.m84997e().mo69734g()).getSocketFactory();
                }
                return this.f66109P;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("TLS Provider failure", e);
            }
        } else {
            throw new RuntimeException("Unknown negotiation type: " + this.f66112S);
        }
    }

    /* renamed from: l */
    public C16114e mo69745c(long j, TimeUnit timeUnit) {
        Preconditions.m5378e(j > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.f66113T = nanos;
        long l = C12888z0.m84840l(nanos);
        this.f66113T = l;
        if (l >= f66103a0) {
            this.f66113T = LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return this;
    }

    /* renamed from: m */
    public final C16114e mo69746d() {
        this.f66112S = C16117c.PLAINTEXT;
        return this;
    }

    public final C16114e scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f66107N = (ScheduledExecutorService) Preconditions.m5393t(scheduledExecutorService, "scheduledExecutorService");
        return this;
    }

    public final C16114e sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f66109P = sSLSocketFactory;
        this.f66112S = C16117c.TLS;
        return this;
    }

    public final C16114e transportExecutor(Executor executor) {
        this.f66106M = executor;
        return this;
    }
}

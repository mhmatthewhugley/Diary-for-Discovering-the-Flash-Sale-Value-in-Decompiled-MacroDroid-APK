package p360p9;

import androidx.webkit.ProxyConfig;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.SettableFuture;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.UIDFolder;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.commons.p353io.FileUtils;
import org.apache.commons.p353io.IOUtils;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import p226cd.C11179b;
import p226cd.C11184c;
import p226cd.C11186d;
import p226cd.C11188e;
import p226cd.C11196l;
import p226cd.C11212y;
import p226cd.C11213z;
import p292io.grpc.C12520a;
import p292io.grpc.C12524a0;
import p292io.grpc.C12533b0;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12560f0;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.C13012z;
import p292io.grpc.C13013z0;
import p292io.grpc.StatusException;
import p292io.grpc.internal.C12617c2;
import p292io.grpc.internal.C12669e2;
import p292io.grpc.internal.C12688g1;
import p292io.grpc.internal.C12725k2;
import p292io.grpc.internal.C12743n0;
import p292io.grpc.internal.C12749o0;
import p292io.grpc.internal.C12785r;
import p292io.grpc.internal.C12795s0;
import p292io.grpc.internal.C12801t0;
import p292io.grpc.internal.C12812v;
import p292io.grpc.internal.C12888z0;
import p292io.grpc.internal.C12895z1;
import p292io.grpc.okhttp.internal.C12932b;
import p345o7.C15807a;
import p345o7.C15811c;
import p345o7.C15815e;
import p358p7.C16103a;
import p360p9.C16110b;
import p360p9.C16121g;
import p360p9.C16132i;
import p369q9.C16236a;
import p369q9.C16237b;
import p369q9.C16239c;
import p369q9.C16240d;
import p369q9.C16241e;
import p369q9.C16245g;
import p369q9.C16252i;
import p369q9.C16253j;
import p405u9.C16674c;

/* renamed from: p9.h */
/* compiled from: OkHttpClientTransport */
class C16124h implements C12812v, C16110b.C16111a {

    /* renamed from: X */
    private static final Map<C16236a, C12537b1> f66172X = m96837P();
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static final Logger f66173Y = Logger.getLogger(C16124h.class.getName());

    /* renamed from: Z */
    private static final C16121g[] f66174Z = new C16121g[0];
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final SocketFactory f66175A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public SSLSocketFactory f66176B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public HostnameVerifier f66177C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Socket f66178D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f66179E = 0;

    /* renamed from: F */
    private final LinkedList<C16121g> f66180F = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C12932b f66181G;

    /* renamed from: H */
    private C16239c f66182H;

    /* renamed from: I */
    private ScheduledExecutorService f66183I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C12888z0 f66184J;

    /* renamed from: K */
    private boolean f66185K;

    /* renamed from: L */
    private long f66186L;

    /* renamed from: M */
    private long f66187M;

    /* renamed from: N */
    private boolean f66188N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final Runnable f66189O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final int f66190P;

    /* renamed from: Q */
    private final boolean f66191Q;

    /* renamed from: R */
    private final C12725k2 f66192R;

    /* renamed from: S */
    private final C12801t0<C16121g> f66193S = new C16125a();
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C12533b0.C12535b f66194T;
    @VisibleForTesting

    /* renamed from: U */
    final C12524a0 f66195U;

    /* renamed from: V */
    Runnable f66196V;

    /* renamed from: W */
    SettableFuture<Void> f66197W;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final InetSocketAddress f66198a;

    /* renamed from: b */
    private final String f66199b;

    /* renamed from: c */
    private final String f66200c;

    /* renamed from: d */
    private final Random f66201d = new Random();

    /* renamed from: e */
    private final Supplier<Stopwatch> f66202e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f66203f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C12688g1.C12689a f66204g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C16237b f66205h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C16132i f66206i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C16110b f66207j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C16142p f66208k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f66209l = new Object();

    /* renamed from: m */
    private final C12560f0 f66210m;

    /* renamed from: n */
    private int f66211n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Map<Integer, C16121g> f66212o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Executor f66213p;

    /* renamed from: q */
    private final C12895z1 f66214q;

    /* renamed from: r */
    private final int f66215r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f66216s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C16131f f66217t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C12520a f66218u;

    /* renamed from: v */
    private C12537b1 f66219v;

    /* renamed from: w */
    private boolean f66220w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C12795s0 f66221x;

    /* renamed from: y */
    private boolean f66222y;

    /* renamed from: z */
    private boolean f66223z;

    /* renamed from: p9.h$a */
    /* compiled from: OkHttpClientTransport */
    class C16125a extends C12801t0<C16121g> {
        C16125a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo69302a() {
            C16124h.this.f66204g.mo69298c(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo69303b() {
            C16124h.this.f66204g.mo69298c(false);
        }
    }

    /* renamed from: p9.h$b */
    /* compiled from: OkHttpClientTransport */
    class C16126b implements C12725k2.C12728c {
        C16126b() {
        }
    }

    /* renamed from: p9.h$c */
    /* compiled from: OkHttpClientTransport */
    class C16127c implements Runnable {
        C16127c() {
        }

        public void run() {
            Runnable runnable = C16124h.this.f66196V;
            if (runnable != null) {
                runnable.run();
            }
            C16124h hVar = C16124h.this;
            C16131f unused = hVar.f66217t = new C16131f(hVar.f66205h, C16124h.this.f66206i);
            C16124h.this.f66213p.execute(C16124h.this.f66217t);
            synchronized (C16124h.this.f66209l) {
                int unused2 = C16124h.this.f66179E = Integer.MAX_VALUE;
                boolean unused3 = C16124h.this.m96854m0();
            }
            C16124h.this.f66197W.mo61562C(null);
        }
    }

    /* renamed from: p9.h$d */
    /* compiled from: OkHttpClientTransport */
    class C16128d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f66227a;

        /* renamed from: c */
        final /* synthetic */ C16105a f66228c;

        /* renamed from: d */
        final /* synthetic */ C16253j f66229d;

        /* renamed from: p9.h$d$a */
        /* compiled from: OkHttpClientTransport */
        class C16129a implements C11212y {
            C16129a() {
            }

            public void close() {
            }

            /* renamed from: m0 */
            public long mo62392m0(C11179b bVar, long j) {
                return -1;
            }

            /* renamed from: q */
            public C11213z mo62393q() {
                return C11213z.f54158e;
            }
        }

        C16128d(CountDownLatch countDownLatch, C16105a aVar, C16253j jVar) {
            this.f66227a = countDownLatch;
            this.f66228c = aVar;
            this.f66229d = jVar;
        }

        public void run() {
            C16124h hVar;
            C16131f fVar;
            Socket k;
            try {
                this.f66227a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            C11186d b = C11196l.m75163b(new C16129a());
            SSLSession sSLSession = null;
            try {
                C16124h hVar2 = C16124h.this;
                C12524a0 a0Var = hVar2.f66195U;
                if (a0Var == null) {
                    k = hVar2.f66175A.createSocket(C16124h.this.f66198a.getAddress(), C16124h.this.f66198a.getPort());
                } else if (a0Var.mo69035a() instanceof InetSocketAddress) {
                    C16124h hVar3 = C16124h.this;
                    k = hVar3.m96839R(hVar3.f66195U.mo69036b(), (InetSocketAddress) C16124h.this.f66195U.mo69035a(), C16124h.this.f66195U.mo69037c(), C16124h.this.f66195U.getPassword());
                } else {
                    C12537b1 b1Var = C12537b1.f59421t;
                    throw b1Var.mo69066q("Unsupported SocketAddress implementation " + C16124h.this.f66195U.mo69035a().getClass()).mo69056c();
                }
                Socket socket = k;
                SSLSocket sSLSocket = socket;
                if (C16124h.this.f66176B != null) {
                    SSLSocket b2 = C16139m.m96936b(C16124h.this.f66176B, C16124h.this.f66177C, socket, C16124h.this.mo78483W(), C16124h.this.mo78484X(), C16124h.this.f66181G);
                    sSLSession = b2.getSession();
                    sSLSocket = b2;
                }
                sSLSocket.setTcpNoDelay(true);
                C11186d b3 = C11196l.m75163b(C11196l.m75169h(sSLSocket));
                this.f66228c.mo78441j(C11196l.m75166e(sSLSocket), sSLSocket);
                C16124h hVar4 = C16124h.this;
                C12520a unused2 = hVar4.f66218u = hVar4.f66218u.mo69027d().mo69033d(C13012z.f60762a, sSLSocket.getRemoteSocketAddress()).mo69033d(C13012z.f60763b, sSLSocket.getLocalSocketAddress()).mo69033d(C13012z.f60764c, sSLSession).mo69033d(C12743n0.f60016e, sSLSession == null ? C13013z0.f60765a : C13013z0.PRIVACY_AND_INTEGRITY).mo69031a();
                C16124h hVar5 = C16124h.this;
                C16131f unused3 = hVar5.f66217t = new C16131f(hVar5, this.f66229d.mo78756a(b3, true));
                synchronized (C16124h.this.f66209l) {
                    Socket unused4 = C16124h.this.f66178D = (Socket) Preconditions.m5393t(sSLSocket, "socket");
                    if (sSLSession != null) {
                        C12533b0.C12535b unused5 = C16124h.this.f66194T = new C12533b0.C12535b(new C12533b0.C12536c(sSLSession));
                    }
                }
                return;
            } catch (StatusException e) {
                C16124h.this.m96852l0(0, C16236a.INTERNAL_ERROR, e.mo69022a());
                hVar = C16124h.this;
                fVar = new C16131f(hVar, this.f66229d.mo78756a(b, true));
            } catch (Exception e2) {
                C16124h.this.mo78457a(e2);
                hVar = C16124h.this;
                fVar = new C16131f(hVar, this.f66229d.mo78756a(b, true));
            } catch (Throwable th) {
                C16124h hVar6 = C16124h.this;
                C16131f unused6 = hVar6.f66217t = new C16131f(hVar6, this.f66229d.mo78756a(b, true));
                throw th;
            }
            C16131f unused7 = hVar.f66217t = fVar;
        }
    }

    /* renamed from: p9.h$e */
    /* compiled from: OkHttpClientTransport */
    class C16130e implements Runnable {
        C16130e() {
        }

        public void run() {
            C16124h.this.f66213p.execute(C16124h.this.f66217t);
            synchronized (C16124h.this.f66209l) {
                int unused = C16124h.this.f66179E = Integer.MAX_VALUE;
                boolean unused2 = C16124h.this.m96854m0();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: p9.h$f */
    /* compiled from: OkHttpClientTransport */
    class C16131f implements C16237b.C16238a, Runnable {

        /* renamed from: a */
        private final C16132i f66233a;

        /* renamed from: c */
        C16237b f66234c;

        /* renamed from: d */
        boolean f66235d;

        C16131f(C16124h hVar, C16237b bVar) {
            this(bVar, new C16132i(Level.FINE, (Class<?>) C16124h.class));
        }

        /* renamed from: a */
        private int m96895a(List<C16240d> list) {
            long j = 0;
            for (int i = 0; i < list.size(); i++) {
                C16240d dVar = list.get(i);
                j += (long) (dVar.f66561a.mo62485C() + 32 + dVar.f66562b.mo62485C());
            }
            return (int) Math.min(j, 2147483647L);
        }

        /* renamed from: A */
        public void mo78496A(boolean z, C16252i iVar) {
            boolean z2;
            this.f66233a.mo78514i(C16132i.C16133a.INBOUND, iVar);
            synchronized (C16124h.this.f66209l) {
                if (C16138l.m96933b(iVar, 4)) {
                    int unused = C16124h.this.f66179E = C16138l.m96932a(iVar, 4);
                }
                if (C16138l.m96933b(iVar, 7)) {
                    z2 = C16124h.this.f66208k.mo78524e(C16138l.m96932a(iVar, 7));
                } else {
                    z2 = false;
                }
                if (this.f66235d) {
                    C16124h.this.f66204g.mo69297b();
                    this.f66235d = false;
                }
                C16124h.this.f66207j.mo78445P0(iVar);
                if (z2) {
                    C16124h.this.f66208k.mo78526h();
                }
                boolean unused2 = C16124h.this.m96854m0();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
            if (r0 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
            r9 = r7.f66236f;
            r10 = p369q9.C16236a.PROTOCOL_ERROR;
            p360p9.C16124h.m96868x(r9, r10, "Received window_update for unknown stream: " + r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo78497d(int r8, long r9) {
            /*
                r7 = this;
                p9.i r0 = r7.f66233a
                p9.i$a r1 = p360p9.C16132i.C16133a.INBOUND
                r0.mo78516k(r1, r8, r9)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x002c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L_0x0019
                p9.h r8 = p360p9.C16124h.this
                q9.a r10 = p369q9.C16236a.PROTOCOL_ERROR
                r8.m96844g0(r10, r9)
                goto L_0x002b
            L_0x0019:
                p9.h r0 = p360p9.C16124h.this
                io.grpc.b1 r10 = p292io.grpc.C12537b1.f59421t
                io.grpc.b1 r2 = r10.mo69066q(r9)
                io.grpc.internal.r$a r3 = p292io.grpc.internal.C12785r.C12786a.PROCESSED
                r4 = 0
                q9.a r5 = p369q9.C16236a.PROTOCOL_ERROR
                r6 = 0
                r1 = r8
                r0.mo78480T(r1, r2, r3, r4, r5, r6)
            L_0x002b:
                return
            L_0x002c:
                r0 = 0
                p9.h r1 = p360p9.C16124h.this
                java.lang.Object r1 = r1.f66209l
                monitor-enter(r1)
                if (r8 != 0) goto L_0x0043
                p9.h r8 = p360p9.C16124h.this     // Catch:{ all -> 0x0085 }
                p9.p r8 = r8.f66208k     // Catch:{ all -> 0x0085 }
                r0 = 0
                int r10 = (int) r9     // Catch:{ all -> 0x0085 }
                r8.mo78525g(r0, r10)     // Catch:{ all -> 0x0085 }
                monitor-exit(r1)     // Catch:{ all -> 0x0085 }
                return
            L_0x0043:
                p9.h r2 = p360p9.C16124h.this     // Catch:{ all -> 0x0085 }
                java.util.Map r2 = r2.f66212o     // Catch:{ all -> 0x0085 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0085 }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0085 }
                p9.g r2 = (p360p9.C16121g) r2     // Catch:{ all -> 0x0085 }
                if (r2 == 0) goto L_0x0060
                p9.h r3 = p360p9.C16124h.this     // Catch:{ all -> 0x0085 }
                p9.p r3 = r3.f66208k     // Catch:{ all -> 0x0085 }
                int r10 = (int) r9     // Catch:{ all -> 0x0085 }
                r3.mo78525g(r2, r10)     // Catch:{ all -> 0x0085 }
                goto L_0x0069
            L_0x0060:
                p9.h r9 = p360p9.C16124h.this     // Catch:{ all -> 0x0085 }
                boolean r9 = r9.mo78487d0(r8)     // Catch:{ all -> 0x0085 }
                if (r9 != 0) goto L_0x0069
                r0 = 1
            L_0x0069:
                monitor-exit(r1)     // Catch:{ all -> 0x0085 }
                if (r0 == 0) goto L_0x0084
                p9.h r9 = p360p9.C16124h.this
                q9.a r10 = p369q9.C16236a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r9.m96844g0(r10, r8)
            L_0x0084:
                return
            L_0x0085:
                r8 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0085 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p360p9.C16124h.C16131f.mo78497d(int, long):void");
        }

        /* renamed from: k */
        public void mo78498k(boolean z, int i, int i2) {
            C12795s0 s0Var;
            long j = (((long) i) << 32) | (((long) i2) & UIDFolder.MAXUID);
            this.f66233a.mo78510e(C16132i.C16133a.INBOUND, j);
            if (!z) {
                synchronized (C16124h.this.f66209l) {
                    C16124h.this.f66207j.mo78453k(true, i, i2);
                }
                return;
            }
            synchronized (C16124h.this.f66209l) {
                s0Var = null;
                if (C16124h.this.f66221x == null) {
                    C16124h.f66173Y.warning("Received unexpected ping ack. No ping outstanding");
                } else if (C16124h.this.f66221x.mo69543h() == j) {
                    C12795s0 E = C16124h.this.f66221x;
                    C12795s0 unused = C16124h.this.f66221x = null;
                    s0Var = E;
                } else {
                    C16124h.f66173Y.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", new Object[]{Long.valueOf(C16124h.this.f66221x.mo69543h()), Long.valueOf(j)}));
                }
            }
            if (s0Var != null) {
                s0Var.mo69541d();
            }
        }

        public void run() {
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f66234c.mo78744C1(this)) {
                try {
                    if (C16124h.this.f66184J != null) {
                        C16124h.this.f66184J.mo69646m();
                    }
                } catch (Throwable th) {
                    try {
                        this.f66234c.close();
                    } catch (IOException e) {
                        C16124h.f66173Y.log(Level.INFO, "Exception closing frame reader", e);
                    }
                    C16124h.this.f66204g.mo69299d();
                    Thread.currentThread().setName(name);
                    throw th;
                }
            }
            C16124h.this.m96852l0(0, C16236a.INTERNAL_ERROR, C12537b1.f59422u.mo69066q("End of stream or IOException"));
            try {
                this.f66234c.close();
            } catch (IOException e2) {
                e = e2;
            }
            C16124h.this.f66204g.mo69299d();
            Thread.currentThread().setName(name);
            C16124h.f66173Y.log(Level.INFO, "Exception closing frame reader", e);
            C16124h.this.f66204g.mo69299d();
            Thread.currentThread().setName(name);
        }

        /* renamed from: t */
        public void mo78500t(int i, C16236a aVar) {
            this.f66233a.mo78513h(C16132i.C16133a.INBOUND, i, aVar);
            C12537b1 e = C16124h.m96861q0(aVar).mo69058e("Rst Stream");
            boolean z = e.mo69062m() == C12537b1.C12539b.CANCELLED || e.mo69062m() == C12537b1.C12539b.DEADLINE_EXCEEDED;
            synchronized (C16124h.this.f66209l) {
                C16121g gVar = (C16121g) C16124h.this.f66212o.get(Integer.valueOf(i));
                if (gVar != null) {
                    C16674c.m99121c("OkHttpClientTransport$ClientFrameHandler.rstStream", gVar.mo69154w().mo78476b0());
                    C16124h.this.mo78480T(i, e, aVar == C16236a.REFUSED_STREAM ? C12785r.C12786a.REFUSED : C12785r.C12786a.PROCESSED, z, (C16236a) null, (C12960q0) null);
                }
            }
        }

        /* renamed from: u */
        public void mo78501u(int i, int i2, List<C16240d> list) throws IOException {
            this.f66233a.mo78512g(C16132i.C16133a.INBOUND, i, i2, list);
            synchronized (C16124h.this.f66209l) {
                C16124h.this.f66207j.mo78456t(i, C16236a.PROTOCOL_ERROR);
            }
        }

        /* renamed from: v */
        public void mo78502v() {
        }

        /* renamed from: w */
        public void mo78503w(boolean z, int i, C11186d dVar, int i2) throws IOException {
            this.f66233a.mo78507b(C16132i.C16133a.INBOUND, i, dVar.mo62416T(), i2, z);
            C16121g Z = C16124h.this.mo78485Z(i);
            if (Z != null) {
                long j = (long) i2;
                dVar.mo62420W0(j);
                C11179b bVar = new C11179b();
                bVar.mo62384X(dVar.mo62416T(), j);
                C16674c.m99121c("OkHttpClientTransport$ClientFrameHandler.data", Z.mo69154w().mo78476b0());
                synchronized (C16124h.this.f66209l) {
                    Z.mo69154w().mo78477c0(bVar, z);
                }
            } else if (C16124h.this.mo78487d0(i)) {
                synchronized (C16124h.this.f66209l) {
                    C16124h.this.f66207j.mo78456t(i, C16236a.INVALID_STREAM);
                }
                dVar.skip((long) i2);
            } else {
                C16124h hVar = C16124h.this;
                C16236a aVar = C16236a.PROTOCOL_ERROR;
                hVar.m96844g0(aVar, "Received data for unknown stream: " + i);
                return;
            }
            C16124h.m96822A(C16124h.this, i2);
            if (((float) C16124h.this.f66216s) >= ((float) C16124h.this.f66203f) * 0.5f) {
                synchronized (C16124h.this.f66209l) {
                    C16124h.this.f66207j.mo78449d(0, (long) C16124h.this.f66216s);
                }
                int unused = C16124h.this.f66216s = 0;
            }
        }

        /* renamed from: x */
        public void mo78504x(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: y */
        public void mo78505y(int i, C16236a aVar, C11188e eVar) {
            this.f66233a.mo78508c(C16132i.C16133a.INBOUND, i, aVar, eVar);
            if (aVar == C16236a.ENHANCE_YOUR_CALM) {
                String H = eVar.mo62489H();
                C16124h.f66173Y.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", new Object[]{this, H}));
                if ("too_many_pings".equals(H)) {
                    C16124h.this.f66189O.run();
                }
            }
            C12537b1 e = C12749o0.C12756g.m84386g((long) aVar.httpCode).mo69058e("Received Goaway");
            if (eVar.mo62485C() > 0) {
                e = e.mo69058e(eVar.mo62489H());
            }
            C16124h.this.m96852l0(i, (C16236a) null, e);
        }

        /* renamed from: z */
        public void mo78506z(boolean z, boolean z2, int i, int i2, List<C16240d> list, C16241e eVar) {
            C12537b1 b1Var;
            int a;
            this.f66233a.mo78509d(C16132i.C16133a.INBOUND, i, list, z2);
            boolean z3 = true;
            if (C16124h.this.f66190P == Integer.MAX_VALUE || (a = m96895a(list)) <= C16124h.this.f66190P) {
                b1Var = null;
            } else {
                C12537b1 b1Var2 = C12537b1.f59416o;
                Object[] objArr = new Object[3];
                objArr[0] = z2 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(C16124h.this.f66190P);
                objArr[2] = Integer.valueOf(a);
                b1Var = b1Var2.mo69066q(String.format("Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (C16124h.this.f66209l) {
                C16121g gVar = (C16121g) C16124h.this.f66212o.get(Integer.valueOf(i));
                if (gVar == null) {
                    if (C16124h.this.mo78487d0(i)) {
                        C16124h.this.f66207j.mo78456t(i, C16236a.INVALID_STREAM);
                    }
                } else if (b1Var == null) {
                    C16674c.m99121c("OkHttpClientTransport$ClientFrameHandler.headers", gVar.mo69154w().mo78476b0());
                    gVar.mo69154w().mo78478d0(list, z2);
                } else {
                    if (!z2) {
                        C16124h.this.f66207j.mo78456t(i, C16236a.CANCEL);
                    }
                    gVar.mo69154w().mo69171J(b1Var, false, new C12960q0());
                }
                z3 = false;
            }
            if (z3) {
                C16124h hVar = C16124h.this;
                C16236a aVar = C16236a.PROTOCOL_ERROR;
                hVar.m96844g0(aVar, "Received header for unknown stream: " + i);
            }
        }

        @VisibleForTesting
        C16131f(C16237b bVar, C16132i iVar) {
            this.f66235d = true;
            this.f66234c = bVar;
            this.f66233a = iVar;
        }
    }

    C16124h(InetSocketAddress inetSocketAddress, String str, String str2, C12520a aVar, Executor executor, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C12932b bVar, int i, int i2, C12524a0 a0Var, Runnable runnable, int i3, C12725k2 k2Var, boolean z) {
        Executor executor2 = executor;
        InetSocketAddress inetSocketAddress2 = inetSocketAddress;
        this.f66198a = (InetSocketAddress) Preconditions.m5393t(inetSocketAddress, "address");
        this.f66199b = str;
        this.f66215r = i;
        this.f66203f = i2;
        this.f66213p = (Executor) Preconditions.m5393t(executor, "executor");
        this.f66214q = new C12895z1(executor);
        this.f66211n = 3;
        this.f66175A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f66176B = sSLSocketFactory;
        this.f66177C = hostnameVerifier;
        C12932b bVar2 = bVar;
        this.f66181G = (C12932b) Preconditions.m5393t(bVar, "connectionSpec");
        this.f66202e = C12749o0.f60047t;
        String str3 = str2;
        this.f66200c = C12749o0.m84362d("okhttp", str2);
        this.f66195U = a0Var;
        this.f66189O = (Runnable) Preconditions.m5393t(runnable, "tooManyPingsRunnable");
        this.f66190P = i3;
        this.f66192R = (C12725k2) Preconditions.m5392s(k2Var);
        this.f66210m = C12560f0.m83768a(getClass(), inetSocketAddress.toString());
        C12520a aVar2 = aVar;
        this.f66218u = C12520a.m83640c().mo69033d(C12743n0.f60017f, aVar).mo69031a();
        this.f66191Q = z;
        m96841a0();
    }

    /* renamed from: A */
    static /* synthetic */ int m96822A(C16124h hVar, int i) {
        int i2 = hVar.f66216s + i;
        hVar.f66216s = i2;
        return i2;
    }

    /* renamed from: P */
    private static Map<C16236a, C12537b1> m96837P() {
        EnumMap enumMap = new EnumMap(C16236a.class);
        C16236a aVar = C16236a.NO_ERROR;
        C12537b1 b1Var = C12537b1.f59421t;
        enumMap.put(aVar, b1Var.mo69066q("No error: A GRPC status of OK should have been sent"));
        enumMap.put(C16236a.PROTOCOL_ERROR, b1Var.mo69066q("Protocol error"));
        enumMap.put(C16236a.INTERNAL_ERROR, b1Var.mo69066q("Internal error"));
        enumMap.put(C16236a.FLOW_CONTROL_ERROR, b1Var.mo69066q("Flow control error"));
        enumMap.put(C16236a.STREAM_CLOSED, b1Var.mo69066q("Stream closed"));
        enumMap.put(C16236a.FRAME_TOO_LARGE, b1Var.mo69066q("Frame too large"));
        enumMap.put(C16236a.REFUSED_STREAM, C12537b1.f59422u.mo69066q("Refused stream"));
        enumMap.put(C16236a.CANCEL, C12537b1.f59408g.mo69066q("Cancelled"));
        enumMap.put(C16236a.COMPRESSION_ERROR, b1Var.mo69066q("Compression error"));
        enumMap.put(C16236a.CONNECT_ERROR, b1Var.mo69066q("Connect error"));
        enumMap.put(C16236a.ENHANCE_YOUR_CALM, C12537b1.f59416o.mo69066q("Enhance your calm"));
        enumMap.put(C16236a.INADEQUATE_SECURITY, C12537b1.f59414m.mo69066q("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    /* renamed from: Q */
    private C15815e m96838Q(InetSocketAddress inetSocketAddress, String str, String str2) {
        C15811c a = new C15811c.C15813b().mo75592k(ProxyConfig.MATCH_HTTPS).mo75590h(inetSocketAddress.getHostName()).mo75591j(inetSocketAddress.getPort()).mo75588a();
        C15815e.C15817b h = new C15815e.C15817b().mo75600h(a);
        C15815e.C15817b g = h.mo75599g(HTTP.TARGET_HOST, a.mo75583c() + ":" + a.mo75586j()).mo75599g(HTTP.USER_AGENT, this.f66200c);
        if (!(str == null || str2 == null)) {
            g.mo75599g(AUTH.PROXY_AUTH_RESP, C15807a.m95369a(str, str2));
        }
        return g.mo75598f();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public Socket m96839R(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException {
        Socket socket;
        try {
            if (inetSocketAddress2.getAddress() != null) {
                socket = this.f66175A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                socket = this.f66175A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
            socket.setTcpNoDelay(true);
            C11212y h = C11196l.m75169h(socket);
            C11184c a = C11196l.m75162a(C11196l.m75166e(socket));
            C15815e Q = m96838Q(inetSocketAddress, str, str2);
            C15811c b = Q.mo75596b();
            a.mo62455s0(String.format("CONNECT %s:%d HTTP/1.1", new Object[]{b.mo75583c(), Integer.valueOf(b.mo75586j())})).mo62455s0(IOUtils.LINE_SEPARATOR_WINDOWS);
            int b2 = Q.mo75595a().mo75576b();
            for (int i = 0; i < b2; i++) {
                a.mo62455s0(Q.mo75595a().mo75575a(i)).mo62455s0(": ").mo62455s0(Q.mo75595a().mo75577c(i)).mo62455s0(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            a.mo62455s0(IOUtils.LINE_SEPARATOR_WINDOWS);
            a.flush();
            C16103a a2 = C16103a.m96726a(m96846h0(h));
            while (!m96846h0(h).equals("")) {
            }
            int i2 = a2.f66072b;
            if (i2 >= 200 && i2 < 300) {
                return socket;
            }
            C11179b bVar = new C11179b();
            try {
                socket.shutdownOutput();
                h.mo62392m0(bVar, FileUtils.ONE_KB);
            } catch (IOException e) {
                bVar.mo62455s0("Unable to read body: " + e.toString());
            }
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw C12537b1.f59422u.mo69066q(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", new Object[]{Integer.valueOf(a2.f66072b), a2.f66073c, bVar.mo62471z()})).mo69056c();
        } catch (IOException e2) {
            throw C12537b1.f59422u.mo69066q("Failed trying to connect with proxy").mo69065p(e2).mo69056c();
        }
    }

    /* renamed from: Y */
    private Throwable m96840Y() {
        synchronized (this.f66209l) {
            C12537b1 b1Var = this.f66219v;
            if (b1Var != null) {
                StatusException c = b1Var.mo69056c();
                return c;
            }
            StatusException c2 = C12537b1.f59422u.mo69066q("Connection closed").mo69056c();
            return c2;
        }
    }

    /* renamed from: a0 */
    private void m96841a0() {
        synchronized (this.f66209l) {
            this.f66192R.mo69455g(new C16126b());
        }
    }

    /* renamed from: b0 */
    private boolean m96842b0() {
        return this.f66198a == null;
    }

    /* renamed from: e0 */
    private void m96843e0(C16121g gVar) {
        if (this.f66223z && this.f66180F.isEmpty() && this.f66212o.isEmpty()) {
            this.f66223z = false;
            C12888z0 z0Var = this.f66184J;
            if (z0Var != null) {
                z0Var.mo69648o();
            }
        }
        if (gVar.mo69153v()) {
            this.f66193S.mo69557d(gVar, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m96844g0(C16236a aVar, String str) {
        m96852l0(0, aVar, m96861q0(aVar).mo69058e(str));
    }

    /* renamed from: h0 */
    private static String m96846h0(C11212y yVar) throws IOException {
        C11179b bVar = new C11179b();
        while (yVar.mo62392m0(bVar, 1) != -1) {
            if (bVar.mo62435h(bVar.mo62399D() - 1) == 10) {
                return bVar.mo62401F0();
            }
        }
        throw new EOFException("\\n not found: " + bVar.mo62415S1().mo62502m());
    }

    /* renamed from: k0 */
    private void m96850k0(C16121g gVar) {
        if (!this.f66223z) {
            this.f66223z = true;
            C12888z0 z0Var = this.f66184J;
            if (z0Var != null) {
                z0Var.mo69647n();
            }
        }
        if (gVar.mo69153v()) {
            this.f66193S.mo69557d(gVar, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m96852l0(int i, C16236a aVar, C12537b1 b1Var) {
        synchronized (this.f66209l) {
            if (this.f66219v == null) {
                this.f66219v = b1Var;
                this.f66204g.mo69296a(b1Var);
            }
            if (aVar != null && !this.f66220w) {
                this.f66220w = true;
                this.f66207j.mo78455r1(0, aVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, C16121g>> it = this.f66212o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (((Integer) next.getKey()).intValue() > i) {
                    it.remove();
                    ((C16121g) next.getValue()).mo69154w().mo69170I(b1Var, C12785r.C12786a.REFUSED, false, new C12960q0());
                    m96843e0((C16121g) next.getValue());
                }
            }
            Iterator it2 = this.f66180F.iterator();
            while (it2.hasNext()) {
                C16121g gVar = (C16121g) it2.next();
                gVar.mo69154w().mo69170I(b1Var, C12785r.C12786a.REFUSED, true, new C12960q0());
                m96843e0(gVar);
            }
            this.f66180F.clear();
            m96858o0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public boolean m96854m0() {
        boolean z = false;
        while (!this.f66180F.isEmpty() && this.f66212o.size() < this.f66179E) {
            m96856n0(this.f66180F.poll());
            z = true;
        }
        return z;
    }

    /* renamed from: n0 */
    private void m96856n0(C16121g gVar) {
        Preconditions.m5399z(gVar.mo78470N() == -1, "StreamId already assigned");
        this.f66212o.put(Integer.valueOf(this.f66211n), gVar);
        m96850k0(gVar);
        gVar.mo69154w().mo78475Z(this.f66211n);
        if (!(gVar.mo78469M() == C12972r0.C12976d.UNARY || gVar.mo78469M() == C12972r0.C12976d.SERVER_STREAMING) || gVar.mo78473Q()) {
            this.f66207j.flush();
        }
        int i = this.f66211n;
        if (i >= 2147483645) {
            this.f66211n = Integer.MAX_VALUE;
            m96852l0(Integer.MAX_VALUE, C16236a.NO_ERROR, C12537b1.f59422u.mo69066q("Stream ids exhausted"));
            return;
        }
        this.f66211n = i + 2;
    }

    /* renamed from: o0 */
    private void m96858o0() {
        if (this.f66219v != null && this.f66212o.isEmpty() && this.f66180F.isEmpty() && !this.f66222y) {
            this.f66222y = true;
            C12888z0 z0Var = this.f66184J;
            if (z0Var != null) {
                z0Var.mo69650q();
                this.f66183I = (ScheduledExecutorService) C12617c2.m83942f(C12749o0.f60046s, this.f66183I);
            }
            C12795s0 s0Var = this.f66221x;
            if (s0Var != null) {
                s0Var.mo69542f(m96840Y());
                this.f66221x = null;
            }
            if (!this.f66220w) {
                this.f66220w = true;
                this.f66207j.mo78455r1(0, C16236a.NO_ERROR, new byte[0]);
            }
            this.f66207j.close();
        }
    }

    @VisibleForTesting
    /* renamed from: q0 */
    static C12537b1 m96861q0(C16236a aVar) {
        C12537b1 b1Var = f66172X.get(aVar);
        if (b1Var != null) {
            return b1Var;
        }
        C12537b1 b1Var2 = C12537b1.f59409h;
        return b1Var2.mo69066q("Unknown http2 error code: " + aVar.httpCode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo78479S(boolean z, long j, long j2, boolean z2) {
        this.f66185K = z;
        this.f66186L = j;
        this.f66187M = j2;
        this.f66188N = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo78480T(int i, C12537b1 b1Var, C12785r.C12786a aVar, boolean z, C16236a aVar2, C12960q0 q0Var) {
        synchronized (this.f66209l) {
            C16121g remove = this.f66212o.remove(Integer.valueOf(i));
            if (remove != null) {
                if (aVar2 != null) {
                    this.f66207j.mo78456t(i, C16236a.CANCEL);
                }
                if (b1Var != null) {
                    C16121g.C16123b P = remove.mo69154w();
                    if (q0Var == null) {
                        q0Var = new C12960q0();
                    }
                    P.mo69170I(b1Var, aVar, z, q0Var);
                }
                if (!m96854m0()) {
                    m96858o0();
                    m96843e0(remove);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public C16121g[] mo78481U() {
        C16121g[] gVarArr;
        synchronized (this.f66209l) {
            gVarArr = (C16121g[]) this.f66212o.values().toArray(f66174Z);
        }
        return gVarArr;
    }

    /* renamed from: V */
    public C12520a mo78482V() {
        return this.f66218u;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: W */
    public String mo78483W() {
        URI a = C12749o0.m84359a(this.f66199b);
        if (a.getHost() != null) {
            return a.getHost();
        }
        return this.f66199b;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: X */
    public int mo78484X() {
        URI a = C12749o0.m84359a(this.f66199b);
        if (a.getPort() != -1) {
            return a.getPort();
        }
        return this.f66198a.getPort();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public C16121g mo78485Z(int i) {
        C16121g gVar;
        synchronized (this.f66209l) {
            gVar = this.f66212o.get(Integer.valueOf(i));
        }
        return gVar;
    }

    /* renamed from: a */
    public void mo78457a(Throwable th) {
        Preconditions.m5393t(th, "failureCause");
        m96852l0(0, C16236a.INTERNAL_ERROR, C12537b1.f59422u.mo69065p(th));
    }

    /* renamed from: b */
    public void mo69405b(C12537b1 b1Var) {
        mo69406e(b1Var);
        synchronized (this.f66209l) {
            Iterator<Map.Entry<Integer, C16121g>> it = this.f66212o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                it.remove();
                ((C16121g) next.getValue()).mo69154w().mo69171J(b1Var, false, new C12960q0());
                m96843e0((C16121g) next.getValue());
            }
            Iterator it2 = this.f66180F.iterator();
            while (it2.hasNext()) {
                C16121g gVar = (C16121g) it2.next();
                gVar.mo69154w().mo69171J(b1Var, true, new C12960q0());
                m96843e0(gVar);
            }
            this.f66180F.clear();
            m96858o0();
        }
    }

    /* renamed from: c */
    public C12560f0 mo69268c() {
        return this.f66210m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public boolean mo78486c0() {
        return this.f66176B == null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1.mo69540a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69434d(p292io.grpc.internal.C12793s.C12794a r9, java.util.concurrent.Executor r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f66209l
            monitor-enter(r0)
            p9.b r1 = r8.f66207j     // Catch:{ all -> 0x0054 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            com.google.common.base.Preconditions.m5398y(r1)     // Catch:{ all -> 0x0054 }
            boolean r1 = r8.f66222y     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x001c
            java.lang.Throwable r1 = r8.m96840Y()     // Catch:{ all -> 0x0054 }
            p292io.grpc.internal.C12795s0.m84540g(r9, r10, r1)     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x001c:
            io.grpc.internal.s0 r1 = r8.f66221x     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0024
            r4 = 0
            r2 = 0
            goto L_0x0042
        L_0x0024:
            java.util.Random r1 = r8.f66201d     // Catch:{ all -> 0x0054 }
            long r4 = r1.nextLong()     // Catch:{ all -> 0x0054 }
            com.google.common.base.Supplier<com.google.common.base.Stopwatch> r1 = r8.f66202e     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0054 }
            com.google.common.base.Stopwatch r1 = (com.google.common.base.Stopwatch) r1     // Catch:{ all -> 0x0054 }
            r1.mo22255i()     // Catch:{ all -> 0x0054 }
            io.grpc.internal.s0 r6 = new io.grpc.internal.s0     // Catch:{ all -> 0x0054 }
            r6.<init>(r4, r1)     // Catch:{ all -> 0x0054 }
            r8.f66221x = r6     // Catch:{ all -> 0x0054 }
            io.grpc.internal.k2 r1 = r8.f66192R     // Catch:{ all -> 0x0054 }
            r1.mo69450b()     // Catch:{ all -> 0x0054 }
            r1 = r6
        L_0x0042:
            if (r2 == 0) goto L_0x004f
            p9.b r2 = r8.f66207j     // Catch:{ all -> 0x0054 }
            r6 = 32
            long r6 = r4 >>> r6
            int r7 = (int) r6     // Catch:{ all -> 0x0054 }
            int r5 = (int) r4     // Catch:{ all -> 0x0054 }
            r2.mo78453k(r3, r7, r5)     // Catch:{ all -> 0x0054 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            r1.mo69540a(r9, r10)
            return
        L_0x0054:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p360p9.C16124h.mo69434d(io.grpc.internal.s$a, java.util.concurrent.Executor):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public boolean mo78487d0(int i) {
        boolean z;
        synchronized (this.f66209l) {
            z = true;
            if (i >= this.f66211n || (i & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public void mo69406e(C12537b1 b1Var) {
        synchronized (this.f66209l) {
            if (this.f66219v == null) {
                this.f66219v = b1Var;
                this.f66204g.mo69296a(b1Var);
                m96858o0();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public Runnable mo69407f(C12688g1.C12689a aVar) {
        this.f66204g = (C12688g1.C12689a) Preconditions.m5393t(aVar, "listener");
        if (this.f66185K) {
            this.f66183I = (ScheduledExecutorService) C12617c2.m83941d(C12749o0.f60046s);
            C12888z0 z0Var = new C12888z0(new C12888z0.C12891c(this), this.f66183I, this.f66186L, this.f66187M, this.f66188N);
            this.f66184J = z0Var;
            z0Var.mo69649p();
        }
        if (m96842b0()) {
            synchronized (this.f66209l) {
                C16110b bVar = new C16110b(this, this.f66182H, this.f66206i);
                this.f66207j = bVar;
                this.f66208k = new C16142p(this, bVar);
            }
            this.f66214q.execute(new C16127c());
            return null;
        }
        C16105a m = C16105a.m96738m(this.f66214q, this);
        C16245g gVar = new C16245g();
        C16239c b = gVar.mo78757b(C11196l.m75162a(m), true);
        synchronized (this.f66209l) {
            C16110b bVar2 = new C16110b(this, b);
            this.f66207j = bVar2;
            this.f66208k = new C16142p(this, bVar2);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f66214q.execute(new C16128d(countDownLatch, m, gVar));
        try {
            mo78490j0();
            countDownLatch.countDown();
            this.f66214q.execute(new C16130e());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* renamed from: f0 */
    public C16121g mo69389g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
        Object obj;
        C12960q0 q0Var2 = q0Var;
        Preconditions.m5393t(r0Var, "method");
        Preconditions.m5393t(q0Var2, "headers");
        C12669e2 h = C12669e2.m84120h(cVar, this.f66218u, q0Var2);
        Object obj2 = this.f66209l;
        synchronized (obj2) {
            try {
                C16110b bVar = this.f66207j;
                C16142p pVar = this.f66208k;
                Object obj3 = this.f66209l;
                int i = this.f66215r;
                int i2 = this.f66203f;
                String str = this.f66199b;
                String str2 = this.f66200c;
                C12725k2 k2Var = this.f66192R;
                obj = obj2;
                C16121g gVar = new C16121g(r0Var, q0Var, bVar, this, pVar, obj3, i, i2, str, str2, h, k2Var, cVar, this.f66191Q);
                return gVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo78489i0(C16121g gVar) {
        this.f66180F.remove(gVar);
        m96843e0(gVar);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: j0 */
    public void mo78490j0() {
        synchronized (this.f66209l) {
            this.f66207j.mo78450d0();
            C16252i iVar = new C16252i();
            C16138l.m96934c(iVar, 7, this.f66203f);
            this.f66207j.mo78454m1(iVar);
            int i = this.f66203f;
            if (i > 65535) {
                this.f66207j.mo78449d(0, (long) (i - 65535));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo78491p0(C16121g gVar) {
        if (this.f66219v != null) {
            gVar.mo69154w().mo69170I(this.f66219v, C12785r.C12786a.REFUSED, true, new C12960q0());
        } else if (this.f66212o.size() >= this.f66179E) {
            this.f66180F.add(gVar);
            m96850k0(gVar);
        } else {
            m96856n0(gVar);
        }
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22193c("logId", this.f66210m.mo69134d()).mo22194d("address", this.f66198a).toString();
    }
}

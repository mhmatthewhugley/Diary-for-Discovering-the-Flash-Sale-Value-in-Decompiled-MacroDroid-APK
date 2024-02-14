package p292io.grpc.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.p206io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12909l;
import p292io.grpc.C12960q0;
import p292io.grpc.C12977s;
import p292io.grpc.C12997u;
import p292io.grpc.C13012z;
import p292io.grpc.internal.C12623d;
import p292io.grpc.internal.C12711i1;
import p292io.grpc.internal.C12785r;

/* renamed from: io.grpc.internal.a */
/* compiled from: AbstractClientStream */
public abstract class C12570a extends C12623d implements C12781q, C12711i1.C12715d {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Logger f59506g = Logger.getLogger(C12570a.class.getName());

    /* renamed from: a */
    private final C12725k2 f59507a;

    /* renamed from: b */
    private final C12738m0 f59508b;

    /* renamed from: c */
    private boolean f59509c;

    /* renamed from: d */
    private boolean f59510d;

    /* renamed from: e */
    private C12960q0 f59511e;

    /* renamed from: f */
    private volatile boolean f59512f;

    /* renamed from: io.grpc.internal.a$a */
    /* compiled from: AbstractClientStream */
    private class C12571a implements C12738m0 {

        /* renamed from: a */
        private C12960q0 f59513a;

        /* renamed from: b */
        private boolean f59514b;

        /* renamed from: c */
        private final C12669e2 f59515c;

        /* renamed from: d */
        private byte[] f59516d;

        public C12571a(C12960q0 q0Var, C12669e2 e2Var) {
            this.f59513a = (C12960q0) Preconditions.m5393t(q0Var, "headers");
            this.f59515c = (C12669e2) Preconditions.m5393t(e2Var, "statsTraceCtx");
        }

        /* renamed from: a */
        public C12738m0 mo69155a(C12909l lVar) {
            return this;
        }

        /* renamed from: b */
        public void mo69156b(InputStream inputStream) {
            Preconditions.m5399z(this.f59516d == null, "writePayload should not be called multiple times");
            try {
                this.f59516d = ByteStreams.m73417j(inputStream);
                this.f59515c.mo69366i(0);
                C12669e2 e2Var = this.f59515c;
                byte[] bArr = this.f59516d;
                e2Var.mo69367j(0, (long) bArr.length, (long) bArr.length);
                this.f59515c.mo69368k((long) this.f59516d.length);
                this.f59515c.mo69369l((long) this.f59516d.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void close() {
            boolean z = true;
            this.f59514b = true;
            if (this.f59516d == null) {
                z = false;
            }
            Preconditions.m5399z(z, "Lack of request message. GET request is only supported for unary requests");
            C12570a.this.mo69151s().mo69164g(this.f59513a, this.f59516d);
            this.f59516d = null;
            this.f59513a = null;
        }

        /* renamed from: d */
        public void mo69158d(int i) {
        }

        public void flush() {
        }

        public boolean isClosed() {
            return this.f59514b;
        }
    }

    /* renamed from: io.grpc.internal.a$b */
    /* compiled from: AbstractClientStream */
    protected interface C12572b {
        /* renamed from: b */
        void mo69161b(int i);

        /* renamed from: e */
        void mo69162e(C12537b1 b1Var);

        /* renamed from: f */
        void mo69163f(C12734l2 l2Var, boolean z, boolean z2, int i);

        /* renamed from: g */
        void mo69164g(C12960q0 q0Var, byte[] bArr);
    }

    /* renamed from: io.grpc.internal.a$c */
    /* compiled from: AbstractClientStream */
    protected static abstract class C12573c extends C12623d.C12624a {

        /* renamed from: A */
        private C12785r f59518A;

        /* renamed from: B */
        private boolean f59519B;

        /* renamed from: C */
        private C12997u f59520C = C12997u.m85199c();

        /* renamed from: D */
        private boolean f59521D = false;

        /* renamed from: E */
        private Runnable f59522E;

        /* renamed from: F */
        private volatile boolean f59523F;

        /* renamed from: G */
        private boolean f59524G;

        /* renamed from: H */
        private boolean f59525H;

        /* renamed from: s */
        private final C12669e2 f59526s;

        /* renamed from: z */
        private boolean f59527z;

        /* renamed from: io.grpc.internal.a$c$a */
        /* compiled from: AbstractClientStream */
        class C12574a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12537b1 f59528a;

            /* renamed from: c */
            final /* synthetic */ C12785r.C12786a f59529c;

            /* renamed from: d */
            final /* synthetic */ C12960q0 f59530d;

            C12574a(C12537b1 b1Var, C12785r.C12786a aVar, C12960q0 q0Var) {
                this.f59528a = b1Var;
                this.f59529c = aVar;
                this.f59530d = q0Var;
            }

            public void run() {
                C12573c.this.m83820y(this.f59528a, this.f59529c, this.f59530d);
            }
        }

        protected C12573c(int i, C12669e2 e2Var, C12725k2 k2Var) {
            super(i, e2Var, k2Var);
            this.f59526s = (C12669e2) Preconditions.m5393t(e2Var, "statsTraceCtx");
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public void m83813E(C12997u uVar) {
            Preconditions.m5399z(this.f59518A == null, "Already called start");
            this.f59520C = (C12997u) Preconditions.m5393t(uVar, "decompressorRegistry");
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public void m83814F(boolean z) {
            this.f59519B = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: H */
        public final void m83815H() {
            this.f59523F = true;
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public void m83820y(C12537b1 b1Var, C12785r.C12786a aVar, C12960q0 q0Var) {
            if (!this.f59527z) {
                this.f59527z = true;
                this.f59526s.mo69370m(b1Var);
                mo69173k().mo69197d(b1Var, aVar, q0Var);
                if (mo69254h() != null) {
                    mo69254h().mo69454f(b1Var.mo69064o());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
        /* renamed from: A */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo69165A(p292io.grpc.C12960q0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f59524G
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                com.google.common.base.Preconditions.m5399z(r0, r2)
                io.grpc.internal.e2 r0 = r5.f59526s
                r0.mo69359a()
                io.grpc.q0$g<java.lang.String> r0 = p292io.grpc.internal.C12749o0.f60033f
                java.lang.Object r0 = r6.mo69764f(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f59519B
                r3 = 0
                if (r2 == 0) goto L_0x004f
                if (r0 == 0) goto L_0x004f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L_0x002f
                io.grpc.internal.p0 r0 = new io.grpc.internal.p0
                r0.<init>()
                r5.mo69260s(r0)
                r0 = 1
                goto L_0x0050
            L_0x002f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L_0x004f
                io.grpc.b1 r6 = p292io.grpc.C12537b1.f59421t
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                io.grpc.b1 r6 = r6.mo69066q(r0)
                io.grpc.StatusRuntimeException r6 = r6.mo69057d()
                r5.mo69376f(r6)
                return
            L_0x004f:
                r0 = 0
            L_0x0050:
                io.grpc.q0$g<java.lang.String> r2 = p292io.grpc.internal.C12749o0.f60031d
                java.lang.Object r2 = r6.mo69764f(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L_0x0099
                io.grpc.u r4 = r5.f59520C
                io.grpc.t r4 = r4.mo69851e(r2)
                if (r4 != 0) goto L_0x007a
                io.grpc.b1 r6 = p292io.grpc.C12537b1.f59421t
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.b1 r6 = r6.mo69066q(r0)
                io.grpc.StatusRuntimeException r6 = r6.mo69057d()
                r5.mo69376f(r6)
                return
            L_0x007a:
                io.grpc.k r1 = p292io.grpc.C12905k.C12907b.f60451a
                if (r4 == r1) goto L_0x0099
                if (r0 == 0) goto L_0x0096
                io.grpc.b1 r6 = p292io.grpc.C12537b1.f59421t
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r1 = "Full stream and gRPC message encoding cannot both be set"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.b1 r6 = r6.mo69066q(r0)
                io.grpc.StatusRuntimeException r6 = r6.mo69057d()
                r5.mo69376f(r6)
                return
            L_0x0096:
                r5.mo69259r(r4)
            L_0x0099:
                io.grpc.internal.r r0 = r5.mo69173k()
                r0.mo69196c(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12570a.C12573c.mo69165A(io.grpc.q0):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public void mo69166B(C12960q0 q0Var, C12537b1 b1Var) {
            Preconditions.m5393t(b1Var, NotificationCompat.CATEGORY_STATUS);
            Preconditions.m5393t(q0Var, "trailers");
            if (this.f59524G) {
                C12570a.f59506g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{b1Var, q0Var});
                return;
            }
            this.f59526s.mo69360b(q0Var);
            mo69171J(b1Var, false, q0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public final boolean mo69167C() {
            return this.f59523F;
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public final C12785r mo69173k() {
            return this.f59518A;
        }

        @VisibleForTesting
        /* renamed from: G */
        public final void mo69169G(C12785r rVar) {
            Preconditions.m5399z(this.f59518A == null, "Already called setListener");
            this.f59518A = (C12785r) Preconditions.m5393t(rVar, "listener");
        }

        /* renamed from: I */
        public final void mo69170I(C12537b1 b1Var, C12785r.C12786a aVar, boolean z, C12960q0 q0Var) {
            Preconditions.m5393t(b1Var, NotificationCompat.CATEGORY_STATUS);
            Preconditions.m5393t(q0Var, "trailers");
            if (!this.f59524G || z) {
                this.f59524G = true;
                this.f59525H = b1Var.mo69064o();
                mo69257p();
                if (this.f59521D) {
                    this.f59522E = null;
                    m83820y(b1Var, aVar, q0Var);
                    return;
                }
                this.f59522E = new C12574a(b1Var, aVar, q0Var);
                mo69252e(z);
            }
        }

        /* renamed from: J */
        public final void mo69171J(C12537b1 b1Var, boolean z, C12960q0 q0Var) {
            mo69170I(b1Var, C12785r.C12786a.PROCESSED, z, q0Var);
        }

        /* renamed from: i */
        public void mo69172i(boolean z) {
            Preconditions.m5399z(this.f59524G, "status should have been reported on deframer closed");
            this.f59521D = true;
            if (this.f59525H && z) {
                mo69171J(C12537b1.f59421t.mo69066q("Encountered end-of-stream mid-frame"), true, new C12960q0());
            }
            Runnable runnable = this.f59522E;
            if (runnable != null) {
                runnable.run();
                this.f59522E = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public void mo69174z(C12798s1 s1Var) {
            Preconditions.m5393t(s1Var, TypedValues.Attributes.S_FRAME);
            boolean z = true;
            try {
                if (this.f59524G) {
                    C12570a.f59506g.log(Level.INFO, "Received data on closed stream");
                    s1Var.close();
                    return;
                }
                z = false;
                mo69253g(s1Var);
            } catch (Throwable th) {
                if (z) {
                    s1Var.close();
                }
                throw th;
            }
        }
    }

    protected C12570a(C12740m2 m2Var, C12669e2 e2Var, C12725k2 k2Var, C12960q0 q0Var, C12542c cVar, boolean z) {
        Preconditions.m5393t(q0Var, "headers");
        this.f59507a = (C12725k2) Preconditions.m5393t(k2Var, "transportTracer");
        this.f59509c = C12749o0.m84369k(cVar);
        this.f59510d = z;
        if (!z) {
            this.f59508b = new C12711i1(this, m2Var, e2Var);
            this.f59511e = q0Var;
            return;
        }
        this.f59508b = new C12571a(q0Var, e2Var);
    }

    /* renamed from: b */
    public final void mo69138b(int i) {
        mo69151s().mo69161b(i);
    }

    /* renamed from: c */
    public void mo69139c(int i) {
        mo69150r().mo69261t(i);
    }

    /* renamed from: d */
    public void mo69140d(int i) {
        this.f59508b.mo69158d(i);
    }

    /* renamed from: e */
    public final void mo69141e(C12537b1 b1Var) {
        Preconditions.m5378e(!b1Var.mo69064o(), "Should not cancel with OK status");
        this.f59512f = true;
        mo69151s().mo69162e(b1Var);
    }

    /* renamed from: f */
    public final void mo69142f(C12997u uVar) {
        mo69150r().m83813E(uVar);
    }

    /* renamed from: h */
    public final void mo69143h(boolean z) {
        mo69150r().m83814F(z);
    }

    /* renamed from: j */
    public final void mo69144j(C12810u0 u0Var) {
        u0Var.mo69569b("remote_addr", getAttributes().mo69026b(C13012z.f60762a));
    }

    /* renamed from: k */
    public final void mo69145k() {
        if (!mo69150r().mo69167C()) {
            mo69150r().m83815H();
            mo69249o();
        }
    }

    /* renamed from: l */
    public void mo69146l(C12977s sVar) {
        C12960q0 q0Var = this.f59511e;
        C12960q0.C12967g<Long> gVar = C12749o0.f60030c;
        q0Var.mo69763d(gVar);
        this.f59511e.mo69768o(gVar, Long.valueOf(Math.max(0, sVar.mo69810l(TimeUnit.NANOSECONDS))));
    }

    /* renamed from: m */
    public final void mo69147m(C12785r rVar) {
        mo69150r().mo69169G(rVar);
        if (!this.f59510d) {
            mo69151s().mo69164g(this.f59511e, (byte[]) null);
            this.f59511e = null;
        }
    }

    /* renamed from: n */
    public final void mo69148n(C12734l2 l2Var, boolean z, boolean z2, int i) {
        Preconditions.m5378e(l2Var != null || z, "null frame before EOS");
        mo69151s().mo69163f(l2Var, z, z2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C12738m0 mo69149p() {
        return this.f59508b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract C12572b mo69151s();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C12725k2 mo69152u() {
        return this.f59507a;
    }

    /* renamed from: v */
    public final boolean mo69153v() {
        return this.f59509c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract C12573c mo69150r();
}

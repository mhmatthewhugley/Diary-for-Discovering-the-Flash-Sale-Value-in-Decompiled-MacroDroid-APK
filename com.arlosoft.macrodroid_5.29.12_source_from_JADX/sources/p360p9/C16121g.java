package p360p9;

import com.google.common.base.Preconditions;
import com.google.common.p206io.BaseEncoding;
import java.util.List;
import p226cd.C11179b;
import p292io.grpc.C12520a;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.internal.C12570a;
import p292io.grpc.internal.C12669e2;
import p292io.grpc.internal.C12725k2;
import p292io.grpc.internal.C12734l2;
import p292io.grpc.internal.C12785r;
import p292io.grpc.internal.C12787r0;
import p369q9.C16236a;
import p369q9.C16240d;
import p405u9.C16674c;
import p405u9.C16675d;

/* renamed from: p9.g */
/* compiled from: OkHttpClientStream */
class C16121g extends C12570a {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C11179b f66145r = new C11179b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12972r0<?, ?> f66146h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f66147i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C12669e2 f66148j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f66149k;

    /* renamed from: l */
    private Object f66150l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile int f66151m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C16123b f66152n;

    /* renamed from: o */
    private final C16122a f66153o;

    /* renamed from: p */
    private final C12520a f66154p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f66155q;

    /* renamed from: p9.g$a */
    /* compiled from: OkHttpClientStream */
    class C16122a implements C12570a.C12572b {
        C16122a() {
        }

        /* renamed from: b */
        public void mo69161b(int i) {
            C16674c.m99124f("OkHttpClientStream$Sink.request");
            try {
                synchronized (C16121g.this.f66152n.f66158P) {
                    C16121g.this.f66152n.mo69258q(i);
                }
                C16674c.m99126h("OkHttpClientStream$Sink.request");
            } catch (Throwable th) {
                C16674c.m99126h("OkHttpClientStream$Sink.request");
                throw th;
            }
        }

        /* renamed from: e */
        public void mo69162e(C12537b1 b1Var) {
            C16674c.m99124f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (C16121g.this.f66152n.f66158P) {
                    C16121g.this.f66152n.m96808W(b1Var, true, (C12960q0) null);
                }
                C16674c.m99126h("OkHttpClientStream$Sink.cancel");
            } catch (Throwable th) {
                C16674c.m99126h("OkHttpClientStream$Sink.cancel");
                throw th;
            }
        }

        /* renamed from: f */
        public void mo69163f(C12734l2 l2Var, boolean z, boolean z2, int i) {
            C11179b bVar;
            C16674c.m99124f("OkHttpClientStream$Sink.writeFrame");
            if (l2Var == null) {
                bVar = C16121g.f66145r;
            } else {
                bVar = ((C16140n) l2Var).mo78521c();
                int D = (int) bVar.mo62399D();
                if (D > 0) {
                    C16121g.this.mo69250q(D);
                }
            }
            try {
                synchronized (C16121g.this.f66152n.f66158P) {
                    C16121g.this.f66152n.m96810Y(bVar, z, z2);
                    C16121g.this.mo69152u().mo69453e(i);
                }
                C16674c.m99126h("OkHttpClientStream$Sink.writeFrame");
            } catch (Throwable th) {
                C16674c.m99126h("OkHttpClientStream$Sink.writeFrame");
                throw th;
            }
        }

        /* renamed from: g */
        public void mo69164g(C12960q0 q0Var, byte[] bArr) {
            C16674c.m99124f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + C16121g.this.f66146h.mo69787c();
            if (bArr != null) {
                boolean unused = C16121g.this.f66155q = true;
                str = str + "?" + BaseEncoding.m73356b().mo60971g(bArr);
            }
            try {
                synchronized (C16121g.this.f66152n.f66158P) {
                    C16121g.this.f66152n.m96811a0(q0Var, str);
                }
                C16674c.m99126h("OkHttpClientStream$Sink.writeHeaders");
            } catch (Throwable th) {
                C16674c.m99126h("OkHttpClientStream$Sink.writeHeaders");
                throw th;
            }
        }
    }

    /* renamed from: p9.g$b */
    /* compiled from: OkHttpClientStream */
    class C16123b extends C12787r0 {

        /* renamed from: O */
        private final int f66157O;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public final Object f66158P;

        /* renamed from: Q */
        private List<C16240d> f66159Q;

        /* renamed from: R */
        private C11179b f66160R = new C11179b();

        /* renamed from: S */
        private boolean f66161S = false;

        /* renamed from: T */
        private boolean f66162T = false;

        /* renamed from: U */
        private boolean f66163U = false;

        /* renamed from: V */
        private int f66164V;

        /* renamed from: W */
        private int f66165W;

        /* renamed from: X */
        private final C16110b f66166X;

        /* renamed from: Y */
        private final C16142p f66167Y;

        /* renamed from: Z */
        private final C16124h f66168Z;

        /* renamed from: a0 */
        private boolean f66169a0 = true;

        /* renamed from: b0 */
        private final C16675d f66170b0;

        public C16123b(int i, C12669e2 e2Var, Object obj, C16110b bVar, C16142p pVar, C16124h hVar, int i2, String str) {
            super(i, e2Var, C16121g.this.mo69152u());
            this.f66158P = Preconditions.m5393t(obj, "lock");
            this.f66166X = bVar;
            this.f66167Y = pVar;
            this.f66168Z = hVar;
            this.f66164V = i2;
            this.f66165W = i2;
            this.f66157O = i2;
            this.f66170b0 = C16674c.m99119a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: W */
        public void m96808W(C12537b1 b1Var, boolean z, C12960q0 q0Var) {
            if (!this.f66163U) {
                this.f66163U = true;
                if (this.f66169a0) {
                    this.f66168Z.mo78489i0(C16121g.this);
                    this.f66159Q = null;
                    this.f66160R.mo62424b();
                    this.f66169a0 = false;
                    if (q0Var == null) {
                        q0Var = new C12960q0();
                    }
                    mo69171J(b1Var, true, q0Var);
                    return;
                }
                this.f66168Z.mo78480T(C16121g.this.mo78470N(), b1Var, C12785r.C12786a.PROCESSED, z, C16236a.CANCEL, q0Var);
            }
        }

        /* renamed from: X */
        private void m96809X() {
            if (!mo69167C()) {
                this.f66168Z.mo78480T(C16121g.this.mo78470N(), (C12537b1) null, C12785r.C12786a.PROCESSED, false, C16236a.CANCEL, (C12960q0) null);
            } else {
                this.f66168Z.mo78480T(C16121g.this.mo78470N(), (C12537b1) null, C12785r.C12786a.PROCESSED, false, (C16236a) null, (C12960q0) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: Y */
        public void m96810Y(C11179b bVar, boolean z, boolean z2) {
            if (!this.f66163U) {
                if (this.f66169a0) {
                    this.f66160R.mo62384X(bVar, (long) ((int) bVar.mo62399D()));
                    this.f66161S |= z;
                    this.f66162T |= z2;
                    return;
                }
                Preconditions.m5399z(C16121g.this.mo78470N() != -1, "streamId should be set");
                this.f66167Y.mo78522c(z, C16121g.this.mo78470N(), bVar, z2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a0 */
        public void m96811a0(C12960q0 q0Var, String str) {
            this.f66159Q = C16112c.m96757a(q0Var, str, C16121g.this.f66149k, C16121g.this.f66147i, C16121g.this.f66155q, this.f66168Z.mo78486c0());
            this.f66168Z.mo78491p0(C16121g.this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public void mo69530L(C12537b1 b1Var, boolean z, C12960q0 q0Var) {
            m96808W(b1Var, z, q0Var);
        }

        /* renamed from: Z */
        public void mo78475Z(int i) {
            Preconditions.m5370A(C16121g.this.f66151m == -1, "the stream has been started with id %s", i);
            int unused = C16121g.this.f66151m = i;
            C16121g.this.f66152n.mo69256o();
            if (this.f66169a0) {
                this.f66166X.mo78451f2(C16121g.this.f66155q, false, C16121g.this.f66151m, 0, this.f66159Q);
                C16121g.this.f66148j.mo69361c();
                this.f66159Q = null;
                if (this.f66160R.mo62399D() > 0) {
                    this.f66167Y.mo78522c(this.f66161S, C16121g.this.f66151m, this.f66160R, this.f66162T);
                }
                this.f66169a0 = false;
            }
        }

        /* renamed from: b */
        public void mo69388b(Runnable runnable) {
            synchronized (this.f66158P) {
                runnable.run();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public C16675d mo78476b0() {
            return this.f66170b0;
        }

        /* renamed from: c0 */
        public void mo78477c0(C11179b bVar, boolean z) {
            int D = this.f66164V - ((int) bVar.mo62399D());
            this.f66164V = D;
            if (D < 0) {
                this.f66166X.mo78456t(C16121g.this.mo78470N(), C16236a.FLOW_CONTROL_ERROR);
                this.f66168Z.mo78480T(C16121g.this.mo78470N(), C12537b1.f59421t.mo69066q("Received data size exceeded our receiving window size"), C12785r.C12786a.PROCESSED, false, (C16236a) null, (C12960q0) null);
                return;
            }
            super.mo69531O(new C16137k(bVar), z);
        }

        /* renamed from: d */
        public void mo69374d(int i) {
            int i2 = this.f66165W - i;
            this.f66165W = i2;
            int i3 = this.f66157O;
            if (((float) i2) <= ((float) i3) * 0.5f) {
                int i4 = i3 - i2;
                this.f66164V += i4;
                this.f66165W = i2 + i4;
                this.f66166X.mo78449d(C16121g.this.mo78470N(), (long) i4);
            }
        }

        /* renamed from: d0 */
        public void mo78478d0(List<C16240d> list, boolean z) {
            if (z) {
                mo69533Q(C16146q.m96966c(list));
            } else {
                mo69532P(C16146q.m96964a(list));
            }
        }

        /* renamed from: f */
        public void mo69376f(Throwable th) {
            mo69530L(C12537b1.m83686k(th), true, new C12960q0());
        }

        /* renamed from: i */
        public void mo69172i(boolean z) {
            m96809X();
            super.mo69172i(z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo69256o() {
            super.mo69256o();
            mo69254h().mo69451c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C16121g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C16110b bVar, C16124h hVar, C16142p pVar, Object obj, int i, int i2, String str, String str2, C12669e2 e2Var, C12725k2 k2Var, C12542c cVar, boolean z) {
        super(new C16141o(), e2Var, k2Var, q0Var, cVar, z && r0Var.mo69790f());
        this.f66151m = -1;
        this.f66153o = new C16122a();
        this.f66155q = false;
        C12669e2 e2Var2 = e2Var;
        this.f66148j = (C12669e2) Preconditions.m5393t(e2Var2, "statsTraceCtx");
        this.f66146h = r0Var;
        this.f66149k = str;
        this.f66147i = str2;
        this.f66154p = hVar.mo78482V();
        this.f66152n = new C16123b(i, e2Var2, obj, bVar, pVar, hVar, i2, r0Var.mo69787c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public Object mo78468L() {
        return this.f66150l;
    }

    /* renamed from: M */
    public C12972r0.C12976d mo78469M() {
        return this.f66146h.mo69789e();
    }

    /* renamed from: N */
    public int mo78470N() {
        return this.f66151m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo78471O(Object obj) {
        this.f66150l = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public C16123b mo69154w() {
        return this.f66152n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo78473Q() {
        return this.f66155q;
    }

    public C12520a getAttributes() {
        return this.f66154p;
    }

    /* renamed from: i */
    public void mo69179i(String str) {
        this.f66149k = (String) Preconditions.m5393t(str, "authority");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public C16122a mo69151s() {
        return this.f66153o;
    }
}

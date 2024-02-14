package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import p292io.grpc.C12530b;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12952q;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;

/* renamed from: io.grpc.internal.j1 */
/* compiled from: MetadataApplierImpl */
final class C12720j1 extends C12530b.C12531a {

    /* renamed from: a */
    private final C12793s f59959a;

    /* renamed from: b */
    private final C12972r0<?, ?> f59960b;

    /* renamed from: c */
    private final C12960q0 f59961c;

    /* renamed from: d */
    private final C12542c f59962d;

    /* renamed from: e */
    private final C12952q f59963e;

    /* renamed from: f */
    private final Object f59964f = new Object();

    /* renamed from: g */
    private C12781q f59965g;

    /* renamed from: h */
    boolean f59966h;

    /* renamed from: i */
    C12575a0 f59967i;

    C12720j1(C12793s sVar, C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
        this.f59959a = sVar;
        this.f59960b = r0Var;
        this.f59961c = q0Var;
        this.f59962d = cVar;
        this.f59963e = C12952q.m85032i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r3.f59967i == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        com.google.common.base.Preconditions.m5399z(r1, "delayedStream is null");
        r3.f59967i.mo69180r(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m84277c(p292io.grpc.internal.C12781q r4) {
        /*
            r3 = this;
            boolean r0 = r3.f59966h
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "already finalized"
            com.google.common.base.Preconditions.m5399z(r0, r2)
            r3.f59966h = r1
            java.lang.Object r0 = r3.f59964f
            monitor-enter(r0)
            io.grpc.internal.q r2 = r3.f59965g     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x0016
            r3.f59965g = r4     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            io.grpc.internal.a0 r0 = r3.f59967i
            if (r0 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.String r0 = "delayedStream is null"
            com.google.common.base.Preconditions.m5399z(r1, r0)
            io.grpc.internal.a0 r0 = r3.f59967i
            r0.mo69180r(r4)
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12720j1.m84277c(io.grpc.internal.q):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo69048a(C12960q0 q0Var) {
        Preconditions.m5399z(!this.f59966h, "apply() or fail() already called");
        Preconditions.m5393t(q0Var, "headers");
        this.f59961c.mo69767l(q0Var);
        C12952q c = this.f59963e.mo69748c();
        try {
            C12781q g = this.f59959a.mo69389g(this.f59960b, this.f59961c, this.f59962d);
            this.f59963e.mo69751j(c);
            m84277c(g);
        } catch (Throwable th) {
            this.f59963e.mo69751j(c);
            throw th;
        }
    }

    /* renamed from: b */
    public void mo69049b(C12537b1 b1Var) {
        Preconditions.m5378e(!b1Var.mo69064o(), "Cannot fail with OK status");
        Preconditions.m5399z(!this.f59966h, "apply() or fail() already called");
        m84277c(new C12666e0(b1Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12781q mo69442d() {
        synchronized (this.f59964f) {
            C12781q qVar = this.f59965g;
            if (qVar != null) {
                return qVar;
            }
            C12575a0 a0Var = new C12575a0();
            this.f59967i = a0Var;
            this.f59965g = a0Var;
            return a0Var;
        }
    }
}

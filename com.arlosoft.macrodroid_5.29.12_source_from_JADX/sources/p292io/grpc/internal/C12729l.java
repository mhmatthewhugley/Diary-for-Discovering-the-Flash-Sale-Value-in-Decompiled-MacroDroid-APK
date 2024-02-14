package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p292io.grpc.C12530b;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12554e;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.internal.C12799t;

/* renamed from: io.grpc.internal.l */
/* compiled from: CallCredentialsApplyingTransportFactory */
final class C12729l implements C12799t {

    /* renamed from: a */
    private final C12799t f59983a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f59984c;

    /* renamed from: io.grpc.internal.l$a */
    /* compiled from: CallCredentialsApplyingTransportFactory */
    private class C12730a extends C12710i0 {

        /* renamed from: a */
        private final C12812v f59985a;

        /* renamed from: b */
        private final String f59986b;

        /* renamed from: io.grpc.internal.l$a$a */
        /* compiled from: CallCredentialsApplyingTransportFactory */
        class C12731a extends C12530b.C12532b {

            /* renamed from: a */
            final /* synthetic */ C12972r0 f59988a;

            /* renamed from: b */
            final /* synthetic */ C12542c f59989b;

            C12731a(C12972r0 r0Var, C12542c cVar) {
                this.f59988a = r0Var;
                this.f59989b = cVar;
            }
        }

        C12730a(C12812v vVar, String str) {
            this.f59985a = (C12812v) Preconditions.m5393t(vVar, "delegate");
            this.f59986b = (String) Preconditions.m5393t(str, "authority");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12812v mo69433a() {
            return this.f59985a;
        }

        /* renamed from: g */
        public C12781q mo69389g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
            C12530b c = cVar.mo69078c();
            if (c == null) {
                return this.f59985a.mo69389g(r0Var, q0Var, cVar);
            }
            C12720j1 j1Var = new C12720j1(this.f59985a, r0Var, q0Var, cVar);
            try {
                c.mo63026a(new C12731a(r0Var, cVar), (Executor) MoreObjects.m5332a(cVar.mo69080e(), C12729l.this.f59984c), j1Var);
            } catch (Throwable th) {
                j1Var.mo69049b(C12537b1.f59415n.mo69066q("Credentials should use fail() instead of throwing exceptions").mo69065p(th));
            }
            return j1Var.mo69442d();
        }
    }

    C12729l(C12799t tVar, Executor executor) {
        this.f59983a = (C12799t) Preconditions.m5393t(tVar, "delegate");
        this.f59984c = (Executor) Preconditions.m5393t(executor, "appExecutor");
    }

    /* renamed from: O0 */
    public ScheduledExecutorService mo69457O0() {
        return this.f59983a.mo69457O0();
    }

    /* renamed from: O1 */
    public C12812v mo69458O1(SocketAddress socketAddress, C12799t.C12800a aVar, C12554e eVar) {
        return new C12730a(this.f59983a.mo69458O1(socketAddress, aVar, eVar), aVar.mo69546a());
    }

    public void close() {
        this.f59983a.close();
    }
}

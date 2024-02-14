package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12560f0;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.internal.C12785r;

/* renamed from: io.grpc.internal.f0 */
/* compiled from: FailingClientTransport */
class C12680f0 implements C12793s {
    @VisibleForTesting

    /* renamed from: a */
    final C12537b1 f59881a;

    /* renamed from: b */
    private final C12785r.C12786a f59882b;

    C12680f0(C12537b1 b1Var, C12785r.C12786a aVar) {
        Preconditions.m5378e(!b1Var.mo69064o(), "error must not be OK");
        this.f59881a = b1Var;
        this.f59882b = aVar;
    }

    /* renamed from: c */
    public C12560f0 mo69268c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    /* renamed from: g */
    public C12781q mo69389g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
        return new C12666e0(this.f59881a, this.f59882b);
    }
}

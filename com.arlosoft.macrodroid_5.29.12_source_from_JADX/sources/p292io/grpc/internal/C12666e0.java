package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import p292io.grpc.C12537b1;
import p292io.grpc.C12960q0;
import p292io.grpc.internal.C12785r;

/* renamed from: io.grpc.internal.e0 */
/* compiled from: FailingClientStream */
public final class C12666e0 extends C12724k1 {

    /* renamed from: b */
    private boolean f59845b;

    /* renamed from: c */
    private final C12537b1 f59846c;

    /* renamed from: d */
    private final C12785r.C12786a f59847d;

    public C12666e0(C12537b1 b1Var) {
        this(b1Var, C12785r.C12786a.PROCESSED);
    }

    /* renamed from: j */
    public void mo69144j(C12810u0 u0Var) {
        u0Var.mo69569b("error", this.f59846c).mo69569b("progress", this.f59847d);
    }

    /* renamed from: m */
    public void mo69147m(C12785r rVar) {
        Preconditions.m5399z(!this.f59845b, "already started");
        this.f59845b = true;
        rVar.mo69197d(this.f59846c, this.f59847d, new C12960q0());
    }

    public C12666e0(C12537b1 b1Var, C12785r.C12786a aVar) {
        Preconditions.m5378e(!b1Var.mo69064o(), "error must not be OK");
        this.f59846c = b1Var;
        this.f59847d = aVar;
    }
}

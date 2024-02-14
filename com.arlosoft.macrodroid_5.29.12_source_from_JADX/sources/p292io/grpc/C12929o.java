package p292io.grpc;

import com.google.common.base.Preconditions;

/* renamed from: io.grpc.o */
/* compiled from: ConnectivityStateInfo */
public final class C12929o {

    /* renamed from: a */
    private final C12926n f60484a;

    /* renamed from: b */
    private final C12537b1 f60485b;

    private C12929o(C12926n nVar, C12537b1 b1Var) {
        this.f60484a = (C12926n) Preconditions.m5393t(nVar, "state is null");
        this.f60485b = (C12537b1) Preconditions.m5393t(b1Var, "status is null");
    }

    /* renamed from: a */
    public static C12929o m84945a(C12926n nVar) {
        Preconditions.m5378e(nVar != C12926n.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C12929o(nVar, C12537b1.f59407f);
    }

    /* renamed from: b */
    public static C12929o m84946b(C12537b1 b1Var) {
        Preconditions.m5378e(!b1Var.mo69064o(), "The error status must not be OK");
        return new C12929o(C12926n.TRANSIENT_FAILURE, b1Var);
    }

    /* renamed from: c */
    public C12926n mo69706c() {
        return this.f60484a;
    }

    /* renamed from: d */
    public C12537b1 mo69707d() {
        return this.f60485b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12929o)) {
            return false;
        }
        C12929o oVar = (C12929o) obj;
        if (!this.f60484a.equals(oVar.f60484a) || !this.f60485b.equals(oVar.f60485b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f60484a.hashCode() ^ this.f60485b.hashCode();
    }

    public String toString() {
        if (this.f60485b.mo69064o()) {
            return this.f60484a.toString();
        }
        return this.f60484a + "(" + this.f60485b + ")";
    }
}

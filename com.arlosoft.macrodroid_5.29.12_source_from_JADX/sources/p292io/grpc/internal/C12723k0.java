package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import p292io.grpc.C12981s0;

/* renamed from: io.grpc.internal.k0 */
/* compiled from: ForwardingNameResolver */
abstract class C12723k0 extends C12981s0 {

    /* renamed from: a */
    private final C12981s0 f59968a;

    C12723k0(C12981s0 s0Var) {
        Preconditions.m5393t(s0Var, "delegate can not be null");
        this.f59968a = s0Var;
    }

    /* renamed from: b */
    public void mo69219b() {
        this.f59968a.mo69219b();
    }

    /* renamed from: c */
    public void mo69220c() {
        this.f59968a.mo69220c();
    }

    /* renamed from: d */
    public void mo69221d(C12981s0.C12990f fVar) {
        this.f59968a.mo69221d(fVar);
    }

    @Deprecated
    /* renamed from: e */
    public void mo69448e(C12981s0.C12991g gVar) {
        this.f59968a.mo69448e(gVar);
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("delegate", this.f59968a).toString();
    }
}

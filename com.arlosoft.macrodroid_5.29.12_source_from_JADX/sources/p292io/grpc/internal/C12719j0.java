package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import java.util.concurrent.TimeUnit;
import p292io.grpc.C12542c;
import p292io.grpc.C12558f;
import p292io.grpc.C12926n;
import p292io.grpc.C12930o0;
import p292io.grpc.C12972r0;

/* renamed from: io.grpc.internal.j0 */
/* compiled from: ForwardingManagedChannel */
abstract class C12719j0 extends C12930o0 {

    /* renamed from: a */
    private final C12930o0 f59958a;

    C12719j0(C12930o0 o0Var) {
        this.f59958a = o0Var;
    }

    /* renamed from: a */
    public String mo69114a() {
        return this.f59958a.mo69114a();
    }

    /* renamed from: h */
    public <RequestT, ResponseT> C12558f<RequestT, ResponseT> mo69115h(C12972r0<RequestT, ResponseT> r0Var, C12542c cVar) {
        return this.f59958a.mo69115h(r0Var, cVar);
    }

    /* renamed from: i */
    public boolean mo69269i(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f59958a.mo69269i(j, timeUnit);
    }

    /* renamed from: j */
    public void mo69270j() {
        this.f59958a.mo69270j();
    }

    /* renamed from: k */
    public C12926n mo69271k(boolean z) {
        return this.f59958a.mo69271k(z);
    }

    /* renamed from: l */
    public void mo69272l(C12926n nVar, Runnable runnable) {
        this.f59958a.mo69272l(nVar, runnable);
    }

    /* renamed from: m */
    public void mo69273m() {
        this.f59958a.mo69273m();
    }

    /* renamed from: n */
    public C12930o0 mo69274n() {
        return this.f59958a.mo69274n();
    }

    /* renamed from: o */
    public C12930o0 mo69275o() {
        return this.f59958a.mo69275o();
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("delegate", this.f59958a).toString();
    }
}

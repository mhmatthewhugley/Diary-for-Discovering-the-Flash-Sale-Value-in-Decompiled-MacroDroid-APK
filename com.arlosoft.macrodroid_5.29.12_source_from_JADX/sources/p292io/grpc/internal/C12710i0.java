package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import java.util.concurrent.Executor;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12560f0;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.internal.C12688g1;
import p292io.grpc.internal.C12793s;

/* renamed from: io.grpc.internal.i0 */
/* compiled from: ForwardingConnectionClientTransport */
abstract class C12710i0 implements C12812v {
    C12710i0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C12812v mo69433a();

    /* renamed from: b */
    public void mo69405b(C12537b1 b1Var) {
        mo69433a().mo69405b(b1Var);
    }

    /* renamed from: c */
    public C12560f0 mo69268c() {
        return mo69433a().mo69268c();
    }

    /* renamed from: d */
    public void mo69434d(C12793s.C12794a aVar, Executor executor) {
        mo69433a().mo69434d(aVar, executor);
    }

    /* renamed from: e */
    public void mo69406e(C12537b1 b1Var) {
        mo69433a().mo69406e(b1Var);
    }

    /* renamed from: f */
    public Runnable mo69407f(C12688g1.C12689a aVar) {
        return mo69433a().mo69407f(aVar);
    }

    /* renamed from: g */
    public C12781q mo69389g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
        return mo69433a().mo69389g(r0Var, q0Var, cVar);
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("delegate", mo69433a()).toString();
    }
}

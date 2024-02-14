package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import p292io.grpc.C12537b1;
import p292io.grpc.C12960q0;
import p292io.grpc.internal.C12690g2;
import p292io.grpc.internal.C12785r;

/* renamed from: io.grpc.internal.h0 */
/* compiled from: ForwardingClientStreamListener */
abstract class C12693h0 implements C12785r {
    C12693h0() {
    }

    /* renamed from: a */
    public void mo69194a(C12690g2.C12691a aVar) {
        mo69408e().mo69194a(aVar);
    }

    /* renamed from: b */
    public void mo69195b(C12537b1 b1Var, C12960q0 q0Var) {
        mo69408e().mo69195b(b1Var, q0Var);
    }

    /* renamed from: c */
    public void mo69196c(C12960q0 q0Var) {
        mo69408e().mo69196c(q0Var);
    }

    /* renamed from: d */
    public void mo69197d(C12537b1 b1Var, C12785r.C12786a aVar, C12960q0 q0Var) {
        mo69408e().mo69197d(b1Var, aVar, q0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C12785r mo69408e();

    public void onReady() {
        mo69408e().onReady();
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("delegate", mo69408e()).toString();
    }
}

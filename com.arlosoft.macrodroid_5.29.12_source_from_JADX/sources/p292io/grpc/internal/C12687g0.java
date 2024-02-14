package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import java.io.InputStream;
import p292io.grpc.C12537b1;
import p292io.grpc.C12909l;
import p292io.grpc.C12977s;
import p292io.grpc.C12997u;

/* renamed from: io.grpc.internal.g0 */
/* compiled from: ForwardingClientStream */
abstract class C12687g0 implements C12781q {
    C12687g0() {
    }

    /* renamed from: a */
    public void mo69176a(C12909l lVar) {
        mo69403n().mo69176a(lVar);
    }

    /* renamed from: b */
    public void mo69138b(int i) {
        mo69403n().mo69138b(i);
    }

    /* renamed from: c */
    public void mo69139c(int i) {
        mo69403n().mo69139c(i);
    }

    /* renamed from: d */
    public void mo69140d(int i) {
        mo69403n().mo69140d(i);
    }

    /* renamed from: e */
    public void mo69141e(C12537b1 b1Var) {
        mo69403n().mo69141e(b1Var);
    }

    /* renamed from: f */
    public void mo69142f(C12997u uVar) {
        mo69403n().mo69142f(uVar);
    }

    public void flush() {
        mo69403n().flush();
    }

    /* renamed from: g */
    public void mo69178g(InputStream inputStream) {
        mo69403n().mo69178g(inputStream);
    }

    /* renamed from: h */
    public void mo69143h(boolean z) {
        mo69403n().mo69143h(z);
    }

    /* renamed from: i */
    public void mo69179i(String str) {
        mo69403n().mo69179i(str);
    }

    /* renamed from: j */
    public void mo69144j(C12810u0 u0Var) {
        mo69403n().mo69144j(u0Var);
    }

    /* renamed from: k */
    public void mo69145k() {
        mo69403n().mo69145k();
    }

    /* renamed from: l */
    public void mo69146l(C12977s sVar) {
        mo69403n().mo69146l(sVar);
    }

    /* renamed from: m */
    public void mo69147m(C12785r rVar) {
        mo69403n().mo69147m(rVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C12781q mo69403n();

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("delegate", mo69403n()).toString();
    }
}

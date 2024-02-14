package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p292io.grpc.C12520a;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12547c1;
import p292io.grpc.C12900j;
import p292io.grpc.C12960q0;

/* renamed from: io.grpc.internal.e2 */
/* compiled from: StatsTraceContext */
public final class C12669e2 {

    /* renamed from: c */
    public static final C12669e2 f59859c = new C12669e2(new C12547c1[0]);

    /* renamed from: a */
    private final C12547c1[] f59860a;

    /* renamed from: b */
    private final AtomicBoolean f59861b = new AtomicBoolean(false);

    @VisibleForTesting
    C12669e2(C12547c1[] c1VarArr) {
        this.f59860a = c1VarArr;
    }

    /* renamed from: h */
    public static C12669e2 m84120h(C12542c cVar, C12520a aVar, C12960q0 q0Var) {
        List<C12900j.C12901a> i = cVar.mo69084i();
        if (i.isEmpty()) {
            return f59859c;
        }
        C12900j.C12902b a = C12900j.C12902b.m84868b().mo69667c(aVar).mo69666b(cVar).mo69665a();
        int size = i.size();
        C12547c1[] c1VarArr = new C12547c1[size];
        for (int i2 = 0; i2 < size; i2++) {
            c1VarArr[i2] = i.get(i2).mo69608b(a, q0Var);
        }
        return new C12669e2(c1VarArr);
    }

    /* renamed from: a */
    public void mo69359a() {
        for (C12547c1 c1Var : this.f59860a) {
            ((C12900j) c1Var).mo69659j();
        }
    }

    /* renamed from: b */
    public void mo69360b(C12960q0 q0Var) {
        for (C12547c1 c1Var : this.f59860a) {
            ((C12900j) c1Var).mo69660k(q0Var);
        }
    }

    /* renamed from: c */
    public void mo69361c() {
        for (C12547c1 c1Var : this.f59860a) {
            ((C12900j) c1Var).mo69661l();
        }
    }

    /* renamed from: d */
    public void mo69362d(int i) {
        for (C12547c1 a : this.f59860a) {
            a.mo69105a(i);
        }
    }

    /* renamed from: e */
    public void mo69363e(int i, long j, long j2) {
        for (C12547c1 b : this.f59860a) {
            b.mo69106b(i, j, j2);
        }
    }

    /* renamed from: f */
    public void mo69364f(long j) {
        for (C12547c1 c : this.f59860a) {
            c.mo69107c(j);
        }
    }

    /* renamed from: g */
    public void mo69365g(long j) {
        for (C12547c1 d : this.f59860a) {
            d.mo69108d(j);
        }
    }

    /* renamed from: i */
    public void mo69366i(int i) {
        for (C12547c1 e : this.f59860a) {
            e.mo69109e(i);
        }
    }

    /* renamed from: j */
    public void mo69367j(int i, long j, long j2) {
        for (C12547c1 f : this.f59860a) {
            f.mo69110f(i, j, j2);
        }
    }

    /* renamed from: k */
    public void mo69368k(long j) {
        for (C12547c1 g : this.f59860a) {
            g.mo69111g(j);
        }
    }

    /* renamed from: l */
    public void mo69369l(long j) {
        for (C12547c1 h : this.f59860a) {
            h.mo69112h(j);
        }
    }

    /* renamed from: m */
    public void mo69370m(C12537b1 b1Var) {
        if (this.f59861b.compareAndSet(false, true)) {
            for (C12547c1 i : this.f59860a) {
                i.mo69113i(b1Var);
            }
        }
    }
}

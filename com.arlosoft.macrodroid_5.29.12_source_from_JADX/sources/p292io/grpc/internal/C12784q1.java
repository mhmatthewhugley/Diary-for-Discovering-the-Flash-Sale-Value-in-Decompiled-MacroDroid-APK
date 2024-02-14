package p292io.grpc.internal;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import p292io.grpc.C12542c;
import p292io.grpc.C12910l0;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;

/* renamed from: io.grpc.internal.q1 */
/* compiled from: PickSubchannelArgsImpl */
final class C12784q1 extends C12910l0.C12917f {

    /* renamed from: a */
    private final C12542c f60158a;

    /* renamed from: b */
    private final C12960q0 f60159b;

    /* renamed from: c */
    private final C12972r0<?, ?> f60160c;

    C12784q1(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar) {
        this.f60160c = (C12972r0) Preconditions.m5393t(r0Var, "method");
        this.f60159b = (C12960q0) Preconditions.m5393t(q0Var, "headers");
        this.f60158a = (C12542c) Preconditions.m5393t(cVar, "callOptions");
    }

    /* renamed from: a */
    public C12542c mo69524a() {
        return this.f60158a;
    }

    /* renamed from: b */
    public C12960q0 mo69525b() {
        return this.f60159b;
    }

    /* renamed from: c */
    public C12972r0<?, ?> mo69526c() {
        return this.f60160c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12784q1.class != obj.getClass()) {
            return false;
        }
        C12784q1 q1Var = (C12784q1) obj;
        if (!Objects.m5349a(this.f60158a, q1Var.f60158a) || !Objects.m5349a(this.f60159b, q1Var.f60159b) || !Objects.m5349a(this.f60160c, q1Var.f60160c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m5350b(this.f60158a, this.f60159b, this.f60160c);
    }

    public final String toString() {
        return "[method=" + this.f60160c + " headers=" + this.f60159b + " callOptions=" + this.f60158a + "]";
    }
}

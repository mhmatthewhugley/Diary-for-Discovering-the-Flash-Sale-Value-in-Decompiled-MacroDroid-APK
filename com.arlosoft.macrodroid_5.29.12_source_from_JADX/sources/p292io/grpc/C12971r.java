package p292io.grpc;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeoutException;
import p292io.grpc.C12537b1;

/* renamed from: io.grpc.r */
/* compiled from: Contexts */
public final class C12971r {
    /* renamed from: a */
    public static C12537b1 m85111a(C12952q qVar) {
        Preconditions.m5393t(qVar, "context must not be null");
        if (!qVar.mo69753o()) {
            return null;
        }
        Throwable g = qVar.mo69750g();
        if (g == null) {
            return C12537b1.f59408g.mo69066q("io.grpc.Context was cancelled without error");
        }
        if (g instanceof TimeoutException) {
            return C12537b1.f59411j.mo69066q(g.getMessage()).mo69065p(g);
        }
        C12537b1 k = C12537b1.m83686k(g);
        if (!C12537b1.C12539b.UNKNOWN.equals(k.mo69062m()) || k.mo69061l() != g) {
            return k.mo69065p(g);
        }
        return C12537b1.f59408g.mo69066q("Context cancelled").mo69065p(g);
    }
}

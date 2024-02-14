package p292io.grpc.internal;

import p292io.grpc.C12537b1;
import p292io.grpc.C12960q0;

/* renamed from: io.grpc.internal.r */
/* compiled from: ClientStreamListener */
public interface C12785r extends C12690g2 {

    /* renamed from: io.grpc.internal.r$a */
    /* compiled from: ClientStreamListener */
    public enum C12786a {
        PROCESSED,
        REFUSED,
        DROPPED
    }

    /* renamed from: b */
    void mo69195b(C12537b1 b1Var, C12960q0 q0Var);

    /* renamed from: c */
    void mo69196c(C12960q0 q0Var);

    /* renamed from: d */
    void mo69197d(C12537b1 b1Var, C12786a aVar, C12960q0 q0Var);
}

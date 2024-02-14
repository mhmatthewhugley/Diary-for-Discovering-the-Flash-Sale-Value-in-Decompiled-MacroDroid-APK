package p292io.grpc.internal;

import java.util.concurrent.Executor;
import p292io.grpc.C12542c;
import p292io.grpc.C12556e0;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;

/* renamed from: io.grpc.internal.s */
/* compiled from: ClientTransport */
public interface C12793s extends C12556e0<Object> {

    /* renamed from: io.grpc.internal.s$a */
    /* compiled from: ClientTransport */
    public interface C12794a {
        /* renamed from: a */
        void mo69538a(Throwable th);

        /* renamed from: b */
        void mo69539b(long j);
    }

    /* renamed from: d */
    void mo69434d(C12794a aVar, Executor executor);

    /* renamed from: g */
    C12781q mo69389g(C12972r0<?, ?> r0Var, C12960q0 q0Var, C12542c cVar);
}

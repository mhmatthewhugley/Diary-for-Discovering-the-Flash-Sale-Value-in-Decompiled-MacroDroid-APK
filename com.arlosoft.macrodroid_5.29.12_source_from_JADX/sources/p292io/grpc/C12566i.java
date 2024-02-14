package p292io.grpc;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.List;
import p292io.grpc.C12558f;

/* renamed from: io.grpc.i */
/* compiled from: ClientInterceptors */
public class C12566i {

    /* renamed from: a */
    private static final C12558f<Object, Object> f59501a = new C12567a();

    /* renamed from: io.grpc.i$a */
    /* compiled from: ClientInterceptors */
    class C12567a extends C12558f<Object, Object> {
        C12567a() {
        }

        /* renamed from: a */
        public void mo63035a() {
        }

        /* renamed from: b */
        public void mo69131b(int i) {
        }

        /* renamed from: c */
        public void mo69132c(Object obj) {
        }

        /* renamed from: d */
        public void mo69133d(C12558f.C12559a<Object> aVar, C12960q0 q0Var) {
        }
    }

    /* renamed from: io.grpc.i$b */
    /* compiled from: ClientInterceptors */
    private static class C12568b extends C12548d {

        /* renamed from: a */
        private final C12548d f59502a;

        /* renamed from: b */
        private final C12561g f59503b;

        /* synthetic */ C12568b(C12548d dVar, C12561g gVar, C12564h hVar) {
            this(dVar, gVar);
        }

        /* renamed from: a */
        public String mo69114a() {
            return this.f59502a.mo69114a();
        }

        /* renamed from: h */
        public <ReqT, RespT> C12558f<ReqT, RespT> mo69115h(C12972r0<ReqT, RespT> r0Var, C12542c cVar) {
            return this.f59503b.mo69137a(r0Var, cVar, this.f59502a);
        }

        private C12568b(C12548d dVar, C12561g gVar) {
            this.f59502a = dVar;
            this.f59503b = (C12561g) Preconditions.m5393t(gVar, "interceptor");
        }
    }

    /* renamed from: a */
    public static C12548d m83780a(C12548d dVar, List<? extends C12561g> list) {
        Preconditions.m5393t(dVar, "channel");
        for (C12561g bVar : list) {
            dVar = new C12568b(dVar, bVar, (C12564h) null);
        }
        return dVar;
    }

    /* renamed from: b */
    public static C12548d m83781b(C12548d dVar, C12561g... gVarArr) {
        return m83780a(dVar, Arrays.asList(gVarArr));
    }
}

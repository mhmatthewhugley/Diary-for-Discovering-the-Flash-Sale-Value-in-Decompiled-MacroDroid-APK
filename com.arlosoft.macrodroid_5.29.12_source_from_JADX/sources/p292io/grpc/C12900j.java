package p292io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* renamed from: io.grpc.j */
/* compiled from: ClientStreamTracer */
public abstract class C12900j extends C12547c1 {

    /* renamed from: io.grpc.j$a */
    /* compiled from: ClientStreamTracer */
    public static abstract class C12901a {
        @Deprecated
        /* renamed from: a */
        public C12900j mo69662a(C12542c cVar, C12960q0 q0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: b */
        public C12900j mo69608b(C12902b bVar, C12960q0 q0Var) {
            return mo69662a(bVar.mo69663a(), q0Var);
        }
    }

    /* renamed from: io.grpc.j$b */
    /* compiled from: ClientStreamTracer */
    public static final class C12902b {

        /* renamed from: a */
        private final C12520a f60447a;

        /* renamed from: b */
        private final C12542c f60448b;

        /* renamed from: io.grpc.j$b$a */
        /* compiled from: ClientStreamTracer */
        public static final class C12903a {

            /* renamed from: a */
            private C12520a f60449a = C12520a.f59384b;

            /* renamed from: b */
            private C12542c f60450b = C12542c.f59449k;

            C12903a() {
            }

            /* renamed from: a */
            public C12902b mo69665a() {
                return new C12902b(this.f60449a, this.f60450b);
            }

            /* renamed from: b */
            public C12903a mo69666b(C12542c cVar) {
                this.f60450b = (C12542c) Preconditions.m5393t(cVar, "callOptions cannot be null");
                return this;
            }

            /* renamed from: c */
            public C12903a mo69667c(C12520a aVar) {
                this.f60449a = (C12520a) Preconditions.m5393t(aVar, "transportAttrs cannot be null");
                return this;
            }
        }

        C12902b(C12520a aVar, C12542c cVar) {
            this.f60447a = (C12520a) Preconditions.m5393t(aVar, "transportAttrs");
            this.f60448b = (C12542c) Preconditions.m5393t(cVar, "callOptions");
        }

        /* renamed from: b */
        public static C12903a m84868b() {
            return new C12903a();
        }

        /* renamed from: a */
        public C12542c mo69663a() {
            return this.f60448b;
        }

        public String toString() {
            return MoreObjects.m5334c(this).mo22194d("transportAttrs", this.f60447a).mo22194d("callOptions", this.f60448b).toString();
        }
    }

    /* renamed from: j */
    public void mo69659j() {
    }

    /* renamed from: k */
    public void mo69660k(C12960q0 q0Var) {
    }

    /* renamed from: l */
    public void mo69661l() {
    }
}

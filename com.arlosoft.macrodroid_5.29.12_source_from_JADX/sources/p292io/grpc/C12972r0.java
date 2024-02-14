package p292io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.grpc.r0 */
/* compiled from: MethodDescriptor */
public final class C12972r0<ReqT, RespT> {

    /* renamed from: a */
    private final C12976d f60680a;

    /* renamed from: b */
    private final String f60681b;

    /* renamed from: c */
    private final String f60682c;

    /* renamed from: d */
    private final C12975c<ReqT> f60683d;

    /* renamed from: e */
    private final C12975c<RespT> f60684e;

    /* renamed from: f */
    private final Object f60685f;

    /* renamed from: g */
    private final boolean f60686g;

    /* renamed from: h */
    private final boolean f60687h;

    /* renamed from: i */
    private final boolean f60688i;

    /* renamed from: j */
    private final AtomicReferenceArray<Object> f60689j;

    /* renamed from: io.grpc.r0$b */
    /* compiled from: MethodDescriptor */
    public static final class C12974b<ReqT, RespT> {

        /* renamed from: a */
        private C12975c<ReqT> f60690a;

        /* renamed from: b */
        private C12975c<RespT> f60691b;

        /* renamed from: c */
        private C12976d f60692c;

        /* renamed from: d */
        private String f60693d;

        /* renamed from: e */
        private boolean f60694e;

        /* renamed from: f */
        private boolean f60695f;

        /* renamed from: g */
        private Object f60696g;

        /* renamed from: h */
        private boolean f60697h;

        private C12974b() {
        }

        /* renamed from: a */
        public C12972r0<ReqT, RespT> mo69794a() {
            return new C12972r0(this.f60692c, this.f60693d, this.f60690a, this.f60691b, this.f60696g, this.f60694e, this.f60695f, this.f60697h);
        }

        /* renamed from: b */
        public C12974b<ReqT, RespT> mo69795b(String str) {
            this.f60693d = str;
            return this;
        }

        /* renamed from: c */
        public C12974b<ReqT, RespT> mo69796c(C12975c<ReqT> cVar) {
            this.f60690a = cVar;
            return this;
        }

        /* renamed from: d */
        public C12974b<ReqT, RespT> mo69797d(C12975c<RespT> cVar) {
            this.f60691b = cVar;
            return this;
        }

        /* renamed from: e */
        public C12974b<ReqT, RespT> mo69798e(boolean z) {
            this.f60697h = z;
            return this;
        }

        /* renamed from: f */
        public C12974b<ReqT, RespT> mo69799f(C12976d dVar) {
            this.f60692c = dVar;
            return this;
        }
    }

    /* renamed from: io.grpc.r0$c */
    /* compiled from: MethodDescriptor */
    public interface C12975c<T> {
        /* renamed from: a */
        InputStream mo69800a(T t);

        /* renamed from: b */
        T mo69801b(InputStream inputStream);
    }

    /* renamed from: io.grpc.r0$d */
    /* compiled from: MethodDescriptor */
    public enum C12976d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        /* renamed from: b */
        public final boolean mo69802b() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    /* renamed from: a */
    public static String m85112a(String str) {
        int lastIndexOf = ((String) Preconditions.m5393t(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    public static String m85113b(String str, String str2) {
        return ((String) Preconditions.m5393t(str, "fullServiceName")) + "/" + ((String) Preconditions.m5393t(str2, "methodName"));
    }

    /* renamed from: g */
    public static <ReqT, RespT> C12974b<ReqT, RespT> m85114g() {
        return m85115h((C12975c) null, (C12975c) null);
    }

    /* renamed from: h */
    public static <ReqT, RespT> C12974b<ReqT, RespT> m85115h(C12975c<ReqT> cVar, C12975c<RespT> cVar2) {
        return new C12974b().mo69796c(cVar).mo69797d(cVar2);
    }

    /* renamed from: c */
    public String mo69787c() {
        return this.f60681b;
    }

    /* renamed from: d */
    public String mo69788d() {
        return this.f60682c;
    }

    /* renamed from: e */
    public C12976d mo69789e() {
        return this.f60680a;
    }

    /* renamed from: f */
    public boolean mo69790f() {
        return this.f60687h;
    }

    /* renamed from: i */
    public RespT mo69791i(InputStream inputStream) {
        return this.f60684e.mo69801b(inputStream);
    }

    /* renamed from: j */
    public InputStream mo69792j(ReqT reqt) {
        return this.f60683d.mo69800a(reqt);
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("fullMethodName", this.f60681b).mo22194d("type", this.f60680a).mo22195e("idempotent", this.f60686g).mo22195e("safe", this.f60687h).mo22195e("sampledToLocalTracing", this.f60688i).mo22194d("requestMarshaller", this.f60683d).mo22194d("responseMarshaller", this.f60684e).mo22194d("schemaDescriptor", this.f60685f).mo22197m().toString();
    }

    private C12972r0(C12976d dVar, String str, C12975c<ReqT> cVar, C12975c<RespT> cVar2, Object obj, boolean z, boolean z2, boolean z3) {
        this.f60689j = new AtomicReferenceArray<>(2);
        this.f60680a = (C12976d) Preconditions.m5393t(dVar, "type");
        this.f60681b = (String) Preconditions.m5393t(str, "fullMethodName");
        this.f60682c = m85112a(str);
        this.f60683d = (C12975c) Preconditions.m5393t(cVar, "requestMarshaller");
        this.f60684e = (C12975c) Preconditions.m5393t(cVar2, "responseMarshaller");
        this.f60685f = obj;
        this.f60686g = z;
        this.f60687h = z2;
        this.f60688i = z3;
    }
}

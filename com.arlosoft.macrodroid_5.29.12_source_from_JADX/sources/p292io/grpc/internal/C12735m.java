package p292io.grpc.internal;

/* renamed from: io.grpc.internal.m */
/* compiled from: CallTracer */
final class C12735m {

    /* renamed from: f */
    static final C12737b f59992f = new C12736a();

    /* renamed from: a */
    private final C12700h2 f59993a;

    /* renamed from: b */
    private final C12611b1 f59994b = C12616c1.m83937a();

    /* renamed from: c */
    private final C12611b1 f59995c = C12616c1.m83937a();

    /* renamed from: d */
    private final C12611b1 f59996d = C12616c1.m83937a();

    /* renamed from: e */
    private volatile long f59997e;

    /* renamed from: io.grpc.internal.m$a */
    /* compiled from: CallTracer */
    class C12736a implements C12737b {
        C12736a() {
        }

        public C12735m create() {
            return new C12735m(C12700h2.f59928a);
        }
    }

    /* renamed from: io.grpc.internal.m$b */
    /* compiled from: CallTracer */
    public interface C12737b {
        C12735m create();
    }

    C12735m(C12700h2 h2Var) {
        this.f59993a = h2Var;
    }

    /* renamed from: a */
    public void mo69470a(boolean z) {
        if (z) {
            this.f59995c.mo69232a(1);
        } else {
            this.f59996d.mo69232a(1);
        }
    }

    /* renamed from: b */
    public void mo69471b() {
        this.f59994b.mo69232a(1);
        this.f59997e = this.f59993a.mo69418a();
    }
}

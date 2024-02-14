package p292io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

/* renamed from: io.grpc.internal.k2 */
/* compiled from: TransportTracer */
public final class C12725k2 {

    /* renamed from: l */
    private static final C12727b f59970l = new C12727b(C12700h2.f59928a);

    /* renamed from: a */
    private final C12700h2 f59971a;

    /* renamed from: b */
    private long f59972b;

    /* renamed from: c */
    private long f59973c;

    /* renamed from: d */
    private long f59974d;

    /* renamed from: e */
    private long f59975e;

    /* renamed from: f */
    private long f59976f;

    /* renamed from: g */
    private C12728c f59977g;

    /* renamed from: h */
    private long f59978h;

    /* renamed from: i */
    private long f59979i;

    /* renamed from: j */
    private final C12611b1 f59980j;

    /* renamed from: k */
    private volatile long f59981k;

    /* renamed from: io.grpc.internal.k2$b */
    /* compiled from: TransportTracer */
    public static final class C12727b {

        /* renamed from: a */
        private final C12700h2 f59982a;

        @VisibleForTesting
        public C12727b(C12700h2 h2Var) {
            this.f59982a = h2Var;
        }

        /* renamed from: a */
        public C12725k2 mo69456a() {
            return new C12725k2(this.f59982a);
        }
    }

    /* renamed from: io.grpc.internal.k2$c */
    /* compiled from: TransportTracer */
    public interface C12728c {
    }

    /* renamed from: a */
    public static C12727b m84304a() {
        return f59970l;
    }

    /* renamed from: b */
    public void mo69450b() {
        this.f59976f++;
    }

    /* renamed from: c */
    public void mo69451c() {
        this.f59972b++;
        this.f59973c = this.f59971a.mo69418a();
    }

    /* renamed from: d */
    public void mo69452d() {
        this.f59980j.mo69232a(1);
        this.f59981k = this.f59971a.mo69418a();
    }

    /* renamed from: e */
    public void mo69453e(int i) {
        if (i != 0) {
            this.f59978h += (long) i;
            this.f59979i = this.f59971a.mo69418a();
        }
    }

    /* renamed from: f */
    public void mo69454f(boolean z) {
        if (z) {
            this.f59974d++;
        } else {
            this.f59975e++;
        }
    }

    /* renamed from: g */
    public void mo69455g(C12728c cVar) {
        this.f59977g = (C12728c) Preconditions.m5392s(cVar);
    }

    public C12725k2() {
        this.f59980j = C12616c1.m83937a();
        this.f59971a = C12700h2.f59928a;
    }

    private C12725k2(C12700h2 h2Var) {
        this.f59980j = C12616c1.m83937a();
        this.f59971a = h2Var;
    }
}

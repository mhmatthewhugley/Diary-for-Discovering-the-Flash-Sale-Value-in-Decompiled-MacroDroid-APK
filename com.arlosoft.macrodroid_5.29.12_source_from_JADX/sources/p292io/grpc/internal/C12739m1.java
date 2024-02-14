package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p292io.grpc.C12537b1;
import p292io.grpc.C12542c;
import p292io.grpc.C12556e0;
import p292io.grpc.C12558f;
import p292io.grpc.C12560f0;
import p292io.grpc.C12926n;
import p292io.grpc.C12930o0;
import p292io.grpc.C12972r0;
import p292io.grpc.internal.C12764p;

/* renamed from: io.grpc.internal.m1 */
/* compiled from: OobChannel */
final class C12739m1 extends C12930o0 implements C12556e0<Object> {

    /* renamed from: k */
    private static final Logger f59998k = Logger.getLogger(C12739m1.class.getName());

    /* renamed from: a */
    private C12813v0 f59999a;

    /* renamed from: b */
    private final C12560f0 f60000b;

    /* renamed from: c */
    private final String f60001c;

    /* renamed from: d */
    private final C12881z f60002d;

    /* renamed from: e */
    private final Executor f60003e;

    /* renamed from: f */
    private final ScheduledExecutorService f60004f;

    /* renamed from: g */
    private final CountDownLatch f60005g;

    /* renamed from: h */
    private volatile boolean f60006h;

    /* renamed from: i */
    private final C12735m f60007i;

    /* renamed from: j */
    private final C12764p.C12774f f60008j;

    /* renamed from: a */
    public String mo69114a() {
        return this.f60001c;
    }

    /* renamed from: c */
    public C12560f0 mo69268c() {
        return this.f60000b;
    }

    /* renamed from: h */
    public <RequestT, ResponseT> C12558f<RequestT, ResponseT> mo69115h(C12972r0<RequestT, ResponseT> r0Var, C12542c cVar) {
        return new C12764p(r0Var, cVar.mo69080e() == null ? this.f60003e : cVar.mo69080e(), cVar, this.f60008j, this.f60004f, this.f60007i, false);
    }

    /* renamed from: i */
    public boolean mo69269i(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f60005g.await(j, timeUnit);
    }

    /* renamed from: k */
    public C12926n mo69271k(boolean z) {
        C12813v0 v0Var = this.f59999a;
        if (v0Var == null) {
            return C12926n.IDLE;
        }
        return v0Var.mo69572I();
    }

    /* renamed from: m */
    public void mo69273m() {
        this.f59999a.mo69573O();
    }

    /* renamed from: n */
    public C12930o0 mo69274n() {
        this.f60006h = true;
        this.f60002d.mo69406e(C12537b1.f59422u.mo69066q("OobChannel.shutdown() called"));
        return this;
    }

    /* renamed from: o */
    public C12930o0 mo69275o() {
        this.f60006h = true;
        this.f60002d.mo69405b(C12537b1.f59422u.mo69066q("OobChannel.shutdownNow() called"));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C12813v0 mo69472p() {
        return this.f59999a;
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22193c("logId", this.f60000b.mo69134d()).mo22194d("authority", this.f60001c).toString();
    }
}

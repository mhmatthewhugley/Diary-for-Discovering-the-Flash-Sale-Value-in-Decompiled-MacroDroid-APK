package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p292io.grpc.C12537b1;
import p292io.grpc.C12910l0;
import p292io.grpc.C12926n;
import p292io.grpc.C12929o;
import p292io.grpc.C13005w;

/* renamed from: io.grpc.internal.o1 */
/* compiled from: PickFirstLoadBalancer */
final class C12758o1 extends C12910l0 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12910l0.C12915d f60066b;

    /* renamed from: c */
    private C12910l0.C12920h f60067c;

    /* renamed from: io.grpc.internal.o1$a */
    /* compiled from: PickFirstLoadBalancer */
    class C12759a implements C12910l0.C12922j {

        /* renamed from: a */
        final /* synthetic */ C12910l0.C12920h f60068a;

        C12759a(C12910l0.C12920h hVar) {
            this.f60068a = hVar;
        }

        /* renamed from: a */
        public void mo69497a(C12929o oVar) {
            C12758o1.this.m84395h(this.f60068a, oVar);
        }
    }

    /* renamed from: io.grpc.internal.o1$b */
    /* compiled from: PickFirstLoadBalancer */
    static /* synthetic */ class C12760b {

        /* renamed from: a */
        static final /* synthetic */ int[] f60070a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.grpc.n[] r0 = p292io.grpc.C12926n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60070a = r0
                io.grpc.n r1 = p292io.grpc.C12926n.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60070a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.n r1 = p292io.grpc.C12926n.CONNECTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60070a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.grpc.n r1 = p292io.grpc.C12926n.READY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f60070a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.grpc.n r1 = p292io.grpc.C12926n.TRANSIENT_FAILURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12758o1.C12760b.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.o1$c */
    /* compiled from: PickFirstLoadBalancer */
    private static final class C12761c extends C12910l0.C12921i {

        /* renamed from: a */
        private final C12910l0.C12916e f60071a;

        C12761c(C12910l0.C12916e eVar) {
            this.f60071a = (C12910l0.C12916e) Preconditions.m5393t(eVar, "result");
        }

        /* renamed from: a */
        public C12910l0.C12916e mo69281a(C12910l0.C12917f fVar) {
            return this.f60071a;
        }

        public String toString() {
            return MoreObjects.m5333b(C12761c.class).mo22194d("result", this.f60071a).toString();
        }
    }

    /* renamed from: io.grpc.internal.o1$d */
    /* compiled from: PickFirstLoadBalancer */
    private final class C12762d extends C12910l0.C12921i {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12910l0.C12920h f60072a;

        /* renamed from: b */
        private final AtomicBoolean f60073b = new AtomicBoolean(false);

        /* renamed from: io.grpc.internal.o1$d$a */
        /* compiled from: PickFirstLoadBalancer */
        class C12763a implements Runnable {
            C12763a() {
            }

            public void run() {
                C12762d.this.f60072a.mo69339e();
            }
        }

        C12762d(C12910l0.C12920h hVar) {
            this.f60072a = (C12910l0.C12920h) Preconditions.m5393t(hVar, "subchannel");
        }

        /* renamed from: a */
        public C12910l0.C12916e mo69281a(C12910l0.C12917f fVar) {
            if (this.f60073b.compareAndSet(false, true)) {
                C12758o1.this.f60066b.mo69307c().execute(new C12763a());
            }
            return C12910l0.C12916e.m84901g();
        }
    }

    C12758o1(C12910l0.C12915d dVar) {
        this.f60066b = (C12910l0.C12915d) Preconditions.m5393t(dVar, "helper");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m84395h(C12910l0.C12920h hVar, C12929o oVar) {
        C12910l0.C12921i iVar;
        C12910l0.C12921i iVar2;
        C12926n c = oVar.mo69706c();
        if (c != C12926n.SHUTDOWN) {
            int i = C12760b.f60070a[c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    iVar = new C12761c(C12910l0.C12916e.m84901g());
                } else if (i == 3) {
                    iVar2 = new C12761c(C12910l0.C12916e.m84902h(hVar));
                } else if (i == 4) {
                    iVar = new C12761c(C12910l0.C12916e.m84900f(oVar.mo69707d()));
                } else {
                    throw new IllegalArgumentException("Unsupported state:" + c);
                }
                this.f60066b.mo69308d(c, iVar);
            }
            iVar2 = new C12762d(hVar);
            iVar = iVar2;
            this.f60066b.mo69308d(c, iVar);
        }
    }

    /* renamed from: b */
    public void mo69427b(C12537b1 b1Var) {
        C12910l0.C12920h hVar = this.f60067c;
        if (hVar != null) {
            hVar.mo69340f();
            this.f60067c = null;
        }
        this.f60066b.mo69308d(C12926n.TRANSIENT_FAILURE, new C12761c(C12910l0.C12916e.m84900f(b1Var)));
    }

    /* renamed from: c */
    public void mo69428c(C12910l0.C12918g gVar) {
        List<C13005w> a = gVar.mo69686a();
        C12910l0.C12920h hVar = this.f60067c;
        if (hVar == null) {
            C12910l0.C12920h a2 = this.f60066b.mo69305a(C12910l0.C12912b.m84887c().mo69677c(a).mo69675a());
            a2.mo69341g(new C12759a(a2));
            this.f60067c = a2;
            this.f60066b.mo69308d(C12926n.CONNECTING, new C12761c(C12910l0.C12916e.m84902h(a2)));
            a2.mo69339e();
            return;
        }
        hVar.mo69342h(a);
    }

    /* renamed from: d */
    public void mo69496d() {
        C12910l0.C12920h hVar = this.f60067c;
        if (hVar != null) {
            hVar.mo69339e();
        }
    }

    /* renamed from: e */
    public void mo69429e() {
        C12910l0.C12920h hVar = this.f60067c;
        if (hVar != null) {
            hVar.mo69340f();
        }
    }
}

package p292io.grpc.internal;

import androidx.core.app.NotificationManagerCompat;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p292io.grpc.C12537b1;
import p292io.grpc.C12900j;
import p292io.grpc.C12909l;
import p292io.grpc.C12960q0;
import p292io.grpc.C12972r0;
import p292io.grpc.C12977s;
import p292io.grpc.C12997u;
import p292io.grpc.internal.C12690g2;
import p292io.grpc.internal.C12782q0;
import p292io.grpc.internal.C12785r;
import p292io.grpc.internal.C12876x1;

/* renamed from: io.grpc.internal.w1 */
/* compiled from: RetriableStream */
abstract class C12844w1<ReqT> implements C12781q {
    @VisibleForTesting

    /* renamed from: w */
    static final C12960q0.C12967g<String> f60288w;
    @VisibleForTesting

    /* renamed from: x */
    static final C12960q0.C12967g<String> f60289x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final C12537b1 f60290y = C12537b1.f59408g.mo69066q("Stream thrown away because RetriableStream committed");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static Random f60291z = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12972r0<ReqT, ?> f60292a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f60293b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ScheduledExecutorService f60294c;

    /* renamed from: d */
    private final C12960q0 f60295d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12876x1.C12877a f60296e;

    /* renamed from: f */
    private final C12782q0.C12783a f60297f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C12876x1 f60298g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C12782q0 f60299h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f60300i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Object f60301j = new Object();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C12861q f60302k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f60303l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f60304m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C12872x f60305n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C12810u0 f60306o = new C12810u0();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public volatile C12866u f60307p = new C12866u(new ArrayList(8), Collections.emptyList(), (Collection<C12871w>) null, (C12871w) null, false, false, false, 0);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final AtomicBoolean f60308q = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public long f60309r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C12785r f60310s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C12862r f60311t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C12862r f60312u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public long f60313v;

    /* renamed from: io.grpc.internal.w1$a */
    /* compiled from: RetriableStream */
    class C12845a extends C12900j.C12901a {

        /* renamed from: a */
        final /* synthetic */ C12900j f60314a;

        C12845a(C12900j jVar) {
            this.f60314a = jVar;
        }

        /* renamed from: b */
        public C12900j mo69608b(C12900j.C12902b bVar, C12960q0 q0Var) {
            return this.f60314a;
        }
    }

    /* renamed from: io.grpc.internal.w1$b */
    /* compiled from: RetriableStream */
    class C12846b implements C12859o {

        /* renamed from: a */
        final /* synthetic */ String f60316a;

        C12846b(String str) {
            this.f60316a = str;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69179i(this.f60316a);
        }
    }

    /* renamed from: io.grpc.internal.w1$c */
    /* compiled from: RetriableStream */
    class C12847c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Collection f60318a;

        /* renamed from: c */
        final /* synthetic */ C12871w f60319c;

        /* renamed from: d */
        final /* synthetic */ Future f60320d;

        /* renamed from: f */
        final /* synthetic */ Future f60321f;

        C12847c(Collection collection, C12871w wVar, Future future, Future future2) {
            this.f60318a = collection;
            this.f60319c = wVar;
            this.f60320d = future;
            this.f60321f = future2;
        }

        public void run() {
            for (C12871w wVar : this.f60318a) {
                if (wVar != this.f60319c) {
                    wVar.f60370a.mo69141e(C12844w1.f60290y);
                }
            }
            Future future = this.f60320d;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f60321f;
            if (future2 != null) {
                future2.cancel(false);
            }
            C12844w1.this.mo69293c0();
        }
    }

    /* renamed from: io.grpc.internal.w1$d */
    /* compiled from: RetriableStream */
    class C12848d implements C12859o {

        /* renamed from: a */
        final /* synthetic */ C12909l f60323a;

        C12848d(C12909l lVar) {
            this.f60323a = lVar;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69176a(this.f60323a);
        }
    }

    /* renamed from: io.grpc.internal.w1$e */
    /* compiled from: RetriableStream */
    class C12849e implements C12859o {

        /* renamed from: a */
        final /* synthetic */ C12977s f60325a;

        C12849e(C12977s sVar) {
            this.f60325a = sVar;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69146l(this.f60325a);
        }
    }

    /* renamed from: io.grpc.internal.w1$f */
    /* compiled from: RetriableStream */
    class C12850f implements C12859o {

        /* renamed from: a */
        final /* synthetic */ C12997u f60327a;

        C12850f(C12997u uVar) {
            this.f60327a = uVar;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69142f(this.f60327a);
        }
    }

    /* renamed from: io.grpc.internal.w1$g */
    /* compiled from: RetriableStream */
    class C12851g implements C12859o {
        C12851g() {
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.flush();
        }
    }

    /* renamed from: io.grpc.internal.w1$h */
    /* compiled from: RetriableStream */
    class C12852h implements C12859o {

        /* renamed from: a */
        final /* synthetic */ boolean f60330a;

        C12852h(boolean z) {
            this.f60330a = z;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69143h(this.f60330a);
        }
    }

    /* renamed from: io.grpc.internal.w1$i */
    /* compiled from: RetriableStream */
    class C12853i implements C12859o {
        C12853i() {
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69145k();
        }
    }

    /* renamed from: io.grpc.internal.w1$j */
    /* compiled from: RetriableStream */
    class C12854j implements C12859o {

        /* renamed from: a */
        final /* synthetic */ int f60333a;

        C12854j(int i) {
            this.f60333a = i;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69139c(this.f60333a);
        }
    }

    /* renamed from: io.grpc.internal.w1$k */
    /* compiled from: RetriableStream */
    class C12855k implements C12859o {

        /* renamed from: a */
        final /* synthetic */ int f60335a;

        C12855k(int i) {
            this.f60335a = i;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69140d(this.f60335a);
        }
    }

    /* renamed from: io.grpc.internal.w1$l */
    /* compiled from: RetriableStream */
    class C12856l implements C12859o {

        /* renamed from: a */
        final /* synthetic */ int f60337a;

        C12856l(int i) {
            this.f60337a = i;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69138b(this.f60337a);
        }
    }

    /* renamed from: io.grpc.internal.w1$m */
    /* compiled from: RetriableStream */
    class C12857m implements C12859o {

        /* renamed from: a */
        final /* synthetic */ Object f60339a;

        C12857m(Object obj) {
            this.f60339a = obj;
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69178g(C12844w1.this.f60292a.mo69792j(this.f60339a));
        }
    }

    /* renamed from: io.grpc.internal.w1$n */
    /* compiled from: RetriableStream */
    class C12858n implements C12859o {
        C12858n() {
        }

        /* renamed from: a */
        public void mo69609a(C12871w wVar) {
            wVar.f60370a.mo69147m(new C12867v(wVar));
        }
    }

    /* renamed from: io.grpc.internal.w1$o */
    /* compiled from: RetriableStream */
    private interface C12859o {
        /* renamed from: a */
        void mo69609a(C12871w wVar);
    }

    /* renamed from: io.grpc.internal.w1$p */
    /* compiled from: RetriableStream */
    class C12860p extends C12900j {

        /* renamed from: a */
        private final C12871w f60342a;

        /* renamed from: b */
        long f60343b;

        C12860p(C12871w wVar) {
            this.f60342a = wVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
            r0.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo69112h(long r8) {
            /*
                r7 = this;
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.w1$u r0 = r0.f60307p
                io.grpc.internal.w1$w r0 = r0.f60361f
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                r0 = 0
                io.grpc.internal.w1 r1 = p292io.grpc.internal.C12844w1.this
                java.lang.Object r1 = r1.f60301j
                monitor-enter(r1)
                io.grpc.internal.w1 r2 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0084 }
                io.grpc.internal.w1$u r2 = r2.f60307p     // Catch:{ all -> 0x0084 }
                io.grpc.internal.w1$w r2 = r2.f60361f     // Catch:{ all -> 0x0084 }
                if (r2 != 0) goto L_0x0082
                io.grpc.internal.w1$w r2 = r7.f60342a     // Catch:{ all -> 0x0084 }
                boolean r2 = r2.f60371b     // Catch:{ all -> 0x0084 }
                if (r2 == 0) goto L_0x0024
                goto L_0x0082
            L_0x0024:
                long r2 = r7.f60343b     // Catch:{ all -> 0x0084 }
                long r2 = r2 + r8
                r7.f60343b = r2     // Catch:{ all -> 0x0084 }
                io.grpc.internal.w1 r8 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0084 }
                long r8 = r8.f60309r     // Catch:{ all -> 0x0084 }
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 > 0) goto L_0x0035
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                return
            L_0x0035:
                long r8 = r7.f60343b     // Catch:{ all -> 0x0084 }
                io.grpc.internal.w1 r2 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0084 }
                long r2 = r2.f60303l     // Catch:{ all -> 0x0084 }
                r4 = 1
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x0047
                io.grpc.internal.w1$w r8 = r7.f60342a     // Catch:{ all -> 0x0084 }
                r8.f60372c = r4     // Catch:{ all -> 0x0084 }
                goto L_0x006f
            L_0x0047:
                io.grpc.internal.w1 r8 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0084 }
                io.grpc.internal.w1$q r8 = r8.f60302k     // Catch:{ all -> 0x0084 }
                long r2 = r7.f60343b     // Catch:{ all -> 0x0084 }
                io.grpc.internal.w1 r9 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0084 }
                long r5 = r9.f60309r     // Catch:{ all -> 0x0084 }
                long r2 = r2 - r5
                long r8 = r8.mo69611a(r2)     // Catch:{ all -> 0x0084 }
                io.grpc.internal.w1 r2 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0084 }
                long r5 = r7.f60343b     // Catch:{ all -> 0x0084 }
                long unused = r2.f60309r = r5     // Catch:{ all -> 0x0084 }
                io.grpc.internal.w1 r2 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0084 }
                long r2 = r2.f60304m     // Catch:{ all -> 0x0084 }
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L_0x006f
                io.grpc.internal.w1$w r8 = r7.f60342a     // Catch:{ all -> 0x0084 }
                r8.f60372c = r4     // Catch:{ all -> 0x0084 }
            L_0x006f:
                io.grpc.internal.w1$w r8 = r7.f60342a     // Catch:{ all -> 0x0084 }
                boolean r9 = r8.f60372c     // Catch:{ all -> 0x0084 }
                if (r9 == 0) goto L_0x007b
                io.grpc.internal.w1 r9 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0084 }
                java.lang.Runnable r0 = r9.m84704U(r8)     // Catch:{ all -> 0x0084 }
            L_0x007b:
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                if (r0 == 0) goto L_0x0081
                r0.run()
            L_0x0081:
                return
            L_0x0082:
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                return
            L_0x0084:
                r8 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0084 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12844w1.C12860p.mo69112h(long):void");
        }
    }

    /* renamed from: io.grpc.internal.w1$q */
    /* compiled from: RetriableStream */
    static final class C12861q {

        /* renamed from: a */
        private final AtomicLong f60345a = new AtomicLong();

        C12861q() {
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        /* renamed from: a */
        public long mo69611a(long j) {
            return this.f60345a.addAndGet(j);
        }
    }

    /* renamed from: io.grpc.internal.w1$r */
    /* compiled from: RetriableStream */
    private static final class C12862r {

        /* renamed from: a */
        final Object f60346a;

        /* renamed from: b */
        Future<?> f60347b;

        /* renamed from: c */
        boolean f60348c;

        C12862r(Object obj) {
            this.f60346a = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo69612a() {
            return this.f60348c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Future<?> mo69613b() {
            this.f60348c = true;
            return this.f60347b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo69614c(Future<?> future) {
            synchronized (this.f60346a) {
                if (!this.f60348c) {
                    this.f60347b = future;
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.w1$s */
    /* compiled from: RetriableStream */
    private final class C12863s implements Runnable {

        /* renamed from: a */
        final C12862r f60349a;

        /* renamed from: io.grpc.internal.w1$s$a */
        /* compiled from: RetriableStream */
        class C12864a implements Runnable {
            C12864a() {
            }

            public void run() {
                C12862r rVar;
                boolean z;
                C12844w1 w1Var = C12844w1.this;
                C12871w B = w1Var.m84706W(w1Var.f60307p.f60360e);
                synchronized (C12844w1.this.f60301j) {
                    rVar = null;
                    z = false;
                    if (C12863s.this.f60349a.mo69612a()) {
                        z = true;
                    } else {
                        C12844w1 w1Var2 = C12844w1.this;
                        C12866u unused = w1Var2.f60307p = w1Var2.f60307p.mo69617a(B);
                        C12844w1 w1Var3 = C12844w1.this;
                        if (!w1Var3.m84710a0(w1Var3.f60307p) || (C12844w1.this.f60305n != null && !C12844w1.this.f60305n.mo69628a())) {
                            C12844w1 w1Var4 = C12844w1.this;
                            C12866u unused2 = w1Var4.f60307p = w1Var4.f60307p.mo69620d();
                            C12862r unused3 = C12844w1.this.f60312u = null;
                        } else {
                            C12844w1 w1Var5 = C12844w1.this;
                            rVar = new C12862r(w1Var5.f60301j);
                            C12862r unused4 = w1Var5.f60312u = rVar;
                        }
                    }
                }
                if (z) {
                    B.f60370a.mo69141e(C12537b1.f59408g.mo69066q("Unneeded hedging"));
                    return;
                }
                if (rVar != null) {
                    rVar.mo69614c(C12844w1.this.f60294c.schedule(new C12863s(rVar), C12844w1.this.f60299h.f60156b, TimeUnit.NANOSECONDS));
                }
                C12844w1.this.m84708Y(B);
            }
        }

        C12863s(C12862r rVar) {
            this.f60349a = rVar;
        }

        public void run() {
            C12844w1.this.f60293b.execute(new C12864a());
        }
    }

    /* renamed from: io.grpc.internal.w1$t */
    /* compiled from: RetriableStream */
    private static final class C12865t {

        /* renamed from: a */
        final boolean f60352a;

        /* renamed from: b */
        final boolean f60353b;

        /* renamed from: c */
        final long f60354c;

        /* renamed from: d */
        final Integer f60355d;

        C12865t(boolean z, boolean z2, long j, Integer num) {
            this.f60352a = z;
            this.f60353b = z2;
            this.f60354c = j;
            this.f60355d = num;
        }
    }

    /* renamed from: io.grpc.internal.w1$u */
    /* compiled from: RetriableStream */
    private static final class C12866u {

        /* renamed from: a */
        final boolean f60356a;

        /* renamed from: b */
        final List<C12859o> f60357b;

        /* renamed from: c */
        final Collection<C12871w> f60358c;

        /* renamed from: d */
        final Collection<C12871w> f60359d;

        /* renamed from: e */
        final int f60360e;

        /* renamed from: f */
        final C12871w f60361f;

        /* renamed from: g */
        final boolean f60362g;

        /* renamed from: h */
        final boolean f60363h;

        C12866u(List<C12859o> list, Collection<C12871w> collection, Collection<C12871w> collection2, C12871w wVar, boolean z, boolean z2, boolean z3, int i) {
            this.f60357b = list;
            this.f60358c = (Collection) Preconditions.m5393t(collection, "drainedSubstreams");
            this.f60361f = wVar;
            this.f60359d = collection2;
            this.f60362g = z;
            this.f60356a = z2;
            this.f60363h = z3;
            this.f60360e = i;
            boolean z4 = false;
            Preconditions.m5399z(!z2 || list == null, "passThrough should imply buffer is null");
            Preconditions.m5399z(!z2 || wVar != null, "passThrough should imply winningSubstream != null");
            Preconditions.m5399z(!z2 || (collection.size() == 1 && collection.contains(wVar)) || (collection.size() == 0 && wVar.f60371b), "passThrough should imply winningSubstream is drained");
            Preconditions.m5399z((!z || wVar != null) ? true : z4, "cancelled should imply committed");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C12866u mo69617a(C12871w wVar) {
            Collection collection;
            Preconditions.m5399z(!this.f60363h, "hedging frozen");
            Preconditions.m5399z(this.f60361f == null, "already committed");
            if (this.f60359d == null) {
                collection = Collections.singleton(wVar);
            } else {
                ArrayList arrayList = new ArrayList(this.f60359d);
                arrayList.add(wVar);
                collection = Collections.unmodifiableCollection(arrayList);
            }
            return new C12866u(this.f60357b, this.f60358c, collection, this.f60361f, this.f60362g, this.f60356a, this.f60363h, this.f60360e + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12866u mo69618b() {
            return new C12866u(this.f60357b, this.f60358c, this.f60359d, this.f60361f, true, this.f60356a, this.f60363h, this.f60360e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C12866u mo69619c(C12871w wVar) {
            boolean z;
            Set set;
            List<C12859o> list;
            Preconditions.m5399z(this.f60361f == null, "Already committed");
            List<C12859o> list2 = this.f60357b;
            if (this.f60358c.contains(wVar)) {
                list = null;
                set = Collections.singleton(wVar);
                z = true;
            } else {
                list = list2;
                set = Collections.emptyList();
                z = false;
            }
            return new C12866u(list, set, this.f60359d, wVar, this.f60362g, z, this.f60363h, this.f60360e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C12866u mo69620d() {
            if (this.f60363h) {
                return this;
            }
            return new C12866u(this.f60357b, this.f60358c, this.f60359d, this.f60361f, this.f60362g, this.f60356a, true, this.f60360e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C12866u mo69621e(C12871w wVar) {
            ArrayList arrayList = new ArrayList(this.f60359d);
            arrayList.remove(wVar);
            return new C12866u(this.f60357b, this.f60358c, Collections.unmodifiableCollection(arrayList), this.f60361f, this.f60362g, this.f60356a, this.f60363h, this.f60360e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C12866u mo69622f(C12871w wVar, C12871w wVar2) {
            ArrayList arrayList = new ArrayList(this.f60359d);
            arrayList.remove(wVar);
            arrayList.add(wVar2);
            return new C12866u(this.f60357b, this.f60358c, Collections.unmodifiableCollection(arrayList), this.f60361f, this.f60362g, this.f60356a, this.f60363h, this.f60360e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C12866u mo69623g(C12871w wVar) {
            wVar.f60371b = true;
            if (!this.f60358c.contains(wVar)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f60358c);
            arrayList.remove(wVar);
            return new C12866u(this.f60357b, Collections.unmodifiableCollection(arrayList), this.f60359d, this.f60361f, this.f60362g, this.f60356a, this.f60363h, this.f60360e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C12866u mo69624h(C12871w wVar) {
            Collection unmodifiableCollection;
            boolean z = true;
            Preconditions.m5399z(!this.f60356a, "Already passThrough");
            if (wVar.f60371b) {
                unmodifiableCollection = this.f60358c;
            } else if (this.f60358c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(wVar);
            } else {
                ArrayList arrayList = new ArrayList(this.f60358c);
                arrayList.add(wVar);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            C12871w wVar2 = this.f60361f;
            boolean z2 = wVar2 != null;
            List<C12859o> list = this.f60357b;
            if (z2) {
                if (wVar2 != wVar) {
                    z = false;
                }
                Preconditions.m5399z(z, "Another RPC attempt has already committed");
                list = null;
            }
            return new C12866u(list, collection, this.f60359d, this.f60361f, this.f60362g, z2, this.f60363h, this.f60360e);
        }
    }

    /* renamed from: io.grpc.internal.w1$v */
    /* compiled from: RetriableStream */
    private final class C12867v implements C12785r {

        /* renamed from: a */
        final C12871w f60364a;

        /* renamed from: io.grpc.internal.w1$v$a */
        /* compiled from: RetriableStream */
        class C12868a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12871w f60366a;

            C12868a(C12871w wVar) {
                this.f60366a = wVar;
            }

            public void run() {
                C12844w1.this.m84708Y(this.f60366a);
            }
        }

        /* renamed from: io.grpc.internal.w1$v$b */
        /* compiled from: RetriableStream */
        class C12869b implements Runnable {

            /* renamed from: io.grpc.internal.w1$v$b$a */
            /* compiled from: RetriableStream */
            class C12870a implements Runnable {
                C12870a() {
                }

                public void run() {
                    C12867v vVar = C12867v.this;
                    C12844w1.this.m84708Y(C12844w1.this.m84706W(vVar.f60364a.f60373d + 1));
                }
            }

            C12869b() {
            }

            public void run() {
                C12844w1.this.f60293b.execute(new C12870a());
            }
        }

        C12867v(C12871w wVar) {
            this.f60364a = wVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private p292io.grpc.internal.C12844w1.C12865t m84770e(p292io.grpc.C12537b1 r13, p292io.grpc.C12960q0 r14) {
            /*
                r12 = this;
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r0 = r0.f60298g
                java.util.Set<io.grpc.b1$b> r0 = r0.f60386e
                io.grpc.b1$b r1 = r13.mo69062m()
                boolean r0 = r0.contains(r1)
                io.grpc.internal.w1 r1 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.q0 r1 = r1.f60299h
                java.util.Set<io.grpc.b1$b> r1 = r1.f60157c
                io.grpc.b1$b r13 = r13.mo69062m()
                boolean r13 = r1.contains(r13)
                io.grpc.internal.w1 r1 = p292io.grpc.internal.C12844w1.this
                boolean r1 = r1.f60300i
                if (r1 == 0) goto L_0x0036
                if (r13 != 0) goto L_0x0036
                io.grpc.internal.w1$t r13 = new io.grpc.internal.w1$t
                r3 = 0
                r4 = 1
                r5 = 0
                r7 = 0
                r2 = r13
                r2.<init>(r3, r4, r5, r7)
                return r13
            L_0x0036:
                io.grpc.q0$g<java.lang.String> r1 = p292io.grpc.internal.C12844w1.f60289x
                java.lang.Object r14 = r14.mo69764f(r1)
                java.lang.String r14 = (java.lang.String) r14
                r1 = 0
                if (r14 == 0) goto L_0x004c
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NumberFormatException -> 0x0046 }
                goto L_0x004d
            L_0x0046:
                r14 = -1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                goto L_0x004d
            L_0x004c:
                r14 = r1
            L_0x004d:
                io.grpc.internal.w1 r2 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.w1$x r2 = r2.f60305n
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x006f
                if (r0 != 0) goto L_0x0063
                if (r13 != 0) goto L_0x0063
                if (r14 == 0) goto L_0x006f
                int r13 = r14.intValue()
                if (r13 >= 0) goto L_0x006f
            L_0x0063:
                io.grpc.internal.w1 r13 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.w1$x r13 = r13.f60305n
                boolean r13 = r13.mo69629b()
                r13 = r13 ^ r4
                goto L_0x0070
            L_0x006f:
                r13 = 0
            L_0x0070:
                io.grpc.internal.w1 r2 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r2 = r2.f60298g
                int r2 = r2.f60382a
                io.grpc.internal.w1$w r5 = r12.f60364a
                int r5 = r5.f60373d
                int r5 = r5 + r4
                if (r2 <= r5) goto L_0x00d8
                if (r13 != 0) goto L_0x00d8
                if (r14 != 0) goto L_0x00b9
                if (r0 == 0) goto L_0x00d8
                io.grpc.internal.w1 r13 = p292io.grpc.internal.C12844w1.this
                long r2 = r13.f60313v
                double r2 = (double) r2
                java.util.Random r13 = p292io.grpc.internal.C12844w1.f60291z
                double r5 = r13.nextDouble()
                double r2 = r2 * r5
                long r2 = (long) r2
                io.grpc.internal.w1 r13 = p292io.grpc.internal.C12844w1.this
                long r5 = r13.f60313v
                double r5 = (double) r5
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r0 = r0.f60298g
                double r7 = r0.f60385d
                double r5 = r5 * r7
                long r5 = (long) r5
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r0 = r0.f60298g
                long r7 = r0.f60384c
                long r5 = java.lang.Math.min(r5, r7)
                long unused = r13.f60313v = r5
                goto L_0x00d5
            L_0x00b9:
                int r13 = r14.intValue()
                if (r13 < 0) goto L_0x00d8
                java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
                int r0 = r14.intValue()
                long r2 = (long) r0
                long r2 = r13.toNanos(r2)
                io.grpc.internal.w1 r13 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r0 = r13.f60298g
                long r5 = r0.f60383b
                long unused = r13.f60313v = r5
            L_0x00d5:
                r9 = r2
                r7 = 1
                goto L_0x00dc
            L_0x00d8:
                r4 = 0
                r9 = r4
                r7 = 0
            L_0x00dc:
                io.grpc.internal.w1$t r13 = new io.grpc.internal.w1$t
                r8 = 0
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                boolean r0 = r0.f60300i
                if (r0 == 0) goto L_0x00e9
                r11 = r14
                goto L_0x00ea
            L_0x00e9:
                r11 = r1
            L_0x00ea:
                r6 = r13
                r6.<init>(r7, r8, r9, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12844w1.C12867v.m84770e(io.grpc.b1, io.grpc.q0):io.grpc.internal.w1$t");
        }

        /* renamed from: a */
        public void mo69194a(C12690g2.C12691a aVar) {
            C12866u o = C12844w1.this.f60307p;
            Preconditions.m5399z(o.f60361f != null, "Headers should be received prior to messages.");
            if (o.f60361f == this.f60364a) {
                C12844w1.this.f60310s.mo69194a(aVar);
            }
        }

        /* renamed from: b */
        public void mo69195b(C12537b1 b1Var, C12960q0 q0Var) {
            mo69197d(b1Var, C12785r.C12786a.PROCESSED, q0Var);
        }

        /* renamed from: c */
        public void mo69196c(C12960q0 q0Var) {
            C12844w1.this.m84705V(this.f60364a);
            if (C12844w1.this.f60307p.f60361f == this.f60364a) {
                C12844w1.this.f60310s.mo69196c(q0Var);
                if (C12844w1.this.f60305n != null) {
                    C12844w1.this.f60305n.mo69630c();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:75:0x019a, code lost:
            return;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo69197d(p292io.grpc.C12537b1 r5, p292io.grpc.internal.C12785r.C12786a r6, p292io.grpc.C12960q0 r7) {
            /*
                r4 = this;
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                java.lang.Object r0 = r0.f60301j
                monitor-enter(r0)
                io.grpc.internal.w1 r1 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x01bd }
                io.grpc.internal.w1$u r2 = r1.f60307p     // Catch:{ all -> 0x01bd }
                io.grpc.internal.w1$w r3 = r4.f60364a     // Catch:{ all -> 0x01bd }
                io.grpc.internal.w1$u r2 = r2.mo69623g(r3)     // Catch:{ all -> 0x01bd }
                p292io.grpc.internal.C12844w1.C12866u unused = r1.f60307p = r2     // Catch:{ all -> 0x01bd }
                io.grpc.internal.w1 r1 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x01bd }
                io.grpc.internal.u0 r1 = r1.f60306o     // Catch:{ all -> 0x01bd }
                io.grpc.b1$b r2 = r5.mo69062m()     // Catch:{ all -> 0x01bd }
                r1.mo69568a(r2)     // Catch:{ all -> 0x01bd }
                monitor-exit(r0)     // Catch:{ all -> 0x01bd }
                io.grpc.internal.w1$w r0 = r4.f60364a
                boolean r1 = r0.f60372c
                if (r1 == 0) goto L_0x0045
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                r6.m84705V(r0)
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.w1$u r6 = r6.f60307p
                io.grpc.internal.w1$w r6 = r6.f60361f
                io.grpc.internal.w1$w r0 = r4.f60364a
                if (r6 != r0) goto L_0x0044
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.r r6 = r6.f60310s
                r6.mo69195b(r5, r7)
            L_0x0044:
                return
            L_0x0045:
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.w1$u r0 = r0.f60307p
                io.grpc.internal.w1$w r0 = r0.f60361f
                if (r0 != 0) goto L_0x01a0
                io.grpc.internal.r$a r0 = p292io.grpc.internal.C12785r.C12786a.REFUSED
                r1 = 0
                r2 = 1
                if (r6 != r0) goto L_0x00e3
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f60308q
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x00e3
                io.grpc.internal.w1 r5 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.w1$w r6 = r4.f60364a
                int r6 = r6.f60373d
                io.grpc.internal.w1$w r5 = r5.m84706W(r6)
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                boolean r6 = r6.f60300i
                if (r6 == 0) goto L_0x00b0
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                java.lang.Object r6 = r6.f60301j
                monitor-enter(r6)
                io.grpc.internal.w1 r7 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x00ad }
                io.grpc.internal.w1$u r0 = r7.f60307p     // Catch:{ all -> 0x00ad }
                io.grpc.internal.w1$w r3 = r4.f60364a     // Catch:{ all -> 0x00ad }
                io.grpc.internal.w1$u r0 = r0.mo69622f(r3, r5)     // Catch:{ all -> 0x00ad }
                p292io.grpc.internal.C12844w1.C12866u unused = r7.f60307p = r0     // Catch:{ all -> 0x00ad }
                io.grpc.internal.w1 r7 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x00ad }
                io.grpc.internal.w1$u r0 = r7.f60307p     // Catch:{ all -> 0x00ad }
                boolean r7 = r7.m84710a0(r0)     // Catch:{ all -> 0x00ad }
                if (r7 != 0) goto L_0x00a4
                io.grpc.internal.w1 r7 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x00ad }
                io.grpc.internal.w1$u r7 = r7.f60307p     // Catch:{ all -> 0x00ad }
                java.util.Collection<io.grpc.internal.w1$w> r7 = r7.f60359d     // Catch:{ all -> 0x00ad }
                int r7 = r7.size()     // Catch:{ all -> 0x00ad }
                if (r7 != r2) goto L_0x00a4
                r1 = 1
            L_0x00a4:
                monitor-exit(r6)     // Catch:{ all -> 0x00ad }
                if (r1 == 0) goto L_0x00d4
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                r6.m84705V(r5)
                goto L_0x00d4
            L_0x00ad:
                r5 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x00ad }
                throw r5
            L_0x00b0:
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r6 = r6.f60298g
                if (r6 != 0) goto L_0x00c5
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1$a r7 = r6.f60296e
                io.grpc.internal.x1 r7 = r7.get()
                p292io.grpc.internal.C12876x1 unused = r6.f60298g = r7
            L_0x00c5:
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r6 = r6.f60298g
                int r6 = r6.f60382a
                if (r6 != r2) goto L_0x00d4
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                r6.m84705V(r5)
            L_0x00d4:
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                java.util.concurrent.Executor r6 = r6.f60293b
                io.grpc.internal.w1$v$a r7 = new io.grpc.internal.w1$v$a
                r7.<init>(r5)
                r6.execute(r7)
                return
            L_0x00e3:
                io.grpc.internal.r$a r0 = p292io.grpc.internal.C12785r.C12786a.DROPPED
                if (r6 != r0) goto L_0x00f5
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                boolean r6 = r6.f60300i
                if (r6 == 0) goto L_0x015f
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                r6.m84709Z()
                goto L_0x015f
            L_0x00f5:
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                java.util.concurrent.atomic.AtomicBoolean r6 = r6.f60308q
                r6.set(r2)
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r6 = r6.f60298g
                if (r6 != 0) goto L_0x011e
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1$a r0 = r6.f60296e
                io.grpc.internal.x1 r0 = r0.get()
                p292io.grpc.internal.C12876x1 unused = r6.f60298g = r0
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.x1 r0 = r6.f60298g
                long r0 = r0.f60383b
                long unused = r6.f60313v = r0
            L_0x011e:
                io.grpc.internal.w1$t r6 = r4.m84770e(r5, r7)
                boolean r0 = r6.f60352a
                if (r0 == 0) goto L_0x0156
                io.grpc.internal.w1 r5 = p292io.grpc.internal.C12844w1.this
                java.lang.Object r0 = r5.f60301j
                monitor-enter(r0)
                io.grpc.internal.w1 r5 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x0153 }
                io.grpc.internal.w1$r r7 = new io.grpc.internal.w1$r     // Catch:{ all -> 0x0153 }
                java.lang.Object r1 = r5.f60301j     // Catch:{ all -> 0x0153 }
                r7.<init>(r1)     // Catch:{ all -> 0x0153 }
                p292io.grpc.internal.C12844w1.C12862r unused = r5.f60311t = r7     // Catch:{ all -> 0x0153 }
                monitor-exit(r0)     // Catch:{ all -> 0x0153 }
                io.grpc.internal.w1 r5 = p292io.grpc.internal.C12844w1.this
                java.util.concurrent.ScheduledExecutorService r5 = r5.f60294c
                io.grpc.internal.w1$v$b r0 = new io.grpc.internal.w1$v$b
                r0.<init>()
                long r1 = r6.f60354c
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
                java.util.concurrent.ScheduledFuture r5 = r5.schedule(r0, r1, r6)
                r7.mo69614c(r5)
                return
            L_0x0153:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0153 }
                throw r5
            L_0x0156:
                boolean r1 = r6.f60353b
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this
                java.lang.Integer r6 = r6.f60355d
                r0.m84711e0(r6)
            L_0x015f:
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                boolean r6 = r6.f60300i
                if (r6 == 0) goto L_0x01a0
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                java.lang.Object r6 = r6.f60301j
                monitor-enter(r6)
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x019d }
                io.grpc.internal.w1$u r2 = r0.f60307p     // Catch:{ all -> 0x019d }
                io.grpc.internal.w1$w r3 = r4.f60364a     // Catch:{ all -> 0x019d }
                io.grpc.internal.w1$u r2 = r2.mo69621e(r3)     // Catch:{ all -> 0x019d }
                p292io.grpc.internal.C12844w1.C12866u unused = r0.f60307p = r2     // Catch:{ all -> 0x019d }
                if (r1 != 0) goto L_0x019b
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x019d }
                io.grpc.internal.w1$u r1 = r0.f60307p     // Catch:{ all -> 0x019d }
                boolean r0 = r0.m84710a0(r1)     // Catch:{ all -> 0x019d }
                if (r0 != 0) goto L_0x0199
                io.grpc.internal.w1 r0 = p292io.grpc.internal.C12844w1.this     // Catch:{ all -> 0x019d }
                io.grpc.internal.w1$u r0 = r0.f60307p     // Catch:{ all -> 0x019d }
                java.util.Collection<io.grpc.internal.w1$w> r0 = r0.f60359d     // Catch:{ all -> 0x019d }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x019d }
                if (r0 != 0) goto L_0x019b
            L_0x0199:
                monitor-exit(r6)     // Catch:{ all -> 0x019d }
                return
            L_0x019b:
                monitor-exit(r6)     // Catch:{ all -> 0x019d }
                goto L_0x01a0
            L_0x019d:
                r5 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x019d }
                throw r5
            L_0x01a0:
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.w1$w r0 = r4.f60364a
                r6.m84705V(r0)
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.w1$u r6 = r6.f60307p
                io.grpc.internal.w1$w r6 = r6.f60361f
                io.grpc.internal.w1$w r0 = r4.f60364a
                if (r6 != r0) goto L_0x01bc
                io.grpc.internal.w1 r6 = p292io.grpc.internal.C12844w1.this
                io.grpc.internal.r r6 = r6.f60310s
                r6.mo69195b(r5, r7)
            L_0x01bc:
                return
            L_0x01bd:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01bd }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12844w1.C12867v.mo69197d(io.grpc.b1, io.grpc.internal.r$a, io.grpc.q0):void");
        }

        public void onReady() {
            if (C12844w1.this.f60307p.f60358c.contains(this.f60364a)) {
                C12844w1.this.f60310s.onReady();
            }
        }
    }

    /* renamed from: io.grpc.internal.w1$w */
    /* compiled from: RetriableStream */
    private static final class C12871w {

        /* renamed from: a */
        C12781q f60370a;

        /* renamed from: b */
        boolean f60371b;

        /* renamed from: c */
        boolean f60372c;

        /* renamed from: d */
        final int f60373d;

        C12871w(int i) {
            this.f60373d = i;
        }
    }

    /* renamed from: io.grpc.internal.w1$x */
    /* compiled from: RetriableStream */
    static final class C12872x {

        /* renamed from: a */
        final int f60374a;

        /* renamed from: b */
        final int f60375b;

        /* renamed from: c */
        final int f60376c;

        /* renamed from: d */
        final AtomicInteger f60377d;

        C12872x(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f60377d = atomicInteger;
            this.f60376c = (int) (f2 * 1000.0f);
            int i = (int) (f * 1000.0f);
            this.f60374a = i;
            this.f60375b = i / 2;
            atomicInteger.set(i);
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        /* renamed from: a */
        public boolean mo69628a() {
            return this.f60377d.get() > this.f60375b;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        /* renamed from: b */
        public boolean mo69629b() {
            int i;
            int i2;
            do {
                i = this.f60377d.get();
                if (i == 0) {
                    return false;
                }
                i2 = i + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            } while (!this.f60377d.compareAndSet(i, Math.max(i2, 0)));
            if (i2 > this.f60375b) {
                return true;
            }
            return false;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        @com.google.common.annotations.VisibleForTesting
        /* renamed from: c */
        void mo69630c() {
            /*
                r4 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicInteger r0 = r4.f60377d
                int r0 = r0.get()
                int r1 = r4.f60374a
                if (r0 != r1) goto L_0x000b
                goto L_0x001a
            L_0x000b:
                int r2 = r4.f60376c
                int r2 = r2 + r0
                java.util.concurrent.atomic.AtomicInteger r3 = r4.f60377d
                int r1 = java.lang.Math.min(r2, r1)
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12844w1.C12872x.mo69630c():void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12872x)) {
                return false;
            }
            C12872x xVar = (C12872x) obj;
            if (this.f60374a == xVar.f60374a && this.f60376c == xVar.f60376c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.m5350b(Integer.valueOf(this.f60374a), Integer.valueOf(this.f60376c));
        }
    }

    static {
        C12960q0.C12964d<String> dVar = C12960q0.f60666d;
        f60288w = C12960q0.C12967g.m85092e("grpc-previous-rpc-attempts", dVar);
        f60289x = C12960q0.C12967g.m85092e("grpc-retry-pushback-ms", dVar);
    }

    C12844w1(C12972r0<ReqT, ?> r0Var, C12960q0 q0Var, C12861q qVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, C12876x1.C12877a aVar, C12782q0.C12783a aVar2, C12872x xVar) {
        this.f60292a = r0Var;
        this.f60302k = qVar;
        this.f60303l = j;
        this.f60304m = j2;
        this.f60293b = executor;
        this.f60294c = scheduledExecutorService;
        this.f60295d = q0Var;
        this.f60296e = (C12876x1.C12877a) Preconditions.m5393t(aVar, "retryPolicyProvider");
        this.f60297f = (C12782q0.C12783a) Preconditions.m5393t(aVar2, "hedgingPolicyProvider");
        this.f60305n = xVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public Runnable m84704U(C12871w wVar) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f60301j) {
            if (this.f60307p.f60361f != null) {
                return null;
            }
            Collection<C12871w> collection = this.f60307p.f60358c;
            this.f60307p = this.f60307p.mo69619c(wVar);
            this.f60302k.mo69611a(-this.f60309r);
            C12862r rVar = this.f60311t;
            if (rVar != null) {
                Future<?> b = rVar.mo69613b();
                this.f60311t = null;
                future = b;
            } else {
                future = null;
            }
            C12862r rVar2 = this.f60312u;
            if (rVar2 != null) {
                Future<?> b2 = rVar2.mo69613b();
                this.f60312u = null;
                future2 = b2;
            } else {
                future2 = null;
            }
            C12847c cVar = new C12847c(collection, wVar, future, future2);
            return cVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m84705V(C12871w wVar) {
        Runnable U = m84704U(wVar);
        if (U != null) {
            U.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public C12871w m84706W(int i) {
        C12871w wVar = new C12871w(i);
        wVar.f60370a = mo69292b0(new C12845a(new C12860p(wVar)), mo69607g0(this.f60295d, i));
        return wVar;
    }

    /* renamed from: X */
    private void m84707X(C12859o oVar) {
        Collection<C12871w> collection;
        synchronized (this.f60301j) {
            if (!this.f60307p.f60356a) {
                this.f60307p.f60357b.add(oVar);
            }
            collection = this.f60307p.f60358c;
        }
        for (C12871w a : collection) {
            oVar.mo69609a(a);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r2.hasNext() == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r3 = (p292io.grpc.internal.C12844w1.C12859o) r2.next();
        r4 = r7.f60307p;
        r6 = r4.f60361f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r6 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r6 == r8) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (r4.f60362g == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        if (r6 != r8) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0074, code lost:
        com.google.common.base.Preconditions.m5399z(r0, "substream should be CANCELLED_BECAUSE_COMMITTED already");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        r3.mo69609a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007e, code lost:
        continue;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m84708Y(p292io.grpc.internal.C12844w1.C12871w r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0003:
            java.lang.Object r3 = r7.f60301j
            monitor-enter(r3)
            io.grpc.internal.w1$u r4 = r7.f60307p     // Catch:{ all -> 0x0080 }
            io.grpc.internal.w1$w r5 = r4.f60361f     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0017
            if (r5 == r8) goto L_0x0017
            monitor-exit(r3)     // Catch:{ all -> 0x0080 }
            io.grpc.internal.q r8 = r8.f60370a
            io.grpc.b1 r0 = f60290y
            r8.mo69141e(r0)
            return
        L_0x0017:
            java.util.List<io.grpc.internal.w1$o> r5 = r4.f60357b     // Catch:{ all -> 0x0080 }
            int r5 = r5.size()     // Catch:{ all -> 0x0080 }
            if (r2 != r5) goto L_0x0027
            io.grpc.internal.w1$u r8 = r4.mo69624h(r8)     // Catch:{ all -> 0x0080 }
            r7.f60307p = r8     // Catch:{ all -> 0x0080 }
            monitor-exit(r3)     // Catch:{ all -> 0x0080 }
            return
        L_0x0027:
            boolean r5 = r8.f60371b     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002d
            monitor-exit(r3)     // Catch:{ all -> 0x0080 }
            return
        L_0x002d:
            int r5 = r2 + 128
            java.util.List<io.grpc.internal.w1$o> r6 = r4.f60357b     // Catch:{ all -> 0x0080 }
            int r6 = r6.size()     // Catch:{ all -> 0x0080 }
            int r5 = java.lang.Math.min(r5, r6)     // Catch:{ all -> 0x0080 }
            if (r1 != 0) goto L_0x0047
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0080 }
            java.util.List<io.grpc.internal.w1$o> r4 = r4.f60357b     // Catch:{ all -> 0x0080 }
            java.util.List r2 = r4.subList(r2, r5)     // Catch:{ all -> 0x0080 }
            r1.<init>(r2)     // Catch:{ all -> 0x0080 }
            goto L_0x0053
        L_0x0047:
            r1.clear()     // Catch:{ all -> 0x0080 }
            java.util.List<io.grpc.internal.w1$o> r4 = r4.f60357b     // Catch:{ all -> 0x0080 }
            java.util.List r2 = r4.subList(r2, r5)     // Catch:{ all -> 0x0080 }
            r1.addAll(r2)     // Catch:{ all -> 0x0080 }
        L_0x0053:
            monitor-exit(r3)     // Catch:{ all -> 0x0080 }
            java.util.Iterator r2 = r1.iterator()
        L_0x0058:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x007e
            java.lang.Object r3 = r2.next()
            io.grpc.internal.w1$o r3 = (p292io.grpc.internal.C12844w1.C12859o) r3
            io.grpc.internal.w1$u r4 = r7.f60307p
            io.grpc.internal.w1$w r6 = r4.f60361f
            if (r6 == 0) goto L_0x006d
            if (r6 == r8) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            boolean r4 = r4.f60362g
            if (r4 == 0) goto L_0x007a
            if (r6 != r8) goto L_0x0074
            r0 = 1
        L_0x0074:
            java.lang.String r8 = "substream should be CANCELLED_BECAUSE_COMMITTED already"
            com.google.common.base.Preconditions.m5399z(r0, r8)
            return
        L_0x007a:
            r3.mo69609a(r8)
            goto L_0x0058
        L_0x007e:
            r2 = r5
            goto L_0x0003
        L_0x0080:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0080 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12844w1.m84708Y(io.grpc.internal.w1$w):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m84709Z() {
        Future<?> future;
        synchronized (this.f60301j) {
            C12862r rVar = this.f60312u;
            future = null;
            if (rVar != null) {
                Future<?> b = rVar.mo69613b();
                this.f60312u = null;
                future = b;
            }
            this.f60307p = this.f60307p.mo69620d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public boolean m84710a0(C12866u uVar) {
        return uVar.f60361f == null && uVar.f60360e < this.f60299h.f60155a && !uVar.f60363h;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r1 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r1.cancel(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2.mo69614c(r5.f60294c.schedule(new p292io.grpc.internal.C12844w1.C12863s(r5, r2), (long) r6.intValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m84711e0(java.lang.Integer r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r6.intValue()
            if (r0 >= 0) goto L_0x000d
            r5.m84709Z()
            return
        L_0x000d:
            java.lang.Object r0 = r5.f60301j
            monitor-enter(r0)
            io.grpc.internal.w1$r r1 = r5.f60312u     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0016:
            java.util.concurrent.Future r1 = r1.mo69613b()     // Catch:{ all -> 0x0040 }
            io.grpc.internal.w1$r r2 = new io.grpc.internal.w1$r     // Catch:{ all -> 0x0040 }
            java.lang.Object r3 = r5.f60301j     // Catch:{ all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ all -> 0x0040 }
            r5.f60312u = r2     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x002a
            r0 = 0
            r1.cancel(r0)
        L_0x002a:
            java.util.concurrent.ScheduledExecutorService r0 = r5.f60294c
            io.grpc.internal.w1$s r1 = new io.grpc.internal.w1$s
            r1.<init>(r2)
            int r6 = r6.intValue()
            long r3 = (long) r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r6 = r0.schedule(r1, r3, r6)
            r2.mo69614c(r6)
            return
        L_0x0040:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12844w1.m84711e0(java.lang.Integer):void");
    }

    /* renamed from: a */
    public final void mo69176a(C12909l lVar) {
        m84707X(new C12848d(lVar));
    }

    /* renamed from: b */
    public final void mo69138b(int i) {
        C12866u uVar = this.f60307p;
        if (uVar.f60356a) {
            uVar.f60361f.f60370a.mo69138b(i);
        } else {
            m84707X(new C12856l(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public abstract C12781q mo69292b0(C12900j.C12901a aVar, C12960q0 q0Var);

    /* renamed from: c */
    public final void mo69139c(int i) {
        m84707X(new C12854j(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public abstract void mo69293c0();

    /* renamed from: d */
    public final void mo69140d(int i) {
        m84707X(new C12855k(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public abstract C12537b1 mo69294d0();

    /* renamed from: e */
    public final void mo69141e(C12537b1 b1Var) {
        C12871w wVar = new C12871w(0);
        wVar.f60370a = new C12724k1();
        Runnable U = m84704U(wVar);
        if (U != null) {
            this.f60310s.mo69195b(b1Var, new C12960q0());
            U.run();
            return;
        }
        this.f60307p.f60361f.f60370a.mo69141e(b1Var);
        synchronized (this.f60301j) {
            this.f60307p = this.f60307p.mo69618b();
        }
    }

    /* renamed from: f */
    public final void mo69142f(C12997u uVar) {
        m84707X(new C12850f(uVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final void mo69606f0(ReqT reqt) {
        C12866u uVar = this.f60307p;
        if (uVar.f60356a) {
            uVar.f60361f.f60370a.mo69178g(this.f60292a.mo69792j(reqt));
        } else {
            m84707X(new C12857m(reqt));
        }
    }

    public final void flush() {
        C12866u uVar = this.f60307p;
        if (uVar.f60356a) {
            uVar.f60361f.f60370a.flush();
        } else {
            m84707X(new C12851g());
        }
    }

    /* renamed from: g */
    public final void mo69178g(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: g0 */
    public final C12960q0 mo69607g0(C12960q0 q0Var, int i) {
        C12960q0 q0Var2 = new C12960q0();
        q0Var2.mo69767l(q0Var);
        if (i > 0) {
            q0Var2.mo69768o(f60288w, String.valueOf(i));
        }
        return q0Var2;
    }

    /* renamed from: h */
    public final void mo69143h(boolean z) {
        m84707X(new C12852h(z));
    }

    /* renamed from: i */
    public final void mo69179i(String str) {
        m84707X(new C12846b(str));
    }

    /* renamed from: j */
    public void mo69144j(C12810u0 u0Var) {
        C12866u uVar;
        synchronized (this.f60301j) {
            u0Var.mo69569b("closed", this.f60306o);
            uVar = this.f60307p;
        }
        if (uVar.f60361f != null) {
            C12810u0 u0Var2 = new C12810u0();
            uVar.f60361f.f60370a.mo69144j(u0Var2);
            u0Var.mo69569b("committed", u0Var2);
            return;
        }
        C12810u0 u0Var3 = new C12810u0();
        for (C12871w wVar : uVar.f60358c) {
            C12810u0 u0Var4 = new C12810u0();
            wVar.f60370a.mo69144j(u0Var4);
            u0Var3.mo69568a(u0Var4);
        }
        u0Var.mo69569b("open", u0Var3);
    }

    /* renamed from: k */
    public final void mo69145k() {
        m84707X(new C12853i());
    }

    /* renamed from: l */
    public final void mo69146l(C12977s sVar) {
        m84707X(new C12849e(sVar));
    }

    /* renamed from: m */
    public final void mo69147m(C12785r rVar) {
        C12872x xVar;
        this.f60310s = rVar;
        C12537b1 d0 = mo69294d0();
        if (d0 != null) {
            mo69141e(d0);
            return;
        }
        synchronized (this.f60301j) {
            this.f60307p.f60357b.add(new C12858n());
        }
        boolean z = false;
        C12871w W = m84706W(0);
        if (this.f60299h == null) {
            z = true;
        }
        Preconditions.m5399z(z, "hedgingPolicy has been initialized unexpectedly");
        C12782q0 q0Var = this.f60297f.get();
        this.f60299h = q0Var;
        if (!C12782q0.f60154d.equals(q0Var)) {
            this.f60300i = true;
            this.f60298g = C12876x1.f60381f;
            C12862r rVar2 = null;
            synchronized (this.f60301j) {
                this.f60307p = this.f60307p.mo69617a(W);
                if (m84710a0(this.f60307p) && ((xVar = this.f60305n) == null || xVar.mo69628a())) {
                    rVar2 = new C12862r(this.f60301j);
                    this.f60312u = rVar2;
                }
            }
            if (rVar2 != null) {
                rVar2.mo69614c(this.f60294c.schedule(new C12863s(rVar2), this.f60299h.f60156b, TimeUnit.NANOSECONDS));
            }
        }
        m84708Y(W);
    }
}

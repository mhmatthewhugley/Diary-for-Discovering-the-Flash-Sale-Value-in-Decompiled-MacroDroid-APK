package p063b5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C6685j;
import com.bumptech.glide.load.engine.GlideException;
import java.util.List;
import java.util.concurrent.Executor;
import p067c5.C2277g;
import p067c5.C2278h;
import p079d5.C7261c;
import p083e4.C7273e;
import p083e4.C7275g;
import p090f5.C7316k;
import p096g5.C7339a;
import p096g5.C7348c;
import p102h4.C7376a;
import p120k4.C7587c;
import p174u4.C10292a;

/* renamed from: b5.h */
/* compiled from: SingleRequest */
public final class C2255h<R> implements C2250c, C2277g, C2254g, C7339a.C7345f {

    /* renamed from: T */
    private static final Pools.Pool<C2255h<?>> f6914T = C7339a.m30345d(150, new C2256a());

    /* renamed from: U */
    private static final boolean f6915U = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private C2248a<?> f6916A;

    /* renamed from: B */
    private int f6917B;

    /* renamed from: C */
    private int f6918C;

    /* renamed from: D */
    private C7275g f6919D;

    /* renamed from: E */
    private C2278h<R> f6920E;
    @Nullable

    /* renamed from: F */
    private List<C2252e<R>> f6921F;

    /* renamed from: G */
    private C6685j f6922G;

    /* renamed from: H */
    private C7261c<? super R> f6923H;

    /* renamed from: I */
    private Executor f6924I;

    /* renamed from: J */
    private C7587c<R> f6925J;

    /* renamed from: K */
    private C6685j.C6691d f6926K;

    /* renamed from: L */
    private long f6927L;
    @GuardedBy("this")

    /* renamed from: M */
    private C2257b f6928M;

    /* renamed from: N */
    private Drawable f6929N;

    /* renamed from: O */
    private Drawable f6930O;

    /* renamed from: P */
    private Drawable f6931P;

    /* renamed from: Q */
    private int f6932Q;

    /* renamed from: R */
    private int f6933R;
    @Nullable

    /* renamed from: S */
    private RuntimeException f6934S;

    /* renamed from: a */
    private boolean f6935a;
    @Nullable

    /* renamed from: c */
    private final String f6936c;

    /* renamed from: d */
    private final C7348c f6937d;
    @Nullable

    /* renamed from: f */
    private C2252e<R> f6938f;

    /* renamed from: g */
    private C2251d f6939g;

    /* renamed from: o */
    private Context f6940o;

    /* renamed from: p */
    private C7273e f6941p;
    @Nullable

    /* renamed from: s */
    private Object f6942s;

    /* renamed from: z */
    private Class<R> f6943z;

    /* renamed from: b5.h$a */
    /* compiled from: SingleRequest */
    class C2256a implements C7339a.C7343d<C2255h<?>> {
        C2256a() {
        }

        /* renamed from: a */
        public C2255h<?> create() {
            return new C2255h<>();
        }
    }

    /* renamed from: b5.h$b */
    /* compiled from: SingleRequest */
    private enum C2257b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    C2255h() {
        this.f6936c = f6915U ? String.valueOf(super.hashCode()) : null;
        this.f6937d = C7348c.m30358a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    private synchronized void m9249A(GlideException glideException, int i) {
        boolean z;
        this.f6937d.mo37326c();
        glideException.mo32987k(this.f6934S);
        int g = this.f6941p.mo37164g();
        if (g <= i) {
            Log.w("Glide", "Load failed for " + this.f6942s + " with size [" + this.f6932Q + "x" + this.f6933R + "]", glideException);
            if (g <= 4) {
                glideException.mo32983g("Glide");
            }
        }
        this.f6926K = null;
        this.f6928M = C2257b.FAILED;
        boolean z2 = true;
        this.f6935a = true;
        try {
            List<C2252e<R>> list = this.f6921F;
            if (list != null) {
                z = false;
                for (C2252e<R> a : list) {
                    z |= a.mo24542a(glideException, this.f6942s, this.f6920E, m9262s());
                }
            } else {
                z = false;
            }
            C2252e<R> eVar = this.f6938f;
            if (eVar == null || !eVar.mo24542a(glideException, this.f6942s, this.f6920E, m9262s())) {
                z2 = false;
            }
            if (!z && !z2) {
                m9252D();
            }
            this.f6935a = false;
            m9267x();
        } catch (Throwable th) {
            this.f6935a = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f A[Catch:{ all -> 0x00b1 }] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m9250B(p120k4.C7587c<R> r11, R r12, p102h4.C7376a r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r6 = r10.m9262s()     // Catch:{ all -> 0x00b5 }
            b5.h$b r0 = p063b5.C2255h.C2257b.COMPLETE     // Catch:{ all -> 0x00b5 }
            r10.f6928M = r0     // Catch:{ all -> 0x00b5 }
            r10.f6925J = r11     // Catch:{ all -> 0x00b5 }
            e4.e r11 = r10.f6941p     // Catch:{ all -> 0x00b5 }
            int r11 = r11.mo37164g()     // Catch:{ all -> 0x00b5 }
            r0 = 3
            if (r11 > r0) goto L_0x0062
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b5 }
            r11.<init>()     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "Finished loading "
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.Class r0 = r12.getClass()     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x00b5 }
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = " from "
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            r11.append(r13)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = " for "
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.Object r0 = r10.f6942s     // Catch:{ all -> 0x00b5 }
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = " with size ["
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            int r0 = r10.f6932Q     // Catch:{ all -> 0x00b5 }
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "x"
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            int r0 = r10.f6933R     // Catch:{ all -> 0x00b5 }
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = "] in "
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            long r0 = r10.f6927L     // Catch:{ all -> 0x00b5 }
            double r0 = p090f5.C7311f.m30187a(r0)     // Catch:{ all -> 0x00b5 }
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = " ms"
            r11.append(r0)     // Catch:{ all -> 0x00b5 }
        L_0x0062:
            r11 = 1
            r10.f6935a = r11     // Catch:{ all -> 0x00b5 }
            r7 = 0
            java.util.List<b5.e<R>> r0 = r10.f6921F     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0088
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b1 }
            r9 = 0
        L_0x006f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b1 }
            b5.e r0 = (p063b5.C2252e) r0     // Catch:{ all -> 0x00b1 }
            java.lang.Object r2 = r10.f6942s     // Catch:{ all -> 0x00b1 }
            c5.h<R> r3 = r10.f6920E     // Catch:{ all -> 0x00b1 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo24543b(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b1 }
            r9 = r9 | r0
            goto L_0x006f
        L_0x0088:
            r9 = 0
        L_0x0089:
            b5.e<R> r0 = r10.f6938f     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x009b
            java.lang.Object r2 = r10.f6942s     // Catch:{ all -> 0x00b1 }
            c5.h<R> r3 = r10.f6920E     // Catch:{ all -> 0x00b1 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo24543b(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r11 = 0
        L_0x009c:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00aa
            d5.c<? super R> r11 = r10.f6923H     // Catch:{ all -> 0x00b1 }
            d5.b r11 = r11.mo37126a(r13, r6)     // Catch:{ all -> 0x00b1 }
            c5.h<R> r13 = r10.f6920E     // Catch:{ all -> 0x00b1 }
            r13.mo24592e(r12, r11)     // Catch:{ all -> 0x00b1 }
        L_0x00aa:
            r10.f6935a = r7     // Catch:{ all -> 0x00b5 }
            r10.m9268y()     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)
            return
        L_0x00b1:
            r11 = move-exception
            r10.f6935a = r7     // Catch:{ all -> 0x00b5 }
            throw r11     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2255h.m9250B(k4.c, java.lang.Object, h4.a):void");
    }

    /* renamed from: C */
    private void m9251C(C7587c<?> cVar) {
        this.f6922G.mo33069j(cVar);
        this.f6925J = null;
    }

    /* renamed from: D */
    private synchronized void m9252D() {
        if (m9255l()) {
            Drawable drawable = null;
            if (this.f6942s == null) {
                drawable = m9259p();
            }
            if (drawable == null) {
                drawable = m9258o();
            }
            if (drawable == null) {
                drawable = m9260q();
            }
            this.f6920E.mo24586h(drawable);
        }
    }

    /* renamed from: h */
    private void m9253h() {
        if (this.f6935a) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m9254k() {
        C2251d dVar = this.f6939g;
        return dVar == null || dVar.mo24534h(this);
    }

    /* renamed from: l */
    private boolean m9255l() {
        C2251d dVar = this.f6939g;
        return dVar == null || dVar.mo24527b(this);
    }

    /* renamed from: m */
    private boolean m9256m() {
        C2251d dVar = this.f6939g;
        return dVar == null || dVar.mo24539k(this);
    }

    /* renamed from: n */
    private void m9257n() {
        m9253h();
        this.f6937d.mo37326c();
        this.f6920E.mo24596f(this);
        C6685j.C6691d dVar = this.f6926K;
        if (dVar != null) {
            dVar.mo33074a();
            this.f6926K = null;
        }
    }

    /* renamed from: o */
    private Drawable m9258o() {
        if (this.f6929N == null) {
            Drawable n = this.f6916A.mo24511n();
            this.f6929N = n;
            if (n == null && this.f6916A.mo24509l() > 0) {
                this.f6929N = m9264u(this.f6916A.mo24509l());
            }
        }
        return this.f6929N;
    }

    /* renamed from: p */
    private Drawable m9259p() {
        if (this.f6931P == null) {
            Drawable o = this.f6916A.mo24512o();
            this.f6931P = o;
            if (o == null && this.f6916A.mo24514p() > 0) {
                this.f6931P = m9264u(this.f6916A.mo24514p());
            }
        }
        return this.f6931P;
    }

    /* renamed from: q */
    private Drawable m9260q() {
        if (this.f6930O == null) {
            Drawable u = this.f6916A.mo24521u();
            this.f6930O = u;
            if (u == null && this.f6916A.mo24522v() > 0) {
                this.f6930O = m9264u(this.f6916A.mo24522v());
            }
        }
        return this.f6930O;
    }

    /* renamed from: r */
    private synchronized void m9261r(Context context, C7273e eVar, Object obj, Class<R> cls, C2248a<?> aVar, int i, int i2, C7275g gVar, C2278h<R> hVar, C2252e<R> eVar2, @Nullable List<C2252e<R>> list, C2251d dVar, C6685j jVar, C7261c<? super R> cVar, Executor executor) {
        this.f6940o = context;
        this.f6941p = eVar;
        this.f6942s = obj;
        this.f6943z = cls;
        this.f6916A = aVar;
        this.f6917B = i;
        this.f6918C = i2;
        this.f6919D = gVar;
        this.f6920E = hVar;
        this.f6938f = eVar2;
        this.f6921F = list;
        this.f6939g = dVar;
        this.f6922G = jVar;
        this.f6923H = cVar;
        this.f6924I = executor;
        this.f6928M = C2257b.PENDING;
        if (this.f6934S == null && eVar.mo37166i()) {
            this.f6934S = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: s */
    private boolean m9262s() {
        C2251d dVar = this.f6939g;
        return dVar == null || !dVar.mo24526a();
    }

    /* renamed from: t */
    private synchronized boolean m9263t(C2255h<?> hVar) {
        boolean z;
        synchronized (hVar) {
            List<C2252e<R>> list = this.f6921F;
            z = false;
            int size = list == null ? 0 : list.size();
            List<C2252e<R>> list2 = hVar.f6921F;
            if (size == (list2 == null ? 0 : list2.size())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: u */
    private Drawable m9264u(@DrawableRes int i) {
        return C10292a.m40438a(this.f6941p, i, this.f6916A.mo24473B() != null ? this.f6916A.mo24473B() : this.f6940o.getTheme());
    }

    /* renamed from: v */
    private void m9265v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f6936c);
    }

    /* renamed from: w */
    private static int m9266w(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: x */
    private void m9267x() {
        C2251d dVar = this.f6939g;
        if (dVar != null) {
            dVar.mo24535i(this);
        }
    }

    /* renamed from: y */
    private void m9268y() {
        C2251d dVar = this.f6939g;
        if (dVar != null) {
            dVar.mo24530d(this);
        }
    }

    /* renamed from: z */
    public static <R> C2255h<R> m9269z(Context context, C7273e eVar, Object obj, Class<R> cls, C2248a<?> aVar, int i, int i2, C7275g gVar, C2278h<R> hVar, C2252e<R> eVar2, @Nullable List<C2252e<R>> list, C2251d dVar, C6685j jVar, C7261c<? super R> cVar, Executor executor) {
        C2255h<R> acquire = f6914T.acquire();
        if (acquire == null) {
            acquire = new C2255h<>();
        }
        acquire.m9261r(context, eVar, obj, cls, aVar, i, i2, gVar, hVar, eVar2, list, dVar, jVar, cVar, executor);
        return acquire;
    }

    /* renamed from: a */
    public synchronized void mo24544a(C7587c<?> cVar, C7376a aVar) {
        this.f6937d.mo37326c();
        this.f6926K = null;
        if (cVar == null) {
            mo24545b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f6943z + " inside, but instead got null."));
            return;
        }
        Object obj = cVar.get();
        if (obj != null) {
            if (this.f6943z.isAssignableFrom(obj.getClass())) {
                if (!m9256m()) {
                    m9251C(cVar);
                    this.f6928M = C2257b.COMPLETE;
                    return;
                }
                m9250B(cVar, obj, aVar);
                return;
            }
        }
        m9251C(cVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f6943z);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(cVar);
        sb.append("}.");
        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        mo24545b(new GlideException(sb.toString()));
    }

    /* renamed from: b */
    public synchronized void mo24545b(GlideException glideException) {
        m9249A(glideException, 5);
    }

    /* renamed from: c */
    public synchronized boolean mo24528c() {
        return isComplete();
    }

    public synchronized void clear() {
        m9253h();
        this.f6937d.mo37326c();
        C2257b bVar = this.f6928M;
        C2257b bVar2 = C2257b.CLEARED;
        if (bVar != bVar2) {
            m9257n();
            C7587c<R> cVar = this.f6925J;
            if (cVar != null) {
                m9251C(cVar);
            }
            if (m9254k()) {
                this.f6920E.mo24584d(m9260q());
            }
            this.f6928M = bVar2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f6, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo24546d(int r24, int r25) {
        /*
            r23 = this;
            r15 = r23
            monitor-enter(r23)
            g5.c r0 = r15.f6937d     // Catch:{ all -> 0x00fd }
            r0.mo37326c()     // Catch:{ all -> 0x00fd }
            boolean r0 = f6915U     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = "Got onSizeReady in "
            r1.append(r2)     // Catch:{ all -> 0x00fd }
            long r2 = r15.f6927L     // Catch:{ all -> 0x00fd }
            double r2 = p090f5.C7311f.m30187a(r2)     // Catch:{ all -> 0x00fd }
            r1.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fd }
            r15.m9265v(r1)     // Catch:{ all -> 0x00fd }
        L_0x0026:
            b5.h$b r1 = r15.f6928M     // Catch:{ all -> 0x00fd }
            b5.h$b r2 = p063b5.C2255h.C2257b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00fd }
            if (r1 == r2) goto L_0x002e
            monitor-exit(r23)
            return
        L_0x002e:
            b5.h$b r14 = p063b5.C2255h.C2257b.RUNNING     // Catch:{ all -> 0x00fd }
            r15.f6928M = r14     // Catch:{ all -> 0x00fd }
            b5.a<?> r1 = r15.f6916A     // Catch:{ all -> 0x00fd }
            float r1 = r1.mo24472A()     // Catch:{ all -> 0x00fd }
            r2 = r24
            int r2 = m9266w(r2, r1)     // Catch:{ all -> 0x00fd }
            r15.f6932Q = r2     // Catch:{ all -> 0x00fd }
            r2 = r25
            int r1 = m9266w(r2, r1)     // Catch:{ all -> 0x00fd }
            r15.f6933R = r1     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x0064
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = "finished setup for calling load in "
            r1.append(r2)     // Catch:{ all -> 0x00fd }
            long r2 = r15.f6927L     // Catch:{ all -> 0x00fd }
            double r2 = p090f5.C7311f.m30187a(r2)     // Catch:{ all -> 0x00fd }
            r1.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fd }
            r15.m9265v(r1)     // Catch:{ all -> 0x00fd }
        L_0x0064:
            com.bumptech.glide.load.engine.j r1 = r15.f6922G     // Catch:{ all -> 0x00fd }
            e4.e r2 = r15.f6941p     // Catch:{ all -> 0x00fd }
            java.lang.Object r3 = r15.f6942s     // Catch:{ all -> 0x00fd }
            b5.a<?> r4 = r15.f6916A     // Catch:{ all -> 0x00fd }
            h4.e r4 = r4.mo24525z()     // Catch:{ all -> 0x00fd }
            int r5 = r15.f6932Q     // Catch:{ all -> 0x00fd }
            int r6 = r15.f6933R     // Catch:{ all -> 0x00fd }
            b5.a<?> r7 = r15.f6916A     // Catch:{ all -> 0x00fd }
            java.lang.Class r7 = r7.mo24524y()     // Catch:{ all -> 0x00fd }
            java.lang.Class<R> r8 = r15.f6943z     // Catch:{ all -> 0x00fd }
            e4.g r9 = r15.f6919D     // Catch:{ all -> 0x00fd }
            b5.a<?> r10 = r15.f6916A     // Catch:{ all -> 0x00fd }
            k4.a r10 = r10.mo24507k()     // Catch:{ all -> 0x00fd }
            b5.a<?> r11 = r15.f6916A     // Catch:{ all -> 0x00fd }
            java.util.Map r11 = r11.mo24474C()     // Catch:{ all -> 0x00fd }
            b5.a<?> r12 = r15.f6916A     // Catch:{ all -> 0x00fd }
            boolean r12 = r12.mo24481N()     // Catch:{ all -> 0x00fd }
            b5.a<?> r13 = r15.f6916A     // Catch:{ all -> 0x00fd }
            boolean r13 = r13.mo24479J()     // Catch:{ all -> 0x00fd }
            r16 = r14
            b5.a<?> r14 = r15.f6916A     // Catch:{ all -> 0x00fd }
            h4.g r14 = r14.mo24517r()     // Catch:{ all -> 0x00fd }
            r21 = r0
            b5.a<?> r0 = r15.f6916A     // Catch:{ all -> 0x00fd }
            boolean r0 = r0.mo24477G()     // Catch:{ all -> 0x00fd }
            r24 = r0
            b5.a<?> r0 = r15.f6916A     // Catch:{ all -> 0x00fd }
            boolean r0 = r0.mo24476E()     // Catch:{ all -> 0x00fd }
            r25 = r0
            b5.a<?> r0 = r15.f6916A     // Catch:{ all -> 0x00fd }
            boolean r17 = r0.mo24475D()     // Catch:{ all -> 0x00fd }
            b5.a<?> r0 = r15.f6916A     // Catch:{ all -> 0x00fd }
            boolean r18 = r0.mo24516q()     // Catch:{ all -> 0x00fd }
            java.util.concurrent.Executor r0 = r15.f6924I     // Catch:{ all -> 0x00fd }
            r22 = r16
            r15 = r24
            r16 = r25
            r19 = r23
            r20 = r0
            com.bumptech.glide.load.engine.j$d r0 = r1.mo33068f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00f9 }
            r1 = r23
            r1.f6926K = r0     // Catch:{ all -> 0x00f7 }
            b5.h$b r0 = r1.f6928M     // Catch:{ all -> 0x00f7 }
            r2 = r22
            if (r0 == r2) goto L_0x00d9
            r0 = 0
            r1.f6926K = r0     // Catch:{ all -> 0x00f7 }
        L_0x00d9:
            if (r21 == 0) goto L_0x00f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = "finished onSizeReady in "
            r0.append(r2)     // Catch:{ all -> 0x00f7 }
            long r2 = r1.f6927L     // Catch:{ all -> 0x00f7 }
            double r2 = p090f5.C7311f.m30187a(r2)     // Catch:{ all -> 0x00f7 }
            r0.append(r2)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            r1.m9265v(r0)     // Catch:{ all -> 0x00f7 }
        L_0x00f5:
            monitor-exit(r23)
            return
        L_0x00f7:
            r0 = move-exception
            goto L_0x00ff
        L_0x00f9:
            r0 = move-exception
            r1 = r23
            goto L_0x00ff
        L_0x00fd:
            r0 = move-exception
            r1 = r15
        L_0x00ff:
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2255h.mo24546d(int, int):void");
    }

    /* renamed from: e */
    public synchronized boolean mo24531e(C2250c cVar) {
        boolean z = false;
        if (!(cVar instanceof C2255h)) {
            return false;
        }
        C2255h hVar = (C2255h) cVar;
        synchronized (hVar) {
            if (this.f6917B == hVar.f6917B && this.f6918C == hVar.f6918C && C7316k.m30207b(this.f6942s, hVar.f6942s) && this.f6943z.equals(hVar.f6943z) && this.f6916A.equals(hVar.f6916A) && this.f6919D == hVar.f6919D && m9263t(hVar)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: f */
    public synchronized boolean mo24532f() {
        return this.f6928M == C2257b.FAILED;
    }

    /* renamed from: g */
    public synchronized boolean mo24533g() {
        return this.f6928M == C2257b.CLEARED;
    }

    @NonNull
    /* renamed from: i */
    public C7348c mo24547i() {
        return this.f6937d;
    }

    public synchronized boolean isComplete() {
        return this.f6928M == C2257b.COMPLETE;
    }

    public synchronized boolean isRunning() {
        C2257b bVar;
        bVar = this.f6928M;
        return bVar == C2257b.RUNNING || bVar == C2257b.WAITING_FOR_SIZE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo24538j() {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.m9253h()     // Catch:{ all -> 0x00a5 }
            g5.c r0 = r4.f6937d     // Catch:{ all -> 0x00a5 }
            r0.mo37326c()     // Catch:{ all -> 0x00a5 }
            long r0 = p090f5.C7311f.m30188b()     // Catch:{ all -> 0x00a5 }
            r4.f6927L = r0     // Catch:{ all -> 0x00a5 }
            java.lang.Object r0 = r4.f6942s     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x003a
            int r0 = r4.f6917B     // Catch:{ all -> 0x00a5 }
            int r1 = r4.f6918C     // Catch:{ all -> 0x00a5 }
            boolean r0 = p090f5.C7316k.m30223r(r0, r1)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0025
            int r0 = r4.f6917B     // Catch:{ all -> 0x00a5 }
            r4.f6932Q = r0     // Catch:{ all -> 0x00a5 }
            int r0 = r4.f6918C     // Catch:{ all -> 0x00a5 }
            r4.f6933R = r0     // Catch:{ all -> 0x00a5 }
        L_0x0025:
            android.graphics.drawable.Drawable r0 = r4.m9259p()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x002d
            r0 = 5
            goto L_0x002e
        L_0x002d:
            r0 = 3
        L_0x002e:
            com.bumptech.glide.load.engine.GlideException r1 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "Received null model"
            r1.<init>(r2)     // Catch:{ all -> 0x00a5 }
            r4.m9249A(r1, r0)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return
        L_0x003a:
            b5.h$b r0 = r4.f6928M     // Catch:{ all -> 0x00a5 }
            b5.h$b r1 = p063b5.C2255h.C2257b.RUNNING     // Catch:{ all -> 0x00a5 }
            if (r0 == r1) goto L_0x009d
            b5.h$b r2 = p063b5.C2255h.C2257b.COMPLETE     // Catch:{ all -> 0x00a5 }
            if (r0 != r2) goto L_0x004d
            k4.c<R> r0 = r4.f6925J     // Catch:{ all -> 0x00a5 }
            h4.a r1 = p102h4.C7376a.MEMORY_CACHE     // Catch:{ all -> 0x00a5 }
            r4.mo24544a(r0, r1)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r4)
            return
        L_0x004d:
            b5.h$b r0 = p063b5.C2255h.C2257b.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a5 }
            r4.f6928M = r0     // Catch:{ all -> 0x00a5 }
            int r2 = r4.f6917B     // Catch:{ all -> 0x00a5 }
            int r3 = r4.f6918C     // Catch:{ all -> 0x00a5 }
            boolean r2 = p090f5.C7316k.m30223r(r2, r3)     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x0063
            int r2 = r4.f6917B     // Catch:{ all -> 0x00a5 }
            int r3 = r4.f6918C     // Catch:{ all -> 0x00a5 }
            r4.mo24546d(r2, r3)     // Catch:{ all -> 0x00a5 }
            goto L_0x0068
        L_0x0063:
            c5.h<R> r2 = r4.f6920E     // Catch:{ all -> 0x00a5 }
            r2.mo24595a(r4)     // Catch:{ all -> 0x00a5 }
        L_0x0068:
            b5.h$b r2 = r4.f6928M     // Catch:{ all -> 0x00a5 }
            if (r2 == r1) goto L_0x006e
            if (r2 != r0) goto L_0x007d
        L_0x006e:
            boolean r0 = r4.m9255l()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x007d
            c5.h<R> r0 = r4.f6920E     // Catch:{ all -> 0x00a5 }
            android.graphics.drawable.Drawable r1 = r4.m9260q()     // Catch:{ all -> 0x00a5 }
            r0.mo24582b(r1)     // Catch:{ all -> 0x00a5 }
        L_0x007d:
            boolean r0 = f6915U     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x009b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r0.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "finished run method in "
            r0.append(r1)     // Catch:{ all -> 0x00a5 }
            long r1 = r4.f6927L     // Catch:{ all -> 0x00a5 }
            double r1 = p090f5.C7311f.m30187a(r1)     // Catch:{ all -> 0x00a5 }
            r0.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a5 }
            r4.m9265v(r0)     // Catch:{ all -> 0x00a5 }
        L_0x009b:
            monitor-exit(r4)
            return
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "Cannot restart a running request"
            r0.<init>(r1)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2255h.mo24538j():void");
    }

    public synchronized void recycle() {
        m9253h();
        this.f6940o = null;
        this.f6941p = null;
        this.f6942s = null;
        this.f6943z = null;
        this.f6916A = null;
        this.f6917B = -1;
        this.f6918C = -1;
        this.f6920E = null;
        this.f6921F = null;
        this.f6938f = null;
        this.f6939g = null;
        this.f6923H = null;
        this.f6926K = null;
        this.f6929N = null;
        this.f6930O = null;
        this.f6931P = null;
        this.f6932Q = -1;
        this.f6933R = -1;
        this.f6934S = null;
        f6914T.release(this);
    }
}

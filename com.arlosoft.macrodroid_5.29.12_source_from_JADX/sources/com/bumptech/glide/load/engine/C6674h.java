package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C6671f;
import com.bumptech.glide.load.engine.C6683i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p083e4.C7273e;
import p083e4.C7275g;
import p090f5.C7311f;
import p096g5.C7339a;
import p096g5.C7347b;
import p096g5.C7348c;
import p102h4.C7376a;
import p102h4.C7380e;
import p102h4.C7381f;
import p102h4.C7384g;
import p102h4.C7386i;
import p102h4.C7387j;
import p108i4.C7401d;
import p108i4.C7403e;
import p120k4.C7580a;
import p120k4.C7586b;
import p120k4.C7587c;
import p132m4.C7910a;
import p164s4.C10207k;

/* renamed from: com.bumptech.glide.load.engine.h */
/* compiled from: DecodeJob */
class C6674h<R> implements C6671f.C6672a, Runnable, Comparable<C6674h<?>>, C7339a.C7345f {

    /* renamed from: A */
    private C7275g f15539A;

    /* renamed from: B */
    private C6699m f15540B;

    /* renamed from: C */
    private int f15541C;

    /* renamed from: D */
    private int f15542D;

    /* renamed from: E */
    private C7580a f15543E;

    /* renamed from: F */
    private C7384g f15544F;

    /* renamed from: G */
    private C6676b<R> f15545G;

    /* renamed from: H */
    private int f15546H;

    /* renamed from: I */
    private C6682h f15547I;

    /* renamed from: J */
    private C6681g f15548J;

    /* renamed from: K */
    private long f15549K;

    /* renamed from: L */
    private boolean f15550L;

    /* renamed from: M */
    private Object f15551M;

    /* renamed from: N */
    private Thread f15552N;

    /* renamed from: O */
    private C7380e f15553O;

    /* renamed from: P */
    private C7380e f15554P;

    /* renamed from: Q */
    private Object f15555Q;

    /* renamed from: R */
    private C7376a f15556R;

    /* renamed from: S */
    private C7401d<?> f15557S;

    /* renamed from: T */
    private volatile C6671f f15558T;

    /* renamed from: U */
    private volatile boolean f15559U;

    /* renamed from: V */
    private volatile boolean f15560V;

    /* renamed from: a */
    private final C6673g<R> f15561a = new C6673g<>();

    /* renamed from: c */
    private final List<Throwable> f15562c = new ArrayList();

    /* renamed from: d */
    private final C7348c f15563d = C7348c.m30358a();

    /* renamed from: f */
    private final C6679e f15564f;

    /* renamed from: g */
    private final Pools.Pool<C6674h<?>> f15565g;

    /* renamed from: o */
    private final C6678d<?> f15566o = new C6678d<>();

    /* renamed from: p */
    private final C6680f f15567p = new C6680f();

    /* renamed from: s */
    private C7273e f15568s;

    /* renamed from: z */
    private C7380e f15569z;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    /* compiled from: DecodeJob */
    static /* synthetic */ class C6675a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15570a;

        /* renamed from: b */
        static final /* synthetic */ int[] f15571b;

        /* renamed from: c */
        static final /* synthetic */ int[] f15572c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                h4.c[] r0 = p102h4.C7378c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15572c = r0
                r1 = 1
                h4.c r2 = p102h4.C7378c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f15572c     // Catch:{ NoSuchFieldError -> 0x001d }
                h4.c r3 = p102h4.C7378c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.h$h[] r2 = com.bumptech.glide.load.engine.C6674h.C6682h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f15571b = r2
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.C6674h.C6682h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f15571b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.C6674h.C6682h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f15571b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C6674h.C6682h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f15571b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C6674h.C6682h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f15571b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.C6674h.C6682h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.h$g[] r3 = com.bumptech.glide.load.engine.C6674h.C6681g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f15570a = r3
                com.bumptech.glide.load.engine.h$g r4 = com.bumptech.glide.load.engine.C6674h.C6681g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f15570a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.h$g r3 = com.bumptech.glide.load.engine.C6674h.C6681g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f15570a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.h$g r1 = com.bumptech.glide.load.engine.C6674h.C6681g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6674h.C6675a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$b */
    /* compiled from: DecodeJob */
    interface C6676b<R> {
        /* renamed from: a */
        void mo33049a(C7587c<R> cVar, C7376a aVar);

        /* renamed from: b */
        void mo33050b(GlideException glideException);

        /* renamed from: c */
        void mo33051c(C6674h<?> hVar);
    }

    /* renamed from: com.bumptech.glide.load.engine.h$c */
    /* compiled from: DecodeJob */
    private final class C6677c<Z> implements C6683i.C6684a<Z> {

        /* renamed from: a */
        private final C7376a f15573a;

        C6677c(C7376a aVar) {
            this.f15573a = aVar;
        }

        @NonNull
        /* renamed from: a */
        public C7587c<Z> mo33052a(@NonNull C7587c<Z> cVar) {
            return C6674h.this.mo33041C(this.f15573a, cVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$d */
    /* compiled from: DecodeJob */
    private static class C6678d<Z> {

        /* renamed from: a */
        private C7380e f15575a;

        /* renamed from: b */
        private C7386i<Z> f15576b;

        /* renamed from: c */
        private C6705r<Z> f15577c;

        C6678d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo33053a() {
            this.f15575a = null;
            this.f15576b = null;
            this.f15577c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo33054b(C6679e eVar, C7384g gVar) {
            C7347b.m30354a("DecodeJob.encode");
            try {
                eVar.mo33057a().mo37806a(this.f15575a, new C6670e(this.f15576b, this.f15577c, gVar));
            } finally {
                this.f15577c.mo33117e();
                C7347b.m30357d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo33055c() {
            return this.f15577c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <X> void mo33056d(C7380e eVar, C7386i<X> iVar, C6705r<X> rVar) {
            this.f15575a = eVar;
            this.f15576b = iVar;
            this.f15577c = rVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$e */
    /* compiled from: DecodeJob */
    interface C6679e {
        /* renamed from: a */
        C7910a mo33057a();
    }

    /* renamed from: com.bumptech.glide.load.engine.h$f */
    /* compiled from: DecodeJob */
    private static class C6680f {

        /* renamed from: a */
        private boolean f15578a;

        /* renamed from: b */
        private boolean f15579b;

        /* renamed from: c */
        private boolean f15580c;

        C6680f() {
        }

        /* renamed from: a */
        private boolean m25331a(boolean z) {
            return (this.f15580c || z || this.f15579b) && this.f15578a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo33058b() {
            this.f15579b = true;
            return m25331a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo33059c() {
            this.f15580c = true;
            return m25331a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized boolean mo33060d(boolean z) {
            this.f15578a = true;
            return m25331a(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo33061e() {
            this.f15579b = false;
            this.f15578a = false;
            this.f15580c = false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$g */
    /* compiled from: DecodeJob */
    private enum C6681g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h */
    /* compiled from: DecodeJob */
    private enum C6682h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C6674h(C6679e eVar, Pools.Pool<C6674h<?>> pool) {
        this.f15564f = eVar;
        this.f15565g = pool;
    }

    /* renamed from: A */
    private void m25293A() {
        if (this.f15567p.mo33059c()) {
            m25294F();
        }
    }

    /* renamed from: F */
    private void m25294F() {
        this.f15567p.mo33061e();
        this.f15566o.mo33053a();
        this.f15561a.mo33017a();
        this.f15559U = false;
        this.f15568s = null;
        this.f15569z = null;
        this.f15544F = null;
        this.f15539A = null;
        this.f15540B = null;
        this.f15545G = null;
        this.f15547I = null;
        this.f15558T = null;
        this.f15552N = null;
        this.f15553O = null;
        this.f15555Q = null;
        this.f15556R = null;
        this.f15557S = null;
        this.f15549K = 0;
        this.f15560V = false;
        this.f15551M = null;
        this.f15562c.clear();
        this.f15565g.release(this);
    }

    /* renamed from: G */
    private void m25295G() {
        this.f15552N = Thread.currentThread();
        this.f15549K = C7311f.m30188b();
        boolean z = false;
        while (!this.f15560V && this.f15558T != null && !(z = this.f15558T.mo33005a())) {
            this.f15547I = m25303n(this.f15547I);
            this.f15558T = m25302m();
            if (this.f15547I == C6682h.SOURCE) {
                mo33015d();
                return;
            }
        }
        if ((this.f15547I == C6682h.FINISHED || this.f15560V) && !z) {
            m25310x();
        }
    }

    /* renamed from: H */
    private <Data, ResourceType> C7587c<R> m25296H(Data data, C7376a aVar, C6704q<Data, ResourceType, R> qVar) throws GlideException {
        C7384g o = m25304o(aVar);
        C7403e l = this.f15568s.mo37165h().mo32969l(data);
        try {
            return qVar.mo33115a(l, o, this.f15541C, this.f15542D, new C6677c(aVar));
        } finally {
            l.mo37447b();
        }
    }

    /* renamed from: I */
    private void m25297I() {
        int i = C6675a.f15570a[this.f15548J.ordinal()];
        if (i == 1) {
            this.f15547I = m25303n(C6682h.INITIALIZE);
            this.f15558T = m25302m();
            m25295G();
        } else if (i == 2) {
            m25295G();
        } else if (i == 3) {
            m25301l();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f15548J);
        }
    }

    /* renamed from: J */
    private void m25298J() {
        Throwable th;
        this.f15563d.mo37326c();
        if (this.f15559U) {
            if (this.f15562c.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f15562c;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f15559U = true;
    }

    /* renamed from: j */
    private <Data> C7587c<R> m25299j(C7401d<?> dVar, Data data, C7376a aVar) throws GlideException {
        if (data == null) {
            dVar.mo37435b();
            return null;
        }
        try {
            long b = C7311f.m30188b();
            C7587c<R> k = m25300k(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m25306s("Decoded result " + k, b);
            }
            return k;
        } finally {
            dVar.mo37435b();
        }
    }

    /* renamed from: k */
    private <Data> C7587c<R> m25300k(Data data, C7376a aVar) throws GlideException {
        return m25296H(data, aVar, this.f15561a.mo33024h(data.getClass()));
    }

    /* renamed from: l */
    private void m25301l() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f15549K;
            m25307t("Retrieved data", j, "data: " + this.f15555Q + ", cache key: " + this.f15553O + ", fetcher: " + this.f15557S);
        }
        C7587c<R> cVar = null;
        try {
            cVar = m25299j(this.f15557S, this.f15555Q, this.f15556R);
        } catch (GlideException e) {
            e.mo32985i(this.f15554P, this.f15556R);
            this.f15562c.add(e);
        }
        if (cVar != null) {
            m25309w(cVar, this.f15556R);
        } else {
            m25295G();
        }
    }

    /* renamed from: m */
    private C6671f m25302m() {
        int i = C6675a.f15571b[this.f15547I.ordinal()];
        if (i == 1) {
            return new C6707s(this.f15561a, this);
        }
        if (i == 2) {
            return new C6668c(this.f15561a, this);
        }
        if (i == 3) {
            return new C6711v(this.f15561a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f15547I);
    }

    /* renamed from: n */
    private C6682h m25303n(C6682h hVar) {
        int i = C6675a.f15571b[hVar.ordinal()];
        if (i == 1) {
            return this.f15543E.mo37655a() ? C6682h.DATA_CACHE : m25303n(C6682h.DATA_CACHE);
        }
        if (i == 2) {
            return this.f15550L ? C6682h.FINISHED : C6682h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return C6682h.FINISHED;
        }
        if (i == 5) {
            return this.f15543E.mo37656b() ? C6682h.RESOURCE_CACHE : m25303n(C6682h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    @NonNull
    /* renamed from: o */
    private C7384g m25304o(C7376a aVar) {
        C7384g gVar = this.f15544F;
        if (Build.VERSION.SDK_INT < 26) {
            return gVar;
        }
        boolean z = aVar == C7376a.RESOURCE_DISK_CACHE || this.f15561a.mo33039w();
        C7381f fVar = C10207k.f23322i;
        Boolean bool = (Boolean) gVar.mo37379c(fVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return gVar;
        }
        C7384g gVar2 = new C7384g();
        gVar2.mo37380d(this.f15544F);
        gVar2.mo37381e(fVar, Boolean.valueOf(z));
        return gVar2;
    }

    /* renamed from: q */
    private int m25305q() {
        return this.f15539A.ordinal();
    }

    /* renamed from: s */
    private void m25306s(String str, long j) {
        m25307t(str, j, (String) null);
    }

    /* renamed from: t */
    private void m25307t(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C7311f.m30187a(j));
        sb.append(", load key: ");
        sb.append(this.f15540B);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    /* renamed from: v */
    private void m25308v(C7587c<R> cVar, C7376a aVar) {
        m25298J();
        this.f15545G.mo33049a(cVar, aVar);
    }

    /* renamed from: w */
    private void m25309w(C7587c<R> cVar, C7376a aVar) {
        if (cVar instanceof C7586b) {
            ((C7586b) cVar).mo37659a();
        }
        C6705r<R> rVar = null;
        C6705r<R> rVar2 = cVar;
        if (this.f15566o.mo33055c()) {
            C6705r<R> c = C6705r.m25399c(cVar);
            rVar = c;
            rVar2 = c;
        }
        m25308v(rVar2, aVar);
        this.f15547I = C6682h.ENCODE;
        try {
            if (this.f15566o.mo33055c()) {
                this.f15566o.mo33054b(this.f15564f, this.f15544F);
            }
            m25311y();
        } finally {
            if (rVar != null) {
                rVar.mo33117e();
            }
        }
    }

    /* renamed from: x */
    private void m25310x() {
        m25298J();
        this.f15545G.mo33050b(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f15562c)));
        m25293A();
    }

    /* renamed from: y */
    private void m25311y() {
        if (this.f15567p.mo33058b()) {
            m25294F();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.engine.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.engine.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.engine.t} */
    /* JADX WARNING: type inference failed for: r12v5, types: [h4.e] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.NonNull
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> p120k4.C7587c<Z> mo33041C(p102h4.C7376a r12, @androidx.annotation.NonNull p120k4.C7587c<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            h4.a r0 = p102h4.C7376a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.g<R> r0 = r11.f15561a
            h4.j r0 = r0.mo33034r(r8)
            e4.e r2 = r11.f15568s
            int r3 = r11.f15541C
            int r4 = r11.f15542D
            k4.c r2 = r0.mo37386a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.recycle()
        L_0x002b:
            com.bumptech.glide.load.engine.g<R> r13 = r11.f15561a
            boolean r13 = r13.mo33038v(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.g<R> r13 = r11.f15561a
            h4.i r1 = r13.mo33030n(r0)
            h4.g r13 = r11.f15544F
            h4.c r13 = r1.mo37385b(r13)
            goto L_0x0042
        L_0x0040:
            h4.c r13 = p102h4.C7378c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.engine.g<R> r1 = r11.f15561a
            h4.e r2 = r11.f15553O
            boolean r1 = r1.mo33040x(r2)
            r2 = 1
            r1 = r1 ^ r2
            k4.a r3 = r11.f15543E
            boolean r12 = r3.mo37658d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.engine.C6674h.C6675a.f15572c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.engine.t r12 = new com.bumptech.glide.load.engine.t
            com.bumptech.glide.load.engine.g<R> r13 = r11.f15561a
            l4.b r2 = r13.mo33018b()
            h4.e r3 = r11.f15553O
            h4.e r4 = r11.f15569z
            int r5 = r11.f15541C
            int r6 = r11.f15542D
            h4.g r9 = r11.f15544F
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.engine.d r12 = new com.bumptech.glide.load.engine.d
            h4.e r13 = r11.f15553O
            h4.e r1 = r11.f15569z
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.engine.r r0 = com.bumptech.glide.load.engine.C6705r.m25399c(r0)
            com.bumptech.glide.load.engine.h$d<?> r13 = r11.f15566o
            r13.mo33056d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6674h.mo33041C(h4.a, k4.c):k4.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo33042E(boolean z) {
        if (this.f15567p.mo33060d(z)) {
            m25294F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo33043K() {
        C6682h n = m25303n(C6682h.INITIALIZE);
        return n == C6682h.RESOURCE_CACHE || n == C6682h.DATA_CACHE;
    }

    /* renamed from: b */
    public void mo33014b(C7380e eVar, Exception exc, C7401d<?> dVar, C7376a aVar) {
        dVar.mo37435b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.mo32986j(eVar, aVar, dVar.mo37430a());
        this.f15562c.add(glideException);
        if (Thread.currentThread() != this.f15552N) {
            this.f15548J = C6681g.SWITCH_TO_SOURCE_SERVICE;
            this.f15545G.mo33051c(this);
            return;
        }
        m25295G();
    }

    /* renamed from: d */
    public void mo33015d() {
        this.f15548J = C6681g.SWITCH_TO_SOURCE_SERVICE;
        this.f15545G.mo33051c(this);
    }

    /* renamed from: e */
    public void mo33045e() {
        this.f15560V = true;
        C6671f fVar = this.f15558T;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: f */
    public void mo33016f(C7380e eVar, Object obj, C7401d<?> dVar, C7376a aVar, C7380e eVar2) {
        this.f15553O = eVar;
        this.f15555Q = obj;
        this.f15557S = dVar;
        this.f15556R = aVar;
        this.f15554P = eVar2;
        if (Thread.currentThread() != this.f15552N) {
            this.f15548J = C6681g.DECODE_DATA;
            this.f15545G.mo33051c(this);
            return;
        }
        C7347b.m30354a("DecodeJob.decodeFromRetrievedData");
        try {
            m25301l();
        } finally {
            C7347b.m30357d();
        }
    }

    /* renamed from: g */
    public int compareTo(@NonNull C6674h<?> hVar) {
        int q = m25305q() - hVar.m25305q();
        return q == 0 ? this.f15546H - hVar.f15546H : q;
    }

    @NonNull
    /* renamed from: i */
    public C7348c mo24547i() {
        return this.f15563d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C6674h<R> mo33047r(C7273e eVar, Object obj, C6699m mVar, C7380e eVar2, int i, int i2, Class<?> cls, Class<R> cls2, C7275g gVar, C7580a aVar, Map<Class<?>, C7387j<?>> map, boolean z, boolean z2, boolean z3, C7384g gVar2, C6676b<R> bVar, int i3) {
        this.f15561a.mo33037u(eVar, obj, eVar2, i, i2, aVar, cls, cls2, gVar, gVar2, map, z, z2, this.f15564f);
        this.f15568s = eVar;
        this.f15569z = eVar2;
        this.f15539A = gVar;
        this.f15540B = mVar;
        this.f15541C = i;
        this.f15542D = i2;
        this.f15543E = aVar;
        this.f15550L = z3;
        this.f15544F = gVar2;
        this.f15545G = bVar;
        this.f15546H = i3;
        this.f15548J = C6681g.INITIALIZE;
        this.f15551M = obj;
        return this;
    }

    public void run() {
        C7347b.m30355b("DecodeJob#run(model=%s)", this.f15551M);
        C7401d<?> dVar = this.f15557S;
        try {
            if (this.f15560V) {
                m25310x();
                if (dVar != null) {
                    dVar.mo37435b();
                }
                C7347b.m30357d();
                return;
            }
            m25297I();
            if (dVar != null) {
                dVar.mo37435b();
            }
            C7347b.m30357d();
        } catch (C6667b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo37435b();
            }
            C7347b.m30357d();
            throw th;
        }
    }
}

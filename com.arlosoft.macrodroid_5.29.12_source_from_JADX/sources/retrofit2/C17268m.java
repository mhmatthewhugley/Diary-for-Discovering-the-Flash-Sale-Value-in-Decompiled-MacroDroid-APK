package retrofit2;

import java.io.IOException;
import java.util.Objects;
import okhttp3.C15904b0;
import okhttp3.C15915d0;
import okhttp3.C15917e;
import okhttp3.C15919e0;
import okhttp3.C15923f;
import okhttp3.C15995x;
import p226cd.C11179b;
import p226cd.C11186d;
import p226cd.C11191g;
import p226cd.C11196l;
import p226cd.C11212y;

/* renamed from: retrofit2.m */
/* compiled from: OkHttpCall */
final class C17268m<T> implements C17236b<T> {

    /* renamed from: a */
    private final C17298r f68833a;

    /* renamed from: c */
    private final Object[] f68834c;

    /* renamed from: d */
    private final C15917e.C15918a f68835d;

    /* renamed from: f */
    private final C17246f<C15919e0, T> f68836f;

    /* renamed from: g */
    private volatile boolean f68837g;

    /* renamed from: o */
    private C15917e f68838o;

    /* renamed from: p */
    private Throwable f68839p;

    /* renamed from: s */
    private boolean f68840s;

    /* renamed from: retrofit2.m$a */
    /* compiled from: OkHttpCall */
    class C17269a implements C15923f {

        /* renamed from: a */
        final /* synthetic */ C17239d f68841a;

        C17269a(C17239d dVar) {
            this.f68841a = dVar;
        }

        /* renamed from: a */
        private void m100901a(Throwable th) {
            try {
                this.f68841a.mo80374a(C17268m.this, th);
            } catch (Throwable th2) {
                C17307x.m101017s(th2);
                th2.printStackTrace();
            }
        }

        public void onFailure(C15917e eVar, IOException iOException) {
            m100901a(iOException);
        }

        public void onResponse(C15917e eVar, C15915d0 d0Var) {
            try {
                try {
                    this.f68841a.mo80375b(C17268m.this, C17268m.this.mo80559d(d0Var));
                } catch (Throwable th) {
                    C17307x.m101017s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C17307x.m101017s(th2);
                m100901a(th2);
            }
        }
    }

    /* renamed from: retrofit2.m$b */
    /* compiled from: OkHttpCall */
    static final class C17270b extends C15919e0 {

        /* renamed from: a */
        private final C15919e0 f68843a;

        /* renamed from: c */
        private final C11186d f68844c;

        /* renamed from: d */
        IOException f68845d;

        /* renamed from: retrofit2.m$b$a */
        /* compiled from: OkHttpCall */
        class C17271a extends C11191g {
            C17271a(C11212y yVar) {
                super(yVar);
            }

            /* renamed from: m0 */
            public long mo62392m0(C11179b bVar, long j) throws IOException {
                try {
                    return super.mo62392m0(bVar, j);
                } catch (IOException e) {
                    C17270b.this.f68845d = e;
                    throw e;
                }
            }
        }

        C17270b(C15919e0 e0Var) {
            this.f68843a = e0Var;
            this.f68844c = C11196l.m75163b(new C17271a(e0Var.source()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo80560b() throws IOException {
            IOException iOException = this.f68845d;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.f68843a.close();
        }

        public long contentLength() {
            return this.f68843a.contentLength();
        }

        public C15995x contentType() {
            return this.f68843a.contentType();
        }

        public C11186d source() {
            return this.f68844c;
        }
    }

    /* renamed from: retrofit2.m$c */
    /* compiled from: OkHttpCall */
    static final class C17272c extends C15919e0 {

        /* renamed from: a */
        private final C15995x f68847a;

        /* renamed from: c */
        private final long f68848c;

        C17272c(C15995x xVar, long j) {
            this.f68847a = xVar;
            this.f68848c = j;
        }

        public long contentLength() {
            return this.f68848c;
        }

        public C15995x contentType() {
            return this.f68847a;
        }

        public C11186d source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C17268m(C17298r rVar, Object[] objArr, C15917e.C15918a aVar, C17246f<C15919e0, T> fVar) {
        this.f68833a = rVar;
        this.f68834c = objArr;
        this.f68835d = aVar;
        this.f68836f = fVar;
    }

    /* renamed from: b */
    private C15917e m100893b() throws IOException {
        C15917e a = this.f68835d.mo76008a(this.f68833a.mo80590a(this.f68834c));
        Objects.requireNonNull(a, "Call.Factory returned null.");
        return a;
    }

    /* renamed from: c */
    private C15917e m100894c() throws IOException {
        C15917e eVar = this.f68838o;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.f68839p;
        if (th == null) {
            try {
                C15917e b = m100893b();
                this.f68838o = b;
                return b;
            } catch (IOException | Error | RuntimeException e) {
                C17307x.m101017s(e);
                this.f68839p = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    /* renamed from: I */
    public boolean mo80535I() {
        boolean z = true;
        if (this.f68837g) {
            return true;
        }
        synchronized (this) {
            C15917e eVar = this.f68838o;
            if (eVar == null || !eVar.mo76003I()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C17268m<T> clone() {
        return new C17268m<>(this.f68833a, this.f68834c, this.f68835d, this.f68836f);
    }

    public void cancel() {
        C15917e eVar;
        this.f68837g = true;
        synchronized (this) {
            eVar = this.f68838o;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C17300s<T> mo80559d(C15915d0 d0Var) throws IOException {
        C15919e0 b = d0Var.mo75966b();
        C15915d0 c = d0Var.mo75980u().mo75987b(new C17272c(b.contentType(), b.contentLength())).mo75988c();
        int g = c.mo75971g();
        if (g < 200 || g >= 300) {
            try {
                return C17300s.m100972c(C17307x.m100999a(b), c);
            } finally {
                b.close();
            }
        } else if (g == 204 || g == 205) {
            b.close();
            return C17300s.m100973g(null, c);
        } else {
            C17270b bVar = new C17270b(b);
            try {
                return C17300s.m100973g(this.f68836f.mo80387a(bVar), c);
            } catch (RuntimeException e) {
                bVar.mo80560b();
                throw e;
            }
        }
    }

    public C17300s<T> execute() throws IOException {
        C15917e c;
        synchronized (this) {
            if (!this.f68840s) {
                this.f68840s = true;
                c = m100894c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f68837g) {
            c.cancel();
        }
        return mo80559d(c.execute());
    }

    /* renamed from: m */
    public synchronized C15904b0 mo80539m() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m100894c().mo76006m();
    }

    /* renamed from: q0 */
    public void mo80540q0(C17239d<T> dVar) {
        C15917e eVar;
        Throwable th;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            if (!this.f68840s) {
                this.f68840s = true;
                eVar = this.f68838o;
                th = this.f68839p;
                if (eVar == null && th == null) {
                    try {
                        C15917e b = m100893b();
                        this.f68838o = b;
                        eVar = b;
                    } catch (Throwable th2) {
                        th = th2;
                        C17307x.m101017s(th);
                        this.f68839p = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo80374a(this, th);
            return;
        }
        if (this.f68837g) {
            eVar.cancel();
        }
        eVar.mo76007u1(new C17269a(dVar));
    }
}

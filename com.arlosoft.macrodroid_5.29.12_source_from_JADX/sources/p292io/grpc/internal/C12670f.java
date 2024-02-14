package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p292io.grpc.C12995t;
import p292io.grpc.internal.C12690g2;
import p292io.grpc.internal.C12694h1;

/* renamed from: io.grpc.internal.f */
/* compiled from: ApplicationThreadDeframer */
public class C12670f implements C12878y, C12694h1.C12696b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12694h1.C12696b f59862a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12694h1 f59863c;

    /* renamed from: d */
    private final C12679i f59864d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Queue<InputStream> f59865f = new ArrayDeque();

    /* renamed from: io.grpc.internal.f$a */
    /* compiled from: ApplicationThreadDeframer */
    class C12671a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f59866a;

        C12671a(int i) {
            this.f59866a = i;
        }

        public void run() {
            if (!C12670f.this.f59863c.isClosed()) {
                try {
                    C12670f.this.f59863c.mo69371b(this.f59866a);
                } catch (Throwable th) {
                    C12670f.this.f59862a.mo69376f(th);
                    C12670f.this.f59863c.close();
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.f$b */
    /* compiled from: ApplicationThreadDeframer */
    class C12672b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12798s1 f59868a;

        C12672b(C12798s1 s1Var) {
            this.f59868a = s1Var;
        }

        public void run() {
            try {
                C12670f.this.f59863c.mo69378h(this.f59868a);
            } catch (Throwable th) {
                C12670f.this.mo69376f(th);
                C12670f.this.f59863c.close();
            }
        }
    }

    /* renamed from: io.grpc.internal.f$c */
    /* compiled from: ApplicationThreadDeframer */
    class C12673c implements Runnable {
        C12673c() {
        }

        public void run() {
            C12670f.this.f59863c.mo69379j();
        }
    }

    /* renamed from: io.grpc.internal.f$d */
    /* compiled from: ApplicationThreadDeframer */
    class C12674d implements Runnable {
        C12674d() {
        }

        public void run() {
            C12670f.this.f59863c.close();
        }
    }

    /* renamed from: io.grpc.internal.f$e */
    /* compiled from: ApplicationThreadDeframer */
    class C12675e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f59872a;

        C12675e(int i) {
            this.f59872a = i;
        }

        public void run() {
            C12670f.this.f59862a.mo69374d(this.f59872a);
        }
    }

    /* renamed from: io.grpc.internal.f$f */
    /* compiled from: ApplicationThreadDeframer */
    class C12676f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f59874a;

        C12676f(boolean z) {
            this.f59874a = z;
        }

        public void run() {
            C12670f.this.f59862a.mo69172i(this.f59874a);
        }
    }

    /* renamed from: io.grpc.internal.f$g */
    /* compiled from: ApplicationThreadDeframer */
    class C12677g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f59876a;

        C12677g(Throwable th) {
            this.f59876a = th;
        }

        public void run() {
            C12670f.this.f59862a.mo69376f(this.f59876a);
        }
    }

    /* renamed from: io.grpc.internal.f$h */
    /* compiled from: ApplicationThreadDeframer */
    private class C12678h implements C12690g2.C12691a {

        /* renamed from: a */
        private final Runnable f59878a;

        /* renamed from: b */
        private boolean f59879b;

        /* synthetic */ C12678h(C12670f fVar, Runnable runnable, C12671a aVar) {
            this(runnable);
        }

        /* renamed from: a */
        private void m84146a() {
            if (!this.f59879b) {
                this.f59878a.run();
                this.f59879b = true;
            }
        }

        public InputStream next() {
            m84146a();
            return (InputStream) C12670f.this.f59865f.poll();
        }

        private C12678h(Runnable runnable) {
            this.f59879b = false;
            this.f59878a = runnable;
        }
    }

    /* renamed from: io.grpc.internal.f$i */
    /* compiled from: ApplicationThreadDeframer */
    interface C12679i {
        /* renamed from: b */
        void mo69388b(Runnable runnable);
    }

    C12670f(C12694h1.C12696b bVar, C12679i iVar, C12694h1 h1Var) {
        this.f59862a = (C12694h1.C12696b) Preconditions.m5393t(bVar, "listener");
        this.f59864d = (C12679i) Preconditions.m5393t(iVar, "transportExecutor");
        h1Var.mo69411v(this);
        this.f59863c = h1Var;
    }

    /* renamed from: a */
    public void mo69251a(C12690g2.C12691a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                this.f59865f.add(next);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo69371b(int i) {
        this.f59862a.mo69251a(new C12678h(this, new C12671a(i), (C12671a) null));
    }

    /* renamed from: c */
    public void mo69372c(int i) {
        this.f59863c.mo69372c(i);
    }

    public void close() {
        this.f59863c.mo69412w();
        this.f59862a.mo69251a(new C12678h(this, new C12674d(), (C12671a) null));
    }

    /* renamed from: d */
    public void mo69374d(int i) {
        this.f59864d.mo69388b(new C12675e(i));
    }

    /* renamed from: e */
    public void mo69375e(C12776p0 p0Var) {
        this.f59863c.mo69375e(p0Var);
    }

    /* renamed from: f */
    public void mo69376f(Throwable th) {
        this.f59864d.mo69388b(new C12677g(th));
    }

    /* renamed from: g */
    public void mo69377g(C12995t tVar) {
        this.f59863c.mo69377g(tVar);
    }

    /* renamed from: h */
    public void mo69378h(C12798s1 s1Var) {
        this.f59862a.mo69251a(new C12678h(this, new C12672b(s1Var), (C12671a) null));
    }

    /* renamed from: i */
    public void mo69172i(boolean z) {
        this.f59864d.mo69388b(new C12676f(z));
    }

    /* renamed from: j */
    public void mo69379j() {
        this.f59862a.mo69251a(new C12678h(this, new C12673c(), (C12671a) null));
    }
}

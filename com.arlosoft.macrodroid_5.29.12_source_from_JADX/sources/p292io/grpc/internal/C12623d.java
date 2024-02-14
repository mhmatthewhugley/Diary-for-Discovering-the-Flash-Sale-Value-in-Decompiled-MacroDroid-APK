package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import p292io.grpc.C12905k;
import p292io.grpc.C12909l;
import p292io.grpc.C12995t;
import p292io.grpc.internal.C12670f;
import p292io.grpc.internal.C12690g2;
import p292io.grpc.internal.C12694h1;

/* renamed from: io.grpc.internal.d */
/* compiled from: AbstractStream */
public abstract class C12623d implements C12683f2 {

    /* renamed from: io.grpc.internal.d$a */
    /* compiled from: AbstractStream */
    public static abstract class C12624a implements C12670f.C12679i, C12694h1.C12696b {

        /* renamed from: a */
        private C12878y f59686a;

        /* renamed from: c */
        private final Object f59687c = new Object();

        /* renamed from: d */
        private final C12669e2 f59688d;

        /* renamed from: f */
        private final C12725k2 f59689f;

        /* renamed from: g */
        private int f59690g;

        /* renamed from: o */
        private boolean f59691o;

        /* renamed from: p */
        private boolean f59692p;

        protected C12624a(int i, C12669e2 e2Var, C12725k2 k2Var) {
            this.f59688d = (C12669e2) Preconditions.m5393t(e2Var, "statsTraceCtx");
            this.f59689f = (C12725k2) Preconditions.m5393t(k2Var, "transportTracer");
            this.f59686a = new C12694h1(this, C12905k.C12907b.f60451a, i, e2Var, k2Var);
        }

        /* renamed from: j */
        private boolean m83955j() {
            boolean z;
            synchronized (this.f59687c) {
                z = this.f59691o && this.f59690g < 32768 && !this.f59692p;
            }
            return z;
        }

        /* renamed from: l */
        private void m83956l() {
            boolean j;
            synchronized (this.f59687c) {
                j = m83955j();
            }
            if (j) {
                mo69173k().onReady();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public void m83957m(int i) {
            synchronized (this.f59687c) {
                this.f59690g += i;
            }
        }

        /* renamed from: a */
        public void mo69251a(C12690g2.C12691a aVar) {
            mo69173k().mo69194a(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final void mo69252e(boolean z) {
            if (z) {
                this.f59686a.close();
            } else {
                this.f59686a.mo69379j();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo69253g(C12798s1 s1Var) {
            try {
                this.f59686a.mo69378h(s1Var);
            } catch (Throwable th) {
                mo69376f(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public C12725k2 mo69254h() {
            return this.f59689f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public abstract C12690g2 mo69173k();

        /* renamed from: n */
        public final void mo69255n(int i) {
            boolean z;
            synchronized (this.f59687c) {
                Preconditions.m5399z(this.f59691o, "onStreamAllocated was not called, but it seems the stream is active");
                int i2 = this.f59690g;
                z = true;
                boolean z2 = i2 < 32768;
                int i3 = i2 - i;
                this.f59690g = i3;
                boolean z3 = i3 < 32768;
                if (z2 || !z3) {
                    z = false;
                }
            }
            if (z) {
                m83956l();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo69256o() {
            boolean z = false;
            Preconditions.m5398y(mo69173k() != null);
            synchronized (this.f59687c) {
                if (!this.f59691o) {
                    z = true;
                }
                Preconditions.m5399z(z, "Already allocated");
                this.f59691o = true;
            }
            m83956l();
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public final void mo69257p() {
            synchronized (this.f59687c) {
                this.f59692p = true;
            }
        }

        /* renamed from: q */
        public final void mo69258q(int i) {
            try {
                this.f59686a.mo69371b(i);
            } catch (Throwable th) {
                mo69376f(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo69259r(C12995t tVar) {
            this.f59686a.mo69377g(tVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public void mo69260s(C12776p0 p0Var) {
            this.f59686a.mo69375e(p0Var);
            this.f59686a = new C12670f(this, this, (C12694h1) this.f59686a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo69261t(int i) {
            this.f59686a.mo69372c(i);
        }
    }

    /* renamed from: a */
    public final void mo69176a(C12909l lVar) {
        mo69149p().mo69155a((C12909l) Preconditions.m5393t(lVar, "compressor"));
    }

    public final void flush() {
        if (!mo69149p().isClosed()) {
            mo69149p().flush();
        }
    }

    /* renamed from: g */
    public final void mo69178g(InputStream inputStream) {
        Preconditions.m5393t(inputStream, "message");
        try {
            if (!mo69149p().isClosed()) {
                mo69149p().mo69156b(inputStream);
            }
        } finally {
            C12749o0.m84361c(inputStream);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo69249o() {
        mo69149p().close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract C12738m0 mo69149p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo69250q(int i) {
        mo69150r().m83957m(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract C12624a mo69150r();
}

package p473rx.internal.operators;

import java.util.concurrent.TimeoutException;
import p459ef.C17153c;
import p459ef.C17157e;
import p459ef.C17158f;
import p459ef.C17162h;
import p459ef.C17163i;
import p464jf.C17183g;
import p464jf.C17184h;
import p467mf.C17192c;
import p470pf.C17224c;
import p473rx.internal.producers.C17349a;

/* renamed from: rx.internal.operators.j */
/* compiled from: OperatorTimeoutBase */
class C17344j<T> implements C17153c.C17155b<T, T> {

    /* renamed from: a */
    final C17345a<T> f69045a;

    /* renamed from: b */
    final C17346b<T> f69046b;

    /* renamed from: c */
    final C17153c<? extends T> f69047c;

    /* renamed from: d */
    final C17158f f69048d;

    /* renamed from: rx.internal.operators.j$a */
    /* compiled from: OperatorTimeoutBase */
    interface C17345a<T> extends C17183g<C17347c<T>, Long, C17158f.C17159a, C17163i> {
    }

    /* renamed from: rx.internal.operators.j$b */
    /* compiled from: OperatorTimeoutBase */
    interface C17346b<T> extends C17184h<C17347c<T>, Long, T, C17158f.C17159a, C17163i> {
    }

    /* renamed from: rx.internal.operators.j$c */
    /* compiled from: OperatorTimeoutBase */
    static final class C17347c<T> extends C17162h<T> {

        /* renamed from: A */
        final C17349a f69049A = new C17349a();

        /* renamed from: B */
        boolean f69050B;

        /* renamed from: C */
        long f69051C;

        /* renamed from: g */
        final C17224c f69052g;

        /* renamed from: o */
        final C17192c<T> f69053o;

        /* renamed from: p */
        final C17346b<T> f69054p;

        /* renamed from: s */
        final C17153c<? extends T> f69055s;

        /* renamed from: z */
        final C17158f.C17159a f69056z;

        /* renamed from: rx.internal.operators.j$c$a */
        /* compiled from: OperatorTimeoutBase */
        class C17348a extends C17162h<T> {
            C17348a() {
            }

            /* renamed from: g */
            public void mo80453g(C17157e eVar) {
                C17347c.this.f69049A.mo80669b(eVar);
            }

            public void onCompleted() {
                C17347c.this.f69053o.onCompleted();
            }

            public void onError(Throwable th) {
                C17347c.this.f69053o.onError(th);
            }

            public void onNext(T t) {
                C17347c.this.f69053o.onNext(t);
            }
        }

        C17347c(C17192c<T> cVar, C17346b<T> bVar, C17224c cVar2, C17153c<? extends T> cVar3, C17158f.C17159a aVar) {
            this.f69053o = cVar;
            this.f69054p = bVar;
            this.f69052g = cVar2;
            this.f69055s = cVar3;
            this.f69056z = aVar;
        }

        /* renamed from: g */
        public void mo80453g(C17157e eVar) {
            this.f69049A.mo80669b(eVar);
        }

        /* renamed from: h */
        public void mo80667h(long j) {
            boolean z;
            synchronized (this) {
                z = true;
                if (j != this.f69051C || this.f69050B) {
                    z = false;
                } else {
                    this.f69050B = true;
                }
            }
            if (!z) {
                return;
            }
            if (this.f69055s == null) {
                this.f69053o.onError(new TimeoutException());
                return;
            }
            C17348a aVar = new C17348a();
            this.f69055s.mo80440p(aVar);
            this.f69052g.mo80523a(aVar);
        }

        public void onCompleted() {
            boolean z;
            synchronized (this) {
                z = true;
                if (!this.f69050B) {
                    this.f69050B = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f69052g.mo80450d();
                this.f69053o.onCompleted();
            }
        }

        public void onError(Throwable th) {
            boolean z;
            synchronized (this) {
                z = true;
                if (!this.f69050B) {
                    this.f69050B = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f69052g.mo80450d();
                this.f69053o.onError(th);
            }
        }

        public void onNext(T t) {
            boolean z;
            long j;
            synchronized (this) {
                if (!this.f69050B) {
                    j = this.f69051C + 1;
                    this.f69051C = j;
                    z = true;
                } else {
                    j = this.f69051C;
                    z = false;
                }
            }
            if (z) {
                this.f69053o.onNext(t);
                this.f69052g.mo80523a((C17163i) this.f69054p.mo80462a(this, Long.valueOf(j), t, this.f69056z));
            }
        }
    }

    C17344j(C17345a<T> aVar, C17346b<T> bVar, C17153c<? extends T> cVar, C17158f fVar) {
        this.f69045a = aVar;
        this.f69046b = bVar;
        this.f69047c = cVar;
        this.f69048d = fVar;
    }

    /* renamed from: b */
    public C17162h<? super T> mo80454a(C17162h<? super T> hVar) {
        C17158f.C17159a a = this.f69048d.mo80445a();
        hVar.mo80448a(a);
        C17192c cVar = new C17192c(hVar);
        C17224c cVar2 = new C17224c();
        cVar.mo80448a(cVar2);
        C17347c cVar3 = new C17347c(cVar, this.f69046b, cVar2, this.f69047c, a);
        cVar.mo80448a(cVar3);
        cVar.mo80453g(cVar3.f69049A);
        cVar2.mo80523a((C17163i) this.f69045a.mo80461a(cVar3, 0L, a));
        return cVar3;
    }
}

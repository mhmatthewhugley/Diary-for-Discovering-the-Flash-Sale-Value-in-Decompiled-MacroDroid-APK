package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p262fa.C12251a;
import p292io.reactivex.observers.C13231b;
import p414v9.C16739l;
import p414v9.C16741n;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.e */
/* compiled from: ObservableDebounceTimed */
public final class C13103e<T> extends C13083a<T, T> {

    /* renamed from: c */
    final long f60887c;

    /* renamed from: d */
    final TimeUnit f60888d;

    /* renamed from: f */
    final C16742o f60889f;

    /* renamed from: io.reactivex.internal.operators.observable.e$a */
    /* compiled from: ObservableDebounceTimed */
    static final class C13104a<T> extends AtomicReference<C17071b> implements Runnable, C17071b {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final C13105b<T> parent;
        final T value;

        C13104a(T t, long j, C13105b<T> bVar) {
            this.value = t;
            this.idx = j;
            this.parent = bVar;
        }

        /* renamed from: a */
        public void mo69948a(C17071b bVar) {
            C11163b.m74928e(this, bVar);
        }

        public void dispose() {
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return get() == C11163b.DISPOSED;
        }

        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.mo69950a(this.idx, this.value, this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.e$b */
    /* compiled from: ObservableDebounceTimed */
    static final class C13105b<T> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16741n<? super T> f60890a;

        /* renamed from: c */
        final long f60891c;

        /* renamed from: d */
        final TimeUnit f60892d;

        /* renamed from: f */
        final C16742o.C16745c f60893f;

        /* renamed from: g */
        C17071b f60894g;

        /* renamed from: o */
        C17071b f60895o;

        /* renamed from: p */
        volatile long f60896p;

        /* renamed from: s */
        boolean f60897s;

        C13105b(C16741n<? super T> nVar, long j, TimeUnit timeUnit, C16742o.C16745c cVar) {
            this.f60890a = nVar;
            this.f60891c = j;
            this.f60892d = timeUnit;
            this.f60893f = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69950a(long j, T t, C13104a<T> aVar) {
            if (j == this.f60896p) {
                this.f60890a.onNext(t);
                aVar.dispose();
            }
        }

        public void dispose() {
            this.f60894g.dispose();
            this.f60893f.dispose();
        }

        public boolean isDisposed() {
            return this.f60893f.isDisposed();
        }

        public void onComplete() {
            if (!this.f60897s) {
                this.f60897s = true;
                C17071b bVar = this.f60895o;
                if (bVar != null) {
                    bVar.dispose();
                }
                C13104a aVar = (C13104a) bVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f60890a.onComplete();
                this.f60893f.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f60897s) {
                C12251a.m82985p(th);
                return;
            }
            C17071b bVar = this.f60895o;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f60897s = true;
            this.f60890a.onError(th);
            this.f60893f.dispose();
        }

        public void onNext(T t) {
            if (!this.f60897s) {
                long j = this.f60896p + 1;
                this.f60896p = j;
                C17071b bVar = this.f60895o;
                if (bVar != null) {
                    bVar.dispose();
                }
                C13104a aVar = new C13104a(t, j, this);
                this.f60895o = aVar;
                aVar.mo69948a(this.f60893f.mo69997c(aVar, this.f60891c, this.f60892d));
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60894g, bVar)) {
                this.f60894g = bVar;
                this.f60890a.onSubscribe(this);
            }
        }
    }

    public C13103e(C16739l<T> lVar, long j, TimeUnit timeUnit, C16742o oVar) {
        super(lVar);
        this.f60887c = j;
        this.f60888d = timeUnit;
        this.f60889f = oVar;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13105b(new C13231b(nVar), this.f60887c, this.f60888d, this.f60889f.mo69992a()));
    }
}

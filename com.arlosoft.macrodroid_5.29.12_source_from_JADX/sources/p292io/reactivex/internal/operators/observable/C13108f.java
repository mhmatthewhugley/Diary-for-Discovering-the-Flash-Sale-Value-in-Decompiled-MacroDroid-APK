package p292io.reactivex.internal.operators.observable;

import p209aa.C11078a;
import p216ba.C11110a;
import p223ca.C11163b;
import p251ea.C12180d;
import p262fa.C12251a;
import p292io.reactivex.internal.observers.C13019b;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.f */
/* compiled from: ObservableDoFinally */
public final class C13108f<T> extends C13083a<T, T> {

    /* renamed from: c */
    final C11110a f60901c;

    /* renamed from: io.reactivex.internal.operators.observable.f$a */
    /* compiled from: ObservableDoFinally */
    static final class C13109a<T> extends C13019b<T> implements C16741n<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final C16741n<? super T> downstream;
        final C11110a onFinally;

        /* renamed from: qd */
        C12180d<T> f60902qd;
        boolean syncFused;
        C17071b upstream;

        C13109a(C16741n<? super T> nVar, C11110a aVar) {
            this.downstream = nVar;
            this.onFinally = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69952a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    C12251a.m82985p(th);
                }
            }
        }

        public void clear() {
            this.f60902qd.clear();
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            C12180d<T> dVar = this.f60902qd;
            boolean z = false;
            if (dVar == null || (i & 4) != 0) {
                return 0;
            }
            int d = dVar.mo62364d(i);
            if (d != 0) {
                if (d == 1) {
                    z = true;
                }
                this.syncFused = z;
            }
            return d;
        }

        public void dispose() {
            this.upstream.dispose();
            mo69952a();
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public boolean isEmpty() {
            return this.f60902qd.isEmpty();
        }

        public void onComplete() {
            this.downstream.onComplete();
            mo69952a();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            mo69952a();
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof C12180d) {
                    this.f60902qd = (C12180d) bVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            T poll = this.f60902qd.poll();
            if (poll == null && this.syncFused) {
                mo69952a();
            }
            return poll;
        }
    }

    public C13108f(C16739l<T> lVar, C11110a aVar) {
        super(lVar);
        this.f60901c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13109a(nVar, this.f60901c));
    }
}

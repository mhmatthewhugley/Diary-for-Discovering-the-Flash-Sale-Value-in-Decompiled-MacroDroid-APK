package p292io.reactivex.internal.operators.observable;

import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.q */
/* compiled from: ObservableIgnoreElements */
public final class C13139q<T> extends C13083a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.q$a */
    /* compiled from: ObservableIgnoreElements */
    static final class C13140a<T> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16741n<? super T> f60965a;

        /* renamed from: c */
        C17071b f60966c;

        C13140a(C16741n<? super T> nVar) {
            this.f60965a = nVar;
        }

        public void dispose() {
            this.f60966c.dispose();
        }

        public boolean isDisposed() {
            return this.f60966c.isDisposed();
        }

        public void onComplete() {
            this.f60965a.onComplete();
        }

        public void onError(Throwable th) {
            this.f60965a.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(C17071b bVar) {
            this.f60966c = bVar;
            this.f60965a.onSubscribe(this);
        }
    }

    public C13139q(C16739l<T> lVar) {
        super(lVar);
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13140a(nVar));
    }
}

package p292io.reactivex.internal.operators.observable;

import p251ea.C12179c;
import p262fa.C12251a;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16735i;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.r */
/* compiled from: ObservableIgnoreElementsCompletable */
public final class C13141r<T> extends C16728b implements C12179c<T> {

    /* renamed from: a */
    final C16739l<T> f60967a;

    /* renamed from: io.reactivex.internal.operators.observable.r$a */
    /* compiled from: ObservableIgnoreElementsCompletable */
    static final class C13142a<T> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16729c f60968a;

        /* renamed from: c */
        C17071b f60969c;

        C13142a(C16729c cVar) {
            this.f60968a = cVar;
        }

        public void dispose() {
            this.f60969c.dispose();
        }

        public boolean isDisposed() {
            return this.f60969c.isDisposed();
        }

        public void onComplete() {
            this.f60968a.onComplete();
        }

        public void onError(Throwable th) {
            this.f60968a.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(C17071b bVar) {
            this.f60969c = bVar;
            this.f60968a.onSubscribe(this);
        }
    }

    public C13141r(C16739l<T> lVar) {
        this.f60967a = lVar;
    }

    /* renamed from: b */
    public C16735i<T> mo68463b() {
        return C12251a.m82982m(new C13139q(this.f60967a));
    }

    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        this.f60967a.mo79695a(new C13142a(cVar));
    }
}

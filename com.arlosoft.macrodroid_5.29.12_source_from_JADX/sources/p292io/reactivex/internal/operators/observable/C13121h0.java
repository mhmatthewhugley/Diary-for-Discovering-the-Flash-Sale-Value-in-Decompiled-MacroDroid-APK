package p292io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import p209aa.C11078a;
import p223ca.C11163b;
import p223ca.C11164c;
import p241da.C11984b;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.h0 */
/* compiled from: ObservableToList */
public final class C13121h0<T, U extends Collection<? super T>> extends C13083a<T, U> {

    /* renamed from: c */
    final Callable<U> f60927c;

    /* renamed from: io.reactivex.internal.operators.observable.h0$a */
    /* compiled from: ObservableToList */
    static final class C13122a<T, U extends Collection<? super T>> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16741n<? super U> f60928a;

        /* renamed from: c */
        C17071b f60929c;

        /* renamed from: d */
        U f60930d;

        C13122a(C16741n<? super U> nVar, U u) {
            this.f60928a = nVar;
            this.f60930d = u;
        }

        public void dispose() {
            this.f60929c.dispose();
        }

        public boolean isDisposed() {
            return this.f60929c.isDisposed();
        }

        public void onComplete() {
            U u = this.f60930d;
            this.f60930d = null;
            this.f60928a.onNext(u);
            this.f60928a.onComplete();
        }

        public void onError(Throwable th) {
            this.f60930d = null;
            this.f60928a.onError(th);
        }

        public void onNext(T t) {
            this.f60930d.add(t);
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60929c, bVar)) {
                this.f60929c = bVar;
                this.f60928a.onSubscribe(this);
            }
        }
    }

    public C13121h0(C16739l<T> lVar, Callable<U> callable) {
        super(lVar);
        this.f60927c = callable;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super U> nVar) {
        try {
            this.f60853a.mo79695a(new C13122a(nVar, (Collection) C11984b.m82367d(this.f60927c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C11078a.m74639b(th);
            C11164c.m74936g(th, nVar);
        }
    }
}

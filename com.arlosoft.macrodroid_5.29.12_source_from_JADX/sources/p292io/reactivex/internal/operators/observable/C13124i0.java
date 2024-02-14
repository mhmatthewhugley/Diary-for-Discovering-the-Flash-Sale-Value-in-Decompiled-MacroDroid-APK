package p292io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import p209aa.C11078a;
import p223ca.C11163b;
import p223ca.C11164c;
import p241da.C11968a;
import p241da.C11984b;
import p251ea.C12179c;
import p262fa.C12251a;
import p414v9.C16735i;
import p414v9.C16739l;
import p414v9.C16741n;
import p414v9.C16747p;
import p414v9.C16748q;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.i0 */
/* compiled from: ObservableToListSingle */
public final class C13124i0<T, U extends Collection<? super T>> extends C16747p<U> implements C12179c<U> {

    /* renamed from: a */
    final C16739l<T> f60932a;

    /* renamed from: c */
    final Callable<U> f60933c;

    /* renamed from: io.reactivex.internal.operators.observable.i0$a */
    /* compiled from: ObservableToListSingle */
    static final class C13125a<T, U extends Collection<? super T>> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16748q<? super U> f60934a;

        /* renamed from: c */
        U f60935c;

        /* renamed from: d */
        C17071b f60936d;

        C13125a(C16748q<? super U> qVar, U u) {
            this.f60934a = qVar;
            this.f60935c = u;
        }

        public void dispose() {
            this.f60936d.dispose();
        }

        public boolean isDisposed() {
            return this.f60936d.isDisposed();
        }

        public void onComplete() {
            U u = this.f60935c;
            this.f60935c = null;
            this.f60934a.mo69889b(u);
        }

        public void onError(Throwable th) {
            this.f60935c = null;
            this.f60934a.onError(th);
        }

        public void onNext(T t) {
            this.f60935c.add(t);
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60936d, bVar)) {
                this.f60936d = bVar;
                this.f60934a.onSubscribe(this);
            }
        }
    }

    public C13124i0(C16739l<T> lVar, int i) {
        this.f60932a = lVar;
        this.f60933c = C11968a.m82354a(i);
    }

    /* renamed from: b */
    public C16735i<U> mo68463b() {
        return C12251a.m82982m(new C13121h0(this.f60932a, this.f60933c));
    }

    /* renamed from: p */
    public void mo69927p(C16748q<? super U> qVar) {
        try {
            this.f60932a.mo79695a(new C13125a(qVar, (Collection) C11984b.m82367d(this.f60933c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C11078a.m74639b(th);
            C11164c.m74937i(th, qVar);
        }
    }
}

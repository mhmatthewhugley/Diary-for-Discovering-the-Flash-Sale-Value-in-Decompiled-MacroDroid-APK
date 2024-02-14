package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import p209aa.C11078a;
import p241da.C11984b;
import p262fa.C12251a;
import p292io.reactivex.internal.observers.C13023f;
import p414v9.C16735i;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.operators.observable.n */
/* compiled from: ObservableFromCallable */
public final class C13135n<T> extends C16735i<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f60956a;

    public C13135n(Callable<? extends T> callable) {
        this.f60956a = callable;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C13023f fVar = new C13023f(nVar);
        nVar.onSubscribe(fVar);
        if (!fVar.isDisposed()) {
            try {
                fVar.mo69892a(C11984b.m82367d(this.f60956a.call(), "Callable returned null"));
            } catch (Throwable th) {
                C11078a.m74639b(th);
                if (!fVar.isDisposed()) {
                    nVar.onError(th);
                } else {
                    C12251a.m82985p(th);
                }
            }
        }
    }

    public T call() throws Exception {
        return C11984b.m82367d(this.f60956a.call(), "The callable returned a null value");
    }
}

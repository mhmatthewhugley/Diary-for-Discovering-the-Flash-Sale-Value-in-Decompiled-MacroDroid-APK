package p292io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;
import p209aa.C11078a;
import p241da.C11984b;
import p262fa.C12251a;
import p414v9.C16747p;
import p414v9.C16748q;
import p448z9.C17071b;
import p448z9.C17072c;

/* renamed from: io.reactivex.internal.operators.single.f */
/* compiled from: SingleFromCallable */
public final class C13167f<T> extends C16747p<T> {

    /* renamed from: a */
    final Callable<? extends T> f61006a;

    public C13167f(Callable<? extends T> callable) {
        this.f61006a = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        C17071b b = C17072c.m100418b();
        qVar.onSubscribe(b);
        if (!b.isDisposed()) {
            try {
                Object d = C11984b.m82367d(this.f61006a.call(), "The callable returned a null value");
                if (!b.isDisposed()) {
                    qVar.mo69889b(d);
                }
            } catch (Throwable th) {
                C11078a.m74639b(th);
                if (!b.isDisposed()) {
                    qVar.onError(th);
                } else {
                    C12251a.m82985p(th);
                }
            }
        }
    }
}

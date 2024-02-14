package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p223ca.C11164c;
import p414v9.C16735i;
import p414v9.C16741n;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.g0 */
/* compiled from: ObservableTimer */
public final class C13118g0 extends C16735i<Long> {

    /* renamed from: a */
    final C16742o f60922a;

    /* renamed from: c */
    final long f60923c;

    /* renamed from: d */
    final TimeUnit f60924d;

    /* renamed from: io.reactivex.internal.operators.observable.g0$a */
    /* compiled from: ObservableTimer */
    static final class C13119a extends AtomicReference<C17071b> implements C17071b, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final C16741n<? super Long> downstream;

        C13119a(C16741n<? super Long> nVar) {
            this.downstream = nVar;
        }

        /* renamed from: a */
        public void mo69957a(C17071b bVar) {
            C11163b.m74931i(this, bVar);
        }

        public void dispose() {
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return get() == C11163b.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                this.downstream.onNext(0L);
                lazySet(C11164c.INSTANCE);
                this.downstream.onComplete();
            }
        }
    }

    public C13118g0(long j, TimeUnit timeUnit, C16742o oVar) {
        this.f60923c = j;
        this.f60924d = timeUnit;
        this.f60922a = oVar;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super Long> nVar) {
        C13119a aVar = new C13119a(nVar);
        nVar.onSubscribe(aVar);
        aVar.mo69957a(this.f60922a.mo69993c(aVar, this.f60923c, this.f60924d));
    }
}

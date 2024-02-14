package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p262fa.C12251a;
import p292io.reactivex.observers.C13231b;
import p414v9.C16739l;
import p414v9.C16741n;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.e0 */
/* compiled from: ObservableThrottleFirstTimed */
public final class C13106e0<T> extends C13083a<T, T> {

    /* renamed from: c */
    final long f60898c;

    /* renamed from: d */
    final TimeUnit f60899d;

    /* renamed from: f */
    final C16742o f60900f;

    /* renamed from: io.reactivex.internal.operators.observable.e0$a */
    /* compiled from: ObservableThrottleFirstTimed */
    static final class C13107a<T> extends AtomicReference<C17071b> implements C16741n<T>, C17071b, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        boolean done;
        final C16741n<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        C17071b upstream;
        final C16742o.C16745c worker;

        C13107a(C16741n<? super T> nVar, long j, TimeUnit timeUnit, C16742o.C16745c cVar) {
            this.downstream = nVar;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        public boolean isDisposed() {
            return this.worker.isDisposed();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C12251a.m82985p(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public void onNext(T t) {
            if (!this.gate && !this.done) {
                this.gate = true;
                this.downstream.onNext(t);
                C17071b bVar = (C17071b) get();
                if (bVar != null) {
                    bVar.dispose();
                }
                C11163b.m74928e(this, this.worker.mo69997c(this, this.timeout, this.unit));
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        public void run() {
            this.gate = false;
        }
    }

    public C13106e0(C16739l<T> lVar, long j, TimeUnit timeUnit, C16742o oVar) {
        super(lVar);
        this.f60898c = j;
        this.f60899d = timeUnit;
        this.f60900f = oVar;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13107a(new C13231b(nVar), this.f60898c, this.f60899d, this.f60900f.mo69992a()));
    }
}

package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p414v9.C16739l;
import p414v9.C16741n;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.b0 */
/* compiled from: ObservableSubscribeOn */
public final class C13089b0<T> extends C13083a<T, T> {

    /* renamed from: c */
    final C16742o f60870c;

    /* renamed from: io.reactivex.internal.operators.observable.b0$a */
    /* compiled from: ObservableSubscribeOn */
    static final class C13090a<T> extends AtomicReference<C17071b> implements C16741n<T>, C17071b {
        private static final long serialVersionUID = 8094547886072529208L;
        final C16741n<? super T> downstream;
        final AtomicReference<C17071b> upstream = new AtomicReference<>();

        C13090a(C16741n<? super T> nVar) {
            this.downstream = nVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69936a(C17071b bVar) {
            C11163b.m74930g(this, bVar);
        }

        public void dispose() {
            C11163b.m74926b(this.upstream);
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return C11163b.m74927d((C17071b) get());
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void onSubscribe(C17071b bVar) {
            C11163b.m74930g(this.upstream, bVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.b0$b */
    /* compiled from: ObservableSubscribeOn */
    final class C13091b implements Runnable {

        /* renamed from: a */
        private final C13090a<T> f60871a;

        C13091b(C13090a<T> aVar) {
            this.f60871a = aVar;
        }

        public void run() {
            C13089b0.this.f60853a.mo79695a(this.f60871a);
        }
    }

    public C13089b0(C16739l<T> lVar, C16742o oVar) {
        super(lVar);
        this.f60870c = oVar;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C13090a aVar = new C13090a(nVar);
        nVar.onSubscribe(aVar);
        aVar.mo69936a(this.f60870c.mo70027b(new C13091b(aVar)));
    }
}

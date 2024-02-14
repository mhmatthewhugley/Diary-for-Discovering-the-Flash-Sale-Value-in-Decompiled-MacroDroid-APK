package p292io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p414v9.C16742o;
import p414v9.C16747p;
import p414v9.C16748q;
import p414v9.C16749r;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.single.h */
/* compiled from: SingleObserveOn */
public final class C13169h<T> extends C16747p<T> {

    /* renamed from: a */
    final C16749r<T> f61008a;

    /* renamed from: c */
    final C16742o f61009c;

    /* renamed from: io.reactivex.internal.operators.single.h$a */
    /* compiled from: SingleObserveOn */
    static final class C13170a<T> extends AtomicReference<C17071b> implements C16748q<T>, C17071b, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final C16748q<? super T> downstream;
        Throwable error;
        final C16742o scheduler;
        T value;

        C13170a(C16748q<? super T> qVar, C16742o oVar) {
            this.downstream = qVar;
            this.scheduler = oVar;
        }

        /* renamed from: b */
        public void mo69889b(T t) {
            this.value = t;
            C11163b.m74928e(this, this.scheduler.mo70027b(this));
        }

        public void dispose() {
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return C11163b.m74927d((C17071b) get());
        }

        public void onError(Throwable th) {
            this.error = th;
            C11163b.m74928e(this, this.scheduler.mo70027b(this));
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74930g(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.mo69889b(this.value);
            }
        }
    }

    public C13169h(C16749r<T> rVar, C16742o oVar) {
        this.f61008a = rVar;
        this.f61009c = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        this.f61008a.mo79722a(new C13170a(qVar, this.f61009c));
    }
}

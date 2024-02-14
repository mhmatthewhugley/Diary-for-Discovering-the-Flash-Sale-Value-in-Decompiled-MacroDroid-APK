package p292io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16730d;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.completable.f */
/* compiled from: CompletableObserveOn */
public final class C13035f extends C16728b {

    /* renamed from: a */
    final C16730d f60790a;

    /* renamed from: c */
    final C16742o f60791c;

    /* renamed from: io.reactivex.internal.operators.completable.f$a */
    /* compiled from: CompletableObserveOn */
    static final class C13036a extends AtomicReference<C17071b> implements C16729c, C17071b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final C16729c downstream;
        Throwable error;
        final C16742o scheduler;

        C13036a(C16729c cVar, C16742o oVar) {
            this.downstream = cVar;
            this.scheduler = oVar;
        }

        public void dispose() {
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return C11163b.m74927d((C17071b) get());
        }

        public void onComplete() {
            C11163b.m74928e(this, this.scheduler.mo70027b(this));
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
                this.error = null;
                this.downstream.onError(th);
                return;
            }
            this.downstream.onComplete();
        }
    }

    public C13035f(C16730d dVar, C16742o oVar) {
        this.f60790a = dVar;
        this.f60791c = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        this.f60790a.mo79652a(new C13036a(cVar, this.f60791c));
    }
}

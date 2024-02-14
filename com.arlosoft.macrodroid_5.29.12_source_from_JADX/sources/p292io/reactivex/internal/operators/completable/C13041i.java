package p292io.reactivex.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.completable.i */
/* compiled from: CompletableTimer */
public final class C13041i extends C16728b {

    /* renamed from: a */
    final long f60804a;

    /* renamed from: c */
    final TimeUnit f60805c;

    /* renamed from: d */
    final C16742o f60806d;

    /* renamed from: io.reactivex.internal.operators.completable.i$a */
    /* compiled from: CompletableTimer */
    static final class C13042a extends AtomicReference<C17071b> implements C17071b, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final C16729c downstream;

        C13042a(C16729c cVar) {
            this.downstream = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69899a(C17071b bVar) {
            C11163b.m74928e(this, bVar);
        }

        public void dispose() {
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return C11163b.m74927d((C17071b) get());
        }

        public void run() {
            this.downstream.onComplete();
        }
    }

    public C13041i(long j, TimeUnit timeUnit, C16742o oVar) {
        this.f60804a = j;
        this.f60805c = timeUnit;
        this.f60806d = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        C13042a aVar = new C13042a(cVar);
        cVar.onSubscribe(aVar);
        aVar.mo69899a(this.f60806d.mo69993c(aVar, this.f60804a, this.f60805c));
    }
}

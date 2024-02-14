package p292io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p223ca.C11166e;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16730d;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.completable.h */
/* compiled from: CompletableSubscribeOn */
public final class C13039h extends C16728b {

    /* renamed from: a */
    final C16730d f60802a;

    /* renamed from: c */
    final C16742o f60803c;

    /* renamed from: io.reactivex.internal.operators.completable.h$a */
    /* compiled from: CompletableSubscribeOn */
    static final class C13040a extends AtomicReference<C17071b> implements C16729c, C17071b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final C16729c downstream;
        final C16730d source;
        final C11166e task = new C11166e();

        C13040a(C16729c cVar, C16730d dVar) {
            this.downstream = cVar;
            this.source = dVar;
        }

        public void dispose() {
            C11163b.m74926b(this);
            this.task.dispose();
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

        public void onSubscribe(C17071b bVar) {
            C11163b.m74930g(this, bVar);
        }

        public void run() {
            this.source.mo79652a(this);
        }
    }

    public C13039h(C16730d dVar, C16742o oVar) {
        this.f60802a = dVar;
        this.f60803c = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        C13040a aVar = new C13040a(cVar, this.f60802a);
        cVar.onSubscribe(aVar);
        aVar.task.mo62369a(this.f60803c.mo70027b(aVar));
    }
}

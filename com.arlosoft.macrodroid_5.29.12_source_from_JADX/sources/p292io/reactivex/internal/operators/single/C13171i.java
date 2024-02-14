package p292io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p223ca.C11166e;
import p414v9.C16742o;
import p414v9.C16747p;
import p414v9.C16748q;
import p414v9.C16749r;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.single.i */
/* compiled from: SingleSubscribeOn */
public final class C13171i<T> extends C16747p<T> {

    /* renamed from: a */
    final C16749r<? extends T> f61010a;

    /* renamed from: c */
    final C16742o f61011c;

    /* renamed from: io.reactivex.internal.operators.single.i$a */
    /* compiled from: SingleSubscribeOn */
    static final class C13172a<T> extends AtomicReference<C17071b> implements C16748q<T>, C17071b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final C16748q<? super T> downstream;
        final C16749r<? extends T> source;
        final C11166e task = new C11166e();

        C13172a(C16748q<? super T> qVar, C16749r<? extends T> rVar) {
            this.downstream = qVar;
            this.source = rVar;
        }

        /* renamed from: b */
        public void mo69889b(T t) {
            this.downstream.mo69889b(t);
        }

        public void dispose() {
            C11163b.m74926b(this);
            this.task.dispose();
        }

        public boolean isDisposed() {
            return C11163b.m74927d((C17071b) get());
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(C17071b bVar) {
            C11163b.m74930g(this, bVar);
        }

        public void run() {
            this.source.mo79722a(this);
        }
    }

    public C13171i(C16749r<? extends T> rVar, C16742o oVar) {
        this.f61010a = rVar;
        this.f61011c = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        C13172a aVar = new C13172a(qVar, this.f61010a);
        qVar.onSubscribe(aVar);
        aVar.task.mo62369a(this.f61011c.mo70027b(aVar));
    }
}

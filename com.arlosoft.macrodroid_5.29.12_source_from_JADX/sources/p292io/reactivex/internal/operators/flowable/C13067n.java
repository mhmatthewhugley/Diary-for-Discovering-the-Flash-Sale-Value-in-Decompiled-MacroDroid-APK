package p292io.reactivex.internal.operators.flowable;

import p209aa.C11078a;
import p216ba.C11114e;
import p241da.C11984b;
import p278ha.C12411a;
import p292io.reactivex.internal.subscriptions.C13210c;
import p292io.reactivex.processors.C13232a;
import p292io.reactivex.processors.C13238d;
import p329me.C15737b;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;

/* renamed from: io.reactivex.internal.operators.flowable.n */
/* compiled from: FlowableRetryWhen */
public final class C13067n<T> extends C13044a<T, T> {

    /* renamed from: d */
    final C11114e<? super C16732f<Throwable>, ? extends C15737b<?>> f60831d;

    /* renamed from: io.reactivex.internal.operators.flowable.n$a */
    /* compiled from: FlowableRetryWhen */
    static final class C13068a<T> extends C13066m<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        C13068a(C15738c<? super T> cVar, C13232a<Throwable> aVar, C15739d dVar) {
            super(cVar, aVar, dVar);
        }

        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            mo69926g(th);
        }
    }

    public C13067n(C16732f<T> fVar, C11114e<? super C16732f<Throwable>, ? extends C15737b<?>> eVar) {
        super(fVar);
        this.f60831d = eVar;
    }

    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        C12411a aVar = new C12411a(cVar);
        C13232a B = C13238d.m85584D(8).mo70063B();
        try {
            C15737b bVar = (C15737b) C11984b.m82367d(this.f60831d.apply(B), "handler returned a null Publisher");
            C13065l lVar = new C13065l(this.f60808c);
            C13068a aVar2 = new C13068a(aVar, B, lVar);
            lVar.subscriber = aVar2;
            cVar.mo68760a(aVar2);
            bVar.mo75177b(lVar);
            lVar.onNext(0);
        } catch (Throwable th) {
            C11078a.m74639b(th);
            C13210c.m85516e(th, cVar);
        }
    }
}

package p292io.reactivex.internal.operators.flowable;

import p292io.reactivex.internal.subscriptions.C13210c;
import p292io.reactivex.internal.subscriptions.C13212e;
import p292io.reactivex.processors.C13232a;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.m */
/* compiled from: FlowableRepeatWhen */
abstract class C13066m<T, U> extends C13212e implements C16733g<T> {
    private static final long serialVersionUID = -5604623027276966720L;
    protected final C15738c<? super T> downstream;
    protected final C13232a<U> processor;
    private long produced;
    protected final C15739d receiver;

    C13066m(C15738c<? super T> cVar, C13232a<U> aVar, C15739d dVar) {
        super(false);
        this.downstream = cVar;
        this.processor = aVar;
        this.receiver = dVar;
    }

    /* renamed from: a */
    public final void mo68760a(C15739d dVar) {
        mo70038f(dVar);
    }

    public final void cancel() {
        super.cancel();
        this.receiver.cancel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo69926g(U u) {
        mo70038f(C13210c.INSTANCE);
        long j = this.produced;
        if (j != 0) {
            this.produced = 0;
            mo70037e(j);
        }
        this.receiver.request(1);
        this.processor.onNext(u);
    }

    public final void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }
}

package p292io.reactivex.internal.operators.observable;

import p251ea.C12183g;
import p292io.reactivex.internal.operators.observable.C13154y;
import p414v9.C16735i;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.operators.observable.t */
/* compiled from: ObservableJust */
public final class C13145t<T> extends C16735i<T> implements C12183g<T> {

    /* renamed from: a */
    private final T f60974a;

    public C13145t(T t) {
        this.f60974a = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C13154y.C13155a aVar = new C13154y.C13155a(nVar, this.f60974a);
        nVar.onSubscribe(aVar);
        aVar.run();
    }

    public T call() {
        return this.f60974a;
    }
}

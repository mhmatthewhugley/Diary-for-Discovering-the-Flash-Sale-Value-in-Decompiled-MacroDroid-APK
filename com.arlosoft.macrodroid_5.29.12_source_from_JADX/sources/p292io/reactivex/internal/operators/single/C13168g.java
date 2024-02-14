package p292io.reactivex.internal.operators.single;

import p414v9.C16747p;
import p414v9.C16748q;
import p448z9.C17072c;

/* renamed from: io.reactivex.internal.operators.single.g */
/* compiled from: SingleJust */
public final class C13168g<T> extends C16747p<T> {

    /* renamed from: a */
    final T f61007a;

    public C13168g(T t) {
        this.f61007a = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        qVar.onSubscribe(C17072c.m100417a());
        qVar.mo69889b(this.f61007a);
    }
}

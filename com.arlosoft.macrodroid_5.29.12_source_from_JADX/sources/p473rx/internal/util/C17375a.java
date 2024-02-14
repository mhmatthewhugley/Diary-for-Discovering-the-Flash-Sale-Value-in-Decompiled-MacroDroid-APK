package p473rx.internal.util;

import p459ef.C17162h;
import p464jf.C17176a;
import p464jf.C17177b;

/* renamed from: rx.internal.util.a */
/* compiled from: ActionSubscriber */
public final class C17375a<T> extends C17162h<T> {

    /* renamed from: g */
    final C17177b<? super T> f69122g;

    /* renamed from: o */
    final C17177b<Throwable> f69123o;

    /* renamed from: p */
    final C17176a f69124p;

    public C17375a(C17177b<? super T> bVar, C17177b<Throwable> bVar2, C17176a aVar) {
        this.f69122g = bVar;
        this.f69123o = bVar2;
        this.f69124p = aVar;
    }

    public void onCompleted() {
        this.f69124p.call();
    }

    public void onError(Throwable th) {
        this.f69123o.mo26537a(th);
    }

    public void onNext(T t) {
        this.f69122g.mo26537a(t);
    }
}

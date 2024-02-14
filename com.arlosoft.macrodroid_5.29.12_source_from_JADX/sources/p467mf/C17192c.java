package p467mf;

import p459ef.C17156d;
import p459ef.C17162h;

/* renamed from: mf.c */
/* compiled from: SerializedSubscriber */
public class C17192c<T> extends C17162h<T> {

    /* renamed from: g */
    private final C17156d<T> f68746g;

    public C17192c(C17162h<? super T> hVar) {
        this(hVar, true);
    }

    public void onCompleted() {
        this.f68746g.onCompleted();
    }

    public void onError(Throwable th) {
        this.f68746g.onError(th);
    }

    public void onNext(T t) {
        this.f68746g.onNext(t);
    }

    public C17192c(C17162h<? super T> hVar, boolean z) {
        super(hVar, z);
        this.f68746g = new C17190b(hVar);
    }
}

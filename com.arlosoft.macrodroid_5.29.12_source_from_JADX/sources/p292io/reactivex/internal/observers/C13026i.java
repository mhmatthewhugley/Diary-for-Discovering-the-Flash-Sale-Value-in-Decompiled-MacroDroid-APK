package p292io.reactivex.internal.observers;

import p223ca.C11163b;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16729c;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.observers.i */
/* compiled from: SubscriberCompletableObserver */
public final class C13026i<T> implements C16729c, C15739d {

    /* renamed from: a */
    final C15738c<? super T> f60780a;

    /* renamed from: c */
    C17071b f60781c;

    public C13026i(C15738c<? super T> cVar) {
        this.f60780a = cVar;
    }

    public void cancel() {
        this.f60781c.dispose();
    }

    public void onComplete() {
        this.f60780a.onComplete();
    }

    public void onError(Throwable th) {
        this.f60780a.onError(th);
    }

    public void onSubscribe(C17071b bVar) {
        if (C11163b.m74932j(this.f60781c, bVar)) {
            this.f60781c = bVar;
            this.f60780a.mo68760a(this);
        }
    }

    public void request(long j) {
    }
}

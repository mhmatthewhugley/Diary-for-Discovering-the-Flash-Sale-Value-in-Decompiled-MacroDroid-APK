package p292io.reactivex.internal.observers;

import p209aa.C11078a;
import p216ba.C11110a;
import p216ba.C11113d;
import p223ca.C11163b;
import p223ca.C11164c;
import p262fa.C12251a;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.observers.g */
/* compiled from: DisposableLambdaObserver */
public final class C13024g<T> implements C16741n<T>, C17071b {

    /* renamed from: a */
    final C16741n<? super T> f60776a;

    /* renamed from: c */
    final C11113d<? super C17071b> f60777c;

    /* renamed from: d */
    final C11110a f60778d;

    /* renamed from: f */
    C17071b f60779f;

    public C13024g(C16741n<? super T> nVar, C11113d<? super C17071b> dVar, C11110a aVar) {
        this.f60776a = nVar;
        this.f60777c = dVar;
        this.f60778d = aVar;
    }

    public void dispose() {
        C17071b bVar = this.f60779f;
        C11163b bVar2 = C11163b.DISPOSED;
        if (bVar != bVar2) {
            this.f60779f = bVar2;
            try {
                this.f60778d.run();
            } catch (Throwable th) {
                C11078a.m74639b(th);
                C12251a.m82985p(th);
            }
            bVar.dispose();
        }
    }

    public boolean isDisposed() {
        return this.f60779f.isDisposed();
    }

    public void onComplete() {
        C17071b bVar = this.f60779f;
        C11163b bVar2 = C11163b.DISPOSED;
        if (bVar != bVar2) {
            this.f60779f = bVar2;
            this.f60776a.onComplete();
        }
    }

    public void onError(Throwable th) {
        C17071b bVar = this.f60779f;
        C11163b bVar2 = C11163b.DISPOSED;
        if (bVar != bVar2) {
            this.f60779f = bVar2;
            this.f60776a.onError(th);
            return;
        }
        C12251a.m82985p(th);
    }

    public void onNext(T t) {
        this.f60776a.onNext(t);
    }

    public void onSubscribe(C17071b bVar) {
        try {
            this.f60777c.accept(bVar);
            if (C11163b.m74932j(this.f60779f, bVar)) {
                this.f60779f = bVar;
                this.f60776a.onSubscribe(this);
            }
        } catch (Throwable th) {
            C11078a.m74639b(th);
            bVar.dispose();
            this.f60779f = C11163b.DISPOSED;
            C11164c.m74936g(th, this.f60776a);
        }
    }
}

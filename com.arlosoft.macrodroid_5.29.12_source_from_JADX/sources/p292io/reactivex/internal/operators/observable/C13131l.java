package p292io.reactivex.internal.operators.observable;

import p209aa.C11078a;
import p216ba.C11114e;
import p223ca.C11163b;
import p241da.C11984b;
import p262fa.C12251a;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.l */
/* compiled from: ObservableFlattenIterable */
public final class C13131l<T, R> extends C13083a<T, R> {

    /* renamed from: c */
    final C11114e<? super T, ? extends Iterable<? extends R>> f60946c;

    /* renamed from: io.reactivex.internal.operators.observable.l$a */
    /* compiled from: ObservableFlattenIterable */
    static final class C13132a<T, R> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16741n<? super R> f60947a;

        /* renamed from: c */
        final C11114e<? super T, ? extends Iterable<? extends R>> f60948c;

        /* renamed from: d */
        C17071b f60949d;

        C13132a(C16741n<? super R> nVar, C11114e<? super T, ? extends Iterable<? extends R>> eVar) {
            this.f60947a = nVar;
            this.f60948c = eVar;
        }

        public void dispose() {
            this.f60949d.dispose();
            this.f60949d = C11163b.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f60949d.isDisposed();
        }

        public void onComplete() {
            C17071b bVar = this.f60949d;
            C11163b bVar2 = C11163b.DISPOSED;
            if (bVar != bVar2) {
                this.f60949d = bVar2;
                this.f60947a.onComplete();
            }
        }

        public void onError(Throwable th) {
            C17071b bVar = this.f60949d;
            C11163b bVar2 = C11163b.DISPOSED;
            if (bVar == bVar2) {
                C12251a.m82985p(th);
                return;
            }
            this.f60949d = bVar2;
            this.f60947a.onError(th);
        }

        public void onNext(T t) {
            if (this.f60949d != C11163b.DISPOSED) {
                try {
                    C16741n<? super R> nVar = this.f60947a;
                    for (Object d : (Iterable) this.f60948c.apply(t)) {
                        try {
                            try {
                                nVar.onNext(C11984b.m82367d(d, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                C11078a.m74639b(th);
                                this.f60949d.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C11078a.m74639b(th2);
                            this.f60949d.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    C11078a.m74639b(th3);
                    this.f60949d.dispose();
                    onError(th3);
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60949d, bVar)) {
                this.f60949d = bVar;
                this.f60947a.onSubscribe(this);
            }
        }
    }

    public C13131l(C16739l<T> lVar, C11114e<? super T, ? extends Iterable<? extends R>> eVar) {
        super(lVar);
        this.f60946c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super R> nVar) {
        this.f60853a.mo79695a(new C13132a(nVar, this.f60946c));
    }
}

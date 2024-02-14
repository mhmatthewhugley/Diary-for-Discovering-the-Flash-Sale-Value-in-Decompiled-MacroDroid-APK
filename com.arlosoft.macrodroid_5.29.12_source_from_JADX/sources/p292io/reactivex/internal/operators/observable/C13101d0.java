package p292io.reactivex.internal.operators.observable;

import p209aa.C11078a;
import p216ba.C11116g;
import p223ca.C11163b;
import p262fa.C12251a;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.d0 */
/* compiled from: ObservableTakeWhile */
public final class C13101d0<T> extends C13083a<T, T> {

    /* renamed from: c */
    final C11116g<? super T> f60882c;

    /* renamed from: io.reactivex.internal.operators.observable.d0$a */
    /* compiled from: ObservableTakeWhile */
    static final class C13102a<T> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16741n<? super T> f60883a;

        /* renamed from: c */
        final C11116g<? super T> f60884c;

        /* renamed from: d */
        C17071b f60885d;

        /* renamed from: f */
        boolean f60886f;

        C13102a(C16741n<? super T> nVar, C11116g<? super T> gVar) {
            this.f60883a = nVar;
            this.f60884c = gVar;
        }

        public void dispose() {
            this.f60885d.dispose();
        }

        public boolean isDisposed() {
            return this.f60885d.isDisposed();
        }

        public void onComplete() {
            if (!this.f60886f) {
                this.f60886f = true;
                this.f60883a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f60886f) {
                C12251a.m82985p(th);
                return;
            }
            this.f60886f = true;
            this.f60883a.onError(th);
        }

        public void onNext(T t) {
            if (!this.f60886f) {
                try {
                    if (!this.f60884c.test(t)) {
                        this.f60886f = true;
                        this.f60885d.dispose();
                        this.f60883a.onComplete();
                        return;
                    }
                    this.f60883a.onNext(t);
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    this.f60885d.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60885d, bVar)) {
                this.f60885d = bVar;
                this.f60883a.onSubscribe(this);
            }
        }
    }

    public C13101d0(C16739l<T> lVar, C11116g<? super T> gVar) {
        super(lVar);
        this.f60882c = gVar;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13102a(nVar, this.f60882c));
    }
}

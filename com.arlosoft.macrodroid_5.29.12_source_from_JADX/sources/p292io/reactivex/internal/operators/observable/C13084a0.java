package p292io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p223ca.C11163b;
import p262fa.C12251a;
import p414v9.C16739l;
import p414v9.C16741n;
import p414v9.C16747p;
import p414v9.C16748q;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.a0 */
/* compiled from: ObservableSingleSingle */
public final class C13084a0<T> extends C16747p<T> {

    /* renamed from: a */
    final C16739l<? extends T> f60854a;

    /* renamed from: c */
    final T f60855c;

    /* renamed from: io.reactivex.internal.operators.observable.a0$a */
    /* compiled from: ObservableSingleSingle */
    static final class C13085a<T> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16748q<? super T> f60856a;

        /* renamed from: c */
        final T f60857c;

        /* renamed from: d */
        C17071b f60858d;

        /* renamed from: f */
        T f60859f;

        /* renamed from: g */
        boolean f60860g;

        C13085a(C16748q<? super T> qVar, T t) {
            this.f60856a = qVar;
            this.f60857c = t;
        }

        public void dispose() {
            this.f60858d.dispose();
        }

        public boolean isDisposed() {
            return this.f60858d.isDisposed();
        }

        public void onComplete() {
            if (!this.f60860g) {
                this.f60860g = true;
                T t = this.f60859f;
                this.f60859f = null;
                if (t == null) {
                    t = this.f60857c;
                }
                if (t != null) {
                    this.f60856a.mo69889b(t);
                } else {
                    this.f60856a.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f60860g) {
                C12251a.m82985p(th);
                return;
            }
            this.f60860g = true;
            this.f60856a.onError(th);
        }

        public void onNext(T t) {
            if (!this.f60860g) {
                if (this.f60859f != null) {
                    this.f60860g = true;
                    this.f60858d.dispose();
                    this.f60856a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f60859f = t;
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60858d, bVar)) {
                this.f60858d = bVar;
                this.f60856a.onSubscribe(this);
            }
        }
    }

    public C13084a0(C16739l<? extends T> lVar, T t) {
        this.f60854a = lVar;
        this.f60855c = t;
    }

    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        this.f60854a.mo79695a(new C13085a(qVar, this.f60855c));
    }
}

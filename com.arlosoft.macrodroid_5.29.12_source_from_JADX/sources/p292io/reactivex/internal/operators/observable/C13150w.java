package p292io.reactivex.internal.operators.observable;

import p209aa.C11078a;
import p216ba.C11114e;
import p223ca.C11166e;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.w */
/* compiled from: ObservableOnErrorNext */
public final class C13150w<T> extends C13083a<T, T> {

    /* renamed from: c */
    final C11114e<? super Throwable, ? extends C16739l<? extends T>> f60980c;

    /* renamed from: d */
    final boolean f60981d;

    /* renamed from: io.reactivex.internal.operators.observable.w$a */
    /* compiled from: ObservableOnErrorNext */
    static final class C13151a<T> implements C16741n<T> {

        /* renamed from: a */
        final C16741n<? super T> f60982a;

        /* renamed from: c */
        final C11114e<? super Throwable, ? extends C16739l<? extends T>> f60983c;

        /* renamed from: d */
        final boolean f60984d;

        /* renamed from: f */
        final C11166e f60985f = new C11166e();

        /* renamed from: g */
        boolean f60986g;

        /* renamed from: o */
        boolean f60987o;

        C13151a(C16741n<? super T> nVar, C11114e<? super Throwable, ? extends C16739l<? extends T>> eVar, boolean z) {
            this.f60982a = nVar;
            this.f60983c = eVar;
            this.f60984d = z;
        }

        public void onComplete() {
            if (!this.f60987o) {
                this.f60987o = true;
                this.f60986g = true;
                this.f60982a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f60986g) {
                this.f60986g = true;
                if (!this.f60984d || (th instanceof Exception)) {
                    try {
                        C16739l lVar = (C16739l) this.f60983c.apply(th);
                        if (lVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f60982a.onError(nullPointerException);
                            return;
                        }
                        lVar.mo79695a(this);
                    } catch (Throwable th2) {
                        C11078a.m74639b(th2);
                        this.f60982a.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f60982a.onError(th);
                }
            } else if (this.f60987o) {
                C12251a.m82985p(th);
            } else {
                this.f60982a.onError(th);
            }
        }

        public void onNext(T t) {
            if (!this.f60987o) {
                this.f60982a.onNext(t);
            }
        }

        public void onSubscribe(C17071b bVar) {
            this.f60985f.mo62369a(bVar);
        }
    }

    public C13150w(C16739l<T> lVar, C11114e<? super Throwable, ? extends C16739l<? extends T>> eVar, boolean z) {
        super(lVar);
        this.f60980c = eVar;
        this.f60981d = z;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C13151a aVar = new C13151a(nVar, this.f60980c, this.f60981d);
        nVar.onSubscribe(aVar.f60985f);
        this.f60853a.mo79695a(aVar);
    }
}

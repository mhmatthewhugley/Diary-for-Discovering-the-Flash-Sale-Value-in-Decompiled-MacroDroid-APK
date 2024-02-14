package p292io.reactivex.internal.operators.observable;

import p216ba.C11114e;
import p241da.C11984b;
import p292io.reactivex.internal.observers.C13018a;
import p414v9.C16739l;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.operators.observable.u */
/* compiled from: ObservableMap */
public final class C13146u<T, U> extends C13083a<T, U> {

    /* renamed from: c */
    final C11114e<? super T, ? extends U> f60975c;

    /* renamed from: io.reactivex.internal.operators.observable.u$a */
    /* compiled from: ObservableMap */
    static final class C13147a<T, U> extends C13018a<T, U> {

        /* renamed from: o */
        final C11114e<? super T, ? extends U> f60976o;

        C13147a(C16741n<? super U> nVar, C11114e<? super T, ? extends U> eVar) {
            super(nVar);
            this.f60976o = eVar;
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            return mo69883e(i);
        }

        public void onNext(T t) {
            if (!this.f60774f) {
                if (this.f60775g != 0) {
                    this.f60771a.onNext(null);
                    return;
                }
                try {
                    this.f60771a.onNext(C11984b.m82367d(this.f60976o.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo69882c(th);
                }
            }
        }

        public U poll() throws Exception {
            T poll = this.f60773d.poll();
            if (poll != null) {
                return C11984b.m82367d(this.f60976o.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public C13146u(C16739l<T> lVar, C11114e<? super T, ? extends U> eVar) {
        super(lVar);
        this.f60975c = eVar;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super U> nVar) {
        this.f60853a.mo79695a(new C13147a(nVar, this.f60975c));
    }
}

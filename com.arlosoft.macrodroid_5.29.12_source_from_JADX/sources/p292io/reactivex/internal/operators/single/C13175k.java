package p292io.reactivex.internal.operators.single;

import p223ca.C11163b;
import p292io.reactivex.internal.observers.C13023f;
import p414v9.C16735i;
import p414v9.C16741n;
import p414v9.C16748q;
import p414v9.C16749r;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.single.k */
/* compiled from: SingleToObservable */
public final class C13175k<T> extends C16735i<T> {

    /* renamed from: a */
    final C16749r<? extends T> f61013a;

    /* renamed from: io.reactivex.internal.operators.single.k$a */
    /* compiled from: SingleToObservable */
    static final class C13176a<T> extends C13023f<T> implements C16748q<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        C17071b upstream;

        C13176a(C16741n<? super T> nVar) {
            super(nVar);
        }

        /* renamed from: b */
        public void mo69889b(T t) {
            mo69892a(t);
        }

        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        public void onError(Throwable th) {
            mo69893s(th);
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C13175k(C16749r<? extends T> rVar) {
        this.f61013a = rVar;
    }

    /* renamed from: h0 */
    public static <T> C16748q<T> m85436h0(C16741n<? super T> nVar) {
        return new C13176a(nVar);
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f61013a.mo79722a(m85436h0(nVar));
    }
}

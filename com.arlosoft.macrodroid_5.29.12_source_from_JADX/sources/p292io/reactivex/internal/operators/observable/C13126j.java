package p292io.reactivex.internal.operators.observable;

import p216ba.C11116g;
import p292io.reactivex.internal.observers.C13018a;
import p414v9.C16739l;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.operators.observable.j */
/* compiled from: ObservableFilter */
public final class C13126j<T> extends C13083a<T, T> {

    /* renamed from: c */
    final C11116g<? super T> f60937c;

    /* renamed from: io.reactivex.internal.operators.observable.j$a */
    /* compiled from: ObservableFilter */
    static final class C13127a<T> extends C13018a<T, T> {

        /* renamed from: o */
        final C11116g<? super T> f60938o;

        C13127a(C16741n<? super T> nVar, C11116g<? super T> gVar) {
            super(nVar);
            this.f60938o = gVar;
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            return mo69883e(i);
        }

        public void onNext(T t) {
            if (this.f60775g == 0) {
                try {
                    if (this.f60938o.test(t)) {
                        this.f60771a.onNext(t);
                    }
                } catch (Throwable th) {
                    mo69882c(th);
                }
            } else {
                this.f60771a.onNext(null);
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public T poll() throws java.lang.Exception {
            /*
                r2 = this;
            L_0x0000:
                ea.d<T> r0 = r2.f60773d
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L_0x0010
                ba.g<? super T> r1 = r2.f60938o
                boolean r1 = r1.test(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.reactivex.internal.operators.observable.C13126j.C13127a.poll():java.lang.Object");
        }
    }

    public C13126j(C16739l<T> lVar, C11116g<? super T> gVar) {
        super(lVar);
        this.f60937c = gVar;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13127a(nVar, this.f60937c));
    }
}

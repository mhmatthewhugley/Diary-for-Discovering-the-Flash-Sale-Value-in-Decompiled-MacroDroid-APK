package p454af;

import p209aa.C11078a;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16735i;
import p414v9.C16741n;
import p448z9.C17071b;
import retrofit2.C17236b;
import retrofit2.C17239d;
import retrofit2.C17300s;

/* renamed from: af.b */
/* compiled from: CallEnqueueObservable */
final class C17096b<T> extends C16735i<C17300s<T>> {

    /* renamed from: a */
    private final C17236b<T> f68658a;

    /* renamed from: af.b$a */
    /* compiled from: CallEnqueueObservable */
    private static final class C17097a<T> implements C17071b, C17239d<T> {

        /* renamed from: a */
        private final C17236b<?> f68659a;

        /* renamed from: c */
        private final C16741n<? super C17300s<T>> f68660c;

        /* renamed from: d */
        private volatile boolean f68661d;

        /* renamed from: f */
        boolean f68662f = false;

        C17097a(C17236b<?> bVar, C16741n<? super C17300s<T>> nVar) {
            this.f68659a = bVar;
            this.f68660c = nVar;
        }

        /* renamed from: a */
        public void mo80374a(C17236b<T> bVar, Throwable th) {
            if (!bVar.mo80535I()) {
                try {
                    this.f68660c.onError(th);
                } catch (Throwable th2) {
                    C11078a.m74639b(th2);
                    C12251a.m82985p(new CompositeException(th, th2));
                }
            }
        }

        /* renamed from: b */
        public void mo80375b(C17236b<T> bVar, C17300s<T> sVar) {
            if (!this.f68661d) {
                try {
                    this.f68660c.onNext(sVar);
                    if (!this.f68661d) {
                        this.f68662f = true;
                        this.f68660c.onComplete();
                    }
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    C12251a.m82985p(new CompositeException(th, th));
                }
            }
        }

        public void dispose() {
            this.f68661d = true;
            this.f68659a.cancel();
        }

        public boolean isDisposed() {
            return this.f68661d;
        }
    }

    C17096b(C17236b<T> bVar) {
        this.f68658a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super C17300s<T>> nVar) {
        C17236b<T> P1 = this.f68658a.mo80536P1();
        C17097a aVar = new C17097a(P1, nVar);
        nVar.onSubscribe(aVar);
        P1.mo80540q0(aVar);
    }
}

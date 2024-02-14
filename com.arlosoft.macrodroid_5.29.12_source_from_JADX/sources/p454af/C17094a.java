package p454af;

import p209aa.C11078a;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16735i;
import p414v9.C16741n;
import p448z9.C17071b;
import retrofit2.C17300s;
import retrofit2.adapter.rxjava2.HttpException;

/* renamed from: af.a */
/* compiled from: BodyObservable */
final class C17094a<T> extends C16735i<T> {

    /* renamed from: a */
    private final C16735i<C17300s<T>> f68655a;

    /* renamed from: af.a$a */
    /* compiled from: BodyObservable */
    private static class C17095a<R> implements C16741n<C17300s<R>> {

        /* renamed from: a */
        private final C16741n<? super R> f68656a;

        /* renamed from: c */
        private boolean f68657c;

        C17095a(C16741n<? super R> nVar) {
            this.f68656a = nVar;
        }

        /* renamed from: a */
        public void onNext(C17300s<R> sVar) {
            if (sVar.mo80595e()) {
                this.f68656a.onNext(sVar.mo80592a());
                return;
            }
            this.f68657c = true;
            HttpException httpException = new HttpException(sVar);
            try {
                this.f68656a.onError(httpException);
            } catch (Throwable th) {
                C11078a.m74639b(th);
                C12251a.m82985p(new CompositeException(httpException, th));
            }
        }

        public void onComplete() {
            if (!this.f68657c) {
                this.f68656a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f68657c) {
                this.f68656a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C12251a.m82985p(assertionError);
        }

        public void onSubscribe(C17071b bVar) {
            this.f68656a.onSubscribe(bVar);
        }
    }

    C17094a(C16735i<C17300s<T>> iVar) {
        this.f68655a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f68655a.mo79695a(new C17095a(nVar));
    }
}

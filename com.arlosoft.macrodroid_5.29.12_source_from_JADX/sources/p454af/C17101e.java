package p454af;

import p209aa.C11078a;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16735i;
import p414v9.C16741n;
import p448z9.C17071b;
import retrofit2.C17300s;

/* renamed from: af.e */
/* compiled from: ResultObservable */
final class C17101e<T> extends C16735i<C17100d<T>> {

    /* renamed from: a */
    private final C16735i<C17300s<T>> f68668a;

    /* renamed from: af.e$a */
    /* compiled from: ResultObservable */
    private static class C17102a<R> implements C16741n<C17300s<R>> {

        /* renamed from: a */
        private final C16741n<? super C17100d<R>> f68669a;

        C17102a(C16741n<? super C17100d<R>> nVar) {
            this.f68669a = nVar;
        }

        /* renamed from: a */
        public void onNext(C17300s<R> sVar) {
            this.f68669a.onNext(C17100d.m100572b(sVar));
        }

        public void onComplete() {
            this.f68669a.onComplete();
        }

        public void onError(Throwable th) {
            try {
                this.f68669a.onNext(C17100d.m100571a(th));
                this.f68669a.onComplete();
            } catch (Throwable th2) {
                C11078a.m74639b(th2);
                C12251a.m82985p(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(C17071b bVar) {
            this.f68669a.onSubscribe(bVar);
        }
    }

    C17101e(C16735i<C17300s<T>> iVar) {
        this.f68668a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super C17100d<T>> nVar) {
        this.f68668a.mo79695a(new C17102a(nVar));
    }
}

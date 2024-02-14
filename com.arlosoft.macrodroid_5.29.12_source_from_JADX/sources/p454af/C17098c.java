package p454af;

import p209aa.C11078a;
import p262fa.C12251a;
import p292io.reactivex.exceptions.CompositeException;
import p414v9.C16735i;
import p414v9.C16741n;
import p448z9.C17071b;
import retrofit2.C17236b;
import retrofit2.C17300s;

/* renamed from: af.c */
/* compiled from: CallExecuteObservable */
final class C17098c<T> extends C16735i<C17300s<T>> {

    /* renamed from: a */
    private final C17236b<T> f68663a;

    /* renamed from: af.c$a */
    /* compiled from: CallExecuteObservable */
    private static final class C17099a implements C17071b {

        /* renamed from: a */
        private final C17236b<?> f68664a;

        /* renamed from: c */
        private volatile boolean f68665c;

        C17099a(C17236b<?> bVar) {
            this.f68664a = bVar;
        }

        public void dispose() {
            this.f68665c = true;
            this.f68664a.cancel();
        }

        public boolean isDisposed() {
            return this.f68665c;
        }
    }

    C17098c(C17236b<T> bVar) {
        this.f68663a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super C17300s<T>> nVar) {
        boolean z;
        C17236b<T> P1 = this.f68663a.mo80536P1();
        C17099a aVar = new C17099a(P1);
        nVar.onSubscribe(aVar);
        try {
            C17300s<T> execute = P1.execute();
            if (!aVar.isDisposed()) {
                nVar.onNext(execute);
            }
            if (!aVar.isDisposed()) {
                try {
                    nVar.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            C11078a.m74639b(th);
            if (z) {
                C12251a.m82985p(th);
            } else if (!aVar.isDisposed()) {
                try {
                    nVar.onError(th);
                } catch (Throwable th3) {
                    C11078a.m74639b(th3);
                    C12251a.m82985p(new CompositeException(th, th3));
                }
            }
        }
    }
}

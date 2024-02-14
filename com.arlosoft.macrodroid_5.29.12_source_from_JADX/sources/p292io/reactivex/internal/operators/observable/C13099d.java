package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p223ca.C11163b;
import p262fa.C12251a;
import p414v9.C16735i;
import p414v9.C16737j;
import p414v9.C16738k;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.d */
/* compiled from: ObservableCreate */
public final class C13099d<T> extends C16735i<T> {

    /* renamed from: a */
    final C16738k<T> f60881a;

    /* renamed from: io.reactivex.internal.operators.observable.d$a */
    /* compiled from: ObservableCreate */
    static final class C13100a<T> extends AtomicReference<C17071b> implements C16737j<T>, C17071b {
        private static final long serialVersionUID = -3434801548987643227L;
        final C16741n<? super T> observer;

        C13100a(C16741n<? super T> nVar) {
            this.observer = nVar;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public boolean mo69943a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.observer.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        public void dispose() {
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return C11163b.m74927d((C17071b) get());
        }

        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.observer.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo69943a(th)) {
                C12251a.m82985p(th);
            }
        }

        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!isDisposed()) {
                this.observer.onNext(t);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C13100a.class.getSimpleName(), super.toString()});
        }
    }

    public C13099d(C16738k<T> kVar) {
        this.f60881a = kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C13100a aVar = new C13100a(nVar);
        nVar.onSubscribe(aVar);
        try {
            this.f60881a.mo16895a(aVar);
        } catch (Throwable th) {
            C11078a.m74639b(th);
            aVar.onError(th);
        }
    }
}

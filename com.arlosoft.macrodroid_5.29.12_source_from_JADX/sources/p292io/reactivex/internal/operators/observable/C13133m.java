package p292io.reactivex.internal.operators.observable;

import p241da.C11984b;
import p292io.reactivex.internal.observers.C13020c;
import p414v9.C16735i;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.operators.observable.m */
/* compiled from: ObservableFromArray */
public final class C13133m<T> extends C16735i<T> {

    /* renamed from: a */
    final T[] f60950a;

    /* renamed from: io.reactivex.internal.operators.observable.m$a */
    /* compiled from: ObservableFromArray */
    static final class C13134a<T> extends C13020c<T> {

        /* renamed from: a */
        final C16741n<? super T> f60951a;

        /* renamed from: c */
        final T[] f60952c;

        /* renamed from: d */
        int f60953d;

        /* renamed from: f */
        boolean f60954f;

        /* renamed from: g */
        volatile boolean f60955g;

        C13134a(C16741n<? super T> nVar, T[] tArr) {
            this.f60951a = nVar;
            this.f60952c = tArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69969a() {
            T[] tArr = this.f60952c;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    C16741n<? super T> nVar = this.f60951a;
                    nVar.onError(new NullPointerException("The " + i + "th element is null"));
                    return;
                }
                this.f60951a.onNext(t);
            }
            if (!isDisposed()) {
                this.f60951a.onComplete();
            }
        }

        public void clear() {
            this.f60953d = this.f60952c.length;
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f60954f = true;
            return 1;
        }

        public void dispose() {
            this.f60955g = true;
        }

        public boolean isDisposed() {
            return this.f60955g;
        }

        public boolean isEmpty() {
            return this.f60953d == this.f60952c.length;
        }

        public T poll() {
            int i = this.f60953d;
            T[] tArr = this.f60952c;
            if (i == tArr.length) {
                return null;
            }
            this.f60953d = i + 1;
            return C11984b.m82367d(tArr[i], "The array element is null");
        }
    }

    public C13133m(T[] tArr) {
        this.f60950a = tArr;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C13134a aVar = new C13134a(nVar, this.f60950a);
        nVar.onSubscribe(aVar);
        if (!aVar.f60954f) {
            aVar.mo69969a();
        }
    }
}

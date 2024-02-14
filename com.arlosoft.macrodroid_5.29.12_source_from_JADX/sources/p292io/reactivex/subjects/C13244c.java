package p292io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p241da.C11984b;
import p262fa.C12251a;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.subjects.c */
/* compiled from: PublishSubject */
public final class C13244c<T> extends C13246d<T> {

    /* renamed from: d */
    static final C13245a[] f61178d = new C13245a[0];

    /* renamed from: f */
    static final C13245a[] f61179f = new C13245a[0];

    /* renamed from: a */
    final AtomicReference<C13245a<T>[]> f61180a = new AtomicReference<>(f61179f);

    /* renamed from: c */
    Throwable f61181c;

    /* renamed from: io.reactivex.subjects.c$a */
    /* compiled from: PublishSubject */
    static final class C13245a<T> extends AtomicBoolean implements C17071b {
        private static final long serialVersionUID = 3562861878281475070L;
        final C16741n<? super T> downstream;
        final C13244c<T> parent;

        C13245a(C16741n<? super T> nVar, C13244c<T> cVar) {
            this.downstream = nVar;
            this.parent = cVar;
        }

        /* renamed from: a */
        public void mo70088a() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        /* renamed from: b */
        public void mo70089b(Throwable th) {
            if (get()) {
                C12251a.m82985p(th);
            } else {
                this.downstream.onError(th);
            }
        }

        /* renamed from: c */
        public void mo70090c(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.mo70087j0(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    C13244c() {
    }

    /* renamed from: i0 */
    public static <T> C13244c<T> m85607i0() {
        return new C13244c<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C13245a aVar = new C13245a(nVar, this);
        nVar.onSubscribe(aVar);
        if (!mo70086h0(aVar)) {
            Throwable th = this.f61181c;
            if (th != null) {
                nVar.onError(th);
            } else {
                nVar.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo70087j0(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public boolean mo70086h0(C13245a<T> aVar) {
        C13245a[] aVarArr;
        C13245a[] aVarArr2;
        do {
            aVarArr = (C13245a[]) this.f61180a.get();
            if (aVarArr == f61178d) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C13245a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f61180a.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo70087j0(C13245a<T> aVar) {
        C13245a<T>[] aVarArr;
        C13245a[] aVarArr2;
        do {
            aVarArr = (C13245a[]) this.f61180a.get();
            if (aVarArr != f61178d && aVarArr != f61179f) {
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f61179f;
                    } else {
                        C13245a[] aVarArr3 = new C13245a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f61180a.compareAndSet(aVarArr, aVarArr2));
    }

    public void onComplete() {
        C13245a<T>[] aVarArr = this.f61180a.get();
        C13245a<T>[] aVarArr2 = f61178d;
        if (aVarArr != aVarArr2) {
            for (C13245a a : (C13245a[]) this.f61180a.getAndSet(aVarArr2)) {
                a.mo70088a();
            }
        }
    }

    public void onError(Throwable th) {
        C11984b.m82367d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        C13245a<T>[] aVarArr = this.f61180a.get();
        C13245a<T>[] aVarArr2 = f61178d;
        if (aVarArr == aVarArr2) {
            C12251a.m82985p(th);
            return;
        }
        this.f61181c = th;
        for (C13245a b : (C13245a[]) this.f61180a.getAndSet(aVarArr2)) {
            b.mo70089b(th);
        }
    }

    public void onNext(T t) {
        C11984b.m82367d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C13245a c : (C13245a[]) this.f61180a.get()) {
            c.mo70090c(t);
        }
    }

    public void onSubscribe(C17071b bVar) {
        if (this.f61180a.get() == f61178d) {
            bVar.dispose();
        }
    }
}

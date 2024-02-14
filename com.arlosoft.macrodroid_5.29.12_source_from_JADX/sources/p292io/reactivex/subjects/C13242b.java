package p292io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p241da.C11984b;
import p262fa.C12251a;
import p414v9.C16728b;
import p414v9.C16729c;
import p448z9.C17071b;

/* renamed from: io.reactivex.subjects.b */
/* compiled from: CompletableSubject */
public final class C13242b extends C16728b implements C16729c {

    /* renamed from: f */
    static final C13243a[] f61173f = new C13243a[0];

    /* renamed from: g */
    static final C13243a[] f61174g = new C13243a[0];

    /* renamed from: a */
    final AtomicReference<C13243a[]> f61175a = new AtomicReference<>(f61173f);

    /* renamed from: c */
    final AtomicBoolean f61176c = new AtomicBoolean();

    /* renamed from: d */
    Throwable f61177d;

    /* renamed from: io.reactivex.subjects.b$a */
    /* compiled from: CompletableSubject */
    static final class C13243a extends AtomicReference<C13242b> implements C17071b {
        private static final long serialVersionUID = -7650903191002190468L;
        final C16729c downstream;

        C13243a(C16729c cVar, C13242b bVar) {
            this.downstream = cVar;
            lazySet(bVar);
        }

        public void dispose() {
            C13242b bVar = (C13242b) getAndSet((Object) null);
            if (bVar != null) {
                bVar.mo70085v(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    C13242b() {
    }

    /* renamed from: t */
    public static C13242b m85602t() {
        return new C13242b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        C13243a aVar = new C13243a(cVar, this);
        cVar.onSubscribe(aVar);
        if (!mo70083s(aVar)) {
            Throwable th = this.f61177d;
            if (th != null) {
                cVar.onError(th);
            } else {
                cVar.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo70085v(aVar);
        }
    }

    public void onComplete() {
        if (this.f61176c.compareAndSet(false, true)) {
            for (C13243a aVar : this.f61175a.getAndSet(f61174g)) {
                aVar.downstream.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        C11984b.m82367d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61176c.compareAndSet(false, true)) {
            this.f61177d = th;
            for (C13243a aVar : this.f61175a.getAndSet(f61174g)) {
                aVar.downstream.onError(th);
            }
            return;
        }
        C12251a.m82985p(th);
    }

    public void onSubscribe(C17071b bVar) {
        if (this.f61175a.get() == f61174g) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo70083s(C13243a aVar) {
        C13243a[] aVarArr;
        C13243a[] aVarArr2;
        do {
            aVarArr = this.f61175a.get();
            if (aVarArr == f61174g) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C13243a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f61175a.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* renamed from: u */
    public boolean mo70084u() {
        return this.f61175a.get() == f61174g && this.f61177d == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo70085v(C13243a aVar) {
        C13243a[] aVarArr;
        C13243a[] aVarArr2;
        do {
            aVarArr = this.f61175a.get();
            int length = aVarArr.length;
            if (length != 0) {
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
                        aVarArr2 = f61173f;
                    } else {
                        C13243a[] aVarArr3 = new C13243a[(length - 1)];
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
        } while (!this.f61175a.compareAndSet(aVarArr, aVarArr2));
    }
}

package p292io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p262fa.C12251a;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16730d;
import p448z9.C17070a;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.completable.e */
/* compiled from: CompletableMergeArray */
public final class C13033e extends C16728b {

    /* renamed from: a */
    final C16730d[] f60789a;

    /* renamed from: io.reactivex.internal.operators.completable.e$a */
    /* compiled from: CompletableMergeArray */
    static final class C13034a extends AtomicInteger implements C16729c {
        private static final long serialVersionUID = -8360547806504310570L;
        final C16729c downstream;
        final AtomicBoolean once;
        final C17070a set;

        C13034a(C16729c cVar, AtomicBoolean atomicBoolean, C17070a aVar, int i) {
            this.downstream = cVar;
            this.once = atomicBoolean;
            this.set = aVar;
            lazySet(i);
        }

        public void onComplete() {
            if (decrementAndGet() == 0 && this.once.compareAndSet(false, true)) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.set.dispose();
            if (this.once.compareAndSet(false, true)) {
                this.downstream.onError(th);
            } else {
                C12251a.m82985p(th);
            }
        }

        public void onSubscribe(C17071b bVar) {
            this.set.mo62358a(bVar);
        }
    }

    public C13033e(C16730d[] dVarArr) {
        this.f60789a = dVarArr;
    }

    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        C17070a aVar = new C17070a();
        C13034a aVar2 = new C13034a(cVar, new AtomicBoolean(), aVar, this.f60789a.length + 1);
        cVar.onSubscribe(aVar);
        C16730d[] dVarArr = this.f60789a;
        int length = dVarArr.length;
        int i = 0;
        while (i < length) {
            C16730d dVar = dVarArr[i];
            if (!aVar.isDisposed()) {
                if (dVar == null) {
                    aVar.dispose();
                    aVar2.onError(new NullPointerException("A completable source is null"));
                    return;
                }
                dVar.mo79652a(aVar2);
                i++;
            } else {
                return;
            }
        }
        aVar2.onComplete();
    }
}

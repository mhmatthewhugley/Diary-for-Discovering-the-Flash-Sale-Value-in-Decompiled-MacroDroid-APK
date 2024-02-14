package p292io.reactivex.internal.operators.observable;

import p223ca.C11163b;
import p223ca.C11164c;
import p262fa.C12251a;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.c0 */
/* compiled from: ObservableTake */
public final class C13097c0<T> extends C13083a<T, T> {

    /* renamed from: c */
    final long f60876c;

    /* renamed from: io.reactivex.internal.operators.observable.c0$a */
    /* compiled from: ObservableTake */
    static final class C13098a<T> implements C16741n<T>, C17071b {

        /* renamed from: a */
        final C16741n<? super T> f60877a;

        /* renamed from: c */
        boolean f60878c;

        /* renamed from: d */
        C17071b f60879d;

        /* renamed from: f */
        long f60880f;

        C13098a(C16741n<? super T> nVar, long j) {
            this.f60877a = nVar;
            this.f60880f = j;
        }

        public void dispose() {
            this.f60879d.dispose();
        }

        public boolean isDisposed() {
            return this.f60879d.isDisposed();
        }

        public void onComplete() {
            if (!this.f60878c) {
                this.f60878c = true;
                this.f60879d.dispose();
                this.f60877a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f60878c) {
                C12251a.m82985p(th);
                return;
            }
            this.f60878c = true;
            this.f60879d.dispose();
            this.f60877a.onError(th);
        }

        public void onNext(T t) {
            if (!this.f60878c) {
                long j = this.f60880f;
                long j2 = j - 1;
                this.f60880f = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.f60877a.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.f60879d, bVar)) {
                this.f60879d = bVar;
                if (this.f60880f == 0) {
                    this.f60878c = true;
                    bVar.dispose();
                    C11164c.m74934e(this.f60877a);
                    return;
                }
                this.f60877a.onSubscribe(this);
            }
        }
    }

    public C13097c0(C16739l<T> lVar, long j) {
        super(lVar);
        this.f60876c = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        this.f60853a.mo79695a(new C13098a(nVar, this.f60876c));
    }
}

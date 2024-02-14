package p292io.reactivex.internal.operators.single;

import p209aa.C11078a;
import p216ba.C11113d;
import p223ca.C11164c;
import p262fa.C12251a;
import p414v9.C16747p;
import p414v9.C16748q;
import p414v9.C16749r;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.single.c */
/* compiled from: SingleDoOnSubscribe */
public final class C13161c<T> extends C16747p<T> {

    /* renamed from: a */
    final C16749r<T> f60996a;

    /* renamed from: c */
    final C11113d<? super C17071b> f60997c;

    /* renamed from: io.reactivex.internal.operators.single.c$a */
    /* compiled from: SingleDoOnSubscribe */
    static final class C13162a<T> implements C16748q<T> {

        /* renamed from: a */
        final C16748q<? super T> f60998a;

        /* renamed from: c */
        final C11113d<? super C17071b> f60999c;

        /* renamed from: d */
        boolean f61000d;

        C13162a(C16748q<? super T> qVar, C11113d<? super C17071b> dVar) {
            this.f60998a = qVar;
            this.f60999c = dVar;
        }

        /* renamed from: b */
        public void mo69889b(T t) {
            if (!this.f61000d) {
                this.f60998a.mo69889b(t);
            }
        }

        public void onError(Throwable th) {
            if (this.f61000d) {
                C12251a.m82985p(th);
            } else {
                this.f60998a.onError(th);
            }
        }

        public void onSubscribe(C17071b bVar) {
            try {
                this.f60999c.accept(bVar);
                this.f60998a.onSubscribe(bVar);
            } catch (Throwable th) {
                C11078a.m74639b(th);
                this.f61000d = true;
                bVar.dispose();
                C11164c.m74937i(th, this.f60998a);
            }
        }
    }

    public C13161c(C16749r<T> rVar, C11113d<? super C17071b> dVar) {
        this.f60996a = rVar;
        this.f60997c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        this.f60996a.mo79722a(new C13162a(qVar, this.f60997c));
    }
}

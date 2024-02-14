package p292io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11114e;
import p223ca.C11163b;
import p241da.C11984b;
import p414v9.C16747p;
import p414v9.C16748q;
import p414v9.C16749r;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.single.e */
/* compiled from: SingleFlatMap */
public final class C13164e<T, R> extends C16747p<R> {

    /* renamed from: a */
    final C16749r<? extends T> f61002a;

    /* renamed from: c */
    final C11114e<? super T, ? extends C16749r<? extends R>> f61003c;

    /* renamed from: io.reactivex.internal.operators.single.e$a */
    /* compiled from: SingleFlatMap */
    static final class C13165a<T, R> extends AtomicReference<C17071b> implements C16748q<T>, C17071b {
        private static final long serialVersionUID = 3258103020495908596L;
        final C16748q<? super R> downstream;
        final C11114e<? super T, ? extends C16749r<? extends R>> mapper;

        /* renamed from: io.reactivex.internal.operators.single.e$a$a */
        /* compiled from: SingleFlatMap */
        static final class C13166a<R> implements C16748q<R> {

            /* renamed from: a */
            final AtomicReference<C17071b> f61004a;

            /* renamed from: c */
            final C16748q<? super R> f61005c;

            C13166a(AtomicReference<C17071b> atomicReference, C16748q<? super R> qVar) {
                this.f61004a = atomicReference;
                this.f61005c = qVar;
            }

            /* renamed from: b */
            public void mo69889b(R r) {
                this.f61005c.mo69889b(r);
            }

            public void onError(Throwable th) {
                this.f61005c.onError(th);
            }

            public void onSubscribe(C17071b bVar) {
                C11163b.m74928e(this.f61004a, bVar);
            }
        }

        C13165a(C16748q<? super R> qVar, C11114e<? super T, ? extends C16749r<? extends R>> eVar) {
            this.downstream = qVar;
            this.mapper = eVar;
        }

        /* renamed from: b */
        public void mo69889b(T t) {
            try {
                C16749r rVar = (C16749r) C11984b.m82367d(this.mapper.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    rVar.mo79722a(new C13166a(this, this.downstream));
                }
            } catch (Throwable th) {
                C11078a.m74639b(th);
                this.downstream.onError(th);
            }
        }

        public void dispose() {
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return C11163b.m74927d((C17071b) get());
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74930g(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C13164e(C16749r<? extends T> rVar, C11114e<? super T, ? extends C16749r<? extends R>> eVar) {
        this.f61003c = eVar;
        this.f61002a = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super R> qVar) {
        this.f61002a.mo79722a(new C13165a(qVar, this.f61003c));
    }
}

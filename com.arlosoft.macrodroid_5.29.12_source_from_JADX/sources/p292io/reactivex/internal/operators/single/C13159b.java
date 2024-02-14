package p292io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicInteger;
import p209aa.C11078a;
import p216ba.C11110a;
import p223ca.C11163b;
import p262fa.C12251a;
import p414v9.C16747p;
import p414v9.C16748q;
import p414v9.C16749r;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.single.b */
/* compiled from: SingleDoFinally */
public final class C13159b<T> extends C16747p<T> {

    /* renamed from: a */
    final C16749r<T> f60994a;

    /* renamed from: c */
    final C11110a f60995c;

    /* renamed from: io.reactivex.internal.operators.single.b$a */
    /* compiled from: SingleDoFinally */
    static final class C13160a<T> extends AtomicInteger implements C16748q<T>, C17071b {
        private static final long serialVersionUID = 4109457741734051389L;
        final C16748q<? super T> downstream;
        final C11110a onFinally;
        C17071b upstream;

        C13160a(C16748q<? super T> qVar, C11110a aVar) {
            this.downstream = qVar;
            this.onFinally = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69982a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    C12251a.m82985p(th);
                }
            }
        }

        /* renamed from: b */
        public void mo69889b(T t) {
            this.downstream.mo69889b(t);
            mo69982a();
        }

        public void dispose() {
            this.upstream.dispose();
            mo69982a();
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            mo69982a();
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C13159b(C16749r<T> rVar, C11110a aVar) {
        this.f60994a = rVar;
        this.f60995c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69927p(C16748q<? super T> qVar) {
        this.f60994a.mo79722a(new C13160a(qVar, this.f60995c));
    }
}

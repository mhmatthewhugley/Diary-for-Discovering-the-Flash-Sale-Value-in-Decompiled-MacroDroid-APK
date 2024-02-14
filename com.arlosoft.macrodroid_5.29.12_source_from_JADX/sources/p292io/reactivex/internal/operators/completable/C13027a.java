package p292io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;
import p209aa.C11078a;
import p216ba.C11110a;
import p223ca.C11163b;
import p262fa.C12251a;
import p414v9.C16728b;
import p414v9.C16729c;
import p414v9.C16730d;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.completable.a */
/* compiled from: CompletableDoFinally */
public final class C13027a extends C16728b {

    /* renamed from: a */
    final C16730d f60782a;

    /* renamed from: c */
    final C11110a f60783c;

    /* renamed from: io.reactivex.internal.operators.completable.a$a */
    /* compiled from: CompletableDoFinally */
    static final class C13028a extends AtomicInteger implements C16729c, C17071b {
        private static final long serialVersionUID = 4109457741734051389L;
        final C16729c downstream;
        final C11110a onFinally;
        C17071b upstream;

        C13028a(C16729c cVar, C11110a aVar) {
            this.downstream = cVar;
            this.onFinally = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo69895a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    C12251a.m82985p(th);
                }
            }
        }

        public void dispose() {
            this.upstream.dispose();
            mo69895a();
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void onComplete() {
            this.downstream.onComplete();
            mo69895a();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            mo69895a();
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C13027a(C16730d dVar, C11110a aVar) {
        this.f60782a = dVar;
        this.f60783c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo69894l(C16729c cVar) {
        this.f60782a.mo79652a(new C13028a(cVar, this.f60783c));
    }
}

package p292io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p223ca.C11163b;
import p292io.reactivex.internal.schedulers.C13201m;
import p414v9.C16735i;
import p414v9.C16741n;
import p414v9.C16742o;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.s */
/* compiled from: ObservableInterval */
public final class C13143s extends C16735i<Long> {

    /* renamed from: a */
    final C16742o f60970a;

    /* renamed from: c */
    final long f60971c;

    /* renamed from: d */
    final long f60972d;

    /* renamed from: f */
    final TimeUnit f60973f;

    /* renamed from: io.reactivex.internal.operators.observable.s$a */
    /* compiled from: ObservableInterval */
    static final class C13144a extends AtomicReference<C17071b> implements C17071b, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final C16741n<? super Long> downstream;

        C13144a(C16741n<? super Long> nVar) {
            this.downstream = nVar;
        }

        /* renamed from: a */
        public void mo69972a(C17071b bVar) {
            C11163b.m74930g(this, bVar);
        }

        public void dispose() {
            C11163b.m74926b(this);
        }

        public boolean isDisposed() {
            return get() == C11163b.DISPOSED;
        }

        public void run() {
            if (get() != C11163b.DISPOSED) {
                C16741n<? super Long> nVar = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                nVar.onNext(Long.valueOf(j));
            }
        }
    }

    public C13143s(long j, long j2, TimeUnit timeUnit, C16742o oVar) {
        this.f60971c = j;
        this.f60972d = j2;
        this.f60973f = timeUnit;
        this.f60970a = oVar;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super Long> nVar) {
        C13144a aVar = new C13144a(nVar);
        nVar.onSubscribe(aVar);
        C16742o oVar = this.f60970a;
        if (oVar instanceof C13201m) {
            C16742o.C16745c a = oVar.mo69992a();
            aVar.mo69972a(a);
            a.mo79720d(aVar, this.f60971c, this.f60972d, this.f60973f);
            return;
        }
        aVar.mo69972a(oVar.mo69994d(aVar, this.f60971c, this.f60972d, this.f60973f));
    }
}

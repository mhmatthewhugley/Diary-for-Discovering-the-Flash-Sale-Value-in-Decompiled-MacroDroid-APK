package p292io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15737b;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;
import p414v9.C16742o;

/* renamed from: io.reactivex.internal.operators.flowable.r */
/* compiled from: FlowableSubscribeOn */
public final class C13075r<T> extends C13044a<T, T> {

    /* renamed from: d */
    final C16742o f60843d;

    /* renamed from: f */
    final boolean f60844f;

    /* renamed from: io.reactivex.internal.operators.flowable.r$a */
    /* compiled from: FlowableSubscribeOn */
    static final class C13076a<T> extends AtomicReference<Thread> implements C16733g<T>, C15739d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final C15738c<? super T> downstream;
        final boolean nonScheduledRequests;
        final AtomicLong requested = new AtomicLong();
        C15737b<T> source;
        final AtomicReference<C15739d> upstream = new AtomicReference<>();
        final C16742o.C16745c worker;

        /* renamed from: io.reactivex.internal.operators.flowable.r$a$a */
        /* compiled from: FlowableSubscribeOn */
        static final class C13077a implements Runnable {

            /* renamed from: a */
            final C15739d f60845a;

            /* renamed from: c */
            final long f60846c;

            C13077a(C15739d dVar, long j) {
                this.f60845a = dVar;
                this.f60846c = j;
            }

            public void run() {
                this.f60845a.request(this.f60846c);
            }
        }

        C13076a(C15738c<? super T> cVar, C16742o.C16745c cVar2, C15737b<T> bVar, boolean z) {
            this.downstream = cVar;
            this.worker = cVar2;
            this.source = bVar;
            this.nonScheduledRequests = !z;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85528i(this.upstream, dVar)) {
                long andSet = this.requested.getAndSet(0);
                if (andSet != 0) {
                    mo69928b(andSet, dVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo69928b(long j, C15739d dVar) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                dVar.request(j);
            } else {
                this.worker.mo69996b(new C13077a(dVar, j));
            }
        }

        public void cancel() {
            C13213f.m85523b(this.upstream);
            this.worker.dispose();
        }

        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                C15739d dVar = this.upstream.get();
                if (dVar != null) {
                    mo69928b(j, dVar);
                    return;
                }
                C13218d.m85541a(this.requested, j);
                C15739d dVar2 = this.upstream.get();
                if (dVar2 != null) {
                    long andSet = this.requested.getAndSet(0);
                    if (andSet != 0) {
                        mo69928b(andSet, dVar2);
                    }
                }
            }
        }

        public void run() {
            lazySet(Thread.currentThread());
            C15737b<T> bVar = this.source;
            this.source = null;
            bVar.mo75177b(this);
        }
    }

    public C13075r(C16732f<T> fVar, C16742o oVar, boolean z) {
        super(fVar);
        this.f60843d = oVar;
        this.f60844f = z;
    }

    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        C16742o.C16745c a = this.f60843d.mo69992a();
        C13076a aVar = new C13076a(cVar, a, this.f60808c, this.f60844f);
        cVar.mo68760a(aVar);
        a.mo69996b(aVar);
    }
}

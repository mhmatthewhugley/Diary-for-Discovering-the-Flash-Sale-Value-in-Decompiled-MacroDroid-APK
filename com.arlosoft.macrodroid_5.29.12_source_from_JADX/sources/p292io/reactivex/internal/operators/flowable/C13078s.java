package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicBoolean;
import p262fa.C12251a;
import p292io.reactivex.internal.subscriptions.C13210c;
import p292io.reactivex.internal.subscriptions.C13213f;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.s */
/* compiled from: FlowableTake */
public final class C13078s<T> extends C13044a<T, T> {

    /* renamed from: d */
    final long f60847d;

    /* renamed from: io.reactivex.internal.operators.flowable.s$a */
    /* compiled from: FlowableTake */
    static final class C13079a<T> extends AtomicBoolean implements C16733g<T>, C15739d {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final C15738c<? super T> downstream;
        final long limit;
        long remaining;
        C15739d upstream;

        C13079a(C15738c<? super T> cVar, long j) {
            this.downstream = cVar;
            this.limit = j;
            this.remaining = j;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85530k(this.upstream, dVar)) {
                this.upstream = dVar;
                if (this.limit == 0) {
                    dVar.cancel();
                    this.done = true;
                    C13210c.m85515b(this.downstream);
                    return;
                }
                this.downstream.mo68760a(this);
            }
        }

        public void cancel() {
            this.upstream.cancel();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            C12251a.m82985p(th);
        }

        public void onNext(T t) {
            if (!this.done) {
                long j = this.remaining;
                long j2 = j - 1;
                this.remaining = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.downstream.onNext(t);
                    if (z) {
                        this.upstream.cancel();
                        onComplete();
                    }
                }
            }
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                if (get() || !compareAndSet(false, true) || j < this.limit) {
                    this.upstream.request(j);
                } else {
                    this.upstream.request(LocationRequestCompat.PASSIVE_INTERVAL);
                }
            }
        }
    }

    public C13078s(C16732f<T> fVar, long j) {
        super(fVar);
        this.f60847d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f60808c.mo79673t(new C13079a(cVar, this.f60847d));
    }
}

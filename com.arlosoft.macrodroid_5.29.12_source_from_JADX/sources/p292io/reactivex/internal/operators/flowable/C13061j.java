package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p262fa.C12251a;
import p292io.reactivex.exceptions.MissingBackpressureException;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.j */
/* compiled from: FlowableOnBackpressureError */
public final class C13061j<T> extends C13044a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.j$a */
    /* compiled from: FlowableOnBackpressureError */
    static final class C13062a<T> extends AtomicLong implements C16733g<T>, C15739d {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final C15738c<? super T> downstream;
        C15739d upstream;

        C13062a(C15738c<? super T> cVar) {
            this.downstream = cVar;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85530k(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.mo68760a(this);
                dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
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
            if (this.done) {
                C12251a.m82985p(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            if (!this.done) {
                if (get() != 0) {
                    this.downstream.onNext(t);
                    C13218d.m85543c(this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                C13218d.m85541a(this, j);
            }
        }
    }

    public C13061j(C16732f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f60808c.mo79673t(new C13062a(cVar));
    }
}

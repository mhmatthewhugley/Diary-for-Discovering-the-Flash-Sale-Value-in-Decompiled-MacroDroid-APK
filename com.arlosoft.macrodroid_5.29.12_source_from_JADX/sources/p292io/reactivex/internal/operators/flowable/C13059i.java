package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p209aa.C11078a;
import p216ba.C11113d;
import p262fa.C12251a;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.i */
/* compiled from: FlowableOnBackpressureDrop */
public final class C13059i<T> extends C13044a<T, T> implements C11113d<T> {

    /* renamed from: d */
    final C11113d<? super T> f60830d = this;

    /* renamed from: io.reactivex.internal.operators.flowable.i$a */
    /* compiled from: FlowableOnBackpressureDrop */
    static final class C13060a<T> extends AtomicLong implements C16733g<T>, C15739d {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final C15738c<? super T> downstream;
        final C11113d<? super T> onDrop;
        C15739d upstream;

        C13060a(C15738c<? super T> cVar, C11113d<? super T> dVar) {
            this.downstream = cVar;
            this.onDrop = dVar;
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
                try {
                    this.onDrop.accept(t);
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    cancel();
                    onError(th);
                }
            }
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                C13218d.m85541a(this, j);
            }
        }
    }

    public C13059i(C16732f<T> fVar) {
        super(fVar);
    }

    public void accept(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f60808c.mo79673t(new C13060a(cVar, this.f60830d));
    }
}

package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.k */
/* compiled from: FlowableOnBackpressureLatest */
public final class C13063k<T> extends C13044a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.k$a */
    /* compiled from: FlowableOnBackpressureLatest */
    static final class C13064a<T> extends AtomicInteger implements C16733g<T>, C15739d {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        final AtomicReference<T> current = new AtomicReference<>();
        volatile boolean done;
        final C15738c<? super T> downstream;
        Throwable error;
        final AtomicLong requested = new AtomicLong();
        C15739d upstream;

        C13064a(C15738c<? super T> cVar) {
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

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo69924b(boolean z, boolean z2, C15738c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
                    cVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    cVar.onComplete();
                    return true;
                }
            }
        }

        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.current.lazySet((Object) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo69925d() {
            boolean z;
            if (getAndIncrement() == 0) {
                C15738c<? super T> cVar = this.downstream;
                AtomicLong atomicLong = this.requested;
                AtomicReference<T> atomicReference = this.current;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.done;
                        T andSet = atomicReference.getAndSet((Object) null);
                        boolean z3 = andSet == null;
                        if (!mo69924b(z2, z3, cVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            cVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo69924b(z4, z, cVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C13218d.m85543c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void onComplete() {
            this.done = true;
            mo69925d();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            mo69925d();
        }

        public void onNext(T t) {
            this.current.lazySet(t);
            mo69925d();
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                C13218d.m85541a(this.requested, j);
                mo69925d();
            }
        }
    }

    public C13063k(C16732f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f60808c.mo79673t(new C13064a(cVar));
    }
}

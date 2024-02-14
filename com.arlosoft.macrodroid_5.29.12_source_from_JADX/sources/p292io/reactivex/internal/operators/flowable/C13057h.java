package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p209aa.C11078a;
import p216ba.C11110a;
import p251ea.C12184h;
import p292io.reactivex.exceptions.MissingBackpressureException;
import p292io.reactivex.internal.queue.C13177a;
import p292io.reactivex.internal.queue.C13178b;
import p292io.reactivex.internal.subscriptions.C13208a;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;

/* renamed from: io.reactivex.internal.operators.flowable.h */
/* compiled from: FlowableOnBackpressureBuffer */
public final class C13057h<T> extends C13044a<T, T> {

    /* renamed from: d */
    final int f60826d;

    /* renamed from: f */
    final boolean f60827f;

    /* renamed from: g */
    final boolean f60828g;

    /* renamed from: o */
    final C11110a f60829o;

    /* renamed from: io.reactivex.internal.operators.flowable.h$a */
    /* compiled from: FlowableOnBackpressureBuffer */
    static final class C13058a<T> extends C13208a<T> implements C16733g<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final C15738c<? super T> downstream;
        Throwable error;
        final C11110a onOverflow;
        boolean outputFused;
        final C12184h<T> queue;
        final AtomicLong requested = new AtomicLong();
        C15739d upstream;

        C13058a(C15738c<? super T> cVar, int i, boolean z, boolean z2, C11110a aVar) {
            C12184h<T> hVar;
            this.downstream = cVar;
            this.onOverflow = aVar;
            this.delayError = z2;
            if (z) {
                hVar = new C13178b<>(i);
            } else {
                hVar = new C13177a<>(i);
            }
            this.queue = hVar;
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
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void clear() {
            this.queue.clear();
        }

        /* renamed from: d */
        public int mo62364d(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo69922e(boolean z, boolean z2, C15738c<? super T> cVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        cVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo69923f() {
            int i;
            if (getAndIncrement() == 0) {
                C12184h<T> hVar = this.queue;
                C15738c<? super T> cVar = this.downstream;
                int i2 = 1;
                while (!mo69922e(this.done, hVar.isEmpty(), cVar)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z = this.done;
                        T poll = hVar.poll();
                        boolean z2 = poll == null;
                        if (!mo69922e(z, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !mo69922e(this.done, hVar.isEmpty(), cVar)) {
                        if (!(j2 == 0 || j == LocationRequestCompat.PASSIVE_INTERVAL)) {
                            this.requested.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                mo69923f();
            }
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                mo69923f();
            }
        }

        public void onNext(T t) {
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                mo69923f();
            }
        }

        public T poll() throws Exception {
            return this.queue.poll();
        }

        public void request(long j) {
            if (!this.outputFused && C13213f.m85529j(j)) {
                C13218d.m85541a(this.requested, j);
                mo69923f();
            }
        }
    }

    public C13057h(C16732f<T> fVar, int i, boolean z, boolean z2, C11110a aVar) {
        super(fVar);
        this.f60826d = i;
        this.f60827f = z;
        this.f60828g = z2;
        this.f60829o = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f60808c.mo79673t(new C13058a(cVar, this.f60826d, this.f60827f, this.f60828g, this.f60829o));
    }
}

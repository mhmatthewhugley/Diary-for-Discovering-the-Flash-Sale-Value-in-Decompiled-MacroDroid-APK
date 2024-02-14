package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p209aa.C11078a;
import p251ea.C12177a;
import p251ea.C12182f;
import p251ea.C12185i;
import p262fa.C12251a;
import p292io.reactivex.exceptions.MissingBackpressureException;
import p292io.reactivex.internal.queue.C13177a;
import p292io.reactivex.internal.subscriptions.C13208a;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13218d;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;
import p414v9.C16742o;

/* renamed from: io.reactivex.internal.operators.flowable.g */
/* compiled from: FlowableObserveOn */
public final class C13053g<T> extends C13044a<T, T> {

    /* renamed from: d */
    final C16742o f60823d;

    /* renamed from: f */
    final boolean f60824f;

    /* renamed from: g */
    final int f60825g;

    /* renamed from: io.reactivex.internal.operators.flowable.g$a */
    /* compiled from: FlowableObserveOn */
    static abstract class C13054a<T> extends C13208a<T> implements C16733g<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        C12185i<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        C15739d upstream;
        final C16742o.C16745c worker;

        C13054a(C16742o.C16745c cVar, boolean z, int i) {
            this.worker = cVar;
            this.delayError = z;
            this.prefetch = i;
            this.limit = i - (i >> 2);
        }

        public final void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                this.worker.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final void clear() {
            this.queue.clear();
        }

        /* renamed from: d */
        public final int mo62364d(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final boolean mo69916e(boolean z, boolean z2, C15738c<?> cVar) {
            if (this.cancelled) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.cancelled = true;
                        clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract void mo69917f();

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract void mo69918g();

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract void mo69919h();

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final void mo69920i() {
            if (getAndIncrement() == 0) {
                this.worker.mo69996b(this);
            }
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                mo69920i();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                C12251a.m82985p(th);
                return;
            }
            this.error = th;
            this.done = true;
            mo69920i();
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode == 2) {
                    mo69920i();
                    return;
                }
                if (!this.queue.offer(t)) {
                    this.upstream.cancel();
                    this.error = new MissingBackpressureException("Queue is full?!");
                    this.done = true;
                }
                mo69920i();
            }
        }

        public final void request(long j) {
            if (C13213f.m85529j(j)) {
                C13218d.m85541a(this.requested, j);
                mo69920i();
            }
        }

        public final void run() {
            if (this.outputFused) {
                mo69918g();
            } else if (this.sourceMode == 1) {
                mo69919h();
            } else {
                mo69917f();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.g$b */
    /* compiled from: FlowableObserveOn */
    static final class C13055b<T> extends C13054a<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final C12177a<? super T> downstream;

        C13055b(C12177a<? super T> aVar, C16742o.C16745c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.downstream = aVar;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85530k(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof C12182f) {
                    C12182f fVar = (C12182f) dVar;
                    int d = fVar.mo62364d(7);
                    if (d == 1) {
                        this.sourceMode = 1;
                        this.queue = fVar;
                        this.done = true;
                        this.downstream.mo68760a(this);
                        return;
                    } else if (d == 2) {
                        this.sourceMode = 2;
                        this.queue = fVar;
                        this.downstream.mo68760a(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new C13177a(this.prefetch);
                this.downstream.mo68760a(this);
                dVar.request((long) this.prefetch);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo69917f() {
            int i;
            C12177a<? super T> aVar = this.downstream;
            C12185i<T> iVar = this.queue;
            long j = this.produced;
            long j2 = this.consumed;
            int i2 = 1;
            while (true) {
                long j3 = this.requested.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.done;
                    try {
                        T poll = iVar.poll();
                        boolean z2 = poll == null;
                        if (!mo69916e(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.mo68461c(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.limit)) {
                                this.upstream.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        iVar.clear();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo69916e(this.done, iVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j;
                        this.consumed = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo69918g() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo69919h() {
            C12177a<? super T> aVar = this.downstream;
            C12185i<T> iVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = iVar.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                aVar.onComplete();
                                this.worker.dispose();
                                return;
                            } else if (aVar.mo68461c(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (iVar.isEmpty()) {
                        this.cancelled = true;
                        aVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.consumed + 1;
                if (j == ((long) this.limit)) {
                    this.consumed = 0;
                    this.upstream.request(j);
                } else {
                    this.consumed = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.g$c */
    /* compiled from: FlowableObserveOn */
    static final class C13056c<T> extends C13054a<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final C15738c<? super T> downstream;

        C13056c(C15738c<? super T> cVar, C16742o.C16745c cVar2, boolean z, int i) {
            super(cVar2, z, i);
            this.downstream = cVar;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85530k(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof C12182f) {
                    C12182f fVar = (C12182f) dVar;
                    int d = fVar.mo62364d(7);
                    if (d == 1) {
                        this.sourceMode = 1;
                        this.queue = fVar;
                        this.done = true;
                        this.downstream.mo68760a(this);
                        return;
                    } else if (d == 2) {
                        this.sourceMode = 2;
                        this.queue = fVar;
                        this.downstream.mo68760a(this);
                        dVar.request((long) this.prefetch);
                        return;
                    }
                }
                this.queue = new C13177a(this.prefetch);
                this.downstream.mo68760a(this);
                dVar.request((long) this.prefetch);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo69917f() {
            int i;
            C15738c<? super T> cVar = this.downstream;
            C12185i<T> iVar = this.queue;
            long j = this.produced;
            int i2 = 1;
            while (true) {
                long j2 = this.requested.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.done;
                    try {
                        T poll = iVar.poll();
                        boolean z2 = poll == null;
                        if (!mo69916e(z, z2, cVar)) {
                            if (z2) {
                                break;
                            }
                            cVar.onNext(poll);
                            j++;
                            if (j == ((long) this.limit)) {
                                if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                                    j2 = this.requested.addAndGet(-j);
                                }
                                this.upstream.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        iVar.clear();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo69916e(this.done, iVar.isEmpty(), cVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.produced = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo69918g() {
            int i = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                this.downstream.onNext(null);
                if (z) {
                    this.cancelled = true;
                    Throwable th = this.error;
                    if (th != null) {
                        this.downstream.onError(th);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo69919h() {
            C15738c<? super T> cVar = this.downstream;
            C12185i<T> iVar = this.queue;
            long j = this.produced;
            int i = 1;
            while (true) {
                long j2 = this.requested.get();
                while (j != j2) {
                    try {
                        T poll = iVar.poll();
                        if (!this.cancelled) {
                            if (poll == null) {
                                this.cancelled = true;
                                cVar.onComplete();
                                this.worker.dispose();
                                return;
                            }
                            cVar.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        this.cancelled = true;
                        this.upstream.cancel();
                        cVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (!this.cancelled) {
                    if (iVar.isEmpty()) {
                        this.cancelled = true;
                        cVar.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.produced = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.queue.poll();
            if (!(poll == null || this.sourceMode == 1)) {
                long j = this.produced + 1;
                if (j == ((long) this.limit)) {
                    this.produced = 0;
                    this.upstream.request(j);
                } else {
                    this.produced = j;
                }
            }
            return poll;
        }
    }

    public C13053g(C16732f<T> fVar, C16742o oVar, boolean z, int i) {
        super(fVar);
        this.f60823d = oVar;
        this.f60824f = z;
        this.f60825g = i;
    }

    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        C16742o.C16745c a = this.f60823d.mo69992a();
        if (cVar instanceof C12177a) {
            this.f60808c.mo79673t(new C13055b((C12177a) cVar, a, this.f60824f, this.f60825g));
        } else {
            this.f60808c.mo79673t(new C13056c(cVar, a, this.f60824f, this.f60825g));
        }
    }
}

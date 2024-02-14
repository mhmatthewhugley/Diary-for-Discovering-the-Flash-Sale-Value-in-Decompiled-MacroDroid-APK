package p292io.reactivex.internal.operators.flowable;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11114e;
import p241da.C11984b;
import p251ea.C12182f;
import p251ea.C12184h;
import p251ea.C12185i;
import p262fa.C12251a;
import p292io.reactivex.exceptions.MissingBackpressureException;
import p292io.reactivex.internal.queue.C13177a;
import p292io.reactivex.internal.queue.C13178b;
import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13217c;
import p292io.reactivex.internal.util.C13218d;
import p292io.reactivex.internal.util.C13221g;
import p329me.C15737b;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16732f;
import p414v9.C16733g;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.flowable.d */
/* compiled from: FlowableFlatMap */
public final class C13047d<T, U> extends C13044a<T, U> {

    /* renamed from: d */
    final C11114e<? super T, ? extends C15737b<? extends U>> f60811d;

    /* renamed from: f */
    final boolean f60812f;

    /* renamed from: g */
    final int f60813g;

    /* renamed from: o */
    final int f60814o;

    /* renamed from: io.reactivex.internal.operators.flowable.d$a */
    /* compiled from: FlowableFlatMap */
    static final class C13048a<T, U> extends AtomicReference<C15739d> implements C16733g<U>, C17071b {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;

        /* renamed from: id */
        final long f60815id;
        final int limit;
        final C13049b<T, U> parent;
        long produced;
        volatile C12185i<U> queue;

        C13048a(C13049b<T, U> bVar, long j) {
            this.f60815id = j;
            this.parent = bVar;
            int i = bVar.bufferSize;
            this.bufferSize = i;
            this.limit = i >> 2;
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85528i(this, dVar)) {
                if (dVar instanceof C12182f) {
                    C12182f fVar = (C12182f) dVar;
                    int d = fVar.mo62364d(7);
                    if (d == 1) {
                        this.fusionMode = d;
                        this.queue = fVar;
                        this.done = true;
                        this.parent.mo69907g();
                        return;
                    } else if (d == 2) {
                        this.fusionMode = d;
                        this.queue = fVar;
                    }
                }
                dVar.request((long) this.bufferSize);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo69902b(long j) {
            if (this.fusionMode != 1) {
                long j2 = this.produced + j;
                if (j2 >= ((long) this.limit)) {
                    this.produced = 0;
                    ((C15739d) get()).request(j2);
                    return;
                }
                this.produced = j2;
            }
        }

        public void dispose() {
            C13213f.m85523b(this);
        }

        public boolean isDisposed() {
            return get() == C13213f.CANCELLED;
        }

        public void onComplete() {
            this.done = true;
            this.parent.mo69907g();
        }

        public void onError(Throwable th) {
            lazySet(C13213f.CANCELLED);
            this.parent.mo69911k(this, th);
        }

        public void onNext(U u) {
            if (this.fusionMode != 2) {
                this.parent.mo69913m(u, this);
            } else {
                this.parent.mo69907g();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.d$b */
    /* compiled from: FlowableFlatMap */
    static final class C13049b<T, U> extends AtomicInteger implements C16733g<T>, C15739d {

        /* renamed from: a */
        static final C13048a<?, ?>[] f60816a = new C13048a[0];

        /* renamed from: c */
        static final C13048a<?, ?>[] f60817c = new C13048a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final C15738c<? super U> downstream;
        final C13217c errs = new C13217c();
        long lastId;
        int lastIndex;
        final C11114e<? super T, ? extends C15737b<? extends U>> mapper;
        final int maxConcurrency;
        volatile C12184h<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<C13048a<?, ?>[]> subscribers;
        long uniqueId;
        C15739d upstream;

        C13049b(C15738c<? super U> cVar, C11114e<? super T, ? extends C15737b<? extends U>> eVar, boolean z, int i, int i2) {
            AtomicReference<C13048a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = cVar;
            this.mapper = eVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            this.scalarLimit = Math.max(1, i >> 1);
            atomicReference.lazySet(f60816a);
        }

        /* renamed from: a */
        public void mo68760a(C15739d dVar) {
            if (C13213f.m85530k(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.mo68760a(this);
                if (!this.cancelled) {
                    int i = this.maxConcurrency;
                    if (i == Integer.MAX_VALUE) {
                        dVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
                    } else {
                        dVar.request((long) i);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo69903b(C13048a<T, U> aVar) {
            C13048a<?, ?>[] aVarArr;
            C13048a[] aVarArr2;
            do {
                aVarArr = (C13048a[]) this.subscribers.get();
                if (aVarArr == f60817c) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C13048a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.subscribers.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        public void cancel() {
            C12184h<U> hVar;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                mo69906f();
                if (getAndIncrement() == 0 && (hVar = this.queue) != null) {
                    hVar.clear();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo69904d() {
            if (this.cancelled) {
                mo69905e();
                return true;
            } else if (this.delayErrors || this.errs.get() == null) {
                return false;
            } else {
                mo69905e();
                Throwable b = this.errs.mo70048b();
                if (b != C13221g.f61115a) {
                    this.downstream.onError(b);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo69905e() {
            C12184h<U> hVar = this.queue;
            if (hVar != null) {
                hVar.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo69906f() {
            C13048a<?, ?>[] aVarArr;
            C13048a<?, ?>[] aVarArr2 = (C13048a[]) this.subscribers.get();
            C13048a<?, ?>[] aVarArr3 = f60817c;
            if (aVarArr2 != aVarArr3 && (aVarArr = (C13048a[]) this.subscribers.getAndSet(aVarArr3)) != aVarArr3) {
                for (C13048a<?, ?> dispose : aVarArr) {
                    dispose.dispose();
                }
                Throwable b = this.errs.mo70048b();
                if (b != null && b != C13221g.f61115a) {
                    C12251a.m82985p(b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo69907g() {
            if (getAndIncrement() == 0) {
                mo69908h();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo69908h() {
            long j;
            boolean z;
            long j2;
            long j3;
            C13048a[] aVarArr;
            int i;
            long j4;
            C15738c<? super U> cVar = this.downstream;
            int i2 = 1;
            while (!mo69904d()) {
                C12184h<U> hVar = this.queue;
                long j5 = this.requested.get();
                boolean z2 = j5 == LocationRequestCompat.PASSIVE_INTERVAL;
                long j6 = 0;
                long j7 = 0;
                if (hVar != null) {
                    while (true) {
                        long j8 = 0;
                        U u = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            U poll = hVar.poll();
                            if (!mo69904d()) {
                                if (poll == null) {
                                    u = poll;
                                    break;
                                }
                                cVar.onNext(poll);
                                j7++;
                                j8++;
                                j5--;
                                u = poll;
                            } else {
                                return;
                            }
                        }
                        if (j8 != 0) {
                            if (z2) {
                                j5 = LocationRequestCompat.PASSIVE_INTERVAL;
                            } else {
                                j5 = this.requested.addAndGet(-j8);
                            }
                        }
                        if (j5 == 0 || u == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.done;
                C12184h<U> hVar2 = this.queue;
                C13048a[] aVarArr2 = (C13048a[]) this.subscribers.get();
                int length = aVarArr2.length;
                if (!z3 || ((hVar2 != null && !hVar2.isEmpty()) || length != 0)) {
                    int i3 = i2;
                    if (length != 0) {
                        long j9 = this.lastId;
                        int i4 = this.lastIndex;
                        if (length <= i4 || aVarArr2[i4].f60815id != j9) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            for (int i5 = 0; i5 < length && aVarArr2[i4].f60815id != j9; i5++) {
                                i4++;
                                if (i4 == length) {
                                    i4 = 0;
                                }
                            }
                            this.lastIndex = i4;
                            this.lastId = aVarArr2[i4].f60815id;
                        }
                        int i6 = i4;
                        boolean z4 = false;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                aVarArr = aVarArr2;
                                z = z4;
                                break;
                            } else if (!mo69904d()) {
                                C13048a aVar = aVarArr2[i6];
                                U u2 = null;
                                while (!mo69904d()) {
                                    C12185i<U> iVar = aVar.queue;
                                    if (iVar == null) {
                                        aVarArr = aVarArr2;
                                        i = length;
                                    } else {
                                        aVarArr = aVarArr2;
                                        i = length;
                                        long j10 = j6;
                                        while (j != j6) {
                                            try {
                                                u2 = iVar.poll();
                                                if (u2 == null) {
                                                    break;
                                                }
                                                cVar.onNext(u2);
                                                if (!mo69904d()) {
                                                    j--;
                                                    j10++;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C11078a.m74639b(th2);
                                                aVar.dispose();
                                                this.errs.mo70047a(th2);
                                                if (!this.delayErrors) {
                                                    this.upstream.cancel();
                                                }
                                                if (!mo69904d()) {
                                                    mo69912l(aVar);
                                                    i7++;
                                                    length = i;
                                                    z4 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j10 != j6) {
                                            j = !z2 ? this.requested.addAndGet(-j10) : LocationRequestCompat.PASSIVE_INTERVAL;
                                            aVar.mo69902b(j10);
                                            j4 = 0;
                                        } else {
                                            j4 = j6;
                                        }
                                        if (!(j == j4 || u2 == null)) {
                                            aVarArr2 = aVarArr;
                                            length = i;
                                            j6 = 0;
                                        }
                                    }
                                    boolean z5 = aVar.done;
                                    C12185i<U> iVar2 = aVar.queue;
                                    if (z5 && (iVar2 == null || iVar2.isEmpty())) {
                                        mo69912l(aVar);
                                        if (!mo69904d()) {
                                            j7++;
                                            z4 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j == 0) {
                                        z = z4;
                                        break;
                                    }
                                    i6++;
                                    length = i;
                                    if (i6 == length) {
                                        i6 = 0;
                                    }
                                    i7++;
                                    aVarArr2 = aVarArr;
                                    j6 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i6;
                        this.lastId = aVarArr[i6].f60815id;
                        j3 = j7;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        j3 = j7;
                        z = false;
                    }
                    if (j3 != j2 && !this.cancelled) {
                        this.upstream.request(j3);
                    }
                    if (z) {
                        i2 = i3;
                    } else {
                        i2 = addAndGet(-i3);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable b = this.errs.mo70048b();
                    if (b == C13221g.f61115a) {
                        return;
                    }
                    if (b == null) {
                        cVar.onComplete();
                        return;
                    } else {
                        cVar.onError(b);
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C12185i<U> mo69909i(C13048a<T, U> aVar) {
            C12185i<U> iVar = aVar.queue;
            if (iVar != null) {
                return iVar;
            }
            C13177a aVar2 = new C13177a(this.bufferSize);
            aVar.queue = aVar2;
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C12185i<U> mo69910j() {
            C12184h<U> hVar = this.queue;
            if (hVar == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    hVar = new C13178b<>(this.bufferSize);
                } else {
                    hVar = new C13177a<>(this.maxConcurrency);
                }
                this.queue = hVar;
            }
            return hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo69911k(C13048a<T, U> aVar, Throwable th) {
            if (this.errs.mo70047a(th)) {
                aVar.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (C13048a dispose : (C13048a[]) this.subscribers.getAndSet(f60817c)) {
                        dispose.dispose();
                    }
                }
                mo69907g();
                return;
            }
            C12251a.m82985p(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo69912l(C13048a<T, U> aVar) {
            C13048a<T, U>[] aVarArr;
            C13048a<?, ?>[] aVarArr2;
            do {
                aVarArr = (C13048a[]) this.subscribers.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f60816a;
                        } else {
                            C13048a<?, ?>[] aVarArr3 = new C13048a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.subscribers.compareAndSet(aVarArr, aVarArr2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo69913m(U u, C13048a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12185i iVar = aVar.queue;
                if (iVar == null) {
                    iVar = new C13177a(this.bufferSize);
                    aVar.queue = iVar;
                }
                if (!iVar.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.requested.get();
                C12185i<U> iVar2 = aVar.queue;
                if (j == 0 || (iVar2 != null && !iVar2.isEmpty())) {
                    if (iVar2 == null) {
                        iVar2 = mo69909i(aVar);
                    }
                    if (!iVar2.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                        this.requested.decrementAndGet();
                    }
                    aVar.mo69902b(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo69908h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo69914n(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.requested.get();
                C12185i iVar = this.queue;
                if (j == 0 || (iVar != null && !iVar.isEmpty())) {
                    if (iVar == null) {
                        iVar = mo69910j();
                    }
                    if (!iVar.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.downstream.onNext(u);
                    if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i = this.scalarEmitted + 1;
                        this.scalarEmitted = i;
                        int i2 = this.scalarLimit;
                        if (i == i2) {
                            this.scalarEmitted = 0;
                            this.upstream.request((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!mo69910j().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            mo69908h();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                mo69907g();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C12251a.m82985p(th);
            } else if (this.errs.mo70047a(th)) {
                this.done = true;
                mo69907g();
            } else {
                C12251a.m82985p(th);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    C15737b bVar = (C15737b) C11984b.m82367d(this.mapper.apply(t), "The mapper returned a null Publisher");
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                mo69914n(call);
                            } else if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                int i = this.scalarEmitted + 1;
                                this.scalarEmitted = i;
                                int i2 = this.scalarLimit;
                                if (i == i2) {
                                    this.scalarEmitted = 0;
                                    this.upstream.request((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            C11078a.m74639b(th);
                            this.errs.mo70047a(th);
                            mo69907g();
                        }
                    } else {
                        long j = this.uniqueId;
                        this.uniqueId = 1 + j;
                        C13048a aVar = new C13048a(this, j);
                        if (mo69903b(aVar)) {
                            bVar.mo75177b(aVar);
                        }
                    }
                } catch (Throwable th2) {
                    C11078a.m74639b(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        public void request(long j) {
            if (C13213f.m85529j(j)) {
                C13218d.m85541a(this.requested, j);
                mo69907g();
            }
        }
    }

    public C13047d(C16732f<T> fVar, C11114e<? super T, ? extends C15737b<? extends U>> eVar, boolean z, int i, int i2) {
        super(fVar);
        this.f60811d = eVar;
        this.f60812f = z;
        this.f60813g = i;
        this.f60814o = i2;
    }

    /* renamed from: B */
    public static <T, U> C16733g<T> m85268B(C15738c<? super U> cVar, C11114e<? super T, ? extends C15737b<? extends U>> eVar, boolean z, int i, int i2) {
        return new C13049b(cVar, eVar, z, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super U> cVar) {
        if (!C13069o.m85320b(this.f60808c, cVar, this.f60811d)) {
            this.f60808c.mo79673t(m85268B(cVar, this.f60811d, this.f60812f, this.f60813g, this.f60814o));
        }
    }
}

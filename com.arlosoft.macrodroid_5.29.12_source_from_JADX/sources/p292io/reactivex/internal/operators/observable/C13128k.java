package p292io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p209aa.C11078a;
import p216ba.C11114e;
import p223ca.C11163b;
import p241da.C11984b;
import p251ea.C12180d;
import p251ea.C12184h;
import p251ea.C12185i;
import p262fa.C12251a;
import p292io.reactivex.internal.queue.C13177a;
import p292io.reactivex.internal.queue.C13178b;
import p292io.reactivex.internal.util.C13217c;
import p292io.reactivex.internal.util.C13221g;
import p414v9.C16739l;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.internal.operators.observable.k */
/* compiled from: ObservableFlatMap */
public final class C13128k<T, U> extends C13083a<T, U> {

    /* renamed from: c */
    final C11114e<? super T, ? extends C16739l<? extends U>> f60939c;

    /* renamed from: d */
    final boolean f60940d;

    /* renamed from: f */
    final int f60941f;

    /* renamed from: g */
    final int f60942g;

    /* renamed from: io.reactivex.internal.operators.observable.k$a */
    /* compiled from: ObservableFlatMap */
    static final class C13129a<T, U> extends AtomicReference<C17071b> implements C16741n<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;

        /* renamed from: id */
        final long f60943id;
        final C13130b<T, U> parent;
        volatile C12185i<U> queue;

        C13129a(C13130b<T, U> bVar, long j) {
            this.f60943id = j;
            this.parent = bVar;
        }

        /* renamed from: a */
        public void mo69959a() {
            C11163b.m74926b(this);
        }

        public void onComplete() {
            this.done = true;
            this.parent.mo69963d();
        }

        public void onError(Throwable th) {
            if (this.parent.errors.mo70047a(th)) {
                C13130b<T, U> bVar = this.parent;
                if (!bVar.delayErrors) {
                    bVar.mo69962c();
                }
                this.done = true;
                this.parent.mo69963d();
                return;
            }
            C12251a.m82985p(th);
        }

        public void onNext(U u) {
            if (this.fusionMode == 0) {
                this.parent.mo69967h(u, this);
            } else {
                this.parent.mo69963d();
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74930g(this, bVar) && (bVar instanceof C12180d)) {
                C12180d dVar = (C12180d) bVar;
                int d = dVar.mo62364d(7);
                if (d == 1) {
                    this.fusionMode = d;
                    this.queue = dVar;
                    this.done = true;
                    this.parent.mo69963d();
                } else if (d == 2) {
                    this.fusionMode = d;
                    this.queue = dVar;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.k$b */
    /* compiled from: ObservableFlatMap */
    static final class C13130b<T, U> extends AtomicInteger implements C17071b, C16741n<T> {

        /* renamed from: a */
        static final C13129a<?, ?>[] f60944a = new C13129a[0];

        /* renamed from: c */
        static final C13129a<?, ?>[] f60945c = new C13129a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final C16741n<? super U> downstream;
        final C13217c errors = new C13217c();
        long lastId;
        int lastIndex;
        final C11114e<? super T, ? extends C16739l<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<C13129a<?, ?>[]> observers;
        volatile C12184h<U> queue;
        Queue<C16739l<? extends U>> sources;
        long uniqueId;
        C17071b upstream;
        int wip;

        C13130b(C16741n<? super U> nVar, C11114e<? super T, ? extends C16739l<? extends U>> eVar, boolean z, int i, int i2) {
            this.downstream = nVar;
            this.mapper = eVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(f60944a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo69960a(C13129a<T, U> aVar) {
            C13129a<?, ?>[] aVarArr;
            C13129a[] aVarArr2;
            do {
                aVarArr = (C13129a[]) this.observers.get();
                if (aVarArr == f60945c) {
                    aVar.mo69959a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C13129a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.observers.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo69961b() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = (Throwable) this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            mo69962c();
            Throwable b = this.errors.mo70048b();
            if (b != C13221g.f61115a) {
                this.downstream.onError(b);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo69962c() {
            C13129a<?, ?>[] aVarArr;
            this.upstream.dispose();
            C13129a<?, ?>[] aVarArr2 = (C13129a[]) this.observers.get();
            C13129a<?, ?>[] aVarArr3 = f60945c;
            if (aVarArr2 == aVarArr3 || (aVarArr = (C13129a[]) this.observers.getAndSet(aVarArr3)) == aVarArr3) {
                return false;
            }
            for (C13129a<?, ?> a : aVarArr) {
                a.mo69959a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo69963d() {
            if (getAndIncrement() == 0) {
                mo69964e();
            }
        }

        public void dispose() {
            Throwable b;
            if (!this.cancelled) {
                this.cancelled = true;
                if (mo69962c() && (b = this.errors.mo70048b()) != null && b != C13221g.f61115a) {
                    C12251a.m82985p(b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo69964e() {
            int i;
            int i2;
            C16741n<? super U> nVar = this.downstream;
            int i3 = 1;
            while (!mo69961b()) {
                C12184h<U> hVar = this.queue;
                if (hVar != null) {
                    while (!mo69961b()) {
                        U poll = hVar.poll();
                        if (poll != null) {
                            nVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.done;
                C12184h<U> hVar2 = this.queue;
                C13129a[] aVarArr = (C13129a[]) this.observers.get();
                int length = aVarArr.length;
                int i4 = 0;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.sources.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((hVar2 == null || hVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.lastId;
                        int i5 = this.lastIndex;
                        if (length <= i5 || aVarArr[i5].f60943id != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && aVarArr[i5].f60943id != j; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.lastIndex = i5;
                            this.lastId = aVarArr[i5].f60943id;
                        }
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length) {
                            if (!mo69961b()) {
                                C13129a aVar = aVarArr[i5];
                                C12185i<U> iVar = aVar.queue;
                                if (iVar != null) {
                                    while (true) {
                                        try {
                                            U poll2 = iVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            nVar.onNext(poll2);
                                            if (mo69961b()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C11078a.m74639b(th);
                                            aVar.mo69959a();
                                            this.errors.mo70047a(th);
                                            if (!mo69961b()) {
                                                mo69965f(aVar);
                                                i8++;
                                                i2 = i5 + 1;
                                                if (i2 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.done;
                                C12185i<U> iVar2 = aVar.queue;
                                if (z2 && (iVar2 == null || iVar2.isEmpty())) {
                                    mo69965f(aVar);
                                    if (!mo69961b()) {
                                        i8++;
                                    } else {
                                        return;
                                    }
                                }
                                i2 = i5 + 1;
                                if (i2 != length) {
                                    i7++;
                                }
                                i2 = 0;
                                i7++;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i5;
                        this.lastId = aVarArr[i5].f60943id;
                        i4 = i8;
                    }
                    if (i4 == 0) {
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        while (true) {
                            int i9 = i4 - 1;
                            if (i4 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                C16739l poll3 = this.sources.poll();
                                if (poll3 == null) {
                                    this.wip--;
                                } else {
                                    mo69966g(poll3);
                                }
                            }
                            i4 = i9;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable b = this.errors.mo70048b();
                    if (b == C13221g.f61115a) {
                        return;
                    }
                    if (b == null) {
                        nVar.onComplete();
                        return;
                    } else {
                        nVar.onError(b);
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo69965f(C13129a<T, U> aVar) {
            C13129a<T, U>[] aVarArr;
            C13129a<?, ?>[] aVarArr2;
            do {
                aVarArr = (C13129a[]) this.observers.get();
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
                            aVarArr2 = f60944a;
                        } else {
                            C13129a<?, ?>[] aVarArr3 = new C13129a[(length - 1)];
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
            } while (!this.observers.compareAndSet(aVarArr, aVarArr2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo69966g(C16739l<? extends U> lVar) {
            C16739l<? extends U> poll;
            while (lVar instanceof Callable) {
                if (mo69968i((Callable) lVar) && this.maxConcurrency != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                            z = true;
                        }
                    }
                    if (z) {
                        mo69963d();
                        return;
                    }
                    lVar = poll;
                } else {
                    return;
                }
            }
            long j = this.uniqueId;
            this.uniqueId = 1 + j;
            C13129a aVar = new C13129a(this, j);
            if (mo69960a(aVar)) {
                lVar.mo79695a(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo69967h(U u, C13129a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12185i iVar = aVar.queue;
                if (iVar == null) {
                    iVar = new C13178b(this.bufferSize);
                    aVar.queue = iVar;
                }
                iVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.downstream.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo69964e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo69968i(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C12184h<U> hVar = this.queue;
                    if (hVar == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            hVar = new C13178b<>(this.bufferSize);
                        } else {
                            hVar = new C13177a<>(this.maxConcurrency);
                        }
                        this.queue = hVar;
                    }
                    if (!hVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo69964e();
                return true;
            } catch (Throwable th) {
                C11078a.m74639b(th);
                this.errors.mo70047a(th);
                mo69963d();
                return true;
            }
        }

        public boolean isDisposed() {
            return this.cancelled;
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                mo69963d();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C12251a.m82985p(th);
            } else if (this.errors.mo70047a(th)) {
                this.done = true;
                mo69963d();
            } else {
                C12251a.m82985p(th);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    C16739l lVar = (C16739l) C11984b.m82367d(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            int i = this.wip;
                            if (i == this.maxConcurrency) {
                                this.sources.offer(lVar);
                                return;
                            }
                            this.wip = i + 1;
                        }
                    }
                    mo69966g(lVar);
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    this.upstream.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C17071b bVar) {
            if (C11163b.m74932j(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public C13128k(C16739l<T> lVar, C11114e<? super T, ? extends C16739l<? extends U>> eVar, boolean z, int i, int i2) {
        super(lVar);
        this.f60939c = eVar;
        this.f60940d = z;
        this.f60941f = i;
        this.f60942g = i2;
    }

    /* renamed from: S */
    public void mo68827S(C16741n<? super U> nVar) {
        if (!C13154y.m85415b(this.f60853a, nVar, this.f60939c)) {
            this.f60853a.mo79695a(new C13130b(nVar, this.f60939c, this.f60940d, this.f60941f, this.f60942g));
        }
    }
}

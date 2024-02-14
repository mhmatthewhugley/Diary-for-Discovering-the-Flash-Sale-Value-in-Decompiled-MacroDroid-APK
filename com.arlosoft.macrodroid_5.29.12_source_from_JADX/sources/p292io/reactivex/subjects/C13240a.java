package p292io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p241da.C11984b;
import p262fa.C12251a;
import p292io.reactivex.internal.util.C13214a;
import p292io.reactivex.internal.util.C13221g;
import p292io.reactivex.internal.util.C13224i;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.subjects.a */
/* compiled from: BehaviorSubject */
public final class C13240a<T> extends C13246d<T> {

    /* renamed from: A */
    static final C13241a[] f61155A = new C13241a[0];

    /* renamed from: s */
    private static final Object[] f61156s = new Object[0];

    /* renamed from: z */
    static final C13241a[] f61157z = new C13241a[0];

    /* renamed from: a */
    final AtomicReference<Object> f61158a = new AtomicReference<>();

    /* renamed from: c */
    final AtomicReference<C13241a<T>[]> f61159c = new AtomicReference<>(f61157z);

    /* renamed from: d */
    final ReadWriteLock f61160d;

    /* renamed from: f */
    final Lock f61161f;

    /* renamed from: g */
    final Lock f61162g;

    /* renamed from: o */
    final AtomicReference<Throwable> f61163o = new AtomicReference<>();

    /* renamed from: p */
    long f61164p;

    /* renamed from: io.reactivex.subjects.a$a */
    /* compiled from: BehaviorSubject */
    static final class C13241a<T> implements C17071b, C13214a.C13215a<Object> {

        /* renamed from: a */
        final C16741n<? super T> f61165a;

        /* renamed from: c */
        final C13240a<T> f61166c;

        /* renamed from: d */
        boolean f61167d;

        /* renamed from: f */
        boolean f61168f;

        /* renamed from: g */
        C13214a<Object> f61169g;

        /* renamed from: o */
        boolean f61170o;

        /* renamed from: p */
        volatile boolean f61171p;

        /* renamed from: s */
        long f61172s;

        C13241a(C16741n<? super T> nVar, C13240a<T> aVar) {
            this.f61165a = nVar;
            this.f61166c = aVar;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (test(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            mo70081b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo70080a() {
            /*
                r4 = this;
                boolean r0 = r4.f61171p
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f61171p     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f61167d     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                io.reactivex.subjects.a<T> r0 = r4.f61166c     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f61161f     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f61164p     // Catch:{ all -> 0x003e }
                r4.f61172s = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f61158a     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f61168f = r2     // Catch:{ all -> 0x003e }
                r4.f61167d = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo70081b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.reactivex.subjects.C13240a.C13241a.mo70080a():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo70042d(r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo70081b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f61171p
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f61169g     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f61168f = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f61169g = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo70042d(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.reactivex.subjects.C13240a.C13241a.mo70081b():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f61170o = true;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo70082c(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f61171p
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f61170o
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f61171p     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f61172s     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f61168f     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                io.reactivex.internal.util.a<java.lang.Object> r5 = r3.f61169g     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                io.reactivex.internal.util.a r5 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f61169g = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo70041c(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f61167d = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f61170o = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.test(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.reactivex.subjects.C13240a.C13241a.mo70082c(java.lang.Object, long):void");
        }

        public void dispose() {
            if (!this.f61171p) {
                this.f61171p = true;
                this.f61166c.mo70077j0(this);
            }
        }

        public boolean isDisposed() {
            return this.f61171p;
        }

        public boolean test(Object obj) {
            return this.f61171p || C13224i.m85554b(obj, this.f61165a);
        }
    }

    C13240a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f61160d = reentrantReadWriteLock;
        this.f61161f = reentrantReadWriteLock.readLock();
        this.f61162g = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: i0 */
    public static <T> C13240a<T> m85593i0() {
        return new C13240a<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo68827S(C16741n<? super T> nVar) {
        C13241a aVar = new C13241a(nVar, this);
        nVar.onSubscribe(aVar);
        if (!mo70076h0(aVar)) {
            Throwable th = this.f61163o.get();
            if (th == C13221g.f61115a) {
                nVar.onComplete();
            } else {
                nVar.onError(th);
            }
        } else if (aVar.f61171p) {
            mo70077j0(aVar);
        } else {
            aVar.mo70080a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public boolean mo70076h0(C13241a<T> aVar) {
        C13241a[] aVarArr;
        C13241a[] aVarArr2;
        do {
            aVarArr = (C13241a[]) this.f61159c.get();
            if (aVarArr == f61155A) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C13241a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f61159c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo70077j0(C13241a<T> aVar) {
        C13241a<T>[] aVarArr;
        C13241a[] aVarArr2;
        do {
            aVarArr = (C13241a[]) this.f61159c.get();
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
                        aVarArr2 = f61157z;
                    } else {
                        C13241a[] aVarArr3 = new C13241a[(length - 1)];
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
        } while (!this.f61159c.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo70078k0(Object obj) {
        this.f61162g.lock();
        this.f61164p++;
        this.f61158a.lazySet(obj);
        this.f61162g.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public C13241a<T>[] mo70079l0(Object obj) {
        AtomicReference<C13241a<T>[]> atomicReference = this.f61159c;
        C13241a<T>[] aVarArr = f61155A;
        C13241a<T>[] aVarArr2 = (C13241a[]) atomicReference.getAndSet(aVarArr);
        if (aVarArr2 != aVarArr) {
            mo70078k0(obj);
        }
        return aVarArr2;
    }

    public void onComplete() {
        if (this.f61163o.compareAndSet((Object) null, C13221g.f61115a)) {
            Object f = C13224i.m85557f();
            for (C13241a c : mo70079l0(f)) {
                c.mo70082c(f, this.f61164p);
            }
        }
    }

    public void onError(Throwable th) {
        C11984b.m82367d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f61163o.compareAndSet((Object) null, th)) {
            C12251a.m82985p(th);
            return;
        }
        Object g = C13224i.m85558g(th);
        for (C13241a c : mo70079l0(g)) {
            c.mo70082c(g, this.f61164p);
        }
    }

    public void onNext(T t) {
        C11984b.m82367d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61163o.get() == null) {
            Object i = C13224i.m85559i(t);
            mo70078k0(i);
            for (C13241a c : (C13241a[]) this.f61159c.get()) {
                c.mo70082c(i, this.f61164p);
            }
        }
    }

    public void onSubscribe(C17071b bVar) {
        if (this.f61163o.get() != null) {
            bVar.dispose();
        }
    }
}

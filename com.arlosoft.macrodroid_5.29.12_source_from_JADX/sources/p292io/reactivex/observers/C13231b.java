package p292io.reactivex.observers;

import p223ca.C11163b;
import p292io.reactivex.internal.util.C13214a;
import p292io.reactivex.internal.util.C13224i;
import p414v9.C16741n;
import p448z9.C17071b;

/* renamed from: io.reactivex.observers.b */
/* compiled from: SerializedObserver */
public final class C13231b<T> implements C16741n<T>, C17071b {

    /* renamed from: a */
    final C16741n<? super T> f61124a;

    /* renamed from: c */
    final boolean f61125c;

    /* renamed from: d */
    C17071b f61126d;

    /* renamed from: f */
    boolean f61127f;

    /* renamed from: g */
    C13214a<Object> f61128g;

    /* renamed from: o */
    volatile boolean f61129o;

    public C13231b(C16741n<? super T> nVar) {
        this(nVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70062a() {
        C13214a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f61128g;
                if (aVar == null) {
                    this.f61127f = false;
                    return;
                }
                this.f61128g = null;
            }
        } while (!aVar.mo70040b(this.f61124a));
    }

    public void dispose() {
        this.f61126d.dispose();
    }

    public boolean isDisposed() {
        return this.f61126d.isDisposed();
    }

    public void onComplete() {
        if (!this.f61129o) {
            synchronized (this) {
                if (!this.f61129o) {
                    if (this.f61127f) {
                        C13214a<Object> aVar = this.f61128g;
                        if (aVar == null) {
                            aVar = new C13214a<>(4);
                            this.f61128g = aVar;
                        }
                        aVar.mo70041c(C13224i.m85557f());
                        return;
                    }
                    this.f61129o = true;
                    this.f61127f = true;
                    this.f61124a.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p262fa.C12251a.m82985p(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f61124a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f61129o
            if (r0 == 0) goto L_0x0008
            p262fa.C12251a.m82985p(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f61129o     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f61127f     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f61129o = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f61128g     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f61128g = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p292io.reactivex.internal.util.C13224i.m85558g(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f61125c     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo70041c(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo70043e(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f61129o = r1     // Catch:{ all -> 0x0044 }
            r2.f61127f = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p262fa.C12251a.m82985p(r3)
            return
        L_0x003e:
            v9.n<? super T> r0 = r2.f61124a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.reactivex.observers.C13231b.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f61129o) {
            if (t == null) {
                this.f61126d.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f61129o) {
                    if (this.f61127f) {
                        C13214a<Object> aVar = this.f61128g;
                        if (aVar == null) {
                            aVar = new C13214a<>(4);
                            this.f61128g = aVar;
                        }
                        aVar.mo70041c(C13224i.m85559i(t));
                        return;
                    }
                    this.f61127f = true;
                    this.f61124a.onNext(t);
                    mo70062a();
                }
            }
        }
    }

    public void onSubscribe(C17071b bVar) {
        if (C11163b.m74932j(this.f61126d, bVar)) {
            this.f61126d = bVar;
            this.f61124a.onSubscribe(this);
        }
    }

    public C13231b(C16741n<? super T> nVar, boolean z) {
        this.f61124a = nVar;
        this.f61125c = z;
    }
}

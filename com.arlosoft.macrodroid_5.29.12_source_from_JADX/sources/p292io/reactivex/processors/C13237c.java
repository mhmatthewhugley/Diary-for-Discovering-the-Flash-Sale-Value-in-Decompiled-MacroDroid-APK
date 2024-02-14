package p292io.reactivex.processors;

import p292io.reactivex.internal.util.C13214a;
import p292io.reactivex.internal.util.C13224i;
import p329me.C15738c;
import p329me.C15739d;

/* renamed from: io.reactivex.processors.c */
/* compiled from: SerializedProcessor */
final class C13237c<T> extends C13232a<T> {

    /* renamed from: c */
    final C13232a<T> f61140c;

    /* renamed from: d */
    boolean f61141d;

    /* renamed from: f */
    C13214a<Object> f61142f;

    /* renamed from: g */
    volatile boolean f61143g;

    C13237c(C13232a<T> aVar) {
        this.f61140c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo70070C() {
        C13214a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f61142f;
                if (aVar == null) {
                    this.f61141d = false;
                    return;
                }
                this.f61142f = null;
            }
            aVar.mo70039a(this.f61140c);
        }
        while (true) {
        }
    }

    /* renamed from: a */
    public void mo68760a(C15739d dVar) {
        boolean z = true;
        if (!this.f61143g) {
            synchronized (this) {
                if (!this.f61143g) {
                    if (this.f61141d) {
                        C13214a<Object> aVar = this.f61142f;
                        if (aVar == null) {
                            aVar = new C13214a<>(4);
                            this.f61142f = aVar;
                        }
                        aVar.mo70041c(C13224i.m85560j(dVar));
                        return;
                    }
                    this.f61141d = true;
                    z = false;
                }
            }
        }
        if (z) {
            dVar.cancel();
            return;
        }
        this.f61140c.mo68760a(dVar);
        mo70070C();
    }

    public void onComplete() {
        if (!this.f61143g) {
            synchronized (this) {
                if (!this.f61143g) {
                    this.f61143g = true;
                    if (this.f61141d) {
                        C13214a<Object> aVar = this.f61142f;
                        if (aVar == null) {
                            aVar = new C13214a<>(4);
                            this.f61142f = aVar;
                        }
                        aVar.mo70041c(C13224i.m85557f());
                        return;
                    }
                    this.f61141d = true;
                    this.f61140c.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p262fa.C12251a.m82985p(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f61140c.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f61143g
            if (r0 == 0) goto L_0x0008
            p262fa.C12251a.m82985p(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f61143g     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x002e
        L_0x000f:
            r2.f61143g = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f61141d     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002a
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f61142f     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f61142f = r0     // Catch:{ all -> 0x003b }
        L_0x0021:
            java.lang.Object r3 = p292io.reactivex.internal.util.C13224i.m85558g(r3)     // Catch:{ all -> 0x003b }
            r0.mo70043e(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002a:
            r0 = 0
            r2.f61141d = r1     // Catch:{ all -> 0x003b }
            r1 = 0
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0035
            p262fa.C12251a.m82985p(r3)
            return
        L_0x0035:
            io.reactivex.processors.a<T> r0 = r2.f61140c
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.reactivex.processors.C13237c.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f61143g) {
            synchronized (this) {
                if (!this.f61143g) {
                    if (this.f61141d) {
                        C13214a<Object> aVar = this.f61142f;
                        if (aVar == null) {
                            aVar = new C13214a<>(4);
                            this.f61142f = aVar;
                        }
                        aVar.mo70041c(C13224i.m85559i(t));
                        return;
                    }
                    this.f61141d = true;
                    this.f61140c.onNext(t);
                    mo70070C();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo69901u(C15738c<? super T> cVar) {
        this.f61140c.mo75177b(cVar);
    }
}

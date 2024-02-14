package p278ha;

import p292io.reactivex.internal.subscriptions.C13213f;
import p292io.reactivex.internal.util.C13214a;
import p292io.reactivex.internal.util.C13224i;
import p329me.C15738c;
import p329me.C15739d;
import p414v9.C16733g;

/* renamed from: ha.a */
/* compiled from: SerializedSubscriber */
public final class C12411a<T> implements C16733g<T>, C15739d {

    /* renamed from: a */
    final C15738c<? super T> f59143a;

    /* renamed from: c */
    final boolean f59144c;

    /* renamed from: d */
    C15739d f59145d;

    /* renamed from: f */
    boolean f59146f;

    /* renamed from: g */
    C13214a<Object> f59147g;

    /* renamed from: o */
    volatile boolean f59148o;

    public C12411a(C15738c<? super T> cVar) {
        this(cVar, false);
    }

    /* renamed from: a */
    public void mo68760a(C15739d dVar) {
        if (C13213f.m85530k(this.f59145d, dVar)) {
            this.f59145d = dVar;
            this.f59143a.mo68760a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo68761b() {
        C13214a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f59147g;
                if (aVar == null) {
                    this.f59146f = false;
                    return;
                }
                this.f59147g = null;
            }
        } while (!aVar.mo70039a(this.f59143a));
    }

    public void cancel() {
        this.f59145d.cancel();
    }

    public void onComplete() {
        if (!this.f59148o) {
            synchronized (this) {
                if (!this.f59148o) {
                    if (this.f59146f) {
                        C13214a<Object> aVar = this.f59147g;
                        if (aVar == null) {
                            aVar = new C13214a<>(4);
                            this.f59147g = aVar;
                        }
                        aVar.mo70041c(C13224i.m85557f());
                        return;
                    }
                    this.f59148o = true;
                    this.f59146f = true;
                    this.f59143a.onComplete();
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
        r2.f59143a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f59148o
            if (r0 == 0) goto L_0x0008
            p262fa.C12251a.m82985p(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f59148o     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f59146f     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f59148o = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.internal.util.a<java.lang.Object> r0 = r2.f59147g     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f59147g = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p292io.reactivex.internal.util.C13224i.m85558g(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f59144c     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo70041c(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo70043e(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f59148o = r1     // Catch:{ all -> 0x0044 }
            r2.f59146f = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p262fa.C12251a.m82985p(r3)
            return
        L_0x003e:
            me.c<? super T> r0 = r2.f59143a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p278ha.C12411a.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f59148o) {
            if (t == null) {
                this.f59145d.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f59148o) {
                    if (this.f59146f) {
                        C13214a<Object> aVar = this.f59147g;
                        if (aVar == null) {
                            aVar = new C13214a<>(4);
                            this.f59147g = aVar;
                        }
                        aVar.mo70041c(C13224i.m85559i(t));
                        return;
                    }
                    this.f59146f = true;
                    this.f59143a.onNext(t);
                    mo68761b();
                }
            }
        }
    }

    public void request(long j) {
        this.f59145d.request(j);
    }

    public C12411a(C15738c<? super T> cVar, boolean z) {
        this.f59143a = cVar;
        this.f59144c = z;
    }
}

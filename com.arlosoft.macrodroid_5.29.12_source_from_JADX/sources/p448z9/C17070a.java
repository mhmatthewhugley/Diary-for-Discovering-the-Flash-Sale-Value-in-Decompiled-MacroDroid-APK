package p448z9;

import java.util.ArrayList;
import p209aa.C11078a;
import p223ca.C11162a;
import p241da.C11984b;
import p292io.reactivex.exceptions.CompositeException;
import p292io.reactivex.internal.util.C13221g;
import p292io.reactivex.internal.util.C13228j;

/* renamed from: z9.a */
/* compiled from: CompositeDisposable */
public final class C17070a implements C17071b, C11162a {

    /* renamed from: a */
    C13228j<C17071b> f68514a;

    /* renamed from: c */
    volatile boolean f68515c;

    /* renamed from: a */
    public boolean mo62358a(C17071b bVar) {
        C11984b.m82367d(bVar, "d is null");
        if (!this.f68515c) {
            synchronized (this) {
                if (!this.f68515c) {
                    C13228j<C17071b> jVar = this.f68514a;
                    if (jVar == null) {
                        jVar = new C13228j<>();
                        this.f68514a = jVar;
                    }
                    jVar.mo70056a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* renamed from: b */
    public boolean mo62359b(C17071b bVar) {
        if (!mo62360c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62360c(p448z9.C17071b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p241da.C11984b.m82367d(r3, r0)
            boolean r0 = r2.f68515c
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f68515c     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            io.reactivex.internal.util.j<z9.b> r0 = r2.f68514a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo70059e(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p448z9.C17070a.mo62360c(z9.b):boolean");
    }

    /* renamed from: d */
    public void mo80337d() {
        if (!this.f68515c) {
            synchronized (this) {
                if (!this.f68515c) {
                    C13228j<C17071b> jVar = this.f68514a;
                    this.f68514a = null;
                    mo80338e(jVar);
                }
            }
        }
    }

    public void dispose() {
        if (!this.f68515c) {
            synchronized (this) {
                if (!this.f68515c) {
                    this.f68515c = true;
                    C13228j<C17071b> jVar = this.f68514a;
                    this.f68514a = null;
                    mo80338e(jVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo80338e(C13228j<C17071b> jVar) {
        if (jVar != null) {
            ArrayList arrayList = null;
            for (Object obj : jVar.mo70057b()) {
                if (obj instanceof C17071b) {
                    try {
                        ((C17071b) obj).dispose();
                    } catch (Throwable th) {
                        C11078a.m74639b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C13221g.m85550d((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }

    public boolean isDisposed() {
        return this.f68515c;
    }
}

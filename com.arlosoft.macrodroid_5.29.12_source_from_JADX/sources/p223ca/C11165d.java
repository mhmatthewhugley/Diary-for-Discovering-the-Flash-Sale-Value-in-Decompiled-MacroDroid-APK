package p223ca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p209aa.C11078a;
import p241da.C11984b;
import p292io.reactivex.exceptions.CompositeException;
import p292io.reactivex.internal.util.C13221g;
import p448z9.C17071b;

/* renamed from: ca.d */
/* compiled from: ListCompositeDisposable */
public final class C11165d implements C17071b, C11162a {

    /* renamed from: a */
    List<C17071b> f54072a;

    /* renamed from: c */
    volatile boolean f54073c;

    /* renamed from: a */
    public boolean mo62358a(C17071b bVar) {
        C11984b.m82367d(bVar, "d is null");
        if (!this.f54073c) {
            synchronized (this) {
                if (!this.f54073c) {
                    List list = this.f54072a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f54072a = list;
                    }
                    list.add(bVar);
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
            boolean r0 = r2.f54073c
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f54073c     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<z9.b> r0 = r2.f54072a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p223ca.C11165d.mo62360c(z9.b):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo62368d(List<C17071b> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C17071b dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C11078a.m74639b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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

    public void dispose() {
        if (!this.f54073c) {
            synchronized (this) {
                if (!this.f54073c) {
                    this.f54073c = true;
                    List<C17071b> list = this.f54072a;
                    this.f54072a = null;
                    mo62368d(list);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f54073c;
    }
}

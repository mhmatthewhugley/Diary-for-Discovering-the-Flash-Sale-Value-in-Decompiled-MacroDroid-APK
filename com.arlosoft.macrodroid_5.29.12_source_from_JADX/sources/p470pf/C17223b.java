package p470pf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import p459ef.C17163i;
import p463if.C17175a;

/* renamed from: pf.b */
/* compiled from: CompositeSubscription */
public final class C17223b implements C17163i {

    /* renamed from: a */
    private Set<C17163i> f68783a;

    /* renamed from: c */
    private volatile boolean f68784c;

    /* renamed from: e */
    private static void m100800e(Collection<C17163i> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (C17163i d : collection) {
                try {
                    d.mo80450d();
                } catch (Throwable th) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            C17175a.m100683c(arrayList);
        }
    }

    /* renamed from: a */
    public void mo80521a(C17163i iVar) {
        if (!iVar.mo80449b()) {
            if (!this.f68784c) {
                synchronized (this) {
                    if (!this.f68784c) {
                        if (this.f68783a == null) {
                            this.f68783a = new HashSet(4);
                        }
                        this.f68783a.add(iVar);
                        return;
                    }
                }
            }
            iVar.mo80450d();
        }
    }

    /* renamed from: b */
    public boolean mo80449b() {
        return this.f68784c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r2.mo80450d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80522c(p459ef.C17163i r2) {
        /*
            r1 = this;
            boolean r0 = r1.f68784c
            if (r0 != 0) goto L_0x001e
            monitor-enter(r1)
            boolean r0 = r1.f68784c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            java.util.Set<ef.i> r0 = r1.f68783a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            boolean r0 = r0.remove(r2)     // Catch:{ all -> 0x001b }
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001e
            r2.mo80450d()
            goto L_0x001e
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p470pf.C17223b.mo80522c(ef.i):void");
    }

    /* renamed from: d */
    public void mo80450d() {
        if (!this.f68784c) {
            synchronized (this) {
                if (!this.f68784c) {
                    this.f68784c = true;
                    Set<C17163i> set = this.f68783a;
                    this.f68783a = null;
                    m100800e(set);
                }
            }
        }
    }
}

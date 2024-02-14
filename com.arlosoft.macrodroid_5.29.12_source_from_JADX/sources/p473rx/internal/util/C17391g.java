package p473rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import p459ef.C17163i;
import p463if.C17175a;

/* renamed from: rx.internal.util.g */
/* compiled from: SubscriptionList */
public final class C17391g implements C17163i {

    /* renamed from: a */
    private List<C17163i> f69149a;

    /* renamed from: c */
    private volatile boolean f69150c;

    public C17391g() {
    }

    /* renamed from: e */
    private static void m101148e(Collection<C17163i> collection) {
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
    public void mo80709a(C17163i iVar) {
        if (!iVar.mo80449b()) {
            if (!this.f69150c) {
                synchronized (this) {
                    if (!this.f69150c) {
                        List list = this.f69149a;
                        if (list == null) {
                            list = new LinkedList();
                            this.f69149a = list;
                        }
                        list.add(iVar);
                        return;
                    }
                }
            }
            iVar.mo80450d();
        }
    }

    /* renamed from: b */
    public boolean mo80449b() {
        return this.f69150c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r3.mo80450d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80710c(p459ef.C17163i r3) {
        /*
            r2 = this;
            boolean r0 = r2.f69150c
            if (r0 != 0) goto L_0x001e
            monitor-enter(r2)
            java.util.List<ef.i> r0 = r2.f69149a     // Catch:{ all -> 0x001b }
            boolean r1 = r2.f69150c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0019
            if (r0 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            boolean r0 = r0.remove(r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001e
            r3.mo80450d()
            goto L_0x001e
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p473rx.internal.util.C17391g.mo80710c(ef.i):void");
    }

    /* renamed from: d */
    public void mo80450d() {
        if (!this.f69150c) {
            synchronized (this) {
                if (!this.f69150c) {
                    this.f69150c = true;
                    List<C17163i> list = this.f69149a;
                    this.f69149a = null;
                    m101148e(list);
                }
            }
        }
    }

    public C17391g(C17163i... iVarArr) {
        this.f69149a = new LinkedList(Arrays.asList(iVarArr));
    }

    public C17391g(C17163i iVar) {
        LinkedList linkedList = new LinkedList();
        this.f69149a = linkedList;
        linkedList.add(iVar);
    }
}

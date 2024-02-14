package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbcg {

    /* renamed from: a */
    private final Object f26578a = new Object();
    @VisibleForTesting

    /* renamed from: b */
    int f26579b;

    /* renamed from: c */
    private final List f26580c = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        return r1;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbcf mo42442a(boolean r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f26578a
            monitor-enter(r0)
            java.util.List r1 = r8.f26580c     // Catch:{ all -> 0x0061 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            java.lang.String r9 = "Queue empty"
            com.google.android.gms.internal.ads.zzcgp.m45224b(r9)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x0013:
            java.util.List r1 = r8.f26580c     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x004c
            java.util.List r9 = r8.f26580c     // Catch:{ all -> 0x0061 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0061 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
        L_0x0026:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.zzbcf r5 = (com.google.android.gms.internal.ads.zzbcf) r5     // Catch:{ all -> 0x0061 }
            int r6 = r5.mo42425b()     // Catch:{ all -> 0x0061 }
            if (r6 <= r1) goto L_0x0039
            r4 = r3
        L_0x0039:
            if (r6 <= r1) goto L_0x003d
            r7 = r6
            goto L_0x003e
        L_0x003d:
            r7 = r1
        L_0x003e:
            if (r6 <= r1) goto L_0x0041
            r2 = r5
        L_0x0041:
            int r3 = r3 + 1
            r1 = r7
            goto L_0x0026
        L_0x0045:
            java.util.List r9 = r8.f26580c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x004c:
            java.util.List r1 = r8.f26580c     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.zzbcf r1 = (com.google.android.gms.internal.ads.zzbcf) r1     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x005c
            java.util.List r9 = r8.f26580c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x005c:
            r1.mo42434i()     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcg.mo42442a(boolean):com.google.android.gms.internal.ads.zzbcf");
    }

    /* renamed from: b */
    public final void mo42443b(zzbcf zzbcf) {
        synchronized (this.f26578a) {
            if (this.f26580c.size() >= 10) {
                int size = this.f26580c.size();
                zzcgp.m45224b("Queue is full, current size = " + size);
                this.f26580c.remove(0);
            }
            int i = this.f26579b;
            this.f26579b = i + 1;
            zzbcf.mo42435j(i);
            zzbcf.mo42439n();
            this.f26580c.add(zzbcf);
        }
    }

    /* renamed from: c */
    public final boolean mo42444c(zzbcf zzbcf) {
        synchronized (this.f26578a) {
            Iterator it = this.f26580c.iterator();
            while (it.hasNext()) {
                zzbcf zzbcf2 = (zzbcf) it.next();
                if (!zzt.m2904q().mo43494h().mo20355T()) {
                    if (!zzbcf.equals(zzbcf2) && zzbcf2.mo42427d().equals(zzbcf.mo42427d())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzt.m2904q().mo43494h().mo20354M() && !zzbcf.equals(zzbcf2) && zzbcf2.mo42430f().equals(zzbcf.mo42430f())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo42445d(zzbcf zzbcf) {
        synchronized (this.f26578a) {
            if (this.f26580c.contains(zzbcf)) {
                return true;
            }
            return false;
        }
    }
}

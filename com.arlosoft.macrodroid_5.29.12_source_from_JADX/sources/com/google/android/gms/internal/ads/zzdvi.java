package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdvi {

    /* renamed from: a */
    private final Map f33218a = new HashMap();

    zzdvi() {
    }

    /* renamed from: a */
    public final synchronized zzdvh mo45010a(String str) {
        return (zzdvh) this.f33218a.get(str);
    }

    /* renamed from: b */
    public final zzdvh mo45011b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdvh a = mo45010a((String) it.next());
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.f33215b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo45012c(java.lang.String r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzdvh r1 = r0.mo45010a(r1)
            if (r1 == 0) goto L_0x0010
            com.google.android.gms.internal.ads.zzbxq r1 = r1.f33215b
            if (r1 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0010:
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvi.mo45012c(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0019 A[SYNTHETIC, Splitter:B:15:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo45013d(java.lang.String r7, com.google.android.gms.internal.ads.zzffa r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.f33218a     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r6)
            return
        L_0x000b:
            com.google.android.gms.internal.ads.zzdvh r0 = new com.google.android.gms.internal.ads.zzdvh     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r8 != 0) goto L_0x0012
        L_0x0010:
            r2 = r1
            goto L_0x0016
        L_0x0012:
            com.google.android.gms.internal.ads.zzbxq r2 = r8.mo45652h()     // Catch:{ zzfek -> 0x0010 }
        L_0x0016:
            if (r8 != 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            com.google.android.gms.internal.ads.zzbxq r1 = r8.mo45653i()     // Catch:{ zzfek -> 0x001d }
        L_0x001d:
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27060Z7     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r3 = r4.mo42663b(r3)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0044 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0044 }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0033
        L_0x0031:
            r4 = 1
            goto L_0x003a
        L_0x0033:
            if (r8 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            r8.mo45645a()     // Catch:{ zzfek -> 0x003a }
            goto L_0x0031
        L_0x003a:
            r0.<init>(r7, r2, r1, r4)     // Catch:{ all -> 0x0044 }
            java.util.Map r8 = r6.f33218a     // Catch:{ all -> 0x0044 }
            r8.put(r7, r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)
            return
        L_0x0044:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvi.mo45013d(java.lang.String, com.google.android.gms.internal.ads.zzffa):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo45014e(String str, zzbxd zzbxd) {
        if (!this.f33218a.containsKey(str)) {
            try {
                this.f33218a.put(str, new zzdvh(str, zzbxd.mo43178c(), zzbxd.mo43180f(), true));
            } catch (Throwable unused) {
            }
        }
    }
}

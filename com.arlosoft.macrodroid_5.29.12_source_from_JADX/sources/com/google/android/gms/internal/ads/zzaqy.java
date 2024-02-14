package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqy extends zzarq {

    /* renamed from: A */
    private final View f25357A;

    /* renamed from: z */
    private final Map f25358z;

    public zzaqy(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2, Map map, View view) {
        super(zzaqe, "RKC3mFMqGi7xOgQ7s39JMoZe9bnzGCFipcdUUf0vlgHDkBg7SvMkVmBGpwLs06ia", "8Xr1ilYJHo+oWZQAYAG91DIHBuqEmXK8yHtxL6KkyfU=", zzamk, i, 85);
        this.f25358z = map;
        this.f25357A = view;
    }

    /* renamed from: c */
    private final long m42168c(int i) {
        Map map = this.f25358z;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.f25358z.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41843a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            r0 = 2
            long[] r1 = new long[r0]
            r2 = 1
            long r3 = r10.m42168c(r2)
            r5 = 0
            r1[r5] = r3
            long r3 = r10.m42168c(r0)
            r1[r2] = r3
            java.lang.reflect.Method r3 = r10.f25388o
            r4 = 3
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r1
            com.google.android.gms.internal.ads.zzaqe r1 = r10.f25384c
            android.content.Context r1 = r1.mo41806b()
            r6[r2] = r1
            android.view.View r1 = r10.f25357A
            r6[r0] = r1
            r1 = 0
            java.lang.Object r1 = r3.invoke(r1, r6)
            long[] r1 = (long[]) r1
            r5 = r1[r5]
            java.util.Map r3 = r10.f25358z
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = r1[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r3.put(r7, r2)
            r2 = r1[r0]
            java.util.Map r7 = r10.f25358z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = r1[r4]
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r7.put(r0, r1)
            com.google.android.gms.internal.ads.zzamk r0 = r10.f25387g
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzamk r1 = r10.f25387g     // Catch:{ all -> 0x005c }
            r1.mo41662G0(r5)     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.zzamk r1 = r10.f25387g     // Catch:{ all -> 0x005c }
            r1.mo41660F0(r2)     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqy.mo41843a():void");
    }
}

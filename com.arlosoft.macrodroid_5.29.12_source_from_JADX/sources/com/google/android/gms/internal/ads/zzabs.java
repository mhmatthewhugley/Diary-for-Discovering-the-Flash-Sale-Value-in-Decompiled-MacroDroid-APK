package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzabs extends zzabu {

    /* renamed from: b */
    private long f23871b = -9223372036854775807L;

    /* renamed from: c */
    private long[] f23872c = new long[0];

    /* renamed from: d */
    private long[] f23873d = new long[0];

    public zzabs() {
        super(new zzzh());
    }

    /* renamed from: g */
    private static Double m41010g(zzef zzef) {
        return Double.valueOf(Double.longBitsToDouble(zzef.mo45250z()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m41011h(com.google.android.gms.internal.ads.zzef r4, int r5) {
        /*
            if (r5 == 0) goto L_0x007a
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x006e
            r1 = 2
            if (r5 == r1) goto L_0x0069
            r2 = 3
            if (r5 == r2) goto L_0x004d
            r2 = 8
            if (r5 == r2) goto L_0x0048
            r2 = 10
            if (r5 == r2) goto L_0x002c
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            java.lang.Double r0 = m41010g(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.mo45231g(r1)
            return r5
        L_0x002c:
            int r5 = r4.mo45246v()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0035:
            if (r0 >= r5) goto L_0x0047
            int r2 = r4.mo45243s()
            java.lang.Object r2 = m41011h(r4, r2)
            if (r2 == 0) goto L_0x0044
            r1.add(r2)
        L_0x0044:
            int r0 = r0 + 1
            goto L_0x0035
        L_0x0047:
            return r1
        L_0x0048:
            java.util.HashMap r4 = m41013j(r4)
            return r4
        L_0x004d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0052:
            java.lang.String r0 = m41012i(r4)
            int r1 = r4.mo45243s()
            r2 = 9
            if (r1 != r2) goto L_0x005f
            return r5
        L_0x005f:
            java.lang.Object r1 = m41011h(r4, r1)
            if (r1 == 0) goto L_0x0052
            r5.put(r0, r1)
            goto L_0x0052
        L_0x0069:
            java.lang.String r4 = m41012i(r4)
            return r4
        L_0x006e:
            int r4 = r4.mo45243s()
            if (r4 != r1) goto L_0x0075
            r0 = 1
        L_0x0075:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007a:
            java.lang.Double r4 = m41010g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabs.m41011h(com.google.android.gms.internal.ads.zzef, int):java.lang.Object");
    }

    /* renamed from: i */
    private static String m41012i(zzef zzef) {
        int w = zzef.mo45247w();
        int k = zzef.mo45235k();
        zzef.mo45231g(w);
        return new String(zzef.mo45232h(), k, w);
    }

    /* renamed from: j */
    private static HashMap m41013j(zzef zzef) {
        int v = zzef.mo45246v();
        HashMap hashMap = new HashMap(v);
        for (int i = 0; i < v; i++) {
            String i2 = m41012i(zzef);
            Object h = m41011h(zzef, zzef.mo45243s());
            if (h != null) {
                hashMap.put(i2, h);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo41245a(zzef zzef) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo41246b(zzef zzef, long j) {
        if (zzef.mo45243s() != 2 || !"onMetaData".equals(m41012i(zzef)) || zzef.mo45233i() == 0 || zzef.mo45243s() != 8) {
            return false;
        }
        HashMap j2 = m41013j(zzef);
        Object obj = j2.get(TypedValues.Transition.S_DURATION);
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f23871b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = j2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f23872c = new long[size];
                this.f23873d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f23872c = new long[0];
                        this.f23873d = new long[0];
                    } else {
                        this.f23872c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f23873d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f23872c = new long[0];
                this.f23873d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo41247d() {
        return this.f23871b;
    }

    /* renamed from: e */
    public final long[] mo41248e() {
        return this.f23873d;
    }

    /* renamed from: f */
    public final long[] mo41249f() {
        return this.f23872c;
    }
}

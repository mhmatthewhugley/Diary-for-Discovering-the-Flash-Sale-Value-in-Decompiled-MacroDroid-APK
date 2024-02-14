package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaeb implements zzaed {

    /* renamed from: a */
    private final byte[] f24016a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque f24017b = new ArrayDeque();

    /* renamed from: c */
    private final zzaek f24018c = new zzaek();

    /* renamed from: d */
    private zzaec f24019d;

    /* renamed from: e */
    private int f24020e;

    /* renamed from: f */
    private int f24021f;

    /* renamed from: g */
    private long f24022g;

    /* renamed from: c */
    private final long m41133c(zzzj zzzj, int i) throws IOException {
        ((zzyy) zzzj).mo48453i(this.f24016a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f24016a[i2] & 255));
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r0 == 1) goto L_0x0089;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41398a(com.google.android.gms.internal.ads.zzzj r14) throws java.io.IOException {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzaec r0 = r13.f24019d
            com.google.android.gms.internal.ads.zzdd.m47208b(r0)
        L_0x0005:
            java.util.ArrayDeque r0 = r13.f24017b
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzaea r0 = (com.google.android.gms.internal.ads.zzaea) r0
            r1 = 1
            if (r0 == 0) goto L_0x0033
            long r2 = r14.mo41252c()
            long r4 = r0.f24015b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            com.google.android.gms.internal.ads.zzaec r14 = r13.f24019d
            java.util.ArrayDeque r0 = r13.f24017b
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzaea r0 = (com.google.android.gms.internal.ads.zzaea) r0
            int r0 = r0.f24014a
            com.google.android.gms.internal.ads.zzaeg r14 = (com.google.android.gms.internal.ads.zzaeg) r14
            com.google.android.gms.internal.ads.zzaei r14 = r14.f24024a
            r14.mo41403f(r0)
            return r1
        L_0x0033:
            int r0 = r13.f24020e
            r2 = 2
            r3 = 4
            r4 = 0
            if (r0 != 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzaek r0 = r13.f24018c
            long r5 = r0.mo41410d(r14, r1, r4, r3)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            r14.mo48452h()
        L_0x0049:
            byte[] r0 = r13.f24016a
            r5 = r14
            com.google.android.gms.internal.ads.zzyy r5 = (com.google.android.gms.internal.ads.zzyy) r5
            r5.mo48454j(r0, r4, r3, r4)
            byte[] r0 = r13.f24016a
            byte r0 = r0[r4]
            int r0 = com.google.android.gms.internal.ads.zzaek.m41176b(r0)
            r6 = -1
            if (r0 == r6) goto L_0x0076
            if (r0 > r3) goto L_0x0076
            byte[] r6 = r13.f24016a
            long r6 = com.google.android.gms.internal.ads.zzaek.m41177c(r6, r0, r4)
            int r7 = (int) r6
            com.google.android.gms.internal.ads.zzaec r6 = r13.f24019d
            com.google.android.gms.internal.ads.zzaeg r6 = (com.google.android.gms.internal.ads.zzaeg) r6
            com.google.android.gms.internal.ads.zzaei r6 = r6.f24024a
            boolean r6 = com.google.android.gms.internal.ads.zzaei.m41152o(r7)
            if (r6 == 0) goto L_0x0076
            r5.mo48459p(r0, r4)
            long r5 = (long) r7
            goto L_0x007a
        L_0x0076:
            r5.mo48459p(r1, r4)
            goto L_0x0049
        L_0x007a:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            return r4
        L_0x0081:
            int r0 = (int) r5
            r13.f24021f = r0
            r13.f24020e = r1
            goto L_0x0089
        L_0x0087:
            if (r0 != r1) goto L_0x0095
        L_0x0089:
            com.google.android.gms.internal.ads.zzaek r0 = r13.f24018c
            r5 = 8
            long r5 = r0.mo41410d(r14, r4, r1, r5)
            r13.f24022g = r5
            r13.f24020e = r2
        L_0x0095:
            com.google.android.gms.internal.ads.zzaec r0 = r13.f24019d
            int r5 = r13.f24021f
            com.google.android.gms.internal.ads.zzaeg r0 = (com.google.android.gms.internal.ads.zzaeg) r0
            com.google.android.gms.internal.ads.zzaei r6 = r0.f24024a
            int r7 = com.google.android.gms.internal.ads.zzaei.m41151n(r5)
            if (r7 == 0) goto L_0x0183
            r8 = 0
            if (r7 == r1) goto L_0x0161
            r9 = 8
            if (r7 == r2) goto L_0x0138
            r2 = 3
            if (r7 == r2) goto L_0x00f5
            if (r7 == r3) goto L_0x00ec
            long r6 = r13.f24022g
            r11 = 4
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x00d2
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00bc
            goto L_0x00d2
        L_0x00bc:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid float size: "
            r14.append(r0)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbu r14 = com.google.android.gms.internal.ads.zzbu.m44135a(r14, r8)
            throw r14
        L_0x00d2:
            int r2 = (int) r6
            long r6 = r13.m41133c(r14, r2)
            if (r2 != r3) goto L_0x00e0
            int r14 = (int) r6
            float r14 = java.lang.Float.intBitsToFloat(r14)
            double r2 = (double) r14
            goto L_0x00e4
        L_0x00e0:
            double r2 = java.lang.Double.longBitsToDouble(r6)
        L_0x00e4:
            com.google.android.gms.internal.ads.zzaei r14 = r0.f24024a
            r14.mo41404i(r5, r2)
            r13.f24020e = r4
            return r1
        L_0x00ec:
            long r2 = r13.f24022g
            int r0 = (int) r2
            r6.mo41402e(r5, r0, r14)
            r13.f24020e = r4
            return r1
        L_0x00f5:
            long r2 = r13.f24022g
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x0122
            int r3 = (int) r2
            if (r3 != 0) goto L_0x0104
            java.lang.String r14 = ""
            goto L_0x011a
        L_0x0104:
            byte[] r2 = new byte[r3]
            com.google.android.gms.internal.ads.zzyy r14 = (com.google.android.gms.internal.ads.zzyy) r14
            r14.mo48453i(r2, r4, r3, r4)
        L_0x010b:
            if (r3 <= 0) goto L_0x0115
            int r14 = r3 + -1
            byte r6 = r2[r14]
            if (r6 != 0) goto L_0x0115
            r3 = r14
            goto L_0x010b
        L_0x0115:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r2, r4, r3)
        L_0x011a:
            com.google.android.gms.internal.ads.zzaei r0 = r0.f24024a
            r0.mo41407l(r5, r14)
            r13.f24020e = r4
            return r1
        L_0x0122:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "String element size: "
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbu r14 = com.google.android.gms.internal.ads.zzbu.m44135a(r14, r8)
            throw r14
        L_0x0138:
            long r2 = r13.f24022g
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x014b
            int r3 = (int) r2
            long r2 = r13.m41133c(r14, r3)
            com.google.android.gms.internal.ads.zzaei r14 = r0.f24024a
            r14.mo41405j(r5, r2)
            r13.f24020e = r4
            return r1
        L_0x014b:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid integer size: "
            r14.append(r0)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.google.android.gms.internal.ads.zzbu r14 = com.google.android.gms.internal.ads.zzbu.m44135a(r14, r8)
            throw r14
        L_0x0161:
            long r2 = r14.mo41252c()
            long r6 = r13.f24022g
            java.util.ArrayDeque r14 = r13.f24017b
            com.google.android.gms.internal.ads.zzaea r0 = new com.google.android.gms.internal.ads.zzaea
            long r6 = r6 + r2
            r0.<init>(r5, r6, r8)
            r14.push(r0)
            com.google.android.gms.internal.ads.zzaec r14 = r13.f24019d
            int r6 = r13.f24021f
            long r9 = r13.f24022g
            com.google.android.gms.internal.ads.zzaeg r14 = (com.google.android.gms.internal.ads.zzaeg) r14
            com.google.android.gms.internal.ads.zzaei r5 = r14.f24024a
            r7 = r2
            r5.mo41406k(r6, r7, r9)
            r13.f24020e = r4
            return r1
        L_0x0183:
            long r0 = r13.f24022g
            r2 = r14
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            int r1 = (int) r0
            r2.mo48459p(r1, r4)
            r13.f24020e = r4
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeb.mo41398a(com.google.android.gms.internal.ads.zzzj):boolean");
    }

    /* renamed from: b */
    public final void mo41399b(zzaec zzaec) {
        this.f24019d = zzaec;
    }

    public final void zzb() {
        this.f24020e = 0;
        this.f24017b.clear();
        this.f24018c.mo41411e();
    }
}

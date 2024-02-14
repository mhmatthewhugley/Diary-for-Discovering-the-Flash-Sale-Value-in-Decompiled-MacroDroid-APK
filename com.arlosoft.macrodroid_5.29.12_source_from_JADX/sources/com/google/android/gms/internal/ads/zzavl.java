package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzavl {

    /* renamed from: a */
    private final byte[] f25741a = new byte[8];

    /* renamed from: b */
    private final Stack f25742b = new Stack();

    /* renamed from: c */
    private final zzavt f25743c = new zzavt();

    /* renamed from: d */
    private int f25744d;

    /* renamed from: e */
    private int f25745e;

    /* renamed from: f */
    private long f25746f;

    /* renamed from: g */
    private zzavo f25747g;

    zzavl() {
    }

    /* renamed from: d */
    private final long m42593d(zzauy zzauy, int i) throws IOException, InterruptedException {
        zzauy.mo42100h(this.f25741a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f25741a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public final void mo42118a() {
        this.f25744d = 0;
        this.f25742b.clear();
        this.f25743c.mo42130d();
    }

    /* renamed from: b */
    public final void mo42119b(zzavo zzavo) {
        this.f25747g = zzavo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r0 == 1) goto L_0x008d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42120c(com.google.android.gms.internal.ads.zzauy r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzavo r0 = r12.f25747g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.zzbac.m42926e(r0)
        L_0x000c:
            java.util.Stack r0 = r12.f25742b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003d
            long r3 = r13.mo42096d()
            java.util.Stack r0 = r12.f25742b
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzavk r0 = (com.google.android.gms.internal.ads.zzavk) r0
            long r5 = r0.f25740b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            com.google.android.gms.internal.ads.zzavo r13 = r12.f25747g
            java.util.Stack r0 = r12.f25742b
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzavk r0 = (com.google.android.gms.internal.ads.zzavk) r0
            int r0 = r0.f25739a
            com.google.android.gms.internal.ads.zzavr r13 = r13.f25748a
            r13.mo42122c(r0)
            return r1
        L_0x003d:
            int r0 = r12.f25744d
            r3 = 2
            r4 = 4
            if (r0 != 0) goto L_0x008b
            com.google.android.gms.internal.ads.zzavt r0 = r12.f25743c
            long r5 = r0.mo42131e(r13, r1, r2, r4)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            r13.mo42097e()
        L_0x0052:
            byte[] r0 = r12.f25741a
            r13.mo42099g(r0, r2, r4, r2)
            byte[] r0 = r12.f25741a
            byte r0 = r0[r2]
            int r0 = com.google.android.gms.internal.ads.zzavt.m42624b(r0)
            r5 = -1
            if (r0 == r5) goto L_0x007a
            if (r0 > r4) goto L_0x007a
            byte[] r5 = r12.f25741a
            long r5 = com.google.android.gms.internal.ads.zzavt.m42625c(r5, r0, r2)
            int r6 = (int) r5
            com.google.android.gms.internal.ads.zzavo r5 = r12.f25747g
            com.google.android.gms.internal.ads.zzavr r5 = r5.f25748a
            boolean r5 = com.google.android.gms.internal.ads.zzavr.m42604m(r6)
            if (r5 == 0) goto L_0x007a
            r13.mo42101i(r0, r2)
            long r5 = (long) r6
            goto L_0x007e
        L_0x007a:
            r13.mo42101i(r1, r2)
            goto L_0x0052
        L_0x007e:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = (int) r5
            r12.f25745e = r0
            r12.f25744d = r1
            goto L_0x008d
        L_0x008b:
            if (r0 != r1) goto L_0x0099
        L_0x008d:
            com.google.android.gms.internal.ads.zzavt r0 = r12.f25743c
            r5 = 8
            long r5 = r0.mo42131e(r13, r2, r1, r5)
            r12.f25746f = r5
            r12.f25744d = r3
        L_0x0099:
            com.google.android.gms.internal.ads.zzavo r0 = r12.f25747g
            int r5 = r12.f25745e
            com.google.android.gms.internal.ads.zzavr r6 = r0.f25748a
            int r7 = com.google.android.gms.internal.ads.zzavr.m42603l(r5)
            if (r7 == 0) goto L_0x017b
            if (r7 == r1) goto L_0x0159
            r8 = 8
            if (r7 == r3) goto L_0x012f
            r3 = 3
            if (r7 == r3) goto L_0x00f7
            if (r7 == r4) goto L_0x00ee
            long r6 = r12.f25746f
            r10 = 4
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x00d4
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x00bd
            goto L_0x00d4
        L_0x00bd:
            com.google.android.gms.internal.ads.zzasz r13 = new com.google.android.gms.internal.ads.zzasz
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid float size: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x00d4:
            int r3 = (int) r6
            long r6 = r12.m42593d(r13, r3)
            if (r3 != r4) goto L_0x00e2
            int r13 = (int) r6
            float r13 = java.lang.Float.intBitsToFloat(r13)
            double r3 = (double) r13
            goto L_0x00e6
        L_0x00e2:
            double r3 = java.lang.Double.longBitsToDouble(r6)
        L_0x00e6:
            com.google.android.gms.internal.ads.zzavr r13 = r0.f25748a
            r13.mo42123g(r5, r3)
            r12.f25744d = r2
            return r1
        L_0x00ee:
            long r3 = r12.f25746f
            int r0 = (int) r3
            r6.mo42127k(r5, r0, r13)
            r12.f25744d = r2
            return r1
        L_0x00f7:
            long r3 = r12.f25746f
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0118
            int r4 = (int) r3
            if (r4 != 0) goto L_0x0106
            java.lang.String r13 = ""
            goto L_0x0110
        L_0x0106:
            byte[] r3 = new byte[r4]
            r13.mo42100h(r3, r2, r4, r2)
            java.lang.String r13 = new java.lang.String
            r13.<init>(r3)
        L_0x0110:
            com.google.android.gms.internal.ads.zzavr r0 = r0.f25748a
            r0.mo42126j(r5, r13)
            r12.f25744d = r2
            return r1
        L_0x0118:
            com.google.android.gms.internal.ads.zzasz r13 = new com.google.android.gms.internal.ads.zzasz
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "String element size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x012f:
            long r3 = r12.f25746f
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0142
            int r4 = (int) r3
            long r3 = r12.m42593d(r13, r4)
            com.google.android.gms.internal.ads.zzavr r13 = r0.f25748a
            r13.mo42124h(r5, r3)
            r12.f25744d = r2
            return r1
        L_0x0142:
            com.google.android.gms.internal.ads.zzasz r13 = new com.google.android.gms.internal.ads.zzasz
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid integer size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x0159:
            long r6 = r13.mo42096d()
            long r3 = r12.f25746f
            java.util.Stack r13 = r12.f25742b
            com.google.android.gms.internal.ads.zzavk r0 = new com.google.android.gms.internal.ads.zzavk
            long r3 = r3 + r6
            r8 = 0
            r0.<init>(r5, r3, r8)
            r13.add(r0)
            com.google.android.gms.internal.ads.zzavo r13 = r12.f25747g
            int r4 = r12.f25745e
            long r8 = r12.f25746f
            com.google.android.gms.internal.ads.zzavr r3 = r13.f25748a
            r5 = r6
            r7 = r8
            r3.mo42125i(r4, r5, r7)
            r12.f25744d = r2
            return r1
        L_0x017b:
            long r3 = r12.f25746f
            int r0 = (int) r3
            r13.mo42101i(r0, r2)
            r12.f25744d = r2
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavl.mo42120c(com.google.android.gms.internal.ads.zzauy):boolean");
    }
}

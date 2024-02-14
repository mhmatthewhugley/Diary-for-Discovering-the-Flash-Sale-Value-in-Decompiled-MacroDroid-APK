package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahp implements zzahc {
    @Nullable

    /* renamed from: a */
    private final String f24636a;

    /* renamed from: b */
    private final zzef f24637b;

    /* renamed from: c */
    private final zzee f24638c;

    /* renamed from: d */
    private zzaap f24639d;

    /* renamed from: e */
    private String f24640e;

    /* renamed from: f */
    private zzaf f24641f;

    /* renamed from: g */
    private int f24642g;

    /* renamed from: h */
    private int f24643h;

    /* renamed from: i */
    private int f24644i;

    /* renamed from: j */
    private int f24645j;

    /* renamed from: k */
    private long f24646k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f24647l;

    /* renamed from: m */
    private int f24648m;

    /* renamed from: n */
    private int f24649n;

    /* renamed from: o */
    private int f24650o;

    /* renamed from: p */
    private boolean f24651p;

    /* renamed from: q */
    private long f24652q;

    /* renamed from: r */
    private int f24653r;

    /* renamed from: s */
    private long f24654s;

    /* renamed from: t */
    private int f24655t;
    @Nullable

    /* renamed from: u */
    private String f24656u;

    public zzahp(@Nullable String str) {
        this.f24636a = str;
        zzef zzef = new zzef(1024);
        this.f24637b = zzef;
        byte[] h = zzef.mo45232h();
        this.f24638c = new zzee(h, h.length);
    }

    /* renamed from: f */
    private final int m41465f(zzee zzee) throws zzbu {
        int a = zzee.mo45196a();
        zzyf b = zzyg.m55424b(zzee, true);
        this.f24656u = b.f38960c;
        this.f24653r = b.f38958a;
        this.f24655t = b.f38959b;
        return a - zzee.mo45196a();
    }

    /* renamed from: g */
    private static long m41466g(zzee zzee) {
        return (long) zzee.mo45198c((zzee.mo45198c(2) + 1) * 8);
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24642g = 0;
        this.f24646k = -9223372036854775807L;
        this.f24647l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
        if (r14.f24647l == false) goto L_0x01b9;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41468c(com.google.android.gms.internal.ads.zzef r15) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzaap r0 = r14.f24639d
            com.google.android.gms.internal.ads.zzdd.m47208b(r0)
        L_0x0005:
            int r0 = r15.mo45233i()
            if (r0 <= 0) goto L_0x0218
            int r0 = r14.f24642g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x020e
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01f8
            r1 = 3
            r5 = 8
            if (r0 == r3) goto L_0x01ce
            int r0 = r15.mo45233i()
            int r3 = r14.f24644i
            int r6 = r14.f24643h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            com.google.android.gms.internal.ads.zzee r3 = r14.f24638c
            byte[] r3 = r3.f33777a
            int r6 = r14.f24643h
            r15.mo45226b(r3, r6, r0)
            int r3 = r14.f24643h
            int r3 = r3 + r0
            r14.f24643h = r3
            int r0 = r14.f24644i
            if (r3 != r0) goto L_0x0005
            com.google.android.gms.internal.ads.zzee r0 = r14.f24638c
            r0.mo45203h(r4)
            com.google.android.gms.internal.ads.zzee r0 = r14.f24638c
            boolean r3 = r0.mo45207l()
            r6 = 0
            if (r3 != 0) goto L_0x0152
            r14.f24647l = r2
            int r3 = r0.mo45198c(r2)
            if (r3 != r2) goto L_0x0056
            int r3 = r0.mo45198c(r2)
            r7 = 1
            goto L_0x0058
        L_0x0056:
            r7 = r3
            r3 = 0
        L_0x0058:
            r14.f24648m = r3
            if (r3 != 0) goto L_0x014d
            if (r7 != r2) goto L_0x0062
            m41466g(r0)
            r7 = 1
        L_0x0062:
            boolean r3 = r0.mo45207l()
            if (r3 == 0) goto L_0x0148
            r3 = 6
            int r8 = r0.mo45198c(r3)
            r14.f24649n = r8
            r8 = 4
            int r9 = r0.mo45198c(r8)
            int r10 = r0.mo45198c(r1)
            if (r9 != 0) goto L_0x0143
            if (r10 != 0) goto L_0x0143
            if (r7 != 0) goto L_0x00d8
            int r9 = r0.mo45197b()
            int r10 = r14.m41465f(r0)
            r0.mo45203h(r9)
            int r9 = r10 + 7
            int r9 = r9 / r5
            byte[] r9 = new byte[r9]
            r0.mo45201f(r9, r4, r10)
            com.google.android.gms.internal.ads.zzad r10 = new com.google.android.gms.internal.ads.zzad
            r10.<init>()
            java.lang.String r11 = r14.f24640e
            r10.mo41331h(r11)
            java.lang.String r11 = "audio/mp4a-latm"
            r10.mo41343s(r11)
            java.lang.String r11 = r14.f24656u
            r10.mo41328f0(r11)
            int r11 = r14.f24655t
            r10.mo41326e0(r11)
            int r11 = r14.f24653r
            r10.mo41344t(r11)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r10.mo41333i(r9)
            java.lang.String r9 = r14.f24636a
            r10.mo41335k(r9)
            com.google.android.gms.internal.ads.zzaf r9 = r10.mo41349y()
            com.google.android.gms.internal.ads.zzaf r10 = r14.f24641f
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L_0x00e5
            r14.f24641f = r9
            r10 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r12 = r9.f24227z
            long r12 = (long) r12
            long r10 = r10 / r12
            r14.f24654s = r10
            com.google.android.gms.internal.ads.zzaap r10 = r14.f24639d
            r10.mo41214d(r9)
            goto L_0x00e5
        L_0x00d8:
            long r9 = m41466g(r0)
            int r10 = (int) r9
            int r9 = r14.m41465f(r0)
            int r10 = r10 - r9
            r0.mo45205j(r10)
        L_0x00e5:
            int r9 = r0.mo45198c(r1)
            r14.f24650o = r9
            if (r9 == 0) goto L_0x0110
            if (r9 == r2) goto L_0x010a
            if (r9 == r1) goto L_0x0106
            if (r9 == r8) goto L_0x0106
            r1 = 5
            if (r9 == r1) goto L_0x0106
            if (r9 == r3) goto L_0x0102
            r1 = 7
            if (r9 != r1) goto L_0x00fc
            goto L_0x0102
        L_0x00fc:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x0102:
            r0.mo45205j(r2)
            goto L_0x0113
        L_0x0106:
            r0.mo45205j(r3)
            goto L_0x0113
        L_0x010a:
            r1 = 9
            r0.mo45205j(r1)
            goto L_0x0113
        L_0x0110:
            r0.mo45205j(r5)
        L_0x0113:
            boolean r1 = r0.mo45207l()
            r14.f24651p = r1
            r8 = 0
            r14.f24652q = r8
            if (r1 == 0) goto L_0x0139
            if (r7 == r2) goto L_0x0133
        L_0x0121:
            boolean r1 = r0.mo45207l()
            long r2 = r14.f24652q
            long r2 = r2 << r5
            int r7 = r0.mo45198c(r5)
            long r7 = (long) r7
            long r2 = r2 + r7
            r14.f24652q = r2
            if (r1 != 0) goto L_0x0121
            goto L_0x0139
        L_0x0133:
            long r1 = m41466g(r0)
            r14.f24652q = r1
        L_0x0139:
            boolean r1 = r0.mo45207l()
            if (r1 == 0) goto L_0x0157
            r0.mo45205j(r5)
            goto L_0x0157
        L_0x0143:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.m44135a(r6, r6)
            throw r15
        L_0x0148:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.m44135a(r6, r6)
            throw r15
        L_0x014d:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.m44135a(r6, r6)
            throw r15
        L_0x0152:
            boolean r1 = r14.f24647l
            if (r1 != 0) goto L_0x0157
            goto L_0x01b9
        L_0x0157:
            int r1 = r14.f24648m
            if (r1 != 0) goto L_0x01c9
            int r1 = r14.f24649n
            if (r1 != 0) goto L_0x01c4
            int r1 = r14.f24650o
            if (r1 != 0) goto L_0x01bf
            r1 = 0
        L_0x0164:
            int r2 = r0.mo45198c(r5)
            int r10 = r1 + r2
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x01bd
            int r1 = r0.mo45197b()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzef r2 = r14.f24637b
            int r1 = r1 >> 3
            r2.mo45230f(r1)
            goto L_0x018e
        L_0x017e:
            com.google.android.gms.internal.ads.zzef r1 = r14.f24637b
            byte[] r1 = r1.mo45232h()
            int r2 = r10 * 8
            r0.mo45201f(r1, r4, r2)
            com.google.android.gms.internal.ads.zzef r1 = r14.f24637b
            r1.mo45230f(r4)
        L_0x018e:
            com.google.android.gms.internal.ads.zzaap r1 = r14.f24639d
            com.google.android.gms.internal.ads.zzef r2 = r14.f24637b
            r1.mo41215e(r2, r10)
            long r7 = r14.f24646k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01af
            com.google.android.gms.internal.ads.zzaap r6 = r14.f24639d
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo41216f(r7, r9, r10, r11, r12)
            long r1 = r14.f24646k
            long r5 = r14.f24654s
            long r1 = r1 + r5
            r14.f24646k = r1
        L_0x01af:
            boolean r1 = r14.f24651p
            if (r1 == 0) goto L_0x01b9
            long r1 = r14.f24652q
            int r2 = (int) r1
            r0.mo45205j(r2)
        L_0x01b9:
            r14.f24642g = r4
            goto L_0x0005
        L_0x01bd:
            r1 = r10
            goto L_0x0164
        L_0x01bf:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.m44135a(r6, r6)
            throw r15
        L_0x01c4:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.m44135a(r6, r6)
            throw r15
        L_0x01c9:
            com.google.android.gms.internal.ads.zzbu r15 = com.google.android.gms.internal.ads.zzbu.m44135a(r6, r6)
            throw r15
        L_0x01ce:
            int r0 = r14.f24645j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r5
            int r2 = r15.mo45243s()
            r0 = r0 | r2
            r14.f24644i = r0
            com.google.android.gms.internal.ads.zzef r2 = r14.f24637b
            byte[] r3 = r2.mo45232h()
            int r3 = r3.length
            if (r0 <= r3) goto L_0x01f2
            r2.mo45227c(r0)
            com.google.android.gms.internal.ads.zzee r0 = r14.f24638c
            com.google.android.gms.internal.ads.zzef r2 = r14.f24637b
            byte[] r2 = r2.mo45232h()
            int r3 = r2.length
            r0.mo45202g(r2, r3)
        L_0x01f2:
            r14.f24643h = r4
            r14.f24642g = r1
            goto L_0x0005
        L_0x01f8:
            int r0 = r15.mo45243s()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0208
            r14.f24645j = r0
            r14.f24642g = r3
            goto L_0x0005
        L_0x0208:
            if (r0 == r1) goto L_0x0005
            r14.f24642g = r4
            goto L_0x0005
        L_0x020e:
            int r0 = r15.mo45243s()
            if (r0 != r1) goto L_0x0005
            r14.f24642g = r2
            goto L_0x0005
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahp.mo41468c(com.google.android.gms.internal.ads.zzef):void");
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24639d = zzzl.mo41256k(zzaio.mo41515a(), 1);
        this.f24640e = zzaio.mo41516b();
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24646k = j;
        }
    }
}

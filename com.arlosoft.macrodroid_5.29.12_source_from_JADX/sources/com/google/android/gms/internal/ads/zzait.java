package com.google.android.gms.internal.ads;

import com.android.p023dx.p026io.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzait implements zzaiu {

    /* renamed from: m */
    private static final int[] f24775m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    private static final int[] f24776n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, Opcodes.RSUB_INT, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    private final zzzl f24777a;

    /* renamed from: b */
    private final zzaap f24778b;

    /* renamed from: c */
    private final zzaix f24779c;

    /* renamed from: d */
    private final int f24780d;

    /* renamed from: e */
    private final byte[] f24781e;

    /* renamed from: f */
    private final zzef f24782f;

    /* renamed from: g */
    private final int f24783g;

    /* renamed from: h */
    private final zzaf f24784h;

    /* renamed from: i */
    private int f24785i;

    /* renamed from: j */
    private long f24786j;

    /* renamed from: k */
    private int f24787k;

    /* renamed from: l */
    private long f24788l;

    public zzait(zzzl zzzl, zzaap zzaap, zzaix zzaix) throws zzbu {
        this.f24777a = zzzl;
        this.f24778b = zzaap;
        this.f24779c = zzaix;
        int max = Math.max(1, zzaix.f24807c / 10);
        this.f24783g = max;
        zzef zzef = new zzef(zzaix.f24810f);
        zzef.mo45241q();
        int q = zzef.mo45241q();
        this.f24780d = q;
        int i = zzaix.f24806b;
        int i2 = (((zzaix.f24808d - (i * 4)) * 8) / (zzaix.f24809e * i)) + 1;
        if (q == i2) {
            int O = zzen.m49140O(max, q);
            this.f24781e = new byte[(zzaix.f24808d * O)];
            this.f24782f = new zzef(O * (q + q) * i);
            int i3 = ((zzaix.f24807c * zzaix.f24808d) * 8) / q;
            zzad zzad = new zzad();
            zzad.mo41343s("audio/raw");
            zzad.mo41324d0(i3);
            zzad.mo41339o(i3);
            zzad.mo41336l((max + max) * i);
            zzad.mo41326e0(zzaix.f24806b);
            zzad.mo41344t(zzaix.f24807c);
            zzad.mo41338n(2);
            this.f24784h = zzad.mo41349y();
            return;
        }
        throw zzbu.m44135a("Expected frames per block: " + i2 + "; got: " + q, (Throwable) null);
    }

    /* renamed from: a */
    private final int m41550a(int i) {
        int i2 = this.f24779c.f24806b;
        return i / (i2 + i2);
    }

    /* renamed from: b */
    private final int m41551b(int i) {
        return (i + i) * this.f24779c.f24806b;
    }

    /* renamed from: f */
    private final void m41552f(int i) {
        long j = this.f24786j;
        long g0 = zzen.m49165g0(this.f24788l, 1000000, (long) this.f24779c.f24807c);
        int b = m41551b(i);
        this.f24778b.mo41216f(j + g0, 1, b, this.f24787k - b, (zzaao) null);
        this.f24788l += (long) i;
        this.f24787k -= b;
    }

    /* renamed from: c */
    public final void mo41520c(long j) {
        this.f24785i = 0;
        this.f24786j = j;
        this.f24787k = 0;
        this.f24788l = 0;
    }

    /* renamed from: d */
    public final void mo41521d(int i, long j) {
        this.f24777a.mo41254h(new zzaja(this.f24779c, this.f24780d, (long) i, j));
        this.f24778b.mo41214d(this.f24784h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0044 A[EDGE_INSN: B:38:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* renamed from: e */
    public final boolean mo41522e(com.google.android.gms.internal.ads.zzzj r20, long r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r3 = r0.f24783g
            int r4 = r0.f24787k
            int r4 = r0.m41550a(r4)
            int r3 = r3 - r4
            int r4 = r0.f24780d
            int r3 = com.google.android.gms.internal.ads.zzen.m49140O(r3, r4)
            com.google.android.gms.internal.ads.zzaix r4 = r0.f24779c
            int r4 = r4.f24808d
            int r3 = r3 * r4
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
        L_0x001f:
            r6 = 1
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r6 != 0) goto L_0x0044
            int r7 = r0.f24785i
            if (r7 >= r3) goto L_0x0044
            int r7 = r3 - r7
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r1)
            byte[] r9 = r0.f24781e
            int r10 = r0.f24785i
            int r8 = (int) r7
            r7 = r20
            int r8 = r7.mo43927e(r9, r10, r8)
            r9 = -1
            if (r8 != r9) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            int r9 = r0.f24785i
            int r9 = r9 + r8
            r0.f24785i = r9
            goto L_0x0022
        L_0x0044:
            int r1 = r0.f24785i
            com.google.android.gms.internal.ads.zzaix r2 = r0.f24779c
            int r2 = r2.f24808d
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x0148
            byte[] r2 = r0.f24781e
            com.google.android.gms.internal.ads.zzef r3 = r0.f24782f
            r7 = 0
        L_0x0052:
            if (r7 >= r1) goto L_0x0113
            r8 = 0
        L_0x0055:
            com.google.android.gms.internal.ads.zzaix r9 = r0.f24779c
            int r10 = r9.f24806b
            if (r8 >= r10) goto L_0x010b
            byte[] r11 = r3.mo45232h()
            int r9 = r9.f24808d
            int r12 = r7 * r9
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r10 * 4
            int r13 = r13 + r12
            int r9 = r9 / r10
            int r9 = r9 + -4
            int r14 = r12 + 1
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r2[r12]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r14 = r14 | r15
            short r14 = (short) r14
            int r12 = r12 + 2
            byte r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = 88
            int r12 = java.lang.Math.min(r12, r15)
            int[] r16 = f24776n
            r16 = r16[r12]
            int r4 = r0.f24780d
            int r4 = r4 * r7
            int r4 = r4 * r10
            int r4 = r4 + r8
            int r4 = r4 + r4
            r15 = r14 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r11[r4] = r15
            int r15 = r4 + 1
            int r5 = r14 >> 8
            byte r5 = (byte) r5
            r11[r15] = r5
            r5 = 0
        L_0x009f:
            int r15 = r9 + r9
            if (r5 >= r15) goto L_0x0103
            int r15 = r5 / 8
            int r15 = r15 * r10
            int r15 = r15 * 4
            int r15 = r15 + r13
            int r18 = r5 / 2
            int r18 = r18 % 4
            int r15 = r15 + r18
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r18 = r5 % 2
            if (r18 != 0) goto L_0x00bb
            r15 = r15 & 15
            goto L_0x00bd
        L_0x00bb:
            int r15 = r15 >> 4
        L_0x00bd:
            r18 = r15 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r2
            int r2 = r18 >> 3
            r18 = r15 & 8
            if (r18 == 0) goto L_0x00d0
            int r2 = -r2
        L_0x00d0:
            int r14 = r14 + r2
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r21 = r9
            r9 = 32767(0x7fff, float:4.5916E-41)
            int r14 = com.google.android.gms.internal.ads.zzen.m49141P(r14, r2, r9)
            int r2 = r10 + r10
            int r4 = r4 + r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r4] = r2
            int r2 = r4 + 1
            int r9 = r14 >> 8
            byte r9 = (byte) r9
            r11[r2] = r9
            int[] r2 = f24775m
            r2 = r2[r15]
            int r12 = r12 + r2
            r2 = 88
            r9 = 0
            int r12 = com.google.android.gms.internal.ads.zzen.m49141P(r12, r9, r2)
            int[] r9 = f24776n
            r9 = r9[r12]
            int r5 = r5 + 1
            r2 = r16
            r16 = r9
            r9 = r21
            goto L_0x009f
        L_0x0103:
            r16 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0055
        L_0x010b:
            r16 = r2
            r17 = 1
            int r7 = r7 + 1
            goto L_0x0052
        L_0x0113:
            int r2 = r0.f24780d
            int r2 = r2 * r1
            int r2 = r0.m41551b(r2)
            r4 = 0
            r3.mo45230f(r4)
            r3.mo45229e(r2)
            int r2 = r0.f24785i
            com.google.android.gms.internal.ads.zzaix r3 = r0.f24779c
            int r3 = r3.f24808d
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.f24785i = r2
            com.google.android.gms.internal.ads.zzef r1 = r0.f24782f
            int r2 = r1.mo45236l()
            com.google.android.gms.internal.ads.zzaap r3 = r0.f24778b
            com.google.android.gms.internal.ads.zzaan.m40938b(r3, r1, r2)
            int r1 = r0.f24787k
            int r1 = r1 + r2
            r0.f24787k = r1
            int r1 = r0.m41550a(r1)
            int r2 = r0.f24783g
            if (r1 < r2) goto L_0x0148
            r0.m41552f(r2)
        L_0x0148:
            if (r6 == 0) goto L_0x0155
            int r1 = r0.f24787k
            int r1 = r0.m41550a(r1)
            if (r1 <= 0) goto L_0x0155
            r0.m41552f(r1)
        L_0x0155:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzait.mo41522e(com.google.android.gms.internal.ads.zzzj, long):boolean");
    }
}

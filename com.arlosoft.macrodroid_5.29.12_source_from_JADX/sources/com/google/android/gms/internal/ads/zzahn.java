package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahn implements zzahc {

    /* renamed from: a */
    private final zzaid f24616a;

    /* renamed from: b */
    private String f24617b;

    /* renamed from: c */
    private zzaap f24618c;

    /* renamed from: d */
    private zzahm f24619d;

    /* renamed from: e */
    private boolean f24620e;

    /* renamed from: f */
    private final boolean[] f24621f = new boolean[3];

    /* renamed from: g */
    private final zzahr f24622g = new zzahr(32, 128);

    /* renamed from: h */
    private final zzahr f24623h = new zzahr(33, 128);

    /* renamed from: i */
    private final zzahr f24624i = new zzahr(34, 128);

    /* renamed from: j */
    private final zzahr f24625j = new zzahr(39, 128);

    /* renamed from: k */
    private final zzahr f24626k = new zzahr(40, 128);

    /* renamed from: l */
    private long f24627l;

    /* renamed from: m */
    private long f24628m = -9223372036854775807L;

    /* renamed from: n */
    private final zzef f24629n = new zzef();

    public zzahn(zzaid zzaid) {
        this.f24616a = zzaid;
    }

    /* renamed from: f */
    private final void m41454f(byte[] bArr, int i, int i2) {
        this.f24619d.mo41488b(bArr, i, i2);
        if (!this.f24620e) {
            this.f24622g.mo41491a(bArr, i, i2);
            this.f24623h.mo41491a(bArr, i, i2);
            this.f24624i.mo41491a(bArr, i, i2);
        }
        this.f24625j.mo41491a(bArr, i, i2);
        this.f24626k.mo41491a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24627l = 0;
        this.f24628m = -9223372036854775807L;
        zzaaf.m40918e(this.f24621f);
        this.f24622g.mo41492b();
        this.f24623h.mo41492b();
        this.f24624i.mo41492b();
        this.f24625j.mo41492b();
        this.f24626k.mo41492b();
        zzahm zzahm = this.f24619d;
        if (zzahm != null) {
            zzahm.mo41489c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03c3  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41468c(com.google.android.gms.internal.ads.zzef r38) {
        /*
            r37 = this;
            r0 = r37
            com.google.android.gms.internal.ads.zzaap r1 = r0.f24618c
            com.google.android.gms.internal.ads.zzdd.m47208b(r1)
            int r1 = com.google.android.gms.internal.ads.zzen.f34500a
        L_0x0009:
            int r1 = r38.mo45233i()
            if (r1 <= 0) goto L_0x03dc
            int r1 = r38.mo45235k()
            int r2 = r38.mo45236l()
            byte[] r3 = r38.mo45232h()
            long r4 = r0.f24627l
            int r6 = r38.mo45233i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f24627l = r4
            com.google.android.gms.internal.ads.zzaap r4 = r0.f24618c
            int r5 = r38.mo45233i()
            r6 = r38
            r4.mo41215e(r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.f24621f
            int r4 = com.google.android.gms.internal.ads.zzaaf.m40914a(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x03d9
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r1
            if (r9 <= 0) goto L_0x0049
            r0.m41454f(r3, r1, r4)
        L_0x0049:
            int r12 = r2 - r4
            long r10 = r0.f24627l
            long r13 = (long) r12
            long r10 = r10 - r13
            if (r9 >= 0) goto L_0x0053
            int r4 = -r9
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            long r13 = r0.f24628m
            com.google.android.gms.internal.ads.zzahm r9 = r0.f24619d
            boolean r15 = r0.f24620e
            r9.mo41487a(r10, r12, r15)
            boolean r9 = r0.f24620e
            if (r9 != 0) goto L_0x0339
            com.google.android.gms.internal.ads.zzahr r9 = r0.f24622g
            r9.mo41494d(r4)
            com.google.android.gms.internal.ads.zzahr r9 = r0.f24623h
            r9.mo41494d(r4)
            com.google.android.gms.internal.ads.zzahr r9 = r0.f24624i
            r9.mo41494d(r4)
            com.google.android.gms.internal.ads.zzahr r9 = r0.f24622g
            boolean r16 = r9.mo41495e()
            if (r16 == 0) goto L_0x0339
            com.google.android.gms.internal.ads.zzahr r8 = r0.f24623h
            boolean r17 = r8.mo41495e()
            if (r17 == 0) goto L_0x0339
            com.google.android.gms.internal.ads.zzahr r15 = r0.f24624i
            boolean r18 = r15.mo41495e()
            if (r18 == 0) goto L_0x0339
            com.google.android.gms.internal.ads.zzaap r1 = r0.f24618c
            r19 = r5
            java.lang.String r5 = r0.f24617b
            int r6 = r9.f24673e
            r20 = r2
            int r2 = r8.f24673e
            int r2 = r2 + r6
            r21 = r3
            int r3 = r15.f24673e
            int r2 = r2 + r3
            byte[] r2 = new byte[r2]
            byte[] r3 = r9.f24672d
            r22 = r7
            r7 = 0
            java.lang.System.arraycopy(r3, r7, r2, r7, r6)
            byte[] r3 = r8.f24672d
            int r6 = r9.f24673e
            r18 = r12
            int r12 = r8.f24673e
            java.lang.System.arraycopy(r3, r7, r2, r6, r12)
            byte[] r3 = r15.f24672d
            int r6 = r9.f24673e
            int r9 = r8.f24673e
            int r6 = r6 + r9
            int r9 = r15.f24673e
            java.lang.System.arraycopy(r3, r7, r2, r6, r9)
            com.google.android.gms.internal.ads.zzaah r3 = new com.google.android.gms.internal.ads.zzaah
            byte[] r6 = r8.f24672d
            int r8 = r8.f24673e
            r3.<init>(r6, r7, r8)
            r6 = 44
            r3.mo41201e(r6)
            r6 = 3
            int r8 = r3.mo41197a(r6)
            r3.mo41200d()
            r9 = 2
            int r23 = r3.mo41197a(r9)
            boolean r24 = r3.mo41202f()
            r12 = 5
            int r25 = r3.mo41197a(r12)
            r12 = 0
            r26 = 0
        L_0x00e2:
            r15 = 32
            if (r12 >= r15) goto L_0x00f4
            boolean r15 = r3.mo41202f()
            if (r15 == 0) goto L_0x00f1
            r15 = 1
            int r27 = r15 << r12
            r26 = r26 | r27
        L_0x00f1:
            int r12 = r12 + 1
            goto L_0x00e2
        L_0x00f4:
            r12 = 6
            int[] r15 = new int[r12]
        L_0x00f7:
            r9 = 8
            if (r7 >= r12) goto L_0x0104
            int r9 = r3.mo41197a(r9)
            r15[r7] = r9
            int r7 = r7 + 1
            goto L_0x00f7
        L_0x0104:
            int r7 = r3.mo41197a(r9)
            r9 = 0
            r12 = 0
        L_0x010a:
            if (r9 >= r8) goto L_0x011f
            boolean r30 = r3.mo41202f()
            if (r30 == 0) goto L_0x0114
            int r12 = r12 + 89
        L_0x0114:
            boolean r30 = r3.mo41202f()
            if (r30 == 0) goto L_0x011c
            int r12 = r12 + 8
        L_0x011c:
            int r9 = r9 + 1
            goto L_0x010a
        L_0x011f:
            r3.mo41201e(r12)
            if (r8 <= 0) goto L_0x012a
            int r9 = 8 - r8
            int r9 = r9 + r9
            r3.mo41201e(r9)
        L_0x012a:
            r3.mo41199c()
            int r9 = r3.mo41199c()
            if (r9 != r6) goto L_0x0137
            r3.mo41200d()
            r9 = 3
        L_0x0137:
            int r12 = r3.mo41199c()
            int r30 = r3.mo41199c()
            boolean r31 = r3.mo41202f()
            if (r31 == 0) goto L_0x0179
            int r31 = r3.mo41199c()
            int r32 = r3.mo41199c()
            int r33 = r3.mo41199c()
            int r34 = r3.mo41199c()
            r6 = 1
            if (r9 == r6) goto L_0x0164
            r6 = 2
            if (r9 != r6) goto L_0x0160
            r35 = r10
            r6 = 2
            r9 = 2
            goto L_0x0167
        L_0x0160:
            r35 = r10
            r6 = 1
            goto L_0x0167
        L_0x0164:
            r35 = r10
            r6 = 2
        L_0x0167:
            r10 = 1
            if (r9 != r10) goto L_0x016c
            r9 = 2
            goto L_0x016d
        L_0x016c:
            r9 = 1
        L_0x016d:
            int r31 = r31 + r32
            int r6 = r6 * r31
            int r12 = r12 - r6
            int r33 = r33 + r34
            int r9 = r9 * r33
            int r30 = r30 - r9
            goto L_0x017b
        L_0x0179:
            r35 = r10
        L_0x017b:
            r3.mo41199c()
            r3.mo41199c()
            int r6 = r3.mo41199c()
            boolean r9 = r3.mo41202f()
            r10 = 1
            if (r10 == r9) goto L_0x018e
            r9 = r8
            goto L_0x018f
        L_0x018e:
            r9 = 0
        L_0x018f:
            if (r9 > r8) goto L_0x019d
            r3.mo41199c()
            r3.mo41199c()
            r3.mo41199c()
            int r9 = r9 + 1
            goto L_0x018f
        L_0x019d:
            r3.mo41199c()
            r3.mo41199c()
            r3.mo41199c()
            r3.mo41199c()
            r3.mo41199c()
            r3.mo41199c()
            boolean r8 = r3.mo41202f()
            r9 = 4
            if (r8 == 0) goto L_0x01fe
            boolean r8 = r3.mo41202f()
            if (r8 == 0) goto L_0x01fe
            r8 = 0
        L_0x01bd:
            if (r8 >= r9) goto L_0x01fe
            r10 = 0
        L_0x01c0:
            r11 = 6
            if (r10 >= r11) goto L_0x01f7
            boolean r29 = r3.mo41202f()
            if (r29 != 0) goto L_0x01d0
            r3.mo41199c()
            r33 = r13
        L_0x01ce:
            r9 = 3
            goto L_0x01ed
        L_0x01d0:
            r11 = 64
            int r31 = r8 + r8
            int r31 = r31 + 4
            r33 = r13
            r9 = 1
            int r13 = r9 << r31
            int r11 = java.lang.Math.min(r11, r13)
            if (r8 <= r9) goto L_0x01e4
            r3.mo41198b()
        L_0x01e4:
            r9 = 0
        L_0x01e5:
            if (r9 >= r11) goto L_0x01ce
            r3.mo41198b()
            int r9 = r9 + 1
            goto L_0x01e5
        L_0x01ed:
            if (r8 != r9) goto L_0x01f1
            r11 = 3
            goto L_0x01f2
        L_0x01f1:
            r11 = 1
        L_0x01f2:
            int r10 = r10 + r11
            r13 = r33
            r9 = 4
            goto L_0x01c0
        L_0x01f7:
            r33 = r13
            r9 = 3
            int r8 = r8 + 1
            r9 = 4
            goto L_0x01bd
        L_0x01fe:
            r33 = r13
            r8 = 2
            r3.mo41201e(r8)
            boolean r8 = r3.mo41202f()
            if (r8 == 0) goto L_0x0218
            r8 = 8
            r3.mo41201e(r8)
            r3.mo41199c()
            r3.mo41199c()
            r3.mo41200d()
        L_0x0218:
            int r8 = r3.mo41199c()
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x021f:
            if (r9 >= r8) goto L_0x026b
            if (r9 == 0) goto L_0x0227
            boolean r10 = r3.mo41202f()
        L_0x0227:
            if (r10 == 0) goto L_0x0241
            r3.mo41200d()
            r3.mo41199c()
            r13 = 0
        L_0x0230:
            if (r13 > r11) goto L_0x023e
            boolean r14 = r3.mo41202f()
            if (r14 == 0) goto L_0x023b
            r3.mo41200d()
        L_0x023b:
            int r13 = r13 + 1
            goto L_0x0230
        L_0x023e:
            r29 = r8
            goto L_0x0266
        L_0x0241:
            int r11 = r3.mo41199c()
            int r13 = r3.mo41199c()
            int r14 = r11 + r13
            r29 = r8
            r8 = 0
        L_0x024e:
            if (r8 >= r11) goto L_0x0259
            r3.mo41199c()
            r3.mo41200d()
            int r8 = r8 + 1
            goto L_0x024e
        L_0x0259:
            r8 = 0
        L_0x025a:
            if (r8 >= r13) goto L_0x0265
            r3.mo41199c()
            r3.mo41200d()
            int r8 = r8 + 1
            goto L_0x025a
        L_0x0265:
            r11 = r14
        L_0x0266:
            int r9 = r9 + 1
            r8 = r29
            goto L_0x021f
        L_0x026b:
            boolean r8 = r3.mo41202f()
            if (r8 == 0) goto L_0x0281
            r8 = 0
        L_0x0272:
            int r9 = r3.mo41199c()
            if (r8 >= r9) goto L_0x0281
            r9 = 5
            int r10 = r6 + 5
            r3.mo41201e(r10)
            int r8 = r8 + 1
            goto L_0x0272
        L_0x0281:
            r6 = 2
            r3.mo41201e(r6)
            boolean r6 = r3.mo41202f()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x0304
            boolean r6 = r3.mo41202f()
            if (r6 == 0) goto L_0x02cf
            r6 = 8
            int r6 = r3.mo41197a(r6)
            r9 = 255(0xff, float:3.57E-43)
            if (r6 != r9) goto L_0x02af
            r6 = 16
            int r9 = r3.mo41197a(r6)
            int r6 = r3.mo41197a(r6)
            if (r9 == 0) goto L_0x02cf
            if (r6 == 0) goto L_0x02cf
            float r8 = (float) r9
            float r6 = (float) r6
            float r8 = r8 / r6
            goto L_0x02cf
        L_0x02af:
            r9 = 17
            if (r6 >= r9) goto L_0x02b9
            float[] r8 = com.google.android.gms.internal.ads.zzaaf.f23726b
            r6 = r8[r6]
            r8 = r6
            goto L_0x02cf
        L_0x02b9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            java.lang.String r9 = "H265Reader"
            com.google.android.gms.internal.ads.zzdw.m48255e(r9, r6)
        L_0x02cf:
            boolean r6 = r3.mo41202f()
            if (r6 == 0) goto L_0x02d8
            r3.mo41200d()
        L_0x02d8:
            boolean r6 = r3.mo41202f()
            if (r6 == 0) goto L_0x02ed
            r6 = 4
            r3.mo41201e(r6)
            boolean r6 = r3.mo41202f()
            if (r6 == 0) goto L_0x02ed
            r6 = 24
            r3.mo41201e(r6)
        L_0x02ed:
            boolean r6 = r3.mo41202f()
            if (r6 == 0) goto L_0x02f9
            r3.mo41199c()
            r3.mo41199c()
        L_0x02f9:
            r3.mo41200d()
            boolean r3 = r3.mo41202f()
            if (r3 == 0) goto L_0x0304
            int r30 = r30 + r30
        L_0x0304:
            r3 = r30
            r27 = r15
            r28 = r7
            java.lang.String r6 = com.google.android.gms.internal.ads.zzdf.m47280b(r23, r24, r25, r26, r27, r28)
            com.google.android.gms.internal.ads.zzad r7 = new com.google.android.gms.internal.ads.zzad
            r7.<init>()
            r7.mo41331h(r5)
            java.lang.String r5 = "video/hevc"
            r7.mo41343s(r5)
            r7.mo41328f0(r6)
            r7.mo41348x(r12)
            r7.mo41327f(r3)
            r7.mo41340p(r8)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r7.mo41333i(r2)
            com.google.android.gms.internal.ads.zzaf r2 = r7.mo41349y()
            r1.mo41214d(r2)
            r1 = 1
            r0.f24620e = r1
            goto L_0x0347
        L_0x0339:
            r20 = r2
            r21 = r3
            r19 = r5
            r22 = r7
            r35 = r10
            r18 = r12
            r33 = r13
        L_0x0347:
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24625j
            boolean r1 = r1.mo41494d(r4)
            if (r1 == 0) goto L_0x0372
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24625j
            byte[] r2 = r1.f24672d
            int r1 = r1.f24673e
            int r1 = com.google.android.gms.internal.ads.zzaaf.m40915b(r2, r1)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24629n
            com.google.android.gms.internal.ads.zzahr r3 = r0.f24625j
            byte[] r3 = r3.f24672d
            r2.mo45228d(r3, r1)
            com.google.android.gms.internal.ads.zzef r1 = r0.f24629n
            r2 = 5
            r1.mo45231g(r2)
            com.google.android.gms.internal.ads.zzaid r1 = r0.f24616a
            com.google.android.gms.internal.ads.zzef r2 = r0.f24629n
            r5 = r33
            r1.mo41509a(r5, r2)
            goto L_0x0374
        L_0x0372:
            r5 = r33
        L_0x0374:
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24626k
            boolean r1 = r1.mo41494d(r4)
            if (r1 == 0) goto L_0x039c
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24626k
            byte[] r2 = r1.f24672d
            int r1 = r1.f24673e
            int r1 = com.google.android.gms.internal.ads.zzaaf.m40915b(r2, r1)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24629n
            com.google.android.gms.internal.ads.zzahr r3 = r0.f24626k
            byte[] r3 = r3.f24672d
            r2.mo45228d(r3, r1)
            com.google.android.gms.internal.ads.zzef r1 = r0.f24629n
            r2 = 5
            r1.mo45231g(r2)
            com.google.android.gms.internal.ads.zzaid r1 = r0.f24616a
            com.google.android.gms.internal.ads.zzef r2 = r0.f24629n
            r1.mo41509a(r5, r2)
        L_0x039c:
            long r14 = r0.f24628m
            com.google.android.gms.internal.ads.zzahm r9 = r0.f24619d
            boolean r1 = r0.f24620e
            r10 = r35
            r12 = r18
            r13 = r22
            r16 = r1
            r9.mo41490d(r10, r12, r13, r14, r16)
            boolean r1 = r0.f24620e
            if (r1 != 0) goto L_0x03c3
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24622g
            r2 = r22
            r1.mo41493c(r2)
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24623h
            r1.mo41493c(r2)
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24624i
            r1.mo41493c(r2)
            goto L_0x03c5
        L_0x03c3:
            r2 = r22
        L_0x03c5:
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24625j
            r1.mo41493c(r2)
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24626k
            r1.mo41493c(r2)
            r6 = r38
            r1 = r19
            r2 = r20
            r3 = r21
            goto L_0x0030
        L_0x03d9:
            r0.m41454f(r3, r1, r2)
        L_0x03dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahn.mo41468c(com.google.android.gms.internal.ads.zzef):void");
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24617b = zzaio.mo41516b();
        zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 2);
        this.f24618c = k;
        this.f24619d = new zzahm(k);
        this.f24616a.mo41510b(zzzl, zzaio);
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24628m = j;
        }
    }
}

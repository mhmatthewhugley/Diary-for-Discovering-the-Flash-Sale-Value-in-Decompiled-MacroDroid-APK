package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzagp extends zzagn {
    @Nullable

    /* renamed from: n */
    private zzago f24437n;

    /* renamed from: o */
    private int f24438o;

    /* renamed from: p */
    private boolean f24439p;
    @Nullable

    /* renamed from: q */
    private zzaau f24440q;
    @Nullable

    /* renamed from: r */
    private zzaas f24441r;

    zzagp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo41449a(zzef zzef) {
        int i;
        int i2 = 0;
        if ((zzef.mo45232h()[0] & 1) == 1) {
            return -1;
        }
        byte b = zzef.mo45232h()[0];
        zzago zzago = this.f24437n;
        zzdd.m47208b(zzago);
        if (!zzago.f24435d[(b >> 1) & (255 >>> (8 - zzago.f24436e))].f23758a) {
            i = zzago.f24432a.f23763e;
        } else {
            i = zzago.f24432a.f23764f;
        }
        if (this.f24439p) {
            i2 = (this.f24438o + i) / 4;
        }
        long j = (long) i2;
        if (zzef.mo45234j() < zzef.mo45236l() + 4) {
            byte[] copyOf = Arrays.copyOf(zzef.mo45232h(), zzef.mo45236l() + 4);
            zzef.mo45228d(copyOf, copyOf.length);
        } else {
            zzef.mo45229e(zzef.mo45236l() + 4);
        }
        byte[] h = zzef.mo45232h();
        h[zzef.mo45236l() - 4] = (byte) ((int) (j & 255));
        h[zzef.mo45236l() - 3] = (byte) ((int) ((j >>> 8) & 255));
        h[zzef.mo45236l() - 2] = (byte) ((int) ((j >>> 16) & 255));
        h[zzef.mo45236l() - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f24439p = true;
        this.f24438o = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41450b(boolean z) {
        super.mo41450b(z);
        if (z) {
            this.f24437n = null;
            this.f24440q = null;
            this.f24441r = null;
        }
        this.f24438o = 0;
        this.f24439p = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0401 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0403  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41451c(com.google.android.gms.internal.ads.zzef r26, long r27, com.google.android.gms.internal.ads.zzagk r29) throws java.io.IOException {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r29
            com.google.android.gms.internal.ads.zzago r3 = r0.f24437n
            r4 = 0
            if (r3 == 0) goto L_0x0011
            com.google.android.gms.internal.ads.zzaf r1 = r2.f24417a
            java.util.Objects.requireNonNull(r1)
            return r4
        L_0x0011:
            com.google.android.gms.internal.ads.zzaau r6 = r0.f24440q
            r5 = 4
            r11 = 1
            if (r6 != 0) goto L_0x0084
            com.google.android.gms.internal.ads.zzaav.m40956d(r11, r1, r4)
            int r13 = r26.mo45240p()
            int r14 = r26.mo45243s()
            int r15 = r26.mo45240p()
            int r6 = r26.mo45239o()
            if (r6 > 0) goto L_0x002f
            r16 = -1
            goto L_0x0031
        L_0x002f:
            r16 = r6
        L_0x0031:
            int r6 = r26.mo45239o()
            if (r6 > 0) goto L_0x003a
            r17 = -1
            goto L_0x003c
        L_0x003a:
            r17 = r6
        L_0x003c:
            int r6 = r26.mo45239o()
            if (r6 > 0) goto L_0x0045
            r18 = -1
            goto L_0x0047
        L_0x0045:
            r18 = r6
        L_0x0047:
            int r3 = r26.mo45243s()
            r6 = r3 & 15
            double r8 = (double) r6
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r11, r8)
            int r6 = (int) r8
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> r5
            double r8 = (double) r3
            double r8 = java.lang.Math.pow(r11, r8)
            int r3 = (int) r8
            int r5 = r26.mo45243s()
            byte[] r8 = r26.mo45232h()
            int r1 = r26.mo45236l()
            byte[] r22 = java.util.Arrays.copyOf(r8, r1)
            com.google.android.gms.internal.ads.zzaau r1 = new com.google.android.gms.internal.ads.zzaau
            r8 = 1
            r5 = r5 & r8
            if (r8 == r5) goto L_0x0077
            r21 = 0
            goto L_0x0079
        L_0x0077:
            r21 = 1
        L_0x0079:
            r12 = r1
            r19 = r6
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.f24440q = r1
            goto L_0x008f
        L_0x0084:
            com.google.android.gms.internal.ads.zzaas r8 = r0.f24441r
            if (r8 != 0) goto L_0x0092
            r9 = 1
            com.google.android.gms.internal.ads.zzaas r1 = com.google.android.gms.internal.ads.zzaav.m40955c(r1, r9, r9)
            r0.f24441r = r1
        L_0x008f:
            r7 = 0
            goto L_0x03fd
        L_0x0092:
            int r9 = r26.mo45236l()
            byte[] r9 = new byte[r9]
            byte[] r10 = r26.mo45232h()
            int r11 = r26.mo45236l()
            java.lang.System.arraycopy(r10, r4, r9, r4, r11)
            int r10 = r6.f23759a
            r11 = 5
            com.google.android.gms.internal.ads.zzaav.m40956d(r11, r1, r4)
            int r12 = r26.mo45243s()
            r13 = 1
            int r12 = r12 + r13
            com.google.android.gms.internal.ads.zzaar r13 = new com.google.android.gms.internal.ads.zzaar
            byte[] r14 = r26.mo45232h()
            r13.<init>(r14)
            int r1 = r26.mo45235k()
            r14 = 8
            int r1 = r1 * 8
            r13.mo41223c(r1)
            r1 = 0
        L_0x00c4:
            r15 = 24
            r3 = 16
            if (r1 >= r12) goto L_0x01df
            int r14 = r13.mo41222b(r15)
            r7 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r7) goto L_0x01c4
            int r3 = r13.mo41222b(r3)
            int r7 = r13.mo41222b(r15)
            long[] r14 = new long[r7]
            boolean r15 = r13.mo41224d()
            r18 = 0
            if (r15 != 0) goto L_0x0122
            boolean r15 = r13.mo41224d()
            r4 = 0
        L_0x00ea:
            if (r4 >= r7) goto L_0x011f
            if (r15 == 0) goto L_0x010a
            boolean r21 = r13.mo41224d()
            if (r21 == 0) goto L_0x0102
            int r21 = r13.mo41222b(r11)
            r22 = 1
            int r5 = r21 + 1
            r23 = r12
            long r11 = (long) r5
            r14[r4] = r11
            goto L_0x0108
        L_0x0102:
            r23 = r12
            r22 = 1
            r14[r4] = r18
        L_0x0108:
            r5 = 5
            goto L_0x0118
        L_0x010a:
            r23 = r12
            r5 = 5
            r22 = 1
            int r11 = r13.mo41222b(r5)
            int r11 = r11 + 1
            long r11 = (long) r11
            r14[r4] = r11
        L_0x0118:
            int r4 = r4 + 1
            r12 = r23
            r5 = 4
            r11 = 5
            goto L_0x00ea
        L_0x011f:
            r23 = r12
            goto L_0x015a
        L_0x0122:
            r23 = r12
            r5 = 5
            r22 = 1
            int r4 = r13.mo41222b(r5)
            int r4 = r4 + 1
            r5 = 0
        L_0x012e:
            if (r5 >= r7) goto L_0x015a
            int r11 = r7 - r5
            int r11 = com.google.android.gms.internal.ads.zzaav.m40953a(r11)
            int r11 = r13.mo41222b(r11)
            r12 = 0
        L_0x013b:
            if (r12 >= r11) goto L_0x014f
            if (r5 >= r7) goto L_0x014f
            r22 = r8
            r24 = r9
            long r8 = (long) r4
            r14[r5] = r8
            int r5 = r5 + 1
            int r12 = r12 + 1
            r8 = r22
            r9 = r24
            goto L_0x013b
        L_0x014f:
            r22 = r8
            r24 = r9
            int r4 = r4 + 1
            r8 = r22
            r9 = r24
            goto L_0x012e
        L_0x015a:
            r22 = r8
            r24 = r9
            r4 = 4
            int r5 = r13.mo41222b(r4)
            r8 = 2
            if (r5 > r8) goto L_0x01ad
            r9 = 1
            if (r5 == r9) goto L_0x016c
            if (r5 != r8) goto L_0x019e
            r5 = 2
        L_0x016c:
            r8 = 32
            r13.mo41223c(r8)
            r13.mo41223c(r8)
            int r8 = r13.mo41222b(r4)
            int r8 = r8 + r9
            r13.mo41223c(r9)
            if (r5 != r9) goto L_0x0193
            if (r3 == 0) goto L_0x0197
            long r4 = (long) r7
            double r4 = (double) r4
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r14 = (long) r3
            double r14 = (double) r14
            double r11 = r11 / r14
            double r3 = java.lang.Math.pow(r4, r11)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            r18 = r3
            goto L_0x0197
        L_0x0193:
            long r4 = (long) r7
            long r11 = (long) r3
            long r18 = r4 * r11
        L_0x0197:
            long r3 = (long) r8
            long r3 = r3 * r18
            int r4 = (int) r3
            r13.mo41223c(r4)
        L_0x019e:
            int r1 = r1 + 1
            r8 = r22
            r12 = r23
            r9 = r24
            r4 = 0
            r5 = 4
            r11 = 5
            r14 = 8
            goto L_0x00c4
        L_0x01ad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "lookup type greater than 2 not decodable: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x01c4:
            r2 = 0
            int r1 = r13.mo41221a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x01df:
            r22 = r8
            r24 = r9
            r1 = 6
            int r4 = r13.mo41222b(r1)
            r5 = 1
            int r4 = r4 + r5
            r5 = 0
        L_0x01eb:
            if (r5 >= r4) goto L_0x01fe
            int r7 = r13.mo41222b(r3)
            if (r7 != 0) goto L_0x01f6
            int r5 = r5 + 1
            goto L_0x01eb
        L_0x01f6:
            java.lang.String r1 = "placeholder of time domain transforms not zeroed out"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x01fe:
            int r4 = r13.mo41222b(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x0205:
            r8 = 3
            if (r7 >= r4) goto L_0x02bf
            int r9 = r13.mo41222b(r3)
            if (r9 == 0) goto L_0x0293
            if (r9 != r5) goto L_0x027c
            r5 = 5
            int r9 = r13.mo41222b(r5)
            int[] r5 = new int[r9]
            r11 = 0
            r12 = -1
        L_0x0219:
            if (r11 >= r9) goto L_0x022a
            r14 = 4
            int r15 = r13.mo41222b(r14)
            r5[r11] = r15
            if (r15 <= r12) goto L_0x0225
            r12 = r15
        L_0x0225:
            int r11 = r11 + 1
            r15 = 24
            goto L_0x0219
        L_0x022a:
            int r12 = r12 + 1
            int[] r11 = new int[r12]
            r14 = 0
        L_0x022f:
            if (r14 >= r12) goto L_0x025e
            int r15 = r13.mo41222b(r8)
            r19 = 1
            int r15 = r15 + 1
            r11[r14] = r15
            r15 = 2
            int r23 = r13.mo41222b(r15)
            if (r23 <= 0) goto L_0x0248
            r15 = 8
            r13.mo41223c(r15)
            goto L_0x024a
        L_0x0248:
            r15 = 8
        L_0x024a:
            r8 = 0
        L_0x024b:
            int r1 = r19 << r23
            if (r8 >= r1) goto L_0x0259
            r13.mo41223c(r15)
            int r8 = r8 + 1
            r15 = 8
            r19 = 1
            goto L_0x024b
        L_0x0259:
            int r14 = r14 + 1
            r1 = 6
            r8 = 3
            goto L_0x022f
        L_0x025e:
            r1 = 2
            r13.mo41223c(r1)
            r1 = 4
            int r8 = r13.mo41222b(r1)
            r1 = 0
            r12 = 0
            r14 = 0
        L_0x026a:
            if (r1 >= r9) goto L_0x02b7
            r15 = r5[r1]
            r15 = r11[r15]
            int r12 = r12 + r15
        L_0x0271:
            if (r14 >= r12) goto L_0x0279
            r13.mo41223c(r8)
            int r14 = r14 + 1
            goto L_0x0271
        L_0x0279:
            int r1 = r1 + 1
            goto L_0x026a
        L_0x027c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "floor type greater than 1 not decodable: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x0293:
            r1 = 8
            r13.mo41223c(r1)
            r13.mo41223c(r3)
            r13.mo41223c(r3)
            r5 = 6
            r13.mo41223c(r5)
            r13.mo41223c(r1)
            r5 = 4
            int r8 = r13.mo41222b(r5)
            r5 = 1
            int r8 = r8 + r5
            r5 = 0
        L_0x02ad:
            if (r5 >= r8) goto L_0x02b7
            r13.mo41223c(r1)
            int r5 = r5 + 1
            r1 = 8
            goto L_0x02ad
        L_0x02b7:
            int r7 = r7 + 1
            r1 = 6
            r5 = 1
            r15 = 24
            goto L_0x0205
        L_0x02bf:
            int r4 = r13.mo41222b(r1)
            r5 = 1
            int r4 = r4 + r5
            r7 = 0
        L_0x02c6:
            if (r7 >= r4) goto L_0x0332
            int r8 = r13.mo41222b(r3)
            r9 = 2
            if (r8 > r9) goto L_0x032a
            r8 = 24
            r13.mo41223c(r8)
            r13.mo41223c(r8)
            r13.mo41223c(r8)
            int r9 = r13.mo41222b(r1)
            int r9 = r9 + r5
            r1 = 8
            r13.mo41223c(r1)
            int[] r5 = new int[r9]
            r11 = 0
        L_0x02e7:
            if (r11 >= r9) goto L_0x0306
            r12 = 3
            int r14 = r13.mo41222b(r12)
            boolean r15 = r13.mo41224d()
            if (r15 == 0) goto L_0x02fa
            r15 = 5
            int r18 = r13.mo41222b(r15)
            goto L_0x02fd
        L_0x02fa:
            r15 = 5
            r18 = 0
        L_0x02fd:
            int r18 = r18 * 8
            int r18 = r18 + r14
            r5[r11] = r18
            int r11 = r11 + 1
            goto L_0x02e7
        L_0x0306:
            r12 = 3
            r15 = 5
            r11 = 0
        L_0x0309:
            if (r11 >= r9) goto L_0x0325
            r14 = 0
        L_0x030c:
            if (r14 >= r1) goto L_0x0320
            r18 = r5[r11]
            r19 = 1
            int r21 = r19 << r14
            r18 = r18 & r21
            if (r18 == 0) goto L_0x031b
            r13.mo41223c(r1)
        L_0x031b:
            int r14 = r14 + 1
            r1 = 8
            goto L_0x030c
        L_0x0320:
            int r11 = r11 + 1
            r1 = 8
            goto L_0x0309
        L_0x0325:
            int r7 = r7 + 1
            r1 = 6
            r5 = 1
            goto L_0x02c6
        L_0x032a:
            java.lang.String r1 = "residueType greater than 2 is not decodable"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x0332:
            int r4 = r13.mo41222b(r1)
            r1 = 1
            int r4 = r4 + r1
            r1 = 0
        L_0x0339:
            if (r1 >= r4) goto L_0x03be
            int r5 = r13.mo41222b(r3)
            if (r5 == 0) goto L_0x035a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "mapping type other than 0 not supported: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "VorbisUtil"
            com.google.android.gms.internal.ads.zzdw.m48252b(r7, r5)
            r5 = 2
            r9 = 4
            goto L_0x03b3
        L_0x035a:
            boolean r5 = r13.mo41224d()
            if (r5 == 0) goto L_0x0368
            r5 = 4
            int r7 = r13.mo41222b(r5)
            r5 = 1
            int r7 = r7 + r5
            goto L_0x036a
        L_0x0368:
            r5 = 1
            r7 = 1
        L_0x036a:
            boolean r8 = r13.mo41224d()
            if (r8 == 0) goto L_0x038d
            r8 = 8
            int r9 = r13.mo41222b(r8)
            int r9 = r9 + r5
            r5 = 0
        L_0x0378:
            if (r5 >= r9) goto L_0x038d
            int r8 = r10 + -1
            int r11 = com.google.android.gms.internal.ads.zzaav.m40953a(r8)
            r13.mo41223c(r11)
            int r8 = com.google.android.gms.internal.ads.zzaav.m40953a(r8)
            r13.mo41223c(r8)
            int r5 = r5 + 1
            goto L_0x0378
        L_0x038d:
            r5 = 2
            int r8 = r13.mo41222b(r5)
            if (r8 != 0) goto L_0x03b6
            r8 = 1
            if (r7 <= r8) goto L_0x03a1
            r8 = 0
        L_0x0398:
            if (r8 >= r10) goto L_0x03a1
            r9 = 4
            r13.mo41223c(r9)
            int r8 = r8 + 1
            goto L_0x0398
        L_0x03a1:
            r9 = 4
            r8 = 0
        L_0x03a3:
            if (r8 >= r7) goto L_0x03b3
            r11 = 8
            r13.mo41223c(r11)
            r13.mo41223c(r11)
            r13.mo41223c(r11)
            int r8 = r8 + 1
            goto L_0x03a3
        L_0x03b3:
            int r1 = r1 + 1
            goto L_0x0339
        L_0x03b6:
            java.lang.String r1 = "to reserved bits must be zero after mapping coupling steps"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x03be:
            r1 = 6
            int r1 = r13.mo41222b(r1)
            r4 = 1
            int r1 = r1 + r4
            com.google.android.gms.internal.ads.zzaat[] r9 = new com.google.android.gms.internal.ads.zzaat[r1]
            r4 = 0
        L_0x03c8:
            if (r4 >= r1) goto L_0x03e6
            boolean r5 = r13.mo41224d()
            int r7 = r13.mo41222b(r3)
            int r8 = r13.mo41222b(r3)
            r10 = 8
            int r11 = r13.mo41222b(r10)
            com.google.android.gms.internal.ads.zzaat r12 = new com.google.android.gms.internal.ads.zzaat
            r12.<init>(r5, r7, r8, r11)
            r9[r4] = r12
            int r4 = r4 + 1
            goto L_0x03c8
        L_0x03e6:
            boolean r3 = r13.mo41224d()
            if (r3 == 0) goto L_0x044c
            com.google.android.gms.internal.ads.zzago r3 = new com.google.android.gms.internal.ads.zzago
            r4 = -1
            int r1 = r1 + r4
            int r10 = com.google.android.gms.internal.ads.zzaav.m40953a(r1)
            r5 = r3
            r7 = r22
            r8 = r24
            r5.<init>(r6, r7, r8, r9, r10)
            r7 = r3
        L_0x03fd:
            r0.f24437n = r7
            if (r7 != 0) goto L_0x0403
            r1 = 1
            return r1
        L_0x0403:
            com.google.android.gms.internal.ads.zzaau r1 = r7.f24432a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = r1.f23765g
            r3.add(r4)
            byte[] r4 = r7.f24434c
            r3.add(r4)
            com.google.android.gms.internal.ads.zzaas r4 = r7.f24433b
            java.lang.String[] r4 = r4.f23757b
            com.google.android.gms.internal.ads.zzfvn r4 = com.google.android.gms.internal.ads.zzfvn.m51134u(r4)
            com.google.android.gms.internal.ads.zzbq r4 = com.google.android.gms.internal.ads.zzaav.m40954b(r4)
            com.google.android.gms.internal.ads.zzad r5 = new com.google.android.gms.internal.ads.zzad
            r5.<init>()
            java.lang.String r6 = "audio/vorbis"
            r5.mo41343s(r6)
            int r6 = r1.f23762d
            r5.mo41324d0(r6)
            int r6 = r1.f23761c
            r5.mo41339o(r6)
            int r6 = r1.f23759a
            r5.mo41326e0(r6)
            int r1 = r1.f23760b
            r5.mo41344t(r1)
            r5.mo41333i(r3)
            r5.mo41337m(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r5.mo41349y()
            r2.f24417a = r1
            r1 = 1
            return r1
        L_0x044c:
            java.lang.String r1 = "framing bit after modes not set as expected"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagp.mo41451c(com.google.android.gms.internal.ads.zzef, long, com.google.android.gms.internal.ads.zzagk):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo41464h(long j) {
        super.mo41464h(j);
        int i = 0;
        this.f24439p = j != 0;
        zzaau zzaau = this.f24440q;
        if (zzaau != null) {
            i = zzaau.f23763e;
        }
        this.f24438o = i;
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzafq implements zzzi, zzaal {

    /* renamed from: x */
    public static final zzzp f24307x = zzafn.f24300b;

    /* renamed from: a */
    private final zzef f24308a;

    /* renamed from: b */
    private final zzef f24309b;

    /* renamed from: c */
    private final zzef f24310c;

    /* renamed from: d */
    private final zzef f24311d;

    /* renamed from: e */
    private final ArrayDeque f24312e;

    /* renamed from: f */
    private final zzaft f24313f;

    /* renamed from: g */
    private final List f24314g;

    /* renamed from: h */
    private int f24315h;

    /* renamed from: i */
    private int f24316i;

    /* renamed from: j */
    private long f24317j;

    /* renamed from: k */
    private int f24318k;
    @Nullable

    /* renamed from: l */
    private zzef f24319l;

    /* renamed from: m */
    private int f24320m;

    /* renamed from: n */
    private int f24321n;

    /* renamed from: o */
    private int f24322o;

    /* renamed from: p */
    private int f24323p;

    /* renamed from: q */
    private zzzl f24324q;

    /* renamed from: r */
    private zzafp[] f24325r;

    /* renamed from: s */
    private long[][] f24326s;

    /* renamed from: t */
    private int f24327t;

    /* renamed from: u */
    private long f24328u;

    /* renamed from: v */
    private int f24329v;
    @Nullable

    /* renamed from: w */
    private zzadt f24330w;

    public zzafq() {
        this(0);
    }

    /* renamed from: i */
    private static int m41281i(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: j */
    private static int m41282j(zzafy zzafy, long j) {
        int a = zzafy.mo41443a(j);
        return a == -1 ? zzafy.mo41444b(j) : a;
    }

    /* renamed from: k */
    private static long m41283k(zzafy zzafy, long j, long j2) {
        int j3 = m41282j(zzafy, j);
        if (j3 == -1) {
            return j2;
        }
        return Math.min(zzafy.f24372c[j3], j2);
    }

    /* renamed from: l */
    private final void m41284l() {
        this.f24315h = 0;
        this.f24318k = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0185 A[LOOP:3: B:69:0x0182->B:71:0x0185, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ae  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m41285m(long r28) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r27 = this;
            r0 = r27
        L_0x0002:
            java.util.ArrayDeque r1 = r0.f24312e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0269
            java.util.ArrayDeque r1 = r0.f24312e
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzaev r1 = (com.google.android.gms.internal.ads.zzaev) r1
            long r3 = r1.f24176b
            int r1 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r1 != 0) goto L_0x0269
            java.util.ArrayDeque r1 = r0.f24312e
            java.lang.Object r1 = r1.pop()
            r3 = r1
            com.google.android.gms.internal.ads.zzaev r3 = (com.google.android.gms.internal.ads.zzaev) r3
            int r1 = r3.f24180a
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r4) goto L_0x0252
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.f24329v
            r12 = 1
            if (r4 != r12) goto L_0x0034
            r9 = 1
            goto L_0x0035
        L_0x0034:
            r9 = 0
        L_0x0035:
            com.google.android.gms.internal.ads.zzzx r13 = new com.google.android.gms.internal.ads.zzzx
            r13.<init>()
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            com.google.android.gms.internal.ads.zzaew r4 = r3.mo41416d(r4)
            if (r4 == 0) goto L_0x0058
            android.util.Pair r4 = com.google.android.gms.internal.ads.zzaff.m41238a(r4)
            java.lang.Object r5 = r4.first
            com.google.android.gms.internal.ads.zzbq r5 = (com.google.android.gms.internal.ads.zzbq) r5
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.zzbq r4 = (com.google.android.gms.internal.ads.zzbq) r4
            if (r5 == 0) goto L_0x0054
            r13.mo48472b(r5)
        L_0x0054:
            r15 = r4
            r16 = r5
            goto L_0x005b
        L_0x0058:
            r15 = 0
            r16 = 0
        L_0x005b:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            com.google.android.gms.internal.ads.zzaev r4 = r3.mo41415c(r4)
            if (r4 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.zzbq r4 = com.google.android.gms.internal.ads.zzaff.m41239b(r4)
            r10 = r4
            goto L_0x006b
        L_0x006a:
            r10 = 0
        L_0x006b:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 0
            com.google.android.gms.internal.ads.zzafo r17 = com.google.android.gms.internal.ads.zzafo.f24301a
            r4 = r13
            r14 = r10
            r10 = r17
            java.util.List r3 = com.google.android.gms.internal.ads.zzaff.m41240c(r3, r4, r5, r7, r8, r9, r10)
            int r4 = r3.size()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = r6
            r8 = 0
            r9 = -1
        L_0x0088:
            r18 = 0
            if (r8 >= r4) goto L_0x01c2
            java.lang.Object r20 = r3.get(r8)
            r10 = r20
            com.google.android.gms.internal.ads.zzafy r10 = (com.google.android.gms.internal.ads.zzafy) r10
            int r5 = r10.f24371b
            if (r5 != 0) goto L_0x00a1
            r22 = r3
            r24 = r4
            r0 = -1
            r3 = r1
            r1 = r6
            goto L_0x01b6
        L_0x00a1:
            com.google.android.gms.internal.ads.zzafv r5 = r10.f24370a
            r22 = r3
            long r2 = r5.f24341e
            int r23 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r23 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            long r2 = r10.f24377h
        L_0x00ae:
            long r11 = java.lang.Math.max(r11, r2)
            com.google.android.gms.internal.ads.zzafp r6 = new com.google.android.gms.internal.ads.zzafp
            com.google.android.gms.internal.ads.zzzl r7 = r0.f24324q
            r24 = r4
            int r4 = r5.f24338b
            com.google.android.gms.internal.ads.zzaap r4 = r7.mo41256k(r8, r4)
            r6.<init>(r5, r10, r4)
            com.google.android.gms.internal.ads.zzaf r4 = r5.f24342f
            java.lang.String r4 = r4.f24213l
            java.lang.String r7 = "audio/true-hd"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x00d2
            int r4 = r10.f24374e
            int r4 = r4 * 16
            goto L_0x00d6
        L_0x00d2:
            int r4 = r10.f24374e
            int r4 = r4 + 30
        L_0x00d6:
            com.google.android.gms.internal.ads.zzaf r7 = r5.f24342f
            com.google.android.gms.internal.ads.zzad r7 = r7.mo41422b()
            r7.mo41336l(r4)
            int r4 = r5.f24338b
            r25 = r11
            r11 = 2
            if (r4 != r11) goto L_0x00f9
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f9
            int r4 = r10.f24371b
            r10 = 1
            if (r4 <= r10) goto L_0x00f9
            float r4 = (float) r4
            float r2 = (float) r2
            r3 = 1232348160(0x49742400, float:1000000.0)
            float r2 = r2 / r3
            float r4 = r4 / r2
            r7.mo41325e(r4)
        L_0x00f9:
            int r2 = r5.f24338b
            int r3 = com.google.android.gms.internal.ads.zzafm.f24299b
            r3 = 1
            if (r2 != r3) goto L_0x0110
            boolean r2 = r13.mo48471a()
            if (r2 == 0) goto L_0x0110
            int r2 = r13.f39064a
            r7.mo41321c(r2)
            int r2 = r13.f39065b
            r7.mo41323d(r2)
        L_0x0110:
            int r2 = r5.f24338b
            r3 = 2
            com.google.android.gms.internal.ads.zzbq[] r4 = new com.google.android.gms.internal.ads.zzbq[r3]
            r3 = 0
            r4[r3] = r15
            java.util.List r10 = r0.f24314g
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0122
            r10 = 0
            goto L_0x0129
        L_0x0122:
            com.google.android.gms.internal.ads.zzbq r10 = new com.google.android.gms.internal.ads.zzbq
            java.util.List r11 = r0.f24314g
            r10.<init>((java.util.List) r11)
        L_0x0129:
            r11 = 1
            r4[r11] = r10
            com.google.android.gms.internal.ads.zzbq r12 = new com.google.android.gms.internal.ads.zzbq
            com.google.android.gms.internal.ads.zzbp[] r10 = new com.google.android.gms.internal.ads.zzbp[r3]
            r21 = r1
            r3 = r10
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12.<init>(r0, r3)
            if (r2 != r11) goto L_0x0147
            if (r16 == 0) goto L_0x0141
            r12 = r16
        L_0x0141:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0181
        L_0x0147:
            r0 = 2
            if (r2 != r0) goto L_0x0141
            if (r14 == 0) goto L_0x0141
            r0 = 0
        L_0x014d:
            int r1 = r14.mo42875a()
            if (r0 >= r1) goto L_0x0141
            com.google.android.gms.internal.ads.zzbp r1 = r14.mo42876b(r0)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzadq
            if (r2 == 0) goto L_0x0179
            com.google.android.gms.internal.ads.zzadq r1 = (com.google.android.gms.internal.ads.zzadq) r1
            java.lang.String r2 = r1.f24003a
            java.lang.String r3 = "com.android.capture.fps"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0179
            com.google.android.gms.internal.ads.zzbq r12 = new com.google.android.gms.internal.ads.zzbq
            r0 = 1
            com.google.android.gms.internal.ads.zzbp[] r2 = new com.google.android.gms.internal.ads.zzbp[r0]
            r0 = 0
            r2[r0] = r1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12.<init>(r0, r2)
            r1 = r0
            goto L_0x0181
        L_0x0179:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = r0 + 1
            goto L_0x014d
        L_0x0181:
            r0 = 0
        L_0x0182:
            r3 = 2
            if (r0 >= r3) goto L_0x018e
            r3 = r4[r0]
            com.google.android.gms.internal.ads.zzbq r12 = r12.mo42878d(r3)
            int r0 = r0 + 1
            goto L_0x0182
        L_0x018e:
            int r0 = r12.mo42875a()
            if (r0 <= 0) goto L_0x0197
            r7.mo41337m(r12)
        L_0x0197:
            com.google.android.gms.internal.ads.zzaap r0 = r6.f24304c
            com.google.android.gms.internal.ads.zzaf r3 = r7.mo41349y()
            r0.mo41214d(r3)
            int r0 = r5.f24338b
            r3 = 2
            if (r0 != r3) goto L_0x01ae
            r0 = -1
            if (r9 != r0) goto L_0x01af
            int r3 = r21.size()
            r9 = r3
            goto L_0x01af
        L_0x01ae:
            r0 = -1
        L_0x01af:
            r3 = r21
            r3.add(r6)
            r11 = r25
        L_0x01b6:
            int r8 = r8 + 1
            r0 = r27
            r6 = r1
            r1 = r3
            r3 = r22
            r4 = r24
            goto L_0x0088
        L_0x01c2:
            r4 = r0
            r3 = r1
            r0 = -1
            r4.f24327t = r9
            r4.f24328u = r11
            r1 = 0
            com.google.android.gms.internal.ads.zzafp[] r2 = new com.google.android.gms.internal.ads.zzafp[r1]
            java.lang.Object[] r1 = r3.toArray(r2)
            com.google.android.gms.internal.ads.zzafp[] r1 = (com.google.android.gms.internal.ads.zzafp[]) r1
            r4.f24325r = r1
            int r2 = r1.length
            long[][] r3 = new long[r2][]
            int[] r5 = new int[r2]
            long[] r6 = new long[r2]
            boolean[] r2 = new boolean[r2]
            r7 = 0
        L_0x01de:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x01fa
            r8 = r1[r7]
            com.google.android.gms.internal.ads.zzafy r8 = r8.f24303b
            int r8 = r8.f24371b
            long[] r8 = new long[r8]
            r3[r7] = r8
            r8 = r1[r7]
            com.google.android.gms.internal.ads.zzafy r8 = r8.f24303b
            long[] r8 = r8.f24375f
            r21 = 0
            r9 = r8[r21]
            r6[r7] = r9
            int r7 = r7 + 1
            goto L_0x01de
        L_0x01fa:
            r21 = 0
            r7 = 0
        L_0x01fd:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x023d
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r11 = -1
        L_0x0207:
            int r12 = r1.length
            if (r10 >= r12) goto L_0x0219
            boolean r12 = r2[r10]
            if (r12 != 0) goto L_0x0216
            r12 = r6[r10]
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 > 0) goto L_0x0216
            r11 = r10
            r8 = r12
        L_0x0216:
            int r10 = r10 + 1
            goto L_0x0207
        L_0x0219:
            r8 = r5[r11]
            r9 = r3[r11]
            r9[r8] = r18
            r10 = r1[r11]
            com.google.android.gms.internal.ads.zzafy r10 = r10.f24303b
            int[] r12 = r10.f24373d
            r12 = r12[r8]
            long r12 = (long) r12
            long r18 = r18 + r12
            r12 = 1
            int r8 = r8 + r12
            r5[r11] = r8
            int r9 = r9.length
            if (r8 >= r9) goto L_0x0238
            long[] r9 = r10.f24375f
            r8 = r9[r8]
            r6[r11] = r8
            goto L_0x01fd
        L_0x0238:
            r2[r11] = r12
            int r7 = r7 + 1
            goto L_0x01fd
        L_0x023d:
            r4.f24326s = r3
            com.google.android.gms.internal.ads.zzzl r0 = r4.f24324q
            r0.mo41255j0()
            com.google.android.gms.internal.ads.zzzl r0 = r4.f24324q
            r0.mo41254h(r4)
            java.util.ArrayDeque r0 = r4.f24312e
            r0.clear()
            r0 = 2
            r4.f24315h = r0
            goto L_0x0266
        L_0x0252:
            r4 = r0
            java.util.ArrayDeque r0 = r4.f24312e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0266
            java.util.ArrayDeque r0 = r4.f24312e
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzaev r0 = (com.google.android.gms.internal.ads.zzaev) r0
            r0.mo41417e(r3)
        L_0x0266:
            r0 = r4
            goto L_0x0002
        L_0x0269:
            r4 = r0
            int r0 = r4.f24315h
            r1 = 2
            if (r0 == r1) goto L_0x0272
            r27.m41284l()
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafq.m41285m(long):void");
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        return zzafu.m41296b(zzzj, false);
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f24328u;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        long j2;
        long j3;
        int b;
        zzafp[] zzafpArr = this.f24325r;
        if (zzafpArr.length == 0) {
            zzaam zzaam = zzaam.f23738c;
            return new zzaaj(zzaam, zzaam);
        }
        int i = this.f24327t;
        long j4 = -1;
        if (i != -1) {
            zzafy zzafy = zzafpArr[i].f24303b;
            int j5 = m41282j(zzafy, j);
            if (j5 == -1) {
                zzaam zzaam2 = zzaam.f23738c;
                return new zzaaj(zzaam2, zzaam2);
            }
            long j6 = zzafy.f24375f[j5];
            j2 = zzafy.f24372c[j5];
            if (j6 >= j || j5 >= zzafy.f24371b - 1 || (b = zzafy.mo41444b(j)) == -1 || b == j5) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzafy.f24375f[b];
                j4 = zzafy.f24372c[b];
            }
            j = j6;
        } else {
            j2 = LocationRequestCompat.PASSIVE_INTERVAL;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzafp[] zzafpArr2 = this.f24325r;
            if (i2 >= zzafpArr2.length) {
                break;
            }
            if (i2 != this.f24327t) {
                zzafy zzafy2 = zzafpArr2[i2].f24303b;
                long k = m41283k(zzafy2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = m41283k(zzafy2, j3, j4);
                }
                j2 = k;
            }
            i2++;
        }
        zzaam zzaam3 = new zzaam(j, j2);
        if (j3 == -9223372036854775807L) {
            return new zzaaj(zzaam3, zzaam3);
        }
        return new zzaaj(zzaam3, new zzaam(j3, j4));
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24324q = zzzl;
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return true;
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        this.f24312e.clear();
        this.f24318k = 0;
        this.f24320m = -1;
        this.f24321n = 0;
        this.f24322o = 0;
        this.f24323p = 0;
        if (j == 0) {
            m41284l();
            return;
        }
        for (zzafp zzafp : this.f24325r) {
            zzafy zzafy = zzafp.f24303b;
            int a = zzafy.mo41443a(j2);
            if (a == -1) {
                a = zzafy.mo41444b(j2);
            }
            zzafp.f24306e = a;
            zzaaq zzaaq = zzafp.f24305d;
            if (zzaaq != null) {
                zzaaq.mo41218b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:211:0x0085 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41230h(com.google.android.gms.internal.ads.zzzj r33, com.google.android.gms.internal.ads.zzaai r34) throws java.io.IOException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.f24315h
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0250
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01d0
            long r3 = r33.mo41252c()
            int r9 = r0.f24320m
            if (r9 != r8) goto L_0x00a3
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r16
            r22 = r18
            r25 = r22
            r9 = 0
            r20 = -1
            r21 = 1
            r24 = 1
            r27 = -1
        L_0x0034:
            com.google.android.gms.internal.ads.zzafp[] r5 = r0.f24325r
            int r15 = r5.length
            if (r9 >= r15) goto L_0x0088
            r5 = r5[r9]
            int r15 = r5.f24306e
            com.google.android.gms.internal.ads.zzafy r5 = r5.f24303b
            int r12 = r5.f24371b
            if (r15 != r12) goto L_0x0044
            goto L_0x0085
        L_0x0044:
            long[] r5 = r5.f24372c
            r28 = r5[r15]
            long[][] r5 = r0.f24326s
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzen.m49166h(r5)
            long[][] r5 = (long[][]) r5
            r5 = r5[r9]
            r30 = r5[r15]
            long r28 = r28 - r3
            int r5 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0061
            int r5 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r5 = 0
            goto L_0x0062
        L_0x0061:
            r5 = 1
        L_0x0062:
            if (r5 != 0) goto L_0x0068
            if (r24 != 0) goto L_0x0070
            r12 = 0
            goto L_0x006a
        L_0x0068:
            r12 = r24
        L_0x006a:
            if (r5 != r12) goto L_0x0079
            int r15 = (r28 > r22 ? 1 : (r28 == r22 ? 0 : -1))
            if (r15 >= 0) goto L_0x0079
        L_0x0070:
            r24 = r5
            r20 = r9
            r22 = r28
            r25 = r30
            goto L_0x007b
        L_0x0079:
            r24 = r12
        L_0x007b:
            int r12 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r12 >= 0) goto L_0x0085
            r21 = r5
            r27 = r9
            r18 = r30
        L_0x0085:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x0088:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x009b
            if (r21 == 0) goto L_0x009b
            r15 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r15
            int r5 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r9 = r27
            goto L_0x009d
        L_0x009b:
            r9 = r20
        L_0x009d:
            r0.f24320m = r9
            if (r9 != r8) goto L_0x00a3
            goto L_0x01cf
        L_0x00a3:
            com.google.android.gms.internal.ads.zzafp[] r5 = r0.f24325r
            r5 = r5[r9]
            com.google.android.gms.internal.ads.zzaap r9 = r5.f24304c
            int r12 = r5.f24306e
            com.google.android.gms.internal.ads.zzafy r15 = r5.f24303b
            long[] r8 = r15.f24372c
            r10 = r8[r12]
            int[] r8 = r15.f24373d
            r8 = r8[r12]
            com.google.android.gms.internal.ads.zzaaq r15 = r5.f24305d
            long r3 = r10 - r3
            int r13 = r0.f24321n
            long r13 = (long) r13
            long r3 = r3 + r13
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x01cc
            r6 = 262144(0x40000, double:1.295163E-318)
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x00ca
            goto L_0x01cc
        L_0x00ca:
            com.google.android.gms.internal.ads.zzafv r2 = r5.f24302a
            int r2 = r2.f24343g
            r6 = 1
            if (r2 != r6) goto L_0x00d6
            r6 = 8
            long r3 = r3 + r6
            int r8 = r8 + -8
        L_0x00d6:
            int r2 = (int) r3
            r1.mo48460q0(r2)
            com.google.android.gms.internal.ads.zzafv r2 = r5.f24302a
            int r3 = r2.f24346j
            if (r3 == 0) goto L_0x0140
            com.google.android.gms.internal.ads.zzef r2 = r0.f24309b
            byte[] r2 = r2.mo45232h()
            r4 = 0
            r2[r4] = r4
            r6 = 1
            r2[r6] = r4
            r6 = 2
            r2[r6] = r4
            int r4 = 4 - r3
        L_0x00f1:
            int r6 = r0.f24322o
            if (r6 >= r8) goto L_0x0183
            int r6 = r0.f24323p
            if (r6 != 0) goto L_0x012b
            r1.mo48456m(r2, r4, r3)
            int r6 = r0.f24321n
            int r6 = r6 + r3
            r0.f24321n = r6
            com.google.android.gms.internal.ads.zzef r6 = r0.f24309b
            r7 = 0
            r6.mo45230f(r7)
            com.google.android.gms.internal.ads.zzef r6 = r0.f24309b
            int r6 = r6.mo45237m()
            if (r6 < 0) goto L_0x0123
            r0.f24323p = r6
            com.google.android.gms.internal.ads.zzef r6 = r0.f24308a
            r6.mo45230f(r7)
            com.google.android.gms.internal.ads.zzef r6 = r0.f24308a
            r10 = 4
            r9.mo41215e(r6, r10)
            int r6 = r0.f24322o
            int r6 = r6 + r10
            r0.f24322o = r6
            int r8 = r8 + r4
            goto L_0x00f1
        L_0x0123:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x012b:
            r7 = 0
            int r6 = r9.mo41211a(r1, r6, r7)
            int r7 = r0.f24321n
            int r7 = r7 + r6
            r0.f24321n = r7
            int r7 = r0.f24322o
            int r7 = r7 + r6
            r0.f24322o = r7
            int r7 = r0.f24323p
            int r7 = r7 - r6
            r0.f24323p = r7
            goto L_0x00f1
        L_0x0140:
            com.google.android.gms.internal.ads.zzaf r2 = r2.f24342f
            java.lang.String r2 = r2.f24213l
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0163
            int r2 = r0.f24322o
            if (r2 != 0) goto L_0x0160
            com.google.android.gms.internal.ads.zzef r2 = r0.f24310c
            com.google.android.gms.internal.ads.zzym.m55434b(r8, r2)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24310c
            r3 = 7
            r9.mo41215e(r2, r3)
            int r2 = r0.f24322o
            int r2 = r2 + r3
            r0.f24322o = r2
        L_0x0160:
            int r8 = r8 + 7
            goto L_0x0168
        L_0x0163:
            if (r15 == 0) goto L_0x0168
            r15.mo41220d(r1)
        L_0x0168:
            int r2 = r0.f24322o
            if (r2 >= r8) goto L_0x0183
            int r2 = r8 - r2
            r3 = 0
            int r2 = r9.mo41211a(r1, r2, r3)
            int r3 = r0.f24321n
            int r3 = r3 + r2
            r0.f24321n = r3
            int r3 = r0.f24322o
            int r3 = r3 + r2
            r0.f24322o = r3
            int r3 = r0.f24323p
            int r3 = r3 - r2
            r0.f24323p = r3
            goto L_0x0168
        L_0x0183:
            com.google.android.gms.internal.ads.zzafy r1 = r5.f24303b
            long[] r2 = r1.f24375f
            r3 = r2[r12]
            int[] r1 = r1.f24376g
            r1 = r1[r12]
            if (r15 == 0) goto L_0x01ac
            r21 = 0
            r22 = 0
            r2 = r15
            r16 = r9
            r17 = r3
            r19 = r1
            r20 = r8
            r15.mo41219c(r16, r17, r19, r20, r21, r22)
            r1 = 1
            int r12 = r12 + r1
            com.google.android.gms.internal.ads.zzafy r1 = r5.f24303b
            int r1 = r1.f24371b
            if (r12 != r1) goto L_0x01ba
            r1 = 0
            r2.mo41217a(r9, r1)
            goto L_0x01ba
        L_0x01ac:
            r20 = 0
            r21 = 0
            r15 = r9
            r16 = r3
            r18 = r1
            r19 = r8
            r15.mo41216f(r16, r18, r19, r20, r21)
        L_0x01ba:
            int r1 = r5.f24306e
            r2 = 1
            int r1 = r1 + r2
            r5.f24306e = r1
            r1 = -1
            r0.f24320m = r1
            r1 = 0
            r0.f24321n = r1
            r0.f24322o = r1
            r0.f24323p = r1
            r8 = 0
            goto L_0x01cf
        L_0x01cc:
            r2.f23733a = r10
            r8 = 1
        L_0x01cf:
            return r8
        L_0x01d0:
            long r5 = r0.f24317j
            int r3 = r0.f24318k
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r33.mo41252c()
            long r7 = r7 + r5
            com.google.android.gms.internal.ads.zzef r3 = r0.f24319l
            if (r3 == 0) goto L_0x022f
            byte[] r10 = r3.mo45232h()
            int r11 = r0.f24318k
            int r6 = (int) r5
            r1.mo48456m(r10, r11, r6)
            int r5 = r0.f24316i
            if (r5 != r4) goto L_0x0214
            r3.mo45230f(r9)
            int r4 = r3.mo45237m()
            int r4 = m41281i(r4)
            if (r4 == 0) goto L_0x01fb
            goto L_0x0211
        L_0x01fb:
            r4 = 4
            r3.mo45231g(r4)
        L_0x01ff:
            int r4 = r3.mo45233i()
            if (r4 <= 0) goto L_0x0210
            int r4 = r3.mo45237m()
            int r4 = m41281i(r4)
            if (r4 == 0) goto L_0x01ff
            goto L_0x0211
        L_0x0210:
            r4 = 0
        L_0x0211:
            r0.f24329v = r4
            goto L_0x023a
        L_0x0214:
            java.util.ArrayDeque r4 = r0.f24312e
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x023a
            java.util.ArrayDeque r4 = r0.f24312e
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.internal.ads.zzaev r4 = (com.google.android.gms.internal.ads.zzaev) r4
            com.google.android.gms.internal.ads.zzaew r5 = new com.google.android.gms.internal.ads.zzaew
            int r6 = r0.f24316i
            r5.<init>(r6, r3)
            r4.mo41418f(r5)
            goto L_0x023a
        L_0x022f:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x023c
            int r3 = (int) r5
            r1.mo48460q0(r3)
        L_0x023a:
            r11 = 0
            goto L_0x0244
        L_0x023c:
            long r3 = r33.mo41252c()
            long r3 = r3 + r5
            r2.f23733a = r3
            r11 = 1
        L_0x0244:
            r0.m41285m(r7)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.f24315h
            r4 = 2
            if (r3 == r4) goto L_0x0006
            r3 = 1
            return r3
        L_0x0250:
            r3 = 1
            int r5 = r0.f24318k
            if (r5 != 0) goto L_0x027b
            com.google.android.gms.internal.ads.zzef r5 = r0.f24311d
            byte[] r5 = r5.mo45232h()
            r8 = 0
            boolean r5 = r1.mo48453i(r5, r8, r9, r3)
            if (r5 != 0) goto L_0x0264
            r3 = -1
            return r3
        L_0x0264:
            r0.f24318k = r9
            com.google.android.gms.internal.ads.zzef r3 = r0.f24311d
            r3.mo45230f(r8)
            com.google.android.gms.internal.ads.zzef r3 = r0.f24311d
            long r10 = r3.mo45217A()
            r0.f24317j = r10
            com.google.android.gms.internal.ads.zzef r3 = r0.f24311d
            int r3 = r3.mo45237m()
            r0.f24316i = r3
        L_0x027b:
            long r10 = r0.f24317j
            r12 = 1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x029a
            com.google.android.gms.internal.ads.zzef r3 = r0.f24311d
            byte[] r3 = r3.mo45232h()
            r1.mo48456m(r3, r9, r9)
            int r3 = r0.f24318k
            int r3 = r3 + r9
            r0.f24318k = r3
            com.google.android.gms.internal.ads.zzef r3 = r0.f24311d
            long r5 = r3.mo45218B()
            r0.f24317j = r5
            goto L_0x02c5
        L_0x029a:
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02c5
            long r5 = r33.mo41253d()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x02b6
            java.util.ArrayDeque r3 = r0.f24312e
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzaev r3 = (com.google.android.gms.internal.ads.zzaev) r3
            if (r3 == 0) goto L_0x02b5
            long r5 = r3.f24176b
            goto L_0x02b6
        L_0x02b5:
            r5 = r7
        L_0x02b6:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x02c5
            long r7 = r33.mo41252c()
            long r5 = r5 - r7
            int r3 = r0.f24318k
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.f24317j = r5
        L_0x02c5:
            long r5 = r0.f24317j
            int r3 = r0.f24318k
            long r7 = (long) r3
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x0402
            int r5 = r0.f24316i
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x03b0
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x03b0
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x03b0
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x03b0
            if (r5 != r7) goto L_0x02f5
            goto L_0x03b0
        L_0x02f5:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x037c
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x037c
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x037c
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x037c
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x037c
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x037c
            if (r5 == r4) goto L_0x037c
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x037c
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x037c
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x034d
            goto L_0x037c
        L_0x034d:
            long r3 = r33.mo41252c()
            int r5 = r0.f24318k
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.f24316i
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0374
            com.google.android.gms.internal.ads.zzadt r3 = new com.google.android.gms.internal.ads.zzadt
            r8 = 0
            long r14 = r10 + r5
            long r12 = r0.f24317j
            long r4 = r12 - r5
            r7 = r3
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r4
            r7.<init>(r8, r10, r12, r14, r16)
            r0.f24330w = r3
        L_0x0374:
            r3 = 0
            r0.f24319l = r3
            r3 = 1
            r0.f24315h = r3
            goto L_0x0006
        L_0x037c:
            if (r3 != r9) goto L_0x0380
            r3 = 1
            goto L_0x0381
        L_0x0380:
            r3 = 0
        L_0x0381:
            com.google.android.gms.internal.ads.zzdd.m47212f(r3)
            long r3 = r0.f24317j
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x038f
            r3 = 1
            goto L_0x0390
        L_0x038f:
            r3 = 0
        L_0x0390:
            com.google.android.gms.internal.ads.zzdd.m47212f(r3)
            com.google.android.gms.internal.ads.zzef r3 = new com.google.android.gms.internal.ads.zzef
            long r4 = r0.f24317j
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.android.gms.internal.ads.zzef r4 = r0.f24311d
            byte[] r4 = r4.mo45232h()
            byte[] r5 = r3.mo45232h()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
            r0.f24319l = r3
            r3 = 1
            r0.f24315h = r3
            goto L_0x0006
        L_0x03b0:
            long r3 = r33.mo41252c()
            long r5 = r0.f24317j
            int r8 = r0.f24318k
            long r10 = (long) r8
            long r3 = r3 + r5
            long r3 = r3 - r10
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x03e3
            int r5 = r0.f24316i
            if (r5 != r7) goto L_0x03e3
            com.google.android.gms.internal.ads.zzef r5 = r0.f24310c
            r5.mo45227c(r9)
            com.google.android.gms.internal.ads.zzef r5 = r0.f24310c
            byte[] r5 = r5.mo45232h()
            r6 = 0
            r1.mo48457n(r5, r6, r9)
            com.google.android.gms.internal.ads.zzef r5 = r0.f24310c
            com.google.android.gms.internal.ads.zzaff.m41241d(r5)
            com.google.android.gms.internal.ads.zzef r5 = r0.f24310c
            int r5 = r5.mo45235k()
            r1.mo48460q0(r5)
            r33.mo48452h()
        L_0x03e3:
            java.util.ArrayDeque r5 = r0.f24312e
            com.google.android.gms.internal.ads.zzaev r6 = new com.google.android.gms.internal.ads.zzaev
            int r7 = r0.f24316i
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f24317j
            int r7 = r0.f24318k
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03fd
            r0.m41285m(r3)
            goto L_0x0006
        L_0x03fd:
            r32.m41284l()
            goto L_0x0006
        L_0x0402:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44137c(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafq.mo41230h(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }

    public zzafq(int i) {
        this.f24315h = 0;
        this.f24313f = new zzaft();
        this.f24314g = new ArrayList();
        this.f24311d = new zzef(16);
        this.f24312e = new ArrayDeque();
        this.f24308a = new zzef(zzaaf.f23725a);
        this.f24309b = new zzef(4);
        this.f24310c = new zzef();
        this.f24320m = -1;
        this.f24324q = zzzl.f39041e;
        this.f24325r = new zzafp[0];
    }
}

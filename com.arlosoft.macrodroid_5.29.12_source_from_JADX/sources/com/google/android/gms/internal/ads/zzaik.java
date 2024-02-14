package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaik implements zzzi {

    /* renamed from: q */
    public static final zzzp f24744q = zzaih.f24736b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List f24745a;

    /* renamed from: b */
    private final zzef f24746b;

    /* renamed from: c */
    private final SparseIntArray f24747c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzain f24748d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SparseArray f24749e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SparseBooleanArray f24750f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseBooleanArray f24751g;

    /* renamed from: h */
    private final zzaig f24752h;

    /* renamed from: i */
    private zzaif f24753i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public zzzl f24754j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f24755k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f24756l;

    /* renamed from: m */
    private boolean f24757m;

    /* renamed from: n */
    private boolean f24758n;

    /* renamed from: o */
    private int f24759o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f24760p;

    public zzaik() {
        this(0);
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        byte[] h = this.f24746b.mo45232h();
        zzyy zzyy = (zzyy) zzzj;
        zzyy.mo48454j(h, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (h[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            zzyy.mo48459p(i, false);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24754j = zzzl;
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        zzaif zzaif;
        int size = this.f24745a.size();
        for (int i = 0; i < size; i++) {
            zzel zzel = (zzel) this.f24745a.get(i);
            if (zzel.mo45360e() != -9223372036854775807L) {
                long c = zzel.mo45358c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            zzel.mo45361f(j2);
        }
        if (!(j2 == 0 || (zzaif = this.f24753i) == null)) {
            zzaif.mo48447d(j2);
        }
        this.f24746b.mo45227c(0);
        this.f24747c.clear();
        for (int i2 = 0; i2 < this.f24749e.size(); i2++) {
            ((zzaip) this.f24749e.valueAt(i2)).mo41498a();
        }
        this.f24759o = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0194, code lost:
        if (r1 == false) goto L_0x0196;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41230h(com.google.android.gms.internal.ads.zzzj r19, com.google.android.gms.internal.ads.zzaai r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            long r11 = r19.mo41253d()
            boolean r3 = r0.f24756l
            r13 = -1
            r15 = 1
            r10 = 0
            if (r3 == 0) goto L_0x009e
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzaig r3 = r0.f24752h
            boolean r4 = r3.mo41514d()
            if (r4 == 0) goto L_0x001f
            goto L_0x0026
        L_0x001f:
            int r4 = r0.f24760p
            int r1 = r3.mo41511a(r1, r2, r4)
            return r1
        L_0x0026:
            boolean r3 = r0.f24757m
            r7 = 0
            if (r3 != 0) goto L_0x0075
            r0.f24757m = r15
            com.google.android.gms.internal.ads.zzaig r3 = r0.f24752h
            long r4 = r3.mo41512b()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzaif r9 = new com.google.android.gms.internal.ads.zzaif
            com.google.android.gms.internal.ads.zzel r4 = r3.mo41513c()
            long r5 = r3.mo41512b()
            int r3 = r0.f24760p
            r16 = 112800(0x1b8a0, float:1.58066E-40)
            r17 = r3
            r3 = r9
            r13 = r7
            r7 = r11
            r15 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r7, r9, r10)
            r0.f24753i = r15
            com.google.android.gms.internal.ads.zzzl r3 = r0.f24754j
            com.google.android.gms.internal.ads.zzaal r4 = r15.mo48445b()
            r3.mo41254h(r4)
            goto L_0x0076
        L_0x0065:
            r13 = r7
            com.google.android.gms.internal.ads.zzzl r4 = r0.f24754j
            com.google.android.gms.internal.ads.zzaak r5 = new com.google.android.gms.internal.ads.zzaak
            long r6 = r3.mo41512b()
            r5.<init>(r6, r13)
            r4.mo41254h(r5)
            goto L_0x0076
        L_0x0075:
            r13 = r7
        L_0x0076:
            boolean r3 = r0.f24758n
            if (r3 == 0) goto L_0x008d
            r3 = 0
            r0.f24758n = r3
            r0.mo41229g(r13, r13)
            long r4 = r19.mo41252c()
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            r2.f23733a = r13
            r1 = 1
            return r1
        L_0x008d:
            r3 = 0
        L_0x008e:
            com.google.android.gms.internal.ads.zzaif r4 = r0.f24753i
            if (r4 == 0) goto L_0x009f
            boolean r5 = r4.mo48448e()
            if (r5 != 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            int r1 = r4.mo48444a(r1, r2)
            return r1
        L_0x009e:
            r3 = 0
        L_0x009f:
            com.google.android.gms.internal.ads.zzef r2 = r0.f24746b
            byte[] r4 = r2.mo45232h()
            int r5 = r2.mo45235k()
            int r5 = 9400 - r5
            r6 = 188(0xbc, float:2.63E-43)
            if (r5 < r6) goto L_0x00b0
            goto L_0x00c2
        L_0x00b0:
            int r5 = r2.mo45233i()
            if (r5 <= 0) goto L_0x00bd
            int r2 = r2.mo45235k()
            java.lang.System.arraycopy(r4, r2, r4, r3, r5)
        L_0x00bd:
            com.google.android.gms.internal.ads.zzef r2 = r0.f24746b
            r2.mo45228d(r4, r5)
        L_0x00c2:
            com.google.android.gms.internal.ads.zzef r2 = r0.f24746b
            int r5 = r2.mo45233i()
            r7 = -1
            if (r5 >= r6) goto L_0x00df
            int r2 = r2.mo45236l()
            int r5 = 9400 - r2
            int r5 = r1.mo43927e(r4, r2, r5)
            if (r5 != r7) goto L_0x00d8
            return r7
        L_0x00d8:
            com.google.android.gms.internal.ads.zzef r7 = r0.f24746b
            int r2 = r2 + r5
            r7.mo45229e(r2)
            goto L_0x00c2
        L_0x00df:
            int r1 = r2.mo45235k()
            int r4 = r2.mo45236l()
            byte[] r2 = r2.mo45232h()
            int r2 = com.google.android.gms.internal.ads.zzaiq.m41545a(r2, r1, r4)
            com.google.android.gms.internal.ads.zzef r5 = r0.f24746b
            r5.mo45230f(r2)
            int r5 = r2 + 188
            if (r5 <= r4) goto L_0x00ff
            int r4 = r0.f24759o
            int r2 = r2 - r1
            int r4 = r4 + r2
            r0.f24759o = r4
            goto L_0x0101
        L_0x00ff:
            r0.f24759o = r3
        L_0x0101:
            com.google.android.gms.internal.ads.zzef r1 = r0.f24746b
            int r2 = r1.mo45236l()
            if (r5 <= r2) goto L_0x010a
            return r3
        L_0x010a:
            int r1 = r1.mo45237m()
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.zzef r1 = r0.f24746b
            r1.mo45230f(r5)
            return r3
        L_0x0119:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x0120
            r10 = 1
            goto L_0x0121
        L_0x0120:
            r10 = 0
        L_0x0121:
            int r4 = r1 >> 8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r6 = r1 & 32
            r8 = r1 & 16
            if (r8 == 0) goto L_0x0134
            android.util.SparseArray r8 = r0.f24749e
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.zzaip r8 = (com.google.android.gms.internal.ads.zzaip) r8
            goto L_0x0135
        L_0x0134:
            r8 = 0
        L_0x0135:
            if (r8 != 0) goto L_0x013d
            com.google.android.gms.internal.ads.zzef r1 = r0.f24746b
            r1.mo45230f(r5)
            return r3
        L_0x013d:
            r1 = r1 & 15
            android.util.SparseIntArray r9 = r0.f24747c
            int r13 = r1 + -1
            int r9 = r9.get(r4, r13)
            android.util.SparseIntArray r13 = r0.f24747c
            r13.put(r4, r1)
            if (r9 != r1) goto L_0x0154
            com.google.android.gms.internal.ads.zzef r1 = r0.f24746b
            r1.mo45230f(r5)
            return r3
        L_0x0154:
            r13 = 1
            int r9 = r9 + r13
            r9 = r9 & 15
            if (r1 == r9) goto L_0x015d
            r8.mo41498a()
        L_0x015d:
            if (r6 == 0) goto L_0x0179
            com.google.android.gms.internal.ads.zzef r1 = r0.f24746b
            int r1 = r1.mo45243s()
            com.google.android.gms.internal.ads.zzef r6 = r0.f24746b
            int r6 = r6.mo45243s()
            r6 = r6 & 64
            if (r6 == 0) goto L_0x0171
            r6 = 2
            goto L_0x0172
        L_0x0171:
            r6 = 0
        L_0x0172:
            r10 = r10 | r6
            com.google.android.gms.internal.ads.zzef r6 = r0.f24746b
            int r1 = r1 + r7
            r6.mo45231g(r1)
        L_0x0179:
            boolean r1 = r0.f24756l
            if (r1 != 0) goto L_0x0185
            android.util.SparseBooleanArray r6 = r0.f24751g
            boolean r4 = r6.get(r4, r3)
            if (r4 != 0) goto L_0x0196
        L_0x0185:
            com.google.android.gms.internal.ads.zzef r4 = r0.f24746b
            r4.mo45229e(r5)
            com.google.android.gms.internal.ads.zzef r4 = r0.f24746b
            r8.mo41500c(r4, r10)
            com.google.android.gms.internal.ads.zzef r4 = r0.f24746b
            r4.mo45229e(r2)
            if (r1 != 0) goto L_0x01a3
        L_0x0196:
            boolean r1 = r0.f24756l
            if (r1 == 0) goto L_0x01a3
            r1 = -1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            r1 = 1
            r0.f24758n = r1
        L_0x01a3:
            com.google.android.gms.internal.ads.zzef r1 = r0.f24746b
            r1.mo45230f(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.mo41230h(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }

    public zzaik(int i) {
        this(1, 0, 112800);
    }

    public zzaik(int i, int i2, int i3) {
        zzel zzel = new zzel(0);
        this.f24748d = new zzagz(0);
        this.f24745a = Collections.singletonList(zzel);
        this.f24746b = new zzef(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f24750f = sparseBooleanArray;
        this.f24751g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f24749e = sparseArray;
        this.f24747c = new SparseIntArray();
        this.f24752h = new zzaig(112800);
        this.f24754j = zzzl.f39041e;
        this.f24760p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f24749e.put(sparseArray2.keyAt(i4), (zzaip) sparseArray2.valueAt(i4));
        }
        this.f24749e.put(0, new zzaic(new zzaii(this)));
    }
}

package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaij implements zzaib {

    /* renamed from: a */
    private final zzee f24739a = new zzee(new byte[5], 5);

    /* renamed from: b */
    private final SparseArray f24740b = new SparseArray();

    /* renamed from: c */
    private final SparseIntArray f24741c = new SparseIntArray();

    /* renamed from: d */
    private final int f24742d;

    /* renamed from: e */
    final /* synthetic */ zzaik f24743e;

    public zzaij(zzaik zzaik, int i) {
        this.f24743e = zzaik;
        this.f24742d = i;
    }

    /* renamed from: b */
    public final void mo41496b(zzel zzel, zzzl zzzl, zzaio zzaio) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0112, code lost:
        if (r29.mo45243s() == 21) goto L_0x00df;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41497c(com.google.android.gms.internal.ads.zzef r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            int r2 = r29.mo45243s()
            r3 = 2
            if (r2 == r3) goto L_0x000c
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzaik r2 = r0.f24743e
            java.util.List r2 = r2.f24745a
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.ads.zzel r2 = (com.google.android.gms.internal.ads.zzel) r2
            int r5 = r29.mo45243s()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x0022
            return
        L_0x0022:
            r5 = 1
            r1.mo45231g(r5)
            int r6 = r29.mo45247w()
            r7 = 3
            r1.mo45231g(r7)
            com.google.android.gms.internal.ads.zzee r8 = r0.f24739a
            r1.mo45225a(r8, r3)
            com.google.android.gms.internal.ads.zzee r8 = r0.f24739a
            r8.mo45205j(r7)
            com.google.android.gms.internal.ads.zzaik r8 = r0.f24743e
            com.google.android.gms.internal.ads.zzee r9 = r0.f24739a
            r10 = 13
            int r9 = r9.mo45198c(r10)
            r8.f24760p = r9
            com.google.android.gms.internal.ads.zzee r8 = r0.f24739a
            r1.mo45225a(r8, r3)
            com.google.android.gms.internal.ads.zzee r3 = r0.f24739a
            r8 = 4
            r3.mo45205j(r8)
            com.google.android.gms.internal.ads.zzee r3 = r0.f24739a
            r9 = 12
            int r3 = r3.mo45198c(r9)
            r1.mo45231g(r3)
            android.util.SparseArray r3 = r0.f24740b
            r3.clear()
            android.util.SparseIntArray r3 = r0.f24741c
            r3.clear()
            int r3 = r29.mo45233i()
        L_0x0069:
            if (r3 <= 0) goto L_0x01e4
            com.google.android.gms.internal.ads.zzee r11 = r0.f24739a
            r12 = 5
            r1.mo45225a(r11, r12)
            com.google.android.gms.internal.ads.zzee r11 = r0.f24739a
            r13 = 8
            int r11 = r11.mo45198c(r13)
            com.google.android.gms.internal.ads.zzee r13 = r0.f24739a
            r13.mo45205j(r7)
            com.google.android.gms.internal.ads.zzee r13 = r0.f24739a
            int r13 = r13.mo45198c(r10)
            com.google.android.gms.internal.ads.zzee r14 = r0.f24739a
            r14.mo45205j(r8)
            com.google.android.gms.internal.ads.zzee r14 = r0.f24739a
            int r14 = r14.mo45198c(r9)
            int r15 = r29.mo45235k()
            int r9 = r15 + r14
            r16 = -1
            r17 = 0
            r5 = r17
            r18 = r5
            r10 = -1
        L_0x009e:
            int r4 = r29.mo45235k()
            if (r4 >= r9) goto L_0x0194
            int r4 = r29.mo45243s()
            int r19 = r29.mo45243s()
            int r20 = r29.mo45235k()
            int r8 = r20 + r19
            if (r8 <= r9) goto L_0x00b6
            goto L_0x0194
        L_0x00b6:
            r7 = 89
            r20 = 172(0xac, float:2.41E-43)
            r22 = 135(0x87, float:1.89E-43)
            r23 = 129(0x81, float:1.81E-43)
            if (r4 != r12) goto L_0x00f0
            long r24 = r29.mo45217A()
            r26 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r4 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r4 != 0) goto L_0x00ce
            r10 = 129(0x81, float:1.81E-43)
            goto L_0x00eb
        L_0x00ce:
            r26 = 1161904947(0x45414333, double:5.74057318E-315)
            int r4 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r4 != 0) goto L_0x00d8
            r10 = 135(0x87, float:1.89E-43)
            goto L_0x00eb
        L_0x00d8:
            r22 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r4 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r4 != 0) goto L_0x00e2
        L_0x00df:
            r10 = 172(0xac, float:2.41E-43)
            goto L_0x00eb
        L_0x00e2:
            r22 = 1212503619(0x48455643, double:5.990563836E-315)
            int r4 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r4 != 0) goto L_0x00eb
            r10 = 36
        L_0x00eb:
            r21 = r2
        L_0x00ed:
            r22 = r6
            goto L_0x00fa
        L_0x00f0:
            r12 = 106(0x6a, float:1.49E-43)
            if (r4 != r12) goto L_0x00fd
            r21 = r2
            r22 = r6
            r10 = 129(0x81, float:1.81E-43)
        L_0x00fa:
            r12 = 4
            goto L_0x0183
        L_0x00fd:
            r12 = 122(0x7a, float:1.71E-43)
            if (r4 != r12) goto L_0x0108
            r21 = r2
            r22 = r6
            r10 = 135(0x87, float:1.89E-43)
            goto L_0x00fa
        L_0x0108:
            r12 = 127(0x7f, float:1.78E-43)
            if (r4 != r12) goto L_0x0115
            int r4 = r29.mo45243s()
            r7 = 21
            if (r4 != r7) goto L_0x00eb
            goto L_0x00df
        L_0x0115:
            r12 = 123(0x7b, float:1.72E-43)
            if (r4 != r12) goto L_0x0122
            r4 = 138(0x8a, float:1.93E-43)
            r21 = r2
            r22 = r6
            r10 = 138(0x8a, float:1.93E-43)
            goto L_0x00fa
        L_0x0122:
            r12 = 10
            if (r4 != r12) goto L_0x0135
            java.nio.charset.Charset r4 = com.google.android.gms.internal.ads.zzfsk.f36339c
            r12 = 3
            java.lang.String r4 = r1.mo45222F(r12, r4)
            java.lang.String r4 = r4.trim()
            r21 = r2
            r5 = r4
            goto L_0x00ed
        L_0x0135:
            r12 = 3
            if (r4 != r7) goto L_0x0176
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x013d:
            int r10 = r29.mo45235k()
            if (r10 >= r8) goto L_0x016c
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzfsk.f36339c
            java.lang.String r10 = r1.mo45222F(r12, r10)
            java.lang.String r10 = r10.trim()
            int r7 = r29.mo45243s()
            r21 = r2
            r12 = 4
            byte[] r2 = new byte[r12]
            r22 = r6
            r6 = 0
            r1.mo45226b(r2, r6, r12)
            com.google.android.gms.internal.ads.zzail r6 = new com.google.android.gms.internal.ads.zzail
            r6.<init>(r10, r7, r2)
            r4.add(r6)
            r2 = r21
            r6 = r22
            r7 = 89
            r12 = 3
            goto L_0x013d
        L_0x016c:
            r21 = r2
            r22 = r6
            r12 = 4
            r18 = r4
            r10 = 89
            goto L_0x0183
        L_0x0176:
            r21 = r2
            r22 = r6
            r12 = 4
            r2 = 111(0x6f, float:1.56E-43)
            if (r4 != r2) goto L_0x0183
            r2 = 257(0x101, float:3.6E-43)
            r10 = 257(0x101, float:3.6E-43)
        L_0x0183:
            int r2 = r29.mo45235k()
            int r8 = r8 - r2
            r1.mo45231g(r8)
            r2 = r21
            r6 = r22
            r7 = 3
            r8 = 4
            r12 = 5
            goto L_0x009e
        L_0x0194:
            r21 = r2
            r22 = r6
            r12 = 4
            r1.mo45230f(r9)
            com.google.android.gms.internal.ads.zzaim r2 = new com.google.android.gms.internal.ads.zzaim
            byte[] r4 = r29.mo45232h()
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r15, r9)
            r6 = r18
            r2.<init>(r10, r5, r6, r4)
            r4 = 6
            if (r11 == r4) goto L_0x01b1
            r4 = 5
            if (r11 != r4) goto L_0x01b3
        L_0x01b1:
            int r11 = r2.f24763a
        L_0x01b3:
            int r14 = r14 + 5
            int r3 = r3 - r14
            com.google.android.gms.internal.ads.zzaik r4 = r0.f24743e
            android.util.SparseBooleanArray r4 = r4.f24750f
            boolean r4 = r4.get(r13)
            if (r4 != 0) goto L_0x01d6
            com.google.android.gms.internal.ads.zzaik r4 = r0.f24743e
            com.google.android.gms.internal.ads.zzain r4 = r4.f24748d
            com.google.android.gms.internal.ads.zzaip r2 = r4.mo41471a(r11, r2)
            android.util.SparseIntArray r4 = r0.f24741c
            r4.put(r13, r13)
            android.util.SparseArray r4 = r0.f24740b
            r4.put(r13, r2)
        L_0x01d6:
            r2 = r21
            r6 = r22
            r4 = 0
            r5 = 1
            r7 = 3
            r8 = 4
            r9 = 12
            r10 = 13
            goto L_0x0069
        L_0x01e4:
            r21 = r2
            r22 = r6
            android.util.SparseIntArray r1 = r0.f24741c
            int r1 = r1.size()
            r6 = 0
        L_0x01ef:
            if (r6 >= r1) goto L_0x0243
            android.util.SparseIntArray r2 = r0.f24741c
            int r2 = r2.keyAt(r6)
            android.util.SparseIntArray r3 = r0.f24741c
            int r3 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.zzaik r4 = r0.f24743e
            android.util.SparseBooleanArray r4 = r4.f24750f
            r5 = 1
            r4.put(r2, r5)
            com.google.android.gms.internal.ads.zzaik r4 = r0.f24743e
            android.util.SparseBooleanArray r4 = r4.f24751g
            r4.put(r3, r5)
            android.util.SparseArray r4 = r0.f24740b
            java.lang.Object r4 = r4.valueAt(r6)
            com.google.android.gms.internal.ads.zzaip r4 = (com.google.android.gms.internal.ads.zzaip) r4
            if (r4 == 0) goto L_0x0238
            com.google.android.gms.internal.ads.zzaik r5 = r0.f24743e
            com.google.android.gms.internal.ads.zzzl r5 = r5.f24754j
            com.google.android.gms.internal.ads.zzaio r7 = new com.google.android.gms.internal.ads.zzaio
            r8 = 8192(0x2000, float:1.14794E-41)
            r9 = r22
            r7.<init>(r9, r2, r8)
            r2 = r21
            r4.mo41499b(r2, r5, r7)
            com.google.android.gms.internal.ads.zzaik r5 = r0.f24743e
            android.util.SparseArray r5 = r5.f24749e
            r5.put(r3, r4)
            goto L_0x023c
        L_0x0238:
            r2 = r21
            r9 = r22
        L_0x023c:
            int r6 = r6 + 1
            r21 = r2
            r22 = r9
            goto L_0x01ef
        L_0x0243:
            com.google.android.gms.internal.ads.zzaik r1 = r0.f24743e
            android.util.SparseArray r1 = r1.f24749e
            int r2 = r0.f24742d
            r1.remove(r2)
            com.google.android.gms.internal.ads.zzaik r1 = r0.f24743e
            r2 = 0
            r1.f24755k = r2
            com.google.android.gms.internal.ads.zzaik r1 = r0.f24743e
            int r2 = r1.f24755k
            if (r2 != 0) goto L_0x0269
            com.google.android.gms.internal.ads.zzzl r1 = r1.f24754j
            r1.mo41255j0()
            com.google.android.gms.internal.ads.zzaik r1 = r0.f24743e
            r2 = 1
            r1.f24756l = true
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaij.mo41497c(com.google.android.gms.internal.ads.zzef):void");
    }
}

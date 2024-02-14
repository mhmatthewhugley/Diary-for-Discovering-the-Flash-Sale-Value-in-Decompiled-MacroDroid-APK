package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaia implements zzzi {

    /* renamed from: l */
    public static final zzzp f24705l = zzahy.f24698b;

    /* renamed from: a */
    private final zzel f24706a = new zzel(0);

    /* renamed from: b */
    private final SparseArray f24707b = new SparseArray();

    /* renamed from: c */
    private final zzef f24708c = new zzef(4096);

    /* renamed from: d */
    private final zzahx f24709d = new zzahx();

    /* renamed from: e */
    private boolean f24710e;

    /* renamed from: f */
    private boolean f24711f;

    /* renamed from: g */
    private boolean f24712g;

    /* renamed from: h */
    private long f24713h;
    @Nullable

    /* renamed from: i */
    private zzahw f24714i;

    /* renamed from: j */
    private zzzl f24715j;

    /* renamed from: k */
    private boolean f24716k;

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        byte[] bArr = new byte[14];
        zzyy zzyy = (zzyy) zzzj;
        zzyy.mo48454j(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzyy.mo48458o(bArr[13] & 7, false);
        zzyy.mo48454j(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24715j = zzzl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 != r7) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[LOOP:0: B:12:0x002c->B:14:0x0034, LOOP_END] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41229g(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzel r5 = r4.f24706a
            long r0 = r5.mo45360e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0021
            long r0 = r5.mo45358c()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r5.mo45361f(r7)
        L_0x0024:
            com.google.android.gms.internal.ads.zzahw r5 = r4.f24714i
            r6 = 0
            if (r5 == 0) goto L_0x002c
            r5.mo48447d(r7)
        L_0x002c:
            android.util.SparseArray r5 = r4.f24707b
            int r5 = r5.size()
            if (r6 >= r5) goto L_0x0042
            android.util.SparseArray r5 = r4.f24707b
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzahz r5 = (com.google.android.gms.internal.ads.zzahz) r5
            r5.mo41506b()
            int r6 = r6 + 1
            goto L_0x002c
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaia.mo41229g(long, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41230h(com.google.android.gms.internal.ads.zzzj r17, com.google.android.gms.internal.ads.zzaai r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.gms.internal.ads.zzzl r3 = r0.f24715j
            com.google.android.gms.internal.ads.zzdd.m47208b(r3)
            long r10 = r17.mo41253d()
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.zzahx r4 = r0.f24709d
            boolean r5 = r4.mo41504e()
            if (r5 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r4.mo41501a(r1, r2)
            return r1
        L_0x0023:
            boolean r4 = r0.f24716k
            r14 = 1
            if (r4 != 0) goto L_0x0064
            r0.f24716k = r14
            com.google.android.gms.internal.ads.zzahx r4 = r0.f24709d
            long r5 = r4.mo41502b()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.zzahw r15 = new com.google.android.gms.internal.ads.zzahw
            com.google.android.gms.internal.ads.zzel r5 = r4.mo41503d()
            long r6 = r4.mo41502b()
            r4 = r15
            r8 = r10
            r4.<init>(r5, r6, r8)
            r0.f24714i = r15
            com.google.android.gms.internal.ads.zzzl r4 = r0.f24715j
            com.google.android.gms.internal.ads.zzaal r5 = r15.mo48445b()
            r4.mo41254h(r5)
            goto L_0x0064
        L_0x0054:
            com.google.android.gms.internal.ads.zzzl r5 = r0.f24715j
            com.google.android.gms.internal.ads.zzaak r6 = new com.google.android.gms.internal.ads.zzaak
            long r7 = r4.mo41502b()
            r14 = 0
            r6.<init>(r7, r14)
            r5.mo41254h(r6)
        L_0x0064:
            com.google.android.gms.internal.ads.zzahw r5 = r0.f24714i
            if (r5 == 0) goto L_0x0074
            boolean r6 = r5.mo48448e()
            if (r6 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            int r1 = r5.mo48444a(r1, r2)
            return r1
        L_0x0074:
            r17.mo48452h()
            if (r3 == 0) goto L_0x007f
            long r2 = r17.mo41251b()
            long r10 = r10 - r2
            goto L_0x0080
        L_0x007f:
            r10 = r12
        L_0x0080:
            r2 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x008d
            r5 = 4
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return r2
        L_0x008d:
            com.google.android.gms.internal.ads.zzef r3 = r0.f24708c
            byte[] r3 = r3.mo45232h()
            r5 = 4
            r6 = 0
            r4 = 1
            boolean r3 = r1.mo48454j(r3, r6, r5, r4)
            if (r3 != 0) goto L_0x009d
            return r2
        L_0x009d:
            com.google.android.gms.internal.ads.zzef r3 = r0.f24708c
            r3.mo45230f(r6)
            com.google.android.gms.internal.ads.zzef r3 = r0.f24708c
            int r3 = r3.mo45237m()
            r5 = 441(0x1b9, float:6.18E-43)
            if (r3 != r5) goto L_0x00ad
            return r2
        L_0x00ad:
            r2 = 442(0x1ba, float:6.2E-43)
            if (r3 != r2) goto L_0x00d3
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            byte[] r2 = r2.mo45232h()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r3 = 10
            r1.mo48454j(r2, r6, r3, r6)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            r3 = 9
            r2.mo45230f(r3)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            int r2 = r2.mo45243s()
            r2 = r2 & 7
            int r2 = r2 + 14
            r1.mo48459p(r2, r6)
            return r6
        L_0x00d3:
            r2 = 443(0x1bb, float:6.21E-43)
            r5 = 2
            r7 = 6
            if (r3 != r2) goto L_0x00f4
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            byte[] r2 = r2.mo45232h()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48454j(r2, r6, r5, r6)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            r2.mo45230f(r6)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            int r2 = r2.mo45247w()
            int r2 = r2 + r7
            r1.mo48459p(r2, r6)
            return r6
        L_0x00f4:
            int r2 = r3 >> 8
            r4 = 1
            if (r2 == r4) goto L_0x00ff
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48459p(r4, r6)
            return r6
        L_0x00ff:
            r2 = r3 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r3 = r0.f24707b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzahz r3 = (com.google.android.gms.internal.ads.zzahz) r3
            boolean r8 = r0.f24710e
            if (r8 != 0) goto L_0x0189
            if (r3 != 0) goto L_0x0169
            r8 = 189(0xbd, float:2.65E-43)
            r9 = 0
            if (r2 != r8) goto L_0x0124
            com.google.android.gms.internal.ads.zzags r8 = new com.google.android.gms.internal.ads.zzags
            r8.<init>(r9)
            r4 = 1
            r0.f24711f = r4
            long r9 = r17.mo41252c()
            r0.f24713h = r9
        L_0x0122:
            r9 = r8
            goto L_0x014d
        L_0x0124:
            r4 = 1
            r8 = r2 & 224(0xe0, float:3.14E-43)
            r10 = 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L_0x0139
            com.google.android.gms.internal.ads.zzahq r8 = new com.google.android.gms.internal.ads.zzahq
            r8.<init>(r9)
            r0.f24711f = r4
            long r9 = r17.mo41252c()
            r0.f24713h = r9
            goto L_0x0122
        L_0x0139:
            r8 = r2 & 240(0xf0, float:3.36E-43)
            r10 = 224(0xe0, float:3.14E-43)
            if (r8 != r10) goto L_0x014d
            com.google.android.gms.internal.ads.zzahe r8 = new com.google.android.gms.internal.ads.zzahe
            r8.<init>(r9)
            r0.f24712g = r4
            long r9 = r17.mo41252c()
            r0.f24713h = r9
            goto L_0x0122
        L_0x014d:
            if (r9 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.zzaio r3 = new com.google.android.gms.internal.ads.zzaio
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 256(0x100, float:3.59E-43)
            r3.<init>(r8, r2, r10)
            com.google.android.gms.internal.ads.zzzl r8 = r0.f24715j
            r9.mo41469d(r8, r3)
            com.google.android.gms.internal.ads.zzahz r3 = new com.google.android.gms.internal.ads.zzahz
            com.google.android.gms.internal.ads.zzel r8 = r0.f24706a
            r3.<init>(r9, r8)
            android.util.SparseArray r8 = r0.f24707b
            r8.put(r2, r3)
        L_0x0169:
            boolean r2 = r0.f24711f
            r8 = 1048576(0x100000, double:5.180654E-318)
            if (r2 == 0) goto L_0x0179
            boolean r2 = r0.f24712g
            if (r2 == 0) goto L_0x0179
            long r8 = r0.f24713h
            r10 = 8192(0x2000, double:4.0474E-320)
            long r8 = r8 + r10
        L_0x0179:
            long r10 = r17.mo41252c()
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0189
            r2 = 1
            r0.f24710e = r2
            com.google.android.gms.internal.ads.zzzl r2 = r0.f24715j
            r2.mo41255j0()
        L_0x0189:
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            byte[] r2 = r2.mo45232h()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48454j(r2, r6, r5, r6)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            r2.mo45230f(r6)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24708c
            int r2 = r2.mo45247w()
            int r2 = r2 + r7
            if (r3 != 0) goto L_0x01a6
            r1.mo48459p(r2, r6)
            goto L_0x01c7
        L_0x01a6:
            com.google.android.gms.internal.ads.zzef r4 = r0.f24708c
            r4.mo45227c(r2)
            com.google.android.gms.internal.ads.zzef r4 = r0.f24708c
            byte[] r4 = r4.mo45232h()
            r1.mo48453i(r4, r6, r2, r6)
            com.google.android.gms.internal.ads.zzef r1 = r0.f24708c
            r1.mo45230f(r7)
            com.google.android.gms.internal.ads.zzef r1 = r0.f24708c
            r3.mo41505a(r1)
            com.google.android.gms.internal.ads.zzef r1 = r0.f24708c
            int r2 = r1.mo45234j()
            r1.mo45229e(r2)
        L_0x01c7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaia.mo41230h(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }
}

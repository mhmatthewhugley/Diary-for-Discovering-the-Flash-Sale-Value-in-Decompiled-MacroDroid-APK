package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaha implements zzahc {

    /* renamed from: a */
    private final zzef f24511a = new zzef(new byte[18]);
    @Nullable

    /* renamed from: b */
    private final String f24512b;

    /* renamed from: c */
    private String f24513c;

    /* renamed from: d */
    private zzaap f24514d;

    /* renamed from: e */
    private int f24515e = 0;

    /* renamed from: f */
    private int f24516f;

    /* renamed from: g */
    private int f24517g;

    /* renamed from: h */
    private long f24518h;

    /* renamed from: i */
    private zzaf f24519i;

    /* renamed from: j */
    private int f24520j;

    /* renamed from: k */
    private long f24521k = -9223372036854775807L;

    public zzaha(@Nullable String str) {
        this.f24512b = str;
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24515e = 0;
        this.f24516f = 0;
        this.f24517g = 0;
        this.f24521k = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0009 A[EDGE_INSN: B:58:0x0009->B:52:0x0009 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41468c(com.google.android.gms.internal.ads.zzef r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.zzaap r2 = r0.f24514d
            com.google.android.gms.internal.ads.zzdd.m47208b(r2)
        L_0x0009:
            int r2 = r18.mo45233i()
            if (r2 <= 0) goto L_0x0191
            int r2 = r0.f24515e
            r3 = 8
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 4
            if (r2 == 0) goto L_0x013f
            if (r2 == r7) goto L_0x0054
            int r2 = r18.mo45233i()
            int r3 = r0.f24520j
            int r4 = r0.f24516f
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.google.android.gms.internal.ads.zzaap r3 = r0.f24514d
            r3.mo41215e(r1, r2)
            int r3 = r0.f24516f
            int r3 = r3 + r2
            r0.f24516f = r3
            int r11 = r0.f24520j
            if (r3 != r11) goto L_0x0009
            long r8 = r0.f24521k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzaap r7 = r0.f24514d
            r10 = 1
            r12 = 0
            r13 = 0
            r7.mo41216f(r8, r10, r11, r12, r13)
            long r2 = r0.f24521k
            long r4 = r0.f24518h
            long r2 = r2 + r4
            r0.f24521k = r2
        L_0x0051:
            r0.f24515e = r6
            goto L_0x0009
        L_0x0054:
            com.google.android.gms.internal.ads.zzef r2 = r0.f24511a
            byte[] r2 = r2.mo45232h()
            int r9 = r18.mo45233i()
            int r10 = r0.f24516f
            r11 = 18
            int r10 = 18 - r10
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r0.f24516f
            r1.mo45226b(r2, r10, r9)
            int r2 = r0.f24516f
            int r2 = r2 + r9
            r0.f24516f = r2
            if (r2 != r11) goto L_0x0009
            com.google.android.gms.internal.ads.zzef r2 = r0.f24511a
            byte[] r2 = r2.mo45232h()
            com.google.android.gms.internal.ads.zzaf r9 = r0.f24519i
            if (r9 != 0) goto L_0x008e
            java.lang.String r9 = r0.f24513c
            java.lang.String r10 = r0.f24512b
            r12 = 0
            com.google.android.gms.internal.ads.zzaf r9 = com.google.android.gms.internal.ads.zzzf.m55506a(r2, r9, r10, r12)
            r0.f24519i = r9
            com.google.android.gms.internal.ads.zzaap r10 = r0.f24514d
            r10.mo41214d(r9)
        L_0x008e:
            int r9 = com.google.android.gms.internal.ads.zzzf.f39039d
            byte r9 = r2[r6]
            r10 = 31
            r12 = -1
            r13 = -2
            r14 = 5
            r15 = 6
            r16 = 7
            if (r9 == r13) goto L_0x00d6
            if (r9 == r12) goto L_0x00c0
            if (r9 == r10) goto L_0x00ae
            byte r3 = r2[r14]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            byte r4 = r2[r16]
            goto L_0x00e3
        L_0x00ae:
            byte r9 = r2[r15]
            r4 = r4 & r9
            int r4 = r4 << 12
            byte r9 = r2[r16]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r8
            r4 = r4 | r9
            byte r3 = r2[r3]
            r3 = r3 & 60
            int r3 = r3 >> r5
            r3 = r3 | r4
            goto L_0x00d3
        L_0x00c0:
            byte r3 = r2[r16]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            r4 = 9
            byte r4 = r2[r4]
            r4 = r4 & 60
            int r4 = r4 >> r5
            r3 = r3 | r4
        L_0x00d3:
            int r3 = r3 + r7
            r4 = 1
            goto L_0x00e9
        L_0x00d6:
            byte r3 = r2[r8]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r16]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            byte r4 = r2[r15]
        L_0x00e3:
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> r8
            r3 = r3 | r4
            int r3 = r3 + r7
            r4 = 0
        L_0x00e9:
            if (r4 == 0) goto L_0x00ef
            int r3 = r3 * 16
            int r3 = r3 / 14
        L_0x00ef:
            r0.f24520j = r3
            byte r3 = r2[r6]
            if (r3 == r13) goto L_0x0112
            if (r3 == r12) goto L_0x0108
            if (r3 == r10) goto L_0x0100
            byte r3 = r2[r8]
            r3 = r3 & r7
            int r3 = r3 << r15
            byte r2 = r2[r14]
            goto L_0x0118
        L_0x0100:
            byte r3 = r2[r14]
            r3 = r3 & 7
            int r3 = r3 << r8
            byte r2 = r2[r15]
            goto L_0x010f
        L_0x0108:
            byte r3 = r2[r8]
            r3 = r3 & 7
            int r3 = r3 << r8
            byte r2 = r2[r16]
        L_0x010f:
            r2 = r2 & 60
            goto L_0x011a
        L_0x0112:
            byte r3 = r2[r14]
            r3 = r3 & r7
            int r3 = r3 << r15
            byte r2 = r2[r8]
        L_0x0118:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x011a:
            int r2 = r2 >> r5
            r2 = r2 | r3
            int r2 = r2 + r7
            int r2 = r2 * 32
            long r2 = (long) r2
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r7
            com.google.android.gms.internal.ads.zzaf r4 = r0.f24519i
            int r4 = r4.f24227z
            long r7 = (long) r4
            long r2 = r2 / r7
            int r3 = (int) r2
            long r2 = (long) r3
            r0.f24518h = r2
            com.google.android.gms.internal.ads.zzef r2 = r0.f24511a
            r2.mo45230f(r6)
            com.google.android.gms.internal.ads.zzaap r2 = r0.f24514d
            com.google.android.gms.internal.ads.zzef r3 = r0.f24511a
            r2.mo41215e(r3, r11)
            r0.f24515e = r5
            goto L_0x0009
        L_0x013f:
            int r2 = r18.mo45233i()
            if (r2 <= 0) goto L_0x0009
            int r2 = r0.f24517g
            int r2 = r2 << r3
            r0.f24517g = r2
            int r9 = r18.mo45243s()
            r2 = r2 | r9
            r0.f24517g = r2
            int r9 = com.google.android.gms.internal.ads.zzzf.f39039d
            r9 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r9) goto L_0x0167
            r9 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r9) goto L_0x0167
            r9 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r9) goto L_0x0167
            r9 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r9) goto L_0x013f
        L_0x0167:
            com.google.android.gms.internal.ads.zzef r2 = r0.f24511a
            byte[] r2 = r2.mo45232h()
            int r3 = r0.f24517g
            int r9 = r3 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            int r9 = r3 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r7] = r9
            int r9 = r3 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r5] = r9
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2[r4] = r3
            r0.f24516f = r8
            r0.f24517g = r6
            r0.f24515e = r7
            goto L_0x0009
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaha.mo41468c(com.google.android.gms.internal.ads.zzef):void");
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24513c = zzaio.mo41516b();
        this.f24514d = zzzl.mo41256k(zzaio.mo41515a(), 1);
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24521k = j;
        }
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahe implements zzahc {

    /* renamed from: q */
    private static final double[] f24533q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f24534a;

    /* renamed from: b */
    private zzaap f24535b;
    @Nullable

    /* renamed from: c */
    private final zzair f24536c;
    @Nullable

    /* renamed from: d */
    private final zzef f24537d;
    @Nullable

    /* renamed from: e */
    private final zzahr f24538e;

    /* renamed from: f */
    private final boolean[] f24539f;

    /* renamed from: g */
    private final zzahd f24540g;

    /* renamed from: h */
    private long f24541h;

    /* renamed from: i */
    private boolean f24542i;

    /* renamed from: j */
    private boolean f24543j;

    /* renamed from: k */
    private long f24544k;

    /* renamed from: l */
    private long f24545l;

    /* renamed from: m */
    private long f24546m;

    /* renamed from: n */
    private long f24547n;

    /* renamed from: o */
    private boolean f24548o;

    /* renamed from: p */
    private boolean f24549p;

    public zzahe() {
        this((zzair) null);
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        zzaaf.m40918e(this.f24539f);
        this.f24540g.mo41473b();
        zzahr zzahr = this.f24538e;
        if (zzahr != null) {
            zzahr.mo41492b();
        }
        this.f24541h = 0;
        this.f24542i = false;
        this.f24545l = -9223372036854775807L;
        this.f24547n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0189  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41468c(com.google.android.gms.internal.ads.zzef r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.zzaap r1 = r0.f24535b
            com.google.android.gms.internal.ads.zzdd.m47208b(r1)
            int r1 = r20.mo45235k()
            int r2 = r20.mo45236l()
            byte[] r3 = r20.mo45232h()
            long r4 = r0.f24541h
            int r6 = r20.mo45233i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f24541h = r4
            com.google.android.gms.internal.ads.zzaap r4 = r0.f24535b
            int r5 = r20.mo45233i()
            r6 = r20
            r4.mo41215e(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f24539f
            int r4 = com.google.android.gms.internal.ads.zzaaf.m40914a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f24543j
            if (r4 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzahd r4 = r0.f24540g
            r4.mo41472a(r3, r1, r2)
        L_0x0039:
            com.google.android.gms.internal.ads.zzahr r4 = r0.f24538e
            if (r4 == 0) goto L_0x0040
            r4.mo41491a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            int r5 = r4 + 3
            byte[] r7 = r20.mo45232h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f24543j
            if (r9 != 0) goto L_0x0130
            if (r8 <= 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzahd r9 = r0.f24540g
            r9.mo41472a(r3, r1, r4)
        L_0x0058:
            if (r8 >= 0) goto L_0x005c
            int r9 = -r8
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.zzahd r12 = r0.f24540g
            boolean r9 = r12.mo41474c(r7, r9)
            if (r9 == 0) goto L_0x0130
            com.google.android.gms.internal.ads.zzahd r9 = r0.f24540g
            java.lang.String r12 = r0.f24534a
            java.util.Objects.requireNonNull(r12)
            byte[] r13 = r9.f24532d
            int r14 = r9.f24530b
            byte[] r13 = java.util.Arrays.copyOf(r13, r14)
            r14 = 4
            byte r15 = r13[r14]
            r16 = 5
            byte r10 = r13[r16]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r14
            int r17 = r10 >> 4
            r15 = r15 | r17
            r10 = r10 & 15
            r11 = 8
            int r10 = r10 << r11
            r18 = 6
            byte r11 = r13[r18]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10 = r10 | r11
            r11 = 7
            byte r14 = r13[r11]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            r11 = 4
            int r14 = r14 >> r11
            r11 = 2
            if (r14 == r11) goto L_0x00af
            r11 = 3
            if (r14 == r11) goto L_0x00a9
            r11 = 4
            if (r14 == r11) goto L_0x00a3
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00b6
        L_0x00a3:
            int r11 = r10 * 121
            float r11 = (float) r11
            int r14 = r15 * 100
            goto L_0x00b4
        L_0x00a9:
            int r11 = r10 * 16
            float r11 = (float) r11
            int r14 = r15 * 9
            goto L_0x00b4
        L_0x00af:
            int r11 = r10 * 4
            float r11 = (float) r11
            int r14 = r15 * 3
        L_0x00b4:
            float r14 = (float) r14
            float r11 = r11 / r14
        L_0x00b6:
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>()
            r14.mo41331h(r12)
            java.lang.String r12 = "video/mpeg2"
            r14.mo41343s(r12)
            r14.mo41348x(r15)
            r14.mo41327f(r10)
            r14.mo41340p(r11)
            java.util.List r10 = java.util.Collections.singletonList(r13)
            r14.mo41333i(r10)
            com.google.android.gms.internal.ads.zzaf r10 = r14.mo41349y()
            r11 = 7
            byte r11 = r13[r11]
            r11 = r11 & 15
            int r11 = r11 + -1
            r14 = 0
            if (r11 < 0) goto L_0x010f
            r12 = 8
            if (r11 >= r12) goto L_0x010f
            double[] r12 = f24533q
            r11 = r12[r11]
            int r9 = r9.f24531c
            int r9 = r9 + 9
            byte r9 = r13[r9]
            r13 = r9 & 96
            int r13 = r13 >> 5
            r9 = r9 & 31
            if (r13 == r9) goto L_0x0105
            double r13 = (double) r13
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 + r15
            int r9 = r9 + 1
            r16 = r5
            double r5 = (double) r9
            double r13 = r13 / r5
            double r11 = r11 * r13
            goto L_0x0107
        L_0x0105:
            r16 = r5
        L_0x0107:
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r5 = r5 / r11
            long r14 = (long) r5
            goto L_0x0111
        L_0x010f:
            r16 = r5
        L_0x0111:
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            android.util.Pair r5 = android.util.Pair.create(r10, r5)
            com.google.android.gms.internal.ads.zzaap r6 = r0.f24535b
            java.lang.Object r9 = r5.first
            com.google.android.gms.internal.ads.zzaf r9 = (com.google.android.gms.internal.ads.zzaf) r9
            r6.mo41214d(r9)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r0.f24544k = r5
            r5 = 1
            r0.f24543j = r5
            goto L_0x0132
        L_0x0130:
            r16 = r5
        L_0x0132:
            com.google.android.gms.internal.ads.zzahr r5 = r0.f24538e
            r6 = 178(0xb2, float:2.5E-43)
            if (r5 == 0) goto L_0x017a
            if (r8 <= 0) goto L_0x013f
            r5.mo41491a(r3, r1, r4)
            r1 = 0
            goto L_0x0140
        L_0x013f:
            int r1 = -r8
        L_0x0140:
            com.google.android.gms.internal.ads.zzahr r5 = r0.f24538e
            boolean r1 = r5.mo41494d(r1)
            if (r1 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24538e
            byte[] r5 = r1.f24672d
            int r1 = r1.f24673e
            int r1 = com.google.android.gms.internal.ads.zzaaf.m40915b(r5, r1)
            com.google.android.gms.internal.ads.zzef r5 = r0.f24537d
            int r8 = com.google.android.gms.internal.ads.zzen.f34500a
            com.google.android.gms.internal.ads.zzahr r8 = r0.f24538e
            byte[] r8 = r8.f24672d
            r5.mo45228d(r8, r1)
            com.google.android.gms.internal.ads.zzair r1 = r0.f24536c
            long r8 = r0.f24547n
            com.google.android.gms.internal.ads.zzef r5 = r0.f24537d
            r1.mo41518a(r8, r5)
        L_0x0166:
            if (r7 != r6) goto L_0x017a
            byte[] r1 = r20.mo45232h()
            int r5 = r4 + 2
            byte r1 = r1[r5]
            r5 = 1
            if (r1 != r5) goto L_0x0178
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24538e
            r1.mo41493c(r6)
        L_0x0178:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x017a:
            if (r7 == 0) goto L_0x0189
            r1 = 179(0xb3, float:2.51E-43)
            if (r7 != r1) goto L_0x0181
            goto L_0x0189
        L_0x0181:
            r1 = 184(0xb8, float:2.58E-43)
            if (r7 != r1) goto L_0x01e4
            r1 = 1
            r0.f24548o = r1
            goto L_0x01e4
        L_0x0189:
            int r1 = r2 - r4
            boolean r4 = r0.f24549p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x01af
            boolean r4 = r0.f24543j
            if (r4 == 0) goto L_0x01af
            long r9 = r0.f24547n
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x01af
            boolean r11 = r0.f24548o
            long r12 = r0.f24541h
            long r14 = r0.f24546m
            com.google.android.gms.internal.ads.zzaap r8 = r0.f24535b
            long r12 = r12 - r14
            int r4 = (int) r12
            int r12 = r4 - r1
            r14 = 0
            r13 = r1
            r8.mo41216f(r9, r11, r12, r13, r14)
        L_0x01af:
            boolean r4 = r0.f24542i
            if (r4 == 0) goto L_0x01bb
            boolean r4 = r0.f24549p
            if (r4 == 0) goto L_0x01b8
            goto L_0x01bb
        L_0x01b8:
            r1 = 0
            r4 = 1
            goto L_0x01dd
        L_0x01bb:
            long r8 = r0.f24541h
            long r10 = (long) r1
            long r8 = r8 - r10
            r0.f24546m = r8
            long r8 = r0.f24545l
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01c8
            goto L_0x01d3
        L_0x01c8:
            long r8 = r0.f24547n
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01d2
            long r10 = r0.f24544k
            long r8 = r8 + r10
            goto L_0x01d3
        L_0x01d2:
            r8 = r5
        L_0x01d3:
            r0.f24547n = r8
            r1 = 0
            r0.f24548o = r1
            r0.f24545l = r5
            r4 = 1
            r0.f24542i = r4
        L_0x01dd:
            if (r7 != 0) goto L_0x01e1
            r10 = 1
            goto L_0x01e2
        L_0x01e1:
            r10 = 0
        L_0x01e2:
            r0.f24549p = r10
        L_0x01e4:
            r6 = r20
            r1 = r16
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahe.mo41468c(com.google.android.gms.internal.ads.zzef):void");
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24534a = zzaio.mo41516b();
        this.f24535b = zzzl.mo41256k(zzaio.mo41515a(), 2);
        zzair zzair = this.f24536c;
        if (zzair != null) {
            zzair.mo41519b(zzzl, zzaio);
        }
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        this.f24545l = j;
    }

    zzahe(@Nullable zzair zzair) {
        zzef zzef;
        this.f24536c = zzair;
        this.f24539f = new boolean[4];
        this.f24540g = new zzahd(128);
        if (zzair != null) {
            this.f24538e = new zzahr(178, 128);
            zzef = new zzef();
        } else {
            zzef = null;
            this.f24538e = null;
        }
        this.f24537d = zzef;
        this.f24545l = -9223372036854775807L;
        this.f24547n = -9223372036854775807L;
    }
}

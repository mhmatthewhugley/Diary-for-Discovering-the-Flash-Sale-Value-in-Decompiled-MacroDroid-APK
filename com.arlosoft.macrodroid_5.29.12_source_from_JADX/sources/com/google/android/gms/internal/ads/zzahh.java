package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahh implements zzahc {

    /* renamed from: l */
    private static final float[] f24564l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    @Nullable

    /* renamed from: a */
    private final zzair f24565a;
    @Nullable

    /* renamed from: b */
    private final zzef f24566b;

    /* renamed from: c */
    private final boolean[] f24567c;

    /* renamed from: d */
    private final zzahf f24568d;
    @Nullable

    /* renamed from: e */
    private final zzahr f24569e;

    /* renamed from: f */
    private zzahg f24570f;

    /* renamed from: g */
    private long f24571g;

    /* renamed from: h */
    private String f24572h;

    /* renamed from: i */
    private zzaap f24573i;

    /* renamed from: j */
    private boolean f24574j;

    /* renamed from: k */
    private long f24575k;

    public zzahh() {
        this((zzair) null);
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        zzaaf.m40918e(this.f24567c);
        this.f24568d.mo41476b();
        zzahg zzahg = this.f24570f;
        if (zzahg != null) {
            zzahg.mo41481d();
        }
        this.f24569e.mo41492b();
        this.f24571g = 0;
        this.f24575k = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ce A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41468c(com.google.android.gms.internal.ads.zzef r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.ads.zzahg r1 = r0.f24570f
            com.google.android.gms.internal.ads.zzdd.m47208b(r1)
            com.google.android.gms.internal.ads.zzaap r1 = r0.f24573i
            com.google.android.gms.internal.ads.zzdd.m47208b(r1)
            int r1 = r19.mo45235k()
            int r2 = r19.mo45236l()
            byte[] r3 = r19.mo45232h()
            long r4 = r0.f24571g
            int r6 = r19.mo45233i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f24571g = r4
            com.google.android.gms.internal.ads.zzaap r4 = r0.f24573i
            int r5 = r19.mo45233i()
            r6 = r19
            r4.mo41215e(r6, r5)
        L_0x002d:
            boolean[] r4 = r0.f24567c
            int r4 = com.google.android.gms.internal.ads.zzaaf.m40914a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.f24574j
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.zzahf r4 = r0.f24568d
            r4.mo41475a(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.zzahg r4 = r0.f24570f
            r4.mo41478a(r3, r1, r2)
            com.google.android.gms.internal.ads.zzahr r4 = r0.f24569e
            r4.mo41491a(r3, r1, r2)
            return
        L_0x0049:
            int r5 = r4 + 3
            byte[] r7 = r19.mo45232h()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f24574j
            if (r9 != 0) goto L_0x0181
            if (r8 <= 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzahf r9 = r0.f24568d
            r9.mo41475a(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.android.gms.internal.ads.zzahf r12 = r0.f24568d
            boolean r9 = r12.mo41477c(r7, r9)
            if (r9 == 0) goto L_0x0181
            com.google.android.gms.internal.ads.zzaap r9 = r0.f24573i
            com.google.android.gms.internal.ads.zzahf r12 = r0.f24568d
            int r13 = r12.f24554d
            java.lang.String r14 = r0.f24572h
            java.util.Objects.requireNonNull(r14)
            byte[] r15 = r12.f24555e
            int r12 = r12.f24553c
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.zzee r15 = new com.google.android.gms.internal.ads.zzee
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.mo45206k(r13)
            r10 = 4
            r15.mo45206k(r10)
            r15.mo45204i()
            r13 = 8
            r15.mo45205j(r13)
            boolean r16 = r15.mo45207l()
            r11 = 3
            if (r16 == 0) goto L_0x00a2
            r15.mo45205j(r10)
            r15.mo45205j(r11)
        L_0x00a2:
            int r10 = r15.mo45198c(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r17 = r5
            r5 = 15
            if (r10 != r5) goto L_0x00c7
            r5 = 8
            int r10 = r15.mo45198c(r5)
            int r5 = r15.mo45198c(r5)
            if (r5 != 0) goto L_0x00c2
            com.google.android.gms.internal.ads.zzdw.m48255e(r13, r11)
            goto L_0x00d4
        L_0x00c2:
            float r10 = (float) r10
            float r5 = (float) r5
            float r16 = r10 / r5
            goto L_0x00ce
        L_0x00c7:
            r5 = 7
            if (r10 >= r5) goto L_0x00d1
            float[] r5 = f24564l
            r16 = r5[r10]
        L_0x00ce:
            r5 = r16
            goto L_0x00d6
        L_0x00d1:
            com.google.android.gms.internal.ads.zzdw.m48255e(r13, r11)
        L_0x00d4:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00d6:
            boolean r10 = r15.mo45207l()
            r11 = 2
            if (r10 == 0) goto L_0x0110
            r15.mo45205j(r11)
            r10 = 1
            r15.mo45205j(r10)
            boolean r10 = r15.mo45207l()
            if (r10 == 0) goto L_0x0110
            r10 = 15
            r15.mo45205j(r10)
            r15.mo45204i()
            r15.mo45205j(r10)
            r15.mo45204i()
            r15.mo45205j(r10)
            r15.mo45204i()
            r11 = 3
            r15.mo45205j(r11)
            r11 = 11
            r15.mo45205j(r11)
            r15.mo45204i()
            r15.mo45205j(r10)
            r15.mo45204i()
        L_0x0110:
            r10 = 2
            int r10 = r15.mo45198c(r10)
            if (r10 == 0) goto L_0x011c
            java.lang.String r10 = "Unhandled video object layer shape"
            com.google.android.gms.internal.ads.zzdw.m48255e(r13, r10)
        L_0x011c:
            r15.mo45204i()
            r10 = 16
            int r10 = r15.mo45198c(r10)
            r15.mo45204i()
            boolean r11 = r15.mo45207l()
            if (r11 == 0) goto L_0x0143
            if (r10 != 0) goto L_0x0136
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            com.google.android.gms.internal.ads.zzdw.m48255e(r13, r10)
            goto L_0x0143
        L_0x0136:
            int r10 = r10 + -1
            r11 = 0
        L_0x0139:
            if (r10 <= 0) goto L_0x0140
            int r11 = r11 + 1
            int r10 = r10 >> 1
            goto L_0x0139
        L_0x0140:
            r15.mo45205j(r11)
        L_0x0143:
            r15.mo45204i()
            r10 = 13
            int r11 = r15.mo45198c(r10)
            r15.mo45204i()
            int r10 = r15.mo45198c(r10)
            r15.mo45204i()
            r15.mo45204i()
            com.google.android.gms.internal.ads.zzad r13 = new com.google.android.gms.internal.ads.zzad
            r13.<init>()
            r13.mo41331h(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.mo41343s(r14)
            r13.mo41348x(r11)
            r13.mo41327f(r10)
            r13.mo41340p(r5)
            java.util.List r5 = java.util.Collections.singletonList(r12)
            r13.mo41333i(r5)
            com.google.android.gms.internal.ads.zzaf r5 = r13.mo41349y()
            r9.mo41214d(r5)
            r5 = 1
            r0.f24574j = r5
            goto L_0x0183
        L_0x0181:
            r17 = r5
        L_0x0183:
            com.google.android.gms.internal.ads.zzahg r5 = r0.f24570f
            r5.mo41478a(r3, r1, r4)
            com.google.android.gms.internal.ads.zzahr r5 = r0.f24569e
            if (r8 <= 0) goto L_0x0191
            r5.mo41491a(r3, r1, r4)
            r10 = 0
            goto L_0x0192
        L_0x0191:
            int r10 = -r8
        L_0x0192:
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24569e
            boolean r1 = r1.mo41494d(r10)
            if (r1 == 0) goto L_0x01b8
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24569e
            byte[] r5 = r1.f24672d
            int r1 = r1.f24673e
            int r1 = com.google.android.gms.internal.ads.zzaaf.m40915b(r5, r1)
            com.google.android.gms.internal.ads.zzef r5 = r0.f24566b
            int r8 = com.google.android.gms.internal.ads.zzen.f34500a
            com.google.android.gms.internal.ads.zzahr r8 = r0.f24569e
            byte[] r8 = r8.f24672d
            r5.mo45228d(r8, r1)
            com.google.android.gms.internal.ads.zzair r1 = r0.f24565a
            long r8 = r0.f24575k
            com.google.android.gms.internal.ads.zzef r5 = r0.f24566b
            r1.mo41518a(r8, r5)
        L_0x01b8:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x01ce
            byte[] r5 = r19.mo45232h()
            int r7 = r4 + 2
            byte r5 = r5[r7]
            r7 = 1
            if (r5 != r7) goto L_0x01cc
            com.google.android.gms.internal.ads.zzahr r5 = r0.f24569e
            r5.mo41493c(r1)
        L_0x01cc:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x01ce:
            int r1 = r2 - r4
            long r4 = r0.f24571g
            com.google.android.gms.internal.ads.zzahg r8 = r0.f24570f
            long r9 = (long) r1
            long r4 = r4 - r9
            boolean r9 = r0.f24574j
            r8.mo41479b(r4, r1, r9)
            com.google.android.gms.internal.ads.zzahg r1 = r0.f24570f
            long r4 = r0.f24575k
            r1.mo41480c(r7, r4)
            r1 = r17
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahh.mo41468c(com.google.android.gms.internal.ads.zzef):void");
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24572h = zzaio.mo41516b();
        zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 2);
        this.f24573i = k;
        this.f24570f = new zzahg(k);
        this.f24565a.mo41519b(zzzl, zzaio);
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24575k = j;
        }
    }

    zzahh(@Nullable zzair zzair) {
        this.f24565a = zzair;
        this.f24567c = new boolean[4];
        this.f24568d = new zzahf(128);
        this.f24575k = -9223372036854775807L;
        this.f24569e = new zzahr(178, 128);
        this.f24566b = new zzef();
    }
}

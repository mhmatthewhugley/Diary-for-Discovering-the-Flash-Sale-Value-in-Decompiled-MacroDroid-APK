package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzagb implements zzagi {

    /* renamed from: a */
    private final zzagh f24379a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f24380b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f24381c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzagn f24382d;

    /* renamed from: e */
    private int f24383e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f24384f;

    /* renamed from: g */
    private long f24385g;

    /* renamed from: h */
    private long f24386h;

    /* renamed from: i */
    private long f24387i;

    /* renamed from: j */
    private long f24388j;

    /* renamed from: k */
    private long f24389k;

    /* renamed from: l */
    private long f24390l;

    public zzagb(zzagn zzagn, long j, long j2, long j3, long j4, boolean z) {
        zzdd.m47210d(j >= 0 && j2 > j);
        this.f24382d = zzagn;
        this.f24380b = j;
        this.f24381c = j2;
        if (j3 == j2 - j || z) {
            this.f24384f = j4;
            this.f24383e = 4;
        } else {
            this.f24383e = 0;
        }
        this.f24379a = new zzagh();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo41445a(com.google.android.gms.internal.ads.zzzj r24) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f24383e
            r3 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x00ea
            if (r2 == r3) goto L_0x00fd
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L_0x0015
            if (r2 == r10) goto L_0x00ab
            return r6
        L_0x0015:
            long r2 = r0.f24387i
            long r11 = r0.f24388j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0020
        L_0x001d:
            r11 = r6
            goto L_0x00a4
        L_0x0020:
            long r2 = r24.mo41252c()
            com.google.android.gms.internal.ads.zzagh r13 = r0.f24379a
            boolean r11 = r13.mo41459c(r1, r11)
            if (r11 != 0) goto L_0x003c
            long r11 = r0.f24387i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0034
            goto L_0x00a4
        L_0x0034:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x003c:
            com.google.android.gms.internal.ads.zzagh r11 = r0.f24379a
            r11.mo41458b(r1, r5)
            r24.mo48452h()
            long r11 = r0.f24386h
            com.google.android.gms.internal.ads.zzagh r13 = r0.f24379a
            long r14 = r13.f24408b
            long r11 = r11 - r14
            int r8 = r13.f24410d
            int r9 = r13.f24411e
            int r8 = r8 + r9
            r16 = 0
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x005e
            r16 = 72000(0x11940, double:3.55727E-319)
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x005e
            goto L_0x001d
        L_0x005e:
            if (r9 >= 0) goto L_0x0065
            r0.f24388j = r2
            r0.f24390l = r14
            goto L_0x006f
        L_0x0065:
            long r2 = r24.mo41252c()
            long r4 = (long) r8
            long r2 = r2 + r4
            r0.f24387i = r2
            r0.f24389k = r14
        L_0x006f:
            long r2 = r0.f24388j
            long r4 = r0.f24387i
            long r14 = r2 - r4
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r19 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0080
            r0.f24388j = r4
            r11 = r4
            goto L_0x00a4
        L_0x0080:
            long r6 = (long) r8
            if (r9 > 0) goto L_0x0086
            r8 = 2
            goto L_0x0088
        L_0x0086:
            r8 = 1
        L_0x0088:
            long r17 = r24.mo41252c()
            long r6 = r6 * r8
            long r17 = r17 - r6
            long r11 = r11 * r14
            long r6 = r0.f24390l
            long r8 = r0.f24389k
            long r6 = r6 - r8
            long r11 = r11 / r6
            long r17 = r17 + r11
            r6 = -1
            long r21 = r2 + r6
            r19 = r4
            long r11 = com.google.android.gms.internal.ads.zzen.m49155b0(r17, r19, r21)
        L_0x00a4:
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            return r11
        L_0x00a9:
            r0.f24383e = r10
        L_0x00ab:
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            r2.mo41459c(r1, r6)
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            r3 = 0
            r2.mo41458b(r1, r3)
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            long r3 = r2.f24408b
            long r5 = r0.f24386h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00cd
            r24.mo48452h()
            r1 = 4
            r0.f24383e = r1
            long r1 = r0.f24389k
            r4 = 2
            long r1 = r1 + r4
            long r1 = -r1
            return r1
        L_0x00cd:
            r4 = 2
            int r3 = r2.f24410d
            int r2 = r2.f24411e
            r6 = r1
            com.google.android.gms.internal.ads.zzyy r6 = (com.google.android.gms.internal.ads.zzyy) r6
            int r3 = r3 + r2
            r2 = 0
            r6.mo48459p(r3, r2)
            long r2 = r24.mo41252c()
            r0.f24387i = r2
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            long r2 = r2.f24408b
            r0.f24389k = r2
            r6 = -1
            goto L_0x00ab
        L_0x00ea:
            long r4 = r24.mo41252c()
            r0.f24385g = r4
            r0.f24383e = r3
            long r6 = r0.f24381c
            r8 = -65307(0xffffffffffff00e5, double:NaN)
            long r6 = r6 + r8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fd
            return r6
        L_0x00fd:
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            r2.mo41457a()
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            r4 = -1
            boolean r2 = r2.mo41459c(r1, r4)
            if (r2 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            r4 = 0
            r2.mo41458b(r1, r4)
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            int r5 = r2.f24410d
            int r2 = r2.f24411e
            r6 = r1
            com.google.android.gms.internal.ads.zzyy r6 = (com.google.android.gms.internal.ads.zzyy) r6
            int r5 = r5 + r2
            r6.mo48459p(r5, r4)
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            long r4 = r2.f24408b
        L_0x0123:
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            int r6 = r2.f24407a
            r7 = 4
            r6 = r6 & r7
            if (r6 == r7) goto L_0x0158
            r6 = -1
            boolean r2 = r2.mo41459c(r1, r6)
            if (r2 == 0) goto L_0x0158
            long r8 = r24.mo41252c()
            long r10 = r0.f24381c
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0158
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            boolean r2 = r2.mo41458b(r1, r3)
            if (r2 == 0) goto L_0x0158
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            int r8 = r2.f24410d
            int r2 = r2.f24411e
            int r8 = r8 + r2
            boolean r2 = com.google.android.gms.internal.ads.zzzm.m55543e(r1, r8)
            if (r2 != 0) goto L_0x0153
            goto L_0x0158
        L_0x0153:
            com.google.android.gms.internal.ads.zzagh r2 = r0.f24379a
            long r4 = r2.f24408b
            goto L_0x0123
        L_0x0158:
            r0.f24384f = r4
            r1 = 4
            r0.f24383e = r1
            long r1 = r0.f24385g
            return r1
        L_0x0160:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagb.mo41445a(com.google.android.gms.internal.ads.zzzj):long");
    }

    @Nullable
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ zzaal mo41446b() {
        if (this.f24384f != 0) {
            return new zzaga(this, (zzafz) null);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo41447c(long j) {
        this.f24386h = zzen.m49155b0(j, 0, this.f24384f - 1);
        this.f24383e = 2;
        this.f24387i = this.f24380b;
        this.f24388j = this.f24381c;
        this.f24389k = 0;
        this.f24390l = this.f24384f;
    }
}

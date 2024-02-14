package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzvq extends zzvn {

    /* renamed from: A */
    private final int f38722A;

    /* renamed from: B */
    private final int f38723B;

    /* renamed from: C */
    private final int f38724C;

    /* renamed from: D */
    private final boolean f38725D;

    /* renamed from: E */
    private final int f38726E;

    /* renamed from: F */
    private final boolean f38727F;

    /* renamed from: G */
    private final boolean f38728G;

    /* renamed from: H */
    private final int f38729H;

    /* renamed from: g */
    private final boolean f38730g;

    /* renamed from: o */
    private final zzvf f38731o;

    /* renamed from: p */
    private final boolean f38732p;

    /* renamed from: s */
    private final boolean f38733s;

    /* renamed from: z */
    private final int f38734z;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzvq(int r4, com.google.android.gms.internal.ads.zzcp r5, int r6, com.google.android.gms.internal.ads.zzvf r7, int r8, int r9, boolean r10) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            r3.f38731o = r7
            boolean r4 = r7.f38686F
            r5 = 1
            if (r5 == r4) goto L_0x000d
            r4 = 16
            goto L_0x000f
        L_0x000d:
            r4 = 24
        L_0x000f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 0
            if (r10 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzaf r0 = r3.f38719f
            int r1 = r0.f24218q
            float r0 = r0.f24220s
            int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0024
            r1 = 1325400064(0x4f000000, float:2.14748365E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r3.f38730g = r0
            r0 = -1
            if (r10 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzaf r10 = r3.f38719f
            int r1 = r10.f24218q
            if (r1 == r0) goto L_0x0034
            if (r1 < 0) goto L_0x004d
        L_0x0034:
            int r1 = r10.f24219r
            if (r1 == r0) goto L_0x003a
            if (r1 < 0) goto L_0x004d
        L_0x003a:
            float r1 = r10.f24220s
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0045
            r6 = 0
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x004d
        L_0x0045:
            int r6 = r10.f24209h
            if (r6 == r0) goto L_0x004b
            if (r6 < 0) goto L_0x004d
        L_0x004b:
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            r3.f38732p = r6
            boolean r6 = com.google.android.gms.internal.ads.zzvr.m55210r(r8, r9)
            r3.f38733s = r6
            com.google.android.gms.internal.ads.zzaf r6 = r3.f38719f
            int r10 = r6.f24209h
            r3.f38734z = r10
            int r6 = r6.mo41421a()
            r3.f38722A = r6
            com.google.android.gms.internal.ads.zzaf r6 = r3.f38719f
            int r6 = r6.f24206e
            int r6 = java.lang.Integer.bitCount(r9)
            r3.f38724C = r6
            com.google.android.gms.internal.ads.zzaf r6 = r3.f38719f
            int r6 = r6.f24206e
            r3.f38725D = r5
            r6 = 0
        L_0x0073:
            com.google.android.gms.internal.ads.zzfvn r10 = r7.f31562l
            int r10 = r10.size()
            if (r6 >= r10) goto L_0x0091
            com.google.android.gms.internal.ads.zzaf r10 = r3.f38719f
            java.lang.String r10 = r10.f24213l
            if (r10 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.zzfvn r1 = r7.f31562l
            java.lang.Object r1 = r1.get(r6)
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            int r6 = r6 + 1
            goto L_0x0073
        L_0x0091:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0094:
            r3.f38723B = r6
            r6 = r8 & 128(0x80, float:1.794E-43)
            r7 = 128(0x80, float:1.794E-43)
            if (r6 != r7) goto L_0x009e
            r6 = 1
            goto L_0x009f
        L_0x009e:
            r6 = 0
        L_0x009f:
            r3.f38727F = r6
            r6 = r8 & 64
            r7 = 64
            if (r6 != r7) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            r3.f38728G = r6
            com.google.android.gms.internal.ads.zzaf r6 = r3.f38719f
            java.lang.String r7 = r6.f24213l
            r10 = 3
            r1 = 2
            if (r7 != 0) goto L_0x00b6
        L_0x00b4:
            r10 = 0
            goto L_0x00f5
        L_0x00b6:
            int r2 = r7.hashCode()
            switch(r2) {
                case -1662735862: goto L_0x00dc;
                case -1662541442: goto L_0x00d2;
                case 1331836730: goto L_0x00c8;
                case 1599127257: goto L_0x00be;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            goto L_0x00e6
        L_0x00be:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 2
            goto L_0x00e7
        L_0x00c8:
            java.lang.String r2 = "video/avc"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 3
            goto L_0x00e7
        L_0x00d2:
            java.lang.String r2 = "video/hevc"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 1
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r2 = "video/av01"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 0
            goto L_0x00e7
        L_0x00e6:
            r7 = -1
        L_0x00e7:
            if (r7 == 0) goto L_0x00f4
            if (r7 == r5) goto L_0x00f5
            if (r7 == r1) goto L_0x00f2
            if (r7 == r10) goto L_0x00f0
            goto L_0x00b4
        L_0x00f0:
            r10 = 1
            goto L_0x00f5
        L_0x00f2:
            r10 = 2
            goto L_0x00f5
        L_0x00f4:
            r10 = 4
        L_0x00f5:
            r3.f38729H = r10
            com.google.android.gms.internal.ads.zzvf r7 = r3.f38731o
            boolean r10 = r7.f38694N
            boolean r10 = com.google.android.gms.internal.ads.zzvr.m55210r(r8, r10)
            if (r10 != 0) goto L_0x0103
        L_0x0101:
            r5 = 0
            goto L_0x0120
        L_0x0103:
            boolean r10 = r3.f38730g
            if (r10 != 0) goto L_0x010c
            boolean r7 = r7.f38684D
            if (r7 != 0) goto L_0x010c
            goto L_0x0101
        L_0x010c:
            boolean r7 = com.google.android.gms.internal.ads.zzvr.m55210r(r8, r9)
            if (r7 == 0) goto L_0x0120
            boolean r7 = r3.f38732p
            if (r7 == 0) goto L_0x0120
            if (r10 == 0) goto L_0x0120
            int r6 = r6.f24209h
            if (r6 == r0) goto L_0x0120
            r4 = r4 & r8
            if (r4 == 0) goto L_0x0120
            r5 = 2
        L_0x0120:
            r3.f38726E = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvq.<init>(int, com.google.android.gms.internal.ads.zzcp, int, com.google.android.gms.internal.ads.zzvf, int, int, boolean):void");
    }

    /* renamed from: e */
    public static /* synthetic */ int m55200e(zzvq zzvq, zzvq zzvq2) {
        zzfwv zzfwv;
        if (!zzvq.f38730g || !zzvq.f38733s) {
            zzfwv = zzvr.f38735k.mo46509a();
        } else {
            zzfwv = zzvr.f38735k;
        }
        zzfvc i = zzfvc.m51088i();
        Integer valueOf = Integer.valueOf(zzvq.f38734z);
        Integer valueOf2 = Integer.valueOf(zzvq2.f38734z);
        boolean z = zzvq.f38731o.f31573w;
        return i.mo46396c(valueOf, valueOf2, zzvr.f38736l).mo46396c(Integer.valueOf(zzvq.f38722A), Integer.valueOf(zzvq2.f38722A), zzfwv).mo46396c(Integer.valueOf(zzvq.f38734z), Integer.valueOf(zzvq2.f38734z), zzfwv).mo46394a();
    }

    /* renamed from: f */
    public static /* synthetic */ int m55201f(zzvq zzvq, zzvq zzvq2) {
        zzfvc c = zzfvc.m51088i().mo46397d(zzvq.f38733s, zzvq2.f38733s).mo46395b(zzvq.f38724C, zzvq2.f38724C).mo46397d(true, true).mo46397d(zzvq.f38730g, zzvq2.f38730g).mo46397d(zzvq.f38732p, zzvq2.f38732p).mo46396c(Integer.valueOf(zzvq.f38723B), Integer.valueOf(zzvq2.f38723B), zzfwv.m51208c().mo46509a());
        boolean z = zzvq.f38727F;
        zzfvc d = c.mo46397d(z, zzvq2.f38727F);
        boolean z2 = zzvq.f38728G;
        zzfvc d2 = d.mo46397d(z2, zzvq2.f38728G);
        if (z && z2) {
            d2 = d2.mo46395b(zzvq.f38729H, zzvq2.f38729H);
        }
        return d2.mo46394a();
    }

    /* renamed from: b */
    public final int mo48281b() {
        return this.f38726E;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo48283d(zzvn zzvn) {
        zzvq zzvq = (zzvq) zzvn;
        if (!zzen.m49181t(this.f38719f.f24213l, zzvq.f38719f.f24213l)) {
            return false;
        }
        boolean z = this.f38731o.f38687G;
        return this.f38727F == zzvq.f38727F && this.f38728G == zzvq.f38728G;
    }
}

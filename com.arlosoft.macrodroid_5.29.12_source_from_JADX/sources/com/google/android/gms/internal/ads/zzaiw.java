package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaiw implements zzzi {

    /* renamed from: h */
    public static final zzzp f24797h = zzais.f24774b;

    /* renamed from: a */
    private zzzl f24798a;

    /* renamed from: b */
    private zzaap f24799b;

    /* renamed from: c */
    private int f24800c = 0;

    /* renamed from: d */
    private long f24801d = -1;

    /* renamed from: e */
    private zzaiu f24802e;

    /* renamed from: f */
    private int f24803f = -1;

    /* renamed from: g */
    private long f24804g = -1;

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        return zzaiz.m41569c(zzzj);
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24798a = zzzl;
        this.f24799b = zzzl.mo41256k(0, 1);
        zzzl.mo41255j0();
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        this.f24800c = j == 0 ? 0 : 4;
        zzaiu zzaiu = this.f24802e;
        if (zzaiu != null) {
            zzaiu.mo41520c(j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        if (r1 != 65534) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41230h(com.google.android.gms.internal.ads.zzzj r19, com.google.android.gms.internal.ads.zzaai r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.gms.internal.ads.zzaap r2 = r0.f24799b
            com.google.android.gms.internal.ads.zzdd.m47208b(r2)
            int r2 = com.google.android.gms.internal.ads.zzen.f34500a
            int r2 = r0.f24800c
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0159
            r7 = 2
            r8 = -1
            if (r2 == r5) goto L_0x0124
            r10 = 3
            if (r2 == r7) goto L_0x00a2
            if (r2 == r10) goto L_0x003c
            long r10 = r0.f24804g
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzdd.m47212f(r5)
            long r4 = r0.f24804g
            long r7 = r19.mo41252c()
            long r4 = r4 - r7
            com.google.android.gms.internal.ads.zzaiu r2 = r0.f24802e
            java.util.Objects.requireNonNull(r2)
            boolean r1 = r2.mo41522e(r1, r4)
            if (r1 == 0) goto L_0x003b
            return r3
        L_0x003b:
            return r6
        L_0x003c:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzaiz.m41567a(r19)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.f24803f = r3
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r10 = r0.f24801d
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0062
            r2 = r10
        L_0x0062:
            int r5 = r0.f24803f
            long r10 = (long) r5
            long r10 = r10 + r2
            r0.f24804g = r10
            long r1 = r19.mo41253d()
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0095
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0095
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Data exceeds input length: "
            r3.append(r5)
            r3.append(r10)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "WavExtractor"
            com.google.android.gms.internal.ads.zzdw.m48255e(r5, r3)
            r0.f24804g = r1
            r10 = r1
        L_0x0095:
            com.google.android.gms.internal.ads.zzaiu r1 = r0.f24802e
            java.util.Objects.requireNonNull(r1)
            int r2 = r0.f24803f
            r1.mo41521d(r2, r10)
            r0.f24800c = r4
            return r6
        L_0x00a2:
            com.google.android.gms.internal.ads.zzaix r15 = com.google.android.gms.internal.ads.zzaiz.m41568b(r19)
            int r1 = r15.f24805a
            r2 = 17
            if (r1 != r2) goto L_0x00b8
            com.google.android.gms.internal.ads.zzait r1 = new com.google.android.gms.internal.ads.zzait
            com.google.android.gms.internal.ads.zzzl r2 = r0.f24798a
            com.google.android.gms.internal.ads.zzaap r3 = r0.f24799b
            r1.<init>(r2, r3, r15)
            r0.f24802e = r1
            goto L_0x010b
        L_0x00b8:
            r2 = 6
            if (r1 != r2) goto L_0x00cc
            com.google.android.gms.internal.ads.zzaiv r1 = new com.google.android.gms.internal.ads.zzaiv
            com.google.android.gms.internal.ads.zzzl r13 = r0.f24798a
            com.google.android.gms.internal.ads.zzaap r14 = r0.f24799b
            r17 = -1
            java.lang.String r16 = "audio/g711-alaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.f24802e = r1
            goto L_0x010b
        L_0x00cc:
            r2 = 7
            if (r1 != r2) goto L_0x00e0
            com.google.android.gms.internal.ads.zzaiv r1 = new com.google.android.gms.internal.ads.zzaiv
            com.google.android.gms.internal.ads.zzzl r13 = r0.f24798a
            com.google.android.gms.internal.ads.zzaap r14 = r0.f24799b
            r17 = -1
            java.lang.String r16 = "audio/g711-mlaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.f24802e = r1
            goto L_0x010b
        L_0x00e0:
            int r2 = r15.f24809e
            if (r1 == r5) goto L_0x00f5
            if (r1 == r10) goto L_0x00ee
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r3) goto L_0x00f5
        L_0x00eb:
            r17 = 0
            goto L_0x00fb
        L_0x00ee:
            r3 = 32
            if (r2 != r3) goto L_0x00eb
            r17 = 4
            goto L_0x00fb
        L_0x00f5:
            int r4 = com.google.android.gms.internal.ads.zzen.m49149X(r2)
            r17 = r4
        L_0x00fb:
            if (r17 == 0) goto L_0x010e
            com.google.android.gms.internal.ads.zzaiv r1 = new com.google.android.gms.internal.ads.zzaiv
            com.google.android.gms.internal.ads.zzzl r13 = r0.f24798a
            com.google.android.gms.internal.ads.zzaap r14 = r0.f24799b
            java.lang.String r16 = "audio/raw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.f24802e = r1
        L_0x010b:
            r0.f24800c = r10
            return r6
        L_0x010e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported WAV format type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44137c(r1)
            throw r1
        L_0x0124:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            r3 = 8
            r2.<init>((int) r3)
            com.google.android.gms.internal.ads.zzaiy r4 = com.google.android.gms.internal.ads.zzaiy.m41566a(r1, r2)
            int r5 = r4.f24811a
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x013a
            r19.mo48452h()
            goto L_0x0154
        L_0x013a:
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48458o(r3, r6)
            r2.mo45230f(r6)
            byte[] r5 = r2.mo45232h()
            r1.mo48454j(r5, r6, r3, r6)
            long r8 = r2.mo45248x()
            long r4 = r4.f24812b
            int r2 = (int) r4
            int r2 = r2 + r3
            r1.mo48459p(r2, r6)
        L_0x0154:
            r0.f24801d = r8
            r0.f24800c = r7
            return r6
        L_0x0159:
            long r7 = r19.mo41252c()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0165
            r2 = 1
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            com.google.android.gms.internal.ads.zzdd.m47212f(r2)
            int r2 = r0.f24803f
            if (r2 == r3) goto L_0x0175
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48459p(r2, r6)
            r0.f24800c = r4
            goto L_0x018c
        L_0x0175:
            boolean r2 = com.google.android.gms.internal.ads.zzaiz.m41569c(r19)
            if (r2 == 0) goto L_0x018d
            long r2 = r19.mo41251b()
            long r7 = r19.mo41252c()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            long r2 = r2 - r7
            int r3 = (int) r2
            r1.mo48459p(r3, r6)
            r0.f24800c = r5
        L_0x018c:
            return r6
        L_0x018d:
            r1 = 0
            java.lang.String r2 = "Unsupported or unrecognized wav file type."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiw.mo41230h(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }
}

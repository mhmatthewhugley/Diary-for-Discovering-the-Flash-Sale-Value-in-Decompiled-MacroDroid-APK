package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahl implements zzahc {

    /* renamed from: a */
    private final zzaid f24590a;

    /* renamed from: b */
    private final zzahr f24591b = new zzahr(7, 128);

    /* renamed from: c */
    private final zzahr f24592c = new zzahr(8, 128);

    /* renamed from: d */
    private final zzahr f24593d = new zzahr(6, 128);

    /* renamed from: e */
    private long f24594e;

    /* renamed from: f */
    private final boolean[] f24595f = new boolean[3];

    /* renamed from: g */
    private String f24596g;

    /* renamed from: h */
    private zzaap f24597h;

    /* renamed from: i */
    private zzahk f24598i;

    /* renamed from: j */
    private boolean f24599j;

    /* renamed from: k */
    private long f24600k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f24601l;

    /* renamed from: m */
    private final zzef f24602m = new zzef();

    public zzahl(zzaid zzaid, boolean z, boolean z2) {
        this.f24590a = zzaid;
    }

    /* renamed from: f */
    private final void m41443f(byte[] bArr, int i, int i2) {
        if (!this.f24599j) {
            this.f24591b.mo41491a(bArr, i, i2);
            this.f24592c.mo41491a(bArr, i, i2);
        }
        this.f24593d.mo41491a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24594e = 0;
        this.f24601l = false;
        this.f24600k = -9223372036854775807L;
        zzaaf.m40918e(this.f24595f);
        this.f24591b.mo41492b();
        this.f24592c.mo41492b();
        this.f24593d.mo41492b();
        zzahk zzahk = this.f24598i;
        if (zzahk != null) {
            zzahk.mo41484c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0181 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41468c(com.google.android.gms.internal.ads.zzef r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.gms.internal.ads.zzaap r1 = r0.f24597h
            com.google.android.gms.internal.ads.zzdd.m47208b(r1)
            int r1 = com.google.android.gms.internal.ads.zzen.f34500a
            int r1 = r20.mo45235k()
            int r2 = r20.mo45236l()
            byte[] r3 = r20.mo45232h()
            long r4 = r0.f24594e
            int r6 = r20.mo45233i()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f24594e = r4
            com.google.android.gms.internal.ads.zzaap r4 = r0.f24597h
            int r5 = r20.mo45233i()
            r6 = r20
            r4.mo41215e(r6, r5)
        L_0x002a:
            boolean[] r4 = r0.f24595f
            int r4 = com.google.android.gms.internal.ads.zzaaf.m40914a(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x0191
            int r5 = r4 + 3
            byte r6 = r3[r5]
            r10 = r6 & 31
            int r6 = r4 - r1
            if (r6 <= 0) goto L_0x003f
            r0.m41443f(r3, r1, r4)
        L_0x003f:
            int r14 = r2 - r4
            long r7 = r0.f24594e
            long r11 = (long) r14
            long r8 = r7 - r11
            if (r6 >= 0) goto L_0x004a
            int r4 = -r6
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            long r6 = r0.f24600k
            boolean r11 = r0.f24599j
            r12 = 4
            if (r11 == 0) goto L_0x0058
        L_0x0052:
            r18 = r2
            r17 = r5
            goto L_0x0137
        L_0x0058:
            com.google.android.gms.internal.ads.zzahr r11 = r0.f24591b
            r11.mo41494d(r4)
            com.google.android.gms.internal.ads.zzahr r11 = r0.f24592c
            r11.mo41494d(r4)
            boolean r11 = r0.f24599j
            if (r11 != 0) goto L_0x00fc
            com.google.android.gms.internal.ads.zzahr r11 = r0.f24591b
            boolean r11 = r11.mo41495e()
            if (r11 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.zzahr r11 = r0.f24592c
            boolean r11 = r11.mo41495e()
            if (r11 == 0) goto L_0x0052
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.gms.internal.ads.zzahr r13 = r0.f24591b
            byte[] r15 = r13.f24672d
            int r13 = r13.f24673e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.zzahr r13 = r0.f24592c
            byte[] r15 = r13.f24672d
            int r13 = r13.f24673e
            byte[] r13 = java.util.Arrays.copyOf(r15, r13)
            r11.add(r13)
            com.google.android.gms.internal.ads.zzahr r13 = r0.f24591b
            byte[] r15 = r13.f24672d
            int r13 = r13.f24673e
            com.google.android.gms.internal.ads.zzaae r13 = com.google.android.gms.internal.ads.zzaaf.m40917d(r15, r12, r13)
            com.google.android.gms.internal.ads.zzahr r15 = r0.f24592c
            byte[] r1 = r15.f24672d
            int r15 = r15.f24673e
            com.google.android.gms.internal.ads.zzaad r1 = com.google.android.gms.internal.ads.zzaaf.m40916c(r1, r12, r15)
            int r15 = r13.f23718a
            int r12 = r13.f23719b
            r17 = r5
            int r5 = r13.f23720c
            java.lang.String r5 = com.google.android.gms.internal.ads.zzdf.m47279a(r15, r12, r5)
            com.google.android.gms.internal.ads.zzaap r12 = r0.f24597h
            com.google.android.gms.internal.ads.zzad r15 = new com.google.android.gms.internal.ads.zzad
            r15.<init>()
            r18 = r2
            java.lang.String r2 = r0.f24596g
            r15.mo41331h(r2)
            java.lang.String r2 = "video/avc"
            r15.mo41343s(r2)
            r15.mo41328f0(r5)
            int r2 = r13.f23722e
            r15.mo41348x(r2)
            int r2 = r13.f23723f
            r15.mo41327f(r2)
            float r2 = r13.f23724g
            r15.mo41340p(r2)
            r15.mo41333i(r11)
            com.google.android.gms.internal.ads.zzaf r2 = r15.mo41349y()
            r12.mo41214d(r2)
            r2 = 1
            r0.f24599j = r2
            com.google.android.gms.internal.ads.zzahk r2 = r0.f24598i
            r2.mo41483b(r13)
            com.google.android.gms.internal.ads.zzahk r2 = r0.f24598i
            r2.mo41482a(r1)
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24591b
            r1.mo41492b()
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24592c
            r1.mo41492b()
            goto L_0x0137
        L_0x00fc:
            r18 = r2
            r17 = r5
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24591b
            boolean r2 = r1.mo41495e()
            if (r2 == 0) goto L_0x011c
            byte[] r2 = r1.f24672d
            int r1 = r1.f24673e
            r5 = 4
            com.google.android.gms.internal.ads.zzaae r1 = com.google.android.gms.internal.ads.zzaaf.m40917d(r2, r5, r1)
            com.google.android.gms.internal.ads.zzahk r2 = r0.f24598i
            r2.mo41483b(r1)
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24591b
            r1.mo41492b()
            goto L_0x0137
        L_0x011c:
            r5 = 4
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24592c
            boolean r2 = r1.mo41495e()
            if (r2 == 0) goto L_0x0137
            byte[] r2 = r1.f24672d
            int r1 = r1.f24673e
            com.google.android.gms.internal.ads.zzaad r1 = com.google.android.gms.internal.ads.zzaaf.m40916c(r2, r5, r1)
            com.google.android.gms.internal.ads.zzahk r2 = r0.f24598i
            r2.mo41482a(r1)
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24592c
            r1.mo41492b()
        L_0x0137:
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24593d
            boolean r1 = r1.mo41494d(r4)
            if (r1 == 0) goto L_0x015f
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24593d
            byte[] r2 = r1.f24672d
            int r1 = r1.f24673e
            int r1 = com.google.android.gms.internal.ads.zzaaf.m40915b(r2, r1)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24602m
            com.google.android.gms.internal.ads.zzahr r4 = r0.f24593d
            byte[] r4 = r4.f24672d
            r2.mo45228d(r4, r1)
            com.google.android.gms.internal.ads.zzef r1 = r0.f24602m
            r2 = 4
            r1.mo45230f(r2)
            com.google.android.gms.internal.ads.zzaid r1 = r0.f24590a
            com.google.android.gms.internal.ads.zzef r2 = r0.f24602m
            r1.mo41509a(r6, r2)
        L_0x015f:
            com.google.android.gms.internal.ads.zzahk r11 = r0.f24598i
            boolean r15 = r0.f24599j
            boolean r1 = r0.f24601l
            r12 = r8
            r16 = r1
            boolean r1 = r11.mo41486e(r12, r14, r15, r16)
            if (r1 == 0) goto L_0x0171
            r1 = 0
            r0.f24601l = r1
        L_0x0171:
            long r11 = r0.f24600k
            boolean r1 = r0.f24599j
            if (r1 != 0) goto L_0x0181
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24591b
            r1.mo41493c(r10)
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24592c
            r1.mo41493c(r10)
        L_0x0181:
            com.google.android.gms.internal.ads.zzahr r1 = r0.f24593d
            r1.mo41493c(r10)
            com.google.android.gms.internal.ads.zzahk r7 = r0.f24598i
            r7.mo41485d(r8, r10, r11)
            r1 = r17
            r2 = r18
            goto L_0x002a
        L_0x0191:
            r0.m41443f(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahl.mo41468c(com.google.android.gms.internal.ads.zzef):void");
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24596g = zzaio.mo41516b();
        zzaap k = zzzl.mo41256k(zzaio.mo41515a(), 2);
        this.f24597h = k;
        this.f24598i = new zzahk(k, false, false);
        this.f24590a.mo41510b(zzzl, zzaio);
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24600k = j;
        }
        this.f24601l |= (i & 2) != 0;
    }
}

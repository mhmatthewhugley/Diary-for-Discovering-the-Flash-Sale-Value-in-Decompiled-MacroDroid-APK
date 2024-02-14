package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaeq implements zzzi {

    /* renamed from: q */
    public static final zzzp f24148q = zzaeo.f24146b;

    /* renamed from: r */
    private static final zzada f24149r = zzaep.f24147a;

    /* renamed from: a */
    private final zzef f24150a;

    /* renamed from: b */
    private final zzaab f24151b;

    /* renamed from: c */
    private final zzzx f24152c;

    /* renamed from: d */
    private final zzzz f24153d;

    /* renamed from: e */
    private final zzaap f24154e;

    /* renamed from: f */
    private zzzl f24155f;

    /* renamed from: g */
    private zzaap f24156g;

    /* renamed from: h */
    private zzaap f24157h;

    /* renamed from: i */
    private int f24158i;
    @Nullable

    /* renamed from: j */
    private zzbq f24159j;

    /* renamed from: k */
    private long f24160k;

    /* renamed from: l */
    private long f24161l;

    /* renamed from: m */
    private long f24162m;

    /* renamed from: n */
    private int f24163n;

    /* renamed from: o */
    private zzaes f24164o;

    /* renamed from: p */
    private boolean f24165p;

    public zzaeq() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0163  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m41193c(com.google.android.gms.internal.ads.zzzj r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f24158i
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m41198k(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.zzaes r2 = r0.f24164o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x01bd
            com.google.android.gms.internal.ads.zzef r14 = new com.google.android.gms.internal.ads.zzef
            com.google.android.gms.internal.ads.zzaab r2 = r0.f24151b
            int r2 = r2.f23705c
            r14.<init>((int) r2)
            byte[] r2 = r14.mo45232h()
            com.google.android.gms.internal.ads.zzaab r9 = r0.f24151b
            int r9 = r9.f23705c
            r10 = r1
            com.google.android.gms.internal.ads.zzyy r10 = (com.google.android.gms.internal.ads.zzyy) r10
            r10.mo48454j(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.zzaab r2 = r0.f24151b
            int r9 = r2.f23703a
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x0042
            int r2 = r2.f23707e
            if (r2 == r8) goto L_0x0046
            r2 = 36
            goto L_0x004d
        L_0x0042:
            int r2 = r2.f23707e
            if (r2 == r8) goto L_0x0049
        L_0x0046:
            r2 = 21
            goto L_0x004d
        L_0x0049:
            r11 = 13
            r2 = 13
        L_0x004d:
            int r9 = r14.mo45236l()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x006f
            r14.mo45230f(r2)
            int r9 = r14.mo45237m()
            if (r9 == r12) goto L_0x006d
            if (r9 != r15) goto L_0x006f
            r11 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x0085
        L_0x006d:
            r11 = r9
            goto L_0x0085
        L_0x006f:
            int r9 = r14.mo45236l()
            r11 = 40
            if (r9 < r11) goto L_0x0084
            r14.mo45230f(r10)
            int r9 = r14.mo45237m()
            if (r9 != r13) goto L_0x0084
            r11 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            if (r11 == r12) goto L_0x00aa
            if (r11 != r15) goto L_0x008a
            goto L_0x00aa
        L_0x008a:
            if (r11 != r13) goto L_0x00a5
            long r9 = r17.mo41253d()
            long r11 = r17.mo41252c()
            com.google.android.gms.internal.ads.zzaab r13 = r0.f24151b
            com.google.android.gms.internal.ads.zzaet r2 = com.google.android.gms.internal.ads.zzaet.m41206a(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.zzaab r9 = r0.f24151b
            int r9 = r9.f23705c
            r10 = r1
            com.google.android.gms.internal.ads.zzyy r10 = (com.google.android.gms.internal.ads.zzyy) r10
            r10.mo48459p(r9, r4)
            goto L_0x010d
        L_0x00a5:
            r17.mo48452h()
            r2 = 0
            goto L_0x010d
        L_0x00aa:
            long r9 = r17.mo41253d()
            long r12 = r17.mo41252c()
            com.google.android.gms.internal.ads.zzaab r8 = r0.f24151b
            r7 = r11
            r11 = r12
            r13 = r8
            com.google.android.gms.internal.ads.zzaeu r8 = com.google.android.gms.internal.ads.zzaeu.m41211a(r9, r11, r13, r14)
            if (r8 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.zzzx r9 = r0.f24152c
            boolean r9 = r9.mo48471a()
            if (r9 != 0) goto L_0x00f3
            r17.mo48452h()
            r9 = r1
            com.google.android.gms.internal.ads.zzyy r9 = (com.google.android.gms.internal.ads.zzyy) r9
            int r2 = r2 + 141
            r9.mo48458o(r2, r4)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24150a
            byte[] r2 = r2.mo45232h()
            r10 = 3
            r9.mo48454j(r2, r4, r10, r4)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24150a
            r2.mo45230f(r4)
            com.google.android.gms.internal.ads.zzzx r2 = r0.f24152c
            com.google.android.gms.internal.ads.zzef r9 = r0.f24150a
            int r9 = r9.mo45245u()
            int r10 = r9 >> 12
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r10 > 0) goto L_0x00ef
            if (r9 <= 0) goto L_0x00f3
        L_0x00ef:
            r2.f39064a = r10
            r2.f39065b = r9
        L_0x00f3:
            com.google.android.gms.internal.ads.zzaab r2 = r0.f24151b
            int r2 = r2.f23705c
            r9 = r1
            com.google.android.gms.internal.ads.zzyy r9 = (com.google.android.gms.internal.ads.zzyy) r9
            r9.mo48459p(r2, r4)
            if (r8 == 0) goto L_0x010c
            boolean r2 = r8.mo41195e()
            if (r2 != 0) goto L_0x010c
            if (r7 != r15) goto L_0x010c
            com.google.android.gms.internal.ads.zzaes r2 = r0.m41195f(r1, r4)
            goto L_0x010d
        L_0x010c:
            r2 = r8
        L_0x010d:
            com.google.android.gms.internal.ads.zzbq r7 = r0.f24159j
            long r8 = r17.mo41252c()
            if (r7 == 0) goto L_0x0158
            int r10 = r7.mo42875a()
            r11 = 0
        L_0x011a:
            if (r11 >= r10) goto L_0x0158
            com.google.android.gms.internal.ads.zzbp r12 = r7.mo42876b(r11)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.zzadh
            if (r13 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzadh r12 = (com.google.android.gms.internal.ads.zzadh) r12
            int r10 = r7.mo42875a()
            r11 = 0
        L_0x012b:
            if (r11 >= r10) goto L_0x014f
            com.google.android.gms.internal.ads.zzbp r13 = r7.mo42876b(r11)
            boolean r14 = r13 instanceof com.google.android.gms.internal.ads.zzadl
            if (r14 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzadl r13 = (com.google.android.gms.internal.ads.zzadl) r13
            java.lang.String r14 = r13.f23988a
            java.lang.String r15 = "TLEN"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x014c
            java.lang.String r7 = r13.f24000d
            long r10 = java.lang.Long.parseLong(r7)
            long r10 = com.google.android.gms.internal.ads.zzen.m49163f0(r10)
            goto L_0x0150
        L_0x014c:
            int r11 = r11 + 1
            goto L_0x012b
        L_0x014f:
            r10 = r5
        L_0x0150:
            com.google.android.gms.internal.ads.zzaen r7 = com.google.android.gms.internal.ads.zzaen.m41186a(r8, r12, r10)
            goto L_0x0159
        L_0x0155:
            int r11 = r11 + 1
            goto L_0x011a
        L_0x0158:
            r7 = 0
        L_0x0159:
            boolean r8 = r0.f24165p
            if (r8 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzaer r2 = new com.google.android.gms.internal.ads.zzaer
            r2.<init>()
            goto L_0x0174
        L_0x0163:
            if (r7 == 0) goto L_0x0167
            r2 = r7
            goto L_0x016a
        L_0x0167:
            if (r2 != 0) goto L_0x016a
            r2 = 0
        L_0x016a:
            if (r2 == 0) goto L_0x0170
            r2.mo41195e()
            goto L_0x0174
        L_0x0170:
            com.google.android.gms.internal.ads.zzaes r2 = r0.m41195f(r1, r4)
        L_0x0174:
            r0.f24164o = r2
            com.google.android.gms.internal.ads.zzzl r7 = r0.f24155f
            r7.mo41254h(r2)
            com.google.android.gms.internal.ads.zzaap r2 = r0.f24157h
            com.google.android.gms.internal.ads.zzad r7 = new com.google.android.gms.internal.ads.zzad
            r7.<init>()
            com.google.android.gms.internal.ads.zzaab r8 = r0.f24151b
            java.lang.String r8 = r8.f23704b
            r7.mo41343s(r8)
            r8 = 4096(0x1000, float:5.74E-42)
            r7.mo41336l(r8)
            com.google.android.gms.internal.ads.zzaab r8 = r0.f24151b
            int r8 = r8.f23707e
            r7.mo41326e0(r8)
            com.google.android.gms.internal.ads.zzaab r8 = r0.f24151b
            int r8 = r8.f23706d
            r7.mo41344t(r8)
            com.google.android.gms.internal.ads.zzzx r8 = r0.f24152c
            int r8 = r8.f39064a
            r7.mo41321c(r8)
            com.google.android.gms.internal.ads.zzzx r8 = r0.f24152c
            int r8 = r8.f39065b
            r7.mo41323d(r8)
            com.google.android.gms.internal.ads.zzbq r8 = r0.f24159j
            r7.mo41337m(r8)
            com.google.android.gms.internal.ads.zzaf r7 = r7.mo41349y()
            r2.mo41214d(r7)
            long r7 = r17.mo41252c()
            r0.f24162m = r7
            goto L_0x01d5
        L_0x01bd:
            long r7 = r0.f24162m
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01d5
            long r9 = r17.mo41252c()
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x01d5
            r2 = r1
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            long r7 = r7 - r9
            int r8 = (int) r7
            r2.mo48459p(r8, r4)
        L_0x01d5:
            int r2 = r0.f24163n
            if (r2 != 0) goto L_0x0239
            r17.mo48452h()
            boolean r2 = r16.m41197j(r17)
            if (r2 == 0) goto L_0x01e3
            goto L_0x024b
        L_0x01e3:
            com.google.android.gms.internal.ads.zzef r2 = r0.f24150a
            r2.mo45230f(r4)
            com.google.android.gms.internal.ads.zzef r2 = r0.f24150a
            int r2 = r2.mo45237m()
            int r7 = r0.f24158i
            long r7 = (long) r7
            boolean r7 = m41196i(r2, r7)
            if (r7 == 0) goto L_0x0230
            int r7 = com.google.android.gms.internal.ads.zzaac.m40902b(r2)
            if (r7 != r3) goto L_0x01fe
            goto L_0x0230
        L_0x01fe:
            com.google.android.gms.internal.ads.zzaab r7 = r0.f24151b
            r7.mo41196a(r2)
            long r7 = r0.f24160k
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0215
            com.google.android.gms.internal.ads.zzaes r2 = r0.f24164o
            long r5 = r17.mo41252c()
            long r5 = r2.mo41412f(r5)
            r0.f24160k = r5
        L_0x0215:
            com.google.android.gms.internal.ads.zzaab r2 = r0.f24151b
            int r5 = r2.f23705c
            r0.f24163n = r5
            com.google.android.gms.internal.ads.zzaes r6 = r0.f24164o
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.zzaem
            if (r7 != 0) goto L_0x0223
            r2 = r5
            goto L_0x0239
        L_0x0223:
            com.google.android.gms.internal.ads.zzaem r6 = (com.google.android.gms.internal.ads.zzaem) r6
            long r3 = r0.f24161l
            int r1 = r2.f23709g
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.m41194e(r3)
            r1 = 0
            throw r1
        L_0x0230:
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r5 = 1
            r1.mo48459p(r5, r4)
            r0.f24158i = r4
            goto L_0x024a
        L_0x0239:
            r5 = 1
            com.google.android.gms.internal.ads.zzaap r6 = r0.f24157h
            int r1 = r6.mo41211a(r1, r2, r5)
            if (r1 != r3) goto L_0x0243
            goto L_0x024b
        L_0x0243:
            int r2 = r0.f24163n
            int r2 = r2 - r1
            r0.f24163n = r2
            if (r2 <= 0) goto L_0x024c
        L_0x024a:
            r3 = 0
        L_0x024b:
            return r3
        L_0x024c:
            com.google.android.gms.internal.ads.zzaap r5 = r0.f24157h
            long r1 = r0.f24161l
            long r6 = r0.m41194e(r1)
            r8 = 1
            com.google.android.gms.internal.ads.zzaab r1 = r0.f24151b
            int r9 = r1.f23705c
            r10 = 0
            r11 = 0
            r5.mo41216f(r6, r8, r9, r10, r11)
            long r1 = r0.f24161l
            com.google.android.gms.internal.ads.zzaab r3 = r0.f24151b
            int r3 = r3.f23709g
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.f24161l = r1
            r0.f24163n = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeq.m41193c(com.google.android.gms.internal.ads.zzzj):int");
    }

    /* renamed from: e */
    private final long m41194e(long j) {
        return this.f24160k + ((j * 1000000) / ((long) this.f24151b.f23706d));
    }

    /* renamed from: f */
    private final zzaes m41195f(zzzj zzzj, boolean z) throws IOException {
        ((zzyy) zzzj).mo48454j(this.f24150a.mo45232h(), 0, 4, false);
        this.f24150a.mo45230f(0);
        this.f24151b.mo41196a(this.f24150a.mo45237m());
        return new zzael(zzzj.mo41253d(), zzzj.mo41252c(), this.f24151b, false);
    }

    /* renamed from: i */
    private static boolean m41196i(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: j */
    private final boolean m41197j(zzzj zzzj) throws IOException {
        zzaes zzaes = this.f24164o;
        if (zzaes != null) {
            long zzb = zzaes.zzb();
            if (zzb != -1 && zzzj.mo41251b() > zzb - 4) {
                return true;
            }
        }
        try {
            return !zzzj.mo48454j(this.f24150a.mo45232h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: k */
    private final boolean m41198k(zzzj zzzj, boolean z) throws IOException {
        int i;
        int i2;
        int b;
        int i3 = true != z ? 131072 : 32768;
        zzzj.mo48452h();
        if (zzzj.mo41252c() == 0) {
            zzbq a = this.f24153d.mo48473a(zzzj, (zzada) null);
            this.f24159j = a;
            if (a != null) {
                this.f24152c.mo48472b(a);
            }
            i = (int) zzzj.mo41251b();
            if (!z) {
                ((zzyy) zzzj).mo48459p(i, false);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m41197j(zzzj)) {
                this.f24150a.mo45230f(0);
                int m = this.f24150a.mo45237m();
                if ((i2 == 0 || m41196i(m, (long) i2)) && (b = zzaac.m40902b(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f24151b.mo41196a(m);
                        i2 = m;
                    }
                    ((zzyy) zzzj).mo48458o(b - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            zzzj.mo48452h();
                            ((zzyy) zzzj).mo48458o(i + i6, false);
                        } else {
                            ((zzyy) zzzj).mo48459p(1, false);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw zzbu.m44135a("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzyy) zzzj).mo48459p(i + i5, false);
        } else {
            zzzj.mo48452h();
        }
        this.f24158i = i2;
        return true;
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        return m41198k(zzzj, true);
    }

    /* renamed from: b */
    public final void mo41414b() {
        this.f24165p = true;
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24155f = zzzl;
        zzaap k = zzzl.mo41256k(0, 1);
        this.f24156g = k;
        this.f24157h = k;
        this.f24155f.mo41255j0();
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        this.f24158i = 0;
        this.f24160k = -9223372036854775807L;
        this.f24161l = 0;
        this.f24163n = 0;
        zzaes zzaes = this.f24164o;
        if (zzaes instanceof zzaem) {
            zzaem zzaem = (zzaem) zzaes;
            throw null;
        }
    }

    /* renamed from: h */
    public final int mo41230h(zzzj zzzj, zzaai zzaai) throws IOException {
        zzdd.m47208b(this.f24156g);
        int i = zzen.f34500a;
        int c = m41193c(zzzj);
        if (c == -1 && (this.f24164o instanceof zzaem)) {
            if (this.f24164o.mo41193b() != m41194e(this.f24161l)) {
                zzaem zzaem = (zzaem) this.f24164o;
                throw null;
            }
        }
        return c;
    }

    public zzaeq(int i) {
        this.f24150a = new zzef(10);
        this.f24151b = new zzaab();
        this.f24152c = new zzzx();
        this.f24160k = -9223372036854775807L;
        this.f24153d = new zzzz();
        zzzh zzzh = new zzzh();
        this.f24154e = zzzh;
        this.f24157h = zzzh;
    }
}

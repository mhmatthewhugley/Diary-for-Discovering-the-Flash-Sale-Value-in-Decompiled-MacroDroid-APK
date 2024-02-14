package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaax implements zzzi {

    /* renamed from: n */
    public static final zzzp f23767n = zzaaw.f23766b;

    /* renamed from: o */
    private static final int[] f23768o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: p */
    private static final int[] f23769p;

    /* renamed from: q */
    private static final byte[] f23770q = zzen.m49127B("#!AMR\n");

    /* renamed from: r */
    private static final byte[] f23771r = zzen.m49127B("#!AMR-WB\n");

    /* renamed from: s */
    private static final int f23772s;

    /* renamed from: a */
    private final byte[] f23773a;

    /* renamed from: b */
    private boolean f23774b;

    /* renamed from: c */
    private long f23775c;

    /* renamed from: d */
    private int f23776d;

    /* renamed from: e */
    private int f23777e;

    /* renamed from: f */
    private boolean f23778f;

    /* renamed from: g */
    private int f23779g;

    /* renamed from: h */
    private int f23780h;

    /* renamed from: i */
    private long f23781i;

    /* renamed from: j */
    private zzzl f23782j;

    /* renamed from: k */
    private zzaap f23783k;

    /* renamed from: l */
    private zzaal f23784l;

    /* renamed from: m */
    private boolean f23785m;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f23769p = iArr;
        f23772s = iArr[8];
    }

    public zzaax() {
        this(0);
    }

    public zzaax(int i) {
        this.f23773a = new byte[1];
        this.f23779g = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ EOFException -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[Catch:{ EOFException -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m40958b(com.google.android.gms.internal.ads.zzzj r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f23777e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0091
            r12.mo48452h()     // Catch:{ EOFException -> 0x0090 }
            byte[] r0 = r11.f23773a     // Catch:{ EOFException -> 0x0090 }
            r4 = r12
            com.google.android.gms.internal.ads.zzyy r4 = (com.google.android.gms.internal.ads.zzyy) r4     // Catch:{ EOFException -> 0x0090 }
            r4.mo48454j(r0, r3, r2, r3)     // Catch:{ EOFException -> 0x0090 }
            byte[] r0 = r11.f23773a     // Catch:{ EOFException -> 0x0090 }
            byte r0 = r0[r3]     // Catch:{ EOFException -> 0x0090 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L_0x007a
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.f23774b     // Catch:{ EOFException -> 0x0090 }
            if (r4 == 0) goto L_0x002c
            r6 = 10
            if (r0 < r6) goto L_0x0037
            r6 = 13
            if (r0 <= r6) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            if (r4 != 0) goto L_0x0055
            r6 = 12
            if (r0 < r6) goto L_0x0037
            r6 = 14
            if (r0 > r6) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            if (r4 == 0) goto L_0x003e
            int[] r4 = f23769p     // Catch:{ EOFException -> 0x0090 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0090 }
            goto L_0x0042
        L_0x003e:
            int[] r4 = f23768o     // Catch:{ EOFException -> 0x0090 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0090 }
        L_0x0042:
            r11.f23776d = r0     // Catch:{ EOFException -> 0x0090 }
            r11.f23777e = r0
            int r4 = r11.f23779g
            if (r4 != r1) goto L_0x004d
            r11.f23779g = r0
            r4 = r0
        L_0x004d:
            if (r4 != r0) goto L_0x0091
            int r4 = r11.f23780h
            int r4 = r4 + r2
            r11.f23780h = r4
            goto L_0x0091
        L_0x0055:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L_0x005c
            r12 = r3
        L_0x005c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0090 }
            r2.<init>()     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch:{ EOFException -> 0x0090 }
            r2.append(r12)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch:{ EOFException -> 0x0090 }
            r2.append(r0)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = r2.toString()     // Catch:{ EOFException -> 0x0090 }
            com.google.android.gms.internal.ads.zzbu r12 = com.google.android.gms.internal.ads.zzbu.m44135a(r12, r5)     // Catch:{ EOFException -> 0x0090 }
            throw r12     // Catch:{ EOFException -> 0x0090 }
        L_0x007a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0090 }
            r12.<init>()     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch:{ EOFException -> 0x0090 }
            r12.append(r0)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = r12.toString()     // Catch:{ EOFException -> 0x0090 }
            com.google.android.gms.internal.ads.zzbu r12 = com.google.android.gms.internal.ads.zzbu.m44135a(r12, r5)     // Catch:{ EOFException -> 0x0090 }
            throw r12     // Catch:{ EOFException -> 0x0090 }
        L_0x0090:
            return r1
        L_0x0091:
            com.google.android.gms.internal.ads.zzaap r4 = r11.f23783k
            int r12 = com.google.android.gms.internal.ads.zzaan.m40937a(r4, r12, r0, r2)
            if (r12 != r1) goto L_0x009a
            return r1
        L_0x009a:
            int r0 = r11.f23777e
            int r0 = r0 - r12
            r11.f23777e = r0
            if (r0 <= 0) goto L_0x00a2
            return r3
        L_0x00a2:
            com.google.android.gms.internal.ads.zzaap r4 = r11.f23783k
            long r5 = r11.f23775c
            r7 = 1
            int r8 = r11.f23776d
            r9 = 0
            r10 = 0
            r4.mo41216f(r5, r7, r8, r9, r10)
            long r0 = r11.f23775c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f23775c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaax.m40958b(com.google.android.gms.internal.ads.zzzj):int");
    }

    /* renamed from: c */
    private static boolean m40959c(zzzj zzzj, byte[] bArr) throws IOException {
        zzzj.mo48452h();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzyy) zzzj).mo48454j(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: e */
    private final boolean m40960e(zzzj zzzj) throws IOException {
        byte[] bArr = f23770q;
        if (m40959c(zzzj, bArr)) {
            this.f23774b = false;
            ((zzyy) zzzj).mo48459p(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f23771r;
        if (!m40959c(zzzj, bArr2)) {
            return false;
        }
        this.f23774b = true;
        ((zzyy) zzzj).mo48459p(bArr2.length, false);
        return true;
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        return m40960e(zzzj);
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f23782j = zzzl;
        this.f23783k = zzzl.mo41256k(0, 1);
        zzzl.mo41255j0();
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        this.f23775c = 0;
        this.f23776d = 0;
        this.f23777e = 0;
        this.f23781i = 0;
    }

    /* renamed from: h */
    public final int mo41230h(zzzj zzzj, zzaai zzaai) throws IOException {
        zzdd.m47208b(this.f23783k);
        int i = zzen.f34500a;
        if (zzzj.mo41252c() != 0 || m40960e(zzzj)) {
            if (!this.f23785m) {
                this.f23785m = true;
                boolean z = this.f23774b;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                zzaap zzaap = this.f23783k;
                zzad zzad = new zzad();
                zzad.mo41343s(str);
                zzad.mo41336l(f23772s);
                zzad.mo41326e0(1);
                zzad.mo41344t(i2);
                zzaap.mo41214d(zzad.mo41349y());
            }
            int b = m40958b(zzzj);
            if (this.f23778f) {
                return b;
            }
            zzaak zzaak = new zzaak(-9223372036854775807L, 0);
            this.f23784l = zzaak;
            this.f23782j.mo41254h(zzaak);
            this.f23778f = true;
            return b;
        }
        throw zzbu.m44135a("Could not find AMR header.", (Throwable) null);
    }
}

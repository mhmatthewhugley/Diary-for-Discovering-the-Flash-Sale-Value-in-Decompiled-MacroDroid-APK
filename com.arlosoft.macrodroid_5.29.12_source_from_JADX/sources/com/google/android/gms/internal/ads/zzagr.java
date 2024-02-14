package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzagr implements zzzi {

    /* renamed from: d */
    public static final zzzp f24443d = zzagq.f24442b;

    /* renamed from: a */
    private final zzags f24444a = new zzags((String) null);

    /* renamed from: b */
    private final zzef f24445b = new zzef(2786);

    /* renamed from: c */
    private boolean f24446c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r9.mo48452h();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if ((r5 - r3) >= 8192) goto L_0x004c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41227a(com.google.android.gms.internal.ads.zzzj r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzef r0 = new com.google.android.gms.internal.ads.zzef
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo45232h()
            r5 = r9
            com.google.android.gms.internal.ads.zzyy r5 = (com.google.android.gms.internal.ads.zzyy) r5
            r5.mo48454j(r4, r2, r1, r2)
            r0.mo45230f(r2)
            int r4 = r0.mo45245u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L_0x0065
            r9.mo48452h()
            r4 = r9
            com.google.android.gms.internal.ads.zzyy r4 = (com.google.android.gms.internal.ads.zzyy) r4
            r4.mo48458o(r3, r2)
            r5 = r3
        L_0x0029:
            r1 = 0
        L_0x002a:
            byte[] r6 = r0.mo45232h()
            r7 = 6
            r4.mo48454j(r6, r2, r7, r2)
            r0.mo45230f(r2)
            int r6 = r0.mo45247w()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L_0x004d
            r9.mo48452h()
            int r5 = r5 + 1
            int r1 = r5 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x004c
            r4.mo48458o(r5, r2)
            goto L_0x0029
        L_0x004c:
            return r2
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.mo45232h()
            int r6 = com.google.android.gms.internal.ads.zzyj.m55428b(r6)
            r7 = -1
            if (r6 != r7) goto L_0x005f
            return r2
        L_0x005f:
            int r6 = r6 + -6
            r4.mo48458o(r6, r2)
            goto L_0x002a
        L_0x0065:
            r4 = 3
            r0.mo45231g(r4)
            int r4 = r0.mo45242r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo48458o(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagr.mo41227a(com.google.android.gms.internal.ads.zzzj):boolean");
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f24444a.mo41469d(zzzl, new zzaio(Integer.MIN_VALUE, 0, 1));
        zzzl.mo41255j0();
        zzzl.mo41254h(new zzaak(-9223372036854775807L, 0));
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        this.f24446c = false;
        this.f24444a.mo41467b();
    }

    /* renamed from: h */
    public final int mo41230h(zzzj zzzj, zzaai zzaai) throws IOException {
        int e = zzzj.mo43927e(this.f24445b.mo45232h(), 0, 2786);
        if (e == -1) {
            return -1;
        }
        this.f24445b.mo45230f(0);
        this.f24445b.mo45229e(e);
        if (!this.f24446c) {
            this.f24444a.mo41470e(0, 4);
            this.f24446c = true;
        }
        this.f24444a.mo41468c(this.f24445b);
        return 0;
    }
}

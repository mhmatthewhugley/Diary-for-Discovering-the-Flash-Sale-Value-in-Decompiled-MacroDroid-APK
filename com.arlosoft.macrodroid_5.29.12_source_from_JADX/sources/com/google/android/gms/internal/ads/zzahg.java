package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahg {

    /* renamed from: a */
    private final zzaap f24556a;

    /* renamed from: b */
    private boolean f24557b;

    /* renamed from: c */
    private boolean f24558c;

    /* renamed from: d */
    private boolean f24559d;

    /* renamed from: e */
    private int f24560e;

    /* renamed from: f */
    private int f24561f;

    /* renamed from: g */
    private long f24562g;

    /* renamed from: h */
    private long f24563h;

    public zzahg(zzaap zzaap) {
        this.f24556a = zzaap;
    }

    /* renamed from: a */
    public final void mo41478a(byte[] bArr, int i, int i2) {
        if (this.f24558c) {
            int i3 = this.f24561f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f24559d = ((bArr[i4] & 192) >> 6) == 0;
                this.f24558c = false;
                return;
            }
            this.f24561f = i3 + (i2 - i);
        }
    }

    /* renamed from: b */
    public final void mo41479b(long j, int i, boolean z) {
        if (this.f24560e == 182 && z && this.f24557b) {
            long j2 = this.f24563h;
            if (j2 != -9223372036854775807L) {
                long j3 = this.f24562g;
                int i2 = (int) (j - j3);
                this.f24556a.mo41216f(j2, this.f24559d ? 1 : 0, i2, i, (zzaao) null);
            }
        }
        if (this.f24560e != 179) {
            this.f24562g = j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41480c(int r5, long r6) {
        /*
            r4 = this;
            r4.f24560e = r5
            r0 = 0
            r4.f24559d = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L_0x0013
            if (r5 != r1) goto L_0x0011
            r5 = 179(0xb3, float:2.51E-43)
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            r4.f24557b = r1
            if (r5 != r2) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r4.f24558c = r3
            r4.f24561f = r0
            r4.f24563h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahg.mo41480c(int, long):void");
    }

    /* renamed from: d */
    public final void mo41481d() {
        this.f24557b = false;
        this.f24558c = false;
        this.f24559d = false;
        this.f24560e = -1;
    }
}

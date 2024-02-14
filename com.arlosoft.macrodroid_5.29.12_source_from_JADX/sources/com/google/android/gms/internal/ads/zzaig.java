package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaig {

    /* renamed from: a */
    private final zzel f24728a = new zzel(0);

    /* renamed from: b */
    private final zzef f24729b = new zzef();

    /* renamed from: c */
    private boolean f24730c;

    /* renamed from: d */
    private boolean f24731d;

    /* renamed from: e */
    private boolean f24732e;

    /* renamed from: f */
    private long f24733f = -9223372036854775807L;

    /* renamed from: g */
    private long f24734g = -9223372036854775807L;

    /* renamed from: h */
    private long f24735h = -9223372036854775807L;

    zzaig(int i) {
    }

    /* renamed from: e */
    private final int m41513e(zzzj zzzj) {
        zzef zzef = this.f24729b;
        byte[] bArr = zzen.f34505f;
        int length = bArr.length;
        zzef.mo45228d(bArr, 0);
        this.f24730c = true;
        zzzj.mo48452h();
        return 0;
    }

    /* renamed from: a */
    public final int mo41511a(zzzj zzzj, zzaai zzaai, int i) throws IOException {
        if (i <= 0) {
            m41513e(zzzj);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f24732e) {
            long d = zzzj.mo41253d();
            int min = (int) Math.min(112800, d);
            long j2 = d - ((long) min);
            if (zzzj.mo41252c() != j2) {
                zzaai.f23733a = j2;
                return 1;
            }
            this.f24729b.mo45227c(min);
            zzzj.mo48452h();
            ((zzyy) zzzj).mo48454j(this.f24729b.mo45232h(), 0, min, false);
            zzef zzef = this.f24729b;
            int k = zzef.mo45235k();
            int l = zzef.mo45236l();
            int i2 = l - 188;
            while (true) {
                if (i2 < k) {
                    break;
                }
                byte[] h = zzef.mo45232h();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < k || i5 >= l || h[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long b = zzaiq.m41546b(zzef, i2, i);
                            if (b != -9223372036854775807L) {
                                j = b;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.f24734g = j;
            this.f24732e = true;
            return 0;
        } else if (this.f24734g == -9223372036854775807L) {
            m41513e(zzzj);
            return 0;
        } else if (!this.f24731d) {
            int min2 = (int) Math.min(112800, zzzj.mo41253d());
            if (zzzj.mo41252c() != 0) {
                zzaai.f23733a = 0;
                return 1;
            }
            this.f24729b.mo45227c(min2);
            zzzj.mo48452h();
            ((zzyy) zzzj).mo48454j(this.f24729b.mo45232h(), 0, min2, false);
            zzef zzef2 = this.f24729b;
            int k2 = zzef2.mo45235k();
            int l2 = zzef2.mo45236l();
            while (true) {
                if (k2 >= l2) {
                    break;
                }
                if (zzef2.mo45232h()[k2] == 71) {
                    long b2 = zzaiq.m41546b(zzef2, k2, i);
                    if (b2 != -9223372036854775807L) {
                        j = b2;
                        break;
                    }
                }
                k2++;
            }
            this.f24733f = j;
            this.f24731d = true;
            return 0;
        } else {
            long j3 = this.f24733f;
            if (j3 == -9223372036854775807L) {
                m41513e(zzzj);
                return 0;
            }
            long b3 = this.f24728a.mo45357b(this.f24734g) - this.f24728a.mo45357b(j3);
            this.f24735h = b3;
            if (b3 < 0) {
                zzdw.m48255e("TsDurationReader", "Invalid duration: " + b3 + ". Using TIME_UNSET instead.");
                this.f24735h = -9223372036854775807L;
            }
            m41513e(zzzj);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo41512b() {
        return this.f24735h;
    }

    /* renamed from: c */
    public final zzel mo41513c() {
        return this.f24728a;
    }

    /* renamed from: d */
    public final boolean mo41514d() {
        return this.f24730c;
    }
}

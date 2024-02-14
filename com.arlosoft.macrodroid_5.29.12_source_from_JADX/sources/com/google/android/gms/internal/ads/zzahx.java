package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahx {

    /* renamed from: a */
    private final zzel f24690a = new zzel(0);

    /* renamed from: b */
    private final zzef f24691b = new zzef();

    /* renamed from: c */
    private boolean f24692c;

    /* renamed from: d */
    private boolean f24693d;

    /* renamed from: e */
    private boolean f24694e;

    /* renamed from: f */
    private long f24695f = -9223372036854775807L;

    /* renamed from: g */
    private long f24696g = -9223372036854775807L;

    /* renamed from: h */
    private long f24697h = -9223372036854775807L;

    zzahx() {
    }

    /* renamed from: c */
    public static long m41491c(zzef zzef) {
        zzef zzef2 = zzef;
        int k = zzef.mo45235k();
        if (zzef.mo45233i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzef2.mo45226b(bArr, 0, 9);
        zzef2.mo45230f(k);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = (long) bArr[0];
        byte b = bArr[1];
        long j2 = (long) bArr[2];
        return ((((long) bArr[3]) & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) b) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: f */
    private final int m41492f(zzzj zzzj) {
        zzef zzef = this.f24691b;
        byte[] bArr = zzen.f34505f;
        int length = bArr.length;
        zzef.mo45228d(bArr, 0);
        this.f24692c = true;
        zzzj.mo48452h();
        return 0;
    }

    /* renamed from: g */
    private static final int m41493g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final int mo41501a(zzzj zzzj, zzaai zzaai) throws IOException {
        long j = -9223372036854775807L;
        if (!this.f24694e) {
            long d = zzzj.mo41253d();
            int min = (int) Math.min(20000, d);
            long j2 = d - ((long) min);
            if (zzzj.mo41252c() != j2) {
                zzaai.f23733a = j2;
                return 1;
            }
            this.f24691b.mo45227c(min);
            zzzj.mo48452h();
            ((zzyy) zzzj).mo48454j(this.f24691b.mo45232h(), 0, min, false);
            zzef zzef = this.f24691b;
            int k = zzef.mo45235k();
            int l = zzef.mo45236l() - 4;
            while (true) {
                if (l < k) {
                    break;
                }
                if (m41493g(zzef.mo45232h(), l) == 442) {
                    zzef.mo45230f(l + 4);
                    long c = m41491c(zzef);
                    if (c != -9223372036854775807L) {
                        j = c;
                        break;
                    }
                }
                l--;
            }
            this.f24696g = j;
            this.f24694e = true;
            return 0;
        } else if (this.f24696g == -9223372036854775807L) {
            m41492f(zzzj);
            return 0;
        } else if (!this.f24693d) {
            int min2 = (int) Math.min(20000, zzzj.mo41253d());
            if (zzzj.mo41252c() != 0) {
                zzaai.f23733a = 0;
                return 1;
            }
            this.f24691b.mo45227c(min2);
            zzzj.mo48452h();
            ((zzyy) zzzj).mo48454j(this.f24691b.mo45232h(), 0, min2, false);
            zzef zzef2 = this.f24691b;
            int k2 = zzef2.mo45235k();
            int l2 = zzef2.mo45236l();
            while (true) {
                if (k2 >= l2 - 3) {
                    break;
                }
                if (m41493g(zzef2.mo45232h(), k2) == 442) {
                    zzef2.mo45230f(k2 + 4);
                    long c2 = m41491c(zzef2);
                    if (c2 != -9223372036854775807L) {
                        j = c2;
                        break;
                    }
                }
                k2++;
            }
            this.f24695f = j;
            this.f24693d = true;
            return 0;
        } else {
            long j3 = this.f24695f;
            if (j3 == -9223372036854775807L) {
                m41492f(zzzj);
                return 0;
            }
            long b = this.f24690a.mo45357b(this.f24696g) - this.f24690a.mo45357b(j3);
            this.f24697h = b;
            if (b < 0) {
                zzdw.m48255e("PsDurationReader", "Invalid duration: " + b + ". Using TIME_UNSET instead.");
                this.f24697h = -9223372036854775807L;
            }
            m41492f(zzzj);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo41502b() {
        return this.f24697h;
    }

    /* renamed from: d */
    public final zzel mo41503d() {
        return this.f24690a;
    }

    /* renamed from: e */
    public final boolean mo41504e() {
        return this.f24692c;
    }
}

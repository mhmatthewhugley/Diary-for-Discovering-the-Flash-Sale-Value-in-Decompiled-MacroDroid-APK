package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzagh {

    /* renamed from: a */
    public int f24407a;

    /* renamed from: b */
    public long f24408b;

    /* renamed from: c */
    public int f24409c;

    /* renamed from: d */
    public int f24410d;

    /* renamed from: e */
    public int f24411e;

    /* renamed from: f */
    public final int[] f24412f = new int[255];

    /* renamed from: g */
    private final zzef f24413g = new zzef(255);

    zzagh() {
    }

    /* renamed from: a */
    public final void mo41457a() {
        this.f24407a = 0;
        this.f24408b = 0;
        this.f24409c = 0;
        this.f24410d = 0;
        this.f24411e = 0;
    }

    /* renamed from: b */
    public final boolean mo41458b(zzzj zzzj, boolean z) throws IOException {
        mo41457a();
        this.f24413g.mo45227c(27);
        if (zzzm.m55541c(zzzj, this.f24413g.mo45232h(), 0, 27, z) && this.f24413g.mo45217A() == 1332176723) {
            if (this.f24413g.mo45243s() == 0) {
                this.f24407a = this.f24413g.mo45243s();
                this.f24408b = this.f24413g.mo45248x();
                this.f24413g.mo45249y();
                this.f24413g.mo45249y();
                this.f24413g.mo45249y();
                int s = this.f24413g.mo45243s();
                this.f24409c = s;
                this.f24410d = s + 27;
                this.f24413g.mo45227c(s);
                if (zzzm.m55541c(zzzj, this.f24413g.mo45232h(), 0, this.f24409c, z)) {
                    for (int i = 0; i < this.f24409c; i++) {
                        this.f24412f[i] = this.f24413g.mo45243s();
                        this.f24411e += this.f24412f[i];
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw zzbu.m44137c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo41459c(zzzj zzzj, long j) throws IOException {
        int i;
        zzdd.m47210d(zzzj.mo41252c() == zzzj.mo41251b());
        this.f24413g.mo45227c(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || zzzj.mo41252c() + 4 < j) && zzzm.m55541c(zzzj, this.f24413g.mo45232h(), 0, 4, true)) {
                this.f24413g.mo45230f(0);
                if (this.f24413g.mo45217A() != 1332176723) {
                    ((zzyy) zzzj).mo48459p(1, false);
                } else {
                    zzzj.mo48452h();
                    return true;
                }
            }
        }
        do {
            if ((i != 0 && zzzj.mo41252c() >= j) || zzzj.mo48451f(1) == -1) {
                return false;
            }
            break;
        } while (zzzj.mo48451f(1) == -1);
        return false;
    }
}

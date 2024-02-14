package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaie implements zzyt {

    /* renamed from: a */
    private final zzel f24725a;

    /* renamed from: b */
    private final zzef f24726b = new zzef();

    /* renamed from: c */
    private final int f24727c;

    public zzaie(int i, zzel zzel, int i2) {
        this.f24727c = i;
        this.f24725a = zzel;
    }

    /* renamed from: a */
    public final zzys mo41243a(zzzj zzzj, long j) throws IOException {
        int a;
        int i;
        long j2;
        long c = zzzj.mo41252c();
        int min = (int) Math.min(112800, zzzj.mo41253d() - c);
        this.f24726b.mo45227c(min);
        ((zzyy) zzzj).mo48454j(this.f24726b.mo45232h(), 0, min, false);
        zzef zzef = this.f24726b;
        int l = zzef.mo45236l();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzef.mo45233i() >= 188 && (i = a + 188) <= l) {
            long b = zzaiq.m41546b(zzef, (a = zzaiq.m41545a(zzef.mo45232h(), zzef.mo45235k(), l)), this.f24727c);
            if (b != -9223372036854775807L) {
                long b2 = this.f24725a.mo45357b(b);
                if (b2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zzys.m55459d(b2, c);
                    }
                    j2 = c + j4;
                } else if (100000 + b2 > j) {
                    j2 = c + ((long) a);
                } else {
                    j4 = (long) a;
                    j5 = b2;
                }
                return zzys.m55460e(j2);
            }
            zzef.mo45230f(i);
            j3 = (long) i;
        }
        return j5 != -9223372036854775807L ? zzys.m55461f(j5, c + j3) : zzys.f39001d;
    }

    public final void zzb() {
        zzef zzef = this.f24726b;
        byte[] bArr = zzen.f34505f;
        int length = bArr.length;
        zzef.mo45228d(bArr, 0);
    }
}

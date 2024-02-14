package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzabl implements zzyt {

    /* renamed from: a */
    private final zzzv f23831a;

    /* renamed from: b */
    private final int f23832b;

    /* renamed from: c */
    private final zzzq f23833c = new zzzq();

    /* synthetic */ zzabl(zzzv zzzv, int i, zzabk zzabk) {
        this.f23831a = zzzv;
        this.f23832b = i;
    }

    /* renamed from: b */
    private final long m40992b(zzzj zzzj) throws IOException {
        zzzj zzzj2 = zzzj;
        while (zzzj.mo41251b() < zzzj.mo41253d() - 6) {
            zzzv zzzv = this.f23831a;
            int i = this.f23832b;
            zzzq zzzq = this.f23833c;
            long b = zzzj.mo41251b();
            byte[] bArr = new byte[2];
            zzyy zzyy = (zzyy) zzzj2;
            zzyy.mo48454j(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzzj.mo48452h();
                zzyy.mo48458o((int) (b - zzzj.mo41252c()), false);
            } else {
                zzef zzef = new zzef(16);
                System.arraycopy(bArr, 0, zzef.mo45232h(), 0, 2);
                zzef.mo45229e(zzzm.m55539a(zzzj2, zzef.mo45232h(), 2, 14));
                zzzj.mo48452h();
                zzyy.mo48458o((int) (b - zzzj.mo41252c()), false);
                if (zzzr.m55549c(zzef, zzzv, i, zzzq)) {
                    break;
                }
            }
            zzyy.mo48458o(1, false);
        }
        if (zzzj.mo41251b() < zzzj.mo41253d() - 6) {
            return this.f23833c.f39045a;
        }
        ((zzyy) zzzj2).mo48458o((int) (zzzj.mo41253d() - zzzj.mo41251b()), false);
        return this.f23831a.f39059j;
    }

    /* renamed from: a */
    public final zzys mo41243a(zzzj zzzj, long j) throws IOException {
        long c = zzzj.mo41252c();
        long b = m40992b(zzzj);
        long b2 = zzzj.mo41251b();
        ((zzyy) zzzj).mo48458o(Math.max(6, this.f23831a.f39052c), false);
        long b3 = m40992b(zzzj);
        long b4 = zzzj.mo41251b();
        if (b > j || b3 <= j) {
            return b3 <= j ? zzys.m55461f(b3, b4) : zzys.m55459d(b, c);
        }
        return zzys.m55460e(b2);
    }

    public final /* synthetic */ void zzb() {
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaiz {
    /* renamed from: a */
    public static Pair m41567a(zzzj zzzj) throws IOException {
        zzzj.mo48452h();
        zzaiy d = m41570d(1684108385, zzzj, new zzef(8));
        ((zzyy) zzzj).mo48459p(8, false);
        return Pair.create(Long.valueOf(zzzj.mo41252c()), Long.valueOf(d.f24812b));
    }

    /* renamed from: b */
    public static zzaix m41568b(zzzj zzzj) throws IOException {
        byte[] bArr;
        zzef zzef = new zzef(16);
        zzaiy d = m41570d(1718449184, zzzj, zzef);
        zzdd.m47212f(d.f24812b >= 16);
        zzyy zzyy = (zzyy) zzzj;
        zzyy.mo48454j(zzef.mo45232h(), 0, 16, false);
        zzef.mo45230f(0);
        int q = zzef.mo45241q();
        int q2 = zzef.mo45241q();
        int p = zzef.mo45240p();
        int p2 = zzef.mo45240p();
        int q3 = zzef.mo45241q();
        int q4 = zzef.mo45241q();
        int i = ((int) d.f24812b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzyy.mo48454j(bArr, 0, i, false);
        } else {
            bArr = zzen.f34505f;
        }
        byte[] bArr2 = bArr;
        ((zzyy) zzzj).mo48459p((int) (zzzj.mo41251b() - zzzj.mo41252c()), false);
        return new zzaix(q, q2, p, p2, q3, q4, bArr2);
    }

    /* renamed from: c */
    public static boolean m41569c(zzzj zzzj) throws IOException {
        zzef zzef = new zzef(8);
        int i = zzaiy.m41566a(zzzj, zzef).f24811a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzyy) zzzj).mo48454j(zzef.mo45232h(), 0, 4, false);
        zzef.mo45230f(0);
        int m = zzef.mo45237m();
        if (m == 1463899717) {
            return true;
        }
        zzdw.m48252b("WavHeaderReader", "Unsupported form type: " + m);
        return false;
    }

    /* renamed from: d */
    private static zzaiy m41570d(int i, zzzj zzzj, zzef zzef) throws IOException {
        zzaiy a = zzaiy.m41566a(zzzj, zzef);
        while (true) {
            int i2 = a.f24811a;
            if (i2 == i) {
                return a;
            }
            zzdw.m48255e("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = a.f24812b + 8;
            if (j <= 2147483647L) {
                ((zzyy) zzzj).mo48459p((int) j, false);
                a = zzaiy.m41566a(zzzj, zzef);
            } else {
                int i3 = a.f24811a;
                throw zzbu.m44137c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzs {
    @Nullable
    /* renamed from: a */
    public static zzbq m55551a(zzzj zzzj, boolean z) throws IOException {
        zzbq a = new zzzz().mo48473a(zzzj, z ? null : zzadc.f23987a);
        if (a == null || a.mo42875a() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public static zzzu m55552b(zzef zzef) {
        zzef.mo45231g(1);
        int u = zzef.mo45245u();
        long k = ((long) zzef.mo45235k()) + ((long) u);
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long z = zzef.mo45250z();
            if (z == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = z;
            jArr2[i2] = zzef.mo45250z();
            zzef.mo45231g(2);
            i2++;
        }
        zzef.mo45231g((int) (k - ((long) zzef.mo45235k())));
        return new zzzu(jArr, jArr2);
    }
}

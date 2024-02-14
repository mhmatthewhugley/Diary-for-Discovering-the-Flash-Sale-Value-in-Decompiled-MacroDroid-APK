package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.apache.commons.p353io.FileUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaej {

    /* renamed from: a */
    private final zzef f24137a = new zzef(8);

    /* renamed from: b */
    private int f24138b;

    /* renamed from: b */
    private final long m41174b(zzzj zzzj) throws IOException {
        zzyy zzyy = (zzyy) zzzj;
        int i = 0;
        zzyy.mo48454j(this.f24137a.mo45232h(), 0, 1, false);
        byte b = this.f24137a.mo45232h()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        zzyy.mo48454j(this.f24137a.mo45232h(), 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f24137a.mo45232h()[i] & 255) + (i4 << 8);
        }
        this.f24138b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo41408a(zzzj zzzj) throws IOException {
        long b;
        int i;
        long d = zzzj.mo41253d();
        long j = FileUtils.ONE_KB;
        int i2 = (d > -1 ? 1 : (d == -1 ? 0 : -1));
        if (i2 != 0 && d <= FileUtils.ONE_KB) {
            j = d;
        }
        int i3 = (int) j;
        zzyy zzyy = (zzyy) zzzj;
        zzyy.mo48454j(this.f24137a.mo45232h(), 0, 4, false);
        this.f24138b = 4;
        for (long A = this.f24137a.mo45217A(); A != 440786851; A = ((A << 8) & -256) | ((long) (this.f24137a.mo45232h()[0] & 255))) {
            int i4 = this.f24138b + 1;
            this.f24138b = i4;
            if (i4 == i3) {
                return false;
            }
            zzyy.mo48454j(this.f24137a.mo45232h(), 0, 1, false);
        }
        long b2 = m41174b(zzzj);
        long j2 = (long) this.f24138b;
        if (b2 != Long.MIN_VALUE && (i2 == 0 || j2 + b2 < d)) {
            while (true) {
                int i5 = (((long) this.f24138b) > (j2 + b2) ? 1 : (((long) this.f24138b) == (j2 + b2) ? 0 : -1));
                if (i5 < 0) {
                    if (m41174b(zzzj) == Long.MIN_VALUE || b < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int b3 = (int) (b = m41174b(zzzj));
                        zzyy.mo48458o(b3, false);
                        this.f24138b += b3;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

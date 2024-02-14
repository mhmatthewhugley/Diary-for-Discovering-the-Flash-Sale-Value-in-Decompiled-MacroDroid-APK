package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzz {

    /* renamed from: a */
    private final zzef f39070a = new zzef(10);

    @Nullable
    /* renamed from: a */
    public final zzbq mo48473a(zzzj zzzj, @Nullable zzada zzada) throws IOException {
        zzbq zzbq = null;
        int i = 0;
        while (true) {
            try {
                ((zzyy) zzzj).mo48454j(this.f39070a.mo45232h(), 0, 10, false);
                this.f39070a.mo45230f(0);
                if (this.f39070a.mo45245u() != 4801587) {
                    break;
                }
                this.f39070a.mo45231g(3);
                int r = this.f39070a.mo45242r();
                int i2 = r + 10;
                if (zzbq == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f39070a.mo45232h(), 0, bArr, 0, 10);
                    ((zzyy) zzzj).mo48454j(bArr, 10, r, false);
                    zzbq = zzadc.m41114a(bArr, i2, zzada, new zzacd());
                } else {
                    ((zzyy) zzzj).mo48458o(r, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzzj.mo48452h();
        ((zzyy) zzzj).mo48458o(i, false);
        return zzbq;
    }
}

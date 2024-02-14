package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzvv {

    /* renamed from: a */
    private final String[] f38747a;

    /* renamed from: b */
    private final int[] f38748b;

    /* renamed from: c */
    private final zzuh[] f38749c;

    /* renamed from: d */
    private final int[] f38750d;

    /* renamed from: e */
    private final int[][][] f38751e;

    /* renamed from: f */
    private final zzuh f38752f;

    @VisibleForTesting
    zzvv(String[] strArr, int[] iArr, zzuh[] zzuhArr, int[] iArr2, int[][][] iArr3, zzuh zzuh) {
        this.f38747a = strArr;
        this.f38748b = iArr;
        this.f38749c = zzuhArr;
        this.f38751e = iArr3;
        this.f38750d = iArr2;
        this.f38752f = zzuh;
    }

    /* renamed from: a */
    public final int mo48315a(int i, int i2, boolean z) {
        int i3 = this.f38749c[i].mo48265b(i2).f29179a;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 0; i6++) {
            if ((this.f38751e[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 16;
        while (i4 < copyOf.length) {
            String str2 = this.f38749c[i].mo48265b(i2).mo44231b(copyOf[i4]).f24213l;
            int i9 = i7 + 1;
            if (i7 != 0) {
                z2 |= !zzen.m49181t(str, str2);
            } else {
                str = str2;
            }
            i8 = Math.min(i8, this.f38751e[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        return z2 ? Math.min(i8, this.f38750d[i]) : i8;
    }

    /* renamed from: b */
    public final int mo48316b(int i, int i2, int i3) {
        return this.f38751e[i][i2][i3];
    }

    /* renamed from: c */
    public final int mo48317c(int i) {
        return this.f38748b[i];
    }

    /* renamed from: d */
    public final zzuh mo48318d(int i) {
        return this.f38749c[i];
    }

    /* renamed from: e */
    public final zzuh mo48319e() {
        return this.f38752f;
    }
}

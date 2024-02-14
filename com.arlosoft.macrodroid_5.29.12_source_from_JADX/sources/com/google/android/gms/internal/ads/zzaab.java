package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaab {

    /* renamed from: a */
    public int f23703a;
    @Nullable

    /* renamed from: b */
    public String f23704b;

    /* renamed from: c */
    public int f23705c;

    /* renamed from: d */
    public int f23706d;

    /* renamed from: e */
    public int f23707e;

    /* renamed from: f */
    public int f23708f;

    /* renamed from: g */
    public int f23709g;

    /* renamed from: a */
    public final boolean mo41196a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!zzaac.m40913m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f23703a = i2;
        this.f23704b = zzaac.f23710a[3 - i3];
        int i8 = zzaac.f23711b[i5];
        this.f23706d = i8;
        int i9 = 2;
        if (i2 == 2) {
            i8 /= 2;
            this.f23706d = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.f23706d = i8;
        }
        int i10 = (i >>> 9) & 1;
        this.f23709g = zzaac.m40912l(i2, i3);
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = zzaac.f23712c[i4 - 1];
            } else {
                i7 = zzaac.f23713d[i4 - 1];
            }
            this.f23708f = i7;
            this.f23705c = (((i7 * 12) / i8) + i10) * 4;
        } else {
            int i11 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = zzaac.f23714e[i4 - 1];
                } else {
                    i6 = zzaac.f23715f[i4 - 1];
                }
                this.f23708f = i6;
                this.f23705c = ((i6 * 144) / i8) + i10;
            } else {
                int i12 = zzaac.f23716g[i4 - 1];
                this.f23708f = i12;
                if (i3 == 1) {
                    i11 = 72;
                }
                this.f23705c = ((i11 * i12) / i8) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.f23707e = i9;
        return true;
    }
}

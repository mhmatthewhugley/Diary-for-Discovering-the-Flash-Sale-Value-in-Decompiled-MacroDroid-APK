package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaar {

    /* renamed from: a */
    private final byte[] f23752a;

    /* renamed from: b */
    private final int f23753b;

    /* renamed from: c */
    private int f23754c;

    /* renamed from: d */
    private int f23755d;

    public zzaar(byte[] bArr) {
        this.f23752a = bArr;
        this.f23753b = bArr.length;
    }

    /* renamed from: a */
    public final int mo41221a() {
        return (this.f23754c * 8) + this.f23755d;
    }

    /* renamed from: b */
    public final int mo41222b(int i) {
        int i2 = this.f23754c;
        int min = Math.min(i, 8 - this.f23755d);
        int i3 = i2 + 1;
        int i4 = ((this.f23752a[i2] & 255) >> this.f23755d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f23752a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo41223c(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: c */
    public final void mo41223c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f23754c + i3;
        this.f23754c = i4;
        int i5 = this.f23755d + (i - (i3 * 8));
        this.f23755d = i5;
        if (i5 > 7) {
            i4++;
            this.f23754c = i4;
            i5 -= 8;
            this.f23755d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f23753b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        zzdd.m47212f(z);
    }

    /* renamed from: d */
    public final boolean mo41224d() {
        byte b = this.f23752a[this.f23754c];
        int i = this.f23755d;
        mo41223c(1);
        if (1 != (((b & 255) >> i) & 1)) {
            return false;
        }
        return true;
    }
}

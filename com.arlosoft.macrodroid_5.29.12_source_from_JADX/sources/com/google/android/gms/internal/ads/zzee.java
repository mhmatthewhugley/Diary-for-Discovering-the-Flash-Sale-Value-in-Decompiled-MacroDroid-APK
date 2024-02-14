package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzee {

    /* renamed from: a */
    public byte[] f33777a;

    /* renamed from: b */
    private int f33778b;

    /* renamed from: c */
    private int f33779c;

    /* renamed from: d */
    private int f33780d;

    public zzee() {
        this.f33777a = zzen.f34505f;
    }

    public zzee(byte[] bArr, int i) {
        this.f33777a = bArr;
        this.f33780d = i;
    }

    /* renamed from: m */
    private final void m48639m() {
        int i;
        int i2 = this.f33778b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f33780d) && !(i2 == i && this.f33779c == 0))) {
            z = false;
        }
        zzdd.m47212f(z);
    }

    /* renamed from: a */
    public final int mo45196a() {
        return ((this.f33780d - this.f33778b) * 8) - this.f33779c;
    }

    /* renamed from: b */
    public final int mo45197b() {
        return (this.f33778b * 8) + this.f33779c;
    }

    /* renamed from: c */
    public final int mo45198c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f33779c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f33779c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f33779c = i4;
            byte[] bArr = this.f33777a;
            int i5 = this.f33778b;
            this.f33778b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f33777a;
        int i6 = this.f33778b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f33779c = 0;
            this.f33778b = i6 + 1;
        }
        m48639m();
        return i7;
    }

    /* renamed from: d */
    public final void mo45199d() {
        if (this.f33779c != 0) {
            this.f33779c = 0;
            this.f33778b++;
            m48639m();
        }
    }

    /* renamed from: e */
    public final void mo45200e(int i, int i2) {
        int i3 = i & 16383;
        int min = Math.min(8 - this.f33779c, 14);
        int i4 = this.f33779c;
        int i5 = (8 - i4) - min;
        byte[] bArr = this.f33777a;
        int i6 = this.f33778b;
        byte b = (byte) (((MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - min;
        bArr[i6] = (byte) (b | ((i3 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.f33777a[i8] = (byte) (i3 >>> i7);
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f33777a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i3 & ((1 << i7) - 1)) << i9) | b2);
        mo45205j(14);
        m48639m();
    }

    /* renamed from: f */
    public final void mo45201f(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f33777a;
            int i5 = this.f33778b;
            int i6 = i5 + 1;
            this.f33778b = i6;
            byte b = bArr2[i5];
            int i7 = this.f33779c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 != 0) {
            byte b3 = (byte) (bArr[i3] & (255 >> i8));
            bArr[i3] = b3;
            int i9 = this.f33779c;
            if (i9 + i8 > 8) {
                byte[] bArr3 = this.f33777a;
                int i10 = this.f33778b;
                this.f33778b = i10 + 1;
                b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
                bArr[i3] = b3;
                i9 -= 8;
            }
            int i11 = i9 + i8;
            this.f33779c = i11;
            byte[] bArr4 = this.f33777a;
            int i12 = this.f33778b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
            if (i11 == 8) {
                this.f33779c = 0;
                this.f33778b = i12 + 1;
            }
            m48639m();
        }
    }

    /* renamed from: g */
    public final void mo45202g(byte[] bArr, int i) {
        this.f33777a = bArr;
        this.f33778b = 0;
        this.f33779c = 0;
        this.f33780d = i;
    }

    /* renamed from: h */
    public final void mo45203h(int i) {
        int i2 = i / 8;
        this.f33778b = i2;
        this.f33779c = i - (i2 * 8);
        m48639m();
    }

    /* renamed from: i */
    public final void mo45204i() {
        int i = this.f33779c + 1;
        this.f33779c = i;
        if (i == 8) {
            this.f33779c = 0;
            this.f33778b++;
        }
        m48639m();
    }

    /* renamed from: j */
    public final void mo45205j(int i) {
        int i2 = i / 8;
        int i3 = this.f33778b + i2;
        this.f33778b = i3;
        int i4 = this.f33779c + (i - (i2 * 8));
        this.f33779c = i4;
        if (i4 > 7) {
            this.f33778b = i3 + 1;
            this.f33779c = i4 - 8;
        }
        m48639m();
    }

    /* renamed from: k */
    public final void mo45206k(int i) {
        zzdd.m47212f(this.f33779c == 0);
        this.f33778b += i;
        m48639m();
    }

    /* renamed from: l */
    public final boolean mo45207l() {
        boolean z = (this.f33777a[this.f33778b] & (128 >> this.f33779c)) != 0;
        mo45204i();
        return z;
    }
}

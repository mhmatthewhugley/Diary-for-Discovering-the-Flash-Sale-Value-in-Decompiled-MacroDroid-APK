package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaah {

    /* renamed from: a */
    private byte[] f23729a;

    /* renamed from: b */
    private int f23730b;

    /* renamed from: c */
    private int f23731c;

    /* renamed from: d */
    private int f23732d = 0;

    public zzaah(byte[] bArr, int i, int i2) {
        this.f23729a = bArr;
        this.f23731c = i;
        this.f23730b = i2;
        m40923h();
    }

    /* renamed from: g */
    private final int m40922g() {
        int i = 0;
        int i2 = 0;
        while (!mo41202f()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo41197a(i2);
        }
        return i3 + i;
    }

    /* renamed from: h */
    private final void m40923h() {
        int i;
        int i2 = this.f23731c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f23730b) && !(i2 == i && this.f23732d == 0))) {
            z = false;
        }
        zzdd.m47212f(z);
    }

    /* renamed from: i */
    private final boolean m40924i(int i) {
        if (i < 2 || i >= this.f23730b) {
            return false;
        }
        byte[] bArr = this.f23729a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo41197a(int i) {
        int i2;
        int i3;
        this.f23732d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f23732d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f23732d = i5;
            byte[] bArr = this.f23729a;
            int i6 = this.f23731c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != m40924i(i6 + 1)) {
                i3 = 1;
            }
            this.f23731c = i6 + i3;
        }
        byte[] bArr2 = this.f23729a;
        int i7 = this.f23731c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f23732d = 0;
            if (true != m40924i(i7 + 1)) {
                i3 = 1;
            }
            this.f23731c = i7 + i3;
        }
        m40923h();
        return i8;
    }

    /* renamed from: b */
    public final int mo41198b() {
        int g = m40922g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }

    /* renamed from: c */
    public final int mo41199c() {
        return m40922g();
    }

    /* renamed from: d */
    public final void mo41200d() {
        int i = 1;
        int i2 = this.f23732d + 1;
        this.f23732d = i2;
        if (i2 == 8) {
            this.f23732d = 0;
            int i3 = this.f23731c;
            if (true == m40924i(i3 + 1)) {
                i = 2;
            }
            this.f23731c = i3 + i;
        }
        m40923h();
    }

    /* renamed from: e */
    public final void mo41201e(int i) {
        int i2 = this.f23731c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f23731c = i4;
        int i5 = this.f23732d + (i - (i3 * 8));
        this.f23732d = i5;
        if (i5 > 7) {
            this.f23731c = i4 + 1;
            this.f23732d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f23731c) {
                m40923h();
                return;
            } else if (m40924i(i2)) {
                this.f23731c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo41202f() {
        boolean z = (this.f23729a[this.f23731c] & (128 >> this.f23732d)) != 0;
        mo41200d();
        return z;
    }
}

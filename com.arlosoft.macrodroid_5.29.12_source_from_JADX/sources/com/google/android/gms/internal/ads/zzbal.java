package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbal {

    /* renamed from: a */
    private final byte[] f26409a;

    /* renamed from: b */
    private final int f26410b;

    /* renamed from: c */
    private int f26411c;

    /* renamed from: d */
    private int f26412d = 0;

    public zzbal(byte[] bArr, int i, int i2) {
        this.f26409a = bArr;
        this.f26411c = i;
        this.f26410b = i2;
        m42969g();
    }

    /* renamed from: f */
    private final int m42968f() {
        int i = 0;
        int i2 = 0;
        while (!mo42342e()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo42338a(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    private final void m42969g() {
        int i;
        int i2;
        int i3 = this.f26411c;
        boolean z = true;
        if (i3 < 0 || (i = this.f26412d) < 0 || i >= 8 || (i3 >= (i2 = this.f26410b) && !(i3 == i2 && i == 0))) {
            z = false;
        }
        zzbac.m42926e(z);
    }

    /* renamed from: h */
    private final boolean m42970h(int i) {
        if (i < 2 || i >= this.f26410b) {
            return false;
        }
        byte[] bArr = this.f26409a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo42338a(int i) {
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4 = i >> 3;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            if (m42970h(this.f26411c + 1)) {
                i3 = this.f26411c + 2;
            } else {
                i3 = this.f26411c + 1;
            }
            int i6 = this.f26412d;
            if (i6 != 0) {
                byte[] bArr = this.f26409a;
                b2 = ((bArr[i3] & 255) >>> (8 - i6)) | ((bArr[this.f26411c] & 255) << i6);
            } else {
                b2 = this.f26409a[this.f26411c];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f26411c = i3;
        }
        if (i > 0) {
            int i7 = this.f26412d + i;
            byte b4 = (byte) (255 >> (8 - i));
            if (m42970h(this.f26411c + 1)) {
                i2 = this.f26411c + 2;
            } else {
                i2 = this.f26411c + 1;
            }
            if (i7 > 8) {
                byte[] bArr2 = this.f26409a;
                b = (b4 & (((255 & bArr2[i2]) >> (16 - i7)) | ((bArr2[this.f26411c] & 255) << (i7 - 8)))) | b3;
                this.f26411c = i2;
            } else {
                b = (b4 & ((255 & this.f26409a[this.f26411c]) >> (8 - i7))) | b3;
                if (i7 == 8) {
                    this.f26411c = i2;
                }
            }
            b3 = b;
            this.f26412d = i7 % 8;
        }
        m42969g();
        return b3;
    }

    /* renamed from: b */
    public final int mo42339b() {
        int f = m42968f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: c */
    public final int mo42340c() {
        return m42968f();
    }

    /* renamed from: d */
    public final void mo42341d(int i) {
        int i2 = this.f26411c;
        int i3 = (i >> 3) + i2;
        this.f26411c = i3;
        int i4 = this.f26412d + (i & 7);
        this.f26412d = i4;
        if (i4 > 7) {
            this.f26411c = i3 + 1;
            this.f26412d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f26411c) {
                m42969g();
                return;
            } else if (m42970h(i2)) {
                this.f26411c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo42342e() {
        return mo42338a(1) == 1;
    }
}

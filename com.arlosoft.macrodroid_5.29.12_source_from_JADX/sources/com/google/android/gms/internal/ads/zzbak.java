package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbak {

    /* renamed from: a */
    public byte[] f26406a;

    /* renamed from: b */
    private int f26407b;

    /* renamed from: c */
    private int f26408c;

    public zzbak() {
    }

    public zzbak(int i) {
        this.f26406a = new byte[i];
        this.f26408c = i;
    }

    /* renamed from: a */
    public final int mo42315a() {
        return this.f26408c - this.f26407b;
    }

    /* renamed from: b */
    public final int mo42316b() {
        byte[] bArr = this.f26406a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public final int mo42317c() {
        return this.f26407b;
    }

    /* renamed from: d */
    public final int mo42318d() {
        return this.f26408c;
    }

    /* renamed from: e */
    public final int mo42319e() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        int i2 = i + 1;
        this.f26407b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f26407b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f26407b = i4;
        byte b3 = bArr[i3];
        this.f26407b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: f */
    public final int mo42320f() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        int i2 = i + 1;
        this.f26407b = i2;
        byte b = bArr[i];
        this.f26407b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: g */
    public final int mo42321g() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        this.f26407b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final int mo42322h() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        int i2 = i + 1;
        this.f26407b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f26407b = i3;
        byte b2 = bArr[i2];
        this.f26407b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: i */
    public final int mo42323i() {
        int e = mo42319e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException("Top bit not zero: " + e);
    }

    /* renamed from: j */
    public final int mo42324j() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        int i2 = i + 1;
        this.f26407b = i2;
        byte b = bArr[i];
        this.f26407b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: k */
    public final long mo42325k() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        int i2 = i + 1;
        this.f26407b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f26407b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f26407b = i4;
        byte b3 = bArr[i3];
        this.f26407b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: l */
    public final long mo42326l() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        int i2 = i + 1;
        this.f26407b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f26407b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f26407b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f26407b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f26407b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f26407b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f26407b = i8;
        byte b7 = bArr[i7];
        this.f26407b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: m */
    public final long mo42327m() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        int i2 = i + 1;
        this.f26407b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f26407b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f26407b = i4;
        byte b3 = bArr[i3];
        this.f26407b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: n */
    public final long mo42328n() {
        long l = mo42326l();
        if (l >= 0) {
            return l;
        }
        throw new IllegalStateException("Top bit not zero: " + l);
    }

    /* renamed from: o */
    public final String mo42329o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f26407b;
        int i3 = i2 + i;
        int i4 = i3 - 1;
        if (i4 < this.f26408c && this.f26406a[i4] == 0) {
            i--;
        }
        String str = new String(this.f26406a, i2, i);
        this.f26407b = i3;
        return str;
    }

    /* renamed from: p */
    public final short mo42330p() {
        byte[] bArr = this.f26406a;
        int i = this.f26407b;
        int i2 = i + 1;
        this.f26407b = i2;
        byte b = bArr[i];
        this.f26407b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: q */
    public final void mo42331q(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f26406a, this.f26407b, bArr, i, i2);
        this.f26407b += i2;
    }

    /* renamed from: r */
    public final void mo42332r() {
        this.f26407b = 0;
        this.f26408c = 0;
    }

    /* renamed from: s */
    public final void mo42333s(int i) {
        mo42334t(mo42316b() < i ? new byte[i] : this.f26406a, i);
    }

    /* renamed from: t */
    public final void mo42334t(byte[] bArr, int i) {
        this.f26406a = bArr;
        this.f26408c = i;
        this.f26407b = 0;
    }

    /* renamed from: u */
    public final void mo42335u(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f26406a.length) {
            z = true;
        }
        zzbac.m42924c(z);
        this.f26408c = i;
    }

    /* renamed from: v */
    public final void mo42336v(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f26408c) {
            z = true;
        }
        zzbac.m42924c(z);
        this.f26407b = i;
    }

    /* renamed from: w */
    public final void mo42337w(int i) {
        mo42336v(this.f26407b + i);
    }

    public zzbak(byte[] bArr) {
        this.f26406a = bArr;
        this.f26408c = bArr.length;
    }
}

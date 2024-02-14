package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzef {

    /* renamed from: a */
    private byte[] f33867a;

    /* renamed from: b */
    private int f33868b;

    /* renamed from: c */
    private int f33869c;

    public zzef() {
        this.f33867a = zzen.f34505f;
    }

    public zzef(byte[] bArr, int i) {
        this.f33867a = bArr;
        this.f33869c = i;
    }

    /* renamed from: A */
    public final long mo45217A() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f33868b = i4;
        byte b3 = bArr[i3];
        this.f33868b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: B */
    public final long mo45218B() {
        long z = mo45250z();
        if (z >= 0) {
            return z;
        }
        throw new IllegalStateException("Top bit not zero: " + z);
    }

    /* renamed from: C */
    public final long mo45219C() {
        int i;
        int i2;
        long j = (long) this.f33867a[this.f33868b];
        int i3 = 7;
        while (true) {
            i = 0;
            i2 = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            while (i2 < i) {
                byte b = this.f33867a[this.f33868b + i2];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i2++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f33868b += i;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    @Nullable
    /* renamed from: D */
    public final String mo45220D(char c) {
        int i = this.f33869c;
        int i2 = this.f33868b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f33869c && this.f33867a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f33867a;
        int i3 = this.f33868b;
        String j = zzen.m49170j(bArr, i3, i2 - i3);
        this.f33868b = i2;
        if (i2 < this.f33869c) {
            this.f33868b = i2 + 1;
        }
        return j;
    }

    /* renamed from: E */
    public final String mo45221E(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f33868b;
        int i3 = (i2 + i) - 1;
        String j = zzen.m49170j(this.f33867a, i2, (i3 >= this.f33869c || this.f33867a[i3] != 0) ? i : i - 1);
        this.f33868b += i;
        return j;
    }

    /* renamed from: F */
    public final String mo45222F(int i, Charset charset) {
        byte[] bArr = this.f33867a;
        int i2 = this.f33868b;
        String str = new String(bArr, i2, i, charset);
        this.f33868b = i2 + i;
        return str;
    }

    /* renamed from: G */
    public final short mo45223G() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        this.f33868b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: H */
    public final void mo45224H(int i) {
        byte[] bArr = this.f33867a;
        if (i > bArr.length) {
            this.f33867a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: a */
    public final void mo45225a(zzee zzee, int i) {
        mo45226b(zzee.f33777a, 0, i);
        zzee.mo45203h(0);
    }

    /* renamed from: b */
    public final void mo45226b(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f33867a, this.f33868b, bArr, i, i2);
        this.f33868b += i2;
    }

    /* renamed from: c */
    public final void mo45227c(int i) {
        byte[] bArr = this.f33867a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo45228d(bArr, i);
    }

    /* renamed from: d */
    public final void mo45228d(byte[] bArr, int i) {
        this.f33867a = bArr;
        this.f33869c = i;
        this.f33868b = 0;
    }

    /* renamed from: e */
    public final void mo45229e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f33867a.length) {
            z = true;
        }
        zzdd.m47210d(z);
        this.f33869c = i;
    }

    /* renamed from: f */
    public final void mo45230f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f33869c) {
            z = true;
        }
        zzdd.m47210d(z);
        this.f33868b = i;
    }

    /* renamed from: g */
    public final void mo45231g(int i) {
        mo45230f(this.f33868b + i);
    }

    /* renamed from: h */
    public final byte[] mo45232h() {
        return this.f33867a;
    }

    /* renamed from: i */
    public final int mo45233i() {
        return this.f33869c - this.f33868b;
    }

    /* renamed from: j */
    public final int mo45234j() {
        return this.f33867a.length;
    }

    /* renamed from: k */
    public final int mo45235k() {
        return this.f33868b;
    }

    /* renamed from: l */
    public final int mo45236l() {
        return this.f33869c;
    }

    /* renamed from: m */
    public final int mo45237m() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f33868b = i4;
        byte b3 = bArr[i3];
        this.f33868b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: n */
    public final int mo45238n() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        this.f33868b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    /* renamed from: o */
    public final int mo45239o() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f33868b = i4;
        byte b3 = bArr[i3];
        this.f33868b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: p */
    public final int mo45240p() {
        int o = mo45239o();
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException("Top bit not zero: " + o);
    }

    /* renamed from: q */
    public final int mo45241q() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        this.f33868b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: r */
    public final int mo45242r() {
        return (mo45243s() << 21) | (mo45243s() << 14) | (mo45243s() << 7) | mo45243s();
    }

    /* renamed from: s */
    public final int mo45243s() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        this.f33868b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: t */
    public final int mo45244t() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        this.f33868b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: u */
    public final int mo45245u() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        this.f33868b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: v */
    public final int mo45246v() {
        int m = mo45237m();
        if (m >= 0) {
            return m;
        }
        throw new IllegalStateException("Top bit not zero: " + m);
    }

    /* renamed from: w */
    public final int mo45247w() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        this.f33868b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: x */
    public final long mo45248x() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f33868b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f33868b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f33868b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f33868b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f33868b = i8;
        byte b7 = bArr[i7];
        this.f33868b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: y */
    public final long mo45249y() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f33868b = i4;
        byte b3 = bArr[i3];
        this.f33868b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: z */
    public final long mo45250z() {
        byte[] bArr = this.f33867a;
        int i = this.f33868b;
        int i2 = i + 1;
        this.f33868b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f33868b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f33868b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f33868b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f33868b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f33868b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f33868b = i8;
        byte b7 = bArr[i7];
        this.f33868b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public zzef(int i) {
        this.f33867a = new byte[i];
        this.f33869c = i;
    }

    public zzef(byte[] bArr) {
        this.f33867a = bArr;
        this.f33869c = bArr.length;
    }
}

package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbb extends zzbe {

    /* renamed from: d */
    private final byte[] f45549d;

    /* renamed from: e */
    private final int f45550e;

    /* renamed from: f */
    private int f45551f;

    zzbb(byte[] bArr, int i, int i2) {
        super((zzbd) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f45549d = bArr;
            this.f45551f = 0;
            this.f45550e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo53848E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f45549d, this.f45551f, i2);
            this.f45551f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45551f), Integer.valueOf(this.f45550e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo53849F(String str) throws IOException {
        int i = this.f45551f;
        try {
            int a = zzbe.m64091a(str.length() * 3);
            int a2 = zzbe.m64091a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f45551f = i2;
                int b = zzet.m64519b(str, this.f45549d, i2, this.f45550e - i2);
                this.f45551f = i;
                mo53864u((b - i) - a2);
                this.f45551f = b;
                return;
            }
            mo53864u(zzet.m64520c(str));
            byte[] bArr = this.f45549d;
            int i3 = this.f45551f;
            this.f45551f = zzet.m64519b(str, bArr, i3, this.f45550e - i3);
        } catch (zzes e) {
            this.f45551f = i;
            mo53868e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbc(e2);
        }
    }

    /* renamed from: g */
    public final int mo53850g() {
        return this.f45550e - this.f45551f;
    }

    /* renamed from: h */
    public final void mo53851h(byte b) throws IOException {
        try {
            byte[] bArr = this.f45549d;
            int i = this.f45551f;
            this.f45551f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45551f), Integer.valueOf(this.f45550e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo53852i(int i, boolean z) throws IOException {
        mo53864u(i << 3);
        mo53851h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo53853j(int i, zzaw zzaw) throws IOException {
        mo53864u((i << 3) | 2);
        mo53864u(zzaw.mo53831f());
        zzaw.mo53837k(this);
    }

    /* renamed from: k */
    public final void mo53854k(int i, int i2) throws IOException {
        mo53864u((i << 3) | 5);
        mo53855l(i2);
    }

    /* renamed from: l */
    public final void mo53855l(int i) throws IOException {
        try {
            byte[] bArr = this.f45549d;
            int i2 = this.f45551f;
            int i3 = i2 + 1;
            this.f45551f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f45551f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f45551f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f45551f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzbc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45551f), Integer.valueOf(this.f45550e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo53856m(int i, long j) throws IOException {
        mo53864u((i << 3) | 1);
        mo53857n(j);
    }

    /* renamed from: n */
    public final void mo53857n(long j) throws IOException {
        try {
            byte[] bArr = this.f45549d;
            int i = this.f45551f;
            int i2 = i + 1;
            this.f45551f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f45551f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f45551f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f45551f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f45551f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f45551f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f45551f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f45551f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzbc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45551f), Integer.valueOf(this.f45550e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo53858o(int i, int i2) throws IOException {
        mo53864u(i << 3);
        mo53859p(i2);
    }

    /* renamed from: p */
    public final void mo53859p(int i) throws IOException {
        if (i >= 0) {
            mo53864u(i);
        } else {
            mo53866w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo53860q(byte[] bArr, int i, int i2) throws IOException {
        mo53848E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo53861r(int i, String str) throws IOException {
        mo53864u((i << 3) | 2);
        mo53849F(str);
    }

    /* renamed from: s */
    public final void mo53862s(int i, int i2) throws IOException {
        mo53864u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo53863t(int i, int i2) throws IOException {
        mo53864u(i << 3);
        mo53864u(i2);
    }

    /* renamed from: u */
    public final void mo53864u(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f45549d;
            int i2 = this.f45551f;
            this.f45551f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f45549d;
            int i3 = this.f45551f;
            this.f45551f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45551f), Integer.valueOf(this.f45550e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo53865v(int i, long j) throws IOException {
        mo53864u(i << 3);
        mo53866w(j);
    }

    /* renamed from: w */
    public final void mo53866w(long j) throws IOException {
        if (!zzbe.f45553c || this.f45550e - this.f45551f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f45549d;
                int i = this.f45551f;
                this.f45551f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f45549d;
                int i2 = this.f45551f;
                this.f45551f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzbc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f45551f), Integer.valueOf(this.f45550e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f45549d;
                int i3 = this.f45551f;
                this.f45551f = i3 + 1;
                zzeo.m64507s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f45549d;
            int i4 = this.f45551f;
            this.f45551f = i4 + 1;
            zzeo.m64507s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzjj extends zzjm {

    /* renamed from: d */
    private final byte[] f41547d;

    /* renamed from: e */
    private final int f41548e;

    /* renamed from: f */
    private int f41549f;

    zzjj(byte[] bArr, int i, int i2) {
        super((zzjl) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f41547d = bArr;
            this.f41549f = 0;
            this.f41548e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo51351E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f41547d, this.f41549f, i2);
            this.f41549f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41549f), Integer.valueOf(this.f41548e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo51352F(String str) throws IOException {
        int i = this.f41549f;
        try {
            int a = zzjm.m60396a(str.length() * 3);
            int a2 = zzjm.m60396a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f41549f = i2;
                int b = zznd.m60882b(str, this.f41547d, i2, this.f41548e - i2);
                this.f41549f = i;
                mo51367u((b - i) - a2);
                this.f41549f = b;
                return;
            }
            mo51367u(zznd.m60883c(str));
            byte[] bArr = this.f41547d;
            int i3 = this.f41549f;
            this.f41549f = zznd.m60882b(str, bArr, i3, this.f41548e - i3);
        } catch (zznc e) {
            this.f41549f = i;
            mo51371e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjk(e2);
        }
    }

    /* renamed from: g */
    public final int mo51353g() {
        return this.f41548e - this.f41549f;
    }

    /* renamed from: h */
    public final void mo51354h(byte b) throws IOException {
        try {
            byte[] bArr = this.f41547d;
            int i = this.f41549f;
            this.f41549f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41549f), Integer.valueOf(this.f41548e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo51355i(int i, boolean z) throws IOException {
        mo51367u(i << 3);
        mo51354h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo51356j(int i, zzje zzje) throws IOException {
        mo51367u((i << 3) | 2);
        mo51367u(zzje.mo51336f());
        zzje.mo51343k(this);
    }

    /* renamed from: k */
    public final void mo51357k(int i, int i2) throws IOException {
        mo51367u((i << 3) | 5);
        mo51358l(i2);
    }

    /* renamed from: l */
    public final void mo51358l(int i) throws IOException {
        try {
            byte[] bArr = this.f41547d;
            int i2 = this.f41549f;
            int i3 = i2 + 1;
            this.f41549f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f41549f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f41549f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f41549f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41549f), Integer.valueOf(this.f41548e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo51359m(int i, long j) throws IOException {
        mo51367u((i << 3) | 1);
        mo51360n(j);
    }

    /* renamed from: n */
    public final void mo51360n(long j) throws IOException {
        try {
            byte[] bArr = this.f41547d;
            int i = this.f41549f;
            int i2 = i + 1;
            this.f41549f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f41549f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f41549f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f41549f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f41549f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f41549f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f41549f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f41549f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41549f), Integer.valueOf(this.f41548e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo51361o(int i, int i2) throws IOException {
        mo51367u(i << 3);
        mo51362p(i2);
    }

    /* renamed from: p */
    public final void mo51362p(int i) throws IOException {
        if (i >= 0) {
            mo51367u(i);
        } else {
            mo51369w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo51363q(byte[] bArr, int i, int i2) throws IOException {
        mo51351E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo51364r(int i, String str) throws IOException {
        mo51367u((i << 3) | 2);
        mo51352F(str);
    }

    /* renamed from: s */
    public final void mo51365s(int i, int i2) throws IOException {
        mo51367u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo51366t(int i, int i2) throws IOException {
        mo51367u(i << 3);
        mo51367u(i2);
    }

    /* renamed from: u */
    public final void mo51367u(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f41547d;
            int i2 = this.f41549f;
            this.f41549f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f41547d;
            int i3 = this.f41549f;
            this.f41549f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41549f), Integer.valueOf(this.f41548e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo51368v(int i, long j) throws IOException {
        mo51367u(i << 3);
        mo51369w(j);
    }

    /* renamed from: w */
    public final void mo51369w(long j) throws IOException {
        if (!zzjm.f41551c || this.f41548e - this.f41549f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f41547d;
                int i = this.f41549f;
                this.f41549f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f41547d;
                int i2 = this.f41549f;
                this.f41549f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f41549f), Integer.valueOf(this.f41548e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f41547d;
                int i3 = this.f41549f;
                this.f41549f = i3 + 1;
                zzmy.m60864s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f41547d;
            int i4 = this.f41549f;
            this.f41549f = i4 + 1;
            zzmy.m60864s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}

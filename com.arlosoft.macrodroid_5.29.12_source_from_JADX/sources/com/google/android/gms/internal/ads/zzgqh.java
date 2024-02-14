package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqh extends zzgql {

    /* renamed from: d */
    private final byte[] f37059d;

    /* renamed from: e */
    private final int f37060e;

    /* renamed from: f */
    private int f37061f;

    zzgqh(byte[] bArr, int i, int i2) {
        super((zzgqk) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f37059d = bArr;
            this.f37061f = 0;
            this.f37060e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: A */
    public final void mo47206A(int i, int i2) throws IOException {
        mo47207B(i << 3);
        mo47207B(i2);
    }

    /* renamed from: B */
    public final void mo47207B(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f37059d;
            int i2 = this.f37061f;
            this.f37061f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f37059d;
            int i3 = this.f37061f;
            this.f37061f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37061f), Integer.valueOf(this.f37060e), 1}), e);
        }
    }

    /* renamed from: C */
    public final void mo47208C(int i, long j) throws IOException {
        mo47207B(i << 3);
        mo47209D(j);
    }

    /* renamed from: D */
    public final void mo47209D(long j) throws IOException {
        if (!zzgql.f37064c || this.f37060e - this.f37061f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f37059d;
                int i = this.f37061f;
                this.f37061f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f37059d;
                int i2 = this.f37061f;
                this.f37061f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37061f), Integer.valueOf(this.f37060e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f37059d;
                int i3 = this.f37061f;
                this.f37061f = i3 + 1;
                zzgui.m53455y(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f37059d;
            int i4 = this.f37061f;
            this.f37061f = i4 + 1;
            zzgui.m53455y(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: I */
    public final void mo47210I(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f37059d, this.f37061f, i2);
            this.f37061f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37061f), Integer.valueOf(this.f37060e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: J */
    public final void mo47211J(String str) throws IOException {
        int i = this.f37061f;
        try {
            int f = zzgql.m52833f(str.length() * 3);
            int f2 = zzgql.m52833f(str.length());
            if (f2 == f) {
                int i2 = i + f2;
                this.f37061f = i2;
                int d = zzgun.m53473d(str, this.f37059d, i2, this.f37060e - i2);
                this.f37061f = i;
                mo47207B((d - i) - f2);
                this.f37061f = d;
                return;
            }
            mo47207B(zzgun.m53474e(str));
            byte[] bArr = this.f37059d;
            int i3 = this.f37061f;
            this.f37061f = zzgun.m53473d(str, bArr, i3, this.f37060e - i3);
        } catch (zzgum e) {
            this.f37061f = i;
            mo47228k(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgqi(e2);
        }
    }

    /* renamed from: a */
    public final void mo47074a(byte[] bArr, int i, int i2) throws IOException {
        mo47210I(bArr, i, i2);
    }

    /* renamed from: m */
    public final void mo47212m() {
    }

    /* renamed from: n */
    public final void mo47213n(byte b) throws IOException {
        try {
            byte[] bArr = this.f37059d;
            int i = this.f37061f;
            this.f37061f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37061f), Integer.valueOf(this.f37060e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo47214o(int i, boolean z) throws IOException {
        mo47207B(i << 3);
        mo47213n(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo47215p(int i, zzgpw zzgpw) throws IOException {
        mo47207B((i << 3) | 2);
        mo47207B(zzgpw.mo47083m());
        zzgpw.mo47090F(this);
    }

    /* renamed from: q */
    public final int mo47205q() {
        return this.f37060e - this.f37061f;
    }

    /* renamed from: r */
    public final void mo47216r(int i, int i2) throws IOException {
        mo47207B((i << 3) | 5);
        mo47217s(i2);
    }

    /* renamed from: s */
    public final void mo47217s(int i) throws IOException {
        try {
            byte[] bArr = this.f37059d;
            int i2 = this.f37061f;
            int i3 = i2 + 1;
            this.f37061f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f37061f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f37061f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f37061f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37061f), Integer.valueOf(this.f37060e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo47218t(int i, long j) throws IOException {
        mo47207B((i << 3) | 1);
        mo47219u(j);
    }

    /* renamed from: u */
    public final void mo47219u(long j) throws IOException {
        try {
            byte[] bArr = this.f37059d;
            int i = this.f37061f;
            int i2 = i + 1;
            this.f37061f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f37061f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f37061f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f37061f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f37061f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f37061f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f37061f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f37061f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgqi(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f37061f), Integer.valueOf(this.f37060e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo47220v(int i, int i2) throws IOException {
        mo47207B(i << 3);
        mo47221w(i2);
    }

    /* renamed from: w */
    public final void mo47221w(int i) throws IOException {
        if (i >= 0) {
            mo47207B(i);
        } else {
            mo47209D((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo47222x(int i, zzgso zzgso, zzgth zzgth) throws IOException {
        mo47207B((i << 3) | 2);
        zzgpf zzgpf = (zzgpf) zzgso;
        int a = zzgpf.mo47047a();
        if (a == -1) {
            a = zzgth.mo47412a(zzgpf);
            zzgpf.mo47048d(a);
        }
        mo47207B(a);
        zzgth.mo47420i(zzgso, this.f37065a);
    }

    /* renamed from: y */
    public final void mo47223y(int i, String str) throws IOException {
        mo47207B((i << 3) | 2);
        mo47211J(str);
    }

    /* renamed from: z */
    public final void mo47224z(int i, int i2) throws IOException {
        mo47207B((i << 3) | i2);
    }
}

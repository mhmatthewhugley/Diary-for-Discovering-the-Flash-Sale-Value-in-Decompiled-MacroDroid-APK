package com.google.android.gms.internal.icing;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzck extends zzcm {

    /* renamed from: d */
    private final byte[] f40799d;

    /* renamed from: e */
    private final int f40800e;

    /* renamed from: f */
    private int f40801f;

    zzck(byte[] bArr, int i, int i2) {
        super((zzcj) null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f40799d = bArr;
            this.f40801f = 0;
            this.f40800e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo50228E(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f40799d, this.f40801f, i2);
            this.f40801f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f40801f), Integer.valueOf(this.f40800e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo50229F(String str) throws IOException {
        int i = this.f40801f;
        try {
            int A = zzcm.m58699A(str.length() * 3);
            int A2 = zzcm.m58699A(str.length());
            if (A2 == A) {
                int i2 = i + A2;
                this.f40801f = i2;
                int d = zzfr.m59101d(str, this.f40799d, i2, this.f40800e - i2);
                this.f40801f = i;
                mo50241r((d - i) - A2);
                this.f40801f = d;
                return;
            }
            mo50241r(zzfr.m59100c(str));
            byte[] bArr = this.f40799d;
            int i3 = this.f40801f;
            this.f40801f = zzfr.m59101d(str, bArr, i3, this.f40800e - i3);
        } catch (zzfq e) {
            this.f40801f = i;
            mo50248d(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzcl(e2);
        }
    }

    /* renamed from: g */
    public final void mo50230g(int i, int i2) throws IOException {
        mo50241r((i << 3) | i2);
    }

    /* renamed from: h */
    public final void mo50231h(int i, int i2) throws IOException {
        mo50241r(i << 3);
        mo50240q(i2);
    }

    /* renamed from: i */
    public final void mo50232i(int i, int i2) throws IOException {
        mo50241r(i << 3);
        mo50241r(i2);
    }

    /* renamed from: j */
    public final void mo50233j(int i, int i2) throws IOException {
        mo50241r((i << 3) | 5);
        mo50242s(i2);
    }

    /* renamed from: k */
    public final void mo50234k(int i, long j) throws IOException {
        mo50241r(i << 3);
        mo50243t(j);
    }

    /* renamed from: l */
    public final void mo50235l(int i, long j) throws IOException {
        mo50241r((i << 3) | 1);
        mo50244u(j);
    }

    /* renamed from: m */
    public final void mo50236m(int i, boolean z) throws IOException {
        mo50241r(i << 3);
        mo50239p(z ? (byte) 1 : 0);
    }

    /* renamed from: n */
    public final void mo50237n(int i, String str) throws IOException {
        mo50241r((i << 3) | 2);
        mo50229F(str);
    }

    /* renamed from: o */
    public final void mo50238o(int i, zzcf zzcf) throws IOException {
        mo50241r((i << 3) | 2);
        mo50241r(zzcf.mo50214f());
        zzcf.mo50218i(this);
    }

    /* renamed from: p */
    public final void mo50239p(byte b) throws IOException {
        try {
            byte[] bArr = this.f40799d;
            int i = this.f40801f;
            this.f40801f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f40801f), Integer.valueOf(this.f40800e), 1}), e);
        }
    }

    /* renamed from: q */
    public final void mo50240q(int i) throws IOException {
        if (i >= 0) {
            mo50241r(i);
        } else {
            mo50243t((long) i);
        }
    }

    /* renamed from: r */
    public final void mo50241r(int i) throws IOException {
        if (zzcm.f40803c) {
            int i2 = zzbu.f40784a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f40799d;
            int i3 = this.f40801f;
            this.f40801f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f40799d;
            int i4 = this.f40801f;
            this.f40801f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f40801f), Integer.valueOf(this.f40800e), 1}), e);
        }
    }

    /* renamed from: s */
    public final void mo50242s(int i) throws IOException {
        try {
            byte[] bArr = this.f40799d;
            int i2 = this.f40801f;
            int i3 = i2 + 1;
            this.f40801f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f40801f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f40801f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f40801f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f40801f), Integer.valueOf(this.f40800e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo50243t(long j) throws IOException {
        if (!zzcm.f40803c || this.f40800e - this.f40801f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f40799d;
                int i = this.f40801f;
                this.f40801f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f40799d;
                int i2 = this.f40801f;
                this.f40801f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f40801f), Integer.valueOf(this.f40800e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f40799d;
                int i3 = this.f40801f;
                this.f40801f = i3 + 1;
                zzfn.m59089u(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f40799d;
            int i4 = this.f40801f;
            this.f40801f = i4 + 1;
            zzfn.m59089u(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: u */
    public final void mo50244u(long j) throws IOException {
        try {
            byte[] bArr = this.f40799d;
            int i = this.f40801f;
            int i2 = i + 1;
            this.f40801f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f40801f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f40801f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f40801f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f40801f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f40801f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f40801f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f40801f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f40801f), Integer.valueOf(this.f40800e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo50245v(byte[] bArr, int i, int i2) throws IOException {
        mo50228E(bArr, 0, i2);
    }

    /* renamed from: w */
    public final int mo50246w() {
        return this.f40800e - this.f40801f;
    }
}

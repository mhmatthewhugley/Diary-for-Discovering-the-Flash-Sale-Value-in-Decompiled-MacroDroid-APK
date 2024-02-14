package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzacj extends zzacn {

    /* renamed from: d */
    private final byte[] f39657d;

    /* renamed from: e */
    private final int f39658e;

    /* renamed from: f */
    private int f39659f;

    zzacj(byte[] bArr, int i, int i2) {
        super((zzacm) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f39657d = bArr;
            this.f39659f = 0;
            this.f39658e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: A */
    public final void mo48973A(int i, int i2) throws IOException {
        mo48974B(i << 3);
        mo48974B(i2);
    }

    /* renamed from: B */
    public final void mo48974B(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f39657d;
            int i2 = this.f39659f;
            this.f39659f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f39657d;
            int i3 = this.f39659f;
            this.f39659f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f39659f), Integer.valueOf(this.f39658e), 1}), e);
        }
    }

    /* renamed from: C */
    public final void mo48975C(int i, long j) throws IOException {
        mo48974B(i << 3);
        mo48976D(j);
    }

    /* renamed from: D */
    public final void mo48976D(long j) throws IOException {
        if (!zzacn.f39662c || this.f39658e - this.f39659f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f39657d;
                int i = this.f39659f;
                this.f39659f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f39657d;
                int i2 = this.f39659f;
                this.f39659f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f39659f), Integer.valueOf(this.f39658e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f39657d;
                int i3 = this.f39659f;
                this.f39659f = i3 + 1;
                zzafx.m56852s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f39657d;
            int i4 = this.f39659f;
            this.f39659f = i4 + 1;
            zzafx.m56852s(bArr4, (long) i4, (byte) ((int) j));
        }
    }

    /* renamed from: I */
    public final void mo48977I(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f39657d, this.f39659f, i2);
            this.f39659f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f39659f), Integer.valueOf(this.f39658e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: J */
    public final void mo48978J(String str) throws IOException {
        int i = this.f39659f;
        try {
            int f = zzacn.m56312f(str.length() * 3);
            int f2 = zzacn.m56312f(str.length());
            if (f2 == f) {
                int i2 = i + f2;
                this.f39659f = i2;
                int b = zzagc.m56873b(str, this.f39657d, i2, this.f39658e - i2);
                this.f39659f = i;
                mo48974B((b - i) - f2);
                this.f39659f = b;
                return;
            }
            mo48974B(zzagc.m56874c(str));
            byte[] bArr = this.f39657d;
            int i3 = this.f39659f;
            this.f39659f = zzagc.m56873b(str, bArr, i3, this.f39658e - i3);
        } catch (zzagb e) {
            this.f39659f = i;
            mo48995k(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzack(e2);
        }
    }

    /* renamed from: a */
    public final void mo48884a(byte[] bArr, int i, int i2) throws IOException {
        mo48977I(bArr, 0, i2);
    }

    /* renamed from: m */
    public final void mo48979m() {
    }

    /* renamed from: n */
    public final void mo48980n(byte b) throws IOException {
        try {
            byte[] bArr = this.f39657d;
            int i = this.f39659f;
            this.f39659f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f39659f), Integer.valueOf(this.f39658e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo48981o(int i, boolean z) throws IOException {
        mo48974B(i << 3);
        mo48980n(z ? (byte) 1 : 0);
    }

    /* renamed from: p */
    public final void mo48982p(int i, zzacc zzacc) throws IOException {
        mo48974B((i << 3) | 2);
        mo48974B(zzacc.mo48893f());
        zzacc.mo48900m(this);
    }

    /* renamed from: q */
    public final int mo48972q() {
        return this.f39658e - this.f39659f;
    }

    /* renamed from: r */
    public final void mo48983r(int i, int i2) throws IOException {
        mo48974B((i << 3) | 5);
        mo48984s(i2);
    }

    /* renamed from: s */
    public final void mo48984s(int i) throws IOException {
        try {
            byte[] bArr = this.f39657d;
            int i2 = this.f39659f;
            int i3 = i2 + 1;
            this.f39659f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f39659f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f39659f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f39659f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f39659f), Integer.valueOf(this.f39658e), 1}), e);
        }
    }

    /* renamed from: t */
    public final void mo48985t(int i, long j) throws IOException {
        mo48974B((i << 3) | 1);
        mo48986u(j);
    }

    /* renamed from: u */
    public final void mo48986u(long j) throws IOException {
        try {
            byte[] bArr = this.f39657d;
            int i = this.f39659f;
            int i2 = i + 1;
            this.f39659f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f39659f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f39659f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f39659f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f39659f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f39659f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f39659f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f39659f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f39659f), Integer.valueOf(this.f39658e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo48987v(int i, int i2) throws IOException {
        mo48974B(i << 3);
        mo48988w(i2);
    }

    /* renamed from: w */
    public final void mo48988w(int i) throws IOException {
        if (i >= 0) {
            mo48974B(i);
        } else {
            mo48976D((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo48989x(int i, zzaek zzaek, zzaew zzaew) throws IOException {
        mo48974B((i << 3) | 2);
        mo48974B(((zzabm) zzaek).mo48858b(zzaew));
        zzaew.mo49147h(zzaek, this.f39663a);
    }

    /* renamed from: y */
    public final void mo48990y(int i, String str) throws IOException {
        mo48974B((i << 3) | 2);
        mo48978J(str);
    }

    /* renamed from: z */
    public final void mo48991z(int i, int i2) throws IOException {
        mo48974B((i << 3) | i2);
    }
}

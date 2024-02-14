package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaci */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzaci extends zzacn {

    /* renamed from: d */
    final byte[] f39653d;

    /* renamed from: e */
    final int f39654e;

    /* renamed from: f */
    int f39655f;

    /* renamed from: g */
    int f39656g;

    zzaci(int i) {
        super((zzacm) null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f39653d = bArr;
            this.f39654e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo48967I(byte b) {
        byte[] bArr = this.f39653d;
        int i = this.f39655f;
        this.f39655f = i + 1;
        bArr[i] = b;
        this.f39656g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo48968J(int i) {
        byte[] bArr = this.f39653d;
        int i2 = this.f39655f;
        int i3 = i2 + 1;
        this.f39655f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f39655f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f39655f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f39655f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f39656g += 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo48969K(long j) {
        byte[] bArr = this.f39653d;
        int i = this.f39655f;
        int i2 = i + 1;
        this.f39655f = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.f39655f = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.f39655f = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.f39655f = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        this.f39655f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f39655f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f39655f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f39655f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f39656g += 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo48970L(int i) {
        if (zzacn.f39662c) {
            long j = (long) this.f39655f;
            while ((i & -128) != 0) {
                byte[] bArr = this.f39653d;
                int i2 = this.f39655f;
                this.f39655f = i2 + 1;
                zzafx.m56852s(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f39653d;
            int i3 = this.f39655f;
            this.f39655f = i3 + 1;
            zzafx.m56852s(bArr2, (long) i3, (byte) i);
            this.f39656g += (int) (((long) this.f39655f) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.f39653d;
            int i4 = this.f39655f;
            this.f39655f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f39656g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f39653d;
        int i5 = this.f39655f;
        this.f39655f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f39656g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo48971M(long j) {
        if (zzacn.f39662c) {
            long j2 = (long) this.f39655f;
            while ((j & -128) != 0) {
                byte[] bArr = this.f39653d;
                int i = this.f39655f;
                this.f39655f = i + 1;
                zzafx.m56852s(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f39653d;
            int i2 = this.f39655f;
            this.f39655f = i2 + 1;
            zzafx.m56852s(bArr2, (long) i2, (byte) ((int) j));
            this.f39656g += (int) (((long) this.f39655f) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f39653d;
            int i3 = this.f39655f;
            this.f39655f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f39656g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f39653d;
        int i4 = this.f39655f;
        this.f39655f = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f39656g++;
    }

    /* renamed from: q */
    public final int mo48972q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}

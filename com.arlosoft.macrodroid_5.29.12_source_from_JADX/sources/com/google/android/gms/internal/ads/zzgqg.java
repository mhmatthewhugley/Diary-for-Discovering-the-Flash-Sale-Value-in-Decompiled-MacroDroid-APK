package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzgqg extends zzgql {

    /* renamed from: d */
    final byte[] f37055d;

    /* renamed from: e */
    final int f37056e;

    /* renamed from: f */
    int f37057f;

    /* renamed from: g */
    int f37058g;

    zzgqg(int i) {
        super((zzgqk) null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f37055d = bArr;
            this.f37056e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo47200I(byte b) {
        byte[] bArr = this.f37055d;
        int i = this.f37057f;
        this.f37057f = i + 1;
        bArr[i] = b;
        this.f37058g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo47201J(int i) {
        byte[] bArr = this.f37055d;
        int i2 = this.f37057f;
        int i3 = i2 + 1;
        this.f37057f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f37057f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f37057f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f37057f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f37058g += 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo47202K(long j) {
        byte[] bArr = this.f37055d;
        int i = this.f37057f;
        int i2 = i + 1;
        this.f37057f = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.f37057f = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.f37057f = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.f37057f = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        this.f37057f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f37057f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f37057f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f37057f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f37058g += 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo47203L(int i) {
        if (zzgql.f37064c) {
            long j = (long) this.f37057f;
            while ((i & -128) != 0) {
                byte[] bArr = this.f37055d;
                int i2 = this.f37057f;
                this.f37057f = i2 + 1;
                zzgui.m53455y(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f37055d;
            int i3 = this.f37057f;
            this.f37057f = i3 + 1;
            zzgui.m53455y(bArr2, (long) i3, (byte) i);
            this.f37058g += (int) (((long) this.f37057f) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.f37055d;
            int i4 = this.f37057f;
            this.f37057f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f37058g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f37055d;
        int i5 = this.f37057f;
        this.f37057f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f37058g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo47204M(long j) {
        if (zzgql.f37064c) {
            long j2 = (long) this.f37057f;
            while ((j & -128) != 0) {
                byte[] bArr = this.f37055d;
                int i = this.f37057f;
                this.f37057f = i + 1;
                zzgui.m53455y(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f37055d;
            int i2 = this.f37057f;
            this.f37057f = i2 + 1;
            zzgui.m53455y(bArr2, (long) i2, (byte) ((int) j));
            this.f37058g += (int) (((long) this.f37057f) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f37055d;
            int i3 = this.f37057f;
            this.f37057f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f37058g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f37055d;
        int i4 = this.f37057f;
        this.f37057f = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f37058g++;
    }

    /* renamed from: q */
    public final int mo47205q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}

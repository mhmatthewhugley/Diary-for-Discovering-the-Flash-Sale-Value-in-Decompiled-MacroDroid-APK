package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzahr {

    /* renamed from: a */
    private final int f24669a;

    /* renamed from: b */
    private boolean f24670b;

    /* renamed from: c */
    private boolean f24671c;

    /* renamed from: d */
    public byte[] f24672d;

    /* renamed from: e */
    public int f24673e;

    public zzahr(int i, int i2) {
        this.f24669a = i;
        byte[] bArr = new byte[131];
        this.f24672d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo41491a(byte[] bArr, int i, int i2) {
        if (this.f24670b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f24672d;
            int length = bArr2.length;
            int i4 = this.f24673e + i3;
            if (length < i4) {
                this.f24672d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f24672d, this.f24673e, i3);
            this.f24673e += i3;
        }
    }

    /* renamed from: b */
    public final void mo41492b() {
        this.f24670b = false;
        this.f24671c = false;
    }

    /* renamed from: c */
    public final void mo41493c(int i) {
        boolean z = true;
        zzdd.m47212f(!this.f24670b);
        if (i != this.f24669a) {
            z = false;
        }
        this.f24670b = z;
        if (z) {
            this.f24673e = 3;
            this.f24671c = false;
        }
    }

    /* renamed from: d */
    public final boolean mo41494d(int i) {
        if (!this.f24670b) {
            return false;
        }
        this.f24673e -= i;
        this.f24670b = false;
        this.f24671c = true;
        return true;
    }

    /* renamed from: e */
    public final boolean mo41495e() {
        return this.f24671c;
    }
}

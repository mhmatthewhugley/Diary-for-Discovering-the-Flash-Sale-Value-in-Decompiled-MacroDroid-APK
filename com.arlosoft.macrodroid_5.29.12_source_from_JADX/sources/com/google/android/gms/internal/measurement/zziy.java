package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zziy extends zzjb {
    private final int zzc;

    zziy(byte[] bArr, int i, int i2) {
        super(bArr);
        zzje.m60357m(0, i2, bArr.length);
        this.zzc = i2;
    }

    /* renamed from: c */
    public final byte mo51334c(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final byte mo51335d(int i) {
        return this.zza[i];
    }

    /* renamed from: f */
    public final int mo51336f() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo51337u() {
        return 0;
    }
}

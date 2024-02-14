package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzaq extends zzat {
    private final int zzc;

    zzaq(byte[] bArr, int i, int i2) {
        super(bArr);
        zzaw.m64052m(0, i2, bArr.length);
        this.zzc = i2;
    }

    /* renamed from: c */
    public final byte mo53829c(int i) {
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
    public final byte mo53830d(int i) {
        return this.zza[i];
    }

    /* renamed from: f */
    public final int mo53831f() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final int mo53832w() {
        return 0;
    }
}

package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzca extends zzcd {
    private final int zzc;

    zzca(byte[] bArr, int i, int i2) {
        super(bArr);
        zzcf.m58668q(0, i2, bArr.length);
        this.zzc = i2;
    }

    /* renamed from: c */
    public final byte mo50212c(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final byte mo50213d(int i) {
        return this.zza[i];
    }

    /* renamed from: f */
    public final int mo50214f() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo50215t() {
        return 0;
    }
}

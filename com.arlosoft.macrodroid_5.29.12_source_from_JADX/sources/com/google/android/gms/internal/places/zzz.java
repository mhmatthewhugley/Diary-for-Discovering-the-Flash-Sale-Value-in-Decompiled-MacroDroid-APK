package com.google.android.gms.internal.places;

final class zzz extends zzag {
    private final int zzek;
    private final int zzel;

    zzz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzw.m63866n(i, i + i2, bArr.length);
        this.zzek = i;
        this.zzel = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final int mo53309B() {
        return this.zzek;
    }

    /* renamed from: q */
    public final byte mo53316q(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzen[this.zzek + i];
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
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final int size() {
        return this.zzel;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final byte mo53318u(int i) {
        return this.zzen[this.zzek + i];
    }
}

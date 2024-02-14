package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgpc {

    /* renamed from: a */
    private final byte[] f36990a;

    private zzgpc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f36990a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: a */
    public static zzgpc m52501a(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new zzgpc(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public final byte[] mo47038b() {
        byte[] bArr = this.f36990a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpc)) {
            return false;
        }
        return Arrays.equals(((zzgpc) obj).f36990a, this.f36990a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36990a);
    }

    public final String toString() {
        String a = zzgoq.m52480a(this.f36990a);
        return "Bytes(" + a + ")";
    }
}

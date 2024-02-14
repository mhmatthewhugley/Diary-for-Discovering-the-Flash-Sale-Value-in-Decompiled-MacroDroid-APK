package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqv {

    /* renamed from: a */
    private final byte[] f40350a;

    private zzqv(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f40350a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: b */
    public static zzqv m57986b(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        return new zzqv(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final int mo49721a() {
        return this.f40350a.length;
    }

    /* renamed from: c */
    public final byte[] mo49722c() {
        byte[] bArr = this.f40350a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqv)) {
            return false;
        }
        return Arrays.equals(((zzqv) obj).f40350a, this.f40350a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40350a);
    }

    public final String toString() {
        String a = zzqj.m57968a(this.f40350a);
        return "Bytes(" + a + ")";
    }
}

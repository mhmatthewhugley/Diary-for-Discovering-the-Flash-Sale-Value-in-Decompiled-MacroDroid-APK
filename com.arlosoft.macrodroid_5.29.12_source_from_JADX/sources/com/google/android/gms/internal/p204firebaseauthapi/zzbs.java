package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzbs implements Comparable {

    /* renamed from: a */
    private final byte[] f39926a;

    /* synthetic */ zzbs(byte[] bArr, zzbr zzbr) {
        this.f39926a = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzbs zzbs = (zzbs) obj;
        int length = this.f39926a.length;
        int length2 = zzbs.f39926a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f39926a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = zzbs.f39926a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbs)) {
            return false;
        }
        return Arrays.equals(this.f39926a, ((zzbs) obj).f39926a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39926a);
    }

    public final String toString() {
        return zzqj.m57968a(this.f39926a);
    }
}

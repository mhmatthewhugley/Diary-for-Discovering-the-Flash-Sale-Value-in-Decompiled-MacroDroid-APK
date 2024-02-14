package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgbq implements Comparable {

    /* renamed from: a */
    private final byte[] f36659a;

    /* synthetic */ zzgbq(byte[] bArr, zzgbp zzgbp) {
        this.f36659a = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzgbq zzgbq = (zzgbq) obj;
        int length = this.f36659a.length;
        int length2 = zzgbq.f36659a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f36659a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = zzgbq.f36659a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgbq)) {
            return false;
        }
        return Arrays.equals(this.f36659a, ((zzgbq) obj).f36659a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36659a);
    }

    public final String toString() {
        return zzgoq.m52480a(this.f36659a);
    }
}

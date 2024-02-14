package com.google.android.gms.nearby.messages.internal;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class zzc {

    /* renamed from: b */
    private static final char[] f47793b = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    private final byte[] f47794a;

    /* renamed from: b */
    public static String m66517b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b : bArr) {
            char[] cArr = f47793b;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo55983a() {
        return m66517b(this.f47794a);
    }

    /* renamed from: c */
    public final byte[] mo55984c() {
        return this.f47794a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!obj.getClass().isAssignableFrom(getClass())) {
            return false;
        }
        return Arrays.equals(this.f47794a, ((zzc) obj).f47794a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f47794a);
    }

    public String toString() {
        return m66517b(this.f47794a);
    }
}

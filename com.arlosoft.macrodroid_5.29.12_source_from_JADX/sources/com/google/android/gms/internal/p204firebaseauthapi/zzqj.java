package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqj {
    /* renamed from: a */
    public static String m57968a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b : bArr) {
            byte b2 = b & 255;
            sb.append("0123456789abcdef".charAt(b2 >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }
}

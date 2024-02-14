package com.google.android.gms.internal.p204firebaseauthapi;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class zzxf {
    /* renamed from: a */
    public static String m58371a(zzxg zzxg, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256).digest(str.getBytes()));
            int length = str2.length();
            int i = 0;
            while (i < length) {
                if (zzi.m57374a(str2.charAt(i))) {
                    char[] charArray = str2.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (zzi.m57374a(c)) {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    return String.valueOf(charArray);
                }
                i++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzxg.f40592h.mo21839c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }
}

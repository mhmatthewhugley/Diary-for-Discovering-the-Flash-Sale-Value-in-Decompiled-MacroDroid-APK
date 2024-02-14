package com.arlosoft.macrodroid.common;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.common.d1 */
/* compiled from: SerialCalculator */
public class C4004d1 {
    /* renamed from: a */
    public static String m15679a(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256), 1, 3);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            C8151a.m33873n(new RuntimeException("Serial Calculator Error: " + e.getMessage()));
            return null;
        }
    }

    /* renamed from: b */
    private static String m15680b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m15681c(String str) {
        return m15682d(str, 12);
    }

    /* renamed from: d */
    public static String m15682d(String str, int i) {
        String lowerCase = str.toLowerCase();
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    lowerCase = m15680b(MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA1).digest(lowerCase.getBytes("UTF-8")));
                    i3++;
                } catch (Exception e) {
                    C8151a.m33873n(new RuntimeException("Serial Calculator Error: " + e.getMessage()));
                    return null;
                }
            }
            lowerCase = m15679a(lowerCase);
        }
        return lowerCase.substring(0, 12);
    }
}

package com.google.api.client.repackaged.org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;

public class StringUtils {
    /* renamed from: a */
    public static byte[] m72541a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw m72543c(str2, e);
        }
    }

    /* renamed from: b */
    public static byte[] m72542b(String str) {
        return m72541a(str, "UTF-8");
    }

    /* renamed from: c */
    private static IllegalStateException m72543c(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    /* renamed from: d */
    public static String m72544d(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw m72543c(str, e);
        }
    }

    /* renamed from: e */
    public static String m72545e(byte[] bArr) {
        return m72544d(bArr, "UTF-8");
    }
}

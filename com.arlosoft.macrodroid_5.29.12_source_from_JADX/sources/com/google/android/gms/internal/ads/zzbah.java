package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbah {
    /* renamed from: a */
    public static boolean m42941a(String str) {
        return "audio".equals(m42943c(str));
    }

    /* renamed from: b */
    public static boolean m42942b(String str) {
        return "video".equals(m42943c(str));
    }

    /* renamed from: c */
    private static String m42943c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }
}

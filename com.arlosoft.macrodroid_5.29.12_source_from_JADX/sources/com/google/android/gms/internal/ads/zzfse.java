package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzfse {
    /* renamed from: a */
    public static String m50915a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m50919e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m50919e(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static String m50916b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m50918d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m50918d(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m50917c(CharSequence charSequence, CharSequence charSequence2) {
        int f;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((f = m50920f(charAt)) >= 26 || f != m50920f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m50918d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: e */
    public static boolean m50919e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: f */
    private static int m50920f(char c) {
        return (char) ((c | ' ') - 'a');
    }
}

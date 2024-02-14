package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzb {
    /* renamed from: a */
    public static String m61607a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m61608b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m61608b(c)) {
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
    public static boolean m61608b(char c) {
        return c >= 'A' && c <= 'Z';
    }
}

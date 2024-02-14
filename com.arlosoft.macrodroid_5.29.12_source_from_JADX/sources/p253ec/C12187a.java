package p253ec;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C13706o;

/* renamed from: ec.a */
/* compiled from: capitalizeDecapitalize.kt */
public final class C12187a {
    /* renamed from: a */
    public static final String m82850a(String str) {
        C13706o.m87929f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    /* renamed from: b */
    public static final String m82851b(String str) {
        C13706o.m87929f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
        return lowerCase + substring;
    }

    /* renamed from: c */
    public static final String m82852c(String str, boolean z) {
        Object obj;
        C13706o.m87929f(str, "<this>");
        if ((str.length() == 0) || !m82853d(str, 0, z)) {
            return str;
        }
        if (str.length() != 1 && m82853d(str, 1, z)) {
            Iterator it = C15177w.m93675T(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!m82853d(str, ((Number) obj).intValue(), z)) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num == null) {
                return m82854e(str, z);
            }
            int intValue = num.intValue() - 1;
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, intValue);
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(m82854e(substring, z));
            String substring2 = str.substring(intValue);
            C13706o.m87928e(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        } else if (z) {
            return m82851b(str);
        } else {
            if (!(str.length() > 0)) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring3 = str.substring(1);
            C13706o.m87928e(substring3, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring3;
        }
    }

    /* renamed from: d */
    private static final boolean m82853d(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (z) {
            return 'A' <= charAt && charAt < '[';
        }
        return Character.isUpperCase(charAt);
    }

    /* renamed from: e */
    private static final String m82854e(String str, boolean z) {
        if (z) {
            return m82855f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: f */
    public static final String m82855f(String str) {
        C13706o.m87929f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "builder.toString()");
        return sb2;
    }
}

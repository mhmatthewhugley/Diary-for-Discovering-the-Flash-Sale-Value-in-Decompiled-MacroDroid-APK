package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C13570c;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\f\u0010\r\u001a\u00020\u0000*\u00020\fH\u0007\u001a \u0010\u0011\u001a\u00020\u0000*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001c\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0018\u001a\u00020\u0002*\u00020\u0017\u001a4\u0010\u001c\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\f\u0010\u001d\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\u0012\u0010\"\u001a\u00020\u0000*\u00020\u00172\u0006\u0010!\u001a\u00020\u000e¨\u0006#"}, mo71668d2 = {"", "other", "", "ignoreCase", "v", "", "oldChar", "newChar", "B", "oldValue", "newValue", "C", "", "r", "", "startIndex", "endIndex", "s", "prefix", "G", "F", "suffix", "t", "", "x", "thisOffset", "otherOffset", "length", "y", "p", "Ljava/util/Locale;", "locale", "q", "n", "A", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.v */
/* compiled from: StringsJVM.kt */
class C15176v extends C15175u {
    /* renamed from: A */
    public static String m93626A(CharSequence charSequence, int i) {
        C13706o.m87929f(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + FilenameUtils.EXTENSION_SEPARATOR).toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                C13603n0 i2 = new C16788e(1, i).iterator();
                while (i2.hasNext()) {
                    i2.nextInt();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                C13706o.m87928e(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: B */
    public static final String m93627B(String str, char c, char c2, boolean z) {
        C13706o.m87929f(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            C13706o.m87928e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C15146c.m93522d(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: C */
    public static final String m93628C(String str, String str2, String str3, boolean z) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "oldValue");
        C13706o.m87929f(str3, "newValue");
        int i = 0;
        int W = C15177w.m93678W(str, str2, 0, z);
        if (W < 0) {
            return str;
        }
        int length = str2.length();
        int b = C16792h.m99540b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, W);
                sb.append(str3);
                i = W + length;
                if (W >= str.length() || (W = C15177w.m93678W(str, str2, W + b, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    C13706o.m87928e(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, W);
                sb.append(str3);
                i = W + length;
                break;
            } while ((W = C15177w.m93678W(str, str2, W + b, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            C13706o.m87928e(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: D */
    public static /* synthetic */ String m93629D(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m93627B(str, c, c2, z);
    }

    /* renamed from: E */
    public static /* synthetic */ String m93630E(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m93628C(str, str2, str3, z);
    }

    /* renamed from: F */
    public static boolean m93631F(String str, String str2, int i, boolean z) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m93644y(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: G */
    public static boolean m93632G(String str, String str2, boolean z) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m93644y(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m93633H(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93631F(str, str2, i, z);
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m93634I(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93632G(str, str2, z);
    }

    /* renamed from: p */
    public static String m93635p(String str) {
        C13706o.m87929f(str, "<this>");
        Locale locale = Locale.getDefault();
        C13706o.m87928e(locale, "getDefault()");
        return m93636q(str, locale);
    }

    /* renamed from: q */
    public static final String m93636q(String str, Locale locale) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            C13706o.m87927d(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            C13706o.m87928e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        C13706o.m87928e(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: r */
    public static String m93637r(char[] cArr) {
        C13706o.m87929f(cArr, "<this>");
        return new String(cArr);
    }

    /* renamed from: s */
    public static String m93638s(char[] cArr, int i, int i2) {
        C13706o.m87929f(cArr, "<this>");
        C13570c.Companion.mo71704a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    /* renamed from: t */
    public static boolean m93639t(String str, String str2, boolean z) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m93644y(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m93640u(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93639t(str, str2, z);
    }

    /* renamed from: v */
    public static boolean m93641v(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m93642w(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93641v(str, str2, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m93643x(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            wa.e r0 = kotlin.text.C15177w.m93675T(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            kotlin.collections.n0 r3 = (kotlin.collections.C13603n0) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.text.C15145b.m93521c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C15176v.m93643x(java.lang.CharSequence):boolean");
    }

    /* renamed from: y */
    public static final boolean m93644y(String str, int i, String str2, int i2, int i3, boolean z) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m93645z(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        return m93644y(str, i, str2, i2, i3, (i4 & 16) != 0 ? false : z);
    }
}

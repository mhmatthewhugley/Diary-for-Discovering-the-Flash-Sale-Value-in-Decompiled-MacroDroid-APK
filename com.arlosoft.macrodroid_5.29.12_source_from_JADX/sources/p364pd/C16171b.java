package p364pd;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;
import p351od.C15852c;

/* renamed from: pd.b */
/* compiled from: StringUtil */
public final class C16171b {

    /* renamed from: a */
    static final String[] f66407a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b */
    private static final Pattern f66408b = Pattern.compile("^/((\\.{1,2}/)+)");

    /* renamed from: c */
    private static final Pattern f66409c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* renamed from: d */
    private static final ThreadLocal<Stack<StringBuilder>> f66410d = new C16172a();

    /* renamed from: pd.b$a */
    /* compiled from: StringUtil */
    class C16172a extends ThreadLocal<Stack<StringBuilder>> {
        C16172a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    /* renamed from: a */
    public static void m97070a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (m97074e(codePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!m97076g(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z2 = true;
                z3 = false;
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: b */
    public static StringBuilder m97071b() {
        Stack stack = f66410d.get();
        if (stack.empty()) {
            return new StringBuilder(8192);
        }
        return (StringBuilder) stack.pop();
    }

    /* renamed from: c */
    public static boolean m97072c(String str, String... strArr) {
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m97073d(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* renamed from: e */
    public static boolean m97074e(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    /* renamed from: f */
    public static boolean m97075f(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m97077h(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m97076g(int i) {
        return i == 8203 || i == 173;
    }

    /* renamed from: h */
    public static boolean m97077h(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* renamed from: i */
    public static String m97078i(int i, int i2) {
        boolean z = true;
        C15852c.m95475d(i >= 0, "width must be >= 0");
        if (i2 < -1) {
            z = false;
        }
        C15852c.m95474c(z);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = f66407a;
        if (i < strArr.length) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* renamed from: j */
    public static String m97079j(StringBuilder sb) {
        C15852c.m95479h(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack stack = f66410d.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    /* renamed from: k */
    public static String m97080k(String str, String str2) {
        try {
            try {
                return m97081l(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return f66409c.matcher(str2).find() ? str2 : "";
            }
        } catch (MalformedURLException unused2) {
            return new URL(str2).toExternalForm();
        }
    }

    /* renamed from: l */
    public static URL m97081l(URL url, String str) throws MalformedURLException {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String replaceFirst = f66408b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}

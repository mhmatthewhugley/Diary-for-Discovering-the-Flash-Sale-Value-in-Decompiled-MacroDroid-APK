package com.arlosoft.macrodroid.utils;

import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.arlosoft.macrodroid.utils.y1 */
/* compiled from: WildCardHelper */
public class C6460y1 {

    /* renamed from: a */
    private static Pattern f15086a = Pattern.compile("[{}()\\[\\].+^$\\\\|]");

    /* renamed from: a */
    private static String m24789a(String str) {
        return f15086a.matcher(str).replaceAll("\\\\$0");
    }

    /* renamed from: b */
    public static String m24790b(String str, boolean z) {
        if (z) {
            return "(?s)".concat(str);
        }
        String a = m24789a(str);
        return "(?s)".concat(".*") + a.replace(ProxyConfig.MATCH_ALL_SCHEMES, ".*").replace("..*", ".*").replace("?", ".").concat(".*");
    }

    /* renamed from: c */
    public static String m24791c(String str, boolean z) {
        if (z) {
            return "(?s)".concat(str);
        }
        return "(?s)".concat(m24789a(str).replace(ProxyConfig.MATCH_ALL_SCHEMES, ".*").replace("..*", ".*").replace("?", "."));
    }

    /* renamed from: d */
    public static boolean m24792d(String str, String str2, boolean z) {
        if (!z) {
            return m24793e(str, str2);
        }
        try {
            return Pattern.compile(str2).matcher(str).find();
        } catch (PatternSyntaxException e) {
            C4878b.m18868g("Error with regex, you may need to escape a special character (for example if matching the + character then you should write \\+) : " + e);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m24793e(String str, String str2) {
        try {
            return str.matches(str2);
        } catch (PatternSyntaxException e) {
            C4878b.m18868g("Error with regex, you may need to escape a special character (for example if matching the + character then you should write \\+) : " + e);
            return false;
        }
    }
}

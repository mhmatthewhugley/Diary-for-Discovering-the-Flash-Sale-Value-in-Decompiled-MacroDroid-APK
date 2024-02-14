package p273ge;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.p353io.IOUtils;

/* renamed from: ge.c */
/* compiled from: StringUtil */
public class C12365c {

    /* renamed from: a */
    private static final Pattern f59051a = Pattern.compile("([A-Z\\d][^A-Z\\d]*)");

    /* renamed from: a */
    private static String m83124a(String str) {
        Matcher matcher = f59051a.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            if (sb.length() == 0) {
                sb.append(matcher.group());
            } else {
                sb.append(" ");
                sb.append(matcher.group().toLowerCase());
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m83125b(String str) {
        if (str.length() == 0) {
            return "<custom argument matcher>";
        }
        String a = m83124a(str);
        if (a.length() == 0) {
            return "<" + str + ">";
        }
        return "<" + a + ">";
    }

    /* renamed from: c */
    public static String m83126c(String str, String str2, Collection<?> collection) {
        if (collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        for (Object next : collection) {
            sb.append(str2);
            sb.append(next);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* renamed from: d */
    public static String m83127d(String str, Collection<?> collection) {
        return m83126c(str, "", collection);
    }

    /* renamed from: e */
    public static String m83128e(Object... objArr) {
        return m83127d(IOUtils.LINE_SEPARATOR_UNIX, Arrays.asList(objArr));
    }
}

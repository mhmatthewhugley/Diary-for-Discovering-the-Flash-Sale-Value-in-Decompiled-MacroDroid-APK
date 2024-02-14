package p351od;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* renamed from: od.b */
/* compiled from: DataUtil */
public final class C15851b {

    /* renamed from: a */
    private static final Pattern f65300a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b */
    public static final Charset f65301b;

    /* renamed from: c */
    static final String f65302c;

    /* renamed from: d */
    private static final char[] f65303d = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    static {
        Charset forName = Charset.forName("UTF-8");
        f65301b = forName;
        f65302c = forName.name();
    }
}

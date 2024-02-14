package com.google.api.client.util.escape;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class CharEscapers {

    /* renamed from: a */
    private static final Escaper f52840a = new PercentEscaper("-_.*", true);

    /* renamed from: b */
    private static final Escaper f52841b = new PercentEscaper("-_.!~*'()@:$&,;=", false);

    /* renamed from: c */
    private static final Escaper f52842c = new PercentEscaper("-_.!~*'()@:$&,;=+/?", false);

    /* renamed from: d */
    private static final Escaper f52843d = new PercentEscaper("-_.!~*'():$&,;=", false);

    /* renamed from: e */
    private static final Escaper f52844e = new PercentEscaper("-_.!~*'()@:$,;/?:", false);

    private CharEscapers() {
    }

    /* renamed from: a */
    public static String m72745a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static String m72746b(String str) {
        return f52840a.mo60789a(str);
    }

    /* renamed from: c */
    public static String m72747c(String str) {
        return f52841b.mo60789a(str);
    }

    /* renamed from: d */
    public static String m72748d(String str) {
        return f52842c.mo60789a(str);
    }

    /* renamed from: e */
    public static String m72749e(String str) {
        return f52844e.mo60789a(str);
    }

    /* renamed from: f */
    public static String m72750f(String str) {
        return f52843d.mo60789a(str);
    }
}

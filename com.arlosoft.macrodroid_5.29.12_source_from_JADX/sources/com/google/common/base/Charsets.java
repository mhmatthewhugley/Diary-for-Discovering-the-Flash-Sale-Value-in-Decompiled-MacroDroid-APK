package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Charsets {
    @GwtIncompatible

    /* renamed from: a */
    public static final Charset f4137a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f4138b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final Charset f4139c = Charset.forName("UTF-8");
    @GwtIncompatible

    /* renamed from: d */
    public static final Charset f4140d = Charset.forName("UTF-16BE");
    @GwtIncompatible

    /* renamed from: e */
    public static final Charset f4141e = Charset.forName("UTF-16LE");
    @GwtIncompatible

    /* renamed from: f */
    public static final Charset f4142f = Charset.forName(HTTP.UTF_16);

    private Charsets() {
    }
}

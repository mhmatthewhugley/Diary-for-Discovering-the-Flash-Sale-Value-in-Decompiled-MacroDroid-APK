package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Platform {

    /* renamed from: a */
    private static final Logger f4186a = Logger.getLogger(Platform.class.getName());

    /* renamed from: b */
    private static final PatternCompiler f4187b = m5366d();

    private static final class JdkPatternCompiler implements PatternCompiler {
        private JdkPatternCompiler() {
        }

        /* renamed from: a */
        public CommonPattern mo22205a(String str) {
            return new JdkPattern(Pattern.compile(str));
        }
    }

    private Platform() {
    }

    /* renamed from: a */
    static CommonPattern m5363a(String str) {
        Preconditions.m5392s(str);
        return f4187b.mo22205a(str);
    }

    /* renamed from: b */
    static String m5364b(String str) {
        if (m5367e(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    static String m5365c(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    /* renamed from: d */
    private static PatternCompiler m5366d() {
        return new JdkPatternCompiler();
    }

    /* renamed from: e */
    static boolean m5367e(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: f */
    static long m5368f() {
        return System.nanoTime();
    }
}

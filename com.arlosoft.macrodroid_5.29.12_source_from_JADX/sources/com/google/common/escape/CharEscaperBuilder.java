package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import java.util.HashMap;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class CharEscaperBuilder {

    /* renamed from: a */
    private final Map<Character, String> f17344a = new HashMap();

    /* renamed from: b */
    private int f17345b = -1;

    private static class CharArrayDecorator extends CharEscaper {

        /* renamed from: b */
        private final char[][] f17346b;

        /* renamed from: c */
        private final int f17347c;

        /* renamed from: a */
        public String mo36786a(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char[][] cArr = this.f17346b;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return mo36793c(str, i);
                }
            }
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public char[] mo36787b(char c) {
            if (c < this.f17347c) {
                return this.f17346b[c];
            }
            return null;
        }
    }
}

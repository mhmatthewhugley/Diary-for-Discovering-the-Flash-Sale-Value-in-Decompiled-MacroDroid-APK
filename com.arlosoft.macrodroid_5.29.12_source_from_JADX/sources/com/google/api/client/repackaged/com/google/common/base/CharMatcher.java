package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.Beta;
import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;
import com.google.api.client.repackaged.com.google.common.annotations.GwtIncompatible;
import java.util.Arrays;
import java.util.BitSet;
import org.apache.commons.p353io.IOUtils;

@Beta
@GwtCompatible
public abstract class CharMatcher implements Predicate<Character> {

    /* renamed from: b */
    public static final CharMatcher f52579b = new CharMatcher() {
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            if (!(c == ' ' || c == 133 || c == 5760)) {
                if (c == 8199) {
                    return false;
                }
                if (!(c == 8287 || c == 12288 || c == 8232 || c == 8233)) {
                    switch (c) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
            return true;
        }

        public String toString() {
            return "CharMatcher.BREAKING_WHITESPACE";
        }
    };

    /* renamed from: c */
    public static final CharMatcher f52580c = m72392c(0, 127, "CharMatcher.ASCII");

    /* renamed from: d */
    private static final String f52581d;

    /* renamed from: e */
    public static final CharMatcher f52582e;

    /* renamed from: f */
    public static final CharMatcher f52583f = new CharMatcher("CharMatcher.JAVA_DIGIT") {
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return Character.isDigit(c);
        }
    };

    /* renamed from: g */
    public static final CharMatcher f52584g = new CharMatcher("CharMatcher.JAVA_LETTER") {
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return Character.isLetter(c);
        }
    };

    /* renamed from: h */
    public static final CharMatcher f52585h = new CharMatcher("CharMatcher.JAVA_LETTER_OR_DIGIT") {
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return Character.isLetterOrDigit(c);
        }
    };

    /* renamed from: i */
    public static final CharMatcher f52586i = new CharMatcher("CharMatcher.JAVA_UPPER_CASE") {
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return Character.isUpperCase(c);
        }
    };

    /* renamed from: j */
    public static final CharMatcher f52587j = new CharMatcher("CharMatcher.JAVA_LOWER_CASE") {
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return Character.isLowerCase(c);
        }
    };

    /* renamed from: k */
    public static final CharMatcher f52588k = m72391b(0, 31).mo60573g(m72391b(127, 159)).mo60574i("CharMatcher.JAVA_ISO_CONTROL");

    /* renamed from: l */
    public static final CharMatcher f52589l = new RangesMatcher("CharMatcher.INVISIBLE", "\u0000­؀؜۝܏ ᠎   ⁦⁧⁨⁩⁪　?﻿￹￺".toCharArray(), "  ­؄؜۝܏ ᠎‏ ⁤⁦⁧⁨⁩⁯　﻿￹￻".toCharArray());

    /* renamed from: m */
    public static final CharMatcher f52590m = new RangesMatcher("CharMatcher.SINGLE_WIDTH", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());

    /* renamed from: n */
    public static final CharMatcher f52591n = new FastMatcher("CharMatcher.ANY") {
        /* renamed from: d */
        public int mo60571d(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.m72475h(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return true;
        }

        /* renamed from: g */
        public CharMatcher mo60573g(CharMatcher charMatcher) {
            Preconditions.m72472e(charMatcher);
            return this;
        }
    };

    /* renamed from: o */
    public static final CharMatcher f52592o = new FastMatcher("CharMatcher.NONE") {
        /* renamed from: d */
        public int mo60571d(CharSequence charSequence, int i) {
            Preconditions.m72475h(i, charSequence.length());
            return -1;
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return false;
        }

        /* renamed from: g */
        public CharMatcher mo60573g(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.m72472e(charMatcher);
        }
    };

    /* renamed from: p */
    static final int f52593p = Integer.numberOfLeadingZeros(31);

    /* renamed from: q */
    public static final CharMatcher f52594q = new FastMatcher("WHITESPACE") {
        /* renamed from: f */
        public boolean mo60572f(char c) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> CharMatcher.f52593p) == c;
        }
    };

    /* renamed from: a */
    final String f52595a;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.CharMatcher$10 */
    final class C1083910 extends FastMatcher {

        /* renamed from: r */
        final /* synthetic */ char f52596r;

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return c != this.f52596r;
        }

        /* renamed from: g */
        public CharMatcher mo60573g(CharMatcher charMatcher) {
            return charMatcher.mo60572f(this.f52596r) ? CharMatcher.f52591n : this;
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.CharMatcher$11 */
    final class C1084011 extends CharMatcher {

        /* renamed from: r */
        final /* synthetic */ char[] f52597r;

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return Arrays.binarySearch(this.f52597r, c) >= 0;
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.CharMatcher$12 */
    final class C1084112 extends FastMatcher {

        /* renamed from: r */
        final /* synthetic */ char f52598r;

        /* renamed from: s */
        final /* synthetic */ char f52599s;

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return c == this.f52598r || c == this.f52599s;
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.CharMatcher$14 */
    final class C1084314 extends CharMatcher {

        /* renamed from: r */
        final /* synthetic */ Predicate f52602r;

        /* renamed from: a */
        public boolean apply(Character ch) {
            return this.f52602r.apply(Preconditions.m72472e(ch));
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return this.f52602r.apply(Character.valueOf(c));
        }
    }

    private static class And extends CharMatcher {

        /* renamed from: r */
        final CharMatcher f52604r;

        /* renamed from: s */
        final CharMatcher f52605s;

        And(CharMatcher charMatcher, CharMatcher charMatcher2, String str) {
            super(str);
            this.f52604r = (CharMatcher) Preconditions.m72472e(charMatcher);
            this.f52605s = (CharMatcher) Preconditions.m72472e(charMatcher2);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return this.f52604r.mo60572f(c) && this.f52605s.mo60572f(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharMatcher mo60574i(String str) {
            return new And(this.f52604r, this.f52605s, str);
        }
    }

    @GwtIncompatible
    private static class BitSetMatcher extends FastMatcher {

        /* renamed from: r */
        private final BitSet f52606r;

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return this.f52606r.get(c);
        }
    }

    static abstract class FastMatcher extends CharMatcher {
        FastMatcher() {
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        FastMatcher(String str) {
            super(str);
        }
    }

    static final class NegatedFastMatcher extends NegatedMatcher {
        NegatedFastMatcher(String str, CharMatcher charMatcher) {
            super(str, charMatcher);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharMatcher mo60574i(String str) {
            return new NegatedFastMatcher(str, this.f52607r);
        }
    }

    private static class NegatedMatcher extends CharMatcher {

        /* renamed from: r */
        final CharMatcher f52607r;

        NegatedMatcher(String str, CharMatcher charMatcher) {
            super(str);
            this.f52607r = charMatcher;
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return !this.f52607r.mo60572f(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharMatcher mo60574i(String str) {
            return new NegatedMatcher(str, this.f52607r);
        }
    }

    private static class RangesMatcher extends CharMatcher {

        /* renamed from: r */
        private final char[] f52610r;

        /* renamed from: s */
        private final char[] f52611s;

        RangesMatcher(String str, char[] cArr, char[] cArr2) {
            super(str);
            this.f52610r = cArr;
            this.f52611s = cArr2;
            Preconditions.m72469b(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Preconditions.m72469b(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Preconditions.m72469b(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            int binarySearch = Arrays.binarySearch(this.f52610r, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            if (i < 0 || c > this.f52611s[i]) {
                return false;
            }
            return true;
        }
    }

    static {
        StringBuilder sb = new StringBuilder(31);
        for (int i = 0; i < 31; i++) {
            sb.append((char) ("0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".charAt(i) + 9));
        }
        String sb2 = sb.toString();
        f52581d = sb2;
        f52582e = new RangesMatcher("CharMatcher.DIGIT", "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray(), sb2.toCharArray());
    }

    CharMatcher(String str) {
        this.f52595a = str;
    }

    /* renamed from: b */
    public static CharMatcher m72391b(char c, char c2) {
        Preconditions.m72469b(c2 >= c);
        return m72392c(c, c2, "CharMatcher.inRange('" + m72394h(c) + "', '" + m72394h(c2) + "')");
    }

    /* renamed from: c */
    static CharMatcher m72392c(final char c, final char c2, String str) {
        return new FastMatcher(str) {
            /* renamed from: f */
            public boolean mo60572f(char c) {
                return c <= c && c <= c2;
            }
        };
    }

    /* renamed from: e */
    public static CharMatcher m72393e(final char c) {
        return new FastMatcher("CharMatcher.is('" + m72394h(c) + "')") {
            /* renamed from: f */
            public boolean mo60572f(char c) {
                return c == c;
            }

            /* renamed from: g */
            public CharMatcher mo60573g(CharMatcher charMatcher) {
                return charMatcher.mo60572f(c) ? charMatcher : CharMatcher.super.mo60573g(charMatcher);
            }
        };
    }

    /* renamed from: h */
    private static String m72394h(char c) {
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* renamed from: a */
    public boolean apply(Character ch) {
        return mo60572f(ch.charValue());
    }

    /* renamed from: d */
    public int mo60571d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Preconditions.m72475h(i, length);
        while (i < length) {
            if (mo60572f(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    public abstract boolean mo60572f(char c);

    /* renamed from: g */
    public CharMatcher mo60573g(CharMatcher charMatcher) {
        return new C10853Or(this, (CharMatcher) Preconditions.m72472e(charMatcher));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharMatcher mo60574i(String str) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return this.f52595a;
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.CharMatcher$Or */
    private static class C10853Or extends CharMatcher {

        /* renamed from: r */
        final CharMatcher f52608r;

        /* renamed from: s */
        final CharMatcher f52609s;

        C10853Or(CharMatcher charMatcher, CharMatcher charMatcher2, String str) {
            super(str);
            this.f52608r = (CharMatcher) Preconditions.m72472e(charMatcher);
            this.f52609s = (CharMatcher) Preconditions.m72472e(charMatcher2);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: f */
        public boolean mo60572f(char c) {
            return this.f52608r.mo60572f(c) || this.f52609s.mo60572f(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharMatcher mo60574i(String str) {
            return new C10853Or(this.f52608r, this.f52609s, str);
        }

        C10853Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this(charMatcher, charMatcher2, "CharMatcher.or(" + charMatcher + ", " + charMatcher2 + ")");
        }
    }

    protected CharMatcher() {
        this.f52595a = super.toString();
    }
}

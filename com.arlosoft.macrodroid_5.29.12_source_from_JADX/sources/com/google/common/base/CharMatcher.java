package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import java.util.BitSet;
import org.apache.commons.p353io.IOUtils;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements Predicate<Character> {

    /* renamed from: com.google.common.base.CharMatcher$1 */
    class C17461 extends NegatedFastMatcher {

        /* renamed from: c */
        final /* synthetic */ String f4103c;

        public String toString() {
            return this.f4103c;
        }
    }

    private static final class And extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f4104a;

        /* renamed from: c */
        final CharMatcher f4105c;

        And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f4104a = (CharMatcher) Preconditions.m5392s(charMatcher);
            this.f4105c = (CharMatcher) Preconditions.m5392s(charMatcher2);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return this.f4104a.mo22108o(c) && this.f4105c.mo22108o(c);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f4104a);
            String valueOf2 = String.valueOf(this.f4105c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19 + valueOf2.length());
            sb.append("CharMatcher.and(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class Any extends NamedFastMatcher {

        /* renamed from: c */
        static final Any f4106c = new Any();

        private Any() {
            super("CharMatcher.any()");
        }

        /* renamed from: b */
        public CharMatcher mo22103b(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.m5392s(charMatcher);
        }

        /* renamed from: g */
        public int mo22105g(CharSequence charSequence) {
            return charSequence.length();
        }

        /* renamed from: i */
        public int mo22106i(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        /* renamed from: j */
        public int mo22107j(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.m5395v(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return true;
        }

        /* renamed from: p */
        public boolean mo22109p(CharSequence charSequence) {
            Preconditions.m5392s(charSequence);
            return true;
        }

        /* renamed from: q */
        public boolean mo22110q(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        /* renamed from: r */
        public CharMatcher mo22111r() {
            return CharMatcher.m5180s();
        }

        /* renamed from: u */
        public CharMatcher mo22113u(CharMatcher charMatcher) {
            Preconditions.m5392s(charMatcher);
            return this;
        }
    }

    private static final class AnyOf extends CharMatcher {

        /* renamed from: a */
        private final char[] f4107a;

        public AnyOf(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f4107a = charArray;
            Arrays.sort(charArray);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return Arrays.binarySearch(this.f4107a, c) >= 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char a : this.f4107a) {
                sb.append(CharMatcher.m5182v(a));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class Ascii extends NamedFastMatcher {

        /* renamed from: c */
        static final Ascii f4108c = new Ascii();

        Ascii() {
            super("CharMatcher.ascii()");
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return c <= 127;
        }
    }

    @GwtIncompatible
    private static final class BitSetMatcher extends NamedFastMatcher {

        /* renamed from: c */
        private final BitSet f4109c;

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return this.f4109c.get(c);
        }
    }

    private static final class BreakingWhitespace extends CharMatcher {

        /* renamed from: a */
        static final CharMatcher f4110a = new BreakingWhitespace();

        private BreakingWhitespace() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
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
            return "CharMatcher.breakingWhitespace()";
        }
    }

    private static final class Digit extends RangesMatcher {

        /* renamed from: f */
        static final Digit f4111f = new Digit();

        private Digit() {
            super("CharMatcher.digit()", m5209y(), m5208x());
        }

        /* renamed from: x */
        private static char[] m5208x() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + 9);
            }
            return cArr;
        }

        /* renamed from: y */
        private static char[] m5209y() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }
    }

    static abstract class FastMatcher extends CharMatcher {
        FastMatcher() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: r */
        public CharMatcher mo22111r() {
            return new NegatedFastMatcher(this);
        }
    }

    private static final class ForPredicate extends CharMatcher {

        /* renamed from: a */
        private final Predicate<? super Character> f4112a;

        /* renamed from: e */
        public boolean apply(Character ch) {
            return this.f4112a.apply(Preconditions.m5392s(ch));
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return this.f4112a.apply(Character.valueOf(c));
        }

        public String toString() {
            String valueOf = String.valueOf(this.f4112a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("CharMatcher.forPredicate(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class InRange extends FastMatcher {

        /* renamed from: a */
        private final char f4113a;

        /* renamed from: c */
        private final char f4114c;

        InRange(char c, char c2) {
            Preconditions.m5377d(c2 >= c);
            this.f4113a = c;
            this.f4114c = c2;
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return this.f4113a <= c && c <= this.f4114c;
        }

        public String toString() {
            String a = CharMatcher.m5182v(this.f4113a);
            String a2 = CharMatcher.m5182v(this.f4114c);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 27 + String.valueOf(a2).length());
            sb.append("CharMatcher.inRange('");
            sb.append(a);
            sb.append("', '");
            sb.append(a2);
            sb.append("')");
            return sb.toString();
        }
    }

    private static final class Invisible extends RangesMatcher {

        /* renamed from: f */
        static final Invisible f4115f = new Invisible();

        private Invisible() {
            super("CharMatcher.invisible()", "\u0000­؀؜۝܏࢐࣢ ᠎   ⁦　?﻿￹".toCharArray(), "  ­؅؜۝܏࢑࣢ ᠎‏ ⁤⁯　﻿￻".toCharArray());
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$Is */
    private static final class C1747Is extends FastMatcher {

        /* renamed from: a */
        private final char f4116a;

        C1747Is(char c) {
            this.f4116a = c;
        }

        /* renamed from: b */
        public CharMatcher mo22103b(CharMatcher charMatcher) {
            return charMatcher.mo22108o(this.f4116a) ? this : CharMatcher.m5180s();
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return c == this.f4116a;
        }

        /* renamed from: r */
        public CharMatcher mo22111r() {
            return CharMatcher.m5178m(this.f4116a);
        }

        public String toString() {
            String a = CharMatcher.m5182v(this.f4116a);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(a);
            sb.append("')");
            return sb.toString();
        }

        /* renamed from: u */
        public CharMatcher mo22113u(CharMatcher charMatcher) {
            return charMatcher.mo22108o(this.f4116a) ? charMatcher : CharMatcher.super.mo22113u(charMatcher);
        }
    }

    private static final class IsEither extends FastMatcher {

        /* renamed from: a */
        private final char f4117a;

        /* renamed from: c */
        private final char f4118c;

        IsEither(char c, char c2) {
            this.f4117a = c;
            this.f4118c = c2;
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return c == this.f4117a || c == this.f4118c;
        }

        public String toString() {
            String a = CharMatcher.m5182v(this.f4117a);
            String a2 = CharMatcher.m5182v(this.f4118c);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 21 + String.valueOf(a2).length());
            sb.append("CharMatcher.anyOf(\"");
            sb.append(a);
            sb.append(a2);
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class IsNot extends FastMatcher {

        /* renamed from: a */
        private final char f4119a;

        IsNot(char c) {
            this.f4119a = c;
        }

        /* renamed from: b */
        public CharMatcher mo22103b(CharMatcher charMatcher) {
            return charMatcher.mo22108o(this.f4119a) ? CharMatcher.super.mo22103b(charMatcher) : charMatcher;
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return c != this.f4119a;
        }

        /* renamed from: r */
        public CharMatcher mo22111r() {
            return CharMatcher.m5176k(this.f4119a);
        }

        public String toString() {
            String a = CharMatcher.m5182v(this.f4119a);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 21);
            sb.append("CharMatcher.isNot('");
            sb.append(a);
            sb.append("')");
            return sb.toString();
        }

        /* renamed from: u */
        public CharMatcher mo22113u(CharMatcher charMatcher) {
            return charMatcher.mo22108o(this.f4119a) ? CharMatcher.m5172c() : this;
        }
    }

    private static final class JavaDigit extends CharMatcher {

        /* renamed from: a */
        static final JavaDigit f4120a = new JavaDigit();

        private JavaDigit() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return Character.isDigit(c);
        }

        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class JavaIsoControl extends NamedFastMatcher {

        /* renamed from: c */
        static final JavaIsoControl f4121c = new JavaIsoControl();

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }
    }

    private static final class JavaLetter extends CharMatcher {

        /* renamed from: a */
        static final JavaLetter f4122a = new JavaLetter();

        private JavaLetter() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return Character.isLetter(c);
        }

        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class JavaLetterOrDigit extends CharMatcher {

        /* renamed from: a */
        static final JavaLetterOrDigit f4123a = new JavaLetterOrDigit();

        private JavaLetterOrDigit() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return Character.isLetterOrDigit(c);
        }

        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class JavaLowerCase extends CharMatcher {

        /* renamed from: a */
        static final JavaLowerCase f4124a = new JavaLowerCase();

        private JavaLowerCase() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return Character.isLowerCase(c);
        }

        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class JavaUpperCase extends CharMatcher {

        /* renamed from: a */
        static final JavaUpperCase f4125a = new JavaUpperCase();

        private JavaUpperCase() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return Character.isUpperCase(c);
        }

        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class NamedFastMatcher extends FastMatcher {

        /* renamed from: a */
        private final String f4126a;

        NamedFastMatcher(String str) {
            this.f4126a = (String) Preconditions.m5392s(str);
        }

        public final String toString() {
            return this.f4126a;
        }
    }

    private static class Negated extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f4127a;

        Negated(CharMatcher charMatcher) {
            this.f4127a = (CharMatcher) Preconditions.m5392s(charMatcher);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: g */
        public int mo22105g(CharSequence charSequence) {
            return charSequence.length() - this.f4127a.mo22105g(charSequence);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return !this.f4127a.mo22108o(c);
        }

        /* renamed from: p */
        public boolean mo22109p(CharSequence charSequence) {
            return this.f4127a.mo22110q(charSequence);
        }

        /* renamed from: q */
        public boolean mo22110q(CharSequence charSequence) {
            return this.f4127a.mo22109p(charSequence);
        }

        /* renamed from: r */
        public CharMatcher mo22111r() {
            return this.f4127a;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f4127a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append(valueOf);
            sb.append(".negate()");
            return sb.toString();
        }
    }

    static class NegatedFastMatcher extends Negated {
        NegatedFastMatcher(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    private static final class None extends NamedFastMatcher {

        /* renamed from: c */
        static final None f4128c = new None();

        private None() {
            super("CharMatcher.none()");
        }

        /* renamed from: b */
        public CharMatcher mo22103b(CharMatcher charMatcher) {
            Preconditions.m5392s(charMatcher);
            return this;
        }

        /* renamed from: g */
        public int mo22105g(CharSequence charSequence) {
            Preconditions.m5392s(charSequence);
            return 0;
        }

        /* renamed from: i */
        public int mo22106i(CharSequence charSequence) {
            Preconditions.m5392s(charSequence);
            return -1;
        }

        /* renamed from: j */
        public int mo22107j(CharSequence charSequence, int i) {
            Preconditions.m5395v(i, charSequence.length());
            return -1;
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return false;
        }

        /* renamed from: p */
        public boolean mo22109p(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        /* renamed from: q */
        public boolean mo22110q(CharSequence charSequence) {
            Preconditions.m5392s(charSequence);
            return true;
        }

        /* renamed from: r */
        public CharMatcher mo22111r() {
            return CharMatcher.m5172c();
        }

        /* renamed from: u */
        public CharMatcher mo22113u(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.m5392s(charMatcher);
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$Or */
    private static final class C1748Or extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f4129a;

        /* renamed from: c */
        final CharMatcher f4130c;

        C1748Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f4129a = (CharMatcher) Preconditions.m5392s(charMatcher);
            this.f4130c = (CharMatcher) Preconditions.m5392s(charMatcher2);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return this.f4129a.mo22108o(c) || this.f4130c.mo22108o(c);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f4129a);
            String valueOf2 = String.valueOf(this.f4130c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
            sb.append("CharMatcher.or(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class RangesMatcher extends CharMatcher {

        /* renamed from: a */
        private final String f4131a;

        /* renamed from: c */
        private final char[] f4132c;

        /* renamed from: d */
        private final char[] f4133d;

        RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.f4131a = str;
            this.f4132c = cArr;
            this.f4133d = cArr2;
            Preconditions.m5377d(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Preconditions.m5377d(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Preconditions.m5377d(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            int binarySearch = Arrays.binarySearch(this.f4132c, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            if (i < 0 || c > this.f4133d[i]) {
                return false;
            }
            return true;
        }

        public String toString() {
            return this.f4131a;
        }
    }

    private static final class SingleWidth extends RangesMatcher {

        /* renamed from: f */
        static final SingleWidth f4134f = new SingleWidth();

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        }
    }

    @VisibleForTesting
    static final class Whitespace extends NamedFastMatcher {

        /* renamed from: c */
        static final int f4135c = Integer.numberOfLeadingZeros(31);

        /* renamed from: d */
        static final Whitespace f4136d = new Whitespace();

        Whitespace() {
            super("CharMatcher.whitespace()");
        }

        /* renamed from: o */
        public boolean mo22108o(char c) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c) >>> f4135c) == c;
        }
    }

    protected CharMatcher() {
    }

    /* renamed from: c */
    public static CharMatcher m5172c() {
        return Any.f4106c;
    }

    /* renamed from: d */
    public static CharMatcher m5173d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return m5180s();
        }
        if (length == 1) {
            return m5176k(charSequence.charAt(0));
        }
        if (length != 2) {
            return new AnyOf(charSequence);
        }
        return m5177l(charSequence.charAt(0), charSequence.charAt(1));
    }

    /* renamed from: f */
    public static CharMatcher m5174f() {
        return Ascii.f4108c;
    }

    /* renamed from: h */
    public static CharMatcher m5175h(char c, char c2) {
        return new InRange(c, c2);
    }

    /* renamed from: k */
    public static CharMatcher m5176k(char c) {
        return new C1747Is(c);
    }

    /* renamed from: l */
    private static IsEither m5177l(char c, char c2) {
        return new IsEither(c, c2);
    }

    /* renamed from: m */
    public static CharMatcher m5178m(char c) {
        return new IsNot(c);
    }

    /* renamed from: n */
    public static CharMatcher m5179n() {
        return JavaIsoControl.f4121c;
    }

    /* renamed from: s */
    public static CharMatcher m5180s() {
        return None.f4128c;
    }

    /* renamed from: t */
    public static CharMatcher m5181t(CharSequence charSequence) {
        return m5173d(charSequence).mo22111r();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static String m5182v(char c) {
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: w */
    public static CharMatcher m5183w() {
        return Whitespace.f4136d;
    }

    /* renamed from: b */
    public CharMatcher mo22103b(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    @Deprecated
    /* renamed from: e */
    public boolean apply(Character ch) {
        return mo22108o(ch.charValue());
    }

    /* renamed from: g */
    public int mo22105g(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (mo22108o(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public int mo22106i(CharSequence charSequence) {
        return mo22107j(charSequence, 0);
    }

    /* renamed from: j */
    public int mo22107j(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Preconditions.m5395v(i, length);
        while (i < length) {
            if (mo22108o(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: o */
    public abstract boolean mo22108o(char c);

    /* renamed from: p */
    public boolean mo22109p(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo22108o(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public boolean mo22110q(CharSequence charSequence) {
        return mo22106i(charSequence) == -1;
    }

    /* renamed from: r */
    public CharMatcher mo22111r() {
        return new Negated(this);
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public CharMatcher mo22113u(CharMatcher charMatcher) {
        return new C1748Or(this, charMatcher);
    }
}

package com.google.i18n.phonenumbers;

import androidx.webkit.ProxyConfig;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.Phonenumber;
import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

final class PhoneNumberMatcher implements Iterator<PhoneNumberMatch> {

    /* renamed from: A */
    private static final Pattern f56082A = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");

    /* renamed from: B */
    private static final Pattern f56083B = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");

    /* renamed from: C */
    private static final Pattern f56084C = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");

    /* renamed from: D */
    private static final Pattern f56085D = Pattern.compile(":[0-5]\\d");

    /* renamed from: E */
    private static final Pattern f56086E;

    /* renamed from: F */
    private static final Pattern[] f56087F = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};

    /* renamed from: G */
    private static final Pattern f56088G;

    /* renamed from: z */
    private static final Pattern f56089z;

    /* renamed from: a */
    private final PhoneNumberUtil f56090a;

    /* renamed from: c */
    private final CharSequence f56091c;

    /* renamed from: d */
    private final String f56092d;

    /* renamed from: f */
    private final PhoneNumberUtil.Leniency f56093f;

    /* renamed from: g */
    private long f56094g;

    /* renamed from: o */
    private State f56095o = State.NOT_READY;

    /* renamed from: p */
    private PhoneNumberMatch f56096p = null;

    /* renamed from: s */
    private int f56097s = 0;

    interface NumberGroupingChecker {
        /* renamed from: a */
        boolean mo64339a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr);
    }

    private enum State {
        NOT_READY,
        READY,
        DONE
    }

    static {
        String str = "[^" + "(\\[（［" + ")\\]）］" + "]";
        f56086E = Pattern.compile("(?:[" + "(\\[（［" + "])?(?:" + str + "+[" + ")\\]）］" + "])?" + str + "+(?:[" + "(\\[（［" + "]" + str + "+[" + ")\\]）］" + "])" + m78768n(0, 3) + str + ProxyConfig.MATCH_ALL_SCHEMES);
        String n = m78768n(0, 2);
        String n2 = m78768n(0, 4);
        String n3 = m78768n(0, 20);
        String str2 = "[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]" + n2;
        String str3 = "\\p{Nd}" + m78768n(1, 20);
        String str4 = "[" + ("(\\[（［" + "+＋") + "]";
        f56088G = Pattern.compile(str4);
        f56089z = Pattern.compile("(?:" + str4 + str2 + ")" + n + str3 + "(?:" + str2 + str3 + ")" + n3 + "(?:" + PhoneNumberUtil.f56130z + ")?", 66);
    }

    PhoneNumberMatcher(PhoneNumberUtil phoneNumberUtil, String str, String str2, PhoneNumberUtil.Leniency leniency, long j) {
        if (phoneNumberUtil == null || leniency == null) {
            throw null;
        } else if (j >= 0) {
            this.f56090a = phoneNumberUtil;
            this.f56091c = str == null ? "" : str;
            this.f56092d = str2;
            this.f56093f = leniency;
            this.f56094g = j;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    static boolean m78756a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        String[] split = PhoneNumberUtil.f56104C.split(sb.toString());
        int length = phoneNumber.mo64476p() ? split.length - 2 : split.length - 1;
        if (split.length == 1 || split[length].contains(phoneNumberUtil.mo64363u(phoneNumber))) {
            return true;
        }
        int length2 = strArr.length - 1;
        while (length2 > 0 && length >= 0) {
            if (!split[length].equals(strArr[length2])) {
                return false;
            }
            length2--;
            length--;
        }
        if (length < 0 || !split[length].endsWith(strArr[0])) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static boolean m78757b(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        int i;
        if (phoneNumber.mo64467g() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            String num = Integer.toString(phoneNumber.mo64466f());
            i = sb.indexOf(num) + num.length();
        } else {
            i = 0;
        }
        int i2 = 0;
        while (i2 < strArr.length) {
            int indexOf = sb.indexOf(strArr[i2], i);
            if (indexOf < 0) {
                return false;
            }
            i = indexOf + strArr[i2].length();
            if (i2 != 0 || i >= sb.length() || phoneNumberUtil.mo64364v(phoneNumberUtil.mo64365x(phoneNumber.mo64466f()), true) == null || !Character.isDigit(sb.charAt(i))) {
                i2++;
            } else {
                return sb.substring(i - strArr[i2].length()).startsWith(phoneNumberUtil.mo64363u(phoneNumber));
            }
        }
        return sb.substring(i).contains(phoneNumber.mo64468h());
    }

    /* renamed from: c */
    static boolean m78758c(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil, NumberGroupingChecker numberGroupingChecker) {
        StringBuilder T = PhoneNumberUtil.m78780T(str, true);
        if (numberGroupingChecker.mo64339a(phoneNumberUtil, phoneNumber, T, m78764j(phoneNumberUtil, phoneNumber, (Phonemetadata.NumberFormat) null))) {
            return true;
        }
        Phonemetadata.PhoneMetadata b = MetadataManager.m78739b(phoneNumber.mo64466f());
        if (b == null) {
            return false;
        }
        for (Phonemetadata.NumberFormat j : b.mo64383A()) {
            if (numberGroupingChecker.mo64339a(phoneNumberUtil, phoneNumber, T, m78764j(phoneNumberUtil, phoneNumber, j))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    static boolean m78759d(Phonenumber.PhoneNumber phoneNumber, String str) {
        int indexOf;
        int indexOf2 = str.indexOf(47);
        if (indexOf2 < 0 || (indexOf = str.indexOf(47, indexOf2 + 1)) < 0) {
            return false;
        }
        if (!(phoneNumber.mo64467g() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phoneNumber.mo64467g() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) || !PhoneNumberUtil.m78781U(str.substring(0, indexOf2)).equals(Integer.toString(phoneNumber.mo64466f()))) {
            return true;
        }
        return str.substring(indexOf + 1).contains("/");
    }

    /* renamed from: e */
    static boolean m78760e(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    if (phoneNumberUtil.mo64341D(phoneNumber, str.substring(i2)) != PhoneNumberUtil.MatchType.NSN_MATCH) {
                        return false;
                    }
                    i = i2;
                } else if (!PhoneNumberUtil.m78781U(str.substring(i)).equals(phoneNumber.mo64468h())) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    /* renamed from: g */
    private PhoneNumberMatch m78761g(String str, int i) {
        for (Pattern matcher : f56087F) {
            Matcher matcher2 = matcher.matcher(str);
            boolean z = true;
            while (matcher2.find() && this.f56094g > 0) {
                if (z) {
                    PhoneNumberMatch p = m78769p(m78770q(PhoneNumberUtil.f56126v, str.substring(0, matcher2.start())).toString(), i);
                    if (p != null) {
                        return p;
                    }
                    this.f56094g--;
                    z = false;
                }
                PhoneNumberMatch p2 = m78769p(m78770q(PhoneNumberUtil.f56126v, matcher2.group(1)).toString(), matcher2.start(1) + i);
                if (p2 != null) {
                    return p2;
                }
                this.f56094g--;
            }
        }
        return null;
    }

    /* renamed from: h */
    private PhoneNumberMatch m78762h(CharSequence charSequence, int i) {
        if (f56083B.matcher(charSequence).find()) {
            return null;
        }
        if (f56084C.matcher(charSequence).find()) {
            if (f56085D.matcher(this.f56091c.toString().substring(charSequence.length() + i)).lookingAt()) {
                return null;
            }
        }
        String charSequence2 = charSequence.toString();
        PhoneNumberMatch p = m78769p(charSequence2, i);
        if (p != null) {
            return p;
        }
        return m78761g(charSequence2, i);
    }

    /* renamed from: i */
    private PhoneNumberMatch m78763i(int i) {
        Matcher matcher = f56089z.matcher(this.f56091c);
        while (this.f56094g > 0 && matcher.find(i)) {
            int start = matcher.start();
            CharSequence q = m78770q(PhoneNumberUtil.f56125u, this.f56091c.subSequence(start, matcher.end()));
            PhoneNumberMatch h = m78762h(q, start);
            if (h != null) {
                return h;
            }
            i = start + q.length();
            this.f56094g--;
        }
        return null;
    }

    /* renamed from: j */
    private static String[] m78764j(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, Phonemetadata.NumberFormat numberFormat) {
        if (numberFormat != null) {
            return phoneNumberUtil.mo64360m(phoneNumberUtil.mo64363u(phoneNumber), numberFormat, PhoneNumberUtil.PhoneNumberFormat.RFC3966).split(HelpFormatter.DEFAULT_OPT_PREFIX);
        }
        String i = phoneNumberUtil.mo64358i(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.RFC3966);
        int indexOf = i.indexOf(59);
        if (indexOf < 0) {
            indexOf = i.length();
        }
        return i.substring(i.indexOf(45) + 1, indexOf).split(HelpFormatter.DEFAULT_OPT_PREFIX);
    }

    /* renamed from: k */
    private static boolean m78765k(char c) {
        return c == '%' || Character.getType(c) == 26;
    }

    /* renamed from: l */
    static boolean m78766l(char c) {
        if (!Character.isLetter(c) && Character.getType(c) != 6) {
            return false;
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    static boolean m78767m(Phonenumber.PhoneNumber phoneNumber, PhoneNumberUtil phoneNumberUtil) {
        Phonemetadata.PhoneMetadata s;
        Phonemetadata.NumberFormat c;
        if (phoneNumber.mo64467g() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY && (s = phoneNumberUtil.mo64362s(phoneNumberUtil.mo64365x(phoneNumber.mo64466f()))) != null && (c = phoneNumberUtil.mo64356c(s.mo64383A(), phoneNumberUtil.mo64363u(phoneNumber))) != null && c.mo64372d().length() > 0 && !c.mo64374f() && !PhoneNumberUtil.m78798o(c.mo64372d())) {
            return phoneNumberUtil.mo64351Q(new StringBuilder(PhoneNumberUtil.m78781U(phoneNumber.mo64473l())), s, (StringBuilder) null);
        }
        return true;
    }

    /* renamed from: n */
    private static String m78768n(int i, int i2) {
        if (i < 0 || i2 <= 0 || i2 < i) {
            throw new IllegalArgumentException();
        }
        return "{" + i + "," + i2 + "}";
    }

    /* renamed from: p */
    private PhoneNumberMatch m78769p(String str, int i) {
        try {
            if (f56086E.matcher(str).matches()) {
                if (!f56082A.matcher(str).find()) {
                    if (this.f56093f.compareTo(PhoneNumberUtil.Leniency.VALID) >= 0) {
                        if (i > 0 && !f56088G.matcher(str).lookingAt()) {
                            char charAt = this.f56091c.charAt(i - 1);
                            if (m78765k(charAt) || m78766l(charAt)) {
                                return null;
                            }
                        }
                        int length = str.length() + i;
                        if (length < this.f56091c.length()) {
                            char charAt2 = this.f56091c.charAt(length);
                            if (m78765k(charAt2) || m78766l(charAt2)) {
                                return null;
                            }
                        }
                    }
                    Phonenumber.PhoneNumber Y = this.f56090a.mo64354Y(str, this.f56092d);
                    if ((!this.f56090a.mo64365x(Y.mo64466f()).equals("IL") || this.f56090a.mo64363u(Y).length() != 4 || (i != 0 && (i <= 0 || this.f56091c.charAt(i - 1) == '*'))) && this.f56093f.mo64368b(Y, str, this.f56090a)) {
                        Y.mo64460a();
                        Y.mo64463d();
                        Y.mo64462c();
                        return new PhoneNumberMatch(i, str, Y);
                    }
                }
            }
        } catch (NumberParseException unused) {
        }
        return null;
    }

    /* renamed from: q */
    private static CharSequence m78770q(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    public boolean hasNext() {
        if (this.f56095o == State.NOT_READY) {
            PhoneNumberMatch i = m78763i(this.f56097s);
            this.f56096p = i;
            if (i == null) {
                this.f56095o = State.DONE;
            } else {
                this.f56097s = i.mo64330a();
                this.f56095o = State.READY;
            }
        }
        return this.f56095o == State.READY;
    }

    /* renamed from: o */
    public PhoneNumberMatch next() {
        if (hasNext()) {
            PhoneNumberMatch phoneNumberMatch = this.f56096p;
            this.f56096p = null;
            this.f56095o = State.NOT_READY;
            return phoneNumberMatch;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}

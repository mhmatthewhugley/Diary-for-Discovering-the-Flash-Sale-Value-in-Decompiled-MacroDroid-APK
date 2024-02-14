package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberMatcher;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.Phonenumber;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.p353io.FilenameUtils;

public class PhoneNumberUtil {

    /* renamed from: A */
    private static final Pattern f56102A;

    /* renamed from: B */
    private static final Pattern f56103B;

    /* renamed from: C */
    static final Pattern f56104C = Pattern.compile("(\\D+)");

    /* renamed from: D */
    private static final Pattern f56105D = Pattern.compile("(\\$\\d)");

    /* renamed from: E */
    private static final Pattern f56106E = Pattern.compile("\\$NP");

    /* renamed from: F */
    private static final Pattern f56107F = Pattern.compile("\\$FG");

    /* renamed from: G */
    private static final Pattern f56108G = Pattern.compile("\\$CC");

    /* renamed from: H */
    private static final Pattern f56109H = Pattern.compile("\\(?\\$1\\)?");

    /* renamed from: I */
    private static PhoneNumberUtil f56110I = null;

    /* renamed from: g */
    private static final Logger f56111g = Logger.getLogger(PhoneNumberUtil.class.getName());

    /* renamed from: h */
    private static final Map<Integer, String> f56112h;

    /* renamed from: i */
    private static final Set<Integer> f56113i;

    /* renamed from: j */
    private static final Set<Integer> f56114j;

    /* renamed from: k */
    private static final Map<Character, Character> f56115k;

    /* renamed from: l */
    private static final Map<Character, Character> f56116l;

    /* renamed from: m */
    private static final Map<Character, Character> f56117m;

    /* renamed from: n */
    private static final Map<Character, Character> f56118n;

    /* renamed from: o */
    private static final Pattern f56119o = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");

    /* renamed from: p */
    private static final String f56120p;

    /* renamed from: q */
    static final Pattern f56121q = Pattern.compile("[+＋]+");

    /* renamed from: r */
    private static final Pattern f56122r = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");

    /* renamed from: s */
    private static final Pattern f56123s = Pattern.compile("(\\p{Nd})");

    /* renamed from: t */
    private static final Pattern f56124t = Pattern.compile("[+＋\\p{Nd}]");

    /* renamed from: u */
    static final Pattern f56125u = Pattern.compile("[\\\\/] *x");

    /* renamed from: v */
    static final Pattern f56126v = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");

    /* renamed from: w */
    private static final Pattern f56127w = Pattern.compile("(?:.*?[A-Za-z]){3}.*");

    /* renamed from: x */
    private static final String f56128x;

    /* renamed from: y */
    private static final String f56129y;

    /* renamed from: z */
    static final String f56130z = m78788d("xｘ#＃~～");

    /* renamed from: a */
    private final MetadataSource f56131a;

    /* renamed from: b */
    private final Map<Integer, List<String>> f56132b;

    /* renamed from: c */
    private final Set<String> f56133c = new HashSet(35);

    /* renamed from: d */
    private final RegexCache f56134d = new RegexCache(100);

    /* renamed from: e */
    private final Set<String> f56135e = new HashSet(320);

    /* renamed from: f */
    private final Set<Integer> f56136f = new HashSet();

    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$1 */
    class C115291 implements Iterable<PhoneNumberMatch> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f56137a;

        /* renamed from: c */
        final /* synthetic */ String f56138c;

        /* renamed from: d */
        final /* synthetic */ Leniency f56139d;

        /* renamed from: f */
        final /* synthetic */ long f56140f;

        /* renamed from: g */
        final /* synthetic */ PhoneNumberUtil f56141g;

        public Iterator<PhoneNumberMatch> iterator() {
            return new PhoneNumberMatcher(this.f56141g, this.f56137a, this.f56138c, this.f56139d, this.f56140f);
        }
    }

    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$2 */
    static /* synthetic */ class C115302 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56142a;

        /* renamed from: b */
        static final /* synthetic */ int[] f56143b;

        /* renamed from: c */
        static final /* synthetic */ int[] f56144c;

        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d8 */
        static {
            /*
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType[] r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56144c = r0
                r1 = 1
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PREMIUM_RATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f56144c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r3 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.TOLL_FREE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f56144c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f56144c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f56144c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = f56144c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.SHARED_COST     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = f56144c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOIP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = f56144c     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PERSONAL_NUMBER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r4 = f56144c     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PAGER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r6 = 9
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r4 = f56144c     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UAN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6 = 10
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r4 = f56144c     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOICEMAIL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r6 = 11
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat[] r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f56143b = r4
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r4 = f56143b     // Catch:{ NoSuchFieldError -> 0x009f }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL     // Catch:{ NoSuchFieldError -> 0x009f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r4 = f56143b     // Catch:{ NoSuchFieldError -> 0x00a9 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r4 = f56143b     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource[] r4 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f56142a = r4
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r5 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN     // Catch:{ NoSuchFieldError -> 0x00c4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c4 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00c4 }
            L_0x00c4:
                int[] r1 = f56142a     // Catch:{ NoSuchFieldError -> 0x00ce }
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r4 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r0 = f56142a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r1 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f56142a     // Catch:{ NoSuchFieldError -> 0x00e2 }
                com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r1 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY     // Catch:{ NoSuchFieldError -> 0x00e2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e2 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00e2 }
            L_0x00e2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.C115302.<clinit>():void");
        }
    }

    public enum Leniency {
        POSSIBLE {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public boolean mo64368b(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
                return phoneNumberUtil.mo64344G(phoneNumber);
            }
        },
        VALID {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public boolean mo64368b(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
                if (!phoneNumberUtil.mo64346I(phoneNumber) || !PhoneNumberMatcher.m78760e(phoneNumber, str, phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.m78767m(phoneNumber, phoneNumberUtil);
            }
        },
        STRICT_GROUPING {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public boolean mo64368b(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
                if (!phoneNumberUtil.mo64346I(phoneNumber) || !PhoneNumberMatcher.m78760e(phoneNumber, str, phoneNumberUtil) || PhoneNumberMatcher.m78759d(phoneNumber, str) || !PhoneNumberMatcher.m78767m(phoneNumber, phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.m78758c(phoneNumber, str, phoneNumberUtil, new PhoneNumberMatcher.NumberGroupingChecker() {
                    /* renamed from: a */
                    public boolean mo64339a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
                        return PhoneNumberMatcher.m78757b(phoneNumberUtil, phoneNumber, sb, strArr);
                    }
                });
            }
        },
        EXACT_GROUPING {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public boolean mo64368b(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
                if (!phoneNumberUtil.mo64346I(phoneNumber) || !PhoneNumberMatcher.m78760e(phoneNumber, str, phoneNumberUtil) || PhoneNumberMatcher.m78759d(phoneNumber, str) || !PhoneNumberMatcher.m78767m(phoneNumber, phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.m78758c(phoneNumber, str, phoneNumberUtil, new PhoneNumberMatcher.NumberGroupingChecker() {
                    /* renamed from: a */
                    public boolean mo64339a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
                        return PhoneNumberMatcher.m78756a(phoneNumberUtil, phoneNumber, sb, strArr);
                    }
                });
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo64368b(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil);
    }

    public enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH
    }

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        TOO_LONG
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(52, "1");
        hashMap.put(54, "9");
        f56112h = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f56113i = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f56114j = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        f56116l = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f56117m = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f56115k = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character charValue : unmodifiableMap.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap6.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put(Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR), Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR));
        hashMap6.put(65294, Character.valueOf(FilenameUtils.EXTENSION_SEPARATOR));
        f56118n = Collections.unmodifiableMap(hashMap6);
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = f56116l;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        f56120p = sb2;
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*" + sb2 + "\\p{Nd}" + "]*";
        f56128x = str;
        String d = m78788d(",;" + "xｘ#＃~～");
        f56129y = d;
        f56102A = Pattern.compile("(?:" + d + ")$", 66);
        f56103B = Pattern.compile(str + "(?:" + d + ")?", 66);
    }

    PhoneNumberUtil(MetadataSource metadataSource, Map<Integer, List<String>> map) {
        this.f56131a = metadataSource;
        this.f56132b = map;
        for (Map.Entry next : map.entrySet()) {
            List list = (List) next.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.f56135e.addAll(list);
            } else {
                this.f56136f.add(next.getKey());
            }
        }
        if (this.f56135e.remove("001")) {
            f56111g.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f56133c.addAll(map.get(1));
    }

    /* renamed from: A */
    private boolean m78773A(int i) {
        return this.f56132b.containsKey(Integer.valueOf(i));
    }

    /* renamed from: B */
    private boolean m78774B(Phonenumber.PhoneNumber phoneNumber, Phonenumber.PhoneNumber phoneNumber2) {
        String valueOf = String.valueOf(phoneNumber.mo64470i());
        String valueOf2 = String.valueOf(phoneNumber2.mo64470i());
        return valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf);
    }

    /* renamed from: K */
    private boolean m78775K(String str) {
        return str != null && this.f56135e.contains(str);
    }

    /* renamed from: L */
    static boolean m78776L(String str) {
        if (str.length() < 2) {
            return false;
        }
        return f56103B.matcher(str).matches();
    }

    /* renamed from: M */
    private void m78777M(Phonenumber.PhoneNumber phoneNumber, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        if (phoneNumber.mo64476p() && phoneNumber.mo64468h().length() > 0) {
            if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                sb.append(";ext=");
                sb.append(phoneNumber.mo64468h());
            } else if (phoneMetadata.mo64434v()) {
                sb.append(phoneMetadata.mo64425l());
                sb.append(phoneNumber.mo64468h());
            } else {
                sb.append(" ext. ");
                sb.append(phoneNumber.mo64468h());
            }
        }
    }

    /* renamed from: R */
    static String m78778R(String str) {
        if (f56127w.matcher(str).matches()) {
            return m78782V(str, f56117m, true);
        }
        return m78781U(str);
    }

    /* renamed from: S */
    static void m78779S(StringBuilder sb) {
        sb.replace(0, sb.length(), m78778R(sb.toString()));
    }

    /* renamed from: T */
    static StringBuilder m78780T(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            int digit = Character.digit(c, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (z) {
                sb.append(c);
            }
        }
        return sb;
    }

    /* renamed from: U */
    public static String m78781U(String str) {
        return m78780T(str, false).toString();
    }

    /* renamed from: V */
    private static String m78782V(String str, Map<Character, Character> map, boolean z) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            Character ch = map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m78783a(String str, StringBuilder sb) {
        int indexOf = str.indexOf(";phone-context=");
        if (indexOf > 0) {
            int i = indexOf + 15;
            if (str.charAt(i) == '+') {
                int indexOf2 = str.indexOf(59, i);
                if (indexOf2 > 0) {
                    sb.append(str.substring(i, indexOf2));
                } else {
                    sb.append(str.substring(i));
                }
            }
            int indexOf3 = str.indexOf("tel:");
            sb.append(str.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
        } else {
            sb.append(m78794h(str));
        }
        int indexOf4 = sb.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb.delete(indexOf4, sb.length());
        }
    }

    /* renamed from: a0 */
    private void m78784a0(String str, String str2, boolean z, boolean z2, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        int i;
        if (str == null) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (str.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            m78783a(str, sb);
            if (!m78776L(sb.toString())) {
                throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            } else if (!z2 || m78785b(sb.toString(), str2)) {
                if (z) {
                    phoneNumber.mo64459F(str);
                }
                String O = mo64349O(sb);
                if (O.length() > 0) {
                    phoneNumber.mo64454A(O);
                }
                Phonemetadata.PhoneMetadata s = mo64362s(str2);
                StringBuilder sb2 = new StringBuilder();
                try {
                    i = mo64348N(sb.toString(), s, sb2, z, phoneNumber);
                } catch (NumberParseException e) {
                    Matcher matcher = f56121q.matcher(sb.toString());
                    NumberParseException.ErrorType a = e.mo64328a();
                    NumberParseException.ErrorType errorType = NumberParseException.ErrorType.INVALID_COUNTRY_CODE;
                    if (a != errorType || !matcher.lookingAt()) {
                        throw new NumberParseException(e.mo64328a(), e.getMessage());
                    }
                    i = mo64348N(sb.substring(matcher.end()), s, sb2, z, phoneNumber);
                    if (i == 0) {
                        throw new NumberParseException(errorType, "Could not interpret numbers after plus-sign.");
                    }
                }
                if (i != 0) {
                    String x = mo64365x(i);
                    if (!x.equals(str2)) {
                        s = m78801t(i, x);
                    }
                } else {
                    m78779S(sb);
                    sb2.append(sb);
                    if (str2 != null) {
                        phoneNumber.mo64485y(s.mo64407a());
                    } else if (z) {
                        phoneNumber.mo64460a();
                    }
                }
                if (sb2.length() >= 2) {
                    if (s != null) {
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder(sb2);
                        mo64351Q(sb4, s, sb3);
                        if (m78793f0(sb4.toString(), s.mo64411c()) != ValidationResult.TOO_SHORT) {
                            if (z && sb3.length() > 0) {
                                phoneNumber.mo64458E(sb3.toString());
                            }
                            sb2 = sb4;
                        }
                    }
                    int length = sb2.length();
                    if (length < 2) {
                        throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    } else if (length <= 17) {
                        m78791e0(sb2.toString(), phoneNumber);
                        phoneNumber.mo64456C(Long.parseLong(sb2.toString()));
                    } else {
                        throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
                    }
                } else {
                    throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
            } else {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
            }
        } else {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
    }

    /* renamed from: b */
    private boolean m78785b(String str, String str2) {
        if (!m78775K(str2)) {
            return (str == null || str.length() == 0 || !f56121q.matcher(str).lookingAt()) ? false : true;
        }
        return true;
    }

    /* renamed from: b0 */
    private boolean m78786b0(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = f56123s.matcher(sb.substring(end));
        if (matcher2.find() && m78781U(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, end);
        return true;
    }

    /* renamed from: c0 */
    private void m78787c0(int i, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        int i2 = C115302.f56143b[phoneNumberFormat.ordinal()];
        if (i2 == 1) {
            sb.insert(0, i).insert(0, '+');
        } else if (i2 == 2) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        } else if (i2 == 3) {
            sb.insert(0, HelpFormatter.DEFAULT_OPT_PREFIX).insert(0, i).insert(0, '+').insert(0, "tel:");
        }
    }

    /* renamed from: d */
    private static String m78788d(String str) {
        return ";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[" + str + "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*" + "(\\p{Nd}{1,7})" + "#?|[- ]+(" + "\\p{Nd}" + "{1,5})#";
    }

    /* renamed from: d0 */
    static synchronized void m78789d0(PhoneNumberUtil phoneNumberUtil) {
        synchronized (PhoneNumberUtil.class) {
            f56110I = phoneNumberUtil;
        }
    }

    /* renamed from: e */
    public static PhoneNumberUtil m78790e(MetadataLoader metadataLoader) {
        if (metadataLoader != null) {
            return m78792f(new MultiFileMetadataSourceImpl(metadataLoader));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    /* renamed from: e0 */
    static void m78791e0(String str, Phonenumber.PhoneNumber phoneNumber) {
        if (str.length() > 1 && str.charAt(0) == '0') {
            phoneNumber.mo64455B(true);
            int i = 1;
            while (i < str.length() - 1 && str.charAt(i) == '0') {
                i++;
            }
            if (i != 1) {
                phoneNumber.mo64457D(i);
            }
        }
    }

    /* renamed from: f */
    private static PhoneNumberUtil m78792f(MetadataSource metadataSource) {
        if (metadataSource != null) {
            return new PhoneNumberUtil(metadataSource, CountryCodeToRegionCodeMap.m78736a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    /* renamed from: f0 */
    private ValidationResult m78793f0(String str, Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        List<Integer> c = phoneNumberDesc.mo64446c();
        List<Integer> e = phoneNumberDesc.mo64448e();
        int length = str.length();
        if (e.contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE;
        }
        int intValue = c.get(0).intValue();
        if (intValue == length) {
            return ValidationResult.IS_POSSIBLE;
        }
        if (intValue > length) {
            return ValidationResult.TOO_SHORT;
        }
        if (c.get(c.size() - 1).intValue() < length) {
            return ValidationResult.TOO_LONG;
        }
        return c.subList(1, c.size()).contains(Integer.valueOf(length)) ? ValidationResult.IS_POSSIBLE : ValidationResult.TOO_LONG;
    }

    /* renamed from: h */
    static String m78794h(String str) {
        Matcher matcher = f56124t.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String substring = str.substring(matcher.start());
        Matcher matcher2 = f56126v.matcher(substring);
        if (matcher2.find()) {
            substring = substring.substring(0, matcher2.start());
            Logger logger = f56111g;
            Level level = Level.FINER;
            logger.log(level, "Stripped trailing characters: " + substring);
        }
        Matcher matcher3 = f56125u.matcher(substring);
        return matcher3.find() ? substring.substring(0, matcher3.start()) : substring;
    }

    /* renamed from: k */
    private String m78795k(String str, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat) {
        return m78796l(str, phoneMetadata, phoneNumberFormat, (String) null);
    }

    /* renamed from: l */
    private String m78796l(String str, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, String str2) {
        List<Phonemetadata.NumberFormat> list;
        if (phoneMetadata.mo64437x().size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) {
            list = phoneMetadata.mo64383A();
        } else {
            list = phoneMetadata.mo64437x();
        }
        Phonemetadata.NumberFormat c = mo64356c(list, str);
        return c == null ? str : m78797n(str, c, phoneNumberFormat, str2);
    }

    /* renamed from: n */
    private String m78797n(String str, Phonemetadata.NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat, String str2) {
        String str3;
        String b = numberFormat.mo64370b();
        Matcher matcher = this.f56134d.mo64487a(numberFormat.mo64373e()).matcher(str);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.NATIONAL;
        if (phoneNumberFormat != phoneNumberFormat2 || str2 == null || str2.length() <= 0 || numberFormat.mo64369a().length() <= 0) {
            String d = numberFormat.mo64372d();
            if (phoneNumberFormat != phoneNumberFormat2 || d == null || d.length() <= 0) {
                str3 = matcher.replaceAll(b);
            } else {
                str3 = matcher.replaceAll(f56105D.matcher(b).replaceFirst(d));
            }
        } else {
            str3 = matcher.replaceAll(f56105D.matcher(b).replaceFirst(f56108G.matcher(numberFormat.mo64369a()).replaceFirst(str2)));
        }
        if (phoneNumberFormat != PhoneNumberFormat.RFC3966) {
            return str3;
        }
        Matcher matcher2 = f56122r.matcher(str3);
        if (matcher2.lookingAt()) {
            str3 = matcher2.replaceFirst("");
        }
        return matcher2.reset(str3).replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX);
    }

    /* renamed from: o */
    static boolean m78798o(String str) {
        return str.length() == 0 || f56109H.matcher(str).matches();
    }

    /* renamed from: p */
    private int m78799p(String str) {
        Phonemetadata.PhoneMetadata s = mo64362s(str);
        if (s != null) {
            return s.mo64407a();
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    /* renamed from: q */
    public static synchronized PhoneNumberUtil m78800q() {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            if (f56110I == null) {
                m78789d0(m78790e(MetadataManager.f56061a));
            }
            phoneNumberUtil = f56110I;
        }
        return phoneNumberUtil;
    }

    /* renamed from: t */
    private Phonemetadata.PhoneMetadata m78801t(int i, String str) {
        if ("001".equals(str)) {
            return mo64361r(i);
        }
        return mo64362s(str);
    }

    /* renamed from: w */
    private PhoneNumberType m78802w(String str, Phonemetadata.PhoneMetadata phoneMetadata) {
        if (!mo64343F(str, phoneMetadata.mo64411c())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (mo64343F(str, phoneMetadata.mo64426m())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (mo64343F(str, phoneMetadata.mo64428p())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (mo64343F(str, phoneMetadata.mo64427n())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (mo64343F(str, phoneMetadata.mo64432t())) {
            return PhoneNumberType.VOIP;
        }
        if (mo64343F(str, phoneMetadata.mo64424k())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (mo64343F(str, phoneMetadata.mo64423j())) {
            return PhoneNumberType.PAGER;
        }
        if (mo64343F(str, phoneMetadata.mo64429q())) {
            return PhoneNumberType.UAN;
        }
        if (mo64343F(str, phoneMetadata.mo64430r())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (mo64343F(str, phoneMetadata.mo64409b())) {
            if (phoneMetadata.mo64438y()) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (mo64343F(str, phoneMetadata.mo64417f())) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return PhoneNumberType.FIXED_LINE;
        } else if (phoneMetadata.mo64438y() || !mo64343F(str, phoneMetadata.mo64417f())) {
            return PhoneNumberType.UNKNOWN;
        } else {
            return PhoneNumberType.MOBILE;
        }
    }

    /* renamed from: z */
    private String m78803z(Phonenumber.PhoneNumber phoneNumber, List<String> list) {
        String u = mo64363u(phoneNumber);
        for (String next : list) {
            Phonemetadata.PhoneMetadata s = mo64362s(next);
            if (s.mo64433u()) {
                if (this.f56134d.mo64487a(s.mo64415e()).matcher(u).lookingAt()) {
                    return next;
                }
            } else if (m78802w(u, s) != PhoneNumberType.UNKNOWN) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: C */
    public MatchType mo64340C(Phonenumber.PhoneNumber phoneNumber, Phonenumber.PhoneNumber phoneNumber2) {
        Phonenumber.PhoneNumber phoneNumber3 = new Phonenumber.PhoneNumber();
        phoneNumber3.mo64484x(phoneNumber);
        Phonenumber.PhoneNumber phoneNumber4 = new Phonenumber.PhoneNumber();
        phoneNumber4.mo64484x(phoneNumber2);
        phoneNumber3.mo64463d();
        phoneNumber3.mo64460a();
        phoneNumber3.mo64462c();
        phoneNumber4.mo64463d();
        phoneNumber4.mo64460a();
        phoneNumber4.mo64462c();
        if (phoneNumber3.mo64476p() && phoneNumber3.mo64468h().length() == 0) {
            phoneNumber3.mo64461b();
        }
        if (phoneNumber4.mo64476p() && phoneNumber4.mo64468h().length() == 0) {
            phoneNumber4.mo64461b();
        }
        if (phoneNumber3.mo64476p() && phoneNumber4.mo64476p() && !phoneNumber3.mo64468h().equals(phoneNumber4.mo64468h())) {
            return MatchType.NO_MATCH;
        }
        int f = phoneNumber3.mo64466f();
        int f2 = phoneNumber4.mo64466f();
        if (f == 0 || f2 == 0) {
            phoneNumber3.mo64485y(f2);
            if (phoneNumber3.mo64464e(phoneNumber4)) {
                return MatchType.NSN_MATCH;
            }
            if (m78774B(phoneNumber3, phoneNumber4)) {
                return MatchType.SHORT_NSN_MATCH;
            }
            return MatchType.NO_MATCH;
        } else if (phoneNumber3.mo64464e(phoneNumber4)) {
            return MatchType.EXACT_MATCH;
        } else {
            if (f != f2 || !m78774B(phoneNumber3, phoneNumber4)) {
                return MatchType.NO_MATCH;
            }
            return MatchType.SHORT_NSN_MATCH;
        }
    }

    /* renamed from: D */
    public MatchType mo64341D(Phonenumber.PhoneNumber phoneNumber, String str) {
        try {
            return mo64340C(phoneNumber, mo64352W(str, "ZZ"));
        } catch (NumberParseException e) {
            if (e.mo64328a() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                String x = mo64365x(phoneNumber.mo64466f());
                try {
                    if (!x.equals("ZZ")) {
                        MatchType C = mo64340C(phoneNumber, mo64352W(str, x));
                        return C == MatchType.EXACT_MATCH ? MatchType.NSN_MATCH : C;
                    }
                    Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
                    m78784a0(str, (String) null, false, false, phoneNumber2);
                    return mo64340C(phoneNumber, phoneNumber2);
                } catch (NumberParseException unused) {
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    /* renamed from: E */
    public MatchType mo64342E(String str, String str2) {
        try {
            return mo64341D(mo64352W(str, "ZZ"), str2);
        } catch (NumberParseException e) {
            if (e.mo64328a() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                try {
                    return mo64341D(mo64352W(str2, "ZZ"), str);
                } catch (NumberParseException e2) {
                    if (e2.mo64328a() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                        try {
                            Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
                            Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
                            m78784a0(str, (String) null, false, false, phoneNumber);
                            m78784a0(str2, (String) null, false, false, phoneNumber2);
                            return mo64340C(phoneNumber, phoneNumber2);
                        } catch (NumberParseException unused) {
                            return MatchType.NOT_A_NUMBER;
                        }
                    }
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo64343F(String str, Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        int length = str.length();
        List<Integer> c = phoneNumberDesc.mo64446c();
        if (c.size() <= 0 || c.contains(Integer.valueOf(length))) {
            return this.f56134d.mo64487a(phoneNumberDesc.mo64444a()).matcher(str).matches();
        }
        return false;
    }

    /* renamed from: G */
    public boolean mo64344G(Phonenumber.PhoneNumber phoneNumber) {
        return mo64345H(phoneNumber) == ValidationResult.IS_POSSIBLE;
    }

    /* renamed from: H */
    public ValidationResult mo64345H(Phonenumber.PhoneNumber phoneNumber) {
        String u = mo64363u(phoneNumber);
        int f = phoneNumber.mo64466f();
        if (!m78773A(f)) {
            return ValidationResult.INVALID_COUNTRY_CODE;
        }
        return m78793f0(u, m78801t(f, mo64365x(f)).mo64411c());
    }

    /* renamed from: I */
    public boolean mo64346I(Phonenumber.PhoneNumber phoneNumber) {
        return mo64347J(phoneNumber, mo64366y(phoneNumber));
    }

    /* renamed from: J */
    public boolean mo64347J(Phonenumber.PhoneNumber phoneNumber, String str) {
        int f = phoneNumber.mo64466f();
        Phonemetadata.PhoneMetadata t = m78801t(f, str);
        if (t == null) {
            return false;
        }
        if (("001".equals(str) || f == m78799p(str)) && m78802w(mo64363u(phoneNumber), t) != PhoneNumberType.UNKNOWN) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public int mo64348N(String str, Phonemetadata.PhoneMetadata phoneMetadata, StringBuilder sb, boolean z, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        if (str.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(str);
        Phonenumber.PhoneNumber.CountryCodeSource P = mo64350P(sb2, phoneMetadata != null ? phoneMetadata.mo64413d() : "NonMatch");
        if (z) {
            phoneNumber.mo64486z(P);
        }
        if (P == Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (phoneMetadata != null) {
                int a = phoneMetadata.mo64407a();
                String valueOf = String.valueOf(a);
                String sb3 = sb2.toString();
                if (sb3.startsWith(valueOf)) {
                    StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                    Phonemetadata.PhoneNumberDesc c = phoneMetadata.mo64411c();
                    Pattern a2 = this.f56134d.mo64487a(c.mo64444a());
                    mo64351Q(sb4, phoneMetadata, (StringBuilder) null);
                    if ((!a2.matcher(sb2).matches() && a2.matcher(sb4).matches()) || m78793f0(sb2.toString(), c) == ValidationResult.TOO_LONG) {
                        sb.append(sb4);
                        if (z) {
                            phoneNumber.mo64486z(Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        phoneNumber.mo64485y(a);
                        return a;
                    }
                }
            }
            phoneNumber.mo64485y(0);
            return 0;
        } else if (sb2.length() > 2) {
            int g = mo64357g(sb2, sb);
            if (g != 0) {
                phoneNumber.mo64485y(g);
                return g;
            }
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        } else {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public String mo64349O(StringBuilder sb) {
        Matcher matcher = f56102A.matcher(sb);
        if (!matcher.find() || !m78776L(sb.substring(0, matcher.start()))) {
            return "";
        }
        int groupCount = matcher.groupCount();
        for (int i = 1; i <= groupCount; i++) {
            if (matcher.group(i) != null) {
                String group = matcher.group(i);
                sb.delete(matcher.start(), sb.length());
                return group;
            }
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public Phonenumber.PhoneNumber.CountryCodeSource mo64350P(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f56121q.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            m78779S(sb);
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern a = this.f56134d.mo64487a(str);
        m78779S(sb);
        return m78786b0(a, sb) ? Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD : Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo64351Q(StringBuilder sb, Phonemetadata.PhoneMetadata phoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String h = phoneMetadata.mo64421h();
        if (!(length == 0 || h.length() == 0)) {
            Matcher matcher = this.f56134d.mo64487a(h).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern a = this.f56134d.mo64487a(phoneMetadata.mo64411c().mo64444a());
                boolean matches = a.matcher(sb).matches();
                int groupCount = matcher.groupCount();
                String i = phoneMetadata.mo64422i();
                if (i != null && i.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(i));
                    if (matches && !a.matcher(sb3.toString()).matches()) {
                        return false;
                    }
                    if (sb2 != null && groupCount > 1) {
                        sb2.append(matcher.group(1));
                    }
                    sb.replace(0, sb.length(), sb3.toString());
                    return true;
                } else if (matches && !a.matcher(sb.substring(matcher.end())).matches()) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: W */
    public Phonenumber.PhoneNumber mo64352W(String str, String str2) throws NumberParseException {
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
        mo64353X(str, str2, phoneNumber);
        return phoneNumber;
    }

    /* renamed from: X */
    public void mo64353X(String str, String str2, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        m78784a0(str, str2, false, true, phoneNumber);
    }

    /* renamed from: Y */
    public Phonenumber.PhoneNumber mo64354Y(String str, String str2) throws NumberParseException {
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
        mo64355Z(str, str2, phoneNumber);
        return phoneNumber;
    }

    /* renamed from: Z */
    public void mo64355Z(String str, String str2, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        m78784a0(str, str2, true, true, phoneNumber);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Phonemetadata.NumberFormat mo64356c(List<Phonemetadata.NumberFormat> list, String str) {
        for (Phonemetadata.NumberFormat next : list) {
            int g = next.mo64375g();
            if ((g == 0 || this.f56134d.mo64487a(next.mo64371c(g - 1)).matcher(str).lookingAt()) && this.f56134d.mo64487a(next.mo64373e()).matcher(str).matches()) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo64357g(StringBuilder sb, StringBuilder sb2) {
        if (!(sb.length() == 0 || sb.charAt(0) == '0')) {
            int length = sb.length();
            int i = 1;
            while (i <= 3 && i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (this.f56132b.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
                i++;
            }
        }
        return 0;
    }

    /* renamed from: i */
    public String mo64358i(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phoneNumber.mo64470i() == 0 && phoneNumber.mo64482v()) {
            String l = phoneNumber.mo64473l();
            if (l.length() > 0) {
                return l;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        mo64359j(phoneNumber, phoneNumberFormat, sb);
        return sb.toString();
    }

    /* renamed from: j */
    public void mo64359j(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        sb.setLength(0);
        int f = phoneNumber.mo64466f();
        String u = mo64363u(phoneNumber);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.E164;
        if (phoneNumberFormat == phoneNumberFormat2) {
            sb.append(u);
            m78787c0(f, phoneNumberFormat2, sb);
        } else if (!m78773A(f)) {
            sb.append(u);
        } else {
            Phonemetadata.PhoneMetadata t = m78801t(f, mo64365x(f));
            sb.append(m78795k(u, t, phoneNumberFormat));
            m78777M(phoneNumber, t, phoneNumberFormat, sb);
            m78787c0(f, phoneNumberFormat, sb);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo64360m(String str, Phonemetadata.NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat) {
        return m78797n(str, numberFormat, phoneNumberFormat, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Phonemetadata.PhoneMetadata mo64361r(int i) {
        if (!this.f56132b.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return this.f56131a.mo64327b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Phonemetadata.PhoneMetadata mo64362s(String str) {
        if (!m78775K(str)) {
            return null;
        }
        return this.f56131a.mo64326a(str);
    }

    /* renamed from: u */
    public String mo64363u(Phonenumber.PhoneNumber phoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phoneNumber.mo64483w()) {
            char[] cArr = new char[phoneNumber.mo64471j()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phoneNumber.mo64470i());
        return sb.toString();
    }

    /* renamed from: v */
    public String mo64364v(String str, boolean z) {
        Phonemetadata.PhoneMetadata s = mo64362s(str);
        if (s == null) {
            Logger logger = f56111g;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(") provided.");
            logger.log(level, sb.toString());
            return null;
        }
        String g = s.mo64419g();
        if (g.length() == 0) {
            return null;
        }
        return z ? g.replace("~", "") : g;
    }

    /* renamed from: x */
    public String mo64365x(int i) {
        List list = this.f56132b.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    /* renamed from: y */
    public String mo64366y(Phonenumber.PhoneNumber phoneNumber) {
        int f = phoneNumber.mo64466f();
        List list = this.f56132b.get(Integer.valueOf(f));
        if (list == null) {
            String u = mo64363u(phoneNumber);
            Logger logger = f56111g;
            Level level = Level.INFO;
            logger.log(level, "Missing/invalid country_code (" + f + ") for number " + u);
            return null;
        } else if (list.size() == 1) {
            return (String) list.get(0);
        } else {
            return m78803z(phoneNumber, list);
        }
    }
}

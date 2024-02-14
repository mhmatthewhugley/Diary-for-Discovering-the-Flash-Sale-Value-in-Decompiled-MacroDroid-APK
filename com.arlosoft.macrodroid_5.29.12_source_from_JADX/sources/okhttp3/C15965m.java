package okhttp3;

import androidx.core.location.LocationRequestCompat;
import androidx.paging.C0956a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15159j;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.cookie.C16050SM;
import p014b3.C1405a;
import p372qc.C16278a;
import p372qc.C16279b;
import p408uc.C16686c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u0000 &2\u00020\u0001:\u0001\fBQ\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001d\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010!\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010#\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006'"}, mo71668d2 = {"Lokhttp3/m;", "", "other", "", "equals", "", "hashCode", "", "toString", "forObsoleteRfc2965", "f", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "name", "b", "g", "value", "", "c", "J", "expiresAt", "()J", "d", "domain", "path", "Z", "secure", "()Z", "httpOnly", "h", "persistent", "i", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "n", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.m */
/* compiled from: Cookie.kt */
public final class C15965m {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Pattern f65751j = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Pattern f65752k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Pattern f65753l = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Pattern f65754m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final C15966a f65755n = new C15966a((C13695i) null);

    /* renamed from: a */
    private final String f65756a;

    /* renamed from: b */
    private final String f65757b;

    /* renamed from: c */
    private final long f65758c;

    /* renamed from: d */
    private final String f65759d;

    /* renamed from: e */
    private final String f65760e;

    /* renamed from: f */
    private final boolean f65761f;

    /* renamed from: g */
    private final boolean f65762g;

    /* renamed from: h */
    private final boolean f65763h;

    /* renamed from: i */
    private final boolean f65764i;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006'"}, mo71668d2 = {"Lokhttp3/m$a;", "", "", "urlHost", "domain", "", "b", "s", "", "pos", "limit", "", "g", "input", "invert", "a", "h", "f", "Lokhttp3/v;", "url", "setCookie", "Lokhttp3/m;", "c", "currentTimeMillis", "d", "(JLokhttp3/v;Ljava/lang/String;)Lokhttp3/m;", "Lokhttp3/u;", "headers", "", "e", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.m$a */
    /* compiled from: Cookie.kt */
    public static final class C15966a {
        private C15966a() {
        }

        public /* synthetic */ C15966a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        private final int m96232a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* renamed from: b */
        private final boolean m96233b(String str, String str2) {
            if (C13706o.m87924a(str, str2)) {
                return true;
            }
            if (!C15176v.m93640u(str, str2, false, 2, (Object) null) || str.charAt((str.length() - str2.length()) - 1) != '.' || C16279b.m97652f(str)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private final String m96234f(String str) {
            if (!C15176v.m93640u(str, ".", false, 2, (Object) null)) {
                String e = C16278a.m97624e(C15177w.m93698q0(str, "."));
                if (e != null) {
                    return e;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: g */
        private final long m96235g(String str, int i, int i2) {
            String str2 = str;
            int i3 = i2;
            int a = m96232a(str2, i, i3, false);
            Matcher matcher = C15965m.f65754m.matcher(str2);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            while (a < i3) {
                int a2 = m96232a(str2, a + 1, i3, true);
                matcher.region(a, a2);
                if (i5 == -1 && matcher.usePattern(C15965m.f65754m).matches()) {
                    String group = matcher.group(1);
                    C13706o.m87928e(group, "matcher.group(1)");
                    i5 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C13706o.m87928e(group2, "matcher.group(2)");
                    i8 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C13706o.m87928e(group3, "matcher.group(3)");
                    i9 = Integer.parseInt(group3);
                } else if (i6 == -1 && matcher.usePattern(C15965m.f65753l).matches()) {
                    String group4 = matcher.group(1);
                    C13706o.m87928e(group4, "matcher.group(1)");
                    i6 = Integer.parseInt(group4);
                } else if (i7 == -1 && matcher.usePattern(C15965m.f65752k).matches()) {
                    String group5 = matcher.group(1);
                    C13706o.m87928e(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C13706o.m87928e(locale, "Locale.US");
                    Objects.requireNonNull(group5, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = group5.toLowerCase(locale);
                    C13706o.m87928e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String pattern = C15965m.f65752k.pattern();
                    C13706o.m87928e(pattern, "MONTH_PATTERN.pattern()");
                    i7 = C15177w.m93682a0(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i4 == -1 && matcher.usePattern(C15965m.f65751j).matches()) {
                    String group6 = matcher.group(1);
                    C13706o.m87928e(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
                a = m96232a(str2, a2 + 1, i3, false);
            }
            if (70 <= i4 && 99 >= i4) {
                i4 += 1900;
            }
            if (i4 >= 0 && 69 >= i4) {
                i4 += 2000;
            }
            if (i4 >= 1601) {
                if (i7 != -1) {
                    if (1 <= i6 && 31 >= i6) {
                        if (i5 >= 0 && 23 >= i5) {
                            if (i8 >= 0 && 59 >= i8) {
                                if (i9 >= 0 && 59 >= i9) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C16279b.f66627f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i4);
                                    gregorianCalendar.set(2, i7 - 1);
                                    gregorianCalendar.set(5, i6);
                                    gregorianCalendar.set(11, i5);
                                    gregorianCalendar.set(12, i8);
                                    gregorianCalendar.set(13, i9);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: h */
        private final long m96236h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (!new C15159j("-?\\d+").mo74468c(str)) {
                    throw e;
                } else if (C15176v.m93634I(str, HelpFormatter.DEFAULT_OPT_PREFIX, false, 2, (Object) null)) {
                    return Long.MIN_VALUE;
                } else {
                    return LocationRequestCompat.PASSIVE_INTERVAL;
                }
            }
        }

        /* renamed from: c */
        public final C15965m mo76186c(C15989v vVar, String str) {
            C13706o.m87929f(vVar, "url");
            C13706o.m87929f(str, "setCookie");
            return mo76187d(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0103, code lost:
            if (r1 > 253402300799999L) goto L_0x010b;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0138 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0139  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.C15965m mo76187d(long r26, okhttp3.C15989v r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                kotlin.jvm.internal.C13706o.m87929f(r8, r1)
                java.lang.String r1 = "setCookie"
                kotlin.jvm.internal.C13706o.m87929f(r7, r1)
                r2 = 59
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r29
                int r9 = p372qc.C16279b.m97661o(r1, r2, r3, r4, r5, r6)
                r2 = 61
                r5 = 2
                r4 = r9
                int r1 = p372qc.C16279b.m97661o(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = p372qc.C16279b.m97644T(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0036
                r5 = 1
                goto L_0x0037
            L_0x0036:
                r5 = 0
            L_0x0037:
                if (r5 != 0) goto L_0x0174
                int r5 = p372qc.C16279b.m97668v(r11)
                r6 = -1
                if (r5 == r6) goto L_0x0042
                goto L_0x0174
            L_0x0042:
                int r1 = r1 + r4
                java.lang.String r12 = p372qc.C16279b.m97643S(r7, r1, r9)
                int r1 = p372qc.C16279b.m97668v(r12)
                if (r1 == r6) goto L_0x004e
                return r2
            L_0x004e:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r15 = r5
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 1
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0066:
                if (r9 >= r1) goto L_0x00d6
                r2 = 59
                int r2 = p372qc.C16279b.m97659m(r7, r2, r9, r1)
                r13 = 61
                int r13 = p372qc.C16279b.m97659m(r7, r13, r9, r2)
                java.lang.String r9 = p372qc.C16279b.m97643S(r7, r9, r13)
                if (r13 >= r2) goto L_0x0081
                int r13 = r13 + 1
                java.lang.String r13 = p372qc.C16279b.m97643S(r7, r13, r2)
                goto L_0x0083
            L_0x0081:
                java.lang.String r13 = ""
            L_0x0083:
                java.lang.String r14 = "expires"
                boolean r14 = kotlin.text.C15176v.m93641v(r9, r14, r4)
                if (r14 == 0) goto L_0x0094
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00d2 }
                long r23 = r0.m96235g(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                goto L_0x00a0
            L_0x0094:
                java.lang.String r14 = "max-age"
                boolean r14 = kotlin.text.C15176v.m93641v(r9, r14, r4)
                if (r14 == 0) goto L_0x00a3
                long r15 = r0.m96236h(r13)     // Catch:{  }
            L_0x00a0:
                r19 = 1
                goto L_0x00d2
            L_0x00a3:
                java.lang.String r14 = "domain"
                boolean r14 = kotlin.text.C15176v.m93641v(r9, r14, r4)
                if (r14 == 0) goto L_0x00b2
                java.lang.String r10 = r0.m96234f(r13)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                r20 = 0
                goto L_0x00d2
            L_0x00b2:
                java.lang.String r14 = "path"
                boolean r14 = kotlin.text.C15176v.m93641v(r9, r14, r4)
                if (r14 == 0) goto L_0x00bd
                r22 = r13
                goto L_0x00d2
            L_0x00bd:
                java.lang.String r13 = "secure"
                boolean r13 = kotlin.text.C15176v.m93641v(r9, r13, r4)
                if (r13 == 0) goto L_0x00c8
                r17 = 1
                goto L_0x00d2
            L_0x00c8:
                java.lang.String r13 = "httponly"
                boolean r9 = kotlin.text.C15176v.m93641v(r9, r13, r4)
                if (r9 == 0) goto L_0x00d2
                r18 = 1
            L_0x00d2:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0066
            L_0x00d6:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00de
            L_0x00dc:
                r13 = r1
                goto L_0x010f
            L_0x00de:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x010d
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 > 0) goto L_0x00f1
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f6
            L_0x00f1:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f6:
                long r1 = r26 + r15
                int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r4 < 0) goto L_0x0106
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00dc
                goto L_0x010b
            L_0x0106:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x010b:
                r13 = r4
                goto L_0x010f
            L_0x010d:
                r13 = r23
            L_0x010f:
                java.lang.String r1 = r28.mo76269i()
                if (r10 != 0) goto L_0x0118
                r15 = r1
                r2 = 0
                goto L_0x0122
            L_0x0118:
                boolean r2 = r0.m96233b(r1, r10)
                if (r2 != 0) goto L_0x0120
                r2 = 0
                return r2
            L_0x0120:
                r2 = 0
                r15 = r10
            L_0x0122:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0139
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f65730h
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.mo76163c()
                java.lang.String r1 = r1.mo76162c(r15)
                if (r1 != 0) goto L_0x0139
                return r2
            L_0x0139:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x014a
                r5 = 2
                boolean r2 = kotlin.text.C15176v.m93634I(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0147
                goto L_0x014a
            L_0x0147:
                r16 = r4
                goto L_0x016b
            L_0x014a:
                java.lang.String r2 = r28.mo76263d()
                r6 = 47
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r2
                int r4 = kotlin.text.C15177w.m93686e0(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x0169
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r2, r1)
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            L_0x0169:
                r16 = r1
            L_0x016b:
                okhttp3.m r1 = new okhttp3.m
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            L_0x0174:
                r1 = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C15965m.C15966a.mo76187d(long, okhttp3.v, java.lang.String):okhttp3.m");
        }

        /* renamed from: e */
        public final List<C15965m> mo76188e(C15989v vVar, C15986u uVar) {
            C13706o.m87929f(vVar, "url");
            C13706o.m87929f(uVar, "headers");
            List<String> j = uVar.mo76248j(C16050SM.SET_COOKIE);
            int size = j.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                C15965m c = mo76186c(vVar, j.get(i));
                if (c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c);
                }
            }
            if (arrayList == null) {
                return C13614t.m87748j();
            }
            List<C15965m> unmodifiableList = Collections.unmodifiableList(arrayList);
            C13706o.m87928e(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }
    }

    private C15965m(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f65756a = str;
        this.f65757b = str2;
        this.f65758c = j;
        this.f65759d = str3;
        this.f65760e = str4;
        this.f65761f = z;
        this.f65762g = z2;
        this.f65763h = z3;
        this.f65764i = z4;
    }

    /* renamed from: e */
    public final String mo76180e() {
        return this.f65756a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15965m) {
            C15965m mVar = (C15965m) obj;
            return C13706o.m87924a(mVar.f65756a, this.f65756a) && C13706o.m87924a(mVar.f65757b, this.f65757b) && mVar.f65758c == this.f65758c && C13706o.m87924a(mVar.f65759d, this.f65759d) && C13706o.m87924a(mVar.f65760e, this.f65760e) && mVar.f65761f == this.f65761f && mVar.f65762g == this.f65762g && mVar.f65763h == this.f65763h && mVar.f65764i == this.f65764i;
        }
    }

    /* renamed from: f */
    public final String mo76182f(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f65756a);
        sb.append('=');
        sb.append(this.f65757b);
        if (this.f65763h) {
            if (this.f65758c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C16686c.m99137b(new Date(this.f65758c)));
            }
        }
        if (!this.f65764i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f65759d);
        }
        sb.append("; path=");
        sb.append(this.f65760e);
        if (this.f65761f) {
            sb.append("; secure");
        }
        if (this.f65762g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "toString()");
        return sb2;
    }

    /* renamed from: g */
    public final String mo76183g() {
        return this.f65757b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f65756a.hashCode()) * 31) + this.f65757b.hashCode()) * 31) + C1405a.m633a(this.f65758c)) * 31) + this.f65759d.hashCode()) * 31) + this.f65760e.hashCode()) * 31) + C0956a.m550a(this.f65761f)) * 31) + C0956a.m550a(this.f65762g)) * 31) + C0956a.m550a(this.f65763h)) * 31) + C0956a.m550a(this.f65764i);
    }

    public String toString() {
        return mo76182f(false);
    }

    public /* synthetic */ C15965m(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C13695i iVar) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}

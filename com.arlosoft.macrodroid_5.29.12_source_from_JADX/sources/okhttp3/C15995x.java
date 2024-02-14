package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p424wa.C16785c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000eB/\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, mo71668d2 = {"Lokhttp3/x;", "", "Ljava/nio/charset/Charset;", "defaultValue", "c", "", "name", "f", "toString", "other", "", "equals", "", "hashCode", "a", "Ljava/lang/String;", "mediaType", "b", "h", "()Ljava/lang/String;", "type", "subtype", "", "d", "[Ljava/lang/String;", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "g", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.x */
/* compiled from: MediaType.kt */
public final class C15995x {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Pattern f65815e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Pattern f65816f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: g */
    public static final C15996a f65817g = new C15996a((C13695i) null);

    /* renamed from: a */
    private final String f65818a;

    /* renamed from: b */
    private final String f65819b;

    /* renamed from: c */
    private final String f65820c;

    /* renamed from: d */
    private final String[] f65821d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, mo71668d2 = {"Lokhttp3/x$a;", "", "", "Lokhttp3/x;", "a", "(Ljava/lang/String;)Lokhttp3/x;", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.x$a */
    /* compiled from: MediaType.kt */
    public static final class C15996a {
        private C15996a() {
        }

        public /* synthetic */ C15996a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C15995x mo76319a(String str) {
            C13706o.m87929f(str, "$this$toMediaType");
            Matcher matcher = C15995x.f65815e.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C13706o.m87928e(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C13706o.m87928e(locale, "Locale.US");
                Objects.requireNonNull(group, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = group.toLowerCase(locale);
                C13706o.m87928e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                C13706o.m87928e(group2, "typeSubtype.group(2)");
                C13706o.m87928e(locale, "Locale.US");
                Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = group2.toLowerCase(locale);
                C13706o.m87928e(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = C15995x.f65816f.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (C15176v.m93634I(group4, "'", false, 2, (Object) null) && C15176v.m93640u(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C13706o.m87928e(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        C13706o.m87928e(substring, "(this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new C15995x(str, lowerCase, lowerCase2, (String[]) array, (C13695i) null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        /* renamed from: b */
        public final C15995x mo76320b(String str) {
            C13706o.m87929f(str, "$this$toMediaTypeOrNull");
            try {
                return mo76319a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private C15995x(String str, String str2, String str3, String[] strArr) {
        this.f65818a = str;
        this.f65819b = str2;
        this.f65820c = str3;
        this.f65821d = strArr;
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m96394d(C15995x xVar, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return xVar.mo76313c(charset);
    }

    /* renamed from: e */
    public static final C15995x m96395e(String str) {
        return f65817g.mo76319a(str);
    }

    /* renamed from: g */
    public static final C15995x m96396g(String str) {
        return f65817g.mo76320b(str);
    }

    /* renamed from: c */
    public final Charset mo76313c(Charset charset) {
        String f = mo76315f("charset");
        if (f == null) {
            return charset;
        }
        try {
            return Charset.forName(f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15995x) && C13706o.m87924a(((C15995x) obj).f65818a, this.f65818a);
    }

    /* renamed from: f */
    public final String mo76315f(String str) {
        C13706o.m87929f(str, "name");
        C16785c j = C16792h.m99548j(C13596m.m87579D(this.f65821d), 2);
        int d = j.mo79764d();
        int f = j.mo79766f();
        int h = j.mo79767h();
        if (h >= 0) {
            if (d > f) {
                return null;
            }
        } else if (d < f) {
            return null;
        }
        while (!C15176v.m93641v(this.f65821d[d], str, true)) {
            if (d == f) {
                return null;
            }
            d += h;
        }
        return this.f65821d[d + 1];
    }

    /* renamed from: h */
    public final String mo76316h() {
        return this.f65819b;
    }

    public int hashCode() {
        return this.f65818a.hashCode();
    }

    public String toString() {
        return this.f65818a;
    }

    public /* synthetic */ C15995x(String str, String str2, String str3, String[] strArr, C13695i iVar) {
        this(str, str2, str3, strArr);
    }
}

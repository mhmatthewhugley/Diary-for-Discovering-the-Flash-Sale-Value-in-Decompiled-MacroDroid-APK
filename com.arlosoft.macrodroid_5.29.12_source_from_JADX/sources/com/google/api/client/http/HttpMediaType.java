package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HttpMediaType {

    /* renamed from: e */
    private static final Pattern f52428e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: f */
    private static final Pattern f52429f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: g */
    private static final Pattern f52430g;

    /* renamed from: h */
    private static final Pattern f52431h;

    /* renamed from: a */
    private String f52432a = "application";

    /* renamed from: b */
    private String f52433b = "octet-stream";

    /* renamed from: c */
    private final SortedMap<String, String> f52434c = new TreeMap();

    /* renamed from: d */
    private String f52435d;

    static {
        StringBuilder sb = new StringBuilder("[^\\s/=;\"]+".length() + 14 + "[^\\s/=;\"]+".length() + ";.*".length());
        sb.append("\\s*(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")/(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")");
        sb.append("\\s*(");
        sb.append(";.*");
        sb.append(")?");
        f52430g = Pattern.compile(sb.toString(), 32);
        StringBuilder sb2 = new StringBuilder("\"([^\"]*)\"".length() + 1 + "[^\\s;\"]*".length());
        sb2.append("\"([^\"]*)\"");
        sb2.append("|");
        sb2.append("[^\\s;\"]*");
        String valueOf = String.valueOf(sb2.toString());
        StringBuilder sb3 = new StringBuilder("[^\\s/=;\"]+".length() + 12 + valueOf.length());
        sb3.append("\\s*;\\s*(");
        sb3.append("[^\\s/=;\"]+");
        sb3.append(")");
        sb3.append("=(");
        sb3.append(valueOf);
        sb3.append(")");
        f52431h = Pattern.compile(sb3.toString());
    }

    public HttpMediaType(String str) {
        m72056d(str);
    }

    /* renamed from: c */
    public static boolean m72055c(String str, String str2) {
        return (str == null && str2 == null) || !(str == null || str2 == null || !new HttpMediaType(str).mo60402b(new HttpMediaType(str2)));
    }

    /* renamed from: d */
    private HttpMediaType m72056d(String str) {
        Matcher matcher = f52430g.matcher(str);
        Preconditions.m72714b(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        mo60413o(matcher.group(1));
        mo60412n(matcher.group(2));
        String group = matcher.group(3);
        if (group != null) {
            Matcher matcher2 = f52431h.matcher(group);
            while (matcher2.find()) {
                String group2 = matcher2.group(1);
                String group3 = matcher2.group(3);
                if (group3 == null) {
                    group3 = matcher2.group(2);
                }
                mo60411m(group2, group3);
            }
        }
        return this;
    }

    /* renamed from: i */
    static boolean m72057i(String str) {
        return f52429f.matcher(str).matches();
    }

    /* renamed from: j */
    private static String m72058j(String str) {
        String valueOf = String.valueOf(str.replace("\\", "\\\\").replace("\"", "\\\""));
        StringBuilder sb = new StringBuilder(valueOf.length() + 2);
        sb.append("\"");
        sb.append(valueOf);
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: a */
    public String mo60401a() {
        String str = this.f52435d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52432a);
        sb.append('/');
        sb.append(this.f52433b);
        SortedMap<String, String> sortedMap = this.f52434c;
        if (sortedMap != null) {
            for (Map.Entry next : sortedMap.entrySet()) {
                String str2 = (String) next.getValue();
                sb.append("; ");
                sb.append((String) next.getKey());
                sb.append("=");
                if (!m72057i(str2)) {
                    str2 = m72058j(str2);
                }
                sb.append(str2);
            }
        }
        String sb2 = sb.toString();
        this.f52435d = sb2;
        return sb2;
    }

    /* renamed from: b */
    public boolean mo60402b(HttpMediaType httpMediaType) {
        return httpMediaType != null && mo60407h().equalsIgnoreCase(httpMediaType.mo60407h()) && mo60406g().equalsIgnoreCase(httpMediaType.mo60406g());
    }

    /* renamed from: e */
    public Charset mo60403e() {
        String f = mo60405f("charset");
        if (f == null) {
            return null;
        }
        return Charset.forName(f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpMediaType)) {
            return false;
        }
        HttpMediaType httpMediaType = (HttpMediaType) obj;
        if (!mo60402b(httpMediaType) || !this.f52434c.equals(httpMediaType.f52434c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo60405f(String str) {
        return (String) this.f52434c.get(str.toLowerCase());
    }

    /* renamed from: g */
    public String mo60406g() {
        return this.f52433b;
    }

    /* renamed from: h */
    public String mo60407h() {
        return this.f52432a;
    }

    public int hashCode() {
        return mo60401a().hashCode();
    }

    /* renamed from: k */
    public HttpMediaType mo60409k(String str) {
        this.f52435d = null;
        this.f52434c.remove(str.toLowerCase());
        return this;
    }

    /* renamed from: l */
    public HttpMediaType mo60410l(Charset charset) {
        mo60411m("charset", charset == null ? null : charset.name());
        return this;
    }

    /* renamed from: m */
    public HttpMediaType mo60411m(String str, String str2) {
        if (str2 == null) {
            mo60409k(str);
            return this;
        }
        Preconditions.m72714b(f52429f.matcher(str).matches(), "Name contains reserved characters");
        this.f52435d = null;
        this.f52434c.put(str.toLowerCase(), str2);
        return this;
    }

    /* renamed from: n */
    public HttpMediaType mo60412n(String str) {
        Preconditions.m72714b(f52428e.matcher(str).matches(), "Subtype contains reserved characters");
        this.f52433b = str;
        this.f52435d = null;
        return this;
    }

    /* renamed from: o */
    public HttpMediaType mo60413o(String str) {
        Preconditions.m72714b(f52428e.matcher(str).matches(), "Type contains reserved characters");
        this.f52432a = str;
        this.f52435d = null;
        return this;
    }

    public String toString() {
        return mo60401a();
    }
}

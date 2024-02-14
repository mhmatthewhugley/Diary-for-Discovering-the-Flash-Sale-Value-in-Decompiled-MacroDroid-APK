package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R%\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\t8G¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015¨\u0006\u0019"}, mo71668d2 = {"Lokhttp3/h;", "", "other", "", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/util/Map;", "authParams", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "scheme", "realm", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.h */
/* compiled from: Challenge.kt */
public final class C15932h {

    /* renamed from: a */
    private final Map<String, String> f65509a;

    /* renamed from: b */
    private final String f65510b;

    public C15932h(String str, Map<String, String> map) {
        String str2;
        C13706o.m87929f(str, "scheme");
        C13706o.m87929f(map, "authParams");
        this.f65510b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                C13706o.m87928e(locale, "US");
                str2 = str3.toLowerCase(locale);
                C13706o.m87928e(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C13706o.m87928e(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f65509a = unmodifiableMap;
    }

    /* renamed from: a */
    public final Charset mo76052a() {
        String str = this.f65509a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C13706o.m87928e(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C13706o.m87928e(charset, "ISO_8859_1");
        return charset;
    }

    /* renamed from: b */
    public final String mo76053b() {
        return this.f65509a.get("realm");
    }

    /* renamed from: c */
    public final String mo76054c() {
        return this.f65510b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15932h) {
            C15932h hVar = (C15932h) obj;
            return C13706o.m87924a(hVar.f65510b, this.f65510b) && C13706o.m87924a(hVar.f65509a, this.f65509a);
        }
    }

    public int hashCode() {
        return ((899 + this.f65510b.hashCode()) * 31) + this.f65509a.hashCode();
    }

    public String toString() {
        return this.f65510b + " authParams=" + this.f65509a;
    }
}

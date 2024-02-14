package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.Base64;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import com.google.api.client.util.Throwables;
import com.google.api.client.util.Types;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.p353io.IOUtils;
import org.apache.http.auth.AUTH;
import org.apache.http.cookie.C16050SM;

public class HttpHeaders extends GenericData {
    @Key("Accept")
    private List<String> accept;
    @Key("Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @Key("Age")
    private List<Long> age;
    @Key("WWW-Authenticate")
    private List<String> authenticate;
    @Key("Authorization")
    private List<String> authorization;
    @Key("Cache-Control")
    private List<String> cacheControl;
    @Key("Content-Encoding")
    private List<String> contentEncoding;
    @Key("Content-Length")
    private List<Long> contentLength;
    @Key("Content-MD5")
    private List<String> contentMD5;
    @Key("Content-Range")
    private List<String> contentRange;
    @Key("Content-Type")
    private List<String> contentType;
    @Key("Cookie")
    private List<String> cookie;
    @Key("Date")
    private List<String> date;
    @Key("ETag")
    private List<String> etag;
    @Key("Expires")
    private List<String> expires;
    @Key("If-Match")
    private List<String> ifMatch;
    @Key("If-Modified-Since")
    private List<String> ifModifiedSince;
    @Key("If-None-Match")
    private List<String> ifNoneMatch;
    @Key("If-Range")
    private List<String> ifRange;
    @Key("If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @Key("Last-Modified")
    private List<String> lastModified;
    @Key("Location")
    private List<String> location;
    @Key("MIME-Version")
    private List<String> mimeVersion;
    @Key("Range")
    private List<String> range;
    @Key("Retry-After")
    private List<String> retryAfter;
    @Key("User-Agent")
    private List<String> userAgent;

    private static class HeaderParsingFakeLevelHttpRequest extends LowLevelHttpRequest {

        /* renamed from: e */
        private final HttpHeaders f52422e;

        /* renamed from: f */
        private final ParseHeaderState f52423f;

        HeaderParsingFakeLevelHttpRequest(HttpHeaders httpHeaders, ParseHeaderState parseHeaderState) {
            this.f52422e = httpHeaders;
            this.f52423f = parseHeaderState;
        }

        /* renamed from: a */
        public void mo60255a(String str, String str2) {
            this.f52422e.mo60398t(str, str2, this.f52423f);
        }

        /* renamed from: b */
        public LowLevelHttpResponse mo60256b() throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    private static final class ParseHeaderState {

        /* renamed from: a */
        final ArrayValueMap f52424a;

        /* renamed from: b */
        final StringBuilder f52425b;

        /* renamed from: c */
        final ClassInfo f52426c;

        /* renamed from: d */
        final List<Type> f52427d;

        public ParseHeaderState(HttpHeaders httpHeaders, StringBuilder sb) {
            Class<?> cls = httpHeaders.getClass();
            this.f52427d = Arrays.asList(new Type[]{cls});
            this.f52426c = ClassInfo.m72641g(cls, true);
            this.f52425b = sb;
            this.f52424a = new ArrayValueMap(httpHeaders);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo60400a() {
            this.f52424a.mo60697b();
        }
    }

    public HttpHeaders() {
        super(EnumSet.of(GenericData.Flags.IGNORE_CASE));
    }

    /* renamed from: S */
    private static String m72016S(Object obj) {
        return obj instanceof Enum ? FieldInfo.m72675j((Enum) obj).mo60745e() : obj.toString();
    }

    /* renamed from: e */
    private static void m72017e(Logger logger, StringBuilder sb, StringBuilder sb2, LowLevelHttpRequest lowLevelHttpRequest, String str, Object obj, Writer writer) throws IOException {
        if (obj != null && !Data.m72652c(obj)) {
            String S = m72016S(obj);
            String str2 = ((AUTH.WWW_AUTH_RESP.equalsIgnoreCase(str) || C16050SM.COOKIE.equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : S;
            if (sb != null) {
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append(StringUtils.f52835a);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                sb2.append("'");
            }
            if (lowLevelHttpRequest != null) {
                lowLevelHttpRequest.mo60255a(str, S);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(S);
                writer.write(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
        }
    }

    /* renamed from: k */
    private <T> List<T> m72018k(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: p */
    private <T> T m72019p(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: u */
    private static Object m72020u(Type type, List<Type> list, String str) {
        return Data.m72659j(Data.m72660k(list, type), str);
    }

    /* renamed from: v */
    static void m72021v(HttpHeaders httpHeaders, StringBuilder sb, StringBuilder sb2, Logger logger, LowLevelHttpRequest lowLevelHttpRequest) throws IOException {
        m72022x(httpHeaders, sb, sb2, logger, lowLevelHttpRequest, (Writer) null);
    }

    /* renamed from: x */
    static void m72022x(HttpHeaders httpHeaders, StringBuilder sb, StringBuilder sb2, Logger logger, LowLevelHttpRequest lowLevelHttpRequest, Writer writer) throws IOException {
        HashSet hashSet = new HashSet();
        for (Map.Entry next : httpHeaders.entrySet()) {
            String str = (String) next.getKey();
            Preconditions.m72715c(hashSet.add(str), "multiple headers of the same name (headers are case insensitive): %s", str);
            Object value = next.getValue();
            if (value != null) {
                FieldInfo b = httpHeaders.mo60751b().mo60709b(str);
                if (b != null) {
                    str = b.mo60745e();
                }
                String str2 = str;
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object e : Types.m72741l(value)) {
                        m72017e(logger, sb, sb2, lowLevelHttpRequest, str2, e, writer);
                    }
                } else {
                    m72017e(logger, sb, sb2, lowLevelHttpRequest, str2, value, writer);
                }
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    /* renamed from: y */
    public static void m72023y(HttpHeaders httpHeaders, StringBuilder sb, Logger logger, Writer writer) throws IOException {
        m72022x(httpHeaders, sb, (StringBuilder) null, logger, (LowLevelHttpRequest) null, writer);
    }

    /* renamed from: A */
    public HttpHeaders mo60375A(String str) {
        this.acceptEncoding = m72018k(str);
        return this;
    }

    /* renamed from: B */
    public HttpHeaders mo60376B(String str) {
        return mo60377C(m72018k(str));
    }

    /* renamed from: C */
    public HttpHeaders mo60377C(List<String> list) {
        this.authorization = list;
        return this;
    }

    /* renamed from: D */
    public HttpHeaders mo60378D(String str, String str2) {
        String valueOf = String.valueOf((String) Preconditions.m72716d(str));
        String valueOf2 = String.valueOf((String) Preconditions.m72716d(str2));
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(valueOf2);
        String valueOf3 = String.valueOf(Base64.m72635b(StringUtils.m72727a(sb.toString())));
        return mo60376B(valueOf3.length() != 0 ? "Basic ".concat(valueOf3) : new String("Basic "));
    }

    /* renamed from: E */
    public HttpHeaders mo60379E(String str) {
        this.contentEncoding = m72018k(str);
        return this;
    }

    /* renamed from: G */
    public HttpHeaders mo60380G(Long l) {
        this.contentLength = m72018k(l);
        return this;
    }

    /* renamed from: H */
    public HttpHeaders mo60381H(String str) {
        this.contentRange = m72018k(str);
        return this;
    }

    /* renamed from: K */
    public HttpHeaders mo60382K(String str) {
        this.contentType = m72018k(str);
        return this;
    }

    /* renamed from: L */
    public HttpHeaders mo60383L(String str) {
        this.ifMatch = m72018k(str);
        return this;
    }

    /* renamed from: M */
    public HttpHeaders mo60384M(String str) {
        this.ifModifiedSince = m72018k(str);
        return this;
    }

    /* renamed from: N */
    public HttpHeaders mo60385N(String str) {
        this.ifNoneMatch = m72018k(str);
        return this;
    }

    /* renamed from: O */
    public HttpHeaders mo60386O(String str) {
        this.ifRange = m72018k(str);
        return this;
    }

    /* renamed from: P */
    public HttpHeaders mo60387P(String str) {
        this.ifUnmodifiedSince = m72018k(str);
        return this;
    }

    /* renamed from: R */
    public HttpHeaders mo60388R(String str) {
        this.userAgent = m72018k(str);
        return this;
    }

    /* renamed from: f */
    public HttpHeaders clone() {
        return (HttpHeaders) super.clone();
    }

    /* renamed from: g */
    public final void mo60390g(HttpHeaders httpHeaders) {
        try {
            ParseHeaderState parseHeaderState = new ParseHeaderState(this, (StringBuilder) null);
            m72021v(httpHeaders, (StringBuilder) null, (StringBuilder) null, (Logger) null, new HeaderParsingFakeLevelHttpRequest(this, parseHeaderState));
            parseHeaderState.mo60400a();
        } catch (IOException e) {
            throw Throwables.m72729a(e);
        }
    }

    /* renamed from: h */
    public final void mo60391h(LowLevelHttpResponse lowLevelHttpResponse, StringBuilder sb) throws IOException {
        clear();
        ParseHeaderState parseHeaderState = new ParseHeaderState(this, sb);
        int e = lowLevelHttpResponse.mo60260e();
        for (int i = 0; i < e; i++) {
            mo60398t(lowLevelHttpResponse.mo60261f(i), lowLevelHttpResponse.mo60262g(i), parseHeaderState);
        }
        parseHeaderState.mo60400a();
    }

    /* renamed from: l */
    public final List<String> mo60392l() {
        return this.authenticate;
    }

    /* renamed from: n */
    public final List<String> mo60393n() {
        return this.authorization;
    }

    /* renamed from: o */
    public final String mo60394o() {
        return (String) m72019p(this.contentType);
    }

    /* renamed from: q */
    public final String mo60395q() {
        return (String) m72019p(this.location);
    }

    /* renamed from: r */
    public final String mo60396r() {
        return (String) m72019p(this.range);
    }

    /* renamed from: s */
    public final String mo60397s() {
        return (String) m72019p(this.userAgent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo60398t(String str, String str2, ParseHeaderState parseHeaderState) {
        List<Type> list = parseHeaderState.f52427d;
        ClassInfo classInfo = parseHeaderState.f52426c;
        ArrayValueMap arrayValueMap = parseHeaderState.f52424a;
        StringBuilder sb = parseHeaderState.f52425b;
        if (sb != null) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(str2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(valueOf2);
            sb.append(sb2.toString());
            sb.append(StringUtils.f52835a);
        }
        FieldInfo b = classInfo.mo60709b(str);
        if (b != null) {
            Type k = Data.m72660k(list, b.mo60744d());
            if (Types.m72739j(k)) {
                Class<?> f = Types.m72735f(list, Types.m72731b(k));
                arrayValueMap.mo60696a(b.mo60743b(), f, m72020u(f, list, str2));
            } else if (Types.m72740k(Types.m72735f(list, k), Iterable.class)) {
                Collection<Object> collection = (Collection) b.mo60747g(this);
                if (collection == null) {
                    collection = Data.m72656g(k);
                    b.mo60750m(this, collection);
                }
                collection.add(m72020u(k == Object.class ? null : Types.m72733d(k), list, str2));
            } else {
                b.mo60750m(this, m72020u(k, list, str2));
            }
        } else {
            ArrayList arrayList = (ArrayList) get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                mo60078d(str, arrayList);
            }
            arrayList.add(str2);
        }
    }

    /* renamed from: z */
    public HttpHeaders mo60078d(String str, Object obj) {
        return (HttpHeaders) super.mo60078d(str, obj);
    }
}

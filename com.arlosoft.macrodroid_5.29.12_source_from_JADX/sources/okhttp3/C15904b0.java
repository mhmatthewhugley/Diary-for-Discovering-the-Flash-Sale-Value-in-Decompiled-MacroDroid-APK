package okhttp3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15986u;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPut;
import p297ja.C13328m;
import p372qc.C16279b;
import p408uc.C16690f;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eBC\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\b\u0010$\u001a\u0004\u0018\u00010!\u0012\u0016\u0010)\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010%¢\u0006\u0004\b/\u00100J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J%\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010$\u001a\u0004\u0018\u00010!8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u000e\u0010#R*\u0010)\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010%8\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0017\u0010(R\u0011\u0010,\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b&\u0010+R\u0011\u0010.\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010-¨\u00061"}, mo71668d2 = {"Lokhttp3/b0;", "", "", "name", "d", "T", "Ljava/lang/Class;", "type", "i", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/b0$a;", "h", "toString", "Lokhttp3/d;", "a", "Lokhttp3/d;", "lazyCacheControl", "Lokhttp3/v;", "b", "Lokhttp3/v;", "j", "()Lokhttp3/v;", "url", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "method", "Lokhttp3/u;", "Lokhttp3/u;", "e", "()Lokhttp3/u;", "headers", "Lokhttp3/c0;", "Lokhttp3/c0;", "()Lokhttp3/c0;", "body", "", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "tags", "", "()Z", "isHttps", "()Lokhttp3/d;", "cacheControl", "<init>", "(Lokhttp3/v;Ljava/lang/String;Lokhttp3/u;Lokhttp3/c0;Ljava/util/Map;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.b0 */
/* compiled from: Request.kt */
public final class C15904b0 {

    /* renamed from: a */
    private C15912d f65413a;

    /* renamed from: b */
    private final C15989v f65414b;

    /* renamed from: c */
    private final String f65415c;

    /* renamed from: d */
    private final C15986u f65416d;

    /* renamed from: e */
    private final C15907c0 f65417e;

    /* renamed from: f */
    private final Map<Class<?>, Object> f65418f;

    public C15904b0(C15989v vVar, String str, C15986u uVar, C15907c0 c0Var, Map<Class<?>, ? extends Object> map) {
        C13706o.m87929f(vVar, "url");
        C13706o.m87929f(str, "method");
        C13706o.m87929f(uVar, "headers");
        C13706o.m87929f(map, "tags");
        this.f65414b = vVar;
        this.f65415c = str;
        this.f65416d = uVar;
        this.f65417e = c0Var;
        this.f65418f = map;
    }

    /* renamed from: a */
    public final C15907c0 mo75911a() {
        return this.f65417e;
    }

    /* renamed from: b */
    public final C15912d mo75912b() {
        C15912d dVar = this.f65413a;
        if (dVar != null) {
            return dVar;
        }
        C15912d b = C15912d.f65435p.mo75964b(this.f65416d);
        this.f65413a = b;
        return b;
    }

    /* renamed from: c */
    public final Map<Class<?>, Object> mo75913c() {
        return this.f65418f;
    }

    /* renamed from: d */
    public final String mo75914d(String str) {
        C13706o.m87929f(str, "name");
        return this.f65416d.mo76241c(str);
    }

    /* renamed from: e */
    public final C15986u mo75915e() {
        return this.f65416d;
    }

    /* renamed from: f */
    public final boolean mo75916f() {
        return this.f65414b.mo76270j();
    }

    /* renamed from: g */
    public final String mo75917g() {
        return this.f65415c;
    }

    /* renamed from: h */
    public final C15905a mo75918h() {
        return new C15905a(this);
    }

    /* renamed from: i */
    public final <T> T mo75919i(Class<? extends T> cls) {
        C13706o.m87929f(cls, "type");
        return cls.cast(this.f65418f.get(cls));
    }

    /* renamed from: j */
    public final C15989v mo75920j() {
        return this.f65414b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f65415c);
        sb.append(", url=");
        sb.append(this.f65414b);
        if (this.f65416d.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : this.f65416d) {
                int i2 = i + 1;
                if (i < 0) {
                    C13614t.m87758t();
                }
                C13328m mVar = (C13328m) next;
                String str = (String) mVar.mo70152a();
                String str2 = (String) mVar.mo70153b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.f65418f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f65418f);
        }
        sb.append('}');
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b=\u0010>B\u0011\b\u0010\u0012\u0006\u0010?\u001a\u00020\u001f¢\u0006\u0004\b=\u0010@J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0014\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J/\u0010\u001d\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00192\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u00020\u001fH\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0017\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\r\u001a\u00020+8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R2\u0010<\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00020\u0001068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006A"}, mo71668d2 = {"Lokhttp3/b0$a;", "", "Lokhttp3/v;", "url", "o", "", "n", "name", "value", "f", "a", "l", "Lokhttp3/u;", "headers", "g", "d", "e", "Lokhttp3/c0;", "body", "j", "c", "k", "i", "method", "h", "T", "Ljava/lang/Class;", "type", "tag", "m", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/b0$a;", "Lokhttp3/b0;", "b", "Lokhttp3/v;", "getUrl$okhttp", "()Lokhttp3/v;", "setUrl$okhttp", "(Lokhttp3/v;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/u$a;", "Lokhttp3/u$a;", "getHeaders$okhttp", "()Lokhttp3/u$a;", "setHeaders$okhttp", "(Lokhttp3/u$a;)V", "Lokhttp3/c0;", "getBody$okhttp", "()Lokhttp3/c0;", "setBody$okhttp", "(Lokhttp3/c0;)V", "", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "tags", "<init>", "()V", "request", "(Lokhttp3/b0;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.b0$a */
    /* compiled from: Request.kt */
    public static class C15905a {

        /* renamed from: a */
        private C15989v f65419a;

        /* renamed from: b */
        private String f65420b;

        /* renamed from: c */
        private C15986u.C15987a f65421c;

        /* renamed from: d */
        private C15907c0 f65422d;

        /* renamed from: e */
        private Map<Class<?>, Object> f65423e;

        public C15905a() {
            this.f65423e = new LinkedHashMap();
            this.f65420b = "GET";
            this.f65421c = new C15986u.C15987a();
        }

        /* renamed from: a */
        public C15905a mo75922a(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "value");
            this.f65421c.mo76251a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C15904b0 mo75923b() {
            C15989v vVar = this.f65419a;
            if (vVar != null) {
                return new C15904b0(vVar, this.f65420b, this.f65421c.mo76256f(), this.f65422d, C16279b.m97640P(this.f65423e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: c */
        public C15905a mo75924c(C15907c0 c0Var) {
            return mo75929h(HttpDelete.METHOD_NAME, c0Var);
        }

        /* renamed from: d */
        public C15905a mo75925d() {
            return mo75929h("GET", (C15907c0) null);
        }

        /* renamed from: e */
        public C15905a mo75926e() {
            return mo75929h(HttpHead.METHOD_NAME, (C15907c0) null);
        }

        /* renamed from: f */
        public C15905a mo75927f(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "value");
            this.f65421c.mo76259i(str, str2);
            return this;
        }

        /* renamed from: g */
        public C15905a mo75928g(C15986u uVar) {
            C13706o.m87929f(uVar, "headers");
            this.f65421c = uVar.mo76244f();
            return this;
        }

        /* renamed from: h */
        public C15905a mo75929h(String str, C15907c0 c0Var) {
            C13706o.m87929f(str, "method");
            if (str.length() > 0) {
                if (c0Var == null) {
                    if (!(true ^ C16690f.m99156d(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!C16690f.m99155a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                this.f65420b = str;
                this.f65422d = c0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: i */
        public C15905a mo75930i(C15907c0 c0Var) {
            C13706o.m87929f(c0Var, "body");
            return mo75929h("PATCH", c0Var);
        }

        /* renamed from: j */
        public C15905a mo75931j(C15907c0 c0Var) {
            C13706o.m87929f(c0Var, "body");
            return mo75929h("POST", c0Var);
        }

        /* renamed from: k */
        public C15905a mo75932k(C15907c0 c0Var) {
            C13706o.m87929f(c0Var, "body");
            return mo75929h(HttpPut.METHOD_NAME, c0Var);
        }

        /* renamed from: l */
        public C15905a mo75933l(String str) {
            C13706o.m87929f(str, "name");
            this.f65421c.mo76258h(str);
            return this;
        }

        /* renamed from: m */
        public <T> C15905a mo75934m(Class<? super T> cls, T t) {
            C13706o.m87929f(cls, "type");
            if (t == null) {
                this.f65423e.remove(cls);
            } else {
                if (this.f65423e.isEmpty()) {
                    this.f65423e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f65423e;
                Object cast = cls.cast(t);
                C13706o.m87926c(cast);
                map.put(cls, cast);
            }
            return this;
        }

        /* renamed from: n */
        public C15905a mo75935n(String str) {
            C13706o.m87929f(str, "url");
            if (C15176v.m93632G(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String substring = str.substring(3);
                C13706o.m87928e(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            } else if (C15176v.m93632G(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String substring2 = str.substring(4);
                C13706o.m87928e(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                str = sb2.toString();
            }
            return mo75936o(C15989v.f65795l.mo76303d(str));
        }

        /* renamed from: o */
        public C15905a mo75936o(C15989v vVar) {
            C13706o.m87929f(vVar, "url");
            this.f65419a = vVar;
            return this;
        }

        public C15905a(C15904b0 b0Var) {
            Map<Class<?>, Object> map;
            C13706o.m87929f(b0Var, "request");
            this.f65423e = new LinkedHashMap();
            this.f65419a = b0Var.mo75920j();
            this.f65420b = b0Var.mo75917g();
            this.f65422d = b0Var.mo75911a();
            if (b0Var.mo75913c().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = C13615t0.m87773w(b0Var.mo75913c());
            }
            this.f65423e = map;
            this.f65421c = b0Var.mo75915e().mo76244f();
        }
    }
}

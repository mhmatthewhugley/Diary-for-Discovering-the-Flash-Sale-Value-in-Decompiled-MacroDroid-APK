package okhttp3;

import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15986u;
import okhttp3.internal.connection.C15938c;
import org.apache.http.auth.AUTH;
import p408uc.C16689e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000fB}\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\"\u0012\b\u0010,\u001a\u0004\u0018\u00010'\u0012\u0006\u00101\u001a\u00020-\u0012\b\u00107\u001a\u0004\u0018\u000102\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010F\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020B\u0012\b\u0010O\u001a\u0004\u0018\u00010J¢\u0006\u0004\bV\u0010WJ\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010,\u001a\u0004\u0018\u00010'8\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00101\u001a\u00020-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0019\u00107\u001a\u0004\u0018\u0001028\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010;\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b3\u0010:R\u0019\u0010>\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010:R\u0019\u0010A\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b@\u0010:R\u0017\u0010F\u001a\u00020B8\u0007¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b8\u0010ER\u0017\u0010I\u001a\u00020B8\u0007¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010ER\u001c\u0010O\u001a\u0004\u0018\u00010J8\u0001X\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010T¨\u0006X"}, mo71668d2 = {"Lokhttp3/d0;", "Ljava/io/Closeable;", "", "name", "defaultValue", "m", "Lokhttp3/d0$a;", "u", "", "Lokhttp3/h;", "f", "Lja/u;", "close", "toString", "Lokhttp3/d;", "a", "Lokhttp3/d;", "lazyCacheControl", "Lokhttp3/b0;", "c", "Lokhttp3/b0;", "y", "()Lokhttp3/b0;", "request", "Lokhttp3/a0;", "d", "Lokhttp3/a0;", "w", "()Lokhttp3/a0;", "protocol", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "message", "", "g", "I", "()I", "code", "Lokhttp3/t;", "o", "Lokhttp3/t;", "i", "()Lokhttp3/t;", "handshake", "Lokhttp3/u;", "p", "Lokhttp3/u;", "()Lokhttp3/u;", "headers", "Lokhttp3/e0;", "s", "Lokhttp3/e0;", "b", "()Lokhttp3/e0;", "body", "z", "Lokhttp3/d0;", "()Lokhttp3/d0;", "networkResponse", "A", "e", "cacheResponse", "B", "v", "priorResponse", "", "C", "J", "()J", "sentRequestAtMillis", "D", "x", "receivedResponseAtMillis", "Lokhttp3/internal/connection/c;", "E", "Lokhttp3/internal/connection/c;", "h", "()Lokhttp3/internal/connection/c;", "exchange", "", "J0", "()Z", "isSuccessful", "()Lokhttp3/d;", "cacheControl", "<init>", "(Lokhttp3/b0;Lokhttp3/a0;Ljava/lang/String;ILokhttp3/t;Lokhttp3/u;Lokhttp3/e0;Lokhttp3/d0;Lokhttp3/d0;Lokhttp3/d0;JJLokhttp3/internal/connection/c;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.d0 */
/* compiled from: Response.kt */
public final class C15915d0 implements Closeable {

    /* renamed from: A */
    private final C15915d0 f65457A;

    /* renamed from: B */
    private final C15915d0 f65458B;

    /* renamed from: C */
    private final long f65459C;

    /* renamed from: D */
    private final long f65460D;

    /* renamed from: E */
    private final C15938c f65461E;

    /* renamed from: a */
    private C15912d f65462a;

    /* renamed from: c */
    private final C15904b0 f65463c;

    /* renamed from: d */
    private final C15899a0 f65464d;

    /* renamed from: f */
    private final String f65465f;

    /* renamed from: g */
    private final int f65466g;

    /* renamed from: o */
    private final C15982t f65467o;

    /* renamed from: p */
    private final C15986u f65468p;

    /* renamed from: s */
    private final C15919e0 f65469s;

    /* renamed from: z */
    private final C15915d0 f65470z;

    public C15915d0(C15904b0 b0Var, C15899a0 a0Var, String str, int i, C15982t tVar, C15986u uVar, C15919e0 e0Var, C15915d0 d0Var, C15915d0 d0Var2, C15915d0 d0Var3, long j, long j2, C15938c cVar) {
        C13706o.m87929f(b0Var, "request");
        C13706o.m87929f(a0Var, "protocol");
        C13706o.m87929f(str, "message");
        C13706o.m87929f(uVar, "headers");
        this.f65463c = b0Var;
        this.f65464d = a0Var;
        this.f65465f = str;
        this.f65466g = i;
        this.f65467o = tVar;
        this.f65468p = uVar;
        this.f65469s = e0Var;
        this.f65470z = d0Var;
        this.f65457A = d0Var2;
        this.f65458B = d0Var3;
        this.f65459C = j;
        this.f65460D = j2;
        this.f65461E = cVar;
    }

    /* renamed from: o */
    public static /* synthetic */ String m95985o(C15915d0 d0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return d0Var.mo75975m(str, str2);
    }

    /* renamed from: J0 */
    public final boolean mo75965J0() {
        int i = this.f65466g;
        return 200 <= i && 299 >= i;
    }

    /* renamed from: b */
    public final C15919e0 mo75966b() {
        return this.f65469s;
    }

    /* renamed from: c */
    public final C15912d mo75967c() {
        C15912d dVar = this.f65462a;
        if (dVar != null) {
            return dVar;
        }
        C15912d b = C15912d.f65435p.mo75964b(this.f65468p);
        this.f65462a = b;
        return b;
    }

    public void close() {
        C15919e0 e0Var = this.f65469s;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* renamed from: e */
    public final C15915d0 mo75969e() {
        return this.f65457A;
    }

    /* renamed from: f */
    public final List<C15932h> mo75970f() {
        String str;
        C15986u uVar = this.f65468p;
        int i = this.f65466g;
        if (i == 401) {
            str = AUTH.WWW_AUTH;
        } else if (i != 407) {
            return C13614t.m87748j();
        } else {
            str = AUTH.PROXY_AUTH;
        }
        return C16689e.m99147a(uVar, str);
    }

    /* renamed from: g */
    public final int mo75971g() {
        return this.f65466g;
    }

    /* renamed from: h */
    public final C15938c mo75972h() {
        return this.f65461E;
    }

    /* renamed from: i */
    public final C15982t mo75973i() {
        return this.f65467o;
    }

    /* renamed from: j */
    public final String mo75974j(String str) {
        return m95985o(this, str, (String) null, 2, (Object) null);
    }

    /* renamed from: m */
    public final String mo75975m(String str, String str2) {
        C13706o.m87929f(str, "name");
        String c = this.f65468p.mo76241c(str);
        return c != null ? c : str2;
    }

    /* renamed from: p */
    public final C15986u mo75976p() {
        return this.f65468p;
    }

    /* renamed from: r */
    public final String mo75977r() {
        return this.f65465f;
    }

    /* renamed from: s */
    public final C15915d0 mo75978s() {
        return this.f65470z;
    }

    public String toString() {
        return "Response{protocol=" + this.f65464d + ", code=" + this.f65466g + ", message=" + this.f65465f + ", url=" + this.f65463c.mo75920j() + '}';
    }

    /* renamed from: u */
    public final C15916a mo75980u() {
        return new C15916a(this);
    }

    /* renamed from: v */
    public final C15915d0 mo75981v() {
        return this.f65458B;
    }

    /* renamed from: w */
    public final C15899a0 mo75982w() {
        return this.f65464d;
    }

    /* renamed from: x */
    public final long mo75983x() {
        return this.f65460D;
    }

    /* renamed from: y */
    public final C15904b0 mo75984y() {
        return this.f65463c;
    }

    /* renamed from: z */
    public final long mo75985z() {
        return this.f65459C;
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\"\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bi\u0010jB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bi\u0010XJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020&H\u0016J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\b\u0010/\u001a\u00020\u0004H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u001b\u001a\u00020I8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010)\u001a\u00020&8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b-\u0010]\u001a\u0004\bb\u0010_\"\u0004\bc\u0010aR$\u0010h\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010.¨\u0006k"}, mo71668d2 = {"Lokhttp3/d0$a;", "", "", "name", "Lokhttp3/d0;", "response", "Lja/u;", "f", "e", "Lokhttp3/b0;", "request", "r", "Lokhttp3/a0;", "protocol", "p", "", "code", "g", "message", "m", "Lokhttp3/t;", "handshake", "i", "value", "j", "a", "Lokhttp3/u;", "headers", "k", "Lokhttp3/e0;", "body", "b", "networkResponse", "n", "cacheResponse", "d", "priorResponse", "o", "", "sentRequestAtMillis", "s", "receivedResponseAtMillis", "q", "Lokhttp3/internal/connection/c;", "deferredTrailers", "l", "(Lokhttp3/internal/connection/c;)V", "c", "Lokhttp3/b0;", "getRequest$okhttp", "()Lokhttp3/b0;", "setRequest$okhttp", "(Lokhttp3/b0;)V", "Lokhttp3/a0;", "getProtocol$okhttp", "()Lokhttp3/a0;", "setProtocol$okhttp", "(Lokhttp3/a0;)V", "I", "h", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/t;", "getHandshake$okhttp", "()Lokhttp3/t;", "setHandshake$okhttp", "(Lokhttp3/t;)V", "Lokhttp3/u$a;", "Lokhttp3/u$a;", "getHeaders$okhttp", "()Lokhttp3/u$a;", "setHeaders$okhttp", "(Lokhttp3/u$a;)V", "Lokhttp3/e0;", "getBody$okhttp", "()Lokhttp3/e0;", "setBody$okhttp", "(Lokhttp3/e0;)V", "Lokhttp3/d0;", "getNetworkResponse$okhttp", "()Lokhttp3/d0;", "setNetworkResponse$okhttp", "(Lokhttp3/d0;)V", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lokhttp3/internal/connection/c;", "getExchange$okhttp", "()Lokhttp3/internal/connection/c;", "setExchange$okhttp", "exchange", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.d0$a */
    /* compiled from: Response.kt */
    public static class C15916a {

        /* renamed from: a */
        private C15904b0 f65471a;

        /* renamed from: b */
        private C15899a0 f65472b;

        /* renamed from: c */
        private int f65473c;

        /* renamed from: d */
        private String f65474d;

        /* renamed from: e */
        private C15982t f65475e;

        /* renamed from: f */
        private C15986u.C15987a f65476f;

        /* renamed from: g */
        private C15919e0 f65477g;

        /* renamed from: h */
        private C15915d0 f65478h;

        /* renamed from: i */
        private C15915d0 f65479i;

        /* renamed from: j */
        private C15915d0 f65480j;

        /* renamed from: k */
        private long f65481k;

        /* renamed from: l */
        private long f65482l;

        /* renamed from: m */
        private C15938c f65483m;

        public C15916a() {
            this.f65473c = -1;
            this.f65476f = new C15986u.C15987a();
        }

        /* renamed from: e */
        private final void m96005e(C15915d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.mo75966b() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        /* renamed from: f */
        private final void m96006f(String str, C15915d0 d0Var) {
            if (d0Var != null) {
                boolean z = true;
                if (d0Var.mo75966b() == null) {
                    if (d0Var.mo75978s() == null) {
                        if (d0Var.mo75969e() == null) {
                            if (d0Var.mo75981v() != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        /* renamed from: a */
        public C15916a mo75986a(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "value");
            this.f65476f.mo76251a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C15916a mo75987b(C15919e0 e0Var) {
            this.f65477g = e0Var;
            return this;
        }

        /* renamed from: c */
        public C15915d0 mo75988c() {
            int i = this.f65473c;
            if (i >= 0) {
                C15904b0 b0Var = this.f65471a;
                if (b0Var != null) {
                    C15899a0 a0Var = this.f65472b;
                    if (a0Var != null) {
                        String str = this.f65474d;
                        if (str != null) {
                            return new C15915d0(b0Var, a0Var, str, i, this.f65475e, this.f65476f.mo76256f(), this.f65477g, this.f65478h, this.f65479i, this.f65480j, this.f65481k, this.f65482l, this.f65483m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f65473c).toString());
        }

        /* renamed from: d */
        public C15916a mo75989d(C15915d0 d0Var) {
            m96006f("cacheResponse", d0Var);
            this.f65479i = d0Var;
            return this;
        }

        /* renamed from: g */
        public C15916a mo75990g(int i) {
            this.f65473c = i;
            return this;
        }

        /* renamed from: h */
        public final int mo75991h() {
            return this.f65473c;
        }

        /* renamed from: i */
        public C15916a mo75992i(C15982t tVar) {
            this.f65475e = tVar;
            return this;
        }

        /* renamed from: j */
        public C15916a mo75993j(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "value");
            this.f65476f.mo76259i(str, str2);
            return this;
        }

        /* renamed from: k */
        public C15916a mo75994k(C15986u uVar) {
            C13706o.m87929f(uVar, "headers");
            this.f65476f = uVar.mo76244f();
            return this;
        }

        /* renamed from: l */
        public final void mo75995l(C15938c cVar) {
            C13706o.m87929f(cVar, "deferredTrailers");
            this.f65483m = cVar;
        }

        /* renamed from: m */
        public C15916a mo75996m(String str) {
            C13706o.m87929f(str, "message");
            this.f65474d = str;
            return this;
        }

        /* renamed from: n */
        public C15916a mo75997n(C15915d0 d0Var) {
            m96006f("networkResponse", d0Var);
            this.f65478h = d0Var;
            return this;
        }

        /* renamed from: o */
        public C15916a mo75998o(C15915d0 d0Var) {
            m96005e(d0Var);
            this.f65480j = d0Var;
            return this;
        }

        /* renamed from: p */
        public C15916a mo75999p(C15899a0 a0Var) {
            C13706o.m87929f(a0Var, "protocol");
            this.f65472b = a0Var;
            return this;
        }

        /* renamed from: q */
        public C15916a mo76000q(long j) {
            this.f65482l = j;
            return this;
        }

        /* renamed from: r */
        public C15916a mo76001r(C15904b0 b0Var) {
            C13706o.m87929f(b0Var, "request");
            this.f65471a = b0Var;
            return this;
        }

        /* renamed from: s */
        public C15916a mo76002s(long j) {
            this.f65481k = j;
            return this;
        }

        public C15916a(C15915d0 d0Var) {
            C13706o.m87929f(d0Var, "response");
            this.f65473c = -1;
            this.f65471a = d0Var.mo75984y();
            this.f65472b = d0Var.mo75982w();
            this.f65473c = d0Var.mo75971g();
            this.f65474d = d0Var.mo75977r();
            this.f65475e = d0Var.mo75973i();
            this.f65476f = d0Var.mo75976p().mo76244f();
            this.f65477g = d0Var.mo75966b();
            this.f65478h = d0Var.mo75978s();
            this.f65479i = d0Var.mo75969e();
            this.f65480j = d0Var.mo75981v();
            this.f65481k = d0Var.mo75985z();
            this.f65482l = d0Var.mo75983x();
            this.f65483m = d0Var.mo75972h();
        }
    }
}

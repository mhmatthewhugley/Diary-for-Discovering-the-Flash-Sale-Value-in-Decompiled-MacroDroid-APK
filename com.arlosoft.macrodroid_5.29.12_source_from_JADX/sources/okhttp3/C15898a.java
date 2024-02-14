package okhttp3;

import androidx.webkit.ProxyConfig;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15989v;
import p372qc.C16279b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020 \u0012\b\u0010*\u001a\u0004\u0018\u00010&\u0012\b\u0010/\u001a\u0004\u0018\u00010+\u0012\b\u00104\u001a\u0004\u0018\u000100\u0012\u0006\u00109\u001a\u000205\u0012\b\u0010=\u001a\u0004\u0018\u00010:\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012\u0012\u0006\u0010A\u001a\u00020>¢\u0006\u0004\bD\u0010EJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8G¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00128G¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010&8\u0007¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010/\u001a\u0004\u0018\u00010+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u0019\u00104\u001a\u0004\u0018\u0001008\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\r\u00103R\u0017\u00109\u001a\u0002058\u0007¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b1\u00108R\u0019\u0010=\u001a\u0004\u0018\u00010:8\u0007¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b,\u0010<R\u0017\u0010A\u001a\u00020>8\u0007¢\u0006\f\n\u0004\b(\u0010?\u001a\u0004\b6\u0010@¨\u0006F"}, mo71668d2 = {"Lokhttp3/a;", "", "other", "", "equals", "", "hashCode", "that", "d", "(Lokhttp3/a;)Z", "", "toString", "Lokhttp3/v;", "a", "Lokhttp3/v;", "l", "()Lokhttp3/v;", "url", "", "Lokhttp3/a0;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "protocols", "Lokhttp3/l;", "c", "connectionSpecs", "Lokhttp3/q;", "Lokhttp3/q;", "()Lokhttp3/q;", "dns", "Ljavax/net/SocketFactory;", "e", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "g", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/g;", "h", "Lokhttp3/g;", "()Lokhttp3/g;", "certificatePinner", "Lokhttp3/b;", "i", "Lokhttp3/b;", "()Lokhttp3/b;", "proxyAuthenticator", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "proxySelector", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILokhttp3/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/g;Lokhttp3/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.a */
/* compiled from: Address.kt */
public final class C15898a {

    /* renamed from: a */
    private final C15989v f65391a;

    /* renamed from: b */
    private final List<C15899a0> f65392b;

    /* renamed from: c */
    private final List<C15962l> f65393c;

    /* renamed from: d */
    private final C15972q f65394d;

    /* renamed from: e */
    private final SocketFactory f65395e;

    /* renamed from: f */
    private final SSLSocketFactory f65396f;

    /* renamed from: g */
    private final HostnameVerifier f65397g;

    /* renamed from: h */
    private final C15925g f65398h;

    /* renamed from: i */
    private final C15901b f65399i;

    /* renamed from: j */
    private final Proxy f65400j;

    /* renamed from: k */
    private final ProxySelector f65401k;

    public C15898a(String str, int i, C15972q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C15925g gVar, C15901b bVar, Proxy proxy, List<? extends C15899a0> list, List<C15962l> list2, ProxySelector proxySelector) {
        C13706o.m87929f(str, "uriHost");
        C13706o.m87929f(qVar, "dns");
        C13706o.m87929f(socketFactory, "socketFactory");
        C13706o.m87929f(bVar, "proxyAuthenticator");
        C13706o.m87929f(list, "protocols");
        C13706o.m87929f(list2, "connectionSpecs");
        C13706o.m87929f(proxySelector, "proxySelector");
        this.f65394d = qVar;
        this.f65395e = socketFactory;
        this.f65396f = sSLSocketFactory;
        this.f65397g = hostnameVerifier;
        this.f65398h = gVar;
        this.f65399i = bVar;
        this.f65400j = proxy;
        this.f65401k = proxySelector;
        this.f65391a = new C15989v.C15990a().mo76292q(sSLSocketFactory != null ? ProxyConfig.MATCH_HTTPS : "http").mo76287g(str).mo76290m(i).mo76284c();
        this.f65392b = C16279b.m97639O(list);
        this.f65393c = C16279b.m97639O(list2);
    }

    /* renamed from: a */
    public final C15925g mo75894a() {
        return this.f65398h;
    }

    /* renamed from: b */
    public final List<C15962l> mo75895b() {
        return this.f65393c;
    }

    /* renamed from: c */
    public final C15972q mo75896c() {
        return this.f65394d;
    }

    /* renamed from: d */
    public final boolean mo75897d(C15898a aVar) {
        C13706o.m87929f(aVar, "that");
        return C13706o.m87924a(this.f65394d, aVar.f65394d) && C13706o.m87924a(this.f65399i, aVar.f65399i) && C13706o.m87924a(this.f65392b, aVar.f65392b) && C13706o.m87924a(this.f65393c, aVar.f65393c) && C13706o.m87924a(this.f65401k, aVar.f65401k) && C13706o.m87924a(this.f65400j, aVar.f65400j) && C13706o.m87924a(this.f65396f, aVar.f65396f) && C13706o.m87924a(this.f65397g, aVar.f65397g) && C13706o.m87924a(this.f65398h, aVar.f65398h) && this.f65391a.mo76274n() == aVar.f65391a.mo76274n();
    }

    /* renamed from: e */
    public final HostnameVerifier mo75898e() {
        return this.f65397g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15898a) {
            C15898a aVar = (C15898a) obj;
            return C13706o.m87924a(this.f65391a, aVar.f65391a) && mo75897d(aVar);
        }
    }

    /* renamed from: f */
    public final List<C15899a0> mo75900f() {
        return this.f65392b;
    }

    /* renamed from: g */
    public final Proxy mo75901g() {
        return this.f65400j;
    }

    /* renamed from: h */
    public final C15901b mo75902h() {
        return this.f65399i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f65391a.hashCode()) * 31) + this.f65394d.hashCode()) * 31) + this.f65399i.hashCode()) * 31) + this.f65392b.hashCode()) * 31) + this.f65393c.hashCode()) * 31) + this.f65401k.hashCode()) * 31) + Objects.hashCode(this.f65400j)) * 31) + Objects.hashCode(this.f65396f)) * 31) + Objects.hashCode(this.f65397g)) * 31) + Objects.hashCode(this.f65398h);
    }

    /* renamed from: i */
    public final ProxySelector mo75904i() {
        return this.f65401k;
    }

    /* renamed from: j */
    public final SocketFactory mo75905j() {
        return this.f65395e;
    }

    /* renamed from: k */
    public final SSLSocketFactory mo75906k() {
        return this.f65396f;
    }

    /* renamed from: l */
    public final C15989v mo75907l() {
        return this.f65391a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f65391a.mo76269i());
        sb2.append(':');
        sb2.append(this.f65391a.mo76274n());
        sb2.append(", ");
        if (this.f65400j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f65400j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f65401k;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}

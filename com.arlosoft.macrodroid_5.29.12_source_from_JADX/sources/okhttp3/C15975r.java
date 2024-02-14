package okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 92\u00020\u0001:\u000295B\u0007¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010:\u001a\u00020/H\u0016¨\u0006>"}, mo71668d2 = {"Lokhttp3/r;", "", "Lokhttp3/e;", "call", "Lja/u;", "e", "Lokhttp3/v;", "url", "o", "", "Ljava/net/Proxy;", "proxies", "n", "", "domainName", "m", "Ljava/net/InetAddress;", "inetAddressList", "l", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "i", "B", "Lokhttp3/t;", "handshake", "A", "Lokhttp3/a0;", "protocol", "g", "Ljava/io/IOException;", "ioe", "h", "Lokhttp3/j;", "connection", "j", "k", "t", "Lokhttp3/b0;", "request", "s", "q", "", "byteCount", "p", "r", "y", "Lokhttp3/d0;", "response", "x", "v", "u", "w", "c", "d", "f", "z", "b", "cachedResponse", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.r */
/* compiled from: EventListener.kt */
public abstract class C15975r {

    /* renamed from: a */
    public static final C15975r f65777a = new C15976a();

    /* renamed from: b */
    public static final C15977b f65778b = new C15977b((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo71668d2 = {"okhttp3/r$a", "Lokhttp3/r;", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.r$a */
    /* compiled from: EventListener.kt */
    public static final class C15976a extends C15975r {
        C15976a() {
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo71668d2 = {"Lokhttp3/r$b;", "", "Lokhttp3/r;", "NONE", "Lokhttp3/r;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.r$b */
    /* compiled from: EventListener.kt */
    public static final class C15977b {
        private C15977b() {
        }

        public /* synthetic */ C15977b(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo71668d2 = {"Lokhttp3/r$c;", "", "Lokhttp3/e;", "call", "Lokhttp3/r;", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.r$c */
    /* compiled from: EventListener.kt */
    public interface C15978c {
        /* renamed from: a */
        C15975r mo76227a(C15917e eVar);
    }

    /* renamed from: A */
    public void mo76199A(C15917e eVar, C15982t tVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: B */
    public void mo76200B(C15917e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: a */
    public void mo76201a(C15917e eVar, C15915d0 d0Var) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(d0Var, "cachedResponse");
    }

    /* renamed from: b */
    public void mo76202b(C15917e eVar, C15915d0 d0Var) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(d0Var, "response");
    }

    /* renamed from: c */
    public void mo76203c(C15917e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: d */
    public void mo76204d(C15917e eVar, IOException iOException) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(iOException, "ioe");
    }

    /* renamed from: e */
    public void mo76205e(C15917e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: f */
    public void mo76206f(C15917e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: g */
    public void mo76207g(C15917e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, C15899a0 a0Var) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(inetSocketAddress, "inetSocketAddress");
        C13706o.m87929f(proxy, "proxy");
    }

    /* renamed from: h */
    public void mo76208h(C15917e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, C15899a0 a0Var, IOException iOException) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(inetSocketAddress, "inetSocketAddress");
        C13706o.m87929f(proxy, "proxy");
        C13706o.m87929f(iOException, "ioe");
    }

    /* renamed from: i */
    public void mo76209i(C15917e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(inetSocketAddress, "inetSocketAddress");
        C13706o.m87929f(proxy, "proxy");
    }

    /* renamed from: j */
    public void mo76210j(C15917e eVar, C15960j jVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(jVar, "connection");
    }

    /* renamed from: k */
    public void mo76211k(C15917e eVar, C15960j jVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(jVar, "connection");
    }

    /* renamed from: l */
    public void mo76212l(C15917e eVar, String str, List<InetAddress> list) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(str, "domainName");
        C13706o.m87929f(list, "inetAddressList");
    }

    /* renamed from: m */
    public void mo76213m(C15917e eVar, String str) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(str, "domainName");
    }

    /* renamed from: n */
    public void mo76214n(C15917e eVar, C15989v vVar, List<Proxy> list) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(vVar, "url");
        C13706o.m87929f(list, "proxies");
    }

    /* renamed from: o */
    public void mo76215o(C15917e eVar, C15989v vVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(vVar, "url");
    }

    /* renamed from: p */
    public void mo76216p(C15917e eVar, long j) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: q */
    public void mo76217q(C15917e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: r */
    public void mo76218r(C15917e eVar, IOException iOException) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(iOException, "ioe");
    }

    /* renamed from: s */
    public void mo76219s(C15917e eVar, C15904b0 b0Var) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(b0Var, "request");
    }

    /* renamed from: t */
    public void mo76220t(C15917e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: u */
    public void mo76221u(C15917e eVar, long j) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: v */
    public void mo76222v(C15917e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: w */
    public void mo76223w(C15917e eVar, IOException iOException) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(iOException, "ioe");
    }

    /* renamed from: x */
    public void mo76224x(C15917e eVar, C15915d0 d0Var) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(d0Var, "response");
    }

    /* renamed from: y */
    public void mo76225y(C15917e eVar) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: z */
    public void mo76226z(C15917e eVar, C15915d0 d0Var) {
        C13706o.m87929f(eVar, NotificationCompat.CATEGORY_CALL);
        C13706o.m87929f(d0Var, "response");
    }
}

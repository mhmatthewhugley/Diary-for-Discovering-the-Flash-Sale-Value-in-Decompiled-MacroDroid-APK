package okhttp3;

import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15917e;
import okhttp3.C15975r;
import okhttp3.internal.connection.C15942e;
import okhttp3.internal.connection.C15954i;
import org.apache.commons.p353io.FileUtils;
import p212ad.C11095c;
import p212ad.C11097d;
import p372qc.C16279b;
import p435xc.C16926h;
import p451zc.C17090a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\t\u0001B\u0015\b\u0000\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001B\u000b\b\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u000e\u001a\u00020\n8G¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8G¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010$\u001a\u00020\u001f8G¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020%8G¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010.\u001a\u00020*8G¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0017\u0010-R\u0017\u00101\u001a\u00020%8G¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u00103\u001a\u00020%8G¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b/\u0010(R\u0017\u00109\u001a\u0002048G¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010>\u001a\u00020:8G¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b+\u0010=R\u0019\u0010C\u001a\u0004\u0018\u00010?8G¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b5\u0010BR\u0017\u0010H\u001a\u00020D8G¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b@\u0010GR\u0017\u0010I\u001a\u00020*8G¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b;\u0010-R\u0017\u0010O\u001a\u00020J8G¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010R\u001a\u0004\u0018\u00010P8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010QR\u0019\u0010V\u001a\u0004\u0018\u00010S8G¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020X0\u00158G¢\u0006\f\n\u0004\bY\u0010\u0018\u001a\u0004\bZ\u0010\u001aR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u00158G¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b2\u0010\u001aR\u0017\u0010c\u001a\u00020^8G¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010h\u001a\u00020d8G¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\b \u0010gR\u0017\u0010l\u001a\u00020i8G¢\u0006\f\n\u0004\bj\u0010Y\u001a\u0004\b\u001c\u0010kR\u0017\u0010o\u001a\u00020i8G¢\u0006\f\n\u0004\bm\u0010Y\u001a\u0004\bn\u0010kR\u0017\u0010q\u001a\u00020i8G¢\u0006\f\n\u0004\bp\u0010Y\u001a\u0004\bE\u0010kR\u0017\u0010s\u001a\u00020i8G¢\u0006\f\n\u0004\br\u0010Y\u001a\u0004\b_\u0010kR\u0017\u0010v\u001a\u00020i8G¢\u0006\f\n\u0004\bt\u0010Y\u001a\u0004\bu\u0010kR\u0017\u0010y\u001a\u00020w8G¢\u0006\f\n\u0004\bx\u0010\u0005\u001a\u0004\by\u0010zR\u0018\u0010\u0001\u001a\u00020{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010R\u001f\u0010\u0001\u001a\u0005\u0018\u00010\u00018G¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0013\u0010\u0001\u001a\u00020P8G¢\u0006\u0007\u001a\u0005\bT\u0010\u0001¨\u0006\u0001"}, mo71668d2 = {"Lokhttp3/z;", "", "Lokhttp3/e$a;", "", "Lja/u;", "J", "Lokhttp3/b0;", "request", "Lokhttp3/e;", "a", "Lokhttp3/p;", "Lokhttp3/p;", "o", "()Lokhttp3/p;", "dispatcher", "Lokhttp3/k;", "c", "Lokhttp3/k;", "k", "()Lokhttp3/k;", "connectionPool", "", "Lokhttp3/w;", "d", "Ljava/util/List;", "v", "()Ljava/util/List;", "interceptors", "f", "x", "networkInterceptors", "Lokhttp3/r$c;", "g", "Lokhttp3/r$c;", "q", "()Lokhttp3/r$c;", "eventListenerFactory", "", "Z", "E", "()Z", "retryOnConnectionFailure", "Lokhttp3/b;", "p", "Lokhttp3/b;", "()Lokhttp3/b;", "authenticator", "s", "r", "followRedirects", "z", "followSslRedirects", "Lokhttp3/n;", "A", "Lokhttp3/n;", "n", "()Lokhttp3/n;", "cookieJar", "Lokhttp3/q;", "B", "Lokhttp3/q;", "()Lokhttp3/q;", "dns", "Ljava/net/Proxy;", "C", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "D", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "proxySelector", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "F", "Ljavax/net/SocketFactory;", "G", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "H", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Lokhttp3/l;", "I", "l", "connectionSpecs", "Lokhttp3/a0;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "K", "Ljavax/net/ssl/HostnameVerifier;", "u", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/g;", "L", "Lokhttp3/g;", "()Lokhttp3/g;", "certificatePinner", "", "N", "()I", "callTimeoutMillis", "O", "h", "connectTimeoutMillis", "P", "readTimeoutMillis", "Q", "writeTimeoutMillis", "R", "y", "pingIntervalMillis", "", "S", "minWebSocketMessageToCompress", "()J", "Lokhttp3/internal/connection/i;", "T", "Lokhttp3/internal/connection/i;", "t", "()Lokhttp3/internal/connection/i;", "routeDatabase", "Lokhttp3/c;", "cache", "Lokhttp3/c;", "e", "()Lokhttp3/c;", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lokhttp3/z$a;", "builder", "<init>", "(Lokhttp3/z$a;)V", "()V", "W", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.z */
/* compiled from: OkHttpClient.kt */
public class C16002z implements Cloneable, C15917e.C15918a {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public static final List<C15899a0> f65842U = C16279b.m97666t(C15899a0.HTTP_2, C15899a0.HTTP_1_1);
    /* access modifiers changed from: private */

    /* renamed from: V */
    public static final List<C15962l> f65843V = C16279b.m97666t(C15962l.f65739h, C15962l.f65741j);

    /* renamed from: W */
    public static final C16004b f65844W = new C16004b((C13695i) null);

    /* renamed from: A */
    private final C15967n f65845A;

    /* renamed from: B */
    private final C15972q f65846B;

    /* renamed from: C */
    private final Proxy f65847C;

    /* renamed from: D */
    private final ProxySelector f65848D;

    /* renamed from: E */
    private final C15901b f65849E;

    /* renamed from: F */
    private final SocketFactory f65850F;

    /* renamed from: G */
    private final SSLSocketFactory f65851G;

    /* renamed from: H */
    private final X509TrustManager f65852H;

    /* renamed from: I */
    private final List<C15962l> f65853I;

    /* renamed from: J */
    private final List<C15899a0> f65854J;

    /* renamed from: K */
    private final HostnameVerifier f65855K;

    /* renamed from: L */
    private final C15925g f65856L;

    /* renamed from: M */
    private final C11095c f65857M;

    /* renamed from: N */
    private final int f65858N;

    /* renamed from: O */
    private final int f65859O;

    /* renamed from: P */
    private final int f65860P;

    /* renamed from: Q */
    private final int f65861Q;

    /* renamed from: R */
    private final int f65862R;

    /* renamed from: S */
    private final long f65863S;

    /* renamed from: T */
    private final C15954i f65864T;

    /* renamed from: a */
    private final C15971p f65865a;

    /* renamed from: c */
    private final C15961k f65866c;

    /* renamed from: d */
    private final List<C15993w> f65867d;

    /* renamed from: f */
    private final List<C15993w> f65868f;

    /* renamed from: g */
    private final C15975r.C15978c f65869g;

    /* renamed from: o */
    private final boolean f65870o;

    /* renamed from: p */
    private final C15901b f65871p;

    /* renamed from: s */
    private final boolean f65872s;

    /* renamed from: z */
    private final boolean f65873z;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u001dR\"\u0010%\u001a\u00020\u001f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u00100R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b2\u00100R\"\u0010:\u001a\u0002048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b@\u0010B\"\u0004\bC\u0010DR\"\u0010\u000b\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\"\u0010K\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=\"\u0004\bJ\u0010?R\"\u0010S\u001a\u00020L8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010j\u001a\u0004\u0018\u00010d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b(\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010n\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bk\u0010A\u001a\u0004\bl\u0010B\"\u0004\bm\u0010DR\"\u0010u\u001a\u00020o8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bO\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010{\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b!\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0001\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0013\n\u0004\bW\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001R-\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\b6\u0010.\u001a\u0004\bk\u00100\"\u0006\b\u0001\u0010\u0001R.\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0015\n\u0004\bF\u0010.\u001a\u0005\b\u0001\u00100\"\u0006\b\u0001\u0010\u0001R'\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bI\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bU\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bH\u0010\u0001\"\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\b2\u0010\u0001\u001a\u0005\b]\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010¢\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b \u0001\u0010\u0001\"\u0006\b¡\u0001\u0010\u0001R*\u0010¤\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b£\u0001\u0010\u0001R)\u0010¦\u0001\u001a\u00030\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b_\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b¥\u0001\u0010\u0001R'\u0010ª\u0001\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0016\n\u0004\bl\u0010}\u001a\u0006\b\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R+\u0010±\u0001\u001a\u0005\u0018\u00010«\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\bf\u0010¬\u0001\u001a\u0006\b­\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R+\u0010³\u0001\u001a\u0005\u0018\u00010²\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\b³\u0001\u0010´\u0001\u001a\u0005\bE\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R+\u0010¹\u0001\u001a\u0005\u0018\u00010¸\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0005\bM\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001¨\u0006À\u0001"}, mo71668d2 = {"Lokhttp3/z$a;", "", "Lokhttp3/w;", "interceptor", "a", "", "retryOnConnectionFailure", "M", "Lokhttp3/b;", "authenticator", "b", "followRedirects", "f", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "N", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "K", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "d", "e", "L", "O", "Lokhttp3/z;", "c", "Lokhttp3/p;", "Lokhttp3/p;", "p", "()Lokhttp3/p;", "setDispatcher$okhttp", "(Lokhttp3/p;)V", "dispatcher", "Lokhttp3/k;", "Lokhttp3/k;", "m", "()Lokhttp3/k;", "setConnectionPool$okhttp", "(Lokhttp3/k;)V", "connectionPool", "", "Ljava/util/List;", "v", "()Ljava/util/List;", "interceptors", "x", "networkInterceptors", "Lokhttp3/r$c;", "Lokhttp3/r$c;", "r", "()Lokhttp3/r$c;", "setEventListenerFactory$okhttp", "(Lokhttp3/r$c;)V", "eventListenerFactory", "Z", "E", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "g", "Lokhttp3/b;", "()Lokhttp3/b;", "setAuthenticator$okhttp", "(Lokhttp3/b;)V", "h", "s", "setFollowRedirects$okhttp", "i", "t", "setFollowSslRedirects$okhttp", "followSslRedirects", "Lokhttp3/n;", "j", "Lokhttp3/n;", "o", "()Lokhttp3/n;", "setCookieJar$okhttp", "(Lokhttp3/n;)V", "cookieJar", "Lokhttp3/q;", "k", "Lokhttp3/q;", "q", "()Lokhttp3/q;", "setDns$okhttp", "(Lokhttp3/q;)V", "dns", "Ljava/net/Proxy;", "l", "Ljava/net/Proxy;", "A", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "C", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "n", "B", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "G", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "H", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "J", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "", "Lokhttp3/l;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", "Lokhttp3/a0;", "z", "setProtocols$okhttp", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "u", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/g;", "Lokhttp3/g;", "()Lokhttp3/g;", "setCertificatePinner$okhttp", "(Lokhttp3/g;)V", "certificatePinner", "", "w", "I", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "y", "D", "setReadTimeout$okhttp", "readTimeout", "setWriteTimeout$okhttp", "writeTimeout", "setPingInterval$okhttp", "pingInterval", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/i;", "Lokhttp3/internal/connection/i;", "F", "()Lokhttp3/internal/connection/i;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/i;)V", "routeDatabase", "Lokhttp3/c;", "cache", "Lokhttp3/c;", "()Lokhttp3/c;", "setCache$okhttp", "(Lokhttp3/c;)V", "Lad/c;", "certificateChainCleaner", "Lad/c;", "()Lad/c;", "setCertificateChainCleaner$okhttp", "(Lad/c;)V", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.z$a */
    /* compiled from: OkHttpClient.kt */
    public static final class C16003a {

        /* renamed from: A */
        private int f65874A;

        /* renamed from: B */
        private long f65875B;

        /* renamed from: C */
        private C15954i f65876C;

        /* renamed from: a */
        private C15971p f65877a = new C15971p();

        /* renamed from: b */
        private C15961k f65878b = new C15961k();

        /* renamed from: c */
        private final List<C15993w> f65879c = new ArrayList();

        /* renamed from: d */
        private final List<C15993w> f65880d = new ArrayList();

        /* renamed from: e */
        private C15975r.C15978c f65881e = C16279b.m97651e(C15975r.f65777a);

        /* renamed from: f */
        private boolean f65882f = true;

        /* renamed from: g */
        private C15901b f65883g;

        /* renamed from: h */
        private boolean f65884h;

        /* renamed from: i */
        private boolean f65885i;

        /* renamed from: j */
        private C15967n f65886j;

        /* renamed from: k */
        private C15972q f65887k;

        /* renamed from: l */
        private Proxy f65888l;

        /* renamed from: m */
        private ProxySelector f65889m;

        /* renamed from: n */
        private C15901b f65890n;

        /* renamed from: o */
        private SocketFactory f65891o;

        /* renamed from: p */
        private SSLSocketFactory f65892p;

        /* renamed from: q */
        private X509TrustManager f65893q;

        /* renamed from: r */
        private List<C15962l> f65894r;

        /* renamed from: s */
        private List<? extends C15899a0> f65895s;

        /* renamed from: t */
        private HostnameVerifier f65896t;

        /* renamed from: u */
        private C15925g f65897u;

        /* renamed from: v */
        private C11095c f65898v;

        /* renamed from: w */
        private int f65899w;

        /* renamed from: x */
        private int f65900x;

        /* renamed from: y */
        private int f65901y;

        /* renamed from: z */
        private int f65902z;

        public C16003a() {
            C15901b bVar = C15901b.f65410a;
            this.f65883g = bVar;
            this.f65884h = true;
            this.f65885i = true;
            this.f65886j = C15967n.f65765a;
            this.f65887k = C15972q.f65775a;
            this.f65890n = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C13706o.m87928e(socketFactory, "SocketFactory.getDefault()");
            this.f65891o = socketFactory;
            C16004b bVar2 = C16002z.f65844W;
            this.f65894r = bVar2.mo76400a();
            this.f65895s = bVar2.mo76401b();
            this.f65896t = C11097d.f54015a;
            this.f65897u = C15925g.f65494c;
            this.f65900x = SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE;
            this.f65901y = SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE;
            this.f65902z = SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE;
            this.f65875B = FileUtils.ONE_KB;
        }

        /* renamed from: A */
        public final Proxy mo76359A() {
            return this.f65888l;
        }

        /* renamed from: B */
        public final C15901b mo76360B() {
            return this.f65890n;
        }

        /* renamed from: C */
        public final ProxySelector mo76361C() {
            return this.f65889m;
        }

        /* renamed from: D */
        public final int mo76362D() {
            return this.f65901y;
        }

        /* renamed from: E */
        public final boolean mo76363E() {
            return this.f65882f;
        }

        /* renamed from: F */
        public final C15954i mo76364F() {
            return this.f65876C;
        }

        /* renamed from: G */
        public final SocketFactory mo76365G() {
            return this.f65891o;
        }

        /* renamed from: H */
        public final SSLSocketFactory mo76366H() {
            return this.f65892p;
        }

        /* renamed from: I */
        public final int mo76367I() {
            return this.f65902z;
        }

        /* renamed from: J */
        public final X509TrustManager mo76368J() {
            return this.f65893q;
        }

        /* renamed from: K */
        public final C16003a mo76369K(HostnameVerifier hostnameVerifier) {
            C13706o.m87929f(hostnameVerifier, "hostnameVerifier");
            if (!C13706o.m87924a(hostnameVerifier, this.f65896t)) {
                this.f65876C = null;
            }
            this.f65896t = hostnameVerifier;
            return this;
        }

        /* renamed from: L */
        public final C16003a mo76370L(long j, TimeUnit timeUnit) {
            C13706o.m87929f(timeUnit, "unit");
            this.f65901y = C16279b.m97654h("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: M */
        public final C16003a mo76371M(boolean z) {
            this.f65882f = z;
            return this;
        }

        /* renamed from: N */
        public final C16003a mo76372N(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            C13706o.m87929f(sSLSocketFactory, "sslSocketFactory");
            C13706o.m87929f(x509TrustManager, "trustManager");
            if ((!C13706o.m87924a(sSLSocketFactory, this.f65892p)) || (!C13706o.m87924a(x509TrustManager, this.f65893q))) {
                this.f65876C = null;
            }
            this.f65892p = sSLSocketFactory;
            this.f65898v = C11095c.f54014a.mo62216a(x509TrustManager);
            this.f65893q = x509TrustManager;
            return this;
        }

        /* renamed from: O */
        public final C16003a mo76373O(long j, TimeUnit timeUnit) {
            C13706o.m87929f(timeUnit, "unit");
            this.f65902z = C16279b.m97654h("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public final C16003a mo76374a(C15993w wVar) {
            C13706o.m87929f(wVar, "interceptor");
            this.f65879c.add(wVar);
            return this;
        }

        /* renamed from: b */
        public final C16003a mo76375b(C15901b bVar) {
            C13706o.m87929f(bVar, "authenticator");
            this.f65883g = bVar;
            return this;
        }

        /* renamed from: c */
        public final C16002z mo76376c() {
            return new C16002z(this);
        }

        /* renamed from: d */
        public final C16003a mo76377d(long j, TimeUnit timeUnit) {
            C13706o.m87929f(timeUnit, "unit");
            this.f65899w = C16279b.m97654h("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: e */
        public final C16003a mo76378e(long j, TimeUnit timeUnit) {
            C13706o.m87929f(timeUnit, "unit");
            this.f65900x = C16279b.m97654h("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: f */
        public final C16003a mo76379f(boolean z) {
            this.f65884h = z;
            return this;
        }

        /* renamed from: g */
        public final C15901b mo76380g() {
            return this.f65883g;
        }

        /* renamed from: h */
        public final C15906c mo76381h() {
            return null;
        }

        /* renamed from: i */
        public final int mo76382i() {
            return this.f65899w;
        }

        /* renamed from: j */
        public final C11095c mo76383j() {
            return this.f65898v;
        }

        /* renamed from: k */
        public final C15925g mo76384k() {
            return this.f65897u;
        }

        /* renamed from: l */
        public final int mo76385l() {
            return this.f65900x;
        }

        /* renamed from: m */
        public final C15961k mo76386m() {
            return this.f65878b;
        }

        /* renamed from: n */
        public final List<C15962l> mo76387n() {
            return this.f65894r;
        }

        /* renamed from: o */
        public final C15967n mo76388o() {
            return this.f65886j;
        }

        /* renamed from: p */
        public final C15971p mo76389p() {
            return this.f65877a;
        }

        /* renamed from: q */
        public final C15972q mo76390q() {
            return this.f65887k;
        }

        /* renamed from: r */
        public final C15975r.C15978c mo76391r() {
            return this.f65881e;
        }

        /* renamed from: s */
        public final boolean mo76392s() {
            return this.f65884h;
        }

        /* renamed from: t */
        public final boolean mo76393t() {
            return this.f65885i;
        }

        /* renamed from: u */
        public final HostnameVerifier mo76394u() {
            return this.f65896t;
        }

        /* renamed from: v */
        public final List<C15993w> mo76395v() {
            return this.f65879c;
        }

        /* renamed from: w */
        public final long mo76396w() {
            return this.f65875B;
        }

        /* renamed from: x */
        public final List<C15993w> mo76397x() {
            return this.f65880d;
        }

        /* renamed from: y */
        public final int mo76398y() {
            return this.f65874A;
        }

        /* renamed from: z */
        public final List<C15899a0> mo76399z() {
            return this.f65895s;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, mo71668d2 = {"Lokhttp3/z$b;", "", "", "Lokhttp3/a0;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lokhttp3/l;", "DEFAULT_CONNECTION_SPECS", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.z$b */
    /* compiled from: OkHttpClient.kt */
    public static final class C16004b {
        private C16004b() {
        }

        public /* synthetic */ C16004b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final List<C15962l> mo76400a() {
            return C16002z.f65843V;
        }

        /* renamed from: b */
        public final List<C15899a0> mo76401b() {
            return C16002z.f65842U;
        }
    }

    public C16002z(C16003a aVar) {
        ProxySelector proxySelector;
        C13706o.m87929f(aVar, "builder");
        this.f65865a = aVar.mo76389p();
        this.f65866c = aVar.mo76386m();
        this.f65867d = C16279b.m97639O(aVar.mo76395v());
        this.f65868f = C16279b.m97639O(aVar.mo76397x());
        this.f65869g = aVar.mo76391r();
        this.f65870o = aVar.mo76363E();
        this.f65871p = aVar.mo76380g();
        this.f65872s = aVar.mo76392s();
        this.f65873z = aVar.mo76393t();
        this.f65845A = aVar.mo76388o();
        aVar.mo76381h();
        this.f65846B = aVar.mo76390q();
        this.f65847C = aVar.mo76359A();
        if (aVar.mo76359A() != null) {
            proxySelector = C17090a.f68651a;
        } else {
            proxySelector = aVar.mo76361C();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C17090a.f68651a;
            }
        }
        this.f65848D = proxySelector;
        this.f65849E = aVar.mo76360B();
        this.f65850F = aVar.mo76365G();
        List<C15962l> n = aVar.mo76387n();
        this.f65853I = n;
        this.f65854J = aVar.mo76399z();
        this.f65855K = aVar.mo76394u();
        this.f65858N = aVar.mo76382i();
        this.f65859O = aVar.mo76385l();
        this.f65860P = aVar.mo76362D();
        this.f65861Q = aVar.mo76367I();
        this.f65862R = aVar.mo76398y();
        this.f65863S = aVar.mo76396w();
        C15954i F = aVar.mo76364F();
        this.f65864T = F == null ? new C15954i() : F;
        boolean z = true;
        if (!(n instanceof Collection) || !n.isEmpty()) {
            Iterator<T> it = n.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C15962l) it.next()).mo76169f()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f65851G = null;
            this.f65857M = null;
            this.f65852H = null;
            this.f65856L = C15925g.f65494c;
        } else if (aVar.mo76366H() != null) {
            this.f65851G = aVar.mo76366H();
            C11095c j = aVar.mo76383j();
            C13706o.m87926c(j);
            this.f65857M = j;
            X509TrustManager J = aVar.mo76368J();
            C13706o.m87926c(J);
            this.f65852H = J;
            C15925g k = aVar.mo76384k();
            C13706o.m87926c(j);
            this.f65856L = k.mo76036e(j);
        } else {
            C16926h.C16927a aVar2 = C16926h.f68190c;
            X509TrustManager o = aVar2.mo80117g().mo80097o();
            this.f65852H = o;
            C16926h g = aVar2.mo80117g();
            C13706o.m87926c(o);
            this.f65851G = g.mo80100n(o);
            C11095c.C11096a aVar3 = C11095c.f54014a;
            C13706o.m87926c(o);
            C11095c a = aVar3.mo62216a(o);
            this.f65857M = a;
            C15925g k2 = aVar.mo76384k();
            C13706o.m87926c(a);
            this.f65856L = k2.mo76036e(a);
        }
        m96416J();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m96416J() {
        /*
            r4 = this;
            java.util.List<okhttp3.w> r0 = r4.f65867d
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            java.util.Objects.requireNonNull(r0, r1)
            r2 = 0
            boolean r0 = r0.contains(r2)
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00e1
            java.util.List<okhttp3.w> r0 = r4.f65868f
            java.util.Objects.requireNonNull(r0, r1)
            boolean r0 = r0.contains(r2)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00c4
            java.util.List<okhttp3.l> r0 = r4.f65853I
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x002b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002b
        L_0x0029:
            r0 = 1
            goto L_0x0042
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()
            okhttp3.l r1 = (okhttp3.C15962l) r1
            boolean r1 = r1.mo76169f()
            if (r1 == 0) goto L_0x002f
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x0093
            javax.net.ssl.SSLSocketFactory r0 = r4.f65851G
            if (r0 != 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x0089
            ad.c r0 = r4.f65857M
            if (r0 != 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x007f
            javax.net.ssl.X509TrustManager r0 = r4.f65852H
            if (r0 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x0075
            okhttp3.g r0 = r4.f65856L
            okhttp3.g r2 = okhttp3.C15925g.f65494c
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r0, r2)
            if (r0 == 0) goto L_0x006b
            goto L_0x009f
        L_0x006b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0075:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x007f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0093:
            javax.net.ssl.SSLSocketFactory r0 = r4.f65851G
            if (r0 == 0) goto L_0x00b8
            ad.c r0 = r4.f65857M
            if (r0 == 0) goto L_0x00ac
            javax.net.ssl.X509TrustManager r0 = r4.f65852H
            if (r0 == 0) goto L_0x00a0
        L_0x009f:
            return
        L_0x00a0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "x509TrustManager == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "certificateChainCleaner == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sslSocketFactory == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null network interceptor: "
            r0.append(r1)
            java.util.List<okhttp3.w> r1 = r4.f65868f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00e1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Null interceptor: "
            r0.append(r1)
            java.util.List<okhttp3.w> r1 = r4.f65867d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C16002z.m96416J():void");
    }

    /* renamed from: A */
    public final Proxy mo76331A() {
        return this.f65847C;
    }

    /* renamed from: B */
    public final C15901b mo76332B() {
        return this.f65849E;
    }

    /* renamed from: C */
    public final ProxySelector mo76333C() {
        return this.f65848D;
    }

    /* renamed from: D */
    public final int mo76334D() {
        return this.f65860P;
    }

    /* renamed from: E */
    public final boolean mo76335E() {
        return this.f65870o;
    }

    /* renamed from: G */
    public final SocketFactory mo76336G() {
        return this.f65850F;
    }

    /* renamed from: H */
    public final SSLSocketFactory mo76337H() {
        SSLSocketFactory sSLSocketFactory = this.f65851G;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: K */
    public final int mo76338K() {
        return this.f65861Q;
    }

    /* renamed from: a */
    public C15917e mo76008a(C15904b0 b0Var) {
        C13706o.m87929f(b0Var, "request");
        return new C15942e(this, b0Var, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: d */
    public final C15901b mo76340d() {
        return this.f65871p;
    }

    /* renamed from: e */
    public final C15906c mo76341e() {
        return null;
    }

    /* renamed from: f */
    public final int mo76342f() {
        return this.f65858N;
    }

    /* renamed from: g */
    public final C15925g mo76343g() {
        return this.f65856L;
    }

    /* renamed from: h */
    public final int mo76344h() {
        return this.f65859O;
    }

    /* renamed from: k */
    public final C15961k mo76345k() {
        return this.f65866c;
    }

    /* renamed from: l */
    public final List<C15962l> mo76346l() {
        return this.f65853I;
    }

    /* renamed from: n */
    public final C15967n mo76347n() {
        return this.f65845A;
    }

    /* renamed from: o */
    public final C15971p mo76348o() {
        return this.f65865a;
    }

    /* renamed from: p */
    public final C15972q mo76349p() {
        return this.f65846B;
    }

    /* renamed from: q */
    public final C15975r.C15978c mo76350q() {
        return this.f65869g;
    }

    /* renamed from: r */
    public final boolean mo76351r() {
        return this.f65872s;
    }

    /* renamed from: s */
    public final boolean mo76352s() {
        return this.f65873z;
    }

    /* renamed from: t */
    public final C15954i mo76353t() {
        return this.f65864T;
    }

    /* renamed from: u */
    public final HostnameVerifier mo76354u() {
        return this.f65855K;
    }

    /* renamed from: v */
    public final List<C15993w> mo76355v() {
        return this.f65867d;
    }

    /* renamed from: x */
    public final List<C15993w> mo76356x() {
        return this.f65868f;
    }

    /* renamed from: y */
    public final int mo76357y() {
        return this.f65862R;
    }

    /* renamed from: z */
    public final List<C15899a0> mo76358z() {
        return this.f65854J;
    }

    public C16002z() {
        this(new C16003a());
    }
}

package p435xc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;
import okhttp3.C16002z;
import org.apache.http.conn.ssl.SSLSocketFactory;
import p212ad.C11092a;
import p212ad.C11094b;
import p212ad.C11095c;
import p212ad.C11098e;
import p226cd.C11179b;
import p443yc.C17017c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J&\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u001a\u0010\"\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0010\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020\bH\u0016¨\u0006."}, mo71668d2 = {"Lxc/h;", "", "Ljavax/net/ssl/SSLContext;", "m", "Ljavax/net/ssl/X509TrustManager;", "o", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lja/u;", "e", "b", "g", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "f", "message", "level", "", "t", "j", "", "i", "closer", "h", "stackTrace", "l", "trustManager", "Lad/c;", "c", "Lad/e;", "d", "Ljavax/net/ssl/SSLSocketFactory;", "n", "toString", "<init>", "()V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: xc.h */
/* compiled from: Platform.kt */
public class C16926h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile C16926h f68188a;

    /* renamed from: b */
    private static final Logger f68189b = Logger.getLogger(C16002z.class.getName());

    /* renamed from: c */
    public static final C16927a f68190c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00188\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, mo71668d2 = {"Lxc/h$a;", "", "Lxc/h;", "f", "d", "e", "g", "", "Lokhttp3/a0;", "protocols", "", "b", "", "c", "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "platform", "Lxc/h;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: xc.h$a */
    /* compiled from: Platform.kt */
    public static final class C16927a {
        private C16927a() {
        }

        public /* synthetic */ C16927a(C13695i iVar) {
            this();
        }

        /* renamed from: d */
        private final C16926h m100037d() {
            C17017c.f68401c.mo80256b();
            C16926h a = C16909a.f68159f.mo80085a();
            if (a != null) {
                return a;
            }
            C16926h a2 = C16911b.f68162g.mo80091a();
            C13706o.m87926c(a2);
            return a2;
        }

        /* renamed from: e */
        private final C16926h m100038e() {
            C16924g a;
            C16914c a2;
            C16916d b;
            if (m100041j() && (b = C16916d.f68171f.mo80102b()) != null) {
                return b;
            }
            if (m100040i() && (a2 = C16914c.f68168f.mo80098a()) != null) {
                return a2;
            }
            if (m100042k() && (a = C16924g.f68186f.mo80111a()) != null) {
                return a;
            }
            C16922f a3 = C16922f.f68184e.mo80109a();
            if (a3 != null) {
                return a3;
            }
            C16926h a4 = C16919e.f68174i.mo80108a();
            if (a4 != null) {
                return a4;
            }
            return new C16926h();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final C16926h m100039f() {
            if (mo80118h()) {
                return m100037d();
            }
            return m100038e();
        }

        /* renamed from: i */
        private final boolean m100040i() {
            Provider provider = Security.getProviders()[0];
            C13706o.m87928e(provider, "Security.getProviders()[0]");
            return C13706o.m87924a("BC", provider.getName());
        }

        /* renamed from: j */
        private final boolean m100041j() {
            Provider provider = Security.getProviders()[0];
            C13706o.m87928e(provider, "Security.getProviders()[0]");
            return C13706o.m87924a("Conscrypt", provider.getName());
        }

        /* renamed from: k */
        private final boolean m100042k() {
            Provider provider = Security.getProviders()[0];
            C13706o.m87928e(provider, "Security.getProviders()[0]");
            return C13706o.m87924a("OpenJSSE", provider.getName());
        }

        /* renamed from: b */
        public final List<String> mo80115b(List<? extends C15899a0> list) {
            C13706o.m87929f(list, "protocols");
            ArrayList<C15899a0> arrayList = new ArrayList<>();
            for (T next : list) {
                if (((C15899a0) next) != C15899a0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
            for (C15899a0 a0Var : arrayList) {
                arrayList2.add(a0Var.toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] mo80116c(List<? extends C15899a0> list) {
            C13706o.m87929f(list, "protocols");
            C11179b bVar = new C11179b();
            for (String next : mo80115b(list)) {
                bVar.writeByte(next.length());
                bVar.mo62455s0(next);
            }
            return bVar.mo62461v1();
        }

        /* renamed from: g */
        public final C16926h mo80117g() {
            return C16926h.f68188a;
        }

        /* renamed from: h */
        public final boolean mo80118h() {
            return C13706o.m87924a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        C16927a aVar = new C16927a((C13695i) null);
        f68190c = aVar;
        f68188a = aVar.m100039f();
    }

    /* renamed from: k */
    public static /* synthetic */ void m100022k(C16926h hVar, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            hVar.mo80113j(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    /* renamed from: b */
    public void mo80104b(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
    }

    /* renamed from: c */
    public C11095c mo80081c(X509TrustManager x509TrustManager) {
        C13706o.m87929f(x509TrustManager, "trustManager");
        return new C11092a(mo80087d(x509TrustManager));
    }

    /* renamed from: d */
    public C11098e mo80087d(X509TrustManager x509TrustManager) {
        C13706o.m87929f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C13706o.m87928e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C11094b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo80082e(SSLSocket sSLSocket, String str, List<C15899a0> list) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        C13706o.m87929f(list, "protocols");
    }

    /* renamed from: f */
    public void mo80088f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        C13706o.m87929f(socket, "socket");
        C13706o.m87929f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public String mo80083g(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object mo80089h(String str) {
        C13706o.m87929f(str, "closer");
        if (f68189b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo80084i(String str) {
        C13706o.m87929f(str, "hostname");
        return true;
    }

    /* renamed from: j */
    public void mo80113j(String str, int i, Throwable th) {
        C13706o.m87929f(str, "message");
        f68189b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: l */
    public void mo80090l(String str, Object obj) {
        C13706o.m87929f(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo80113j(str, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext mo80096m() {
        SSLContext instance = SSLContext.getInstance(SSLSocketFactory.TLS);
        C13706o.m87928e(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: n */
    public javax.net.ssl.SSLSocketFactory mo80100n(X509TrustManager x509TrustManager) {
        C13706o.m87929f(x509TrustManager, "trustManager");
        try {
            SSLContext m = mo80096m();
            m.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            javax.net.ssl.SSLSocketFactory socketFactory = m.getSocketFactory();
            C13706o.m87928e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: o */
    public X509TrustManager mo80097o() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        C13706o.m87928e(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        C13706o.m87926c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C13706o.m87928e(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C13706o.m87928e(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}

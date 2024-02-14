package p435xc;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;
import p212ad.C11095c;
import p212ad.C11098e;
import p443yc.C17015b;
import p443yc.C17020f;
import p443yc.C17023g;
import p443yc.C17026h;
import p443yc.C17028i;
import p443yc.C17031j;
import p443yc.C17033k;
import p443yc.C17034l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\"J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u001a\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¨\u0006%"}, mo71668d2 = {"Lxc/b;", "Lxc/h;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lja/u;", "f", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "protocols", "e", "g", "closer", "", "h", "message", "stackTrace", "l", "", "i", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lad/c;", "c", "Lad/e;", "d", "<init>", "()V", "a", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: xc.b */
/* compiled from: AndroidPlatform.kt */
public final class C16911b extends C16926h {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f68161f;

    /* renamed from: g */
    public static final C16912a f68162g = new C16912a((C13695i) null);

    /* renamed from: d */
    private final List<C17033k> f68163d;

    /* renamed from: e */
    private final C17026h f68164e;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo71668d2 = {"Lxc/b$a;", "", "Lxc/h;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: xc.b$a */
    /* compiled from: AndroidPlatform.kt */
    public static final class C16912a {
        private C16912a() {
        }

        public /* synthetic */ C16912a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16926h mo80091a() {
            if (mo80092b()) {
                return new C16911b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo80092b() {
            return C16911b.f68161f;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¨\u0006\u0013"}, mo71668d2 = {"Lxc/b$b;", "Lad/e;", "Ljava/security/cert/X509Certificate;", "cert", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: xc.b$b */
    /* compiled from: AndroidPlatform.kt */
    public static final class C16913b implements C11098e {

        /* renamed from: a */
        private final X509TrustManager f68165a;

        /* renamed from: b */
        private final Method f68166b;

        public C16913b(X509TrustManager x509TrustManager, Method method) {
            C13706o.m87929f(x509TrustManager, "trustManager");
            C13706o.m87929f(method, "findByIssuerAndSignatureMethod");
            this.f68165a = x509TrustManager;
            this.f68166b = method;
        }

        /* renamed from: a */
        public X509Certificate mo62213a(X509Certificate x509Certificate) {
            C13706o.m87929f(x509Certificate, "cert");
            try {
                Object invoke = this.f68166b.invoke(this.f68165a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16913b)) {
                return false;
            }
            C16913b bVar = (C16913b) obj;
            return C13706o.m87924a(this.f68165a, bVar.f68165a) && C13706o.m87924a(this.f68166b, bVar.f68166b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f68165a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f68166b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f68165a + ", findByIssuerAndSignatureMethod=" + this.f68166b + ")";
        }
    }

    static {
        boolean z = false;
        if (C16926h.f68190c.mo80118h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f68161f = z;
    }

    public C16911b() {
        List o = C13614t.m87753o(C17034l.C17035a.m100336b(C17034l.f68421j, (String) null, 1, (Object) null), new C17031j(C17020f.f68404g.mo80261d()), new C17031j(C17028i.f68418b.mo80268a()), new C17031j(C17023g.f68412b.mo80264a()));
        ArrayList arrayList = new ArrayList();
        for (Object next : o) {
            if (((C17033k) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f68163d = arrayList;
        this.f68164e = C17026h.f68413d.mo80267a();
    }

    /* renamed from: c */
    public C11095c mo80081c(X509TrustManager x509TrustManager) {
        C13706o.m87929f(x509TrustManager, "trustManager");
        C17015b a = C17015b.f68396d.mo80254a(x509TrustManager);
        return a != null ? a : super.mo80081c(x509TrustManager);
    }

    /* renamed from: d */
    public C11098e mo80087d(X509TrustManager x509TrustManager) {
        C13706o.m87929f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            C13706o.m87928e(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C16913b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo80087d(x509TrustManager);
        }
    }

    /* renamed from: e */
    public void mo80082e(SSLSocket sSLSocket, String str, List<C15899a0> list) {
        T t;
        C13706o.m87929f(sSLSocket, "sslSocket");
        C13706o.m87929f(list, "protocols");
        Iterator<T> it = this.f68163d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C17033k) t).mo80246a(sSLSocket)) {
                break;
            }
        }
        C17033k kVar = (C17033k) t;
        if (kVar != null) {
            kVar.mo80248c(sSLSocket, str, list);
        }
    }

    /* renamed from: f */
    public void mo80088f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        C13706o.m87929f(socket, "socket");
        C13706o.m87929f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: g */
    public String mo80083g(SSLSocket sSLSocket) {
        T t;
        C13706o.m87929f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f68163d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C17033k) t).mo80246a(sSLSocket)) {
                break;
            }
        }
        C17033k kVar = (C17033k) t;
        if (kVar != null) {
            return kVar.mo80247b(sSLSocket);
        }
        return null;
    }

    /* renamed from: h */
    public Object mo80089h(String str) {
        C13706o.m87929f(str, "closer");
        return this.f68164e.mo80265a(str);
    }

    /* renamed from: i */
    public boolean mo80084i(String str) {
        C13706o.m87929f(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i < 23) {
            return true;
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        C13706o.m87928e(instance, "NetworkSecurityPolicy.getInstance()");
        return instance.isCleartextTrafficPermitted();
    }

    /* renamed from: l */
    public void mo80090l(String str, Object obj) {
        C13706o.m87929f(str, "message");
        if (!this.f68164e.mo80266b(obj)) {
            C16926h.m100022k(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}

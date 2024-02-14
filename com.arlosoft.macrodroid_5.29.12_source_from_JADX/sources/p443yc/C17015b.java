package p443yc;

import android.net.http.X509TrustManagerExtensions;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p212ad.C11095c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014"}, mo71668d2 = {"Lyc/b;", "Lad/c;", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "other", "", "equals", "", "hashCode", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: yc.b */
/* compiled from: AndroidCertificateChainCleaner.kt */
public final class C17015b extends C11095c {

    /* renamed from: d */
    public static final C17016a f68396d = new C17016a((C13695i) null);

    /* renamed from: b */
    private final X509TrustManager f68397b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f68398c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo71668d2 = {"Lyc/b$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lyc/b;", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: yc.b$a */
    /* compiled from: AndroidCertificateChainCleaner.kt */
    public static final class C17016a {
        private C17016a() {
        }

        public /* synthetic */ C17016a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C17015b mo80254a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C13706o.m87929f(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C17015b(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C17015b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C13706o.m87929f(x509TrustManager, "trustManager");
        C13706o.m87929f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f68397b = x509TrustManager;
        this.f68398c = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public List<Certificate> mo62210a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        C13706o.m87929f(list, "chain");
        C13706o.m87929f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f68398c.checkServerTrusted((X509Certificate[]) array, KeyPropertiesCompact.KEY_ALGORITHM_RSA, str);
            C13706o.m87928e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C17015b) && ((C17015b) obj).f68397b == this.f68397b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f68397b);
    }
}

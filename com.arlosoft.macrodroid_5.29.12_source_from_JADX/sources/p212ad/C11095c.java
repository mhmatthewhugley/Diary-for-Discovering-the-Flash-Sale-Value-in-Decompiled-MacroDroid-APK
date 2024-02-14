package p212ad;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p435xc.C16926h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\n"}, mo71668d2 = {"Lad/c;", "", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: ad.c */
/* compiled from: CertificateChainCleaner.kt */
public abstract class C11095c {

    /* renamed from: a */
    public static final C11096a f54014a = new C11096a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo71668d2 = {"Lad/c$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lad/c;", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: ad.c$a */
    /* compiled from: CertificateChainCleaner.kt */
    public static final class C11096a {
        private C11096a() {
        }

        public /* synthetic */ C11096a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C11095c mo62216a(X509TrustManager x509TrustManager) {
            C13706o.m87929f(x509TrustManager, "trustManager");
            return C16926h.f68190c.mo80117g().mo80081c(x509TrustManager);
        }
    }

    /* renamed from: a */
    public abstract List<Certificate> mo62210a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}

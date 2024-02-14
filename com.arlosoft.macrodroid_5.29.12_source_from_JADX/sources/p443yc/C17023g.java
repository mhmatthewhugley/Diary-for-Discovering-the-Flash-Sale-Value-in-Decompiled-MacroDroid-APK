package p443yc;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p435xc.C16914c;
import p435xc.C16926h;
import p443yc.C17031j;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0011"}, mo71668d2 = {"Lyc/g;", "Lyc/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "isSupported", "", "b", "hostname", "", "Lokhttp3/a0;", "protocols", "Lja/u;", "c", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: yc.g */
/* compiled from: BouncyCastleSocketAdapter.kt */
public final class C17023g implements C17033k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C17031j.C17032a f68411a = new C17024a();

    /* renamed from: b */
    public static final C17025b f68412b = new C17025b((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo71668d2 = {"yc/g$a", "Lyc/j$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Lyc/k;", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: yc.g$a */
    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class C17024a implements C17031j.C17032a {
        C17024a() {
        }

        /* renamed from: a */
        public boolean mo80262a(SSLSocket sSLSocket) {
            C13706o.m87929f(sSLSocket, "sslSocket");
            return C16914c.f68168f.mo80099b() && (sSLSocket instanceof BCSSLSocket);
        }

        /* renamed from: b */
        public C17033k mo80263b(SSLSocket sSLSocket) {
            C13706o.m87929f(sSLSocket, "sslSocket");
            return new C17023g();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo71668d2 = {"Lyc/g$b;", "", "Lyc/j$a;", "factory", "Lyc/j$a;", "a", "()Lyc/j$a;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: yc.g$b */
    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class C17025b {
        private C17025b() {
        }

        public /* synthetic */ C17025b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C17031j.C17032a mo80264a() {
            return C17023g.f68411a;
        }
    }

    /* renamed from: a */
    public boolean mo80246a(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    /* renamed from: b */
    public String mo80247b(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: c */
    public void mo80248c(SSLSocket sSLSocket, String str, List<? extends C15899a0> list) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        C13706o.m87929f(list, "protocols");
        if (mo80246a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C13706o.m87928e(parameters, "sslParameters");
            Object[] array = C16926h.f68190c.mo80115b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    public boolean isSupported() {
        return C16914c.f68168f.mo80099b();
    }
}

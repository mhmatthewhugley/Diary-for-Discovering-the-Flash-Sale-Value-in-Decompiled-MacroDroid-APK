package p381rc;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15898a;
import okhttp3.C15901b;
import okhttp3.C15904b0;
import okhttp3.C15915d0;
import okhttp3.C15924f0;
import okhttp3.C15932h;
import okhttp3.C15970o;
import okhttp3.C15972q;
import okhttp3.C15989v;
import org.apache.http.auth.AUTH;
import org.apache.http.client.params.AuthPolicy;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, mo71668d2 = {"Lrc/b;", "Lokhttp3/b;", "Ljava/net/Proxy;", "Lokhttp3/v;", "url", "Lokhttp3/q;", "dns", "Ljava/net/InetAddress;", "b", "Lokhttp3/f0;", "route", "Lokhttp3/d0;", "response", "Lokhttp3/b0;", "a", "defaultDns", "<init>", "(Lokhttp3/q;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: rc.b */
/* compiled from: JavaNetAuthenticator.kt */
public final class C16381b implements C15901b {

    /* renamed from: d */
    private final C15972q f66932d;

    public C16381b(C15972q qVar) {
        C13706o.m87929f(qVar, "defaultDns");
        this.f66932d = qVar;
    }

    /* renamed from: b */
    private final InetAddress m98130b(Proxy proxy, C15989v vVar, C15972q qVar) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && C16380a.f66931a[type.ordinal()] == 1) {
            return (InetAddress) C13566b0.m87422W(qVar.lookup(vVar.mo76269i()));
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        C13706o.m87928e(address2, "(address() as InetSocketAddress).address");
        return address2;
    }

    /* renamed from: a */
    public C15904b0 mo25163a(C15924f0 f0Var, C15915d0 d0Var) throws IOException {
        Proxy proxy;
        C15972q qVar;
        PasswordAuthentication passwordAuthentication;
        C15898a a;
        C13706o.m87929f(d0Var, "response");
        List<C15932h> f = d0Var.mo75970f();
        C15904b0 y = d0Var.mo75984y();
        C15989v j = y.mo75920j();
        boolean z = d0Var.mo75971g() == 407;
        if (f0Var == null || (proxy = f0Var.mo76026b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C15932h next : f) {
            if (C15176v.m93641v(AuthPolicy.BASIC, next.mo76054c(), true)) {
                if (f0Var == null || (a = f0Var.mo76025a()) == null || (qVar = a.mo75896c()) == null) {
                    qVar = this.f66932d;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    C13706o.m87928e(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m98130b(proxy, j, qVar), inetSocketAddress.getPort(), j.mo76278r(), next.mo76053b(), next.mo76054c(), j.mo76280t(), Authenticator.RequestorType.PROXY);
                } else {
                    String i = j.mo76269i();
                    C13706o.m87928e(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(i, m98130b(proxy, j, qVar), j.mo76274n(), j.mo76278r(), next.mo76053b(), next.mo76054c(), j.mo76280t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z ? AUTH.PROXY_AUTH_RESP : AUTH.WWW_AUTH_RESP;
                    String userName = passwordAuthentication.getUserName();
                    C13706o.m87928e(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    C13706o.m87928e(password, "auth.password");
                    return y.mo75918h().mo75927f(str, C15970o.m96245b(userName, new String(password), next.mo76052a())).mo75923b();
                }
            }
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16381b(C15972q qVar, int i, C13695i iVar) {
        this((i & 1) != 0 ? C15972q.f65775a : qVar);
    }
}

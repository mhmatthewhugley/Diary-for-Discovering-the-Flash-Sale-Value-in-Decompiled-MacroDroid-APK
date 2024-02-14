package p292io.grpc.internal;

import androidx.webkit.ProxyConfig;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p292io.grpc.C12524a0;
import p292io.grpc.C13009x0;
import p292io.grpc.C13011y0;

/* renamed from: io.grpc.internal.r1 */
/* compiled from: ProxyDetectorImpl */
class C12789r1 implements C13011y0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Logger f60171d = Logger.getLogger(C12789r1.class.getName());

    /* renamed from: e */
    private static final C12792c f60172e = new C12790a();

    /* renamed from: f */
    private static final Supplier<ProxySelector> f60173f = new C12791b();

    /* renamed from: a */
    private final Supplier<ProxySelector> f60174a;

    /* renamed from: b */
    private final C12792c f60175b;

    /* renamed from: c */
    private final InetSocketAddress f60176c;

    /* renamed from: io.grpc.internal.r1$a */
    /* compiled from: ProxyDetectorImpl */
    class C12790a implements C12792c {
        C12790a() {
        }

        /* renamed from: a */
        public PasswordAuthentication mo69536a(String str, InetAddress inetAddress, int i, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i, "");
            } catch (MalformedURLException unused) {
                C12789r1.f60171d.log(Level.WARNING, String.format("failed to create URL for Authenticator: %s %s", new Object[]{str2, str}));
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* renamed from: io.grpc.internal.r1$b */
    /* compiled from: ProxyDetectorImpl */
    class C12791b implements Supplier<ProxySelector> {
        C12791b() {
        }

        /* renamed from: a */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* renamed from: io.grpc.internal.r1$c */
    /* compiled from: ProxyDetectorImpl */
    interface C12792c {
        /* renamed from: a */
        PasswordAuthentication mo69536a(String str, InetAddress inetAddress, int i, String str2, String str3, String str4);
    }

    public C12789r1() {
        this(f60173f, f60172e, System.getenv("GRPC_PROXY_EXP"));
    }

    /* renamed from: c */
    private C13009x0 m84527c(InetSocketAddress inetSocketAddress) throws IOException {
        String str = null;
        try {
            try {
                URI uri = new URI(ProxyConfig.MATCH_HTTPS, (String) null, C12749o0.m84363e(inetSocketAddress), inetSocketAddress.getPort(), (String) null, (String) null, (String) null);
                ProxySelector proxySelector = this.f60174a.get();
                if (proxySelector == null) {
                    f60171d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f60171d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a = this.f60175b.mo69536a(C12749o0.m84363e(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), ProxyConfig.MATCH_HTTPS, "", (String) null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C12524a0.C12526b c = C12524a0.m83648d().mo69045d(inetSocketAddress).mo69044c(inetSocketAddress2);
                if (a == null) {
                    return c.mo69042a();
                }
                C12524a0.C12526b e = c.mo69046e(a.getUserName());
                if (a.getPassword() != null) {
                    str = new String(a.getPassword());
                }
                return e.mo69043b(str).mo69042a();
            } catch (URISyntaxException e2) {
                f60171d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", e2);
                return null;
            }
        } catch (Throwable th) {
            f60171d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    /* renamed from: d */
    private static InetSocketAddress m84528d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int i = 80;
        if (split.length > 1) {
            i = Integer.parseInt(split[1]);
        }
        f60171d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], i);
    }

    /* renamed from: a */
    public C13009x0 mo69481a(SocketAddress socketAddress) throws IOException {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        if (this.f60176c != null) {
            return C12524a0.m83648d().mo69044c(this.f60176c).mo69045d((InetSocketAddress) socketAddress).mo69042a();
        }
        return m84527c((InetSocketAddress) socketAddress);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.base.Supplier<java.net.ProxySelector>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.common.annotations.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C12789r1(com.google.common.base.Supplier<java.net.ProxySelector> r1, p292io.grpc.internal.C12789r1.C12792c r2, java.lang.String r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.m5392s(r1)
            com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
            r0.f60174a = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.m5392s(r2)
            io.grpc.internal.r1$c r1 = (p292io.grpc.internal.C12789r1.C12792c) r1
            r0.f60175b = r1
            if (r3 == 0) goto L_0x001c
            java.net.InetSocketAddress r1 = m84528d(r3)
            r0.f60176c = r1
            goto L_0x001f
        L_0x001c:
            r1 = 0
            r0.f60176c = r1
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12789r1.<init>(com.google.common.base.Supplier, io.grpc.internal.r1$c, java.lang.String):void");
    }
}

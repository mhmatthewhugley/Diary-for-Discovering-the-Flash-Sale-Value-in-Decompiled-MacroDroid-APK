package p110j0;

import java.security.AccessController;
import java.security.Provider;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: j0.c */
/* compiled from: JSSEProvider */
final class C7434c extends Provider {
    public C7434c() {
        super("HarmonyJSSE", 1.0d, "Harmony JSSE Provider");
        AccessController.doPrivileged(new C13247b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Void m30832b() {
        put("SSLContext.TLS", "org.apache.harmony.xnet.provider.jsse.SSLContextImpl");
        put("Alg.Alias.SSLContext.TLSv1", SSLSocketFactory.TLS);
        put("KeyManagerFactory.X509", "org.apache.harmony.xnet.provider.jsse.KeyManagerFactoryImpl");
        put("TrustManagerFactory.X509", "org.apache.harmony.xnet.provider.jsse.TrustManagerFactoryImpl");
        return null;
    }
}

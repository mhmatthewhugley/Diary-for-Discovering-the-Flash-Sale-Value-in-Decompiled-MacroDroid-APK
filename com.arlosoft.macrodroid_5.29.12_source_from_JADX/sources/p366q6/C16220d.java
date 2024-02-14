package p366q6;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;

/* renamed from: q6.d */
/* compiled from: AsyncSSLSocketMiddleware */
public class C16220d extends C16221e {

    /* renamed from: h */
    protected HostnameVerifier f66510h;

    /* renamed from: i */
    protected List<C16219c> f66511i = new ArrayList();

    public C16220d(C16217a aVar) {
        super(aVar, ProxyConfig.MATCH_HTTPS, 443);
    }

    /* renamed from: b */
    public void mo78741b(C16219c cVar) {
        this.f66511i.add(cVar);
    }

    /* renamed from: c */
    public void mo78742c(HostnameVerifier hostnameVerifier) {
        this.f66510h = hostnameVerifier;
    }
}

package p443yc;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, mo71668d2 = {"Lyc/j;", "Lyc/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "d", "", "isSupported", "a", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lja/u;", "c", "b", "Lyc/j$a;", "socketAdapterFactory", "<init>", "(Lyc/j$a;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: yc.j */
/* compiled from: DeferredSocketAdapter.kt */
public final class C17031j implements C17033k {

    /* renamed from: a */
    private C17033k f68419a;

    /* renamed from: b */
    private final C17032a f68420b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, mo71668d2 = {"Lyc/j$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Lyc/k;", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: yc.j$a */
    /* compiled from: DeferredSocketAdapter.kt */
    public interface C17032a {
        /* renamed from: a */
        boolean mo80262a(SSLSocket sSLSocket);

        /* renamed from: b */
        C17033k mo80263b(SSLSocket sSLSocket);
    }

    public C17031j(C17032a aVar) {
        C13706o.m87929f(aVar, "socketAdapterFactory");
        this.f68420b = aVar;
    }

    /* renamed from: d */
    private final synchronized C17033k m100327d(SSLSocket sSLSocket) {
        if (this.f68419a == null && this.f68420b.mo80262a(sSLSocket)) {
            this.f68419a = this.f68420b.mo80263b(sSLSocket);
        }
        return this.f68419a;
    }

    /* renamed from: a */
    public boolean mo80246a(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        return this.f68420b.mo80262a(sSLSocket);
    }

    /* renamed from: b */
    public String mo80247b(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        C17033k d = m100327d(sSLSocket);
        if (d != null) {
            return d.mo80247b(sSLSocket);
        }
        return null;
    }

    /* renamed from: c */
    public void mo80248c(SSLSocket sSLSocket, String str, List<? extends C15899a0> list) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        C13706o.m87929f(list, "protocols");
        C17033k d = m100327d(sSLSocket);
        if (d != null) {
            d.mo80248c(sSLSocket, str, list);
        }
    }

    public boolean isSupported() {
        return true;
    }
}

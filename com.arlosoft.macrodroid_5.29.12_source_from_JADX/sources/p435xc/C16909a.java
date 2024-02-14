package p435xc;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
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
import p443yc.C17013a;
import p443yc.C17015b;
import p443yc.C17020f;
import p443yc.C17023g;
import p443yc.C17028i;
import p443yc.C17031j;
import p443yc.C17033k;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0015"}, mo71668d2 = {"Lxc/a;", "Lxc/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lja/u;", "e", "g", "", "i", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lad/c;", "c", "<init>", "()V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: xc.a */
/* compiled from: Android10Platform.kt */
public final class C16909a extends C16926h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f68158e = (C16926h.f68190c.mo80118h() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: f */
    public static final C16910a f68159f = new C16910a((C13695i) null);

    /* renamed from: d */
    private final List<C17033k> f68160d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo71668d2 = {"Lxc/a$a;", "", "Lxc/h;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: xc.a$a */
    /* compiled from: Android10Platform.kt */
    public static final class C16910a {
        private C16910a() {
        }

        public /* synthetic */ C16910a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16926h mo80085a() {
            if (mo80086b()) {
                return new C16909a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo80086b() {
            return C16909a.f68158e;
        }
    }

    public C16909a() {
        List o = C13614t.m87753o(C17013a.f68395a.mo80250a(), new C17031j(C17020f.f68404g.mo80261d()), new C17031j(C17028i.f68418b.mo80268a()), new C17031j(C17023g.f68412b.mo80264a()));
        ArrayList arrayList = new ArrayList();
        for (Object next : o) {
            if (((C17033k) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f68160d = arrayList;
    }

    /* renamed from: c */
    public C11095c mo80081c(X509TrustManager x509TrustManager) {
        C13706o.m87929f(x509TrustManager, "trustManager");
        C17015b a = C17015b.f68396d.mo80254a(x509TrustManager);
        return a != null ? a : super.mo80081c(x509TrustManager);
    }

    /* renamed from: e */
    public void mo80082e(SSLSocket sSLSocket, String str, List<? extends C15899a0> list) {
        T t;
        C13706o.m87929f(sSLSocket, "sslSocket");
        C13706o.m87929f(list, "protocols");
        Iterator<T> it = this.f68160d.iterator();
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

    /* renamed from: g */
    public String mo80083g(SSLSocket sSLSocket) {
        T t;
        C13706o.m87929f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f68160d.iterator();
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

    /* renamed from: i */
    public boolean mo80084i(String str) {
        C13706o.m87929f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}

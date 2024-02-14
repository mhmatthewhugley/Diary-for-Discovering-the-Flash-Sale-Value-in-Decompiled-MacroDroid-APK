package p443yc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;
import org.apache.commons.p353io.FilenameUtils;
import p435xc.C16911b;
import p435xc.C16926h;
import p443yc.C17031j;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, mo71668d2 = {"Lyc/f;", "Lyc/k;", "", "isSupported", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lja/u;", "c", "b", "Ljava/lang/Class;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: yc.f */
/* compiled from: AndroidSocketAdapter.kt */
public class C17020f implements C17033k {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C17031j.C17032a f68403f;

    /* renamed from: g */
    public static final C17021a f68404g;

    /* renamed from: a */
    private final Method f68405a;

    /* renamed from: b */
    private final Method f68406b;

    /* renamed from: c */
    private final Method f68407c;

    /* renamed from: d */
    private final Method f68408d;

    /* renamed from: e */
    private final Class<? super SSLSocket> f68409e;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo71668d2 = {"Lyc/f$a;", "", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lyc/f;", "b", "", "packageName", "Lyc/j$a;", "c", "playProviderFactory", "Lyc/j$a;", "d", "()Lyc/j$a;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: yc.f$a */
    /* compiled from: AndroidSocketAdapter.kt */
    public static final class C17021a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo71668d2 = {"yc/f$a$a", "Lyc/j$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Lyc/k;", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: yc.f$a$a */
        /* compiled from: AndroidSocketAdapter.kt */
        public static final class C17022a implements C17031j.C17032a {

            /* renamed from: a */
            final /* synthetic */ String f68410a;

            C17022a(String str) {
                this.f68410a = str;
            }

            /* renamed from: a */
            public boolean mo80262a(SSLSocket sSLSocket) {
                C13706o.m87929f(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                C13706o.m87928e(name, "sslSocket.javaClass.name");
                return C15176v.m93634I(name, this.f68410a + FilenameUtils.EXTENSION_SEPARATOR, false, 2, (Object) null);
            }

            /* renamed from: b */
            public C17033k mo80263b(SSLSocket sSLSocket) {
                C13706o.m87929f(sSLSocket, "sslSocket");
                return C17020f.f68404g.m100305b(sSLSocket.getClass());
            }
        }

        private C17021a() {
        }

        public /* synthetic */ C17021a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C17020f m100305b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!C13706o.m87924a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            C13706o.m87926c(cls2);
            return new C17020f(cls2);
        }

        /* renamed from: c */
        public final C17031j.C17032a mo80260c(String str) {
            C13706o.m87929f(str, "packageName");
            return new C17022a(str);
        }

        /* renamed from: d */
        public final C17031j.C17032a mo80261d() {
            return C17020f.f68403f;
        }
    }

    static {
        C17021a aVar = new C17021a((C13695i) null);
        f68404g = aVar;
        f68403f = aVar.mo80260c("com.google.android.gms.org.conscrypt");
    }

    public C17020f(Class<? super SSLSocket> cls) {
        C13706o.m87929f(cls, "sslSocketClass");
        this.f68409e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C13706o.m87928e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f68405a = declaredMethod;
        this.f68406b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f68407c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f68408d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    /* renamed from: a */
    public boolean mo80246a(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        return this.f68409e.isInstance(sSLSocket);
    }

    /* renamed from: b */
    public String mo80247b(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        if (!mo80246a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f68407c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C13706o.m87928e(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e) {
            if (C13706o.m87924a(e.getMessage(), "ssl == null")) {
                return null;
            }
            throw e;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: c */
    public void mo80248c(SSLSocket sSLSocket, String str, List<? extends C15899a0> list) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        C13706o.m87929f(list, "protocols");
        if (mo80246a(sSLSocket)) {
            try {
                this.f68405a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f68406b.invoke(sSLSocket, new Object[]{str});
                }
                this.f68408d.invoke(sSLSocket, new Object[]{C16926h.f68190c.mo80116c(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public boolean isSupported() {
        return C16911b.f68162g.mo80092b();
    }
}

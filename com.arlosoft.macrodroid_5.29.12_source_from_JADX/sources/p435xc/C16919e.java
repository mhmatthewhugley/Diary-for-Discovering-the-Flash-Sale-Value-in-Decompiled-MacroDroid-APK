package p435xc;

import androidx.core.p007os.EnvironmentCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0016\u000bB7\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0017"}, mo71668d2 = {"Lxc/e;", "Lxc/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lja/u;", "e", "b", "g", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: xc.e */
/* compiled from: Jdk8WithJettyBootPlatform.kt */
public final class C16919e extends C16926h {

    /* renamed from: i */
    public static final C16921b f68174i = new C16921b((C13695i) null);

    /* renamed from: d */
    private final Method f68175d;

    /* renamed from: e */
    private final Method f68176e;

    /* renamed from: f */
    private final Method f68177f;

    /* renamed from: g */
    private final Class<?> f68178g;

    /* renamed from: h */
    private final Class<?> f68179h;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo71668d2 = {"Lxc/e$a;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "unsupported", "Z", "b", "()Z", "setUnsupported", "(Z)V", "", "selected", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "", "protocols", "<init>", "(Ljava/util/List;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: xc.e$a */
    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    private static final class C16920a implements InvocationHandler {

        /* renamed from: a */
        private boolean f68180a;

        /* renamed from: b */
        private String f68181b;

        /* renamed from: c */
        private final List<String> f68182c;

        public C16920a(List<String> list) {
            C13706o.m87929f(list, "protocols");
            this.f68182c = list;
        }

        /* renamed from: a */
        public final String mo80105a() {
            return this.f68181b;
        }

        /* renamed from: b */
        public final boolean mo80106b() {
            return this.f68180a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            C13706o.m87929f(obj, "proxy");
            C13706o.m87929f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C13706o.m87924a(name, "supports") && C13706o.m87924a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C13706o.m87924a(name, "unsupported") || !C13706o.m87924a(Void.TYPE, returnType)) {
                if (C13706o.m87924a(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f68182c;
                    }
                }
                if ((C13706o.m87924a(name, "selectProtocol") || C13706o.m87924a(name, "select")) && C13706o.m87924a(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f68182c.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f68181b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f68182c.get(0);
                    this.f68181b = str2;
                    return str2;
                } else if ((!C13706o.m87924a(name, "protocolSelected") && !C13706o.m87924a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.f68181b = (String) obj4;
                    return null;
                }
            } else {
                this.f68180a = true;
                return null;
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, mo71668d2 = {"Lxc/e$b;", "", "Lxc/h;", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: xc.e$b */
    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class C16921b {
        private C16921b() {
        }

        public /* synthetic */ C16921b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16926h mo80108a() {
            String property = System.getProperty("java.specification.version", EnvironmentCompat.MEDIA_UNKNOWN);
            try {
                C13706o.m87928e(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod("remove", new Class[]{SSLSocket.class});
                C13706o.m87928e(method, "putMethod");
                C13706o.m87928e(method2, "getMethod");
                C13706o.m87928e(method3, "removeMethod");
                C13706o.m87928e(cls3, "clientProviderClass");
                C13706o.m87928e(cls4, "serverProviderClass");
                return new C16919e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public C16919e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        C13706o.m87929f(method, "putMethod");
        C13706o.m87929f(method2, "getMethod");
        C13706o.m87929f(method3, "removeMethod");
        C13706o.m87929f(cls, "clientProviderClass");
        C13706o.m87929f(cls2, "serverProviderClass");
        this.f68175d = method;
        this.f68176e = method2;
        this.f68177f = method3;
        this.f68178g = cls;
        this.f68179h = cls2;
    }

    /* renamed from: b */
    public void mo80104b(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        try {
            this.f68177f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    /* renamed from: e */
    public void mo80082e(SSLSocket sSLSocket, String str, List<? extends C15899a0> list) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        C13706o.m87929f(list, "protocols");
        List<String> b = C16926h.f68190c.mo80115b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C16926h.class.getClassLoader(), new Class[]{this.f68178g, this.f68179h}, new C16920a(b));
            this.f68175d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    /* renamed from: g */
    public String mo80083g(SSLSocket sSLSocket) {
        C13706o.m87929f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f68176e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                C16920a aVar = (C16920a) invocationHandler;
                if (!aVar.mo80106b() && aVar.mo80105a() == null) {
                    C16926h.m100022k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (aVar.mo80106b()) {
                    return null;
                } else {
                    return aVar.mo80105a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}

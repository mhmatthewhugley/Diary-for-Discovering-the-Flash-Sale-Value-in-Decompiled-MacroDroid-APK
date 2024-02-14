package p436xd;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.Enumeration;
import p282he.C12441a;
import p321le.C15633d;

/* renamed from: xd.e */
/* compiled from: PluginLoader */
class C16932e {

    /* renamed from: a */
    private final C16928a f68193a = new C16928a();

    /* renamed from: b */
    private final C15633d f68194b;

    /* renamed from: c */
    private String f68195c;

    /* renamed from: xd.e$a */
    /* compiled from: PluginLoader */
    class C16933a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Class f68196a;

        /* renamed from: b */
        final /* synthetic */ Throwable f68197b;

        C16933a(Class cls, Throwable th) {
            this.f68196a = cls;
            this.f68197b = th;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            throw new IllegalStateException("Could not initialize plugin: " + this.f68196a, this.f68197b);
        }
    }

    public C16932e(C15633d dVar) {
        this.f68194b = dVar;
    }

    /* renamed from: a */
    private <T> T m100054a(Class<T> cls) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = ClassLoader.getSystemClassLoader();
        }
        try {
            Enumeration<URL> resources = contextClassLoader.getResources("mockito-extensions/" + cls.getName());
            try {
                String a = new C16931d(this.f68194b).mo80122a(C12441a.m83375a(resources));
                if (a == null) {
                    return null;
                }
                if (a.equals(this.f68195c)) {
                    a = this.f68193a.mo80120c(this.f68195c);
                }
                return cls.cast(contextClassLoader.loadClass(a).newInstance());
            } catch (Exception e) {
                throw new IllegalStateException("Failed to load " + cls + " implementation declared in " + resources, e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Failed to load " + cls, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> T mo80123b(Class<T> cls) {
        try {
            T a = m100054a(cls);
            if (a != null) {
                return a;
            }
            return this.f68193a.mo80119b(cls);
        } catch (Throwable th) {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C16933a(cls, th));
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: c */
    public C16932e mo80124c(String str) {
        this.f68195c = str;
        return this;
    }
}

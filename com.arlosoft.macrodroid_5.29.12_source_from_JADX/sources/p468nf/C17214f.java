package p468nf;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nf.f */
/* compiled from: RxJavaPlugins */
public class C17214f {

    /* renamed from: f */
    private static final C17214f f68767f = new C17214f();

    /* renamed from: g */
    static final C17194b f68768g = new C17215a();

    /* renamed from: a */
    private final AtomicReference<C17194b> f68769a = new AtomicReference<>();

    /* renamed from: b */
    private final AtomicReference<C17212d> f68770b = new AtomicReference<>();

    /* renamed from: c */
    private final AtomicReference<C17218h> f68771c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<C17193a> f68772d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicReference<C17217g> f68773e = new AtomicReference<>();

    /* renamed from: nf.f$a */
    /* compiled from: RxJavaPlugins */
    static class C17215a extends C17194b {
        C17215a() {
        }
    }

    /* renamed from: nf.f$b */
    /* compiled from: RxJavaPlugins */
    class C17216b extends C17193a {
        C17216b() {
        }
    }

    C17214f() {
    }

    @Deprecated
    /* renamed from: c */
    public static C17214f m100769c() {
        return f68767f;
    }

    /* renamed from: e */
    static Object m100770e(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            Iterator it = properties2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String obj = entry.getKey().toString();
                if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String str = "rxjava.plugin." + obj.substring(0, obj.length() - 6).substring(14) + ".impl";
                    String property2 = properties2.getProperty(str);
                    if (property2 != null) {
                        property = property2;
                    } else {
                        throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e) {
            throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException(simpleName + " implementation class not found: " + property, e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(simpleName + " implementation not able to be instantiated: " + property, e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(simpleName + " implementation not able to be accessed: " + property, e4);
        }
    }

    /* renamed from: a */
    public C17193a mo80506a() {
        if (this.f68772d.get() == null) {
            Object e = m100770e(C17193a.class, System.getProperties());
            if (e == null) {
                this.f68772d.compareAndSet((Object) null, new C17216b());
            } else {
                this.f68772d.compareAndSet((Object) null, (C17193a) e);
            }
        }
        return this.f68772d.get();
    }

    /* renamed from: b */
    public C17194b mo80507b() {
        if (this.f68769a.get() == null) {
            Object e = m100770e(C17194b.class, System.getProperties());
            if (e == null) {
                this.f68769a.compareAndSet((Object) null, f68768g);
            } else {
                this.f68769a.compareAndSet((Object) null, (C17194b) e);
            }
        }
        return this.f68769a.get();
    }

    /* renamed from: d */
    public C17212d mo80508d() {
        if (this.f68770b.get() == null) {
            Object e = m100770e(C17212d.class, System.getProperties());
            if (e == null) {
                this.f68770b.compareAndSet((Object) null, C17213e.m100768f());
            } else {
                this.f68770b.compareAndSet((Object) null, (C17212d) e);
            }
        }
        return this.f68770b.get();
    }

    /* renamed from: f */
    public C17217g mo80509f() {
        if (this.f68773e.get() == null) {
            Object e = m100770e(C17217g.class, System.getProperties());
            if (e == null) {
                this.f68773e.compareAndSet((Object) null, C17217g.m100782h());
            } else {
                this.f68773e.compareAndSet((Object) null, (C17217g) e);
            }
        }
        return this.f68773e.get();
    }

    /* renamed from: g */
    public C17218h mo80510g() {
        if (this.f68771c.get() == null) {
            Object e = m100770e(C17218h.class, System.getProperties());
            if (e == null) {
                this.f68771c.compareAndSet((Object) null, C17219i.m100792f());
            } else {
                this.f68771c.compareAndSet((Object) null, (C17218h) e);
            }
        }
        return this.f68771c.get();
    }
}

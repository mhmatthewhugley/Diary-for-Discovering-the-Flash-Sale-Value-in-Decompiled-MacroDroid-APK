package p422w8;

import p287ia.C12478a;

/* renamed from: w8.a */
/* compiled from: DoubleCheck */
public final class C16778a<T> implements C12478a<T> {

    /* renamed from: c */
    private static final Object f67755c = new Object();

    /* renamed from: a */
    private volatile C12478a<T> f67756a;

    /* renamed from: b */
    private volatile Object f67757b = f67755c;

    private C16778a(C12478a<T> aVar) {
        this.f67756a = aVar;
    }

    /* renamed from: a */
    public static <P extends C12478a<T>, T> C12478a<T> m99511a(P p) {
        C16779b.m99513a(p);
        if (p instanceof C16778a) {
            return p;
        }
        return new C16778a(p);
    }

    /* renamed from: b */
    public static Object m99512b(Object obj, Object obj2) {
        if (!(obj != f67755c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f67757b;
        T t2 = f67755c;
        if (t == t2) {
            synchronized (this) {
                t = this.f67757b;
                if (t == t2) {
                    t = this.f67756a.get();
                    this.f67757b = m99512b(this.f67757b, t);
                    this.f67756a = null;
                }
            }
        }
        return t;
    }
}

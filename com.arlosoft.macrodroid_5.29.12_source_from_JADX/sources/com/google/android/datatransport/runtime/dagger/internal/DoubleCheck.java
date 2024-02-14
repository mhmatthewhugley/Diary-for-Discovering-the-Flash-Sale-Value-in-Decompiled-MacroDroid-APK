package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import p287ia.C12478a;

public final class DoubleCheck<T> implements C12478a<T>, Lazy<T> {

    /* renamed from: c */
    private static final Object f1409c = new Object();

    /* renamed from: a */
    private volatile C12478a<T> f1410a;

    /* renamed from: b */
    private volatile Object f1411b = f1409c;

    private DoubleCheck(C12478a<T> aVar) {
        this.f1410a = aVar;
    }

    /* renamed from: a */
    public static <P extends C12478a<T>, T> Lazy<T> m1329a(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        return new DoubleCheck((C12478a) Preconditions.m1336b(p));
    }

    /* renamed from: b */
    public static <P extends C12478a<T>, T> C12478a<T> m1330b(P p) {
        Preconditions.m1336b(p);
        if (p instanceof DoubleCheck) {
            return p;
        }
        return new DoubleCheck(p);
    }

    /* renamed from: c */
    public static Object m1331c(Object obj, Object obj2) {
        if (!(obj != f1409c && !(obj instanceof MemoizedSentinel)) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f1411b;
        T t2 = f1409c;
        if (t == t2) {
            synchronized (this) {
                t = this.f1411b;
                if (t == t2) {
                    t = this.f1410a.get();
                    this.f1411b = m1331c(this.f1411b, t);
                    this.f1410a = null;
                }
            }
        }
        return t;
    }
}

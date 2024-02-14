package p242db;

import kotlin.jvm.internal.C13706o;

/* renamed from: db.e */
/* compiled from: ReflectJavaClassFinder.kt */
public final class C11994e {
    /* renamed from: a */
    public static final Class<?> m82405a(ClassLoader classLoader, String str) {
        C13706o.m87929f(classLoader, "<this>");
        C13706o.m87929f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

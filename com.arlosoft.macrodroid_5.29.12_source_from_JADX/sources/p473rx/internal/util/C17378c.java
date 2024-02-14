package p473rx.internal.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: rx.internal.util.c */
/* compiled from: PlatformDependent */
public final class C17378c {

    /* renamed from: a */
    private static final int f69131a;

    /* renamed from: b */
    private static final boolean f69132b;

    /* renamed from: rx.internal.util.c$a */
    /* compiled from: PlatformDependent */
    static class C17379a implements PrivilegedAction<ClassLoader> {
        C17379a() {
        }

        /* renamed from: a */
        public ClassLoader run() {
            return ClassLoader.getSystemClassLoader();
        }
    }

    static {
        int d = m101135d();
        f69131a = d;
        f69132b = d != 0;
    }

    /* renamed from: a */
    public static int m101132a() {
        return f69131a;
    }

    /* renamed from: b */
    static ClassLoader m101133b() {
        if (System.getSecurityManager() == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new C17379a());
    }

    /* renamed from: c */
    public static boolean m101134c() {
        return f69132b;
    }

    /* renamed from: d */
    private static int m101135d() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION", true, m101133b()).getField("SDK_INT").get((Object) null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}

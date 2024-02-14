package com.google.protobuf;

final class Android {

    /* renamed from: a */
    private static final Class<?> f56568a = m79346a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f56569b = (m79346a("org.robolectric.Robolectric") != null);

    Android() {
    }

    /* renamed from: a */
    private static <T> Class<T> m79346a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static Class<?> m79347b() {
        return f56568a;
    }

    /* renamed from: c */
    static boolean m79348c() {
        return f56568a != null && !f56569b;
    }
}

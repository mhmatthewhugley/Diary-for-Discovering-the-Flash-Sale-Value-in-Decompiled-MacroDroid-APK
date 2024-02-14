package com.google.android.gms.internal.places;

final class zzp {

    /* renamed from: a */
    private static final Class<?> f45461a = m63834a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f45462b = (m63834a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m63834a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m63835b() {
        return f45461a != null && !f45462b;
    }

    /* renamed from: c */
    static Class<?> m63836c() {
        return f45461a;
    }
}

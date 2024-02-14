package com.google.android.gms.internal.places;

final class zzaq {

    /* renamed from: a */
    private static final Class<?> f45183a = m63255a();

    /* renamed from: a */
    private static Class<?> m63255a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static zzap m63256b() {
        Class<?> cls = f45183a;
        if (cls != null) {
            try {
                return (zzap) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return zzap.f45179d;
    }
}

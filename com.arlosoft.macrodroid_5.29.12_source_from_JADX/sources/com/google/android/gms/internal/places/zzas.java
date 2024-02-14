package com.google.android.gms.internal.places;

final class zzas {

    /* renamed from: a */
    private static final zzar<?> f45184a = new zzat();

    /* renamed from: b */
    private static final zzar<?> f45185b = m63264a();

    /* renamed from: a */
    private static zzar<?> m63264a() {
        try {
            return (zzar) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static zzar<?> m63265b() {
        return f45184a;
    }

    /* renamed from: c */
    static zzar<?> m63266c() {
        zzar<?> zzar = f45185b;
        if (zzar != null) {
            return zzar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}

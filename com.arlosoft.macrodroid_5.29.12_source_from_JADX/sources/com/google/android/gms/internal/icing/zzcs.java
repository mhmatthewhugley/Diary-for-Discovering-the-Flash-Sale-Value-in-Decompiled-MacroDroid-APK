package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzcs {

    /* renamed from: a */
    private static final zzcq<?> f40812a = new zzcr();

    /* renamed from: b */
    private static final zzcq<?> f40813b;

    static {
        zzcq<?> zzcq;
        try {
            zzcq = (zzcq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzcq = null;
        }
        f40813b = zzcq;
    }

    /* renamed from: a */
    static zzcq<?> m58775a() {
        return f40812a;
    }

    /* renamed from: b */
    static zzcq<?> m58776b() {
        zzcq<?> zzcq = f40813b;
        if (zzcq != null) {
            return zzcq;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}

package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbm {

    /* renamed from: a */
    private static final zzbk f45564a = new zzbl();

    /* renamed from: b */
    private static final zzbk f45565b;

    static {
        zzbk zzbk;
        try {
            zzbk = (zzbk) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzbk = null;
        }
        f45565b = zzbk;
    }

    /* renamed from: a */
    static zzbk m64165a() {
        zzbk zzbk = f45565b;
        if (zzbk != null) {
            return zzbk;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static zzbk m64166b() {
        return f45564a;
    }
}

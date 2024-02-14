package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzju {

    /* renamed from: a */
    private static final zzjs f41563a = new zzjt();

    /* renamed from: b */
    private static final zzjs f41564b;

    static {
        zzjs zzjs;
        try {
            zzjs = (zzjs) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjs = null;
        }
        f41564b = zzjs;
    }

    /* renamed from: a */
    static zzjs m60471a() {
        zzjs zzjs = f41564b;
        if (zzjs != null) {
            return zzjs;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static zzjs m60472b() {
        return f41563a;
    }
}

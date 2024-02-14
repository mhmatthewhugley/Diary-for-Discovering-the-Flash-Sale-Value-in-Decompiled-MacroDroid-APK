package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzbr implements zzda {

    /* renamed from: a */
    private static final zzbr f45626a = new zzbr();

    private zzbr() {
    }

    /* renamed from: c */
    public static zzbr m64178c() {
        return f45626a;
    }

    /* renamed from: a */
    public final zzcz mo53932a(Class cls) {
        Class<zzbv> cls2 = zzbv.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzcz) zzbv.m64191h(cls.asSubclass(cls2)).mo53945f(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo53933b(Class cls) {
        return zzbv.class.isAssignableFrom(cls);
    }
}

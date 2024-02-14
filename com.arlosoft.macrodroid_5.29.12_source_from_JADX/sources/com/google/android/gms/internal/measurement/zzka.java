package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzka implements zzlk {

    /* renamed from: a */
    private static final zzka f41628a = new zzka();

    private zzka() {
    }

    /* renamed from: c */
    public static zzka m60485c() {
        return f41628a;
    }

    /* renamed from: a */
    public final zzlj mo51436a(Class cls) {
        Class<zzkf> cls2 = zzkf.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzlj) zzkf.m60510z(cls.asSubclass(cls2)).mo50883A(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo51437b(Class cls) {
        return zzkf.class.isAssignableFrom(cls);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgqz implements zzgsm {

    /* renamed from: a */
    private static final zzgqz f37140a = new zzgqz();

    private zzgqz() {
    }

    /* renamed from: c */
    public static zzgqz m52932c() {
        return f37140a;
    }

    /* renamed from: a */
    public final zzgsl mo47298a(Class cls) {
        Class<zzgre> cls2 = zzgre.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzgsl) zzgre.m52986h(cls.asSubclass(cls2)).mo41649D(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo47299b(Class cls) {
        return zzgre.class.isAssignableFrom(cls);
    }
}

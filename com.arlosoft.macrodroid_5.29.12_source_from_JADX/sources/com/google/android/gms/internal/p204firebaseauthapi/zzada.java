package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzada */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzada implements zzaei {

    /* renamed from: a */
    private static final zzada f39739a = new zzada();

    private zzada() {
    }

    /* renamed from: c */
    public static zzada m56411c() {
        return f39739a;
    }

    /* renamed from: a */
    public final zzaeh mo49065a(Class cls) {
        Class<zzadf> cls2 = zzadf.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzaeh) zzadf.m56433x(cls.asSubclass(cls2)).mo49084t(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo49066b(Class cls) {
        return zzadf.class.isAssignableFrom(cls);
    }
}

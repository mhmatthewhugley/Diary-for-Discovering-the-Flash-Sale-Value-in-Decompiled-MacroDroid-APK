package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzado */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum zzado {
    VOID(Void.class, Void.class, (Class) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzacc.class, zzacc.class, zzacc.f39635a),
    ENUM(r1, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    private zzado(Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    /* renamed from: b */
    public final Class mo49100b() {
        return this.zzm;
    }
}

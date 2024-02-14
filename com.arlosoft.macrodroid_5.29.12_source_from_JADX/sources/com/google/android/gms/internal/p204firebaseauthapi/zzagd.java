package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum zzagd {
    DOUBLE(zzage.DOUBLE, 1),
    FLOAT(zzage.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzage.BOOLEAN, 0),
    STRING(zzage.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzage.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzage.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzage zzt;

    private zzagd(zzage zzage, int i) {
        this.zzt = zzage;
    }

    /* renamed from: b */
    public final zzage mo49256b() {
        return this.zzt;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public enum zzguo {
    DOUBLE(zzgup.DOUBLE, 1),
    FLOAT(zzgup.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzgup.BOOLEAN, 0),
    STRING(zzgup.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzgup.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzgup.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzgup zzt;

    private zzguo(zzgup zzgup, int i) {
        this.zzt = zzgup;
    }

    /* renamed from: b */
    public final zzgup mo47535b() {
        return this.zzt;
    }
}

package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public enum zzeu {
    DOUBLE(zzev.DOUBLE, 1),
    FLOAT(zzev.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzev.BOOLEAN, 0),
    STRING(zzev.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzev.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzev.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzev zzt;

    private zzeu(zzev zzev, int i) {
        this.zzt = zzev;
    }

    /* renamed from: b */
    public final zzev mo54093b() {
        return this.zzt;
    }
}

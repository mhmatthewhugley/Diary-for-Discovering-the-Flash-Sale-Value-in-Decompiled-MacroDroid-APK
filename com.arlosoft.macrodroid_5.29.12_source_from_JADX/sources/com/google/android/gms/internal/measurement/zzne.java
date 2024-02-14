package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public enum zzne {
    DOUBLE(zznf.DOUBLE, 1),
    FLOAT(zznf.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zznf.BOOLEAN, 0),
    STRING(zznf.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zznf.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zznf.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zznf zzt;

    private zzne(zznf zznf, int i) {
        this.zzt = zznf;
    }

    /* renamed from: b */
    public final zznf mo51613b() {
        return this.zzt;
    }
}

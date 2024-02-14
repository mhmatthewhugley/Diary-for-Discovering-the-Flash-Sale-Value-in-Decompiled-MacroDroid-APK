package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public enum zziu implements zzbj {
    UNKNOWN(0),
    TRANSLATE(1);
    
    private final int zzd;

    private zziu(int i) {
        this.zzd = i;
    }

    /* renamed from: b */
    public static zziu m61370b(int i) {
        for (zziu zziu : values()) {
            if (zziu.zzd == i) {
                return zziu;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzd;
    }
}

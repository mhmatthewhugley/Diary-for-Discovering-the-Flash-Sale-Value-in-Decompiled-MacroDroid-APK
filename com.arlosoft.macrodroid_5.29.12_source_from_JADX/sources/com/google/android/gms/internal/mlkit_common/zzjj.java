package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public enum zzjj implements zzbj {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);
    
    private final int zzh;

    private zzjj(int i) {
        this.zzh = i;
    }

    public final int zza() {
        return this.zzh;
    }
}

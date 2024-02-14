package com.google.android.gms.internal.mlkit_translate;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public enum zzlo implements zzbe {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);
    
    private final int zzh;

    private zzlo(int i) {
        this.zzh = i;
    }

    public final int zza() {
        return this.zzh;
    }
}

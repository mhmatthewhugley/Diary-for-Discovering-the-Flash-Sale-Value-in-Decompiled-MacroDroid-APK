package com.google.android.gms.nearby.exposurenotification;

import com.google.android.gms.internal.nearby.zztl;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public enum zzh {
    LOWEST_CONFIDENCE(0),
    LOW_CONFIDENCE(1),
    MEDIUM_CONFIDENCE(2),
    HIGH_CONFIDENCE(3);
    

    /* renamed from: g */
    private static final zztl f47614g = null;
    private final int zzg;

    static {
        f47614g = new zzg();
    }

    private zzh(int i) {
        this.zzg = i;
    }

    public final String toString() {
        return Integer.toString(this.zzg);
    }
}

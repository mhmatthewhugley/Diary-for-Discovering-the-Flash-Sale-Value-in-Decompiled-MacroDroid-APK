package com.google.android.gms.nearby.exposurenotification;

import com.google.android.gms.internal.nearby.zztl;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public enum zzj {
    INFECTIOUSNESS_NONE(0),
    INFECTIOUSNESS_STANDARD(1),
    INFECTIOUSNESS_HIGH(2);
    

    /* renamed from: f */
    private static final zztl f47619f = null;
    private final int zzf;

    static {
        f47619f = new zzi();
    }

    private zzj(int i) {
        this.zzf = i;
    }

    public final String toString() {
        return Integer.toString(this.zzf);
    }
}

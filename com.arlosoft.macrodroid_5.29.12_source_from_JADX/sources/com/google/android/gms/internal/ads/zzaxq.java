package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaxq implements zzayq {

    /* renamed from: a */
    private final zzayq[] f26179a;

    public zzaxq(zzayq[] zzayqArr) {
        this.f26179a = zzayqArr;
    }

    /* renamed from: a */
    public final boolean mo42190a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzayq zzayq : this.f26179a) {
                if (zzayq.zza() == zza) {
                    z |= zzayq.mo42190a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long zza() {
        long j = Long.MAX_VALUE;
        for (zzayq zza : this.f26179a) {
            long zza2 = zza.zza();
            if (zza2 != Long.MIN_VALUE) {
                j = Math.min(j, zza2);
            }
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}

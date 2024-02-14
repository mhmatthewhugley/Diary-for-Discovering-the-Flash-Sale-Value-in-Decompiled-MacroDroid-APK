package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzrs implements zzub {

    /* renamed from: a */
    protected final zzub[] f38380a;

    public zzrs(zzub[] zzubArr) {
        this.f38380a = zzubArr;
    }

    /* renamed from: F */
    public final void mo48128F(long j) {
        for (zzub F : this.f38380a) {
            F.mo48128F(j);
        }
    }

    /* renamed from: a */
    public final long mo48129a() {
        long j = Long.MAX_VALUE;
        for (zzub a : this.f38380a) {
            long a2 = a.mo48129a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: b */
    public final boolean mo48130b(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long a = mo48129a();
            if (a != Long.MIN_VALUE) {
                boolean z2 = false;
                for (zzub zzub : this.f38380a) {
                    long a2 = zzub.mo48129a();
                    boolean z3 = a2 != Long.MIN_VALUE && a2 <= j2;
                    if (a2 == a || z3) {
                        z2 |= zzub.mo48130b(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo48138m() {
        for (zzub m : this.f38380a) {
            if (m.mo48138m()) {
                return true;
            }
        }
        return false;
    }

    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzub zzb : this.f38380a) {
            long zzb2 = zzb.zzb();
            if (zzb2 != Long.MIN_VALUE) {
                j = Math.min(j, zzb2);
            }
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}

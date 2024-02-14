package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzkd {

    /* renamed from: c */
    public static final zzkd f37733c;

    /* renamed from: d */
    public static final zzkd f37734d = new zzkd(LocationRequestCompat.PASSIVE_INTERVAL, LocationRequestCompat.PASSIVE_INTERVAL);

    /* renamed from: e */
    public static final zzkd f37735e = new zzkd(LocationRequestCompat.PASSIVE_INTERVAL, 0);

    /* renamed from: f */
    public static final zzkd f37736f = new zzkd(0, LocationRequestCompat.PASSIVE_INTERVAL);

    /* renamed from: g */
    public static final zzkd f37737g;

    /* renamed from: a */
    public final long f37738a;

    /* renamed from: b */
    public final long f37739b;

    static {
        zzkd zzkd = new zzkd(0, 0);
        f37733c = zzkd;
        f37737g = zzkd;
    }

    public zzkd(long j, long j2) {
        boolean z = true;
        zzdd.m47210d(j >= 0);
        zzdd.m47210d(j2 < 0 ? false : z);
        this.f37738a = j;
        this.f37739b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkd.class == obj.getClass()) {
            zzkd zzkd = (zzkd) obj;
            return this.f37738a == zzkd.f37738a && this.f37739b == zzkd.f37739b;
        }
    }

    public final int hashCode() {
        return (((int) this.f37738a) * 31) + ((int) this.f37739b);
    }
}

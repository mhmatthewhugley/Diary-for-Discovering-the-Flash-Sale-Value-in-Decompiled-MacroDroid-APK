package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcxb implements zzgxi {

    /* renamed from: a */
    private final zzgxv f31768a;

    /* renamed from: b */
    private final zzgxv f31769b;

    public zzcxb(zzgxv zzgxv, zzgxv zzgxv2) {
        this.f31768a = zzgxv;
        this.f31769b = zzgxv2;
    }

    /* renamed from: a */
    public final zzdfp zzb() {
        return new zzdfp((ScheduledExecutorService) this.f31768a.zzb(), (Clock) this.f31769b.zzb());
    }
}

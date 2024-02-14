package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzetp implements zzeve {

    /* renamed from: a */
    private final zzeve f34892a;

    /* renamed from: b */
    private final long f34893b;

    /* renamed from: c */
    private final ScheduledExecutorService f34894c;

    public zzetp(zzeve zzeve, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f34892a = zzeve;
        this.f34893b = j;
        this.f34894c = scheduledExecutorService;
    }

    public final int zza() {
        return this.f34892a.zza();
    }

    public final zzfzp zzb() {
        zzfzp zzb = this.f34892a.zzb();
        long j = this.f34893b;
        if (j > 0) {
            zzb = zzfzg.m51420o(zzb, j, TimeUnit.MILLISECONDS, this.f34894c);
        }
        return zzfzg.m51412g(zzb, Throwable.class, zzeto.f34891a, zzchc.f28461f);
    }
}

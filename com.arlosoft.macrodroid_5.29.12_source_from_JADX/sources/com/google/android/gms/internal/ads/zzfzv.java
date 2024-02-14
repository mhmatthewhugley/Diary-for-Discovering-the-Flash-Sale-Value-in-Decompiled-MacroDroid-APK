package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfzv extends zzfzs implements ScheduledExecutorService {

    /* renamed from: c */
    final ScheduledExecutorService f36615c;

    zzfzv(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f36615c = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzgaf D = zzgaf.m51461D(runnable, (Object) null);
        return new zzfzt(D, this.f36615c.schedule(D, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfzu zzfzu = new zzfzu(runnable);
        return new zzfzt(zzfzu, this.f36615c.scheduleAtFixedRate(zzfzu, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfzu zzfzu = new zzfzu(runnable);
        return new zzfzt(zzfzu, this.f36615c.scheduleWithFixedDelay(zzfzu, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgaf zzgaf = new zzgaf(callable);
        return new zzfzt(zzgaf, this.f36615c.schedule(zzgaf, j, timeUnit));
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfzt extends zzfza implements ScheduledFuture {

    /* renamed from: c */
    private final ScheduledFuture f36613c;

    public zzfzt(zzfzp zzfzp, ScheduledFuture scheduledFuture) {
        super(zzfzp);
        this.f36613c = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = mo46614d().cancel(z);
        if (cancel) {
            this.f36613c.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f36613c.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f36613c.getDelay(timeUnit);
    }
}

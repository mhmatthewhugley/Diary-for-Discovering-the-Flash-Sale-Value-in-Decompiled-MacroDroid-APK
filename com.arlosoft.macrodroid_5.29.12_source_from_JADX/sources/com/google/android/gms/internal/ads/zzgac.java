package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgac extends zzfyw {
    /* access modifiers changed from: private */

    /* renamed from: s */
    public zzfzp f36617s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ScheduledFuture f36618z;

    private zzgac(zzfzp zzfzp) {
        Objects.requireNonNull(zzfzp);
        this.f36617s = zzfzp;
    }

    /* renamed from: E */
    static zzfzp m51446E(zzfzp zzfzp, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgac zzgac = new zzgac(zzfzp);
        zzgaa zzgaa = new zzgaa(zzgac);
        zzgac.f36618z = scheduledExecutorService.schedule(zzgaa, j, timeUnit);
        zzfzp.mo43580q(zzgaa, zzfyu.INSTANCE);
        return zzgac;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo46078d() {
        zzfzp zzfzp = this.f36617s;
        ScheduledFuture scheduledFuture = this.f36618z;
        if (zzfzp == null) {
            return null;
        }
        String str = "inputFuture=[" + zzfzp + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo46079e() {
        mo46563u(this.f36617s);
        ScheduledFuture scheduledFuture = this.f36618z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f36617s = null;
        this.f36618z = null;
    }
}

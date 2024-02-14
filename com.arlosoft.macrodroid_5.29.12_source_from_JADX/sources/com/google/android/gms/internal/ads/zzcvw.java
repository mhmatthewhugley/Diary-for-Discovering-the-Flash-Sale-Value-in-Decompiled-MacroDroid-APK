package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvw implements zzbcj {

    /* renamed from: a */
    private final ScheduledExecutorService f31710a;

    /* renamed from: b */
    private final Clock f31711b;
    @Nullable

    /* renamed from: c */
    private ScheduledFuture f31712c;

    /* renamed from: d */
    private long f31713d = -1;

    /* renamed from: e */
    private long f31714e = -1;

    /* renamed from: f */
    private Runnable f31715f = null;

    /* renamed from: g */
    private boolean f31716g = false;

    public zzcvw(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.f31710a = scheduledExecutorService;
        this.f31711b = clock;
        zzt.m2891d().mo42462c(this);
    }

    /* renamed from: O */
    public final void mo42459O(boolean z) {
        if (z) {
            mo44418b();
        } else {
            mo44417a();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final synchronized void mo44417a() {
        if (!this.f31716g) {
            ScheduledFuture scheduledFuture = this.f31712c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f31714e = -1;
            } else {
                this.f31712c.cancel(true);
                this.f31714e = this.f31713d - this.f31711b.mo21952c();
            }
            this.f31716g = true;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public final synchronized void mo44418b() {
        ScheduledFuture scheduledFuture;
        if (this.f31716g) {
            if (this.f31714e > 0 && (scheduledFuture = this.f31712c) != null && scheduledFuture.isCancelled()) {
                this.f31712c = this.f31710a.schedule(this.f31715f, this.f31714e, TimeUnit.MILLISECONDS);
            }
            this.f31716g = false;
        }
    }

    /* renamed from: c */
    public final synchronized void mo44419c(int i, Runnable runnable) {
        this.f31715f = runnable;
        long j = (long) i;
        this.f31713d = this.f31711b.mo21952c() + j;
        this.f31712c = this.f31710a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}

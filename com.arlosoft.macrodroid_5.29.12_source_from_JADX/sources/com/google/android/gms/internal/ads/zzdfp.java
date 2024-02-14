package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdfp extends zzdij {

    /* renamed from: c */
    private final ScheduledExecutorService f32216c;

    /* renamed from: d */
    private final Clock f32217d;

    /* renamed from: f */
    private long f32218f = -1;

    /* renamed from: g */
    private long f32219g = -1;

    /* renamed from: o */
    private boolean f32220o = false;
    @Nullable

    /* renamed from: p */
    private ScheduledFuture f32221p;

    public zzdfp(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.f32216c = scheduledExecutorService;
        this.f32217d = clock;
    }

    /* renamed from: W0 */
    private final synchronized void m47299W0(long j) {
        ScheduledFuture scheduledFuture = this.f32221p;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f32221p.cancel(true);
        }
        this.f32218f = this.f32217d.mo21952c() + j;
        this.f32221p = this.f32216c.schedule(new zzdfo(this, (zzdfn) null), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: M0 */
    public final synchronized void mo44607M0(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) i);
            if (this.f32220o) {
                long j = this.f32219g;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f32219g = millis;
                return;
            }
            long c = this.f32217d.mo21952c();
            long j2 = this.f32218f;
            if (c > j2 || j2 - this.f32217d.mo21952c() > millis) {
                m47299W0(millis);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo44608a() {
        if (this.f32220o) {
            if (this.f32219g > 0 && this.f32221p.isCancelled()) {
                m47299W0(this.f32219g);
            }
            this.f32220o = false;
        }
    }

    public final synchronized void zza() {
        this.f32220o = false;
        m47299W0(0);
    }

    public final synchronized void zzb() {
        if (!this.f32220o) {
            ScheduledFuture scheduledFuture = this.f32221p;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f32219g = -1;
            } else {
                this.f32221p.cancel(true);
                this.f32219g = this.f32218f - this.f32217d.mo21952c();
            }
            this.f32220o = true;
        }
    }
}

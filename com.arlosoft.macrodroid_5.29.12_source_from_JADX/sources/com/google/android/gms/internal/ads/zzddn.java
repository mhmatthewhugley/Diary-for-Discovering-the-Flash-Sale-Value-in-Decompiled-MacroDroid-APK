package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzddn extends zzdij implements zzdde {

    /* renamed from: c */
    private final ScheduledExecutorService f32165c;

    /* renamed from: d */
    private ScheduledFuture f32166d;

    /* renamed from: f */
    private boolean f32167f = false;

    public zzddn(zzddm zzddm, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f32165c = scheduledExecutorService;
        mo44629G0(zzddm, executor);
    }

    /* renamed from: b */
    public final synchronized void mo44578b() {
        ScheduledFuture scheduledFuture = this.f32166d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo44579c() {
        this.f32166d = this.f32165c.schedule(new zzddh(this), (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27260t8)).intValue(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo44580d() {
        synchronized (this) {
            zzcgp.m45226d("Timeout waiting for show call succeed to be called.");
            mo44575y0(new zzdmo("Timeout for show call succeed."));
            this.f32167f = true;
        }
    }

    /* renamed from: r */
    public final void mo44574r(zze zze) {
        mo44631L0(new zzddg(zze));
    }

    /* renamed from: y0 */
    public final void mo44575y0(zzdmo zzdmo) {
        if (!this.f32167f) {
            ScheduledFuture scheduledFuture = this.f32166d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            mo44631L0(new zzddf(zzdmo));
        }
    }

    public final void zzb() {
        mo44631L0(zzddi.f32161a);
    }
}

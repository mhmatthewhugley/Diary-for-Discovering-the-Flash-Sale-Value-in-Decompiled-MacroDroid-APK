package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdca implements zzdda, zzdjx, zzdhr, zzddq, zzbbq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzdds f32080a;

    /* renamed from: c */
    private final zzfdk f32081c;

    /* renamed from: d */
    private final ScheduledExecutorService f32082d;

    /* renamed from: f */
    private final Executor f32083f;

    /* renamed from: g */
    private final zzfzy f32084g = zzfzy.m51441C();

    /* renamed from: o */
    private ScheduledFuture f32085o;

    /* renamed from: p */
    private final AtomicBoolean f32086p = new AtomicBoolean();

    public zzdca(zzdds zzdds, zzfdk zzfdk, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f32080a = zzdds;
        this.f32081c = zzfdk;
        this.f32082d = scheduledExecutorService;
        this.f32083f = executor;
    }

    /* renamed from: H */
    public final void mo44387H() {
    }

    /* renamed from: M0 */
    public final synchronized void mo44388M0(zze zze) {
        if (!this.f32084g.isDone()) {
            ScheduledFuture scheduledFuture = this.f32085o;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f32084g.mo46081g(new Exception());
        }
    }

    /* renamed from: O0 */
    public final void mo42396O0(zzbbp zzbbp) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26995S8)).booleanValue() && this.f32081c.f35518Z != 2 && zzbbp.f26529j && this.f32086p.compareAndSet(false, true)) {
            com.google.android.gms.ads.internal.util.zze.m2645k("Full screen 1px impression occurred");
            this.f32080a.zza();
        }
    }

    /* renamed from: b */
    public final synchronized void mo44544b() {
        if (!this.f32084g.isDone()) {
            ScheduledFuture scheduledFuture = this.f32085o;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f32084g.mo46080f(Boolean.TRUE);
        }
    }

    /* renamed from: c */
    public final void mo44545c() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27213p1)).booleanValue()) {
            zzfdk zzfdk = this.f32081c;
            if (zzfdk.f35518Z != 2) {
                return;
            }
            if (zzfdk.f35552r == 0) {
                this.f32080a.zza();
                return;
            }
            zzfzg.m51423r(this.f32084g, new zzdbz(this), this.f32083f);
            this.f32085o = this.f32082d.schedule(new zzdby(this), (long) this.f32081c.f35552r, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: d */
    public final void mo44546d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo44547e() {
        synchronized (this) {
            if (!this.f32084g.isDone()) {
                this.f32084g.mo46080f(Boolean.TRUE);
            }
        }
    }

    /* renamed from: f */
    public final void mo44548f() {
    }

    /* renamed from: h */
    public final void mo44389h() {
    }

    /* renamed from: k */
    public final void mo44391k() {
    }

    /* renamed from: l */
    public final void mo44392l() {
        int i = this.f32081c.f35518Z;
        if (i == 0 || i == 1) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26995S8)).booleanValue()) {
                this.f32080a.zza();
            }
        }
    }

    /* renamed from: q */
    public final void mo44395q() {
    }

    /* renamed from: x */
    public final void mo44398x(zzcbs zzcbs, String str, String str2) {
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbdx {

    /* renamed from: a */
    private ScheduledFuture f26668a = null;

    /* renamed from: b */
    private final Runnable f26669b = new zzbdt(this);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f26670c = new Object();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public zzbea f26671d;
    @Nullable

    /* renamed from: e */
    private Context f26672e;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public zzbed f26673f;

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m43199h(zzbdx zzbdx) {
        synchronized (zzbdx.f26670c) {
            zzbea zzbea = zzbdx.f26671d;
            if (zzbea != null) {
                if (zzbea.mo21641c() || zzbdx.f26671d.mo21644f()) {
                    zzbdx.f26671d.mo21640b();
                }
                zzbdx.f26671d = null;
                zzbdx.f26673f = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m43201l() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f26670c
            monitor-enter(r0)
            android.content.Context r1 = r3.f26672e     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzbea r1 = r3.f26671d     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.zzbdv r1 = new com.google.android.gms.internal.ads.zzbdv     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzbdw r2 = new com.google.android.gms.internal.ads.zzbdw     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzbea r1 = r3.mo42516d(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.f26671d = r1     // Catch:{ all -> 0x0023 }
            r1.mo21655v()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdx.m43201l():void");
    }

    /* renamed from: a */
    public final long mo42514a(zzbeb zzbeb) {
        synchronized (this.f26670c) {
            if (this.f26673f == null) {
                return -2;
            }
            if (this.f26671d.mo42531o0()) {
                try {
                    long Z8 = this.f26673f.mo42536Z8(zzbeb);
                    return Z8;
                } catch (RemoteException e) {
                    zzcgp.m45227e("Unable to call into cache service.", e);
                    return -2;
                }
            }
        }
    }

    /* renamed from: b */
    public final zzbdy mo42515b(zzbeb zzbeb) {
        synchronized (this.f26670c) {
            if (this.f26673f == null) {
                zzbdy zzbdy = new zzbdy();
                return zzbdy;
            }
            try {
                if (this.f26671d.mo42531o0()) {
                    zzbdy sb = this.f26673f.mo42538sb(zzbeb);
                    return sb;
                }
                zzbdy ia = this.f26673f.mo42537ia(zzbeb);
                return ia;
            } catch (RemoteException e) {
                zzcgp.m45227e("Unable to call into cache service.", e);
                return new zzbdy();
            }
        }
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: d */
    public final synchronized zzbea mo42516d(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbea(this.f26672e, zzt.m2909v().mo20334b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42517i(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f26670c
            monitor-enter(r0)
            android.content.Context r1 = r2.f26672e     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f26672e = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27215p3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo42663b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m43201l()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27205o3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo42663b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzbdu r3 = new com.google.android.gms.internal.ads.zzbdu     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbck r1 = com.google.android.gms.ads.internal.zzt.m2891d()     // Catch:{ all -> 0x0048 }
            r1.mo42462c(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdx.mo42517i(android.content.Context):void");
    }

    /* renamed from: j */
    public final void mo42518j() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27225q3)).booleanValue()) {
            synchronized (this.f26670c) {
                m43201l();
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27245s3)).booleanValue()) {
                    ScheduledFuture scheduledFuture = this.f26668a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f26668a = zzchc.f28459d.schedule(this.f26669b, ((Long) zzay.m1924c().mo42663b(zzbjc.f27235r3)).longValue(), TimeUnit.MILLISECONDS);
                } else {
                    zzfpz zzfpz = zzs.f2304i;
                    zzfpz.removeCallbacks(this.f26669b);
                    zzfpz.postDelayed(this.f26669b, ((Long) zzay.m1924c().mo42663b(zzbjc.f27235r3)).longValue());
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeof implements zzdfv, zzdeo, zzddd, zzddu, zza, zzdda, zzdfl, zzasf, zzddq, zzdkn {
    @VisibleForTesting

    /* renamed from: A */
    final BlockingQueue f34578A = new ArrayBlockingQueue(((Integer) zzay.m1924c().mo42663b(zzbjc.f26824B7)).intValue());

    /* renamed from: a */
    private final AtomicReference f34579a = new AtomicReference();

    /* renamed from: c */
    private final AtomicReference f34580c = new AtomicReference();

    /* renamed from: d */
    private final AtomicReference f34581d = new AtomicReference();

    /* renamed from: f */
    private final AtomicReference f34582f = new AtomicReference();

    /* renamed from: g */
    private final AtomicReference f34583g = new AtomicReference();

    /* renamed from: o */
    private final AtomicBoolean f34584o = new AtomicBoolean(true);

    /* renamed from: p */
    private final AtomicBoolean f34585p = new AtomicBoolean(false);

    /* renamed from: s */
    private final AtomicBoolean f34586s = new AtomicBoolean(false);
    @Nullable

    /* renamed from: z */
    private final zzfir f34587z;

    public zzeof(@Nullable zzfir zzfir) {
        this.f34587z = zzfir;
    }

    /* renamed from: W */
    private final void m49332W() {
        if (this.f34585p.get() && this.f34586s.get()) {
            for (Pair zzenw : this.f34578A) {
                zzfan.m49791a(this.f34580c, new zzenw(zzenw));
            }
            this.f34578A.clear();
            this.f34584o.set(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41880E(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f34584o     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue r0 = r3.f34578A     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.internal.ads.zzcgp.m45224b(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzfir r0 = r3.f34587z     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.zzfiq r1 = com.google.android.gms.internal.ads.zzfiq.m50227b(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.mo45774a(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.mo45774a(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.mo45782a(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f34580c     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzens r1 = new com.google.android.gms.internal.ads.zzens     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzfan.m49791a(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeof.mo41880E(java.lang.String, java.lang.String):void");
    }

    /* renamed from: H */
    public final void mo44387H() {
    }

    /* renamed from: K */
    public final void mo45394K(zzcg zzcg) {
        this.f34583g.set(zzcg);
    }

    /* renamed from: M0 */
    public final void mo44388M0(zze zze) {
        zzfan.m49791a(this.f34583g, new zzent(zze));
    }

    /* renamed from: a */
    public final void mo44605a(@NonNull zzs zzs) {
        zzfan.m49791a(this.f34581d, new zzenu(zzs));
    }

    /* renamed from: b */
    public final synchronized zzbf mo45395b() {
        return (zzbf) this.f34579a.get();
    }

    /* renamed from: c */
    public final synchronized zzbz mo45396c() {
        return (zzbz) this.f34580c.get();
    }

    /* renamed from: e */
    public final void mo45397e(zzbf zzbf) {
        this.f34579a.set(zzbf);
    }

    /* renamed from: f */
    public final void mo45398f(zzbi zzbi) {
        this.f34582f.set(zzbi);
    }

    /* renamed from: g */
    public final void mo44489g(zzfdw zzfdw) {
        this.f34584o.set(true);
        this.f34586s.set(false);
    }

    /* renamed from: h */
    public final void mo44389h() {
        zzfan.m49791a(this.f34579a, zzeoe.f34577a);
        zzfan.m49791a(this.f34583g, zzeno.f34560a);
    }

    /* renamed from: j */
    public final void mo44390j() {
        zzfan.m49791a(this.f34579a, zzenn.f34559a);
    }

    /* renamed from: k */
    public final void mo44391k() {
        zzfan.m49791a(this.f34579a, zzenv.f34568a);
    }

    /* renamed from: l */
    public final void mo44392l() {
        zzfan.m49791a(this.f34579a, zzenp.f34561a);
        zzfan.m49791a(this.f34583g, zzenq.f34562a);
        zzfan.m49791a(this.f34583g, zzenr.f34563a);
    }

    /* renamed from: n */
    public final synchronized void mo44393n() {
        zzfan.m49791a(this.f34579a, zzeoc.f34575a);
        zzfan.m49791a(this.f34582f, zzeod.f34576a);
        this.f34586s.set(true);
        m49332W();
    }

    /* renamed from: o */
    public final void mo45399o(zzde zzde) {
        this.f34581d.set(zzde);
    }

    public final void onAdClicked() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27290w8)).booleanValue()) {
            zzfan.m49791a(this.f34579a, zzenx.f34570a);
        }
    }

    /* renamed from: q */
    public final void mo44395q() {
    }

    /* renamed from: r */
    public final void mo44382r(zze zze) {
        zzfan.m49791a(this.f34579a, new zzenz(zze));
        zzfan.m49791a(this.f34579a, new zzeoa(zze));
        zzfan.m49791a(this.f34582f, new zzeob(zze));
        this.f34584o.set(false);
        this.f34578A.clear();
    }

    /* renamed from: s */
    public final void mo44113s() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27290w8)).booleanValue()) {
            zzfan.m49791a(this.f34579a, zzenx.f34570a);
        }
        zzfan.m49791a(this.f34583g, zzeny.f34571a);
    }

    /* renamed from: u */
    public final void mo44490u(zzcbc zzcbc) {
    }

    /* renamed from: x */
    public final void mo44398x(zzcbs zzcbs, String str, String str2) {
    }

    /* renamed from: y */
    public final void mo45400y(zzbz zzbz) {
        this.f34580c.set(zzbz);
        this.f34585p.set(true);
        m49332W();
    }
}

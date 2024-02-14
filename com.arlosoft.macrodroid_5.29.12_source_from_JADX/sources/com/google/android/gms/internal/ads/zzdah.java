package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdah {

    /* renamed from: a */
    private final zzecp f31955a;

    /* renamed from: b */
    private final zzfef f31956b;

    /* renamed from: c */
    private final zzfih f31957c;

    /* renamed from: d */
    private final zzctu f31958d;

    /* renamed from: e */
    private final zzekt f31959e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzdie f31960f;
    @Nullable

    /* renamed from: g */
    private zzfdw f31961g;

    /* renamed from: h */
    private final zzedt f31962h;

    /* renamed from: i */
    private final zzdcg f31963i;

    /* renamed from: j */
    private final Executor f31964j;

    /* renamed from: k */
    private final zzedg f31965k;

    /* renamed from: l */
    private final zzehh f31966l;

    zzdah(zzecp zzecp, zzfef zzfef, zzfih zzfih, zzctu zzctu, zzekt zzekt, zzdie zzdie, @Nullable zzfdw zzfdw, zzedt zzedt, zzdcg zzdcg, Executor executor, zzedg zzedg, zzehh zzehh) {
        this.f31955a = zzecp;
        this.f31956b = zzfef;
        this.f31957c = zzfih;
        this.f31958d = zzctu;
        this.f31959e = zzekt;
        this.f31960f = zzdie;
        this.f31961g = zzfdw;
        this.f31962h = zzedt;
        this.f31963i = zzdcg;
        this.f31964j = executor;
        this.f31965k = zzedg;
        this.f31966l = zzehh;
    }

    /* renamed from: a */
    public final zze mo44524a(Throwable th) {
        return zzffe.m50083b(th, this.f31966l);
    }

    /* renamed from: c */
    public final zzdie mo44525c() {
        return this.f31960f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ zzfdw mo44526d(zzfdw zzfdw) throws Exception {
        this.f31958d.mo44373a(zzfdw);
        return zzfdw;
    }

    /* renamed from: e */
    public final zzfzp mo44527e(zzffx zzffx) {
        zzfhm a = this.f31957c.mo45752b(zzfib.GET_CACHE_KEY, this.f31963i.mo44552c()).mo45747f(new zzdae(this, zzffx)).mo45742a();
        zzfzg.m51423r(a, new zzdaf(this), this.f31964j);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ zzfzp mo44528f(zzffx zzffx, zzcbc zzcbc) throws Exception {
        zzcbc.f28130z = zzffx;
        return this.f31962h.mo45186a(zzcbc);
    }

    /* renamed from: g */
    public final zzfzp mo44529g(zzcbc zzcbc) {
        zzfhm a = this.f31957c.mo45752b(zzfib.NOTIFY_CACHE_HIT, this.f31962h.mo45191f(zzcbc)).mo45742a();
        zzfzg.m51423r(a, new zzdag(this), this.f31964j);
        return a;
    }

    /* renamed from: h */
    public final zzfzp mo44530h(zzfzp zzfzp) {
        zzfhy f = this.f31957c.mo45752b(zzfib.RENDERER, zzfzp).mo45746e(new zzdad(this)).mo45747f(this.f31959e);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26841D4)).booleanValue()) {
            f = f.mo45750i((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26851E4)).intValue(), TimeUnit.SECONDS);
        }
        return f.mo45742a();
    }

    /* renamed from: i */
    public final zzfzp mo44531i() {
        zzl zzl = this.f31956b.f35629d;
        if (zzl.f1996O == null && zzl.f1991J == null) {
            return mo44532j(this.f31963i.mo44552c());
        }
        zzfih zzfih = this.f31957c;
        return zzfhr.m50181c(this.f31955a.mo45169a(), zzfib.PRELOADED_LOADER, zzfih).mo45742a();
    }

    /* renamed from: j */
    public final zzfzp mo44532j(zzfzp zzfzp) {
        zzfdw zzfdw = this.f31961g;
        if (zzfdw != null) {
            zzfih zzfih = this.f31957c;
            return zzfhr.m50181c(zzfzg.m51414i(zzfdw), zzfib.SERVER_TRANSACTION, zzfih).mo45742a();
        }
        zzt.m2892e().mo42518j();
        return this.f31957c.mo45752b(zzfib.SERVER_TRANSACTION, zzfzp).mo45747f(new zzdac(this.f31965k)).mo45742a();
    }

    /* renamed from: k */
    public final void mo44533k(zzfdw zzfdw) {
        this.f31961g = zzfdw;
    }
}

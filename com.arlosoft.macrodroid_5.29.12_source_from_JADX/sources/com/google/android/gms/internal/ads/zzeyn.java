package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeyn implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzeou f35201a;

    /* renamed from: b */
    final /* synthetic */ zzfju f35202b;

    /* renamed from: c */
    final /* synthetic */ zzfjj f35203c;

    /* renamed from: d */
    final /* synthetic */ zzeyp f35204d;

    /* renamed from: e */
    final /* synthetic */ zzeyq f35205e;

    zzeyn(zzeyq zzeyq, zzeou zzeou, zzfju zzfju, zzfjj zzfjj, zzeyp zzeyp) {
        this.f35205e = zzeyq;
        this.f35201a = zzeou;
        this.f35202b = zzfju;
        this.f35203c = zzfjj;
        this.f35204d = zzeyp;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zze zze;
        zzfju zzfju;
        zzcwk zzcwk = (zzcwk) this.f35205e.f35211e.mo45555d();
        if (zzcwk == null) {
            zze = zzffe.m50083b(th, (zzehh) null);
        } else {
            zze = zzcwk.zzb().mo44524a(th);
        }
        synchronized (this.f35205e) {
            this.f35205e.f35216j = null;
            if (zzcwk != null) {
                zzcwk.mo44263a().mo44382r(zze);
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27059Z6)).booleanValue()) {
                    this.f35205e.f35208b.execute(new zzeym(this, zze));
                }
            } else {
                this.f35205e.f35210d.mo44382r(zze);
                ((zzcwk) this.f35205e.m49645l(this.f35204d).mo44238e()).zzb().mo44525c().mo44540d();
            }
            zzfez.m50042b(zze.f1934a, th, "AppOpenAdLoader.onFailure");
            this.f35201a.zza();
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f35202b) == null) {
                zzfjw g = this.f35205e.f35214h;
                zzfjj zzfjj = this.f35203c;
                zzfjj.mo45803r(zze);
                zzfjj.mo45801o0(false);
                g.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45824c(zze);
                zzfjj zzfjj2 = this.f35203c;
                zzfjj2.mo45801o0(false);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        zzfju zzfju;
        zzcze zzcze = (zzcze) obj;
        synchronized (this.f35205e) {
            this.f35205e.f35216j = null;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27059Z6)).booleanValue()) {
                zzcze.mo44498e().mo44620b(this.f35205e.f35210d);
            }
            this.f35201a.mo45391c(zzcze);
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f35202b) == null) {
                zzfjw g = this.f35205e.f35214h;
                zzfjj zzfjj = this.f35203c;
                zzfjj.mo45793a(zzcze.mo44500g().f35590b);
                zzfjj.mo45797f0(zzcze.mo44496c().mo19995f());
                zzfjj.mo45801o0(true);
                g.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45827f(zzcze.mo44500g().f35590b);
                zzfju.mo45826e(zzcze.mo44496c().mo19995f());
                zzfjj zzfjj2 = this.f35203c;
                zzfjj2.mo45801o0(true);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }
}

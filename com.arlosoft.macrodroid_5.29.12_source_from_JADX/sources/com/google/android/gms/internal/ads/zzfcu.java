package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfcu implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzeou f35436a;

    /* renamed from: b */
    final /* synthetic */ zzfju f35437b;

    /* renamed from: c */
    final /* synthetic */ zzfjj f35438c;

    /* renamed from: d */
    final /* synthetic */ zzfcw f35439d;

    /* renamed from: e */
    final /* synthetic */ zzfcx f35440e;

    zzfcu(zzfcx zzfcx, zzeou zzeou, zzfju zzfju, zzfjj zzfjj, zzfcw zzfcw) {
        this.f35440e = zzfcx;
        this.f35436a = zzeou;
        this.f35437b = zzfju;
        this.f35438c = zzfjj;
        this.f35439d = zzfcw;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zze zze;
        zzfju zzfju;
        zzduh zzduh = (zzduh) this.f35440e.f35447e.mo45555d();
        if (zzduh == null) {
            zze = zzffe.m50083b(th, (zzehh) null);
        } else {
            zze = zzduh.zzb().mo44524a(th);
        }
        synchronized (this.f35440e) {
            if (zzduh != null) {
                zzduh.mo44358b().mo44382r(zze);
                this.f35440e.f35444b.execute(new zzfct(this, zze));
            } else {
                this.f35440e.f35446d.mo44382r(zze);
                this.f35440e.m49882j(this.f35439d).mo44356b().zzb().mo44525c().mo44540d();
            }
            zzfez.m50042b(zze.f1934a, th, "RewardedAdLoader.onFailure");
            this.f35436a.zza();
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f35437b) == null) {
                zzfjw f = this.f35440e.f35449g;
                zzfjj zzfjj = this.f35438c;
                zzfjj.mo45803r(zze);
                zzfjj.mo45801o0(false);
                f.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45824c(zze);
                zzfjj zzfjj2 = this.f35438c;
                zzfjj2.mo45801o0(false);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        zzfju zzfju;
        zzduc zzduc = (zzduc) obj;
        synchronized (this.f35440e) {
            zzduc.mo44498e().mo44622d(this.f35440e.f35446d);
            this.f35436a.mo45391c(zzduc);
            zzfcx zzfcx = this.f35440e;
            Executor g = zzfcx.f35444b;
            zzfcn e = zzfcx.f35446d;
            e.getClass();
            g.execute(new zzfcs(e));
            this.f35440e.f35446d.mo44623f();
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f35437b) == null) {
                zzfjw f = this.f35440e.f35449g;
                zzfjj zzfjj = this.f35438c;
                zzfjj.mo45793a(zzduc.mo44500g().f35590b);
                zzfjj.mo45797f0(zzduc.mo44496c().mo19995f());
                zzfjj.mo45801o0(true);
                f.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45827f(zzduc.mo44500g().f35590b);
                zzfju.mo45826e(zzduc.mo44496c().mo19995f());
                zzfjj zzfjj2 = this.f35438c;
                zzfjj2.mo45801o0(true);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }
}

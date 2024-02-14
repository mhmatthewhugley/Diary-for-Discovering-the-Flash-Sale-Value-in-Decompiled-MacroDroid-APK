package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfbm implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzeou f35367a;

    /* renamed from: b */
    final /* synthetic */ zzfju f35368b;

    /* renamed from: c */
    final /* synthetic */ zzfjj f35369c;

    /* renamed from: d */
    final /* synthetic */ zzdmh f35370d;

    /* renamed from: e */
    final /* synthetic */ zzfbn f35371e;

    zzfbm(zzfbn zzfbn, zzeou zzeou, zzfju zzfju, zzfjj zzfjj, zzdmh zzdmh) {
        this.f35371e = zzfbn;
        this.f35367a = zzeou;
        this.f35368b = zzfju;
        this.f35369c = zzfjj;
        this.f35370d = zzdmh;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zzfju zzfju;
        zze a = this.f35370d.mo44333a().mo44524a(th);
        synchronized (this.f35371e) {
            this.f35371e.f35380i = null;
            this.f35370d.mo44334b().mo44382r(a);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27069a7)).booleanValue()) {
                this.f35371e.f35373b.execute(new zzfbk(this, a));
                this.f35371e.f35373b.execute(new zzfbl(this, a));
            }
            zzfez.m50042b(a.f1934a, th, "InterstitialAdLoader.onFailure");
            this.f35367a.zza();
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f35368b) == null) {
                zzfjw d = this.f35371e.f35378g;
                zzfjj zzfjj = this.f35369c;
                zzfjj.mo45803r(a);
                zzfjj.mo45801o0(false);
                d.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45824c(a);
                zzfjj zzfjj2 = this.f35369c;
                zzfjj2.mo45801o0(false);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        zzfju zzfju;
        zzdlg zzdlg = (zzdlg) obj;
        synchronized (this.f35371e) {
            this.f35371e.f35380i = null;
            zzbiu zzbiu = zzbjc.f27069a7;
            if (((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
                zzdhe e = zzdlg.mo44498e();
                e.mo44619a(this.f35371e.f35375d);
                e.mo44622d(this.f35371e.f35376e);
            }
            this.f35367a.mo45391c(zzdlg);
            if (((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
                this.f35371e.f35373b.execute(new zzfbi(this));
                this.f35371e.f35373b.execute(new zzfbj(this));
            }
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f35368b) == null) {
                zzfjw d = this.f35371e.f35378g;
                zzfjj zzfjj = this.f35369c;
                zzfjj.mo45793a(zzdlg.mo44500g().f35590b);
                zzfjj.mo45797f0(zzdlg.mo44496c().mo19995f());
                zzfjj.mo45801o0(true);
                d.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45827f(zzdlg.mo44500g().f35590b);
                zzfju.mo45826e(zzdlg.mo44496c().mo19995f());
                zzfjj zzfjj2 = this.f35369c;
                zzfjj2.mo45801o0(true);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzezt implements zzfzc {

    /* renamed from: a */
    final /* synthetic */ zzeou f35271a;

    /* renamed from: b */
    final /* synthetic */ zzfju f35272b;

    /* renamed from: c */
    final /* synthetic */ zzfjj f35273c;

    /* renamed from: d */
    final /* synthetic */ zzcxz f35274d;

    /* renamed from: e */
    final /* synthetic */ zzezu f35275e;

    zzezt(zzezu zzezu, zzeou zzeou, zzfju zzfju, zzfjj zzfjj, zzcxz zzcxz) {
        this.f35275e = zzezu;
        this.f35271a = zzeou;
        this.f35272b = zzfju;
        this.f35273c = zzfjj;
        this.f35274d = zzcxz;
    }

    /* renamed from: a */
    public final void mo20699a(Throwable th) {
        zzfju zzfju;
        zze a = this.f35274d.mo44294d().mo44524a(th);
        synchronized (this.f35275e) {
            this.f35275e.f35287l = null;
            this.f35274d.mo44295e().mo44382r(a);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27050Y6)).booleanValue()) {
                this.f35275e.f35277b.execute(new zzezs(this, a));
            }
            zzezu zzezu = this.f35275e;
            zzezu.f35283h.mo44607M0(zzezu.f35285j.mo44627a());
            zzfez.m50042b(a.f1934a, th, "BannerAdLoader.onFailure");
            this.f35271a.zza();
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f35272b) == null) {
                zzfjw i = this.f35275e.f35284i;
                zzfjj zzfjj = this.f35273c;
                zzfjj.mo45803r(a);
                zzfjj.mo45801o0(false);
                i.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45824c(a);
                zzfjj zzfjj2 = this.f35273c;
                zzfjj2.mo45801o0(false);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20700c(Object obj) {
        zzfju zzfju;
        zzcxc zzcxc = (zzcxc) obj;
        synchronized (this.f35275e) {
            this.f35275e.f35287l = null;
            this.f35275e.f35281f.removeAllViews();
            if (zzcxc.mo44454i() != null) {
                ViewParent parent = zzcxc.mo44454i().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (zzcxc.mo44496c() != null) {
                        str = zzcxc.mo44496c().mo19995f();
                    }
                    zzcgp.m45229g("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcxc.mo44454i());
                }
            }
            zzbiu zzbiu = zzbjc.f27050Y6;
            if (((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
                zzdhe e = zzcxc.mo44498e();
                e.mo44619a(this.f35275e.f35279d);
                e.mo44621c(this.f35275e.f35280e);
            }
            this.f35275e.f35281f.addView(zzcxc.mo44454i());
            this.f35271a.mo45391c(zzcxc);
            if (((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
                zzezu zzezu = this.f35275e;
                Executor j = zzezu.f35277b;
                zzeof f = zzezu.f35279d;
                f.getClass();
                j.execute(new zzezr(f));
            }
            this.f35275e.f35283h.mo44607M0(zzcxc.mo44453h());
            if (!((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() || (zzfju = this.f35272b) == null) {
                zzfjw i = this.f35275e.f35284i;
                zzfjj zzfjj = this.f35273c;
                zzfjj.mo45793a(zzcxc.mo44500g().f35590b);
                zzfjj.mo45797f0(zzcxc.mo44496c().mo19995f());
                zzfjj.mo45801o0(true);
                i.mo45831b(zzfjj.mo45799h());
            } else {
                zzfju.mo45827f(zzcxc.mo44500g().f35590b);
                zzfju.mo45826e(zzcxc.mo44496c().mo19995f());
                zzfjj zzfjj2 = this.f35273c;
                zzfjj2.mo45801o0(true);
                zzfju.mo45822a(zzfjj2);
                zzfju.mo45828g();
            }
        }
    }
}

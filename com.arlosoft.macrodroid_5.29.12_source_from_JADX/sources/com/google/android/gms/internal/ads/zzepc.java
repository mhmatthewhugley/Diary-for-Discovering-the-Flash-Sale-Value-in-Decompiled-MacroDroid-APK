package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzepc implements zzeov {

    /* renamed from: a */
    private final zzfed f34630a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzcom f34631b;

    /* renamed from: c */
    private final Context f34632c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzeos f34633d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzfjw f34634e;
    @Nullable

    /* renamed from: f */
    private zzczs f34635f;

    public zzepc(zzcom zzcom, Context context, zzeos zzeos, zzfed zzfed) {
        this.f34631b = zzcom;
        this.f34632c = context;
        this.f34633d = zzeos;
        this.f34630a = zzfed;
        this.f34634e = zzcom.mo44191B();
        zzfed.mo45608L(zzeos.mo45410d());
    }

    /* renamed from: a */
    public final boolean mo45412a(zzl zzl, String str, zzeot zzeot, zzeou zzeou) throws RemoteException {
        zzfju zzfju;
        zzt.m2905r();
        if (zzs.m2753d(this.f34632c) && zzl.f1991J == null) {
            zzcgp.m45226d("Failed to load the ad because app ID is missing.");
            this.f34631b.mo44194b().execute(new zzeox(this));
            return false;
        } else if (str == null) {
            zzcgp.m45226d("Ad unit ID should not be null for NativeAdLoader.");
            this.f34631b.mo44194b().execute(new zzeoy(this));
            return false;
        } else {
            zzfez.m50041a(this.f34632c, zzl.f2002o);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue() && zzl.f2002o) {
                this.f34631b.mo44205o().mo45134m(true);
            }
            int i = ((zzeow) zzeot).f34619a;
            zzfed zzfed = this.f34630a;
            zzfed.mo45618e(zzl);
            zzfed.mo45613Q(i);
            zzfef g = zzfed.mo45620g();
            zzfjj b = zzfji.m50259b(this.f34632c, zzfjt.m50323f(g), 8, zzl);
            zzbz zzbz = g.f35639n;
            if (zzbz != null) {
                this.f34633d.mo45410d().mo45400y(zzbz);
            }
            zzdnc l = this.f34631b.mo44202l();
            zzdck zzdck = new zzdck();
            zzdck.mo44554c(this.f34632c);
            zzdck.mo44557f(g);
            l.mo44242j(zzdck.mo44558g());
            zzdik zzdik = new zzdik();
            zzdik.mo44643n(this.f34633d.mo45410d(), this.f34631b.mo44194b());
            l.mo44243m(zzdik.mo44646q());
            l.mo44240g(this.f34633d.mo45409c());
            l.mo44241i(new zzcwz((ViewGroup) null));
            zzdnd f = l.mo44239f();
            if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
                zzfju e = f.mo44250e();
                e.mo45829h(8);
                e.mo45823b(zzl.f1988G);
                zzfju = e;
            } else {
                zzfju = null;
            }
            this.f34631b.mo44216z().mo45673c(1);
            zzfzq zzfzq = zzchc.f28456a;
            zzgxq.m53658b(zzfzq);
            ScheduledExecutorService c = this.f34631b.mo44195c();
            zzdah a = f.mo44246a();
            zzczs zzczs = new zzczs(zzfzq, c, a.mo44530h(a.mo44531i()));
            this.f34635f = zzczs;
            zzczs.mo44506e(new zzepb(this, zzeou, zzfju, b, f));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo45418e() {
        this.f34633d.mo45407a().mo44382r(zzffe.m50085d(4, (String) null, (zze) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo45419f() {
        this.f34633d.mo45407a().mo44382r(zzffe.m50085d(6, (String) null, (zze) null));
    }

    public final boolean zza() {
        zzczs zzczs = this.f34635f;
        return zzczs != null && zzczs.mo44507f();
    }
}

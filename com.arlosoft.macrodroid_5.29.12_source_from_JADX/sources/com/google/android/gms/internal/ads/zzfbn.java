package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfbn implements zzeov {

    /* renamed from: a */
    private final Context f35372a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f35373b;

    /* renamed from: c */
    private final zzcom f35374c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzeof f35375d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzfcn f35376e;
    @Nullable

    /* renamed from: f */
    private zzbjx f35377f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzfjw f35378g;

    /* renamed from: h */
    private final zzfed f35379h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public zzfzp f35380i;

    public zzfbn(Context context, Executor executor, zzcom zzcom, zzeof zzeof, zzfcn zzfcn, zzfed zzfed) {
        this.f35372a = context;
        this.f35373b = executor;
        this.f35374c = zzcom;
        this.f35375d = zzeof;
        this.f35379h = zzfed;
        this.f35376e = zzfcn;
        this.f35378g = zzcom.mo44191B();
    }

    /* renamed from: a */
    public final boolean mo45412a(zzl zzl, String str, zzeot zzeot, zzeou zzeou) {
        zzdmh c;
        zzfju zzfju;
        if (str == null) {
            zzcgp.m45226d("Ad unit ID should not be null for interstitial ad.");
            this.f35373b.execute(new zzfbh(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue() && zzl.f2002o) {
                this.f35374c.mo44205o().mo45134m(true);
            }
            zzq zzq = ((zzfbg) zzeot).f35359a;
            zzfed zzfed = this.f35379h;
            zzfed.mo45606J(str);
            zzfed.mo45605I(zzq);
            zzfed.mo45618e(zzl);
            zzfef g = zzfed.mo45620g();
            zzfjj b = zzfji.m50259b(this.f35372a, zzfjt.m50323f(g), 4, zzl);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27069a7)).booleanValue()) {
                zzdmg k = this.f35374c.mo44201k();
                zzdck zzdck = new zzdck();
                zzdck.mo44554c(this.f35372a);
                zzdck.mo44557f(g);
                k.mo44330l(zzdck.mo44558g());
                zzdik zzdik = new zzdik();
                zzdik.mo44642m(this.f35375d, this.f35373b);
                zzdik.mo44643n(this.f35375d, this.f35373b);
                k.mo44331n(zzdik.mo44646q());
                k.mo44332p(new zzemp(this.f35377f));
                c = k.mo44329c();
            } else {
                zzdik zzdik2 = new zzdik();
                zzfcn zzfcn = this.f35376e;
                if (zzfcn != null) {
                    zzdik2.mo44637h(zzfcn, this.f35373b);
                    zzdik2.mo44638i(this.f35376e, this.f35373b);
                    zzdik2.mo44634e(this.f35376e, this.f35373b);
                }
                zzdmg k2 = this.f35374c.mo44201k();
                zzdck zzdck2 = new zzdck();
                zzdck2.mo44554c(this.f35372a);
                zzdck2.mo44557f(g);
                k2.mo44330l(zzdck2.mo44558g());
                zzdik2.mo44642m(this.f35375d, this.f35373b);
                zzdik2.mo44637h(this.f35375d, this.f35373b);
                zzdik2.mo44638i(this.f35375d, this.f35373b);
                zzdik2.mo44634e(this.f35375d, this.f35373b);
                zzdik2.mo44633d(this.f35375d, this.f35373b);
                zzdik2.mo44644o(this.f35375d, this.f35373b);
                zzdik2.mo44643n(this.f35375d, this.f35373b);
                zzdik2.mo44641l(this.f35375d, this.f35373b);
                zzdik2.mo44635f(this.f35375d, this.f35373b);
                k2.mo44331n(zzdik2.mo44646q());
                k2.mo44332p(new zzemp(this.f35377f));
                c = k2.mo44329c();
            }
            zzdmh zzdmh = c;
            if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
                zzfju d = zzdmh.mo44336d();
                d.mo45829h(4);
                d.mo45823b(zzl.f1988G);
                zzfju = d;
            } else {
                zzfju = null;
            }
            zzdah a = zzdmh.mo44333a();
            zzfzp h = a.mo44530h(a.mo44531i());
            this.f35380i = h;
            zzfzg.m51423r(h, new zzfbm(this, zzeou, zzfju, b, zzdmh), this.f35373b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo45580g() {
        this.f35375d.mo44382r(zzffe.m50085d(6, (String) null, (zze) null));
    }

    /* renamed from: h */
    public final void mo45581h(zzbjx zzbjx) {
        this.f35377f = zzbjx;
    }

    public final boolean zza() {
        zzfzp zzfzp = this.f35380i;
        return zzfzp != null && !zzfzp.isDone();
    }
}

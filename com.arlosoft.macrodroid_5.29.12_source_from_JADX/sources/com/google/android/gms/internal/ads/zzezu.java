package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzezu implements zzeov {

    /* renamed from: a */
    private final Context f35276a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f35277b;

    /* renamed from: c */
    private final zzcom f35278c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzeof f35279d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzeoj f35280e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewGroup f35281f;
    @Nullable

    /* renamed from: g */
    private zzbjx f35282g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final zzdfp f35283h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzfjw f35284i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final zzdhv f35285j;

    /* renamed from: k */
    private final zzfed f35286k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public zzfzp f35287l;

    public zzezu(Context context, Executor executor, zzq zzq, zzcom zzcom, zzeof zzeof, zzeoj zzeoj, zzfed zzfed, zzdhv zzdhv) {
        this.f35276a = context;
        this.f35277b = executor;
        this.f35278c = zzcom;
        this.f35279d = zzeof;
        this.f35280e = zzeoj;
        this.f35286k = zzfed;
        this.f35283h = zzcom.mo44200j();
        this.f35284i = zzcom.mo44191B();
        this.f35281f = new FrameLayout(context);
        this.f35285j = zzdhv;
        zzfed.mo45605I(zzq);
    }

    /* renamed from: a */
    public final boolean mo45412a(zzl zzl, String str, @Nullable zzeot zzeot, zzeou zzeou) throws RemoteException {
        zzcxz zzcxz;
        zzfju zzfju;
        if (str == null) {
            zzcgp.m45226d("Ad unit ID should not be null for banner ad.");
            this.f35277b.execute(new zzezq(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue() && zzl.f2002o) {
                this.f35278c.mo44205o().mo45134m(true);
            }
            zzfed zzfed = this.f35286k;
            zzfed.mo45606J(str);
            zzfed.mo45618e(zzl);
            zzfef g = zzfed.mo45620g();
            zzfjj b = zzfji.m50259b(this.f35276a, zzfjt.m50323f(g), 3, zzl);
            if (!((Boolean) zzbkx.f27474c.mo42728e()).booleanValue() || !this.f35286k.mo45625x().f2020B) {
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27050Y6)).booleanValue()) {
                    zzcxy i = this.f35278c.mo44199i();
                    zzdck zzdck = new zzdck();
                    zzdck.mo44554c(this.f35276a);
                    zzdck.mo44557f(g);
                    i.mo44290t(zzdck.mo44558g());
                    zzdik zzdik = new zzdik();
                    zzdik.mo44642m(this.f35279d, this.f35277b);
                    zzdik.mo44643n(this.f35279d, this.f35277b);
                    i.mo44287k(zzdik.mo44646q());
                    i.mo44288o(new zzemp(this.f35282g));
                    i.mo44284g(new zzdmy(zzdpb.f32689h, (zzbf) null));
                    i.mo44289s(new zzcyw(this.f35283h, this.f35285j));
                    i.mo44286i(new zzcwz(this.f35281f));
                    zzcxz = i.mo44285h();
                } else {
                    zzcxy i2 = this.f35278c.mo44199i();
                    zzdck zzdck2 = new zzdck();
                    zzdck2.mo44554c(this.f35276a);
                    zzdck2.mo44557f(g);
                    i2.mo44290t(zzdck2.mo44558g());
                    zzdik zzdik2 = new zzdik();
                    zzdik2.mo44642m(this.f35279d, this.f35277b);
                    zzdik2.mo44633d(this.f35279d, this.f35277b);
                    zzdik2.mo44633d(this.f35280e, this.f35277b);
                    zzdik2.mo44644o(this.f35279d, this.f35277b);
                    zzdik2.mo44636g(this.f35279d, this.f35277b);
                    zzdik2.mo44637h(this.f35279d, this.f35277b);
                    zzdik2.mo44638i(this.f35279d, this.f35277b);
                    zzdik2.mo44634e(this.f35279d, this.f35277b);
                    zzdik2.mo44643n(this.f35279d, this.f35277b);
                    zzdik2.mo44641l(this.f35279d, this.f35277b);
                    i2.mo44287k(zzdik2.mo44646q());
                    i2.mo44288o(new zzemp(this.f35282g));
                    i2.mo44284g(new zzdmy(zzdpb.f32689h, (zzbf) null));
                    i2.mo44289s(new zzcyw(this.f35283h, this.f35285j));
                    i2.mo44286i(new zzcwz(this.f35281f));
                    zzcxz = i2.mo44285h();
                }
                zzcxz zzcxz2 = zzcxz;
                if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
                    zzfju f = zzcxz2.mo44296f();
                    f.mo45829h(3);
                    f.mo45823b(zzl.f1988G);
                    zzfju = f;
                } else {
                    zzfju = null;
                }
                zzdah d = zzcxz2.mo44294d();
                zzfzp h = d.mo44530h(d.mo44531i());
                this.f35287l = h;
                zzfzg.m51423r(h, new zzezt(this, zzeou, zzfju, b, zzcxz2), this.f35277b);
                return true;
            }
            zzeof zzeof = this.f35279d;
            if (zzeof != null) {
                zzeof.mo44382r(zzffe.m50085d(7, (String) null, (zze) null));
            }
            return false;
        }
    }

    /* renamed from: c */
    public final ViewGroup mo45539c() {
        return this.f35281f;
    }

    /* renamed from: h */
    public final zzfed mo45540h() {
        return this.f35286k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo45541l() {
        this.f35279d.mo44382r(zzffe.m50085d(6, (String) null, (zze) null));
    }

    /* renamed from: m */
    public final void mo45542m() {
        this.f35283h.mo44607M0(this.f35285j.mo44627a());
    }

    /* renamed from: n */
    public final void mo45543n(zzbc zzbc) {
        this.f35280e.mo45402a(zzbc);
    }

    /* renamed from: o */
    public final void mo45544o(zzdfq zzdfq) {
        this.f35283h.mo44629G0(zzdfq, this.f35277b);
    }

    /* renamed from: p */
    public final void mo45545p(zzbjx zzbjx) {
        this.f35282g = zzbjx;
    }

    /* renamed from: q */
    public final boolean mo45546q() {
        ViewParent parent = this.f35281f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzt.m2905r();
        return zzs.m2768s(view, view.getContext());
    }

    public final boolean zza() {
        zzfzp zzfzp = this.f35287l;
        return zzfzp != null && !zzfzp.isDone();
    }
}

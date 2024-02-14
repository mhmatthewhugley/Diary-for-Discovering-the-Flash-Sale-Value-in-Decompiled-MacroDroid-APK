package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeic implements zzehc {

    /* renamed from: a */
    private final zzcxz f34081a;

    /* renamed from: b */
    private final Context f34082b;

    /* renamed from: c */
    private final zzduy f34083c;

    /* renamed from: d */
    private final zzfef f34084d;

    /* renamed from: e */
    private final Executor f34085e;

    /* renamed from: f */
    private final zzfsm f34086f;

    public zzeic(zzcxz zzcxz, Context context, Executor executor, zzduy zzduy, zzfef zzfef, zzfsm zzfsm) {
        this.f34082b = context;
        this.f34081a = zzcxz;
        this.f34085e = executor;
        this.f34083c = zzduy;
        this.f34084d = zzfef;
        this.f34086f = zzfsm;
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        zzfdp zzfdp = zzfdk.f35554t;
        return (zzfdp == null || zzfdp.f35577a == null) ? false : true;
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        return zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzehw(this, zzfdw, zzfdk), this.f34085e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45318c(zzfdw zzfdw, zzfdk zzfdk, Object obj) throws Exception {
        View view;
        zzq a = zzfej.m50010a(this.f34082b, zzfdk.f35556v);
        zzcmp a2 = this.f34083c.mo45004a(a, zzfdk, zzfdw.f35590b.f35587b);
        a2.mo44068r0(zzfdk.f35516X);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26903J6)).booleanValue() || !zzfdk.f35536i0) {
            view = new zzdvb(this.f34082b, (View) a2, (zzas) this.f34086f.apply(zzfdk));
        } else {
            view = zzcyq.m47038a(this.f34082b, (View) a2, zzfdk);
        }
        zzcxd a3 = this.f34081a.mo44291a(new zzczt(zzfdw, zzfdk, (String) null), new zzcxj(view, a2, new zzehx(a2), zzfej.m50012c(a)));
        a3.mo44282j().mo45003i(a2, false, (zzbpx) null);
        zzdds b = a3.mo44255b();
        zzehy zzehy = new zzehy(a2);
        zzfzq zzfzq = zzchc.f28461f;
        b.mo44629G0(zzehy, zzfzq);
        a3.mo44282j();
        zzfdp zzfdp = zzfdk.f35554t;
        zzfzp j = zzdux.m48214j(a2, zzfdp.f35578b, zzfdp.f35577a);
        if (zzfdk.f35506N) {
            j.mo43580q(new zzehz(a2), this.f34085e);
        }
        j.mo43580q(new zzeia(this, a2), this.f34085e);
        return zzfzg.m51418m(j, new zzeib(a3), zzfzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo45319d(zzcmp zzcmp) {
        zzcmp.mo44021N();
        zzcnl p = zzcmp.mo43761p();
        zzff zzff = this.f34084d.f35626a;
        if (zzff != null && p != null) {
            p.mo44167Nb(zzff);
        }
    }
}

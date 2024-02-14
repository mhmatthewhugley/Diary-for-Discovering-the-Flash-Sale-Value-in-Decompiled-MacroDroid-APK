package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzehu implements zzehc {

    /* renamed from: a */
    private final zzcwf f34062a;

    /* renamed from: b */
    private final Context f34063b;

    /* renamed from: c */
    private final zzduy f34064c;

    /* renamed from: d */
    private final Executor f34065d;

    public zzehu(zzcwf zzcwf, Context context, Executor executor, zzduy zzduy) {
        this.f34063b = context;
        this.f34062a = zzcwf;
        this.f34065d = executor;
        this.f34064c = zzduy;
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        zzfdp zzfdp = zzfdk.f35554t;
        return (zzfdp == null || zzfdp.f35577a == null) ? false : true;
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        return zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzehr(this, zzfdw, zzfdk), this.f34065d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45313c(zzfdw zzfdw, zzfdk zzfdk, Object obj) throws Exception {
        zzq a = zzfej.m50010a(this.f34063b, zzfdk.f35556v);
        zzcmp a2 = this.f34064c.mo45004a(a, zzfdk, zzfdw.f35590b.f35587b);
        zzcvx b = this.f34062a.mo44271b(new zzczt(zzfdw, zzfdk, (String) null), new zzcvy((View) a2, a2, zzfej.m50012c(a), zzfdk.f35522b0, zzfdk.f35530f0, zzfdk.f35508P));
        b.mo44257i().mo45003i(a2, false, (zzbpx) null);
        zzdds b2 = b.mo44255b();
        zzehs zzehs = new zzehs(a2);
        zzfzq zzfzq = zzchc.f28461f;
        b2.mo44629G0(zzehs, zzfzq);
        b.mo44257i();
        zzfdp zzfdp = zzfdk.f35554t;
        return zzfzg.m51418m(zzdux.m48214j(a2, zzfdp.f35578b, zzfdp.f35577a), new zzeht(b), zzfzq);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzelm implements zzehc {

    /* renamed from: a */
    private final Context f34385a;

    /* renamed from: b */
    private final zzduy f34386b;

    /* renamed from: c */
    private final zzduh f34387c;

    /* renamed from: d */
    private final zzfef f34388d;

    /* renamed from: e */
    private final Executor f34389e;

    /* renamed from: f */
    private final zzcgv f34390f;

    /* renamed from: g */
    private final zzbpx f34391g;

    /* renamed from: h */
    private final boolean f34392h = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26844D7)).booleanValue();

    public zzelm(Context context, zzcgv zzcgv, zzfef zzfef, Executor executor, zzduh zzduh, zzduy zzduy, zzbpx zzbpx) {
        this.f34385a = context;
        this.f34388d = zzfef;
        this.f34387c = zzduh;
        this.f34389e = executor;
        this.f34390f = zzcgv;
        this.f34386b = zzduy;
        this.f34391g = zzbpx;
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        zzfdp zzfdp = zzfdk.f35554t;
        return (zzfdp == null || zzfdp.f35577a == null) ? false : true;
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        zzdvc zzdvc = new zzdvc();
        zzfzp n = zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzelf(this, zzfdk, zzfdw, zzdvc), this.f34389e);
        n.mo43580q(new zzelg(zzdvc), this.f34389e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45364c(zzfdk zzfdk, zzfdw zzfdw, zzdvc zzdvc, Object obj) throws Exception {
        zzfdk zzfdk2 = zzfdk;
        zzfdw zzfdw2 = zzfdw;
        zzcmp a = this.f34386b.mo45004a(this.f34388d.f35630e, zzfdk2, zzfdw2.f35590b.f35587b);
        a.mo44068r0(zzfdk2.f35516X);
        zzdvc.mo45007a(this.f34385a, (View) a);
        zzchh zzchh = new zzchh();
        zzduh zzduh = this.f34387c;
        zzczt zzczt = new zzczt(zzfdw2, zzfdk2, (String) null);
        zzell zzell = r1;
        zzell zzell2 = new zzell(this.f34385a, this.f34386b, this.f34388d, this.f34390f, zzfdk, zzchh, a, this.f34391g, this.f34392h);
        zzdud d = zzduh.mo44359d(zzczt, new zzdue(zzell, a));
        zzchh.mo43574c(d);
        zzbql.m43980b(a, d.mo44349i());
        d.mo44255b().mo44629G0(new zzelh(a), zzchc.f28461f);
        d.mo44352l().mo45003i(a, true, this.f34392h ? this.f34391g : null);
        d.mo44352l();
        zzfdk zzfdk3 = zzfdk;
        zzfdp zzfdp = zzfdk3.f35554t;
        return zzfzg.m51418m(zzdux.m48214j(a, zzfdp.f35578b, zzfdp.f35577a), new zzeli(this, a, zzfdk3, d), this.f34389e);
    }
}

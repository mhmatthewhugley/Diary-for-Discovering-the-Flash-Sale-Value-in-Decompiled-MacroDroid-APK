package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeje implements zzehc {

    /* renamed from: a */
    private final Context f34170a;

    /* renamed from: b */
    private final zzduy f34171b;

    /* renamed from: c */
    private final zzdmh f34172c;

    /* renamed from: d */
    private final zzfef f34173d;

    /* renamed from: e */
    private final Executor f34174e;

    /* renamed from: f */
    private final zzcgv f34175f;

    /* renamed from: g */
    private final zzbpx f34176g;

    /* renamed from: h */
    private final boolean f34177h = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26844D7)).booleanValue();

    public zzeje(Context context, zzcgv zzcgv, zzfef zzfef, Executor executor, zzdmh zzdmh, zzduy zzduy, zzbpx zzbpx) {
        this.f34170a = context;
        this.f34173d = zzfef;
        this.f34172c = zzdmh;
        this.f34174e = executor;
        this.f34175f = zzcgv;
        this.f34171b = zzduy;
        this.f34176g = zzbpx;
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        zzfdp zzfdp = zzfdk.f35554t;
        return (zzfdp == null || zzfdp.f35577a == null) ? false : true;
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        zzdvc zzdvc = new zzdvc();
        zzfzp n = zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzeiz(this, zzfdk, zzfdw, zzdvc), this.f34174e);
        n.mo43580q(new zzeja(zzdvc), this.f34174e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45334c(zzfdk zzfdk, zzfdw zzfdw, zzdvc zzdvc, Object obj) throws Exception {
        zzfdk zzfdk2 = zzfdk;
        zzfdw zzfdw2 = zzfdw;
        zzcmp a = this.f34171b.mo45004a(this.f34173d.f35630e, zzfdk2, zzfdw2.f35590b.f35587b);
        a.mo44068r0(zzfdk2.f35516X);
        zzdvc.mo45007a(this.f34170a, (View) a);
        zzchh zzchh = new zzchh();
        zzdmh zzdmh = this.f34172c;
        zzczt zzczt = new zzczt(zzfdw2, zzfdk2, (String) null);
        zzejd zzejd = r1;
        zzejd zzejd2 = new zzejd(this.f34170a, this.f34175f, zzchh, zzfdk, a, this.f34173d, this.f34177h, this.f34176g);
        zzdlh c = zzdmh.mo44335c(zzczt, new zzdlk(zzejd, a));
        zzchh.mo43574c(c);
        c.mo44255b().mo44629G0(new zzejb(a), zzchc.f28461f);
        c.mo44328k().mo45003i(a, true, this.f34177h ? this.f34176g : null);
        c.mo44328k();
        zzfdk zzfdk3 = zzfdk;
        zzfdp zzfdp = zzfdk3.f35554t;
        return zzfzg.m51418m(zzdux.m48214j(a, zzfdp.f35578b, zzfdp.f35577a), new zzejc(this, a, zzfdk3, c), this.f34174e);
    }
}

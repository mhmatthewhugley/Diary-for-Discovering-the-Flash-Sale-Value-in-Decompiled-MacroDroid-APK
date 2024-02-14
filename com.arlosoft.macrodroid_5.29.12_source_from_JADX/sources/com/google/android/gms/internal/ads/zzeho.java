package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeho implements zzehc {

    /* renamed from: a */
    private final zzcwq f34035a;

    /* renamed from: b */
    private final Context f34036b;

    /* renamed from: c */
    private final zzduy f34037c;

    /* renamed from: d */
    private final zzfef f34038d;

    /* renamed from: e */
    private final Executor f34039e;

    /* renamed from: f */
    private final zzcgv f34040f;

    /* renamed from: g */
    private final zzbpx f34041g;

    /* renamed from: h */
    private final boolean f34042h = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26844D7)).booleanValue();

    public zzeho(zzcwq zzcwq, Context context, Executor executor, zzduy zzduy, zzfef zzfef, zzcgv zzcgv, zzbpx zzbpx) {
        this.f34036b = context;
        this.f34035a = zzcwq;
        this.f34039e = executor;
        this.f34037c = zzduy;
        this.f34038d = zzfef;
        this.f34040f = zzcgv;
        this.f34041g = zzbpx;
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        zzfdp zzfdp = zzfdk.f35554t;
        return (zzfdp == null || zzfdp.f35577a == null) ? false : true;
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        zzdvc zzdvc = new zzdvc();
        zzfzp n = zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzehm(this, zzfdk, zzfdw, zzdvc), this.f34039e);
        n.mo43580q(new zzehn(zzdvc), this.f34039e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45312c(zzfdk zzfdk, zzfdw zzfdw, zzdvc zzdvc, Object obj) throws Exception {
        zzfdk zzfdk2 = zzfdk;
        zzfdw zzfdw2 = zzfdw;
        zzcmp a = this.f34037c.mo45004a(this.f34038d.f35630e, zzfdk2, zzfdw2.f35590b.f35587b);
        a.mo44068r0(zzfdk2.f35516X);
        zzdvc.mo45007a(this.f34036b, (View) a);
        zzchh zzchh = new zzchh();
        zzcwq zzcwq = this.f34035a;
        zzczt zzczt = new zzczt(zzfdw2, zzfdk2, (String) null);
        zzehq zzehq = r1;
        zzehq zzehq2 = new zzehq(this.f34040f, zzchh, zzfdk, a, this.f34038d, this.f34042h, this.f34041g);
        zzcwn b = zzcwq.mo44264b(zzczt, new zzdlk(zzehq, a), new zzcwo(zzfdk2.f35522b0));
        b.mo44260j().mo45003i(a, false, this.f34042h ? this.f34041g : null);
        zzchh.mo43574c(b);
        b.mo44255b().mo44629G0(new zzehk(a), zzchc.f28461f);
        b.mo44260j();
        zzfdp zzfdp = zzfdk2.f35554t;
        return zzfzg.m51418m(zzdux.m48214j(a, zzfdp.f35578b, zzfdp.f35577a), new zzehl(this, a, zzfdk2, b), this.f34039e);
    }
}

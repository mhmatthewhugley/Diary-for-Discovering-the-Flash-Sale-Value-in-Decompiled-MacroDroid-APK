package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdsh {

    /* renamed from: a */
    private final Executor f32956a;

    /* renamed from: b */
    private final zzcvu f32957b;

    /* renamed from: c */
    private final zzdki f32958c;

    zzdsh(Executor executor, zzcvu zzcvu, zzdki zzdki) {
        this.f32956a = executor;
        this.f32958c = zzdki;
        this.f32957b = zzcvu;
    }

    /* renamed from: a */
    public final void mo44951a(zzcmp zzcmp) {
        if (zzcmp != null) {
            this.f32958c.mo44684M0(zzcmp.mo44027R());
            this.f32958c.mo44629G0(new zzdsd(zzcmp), this.f32956a);
            this.f32958c.mo44629G0(new zzdse(zzcmp), this.f32956a);
            this.f32958c.mo44629G0(this.f32957b, this.f32956a);
            this.f32957b.mo44416e(zzcmp);
            zzcmp.mo44064o0("/trackActiveViewUnit", new zzdsf(this));
            zzcmp.mo44064o0("/untrackActiveViewUnit", new zzdsg(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo44952b(zzcmp zzcmp, Map map) {
        this.f32957b.mo44413b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo44953c(zzcmp zzcmp, Map map) {
        this.f32957b.mo44412a();
    }
}

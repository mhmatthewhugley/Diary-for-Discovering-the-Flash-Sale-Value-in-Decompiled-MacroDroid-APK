package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzels implements zzehj {

    /* renamed from: a */
    private final Context f34413a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f34414b;

    /* renamed from: c */
    private final zzduh f34415c;

    public zzels(Context context, Executor executor, zzduh zzduh) {
        this.f34413a = context;
        this.f34414b = executor;
        this.f34415c = zzduh;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m49058e(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) {
        try {
            ((zzffa) zzehf.f34016b).mo45658n(zzfdw.f35589a.f35583a.f35629d, zzfdk.f35557w.toString());
        } catch (Exception e) {
            zzcgp.m45230h("Fail to load ad from adapter ".concat(String.valueOf(zzehf.f34015a)), e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45309a(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek, zzekr {
        zzdud d = this.f34415c.mo44359d(new zzczt(zzfdw, zzfdk, zzehf.f34015a), new zzdue(new zzelo(zzehf)));
        d.mo44277c().mo44629G0(new zzcuq((zzffa) zzehf.f34016b), this.f34414b);
        zzdeh d2 = d.mo44347d();
        zzdcy a = d.mo44323a();
        ((zzeiy) zzehf.f34017c).mo45331Kb(new zzelr(this, d.mo44348h(), a, d2, d.mo44349i()));
        return d.mo44351k();
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        if (!((zzffa) zzehf.f34016b).mo45645a()) {
            ((zzeiy) zzehf.f34017c).mo45332Lb(new zzelq(this, zzfdw, zzfdk, zzehf));
            ((zzffa) zzehf.f34016b).mo45655k(this.f34413a, zzfdw.f35589a.f35583a.f35629d, (String) null, (zzccd) zzehf.f34017c, zzfdk.f35557w.toString());
            return;
        }
        m49058e(zzfdw, zzfdk, zzehf);
    }
}

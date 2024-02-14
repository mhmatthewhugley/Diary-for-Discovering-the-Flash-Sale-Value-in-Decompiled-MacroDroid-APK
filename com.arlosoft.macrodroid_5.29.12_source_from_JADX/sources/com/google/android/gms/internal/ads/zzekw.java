package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzekw implements zzehj {

    /* renamed from: a */
    private final Context f34334a;

    /* renamed from: b */
    private final Executor f34335b;

    /* renamed from: c */
    private final zzduh f34336c;

    public zzekw(Context context, Executor executor, zzduh zzduh) {
        this.f34334a = context;
        this.f34335b = executor;
        this.f34336c = zzduh;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45309a(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek, zzekr {
        zzdud d = this.f34336c.mo44359d(new zzczt(zzfdw, zzfdk, zzehf.f34015a), new zzdue(new zzekv(zzehf)));
        d.mo44277c().mo44629G0(new zzcuq((zzffa) zzehf.f34016b), this.f34335b);
        ((zzeix) zzehf.f34017c).mo45330Kb(d.mo44353m());
        return d.mo44351k();
    }

    /* renamed from: b */
    public final void mo45310b(zzfdw zzfdw, zzfdk zzfdk, zzehf zzehf) throws zzfek {
        try {
            zzfef zzfef = zzfdw.f35589a.f35583a;
            if (zzfef.f35640o.f35582a == 3) {
                ((zzffa) zzehf.f34016b).mo45664t(this.f34334a, zzfef.f35629d, zzfdk.f35557w.toString(), (zzbvq) zzehf.f34017c);
            } else {
                ((zzffa) zzehf.f34016b).mo45663s(this.f34334a, zzfef.f35629d, zzfdk.f35557w.toString(), (zzbvq) zzehf.f34017c);
            }
        } catch (Exception e) {
            zzcgp.m45230h("Fail to load ad from adapter ".concat(String.valueOf(zzehf.f34015a)), e);
        }
    }
}

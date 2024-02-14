package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfem implements zzbpu {

    /* renamed from: a */
    public final /* synthetic */ zzdkn f35648a;

    /* renamed from: b */
    public final /* synthetic */ zzfkm f35649b;

    /* renamed from: c */
    public final /* synthetic */ zzego f35650c;

    public /* synthetic */ zzfem(zzdkn zzdkn, zzfkm zzfkm, zzego zzego) {
        this.f35648a = zzdkn;
        this.f35649b = zzfkm;
        this.f35650c = zzego;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzdkn zzdkn = this.f35648a;
        zzfkm zzfkm = this.f35649b;
        zzego zzego = this.f35650c;
        zzcmp zzcmp = (zzcmp) obj;
        zzbpt.m43934d(map, zzdkn);
        String str = (String) map.get("u");
        if (str == null) {
            zzcgp.m45229g("URL missing from click GMSG.");
        } else {
            zzfzg.m51423r(zzbpt.m43932b(zzcmp, str), new zzfen(zzcmp, zzfkm, zzego), zzchc.f28456a);
        }
    }
}

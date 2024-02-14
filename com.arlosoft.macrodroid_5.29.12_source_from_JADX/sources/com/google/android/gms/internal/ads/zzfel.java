package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfel implements zzbpu {

    /* renamed from: a */
    public final /* synthetic */ zzfkm f35646a;

    /* renamed from: b */
    public final /* synthetic */ zzego f35647b;

    public /* synthetic */ zzfel(zzfkm zzfkm, zzego zzego) {
        this.f35646a = zzfkm;
        this.f35647b = zzego;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzfkm zzfkm = this.f35646a;
        zzego zzego = this.f35647b;
        zzcmg zzcmg = (zzcmg) obj;
        String str = (String) map.get("u");
        if (str == null) {
            zzcgp.m45229g("URL missing from httpTrack GMSG.");
        } else if (!zzcmg.mo43986t().f35540k0) {
            zzfkm.mo45862c(str, (zzfju) null);
        } else {
            zzego.mo45279f(new zzegq(zzt.m2889b().mo21950a(), ((zzcnm) zzcmg).mo44022O().f35566b, str, 2));
        }
    }
}

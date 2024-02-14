package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbox implements zzbpu {

    /* renamed from: a */
    public final /* synthetic */ zzdkn f27597a;

    public /* synthetic */ zzbox(zzdkn zzdkn) {
        this.f27597a = zzdkn;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        zzbpt.m43934d(map, this.f27597a);
        String str = (String) map.get("u");
        if (str == null) {
            zzcgp.m45229g("URL missing from click GMSG.");
        } else {
            zzfzg.m51423r(zzbpt.m43932b(zzcmp, str), new zzbpk(zzcmp), zzchc.f28456a);
        }
    }
}

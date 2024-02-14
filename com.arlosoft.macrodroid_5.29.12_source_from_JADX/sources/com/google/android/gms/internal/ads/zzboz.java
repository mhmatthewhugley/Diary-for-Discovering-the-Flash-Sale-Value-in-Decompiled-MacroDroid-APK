package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzby;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzboz implements zzbpu {

    /* renamed from: a */
    public static final /* synthetic */ zzboz f27599a = new zzboz();

    private /* synthetic */ zzboz() {
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzcnq zzcnq = (zzcnq) obj;
        zzbpu zzbpu = zzbpt.f27603a;
        String str = (String) map.get("u");
        if (str == null) {
            zzcgp.m45229g("URL missing from httpTrack GMSG.");
        } else {
            new zzby(zzcnq.getContext(), ((zzcny) zzcnq).mo43759m().f28446a, str).mo20314b();
        }
    }
}

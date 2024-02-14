package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbpr implements zzbpu {
    zzbpr() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        if (map.keySet().contains("start")) {
            zzcmp.mo44044e0().mo44105i();
        } else if (map.keySet().contains("stop")) {
            zzcmp.mo44044e0().mo44106j();
        } else if (map.keySet().contains("cancel")) {
            zzcmp.mo44044e0().mo44103h();
        }
    }
}

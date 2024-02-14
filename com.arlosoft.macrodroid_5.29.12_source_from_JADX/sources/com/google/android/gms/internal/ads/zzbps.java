package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbps implements zzbpu {
    zzbps() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        if (map.keySet().contains("start")) {
            zzcmp.mo44023P(true);
        }
        if (map.keySet().contains("stop")) {
            zzcmp.mo44023P(false);
        }
    }
}

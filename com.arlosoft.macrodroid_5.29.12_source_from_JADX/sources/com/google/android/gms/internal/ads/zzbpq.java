package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbpq implements zzbpu {
    zzbpq() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcmp.mo20442G0();
        } else if ("resume".equals(str)) {
            zzcmp.mo20443h0();
        }
    }
}

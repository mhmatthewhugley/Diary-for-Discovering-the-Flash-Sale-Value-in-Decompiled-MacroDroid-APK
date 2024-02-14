package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzboy implements zzbpu {

    /* renamed from: a */
    public static final /* synthetic */ zzboy f27598a = new zzboy();

    private /* synthetic */ zzboy() {
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzcnx zzcnx = (zzcnx) obj;
        zzbpu zzbpu = zzbpt.f27603a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzape L = zzcnx.mo44019L();
            if (L != null) {
                L.mo41776c().mo20429c(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzcgp.m45229g("Could not parse touch parameters from gmsg.");
        }
    }
}

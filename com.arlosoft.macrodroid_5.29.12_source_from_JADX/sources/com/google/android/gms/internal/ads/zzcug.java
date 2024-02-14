package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcug implements zzctw {

    /* renamed from: a */
    private final Context f31583a;

    /* renamed from: b */
    private final zzg f31584b = zzt.m2904q().mo43494h();

    public zzcug(Context context) {
        this.f31583a = context;
    }

    /* renamed from: a */
    public final void mo44375a(Map map) {
        if (!map.isEmpty()) {
            String str = (String) map.get("gad_idless");
            if (str != null) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                map.remove("gad_idless");
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27232r0)).booleanValue()) {
                    this.f31584b.mo20384o0(parseBoolean);
                    if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27187m5)).booleanValue() && parseBoolean) {
                        this.f31583a.deleteDatabase("OfflineUpload.db");
                    }
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27182m0)).booleanValue()) {
                zzt.m2903p().mo43446w(bundle);
            }
        }
    }
}

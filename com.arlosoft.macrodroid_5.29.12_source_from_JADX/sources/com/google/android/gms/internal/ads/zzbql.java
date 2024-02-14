package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbql implements zzbpu {

    /* renamed from: a */
    private final zzbqk f27659a;

    public zzbql(zzbqk zzbqk) {
        this.f27659a = zzbqk;
    }

    /* renamed from: b */
    public static void m43980b(zzcmp zzcmp, zzbqk zzbqk) {
        zzcmp.mo44064o0("/reward", new zzbql(zzbqk));
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzcce zzcce = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzcce = new zzcce(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zzcgp.m45230h("Unable to parse reward amount.", e);
            }
            this.f27659a.mo42890x(zzcce);
        } else if ("video_start".equals(str)) {
            this.f27659a.mo42889a();
        } else if ("video_complete".equals(str)) {
            this.f27659a.zzb();
        }
    }
}

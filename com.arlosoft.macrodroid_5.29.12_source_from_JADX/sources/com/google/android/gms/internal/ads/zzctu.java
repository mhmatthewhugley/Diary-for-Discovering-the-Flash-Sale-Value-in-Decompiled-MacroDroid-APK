package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzctu {

    /* renamed from: a */
    private final Map f31542a;

    /* renamed from: b */
    private final Map f31543b;

    zzctu(Map map, Map map2) {
        this.f31542a = map;
        this.f31543b = map2;
    }

    /* renamed from: a */
    public final void mo44373a(zzfdw zzfdw) throws Exception {
        for (zzfdu zzfdu : zzfdw.f35590b.f35588c) {
            if (this.f31542a.containsKey(zzfdu.f35584a)) {
                ((zzctx) this.f31542a.get(zzfdu.f35584a)).mo44376a(zzfdu.f35585b);
            } else if (this.f31543b.containsKey(zzfdu.f35584a)) {
                zzctw zzctw = (zzctw) this.f31543b.get(zzfdu.f35584a);
                JSONObject jSONObject = zzfdu.f35585b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzctw.mo44375a(hashMap);
            }
        }
    }
}

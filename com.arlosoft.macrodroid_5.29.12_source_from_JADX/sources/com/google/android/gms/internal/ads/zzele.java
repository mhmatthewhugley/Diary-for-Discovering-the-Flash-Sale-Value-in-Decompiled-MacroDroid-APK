package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzele implements zzehe {

    /* renamed from: a */
    private final Map f34361a = new HashMap();

    /* renamed from: b */
    private final zzdvl f34362b;

    public zzele(zzdvl zzdvl) {
        this.f34362b = zzdvl;
    }

    @Nullable
    /* renamed from: a */
    public final zzehf mo45300a(String str, JSONObject jSONObject) throws zzfek {
        zzehf zzehf;
        synchronized (this) {
            zzehf = (zzehf) this.f34361a.get(str);
            if (zzehf == null) {
                zzehf = new zzehf(this.f34362b.mo45017c(str, jSONObject), new zzeiy(), str);
                this.f34361a.put(str, zzehf);
            }
        }
        return zzehf;
    }
}

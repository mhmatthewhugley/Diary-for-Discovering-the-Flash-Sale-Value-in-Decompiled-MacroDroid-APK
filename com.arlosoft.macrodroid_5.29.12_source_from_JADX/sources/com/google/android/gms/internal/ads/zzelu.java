package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzelu implements zzehe {

    /* renamed from: a */
    private final zzemy f34419a;

    public zzelu(zzemy zzemy) {
        this.f34419a = zzemy;
    }

    @Nullable
    /* renamed from: a */
    public final zzehf mo45300a(String str, JSONObject jSONObject) throws zzfek {
        zzbxd a = this.f34419a.mo45380a(str);
        if (a == null) {
            return null;
        }
        return new zzehf(a, new zzeix(), str);
    }
}

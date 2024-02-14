package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcuk implements zzctx {

    /* renamed from: a */
    private final zzcdw f31588a;

    zzcuk(zzcdw zzcdw) {
        this.f31588a = zzcdw;
    }

    /* renamed from: a */
    public final void mo44376a(JSONObject jSONObject) {
        int i;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            i = -1;
        } else {
            i = jSONObject.optBoolean("npa");
        }
        this.f31588a.mo43408b(i, optLong);
    }
}

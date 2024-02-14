package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzews implements zzevd {

    /* renamed from: a */
    private final JSONObject f35110a;

    public zzews(JSONObject jSONObject) {
        this.f35110a = jSONObject;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f35110a);
        } catch (JSONException unused) {
            zze.m2645k("Unable to get cache_state");
        }
    }
}

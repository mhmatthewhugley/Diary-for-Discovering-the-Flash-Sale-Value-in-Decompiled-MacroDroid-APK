package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbzi {

    /* renamed from: a */
    public final boolean f28018a;

    /* renamed from: b */
    public final String f28019b;

    public zzbzi(boolean z, String str) {
        this.f28018a = z;
        this.f28019b = str;
    }

    @Nullable
    /* renamed from: a */
    public static zzbzi m44729a(JSONObject jSONObject) {
        return new zzbzi(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}

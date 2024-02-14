package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfdp {
    @Nullable

    /* renamed from: a */
    public final String f35577a;
    @Nullable

    /* renamed from: b */
    public final String f35578b;

    /* renamed from: c */
    public final JSONObject f35579c;

    /* renamed from: d */
    public final JSONObject f35580d;

    zzfdp(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject h = zzbu.m2598h(jsonReader);
        this.f35580d = h;
        this.f35577a = h.optString("ad_html", (String) null);
        this.f35578b = h.optString("ad_base_url", (String) null);
        this.f35579c = h.optJSONObject("ad_json");
    }
}
